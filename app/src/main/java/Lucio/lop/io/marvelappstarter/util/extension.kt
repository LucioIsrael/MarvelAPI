package daniel.lop.io.marvelappstarter.util

import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import android.widget.Toast
import com.bumptech.glide.Glide

fun Fragment.Toast(message: String, duration: Int = android.widget.Toast.LENGTH_LONG){

    Toast.makeText(
        requireContext(),
        message,
        duration
    ).show()

}

fun View.show(){

    visibility = View.VISIBLE

}

fun View.hide() {

    visibility = View.GONE

}

fun loadImage(
    imageView: ImageView,
    path: String,
    extension: String
){
    Glide.with(imageView.context)
        .load("$path.$extension")
        .into(imageView)
}

fun String.limitDescription(characters: Int): String{
    if(this.length > characters) {
        val firstCharacter = 0
        return "${this.substring(firstCharacter, characters)}..."
    }
    return this
}