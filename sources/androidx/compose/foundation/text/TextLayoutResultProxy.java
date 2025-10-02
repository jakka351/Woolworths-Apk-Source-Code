package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextLayoutResultProxy;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextLayoutResultProxy {

    /* renamed from: a, reason: collision with root package name */
    public final TextLayoutResult f1135a;
    public LayoutCoordinates b = null;
    public LayoutCoordinates c;

    public TextLayoutResultProxy(LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult) {
        this.f1135a = textLayoutResult;
        this.c = layoutCoordinates;
    }

    public final long a(long j) {
        Rect rectD;
        LayoutCoordinates layoutCoordinates = this.b;
        Rect rect = Rect.e;
        if (layoutCoordinates != null) {
            if (layoutCoordinates.q()) {
                LayoutCoordinates layoutCoordinates2 = this.c;
                rectD = layoutCoordinates2 != null ? layoutCoordinates2.D(layoutCoordinates, true) : null;
            } else {
                rectD = rect;
            }
            if (rectD != null) {
                rect = rectD;
            }
        }
        int i = (int) (j >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        float fIntBitsToFloat2 = rect.f1752a;
        if (fIntBitsToFloat >= fIntBitsToFloat2) {
            float fIntBitsToFloat3 = Float.intBitsToFloat(i);
            fIntBitsToFloat2 = rect.c;
            if (fIntBitsToFloat3 <= fIntBitsToFloat2) {
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float fIntBitsToFloat4 = Float.intBitsToFloat(i2);
        float fIntBitsToFloat5 = rect.b;
        if (fIntBitsToFloat4 >= fIntBitsToFloat5) {
            float fIntBitsToFloat6 = Float.intBitsToFloat(i2);
            fIntBitsToFloat5 = rect.d;
            if (fIntBitsToFloat6 <= fIntBitsToFloat5) {
                fIntBitsToFloat5 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat2) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat5) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.f1135a.b.g(d(j));
    }

    public final boolean c(long j) {
        long jD = d(a(j));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & jD));
        TextLayoutResult textLayoutResult = this.f1135a;
        int iE = textLayoutResult.b.e(fIntBitsToFloat);
        int i = (int) (jD >> 32);
        return Float.intBitsToFloat(i) >= textLayoutResult.e(iE) && Float.intBitsToFloat(i) <= textLayoutResult.f(iE);
    }

    public final long d(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.b;
        if (layoutCoordinates2 == null) {
            return j;
        }
        if (!layoutCoordinates2.q()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.c) == null) {
            return j;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.q() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j : layoutCoordinates2.M(layoutCoordinates3, j);
    }

    public final long e(long j) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.b;
        if (layoutCoordinates2 == null) {
            return j;
        }
        if (!layoutCoordinates2.q()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.c) == null) {
            return j;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.q() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j : layoutCoordinates3.M(layoutCoordinates2, j);
    }
}
