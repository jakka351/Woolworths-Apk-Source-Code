package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidImageBitmap_androidKt {
    public static final Bitmap a(ImageBitmap imageBitmap) {
        if (imageBitmap instanceof AndroidImageBitmap) {
            return ((AndroidImageBitmap) imageBitmap).f1758a;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config b(int i) {
        return i == 0 ? Bitmap.Config.ARGB_8888 : i == 1 ? Bitmap.Config.ALPHA_8 : i == 2 ? Bitmap.Config.RGB_565 : i == 3 ? Bitmap.Config.RGBA_F16 : i == 4 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }
}
