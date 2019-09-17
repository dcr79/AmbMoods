package com.example.ambmoods.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.ambmoods.R
import com.example.ambmoods.mSpotifyAppRemote
import com.example.ambmoods.model.Mood

/**
 * A placeholder fragment containing a simple view.
 */
class PlaceholderFragment : Fragment() {

    private lateinit var pageViewModel: PageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel::class.java).apply {
            setIndex(arguments?.getInt(ARG_SECTION_NUMBER) ?: 1)
        }
    }

    private fun List<TextView>.changeBackground(index: Int): Unit {
        forEachIndexed { n: Int, textView: TextView ->
            if (index == n) {
                textView.background.alpha = 150
            } else textView.background.alpha = 255
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_main, container, false)
        val textView1: TextView = root.findViewById(R.id.section1)
        val textView2: TextView = root.findViewById(R.id.section2)
        val textView3: TextView = root.findViewById(R.id.section3)
        val textView4: TextView = root.findViewById(R.id.section4)
        val textView5: TextView = root.findViewById(R.id.section5)
        val textView6: TextView = root.findViewById(R.id.section6)
        val textViews = listOf(textView1, textView2, textView3, textView4, textView5, textView6)
        var section: Section? = null


        pageViewModel.text.observe(this, Observer<Section> {
            section = it
            textViews.forEachIndexed { n, textView ->
                textView.moodClick(n, section, textViews)
            }
            when {
                it.moods.isEmpty() -> Unit //TODO() needs implementation
                it.moods[0] == Mood.AroundMe.Zone -> Unit //TODO() needs implementation
                else -> {
                    textView1.text = resources.getText(it.moods[0].labelId)
                    textView2.text = resources.getText(it.moods[1].labelId)
                    textView3.text = resources.getText(it.moods[2].labelId)
                    textView4.text = resources.getText(it.moods[3].labelId)
                    textView5.text = resources.getText(it.moods[4].labelId)
                    textView6.text = resources.getText(it.moods[5].labelId)
                }
            }
            when (it.index) {
                1 -> {
                    textView1.background = resources.getDrawable(R.drawable.csyl)
                    textView2.background = resources.getDrawable(R.drawable.dnol)
                    textView3.background = resources.getDrawable(R.drawable.dvrl)
                    textView4.background = resources.getDrawable(R.drawable.gdpl)
                    textView5.background = resources.getDrawable(R.drawable.ofgl)
                    textView6.background = resources.getDrawable(R.drawable.spbl)
                }
                2 -> {
                    textView1.background = resources.getDrawable(R.drawable.ckyl)
                    textView2.background = resources.getDrawable(R.drawable.mdol)
                    textView3.background = resources.getDrawable(R.drawable.rdrl)
                    textView4.background = resources.getDrawable(R.drawable.slpl)
                    textView5.background = resources.getDrawable(R.drawable.stgl)
                    textView6.background = resources.getDrawable(R.drawable.wkbl)
                }
                3 -> {
                    textView1.background = resources.getDrawable(R.drawable.acyl)
                    textView2.background = resources.getDrawable(R.drawable.atol)
                    textView3.background = resources.getDrawable(R.drawable.corl)
                    textView4.background = resources.getDrawable(R.drawable.clpl)
                    textView5.background = resources.getDrawable(R.drawable.gtgl)
                    textView6.background = resources.getDrawable(R.drawable.pnbl)
                }
                else -> {
                    textView1.background = resources.getDrawable(R.drawable.csyl)
                    textView2.background = resources.getDrawable(R.drawable.csyl)
                    textView3.background = resources.getDrawable(R.drawable.csyl)
                    textView4.background = resources.getDrawable(R.drawable.csyl)
                    textView5.background = resources.getDrawable(R.drawable.csyl)
                    textView6.background = resources.getDrawable(R.drawable.csyl)
                }
            }
        })
        return root
    }

    private fun TextView.moodClick(
        n: Int,
        section: Section?,
        textViews: List<TextView>
    ) {
        setOnClickListener { view ->

            section?.let {
                val result = it.moods[n].playListId
                mSpotifyAppRemote?.playerApi?.play(result)
            }
            textViews.changeBackground(n)
        }
    }


    companion object {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private const val ARG_SECTION_NUMBER = "section_number"

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        @JvmStatic
        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            return PlaceholderFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_SECTION_NUMBER, sectionNumber)
                }
            }
        }
    }
}