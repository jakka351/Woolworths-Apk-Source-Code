package androidx.transition;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
class ImageViewUtils {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3786a = true;

    @RequiresApi
    public static class Api29Impl {
        public static void a(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    public static void a(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(imageView, matrix);
            return;
        }
        if (matrix == null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        if (f3786a) {
            try {
                Api29Impl.a(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f3786a = false;
            }
        }
    }
}
