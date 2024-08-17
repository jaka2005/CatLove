package funn.j2k.catlove.data.repository

import funn.j2k.catlove.data.local.FavoriteDao
import funn.j2k.catlove.data.remote.CatApi
import funn.j2k.catlove.domain.repository.CatRepository
import javax.inject.Inject

class CatRepositoryImpl @Inject constructor(
    private val api: CatApi,
    private val dao: FavoriteDao
): CatRepository {

}