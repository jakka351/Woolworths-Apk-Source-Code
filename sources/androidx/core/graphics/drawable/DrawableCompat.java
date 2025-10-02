package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public final class DrawableCompat {

    @RequiresApi
    public static class Api21Impl {
    }

    @RequiresApi
    public static class Api23Impl {
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static void b(Drawable drawable) {
        drawable.canApplyTheme();
    }

    public static int c(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static ColorFilter d(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static int e(VectorDrawableCompat vectorDrawableCompat) {
        return vectorDrawableCompat.getLayoutDirection();
    }

    public static void f(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static boolean g(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void h(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void i(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }

    public static void j(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void k(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void l(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void m(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }

    public static void n(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable o(Drawable drawable) {
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).b() : drawable;
    }
}
