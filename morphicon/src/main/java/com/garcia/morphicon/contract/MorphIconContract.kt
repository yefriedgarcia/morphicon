package com.garcia.morphicon.contract

import com.garcia.morphicon.model.MorphIconState

interface MorphIconContract {

    interface View {
        fun renderState(state: MorphIconState)
    }

    interface Presenter {
        fun onIconClicked()
        fun attach(view: View)
        fun detach()
    }
}
