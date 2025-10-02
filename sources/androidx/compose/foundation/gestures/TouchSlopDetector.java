package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/gestures/TouchSlopDetector;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TouchSlopDetector {

    /* renamed from: a, reason: collision with root package name */
    public final Orientation f905a;
    public long b;

    public TouchSlopDetector(long j, Orientation orientation) {
        this.f905a = orientation;
        this.b = j;
    }

    public final long a(PointerInputChange pointerInputChange, float f) {
        long jH = Offset.h(this.b, Offset.g(pointerInputChange.c, pointerInputChange.g));
        this.b = jH;
        Orientation orientation = this.f905a;
        if ((orientation == null ? Offset.d(jH) : Math.abs(b(jH))) < f) {
            return 9205357640488583168L;
        }
        if (orientation == null) {
            long j = this.b;
            return Offset.g(this.b, Offset.i(Offset.b(j, Offset.d(j)), f));
        }
        float fB = b(this.b) - (Math.signum(b(this.b)) * f);
        long j2 = this.b;
        Orientation orientation2 = Orientation.e;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation == orientation2 ? j2 & 4294967295L : j2 >> 32));
        if (orientation == orientation2) {
            return (Float.floatToRawIntBits(fB) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L);
        }
        return (Float.floatToRawIntBits(fIntBitsToFloat) << 32) | (Float.floatToRawIntBits(fB) & 4294967295L);
    }

    public final float b(long j) {
        return Float.intBitsToFloat((int) (this.f905a == Orientation.e ? j >> 32 : j & 4294967295L));
    }
}
