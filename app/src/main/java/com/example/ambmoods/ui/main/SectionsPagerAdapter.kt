package com.example.ambmoods.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.ambmoods.R

private val TAB_TITLES: Array<Int> = arrayOf(
    R.string.tab_Workspace,
    R.string.tab_Lifetime,
    R.string.tab_Styles,
    R.string.tab_AroundMe
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return PlaceholderFragment.newInstance(position + 1)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    /**
     * Dynamically resizes the view count based on the tabs array
     */
    override fun getCount(): Int {
        return TAB_TITLES.size
    }
}