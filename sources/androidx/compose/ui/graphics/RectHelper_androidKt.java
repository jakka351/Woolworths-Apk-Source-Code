package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import androidx.compose.ui.unit.IntRect;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RectHelper_androidKt {
    public static final Rect a(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.f1752a, (int) rect.b, (int) rect.c, (int) rect.d);
    }

    public static final Rect b(IntRect intRect) {
        return new Rect(intRect.f2201a, intRect.b, intRect.c, intRect.d);
    }

    public static final RectF c(androidx.compose.ui.geometry.Rect rect) {
        return new RectF(rect.f1752a, rect.b, rect.c, rect.d);
    }

    public static final androidx.compose.ui.geometry.Rect d(Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect e(RectF rectF) {
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
