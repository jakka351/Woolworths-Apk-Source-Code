package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.text.TextPaint;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeUtils;
import com.airbnb.lottie.animation.LPaint;

/* loaded from: classes2.dex */
public final class PaintCompat {

    @RequiresApi
    public static class Api23Impl {
    }

    @RequiresApi
    public static class Api29Impl {
        public static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    static {
        new ThreadLocal();
    }

    public static boolean a(TextPaint textPaint, String str) {
        return textPaint.hasGlyph(str);
    }

    public static void b(LPaint lPaint, BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(lPaint, blendModeCompat != null ? BlendModeUtils.Api29Impl.a(blendModeCompat) : null);
            return;
        }
        if (blendModeCompat == null) {
            lPaint.setXfermode(null);
            return;
        }
        PorterDuff.Mode mode = null;
        if (blendModeCompat != null) {
            switch (blendModeCompat.ordinal()) {
                case 0:
                    mode = PorterDuff.Mode.CLEAR;
                    break;
                case 1:
                    mode = PorterDuff.Mode.SRC;
                    break;
                case 2:
                    mode = PorterDuff.Mode.DST;
                    break;
                case 3:
                    mode = PorterDuff.Mode.SRC_OVER;
                    break;
                case 4:
                    mode = PorterDuff.Mode.DST_OVER;
                    break;
                case 5:
                    mode = PorterDuff.Mode.SRC_IN;
                    break;
                case 6:
                    mode = PorterDuff.Mode.DST_IN;
                    break;
                case 7:
                    mode = PorterDuff.Mode.SRC_OUT;
                    break;
                case 8:
                    mode = PorterDuff.Mode.DST_OUT;
                    break;
                case 9:
                    mode = PorterDuff.Mode.SRC_ATOP;
                    break;
                case 10:
                    mode = PorterDuff.Mode.DST_ATOP;
                    break;
                case 11:
                    mode = PorterDuff.Mode.XOR;
                    break;
                case 12:
                    mode = PorterDuff.Mode.ADD;
                    break;
                case 13:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 14:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 15:
                    mode = PorterDuff.Mode.OVERLAY;
                    break;
                case 16:
                    mode = PorterDuff.Mode.DARKEN;
                    break;
                case 17:
                    mode = PorterDuff.Mode.LIGHTEN;
                    break;
            }
        }
        lPaint.setXfermode(mode != null ? new PorterDuffXfermode(mode) : null);
    }
}
