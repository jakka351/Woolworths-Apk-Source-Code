package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;

@RestrictTo
/* loaded from: classes2.dex */
public class AppCompatImageHelper {

    /* renamed from: a, reason: collision with root package name */
    public final ImageView f161a;
    public TintInfo b;
    public int c = 0;

    public AppCompatImageHelper(ImageView imageView) {
        this.f161a = imageView;
    }

    public final void a() {
        TintInfo tintInfo;
        ImageView imageView = this.f161a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            DrawableUtils.a(drawable);
        }
        if (drawable == null || (tintInfo = this.b) == null) {
            return;
        }
        AppCompatDrawableManager.e(drawable, tintInfo, imageView.getDrawableState());
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.f161a;
        Context context = imageView.getContext();
        int[] iArr = R.styleable.g;
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, iArr, i, 0);
        TypedArray typedArray = tintTypedArrayF.b;
        ViewCompat.z(imageView, imageView.getContext(), iArr, attributeSet, tintTypedArrayF.b, i);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AppCompatResources.b(resourceId, imageView.getContext())) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.a(drawable);
            }
            if (typedArray.hasValue(2)) {
                imageView.setImageTintList(tintTypedArrayF.a(2));
            }
            if (typedArray.hasValue(3)) {
                imageView.setImageTintMode(DrawableUtils.c(typedArray.getInt(3, -1), null));
            }
            tintTypedArrayF.g();
        } catch (Throwable th) {
            tintTypedArrayF.g();
            throw th;
        }
    }

    public final void c(int i) {
        ImageView imageView = this.f161a;
        if (i != 0) {
            Drawable drawableB = AppCompatResources.b(i, imageView.getContext());
            if (drawableB != null) {
                DrawableUtils.a(drawableB);
            }
            imageView.setImageDrawable(drawableB);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
