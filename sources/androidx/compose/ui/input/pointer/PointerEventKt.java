package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class PointerEventKt {
    public static final boolean a(PointerInputChange pointerInputChange) {
        return !pointerInputChange.h && pointerInputChange.d;
    }

    public static final boolean b(PointerInputChange pointerInputChange) {
        return (pointerInputChange.b() || !pointerInputChange.h || pointerInputChange.d) ? false : true;
    }

    public static final boolean c(PointerInputChange pointerInputChange) {
        return pointerInputChange.h && !pointerInputChange.d;
    }

    public static final boolean d(PointerInputChange pointerInputChange, long j, long j2) {
        int i = pointerInputChange.i == 1 ? 1 : 0;
        long j3 = pointerInputChange.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (fIntBitsToFloat > f2) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j & 4294967295L)) + fIntBitsToFloat4);
    }

    public static final long e(PointerInputChange pointerInputChange, boolean z) {
        long jG = Offset.g(pointerInputChange.c, pointerInputChange.g);
        if (z || !pointerInputChange.b()) {
            return jG;
        }
        return 0L;
    }

    public static final boolean f(PointerInputChange pointerInputChange) {
        return !Offset.c(e(pointerInputChange, false), 0L);
    }
}
