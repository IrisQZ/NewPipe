package org.schabi.newpipe.util

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.TypedValue
import androidx.annotation.AttrRes
import androidx.core.content.ContextCompat

/**
 * Utility class for resolving [Drawables](Drawable)
 */
object DrawableResolver {
    @JvmStatic
    fun resolveDrawable(context: Context, @AttrRes attrResId: Int): Drawable? {
        return ContextCompat.getDrawable(
            context,
            TypedValue().apply {
                context.theme.resolveAttribute(
                    attrResId,
                    this,
                    true
                )
            }.resourceId
        )
    }
}
