package com.sharmila.realmlibrary

import android.content.Context
import android.widget.Toast

public class UserController {

    companion object {
        public fun showToast(ctx: Context, msg: String) {

            Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
        }
    }

}