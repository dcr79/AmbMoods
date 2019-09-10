package com.example.ambmoods.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ambmoods.model.Mood

data class Section(val index: Int, val moods: List<Mood>)

class PageViewModel : ViewModel() {

    private val _index = MutableLiveData<Int>()
    val text: LiveData<Section> = Transformations.map(_index) {
        val moods = when (it) {
            1 -> listOf(
                Mood.WorkSpace.CoffeeShops,
                Mood.WorkSpace.Dinner,
                Mood.WorkSpace.Drive,
                Mood.WorkSpace.Garden,
                Mood.WorkSpace.Office,
                Mood.WorkSpace.Shops
            )
            2 -> listOf(
                Mood.LifeStyle.Cook,
                Mood.LifeStyle.Meditate,
                Mood.LifeStyle.Read,
                Mood.LifeStyle.Sleep,
                Mood.LifeStyle.Study,
                Mood.LifeStyle.Walk
            )
            3 -> listOf(
                Mood.Styles.Acustic,
                Mood.Styles.Atmospheric,
                Mood.Styles.Chillout,
                Mood.Styles.Classic,
                Mood.Styles.Guitar,
                Mood.Styles.Piano
            )
            4 -> listOf(
                Mood.AroundMe.Zone
            )
            else -> listOf(
                Mood.Styles.Chillout,
                Mood.WorkSpace.Dinner,
                Mood.WorkSpace.Garden,
                Mood.Styles.Classic,
                Mood.Styles.Guitar,
                Mood.Styles.Piano
            )
        }
        Section(it, moods)
    }

    fun setIndex(index: Int) {
        _index.value = index
    }
}