package com.sharmila.realmlibrary

import android.content.Context
import android.widget.Toast

class UserController {

    companion object {
        fun showToast(ctx: Context, msg: String) {

            Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
        }
    }

}