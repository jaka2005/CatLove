package funn.j2k.catlove.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import funn.j2k.catlove.domain.model.Favorite

@Database(
    entities = [Favorite::class],
    version = 1,
    exportSchema = false
)
abstract class FavoriteDatabase: RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao

    companion object {
        const val DATABASE_NAME = "favorites_db"
    }
}