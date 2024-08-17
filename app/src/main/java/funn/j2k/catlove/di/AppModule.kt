package funn.j2k.catlove.di

import android.content.Context
import androidx.room.Room
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import funn.j2k.catlove.data.local.FavoriteDatabase
import funn.j2k.catlove.data.remote.CatApi
import funn.j2k.catlove.data.repository.CatRepositoryImpl
import funn.j2k.catlove.domain.repository.CatRepository
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class CatLoveBindsModule {
    @Binds
    @Singleton
    abstract fun bindCatRepository(
        catRepositoryImpl: CatRepositoryImpl
    ): CatRepository
}

@Module
@InstallIn(SingletonComponent::class)
object CatLoveStaticModule {
    @Provides
    @Singleton
    fun provideCatApi(): CatApi = Retrofit.Builder()
        .baseUrl("")
        .build()
        .create()

    @Provides
    @Singleton
    fun provideFavoriteDatabase(
        @ApplicationContext app: Context
    ): FavoriteDatabase = Room.databaseBuilder(
        app,
        FavoriteDatabase::class.java,
        FavoriteDatabase.DATABASE_NAME
    ).build()

    @Provides
    @Singleton
    fun provideFavoriteDao(db: FavoriteDatabase) = db.favoriteDao()
}