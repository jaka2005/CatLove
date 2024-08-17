package funn.j2k.catlove.data

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import funn.j2k.catlove.domain.repository.CatRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val repository: CatRepository
): ViewModel() {

}