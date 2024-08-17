package funn.j2k.catlove.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Favorite(
    @PrimaryKey val id: Int? = null
)
