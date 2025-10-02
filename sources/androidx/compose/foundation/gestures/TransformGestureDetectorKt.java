package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TransformGestureDetectorKt {
    public static final float a(long j) {
        if (Float.intBitsToFloat((int) (j >> 32)) == BitmapDescriptorFactory.HUE_RED && Float.intBitsToFloat((int) (j & 4294967295L)) == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(r0), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.List] */
    public static final long b(PointerEvent pointerEvent, boolean z) {
        ?? r7 = pointerEvent.f1851a;
        int size = ((Collection) r7).size();
        long jH = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) r7.get(i2);
            if (pointerInputChange.d && pointerInputChange.h) {
                jH = Offset.h(jH, z ? pointerInputChange.c : pointerInputChange.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return Offset.b(jH, i);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, java.util.List] */
    public static final float c(PointerEvent pointerEvent, boolean z) {
        long jB = b(pointerEvent, z);
        boolean zC = Offset.c(jB, 9205357640488583168L);
        float fD = BitmapDescriptorFactory.HUE_RED;
        if (zC) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        ?? r8 = pointerEvent.f1851a;
        int size = ((Collection) r8).size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputChange pointerInputChange = (PointerInputChange) r8.get(i2);
            if (pointerInputChange.d && pointerInputChange.h) {
                i++;
                fD = Offset.d(Offset.g(z ? pointerInputChange.c : pointerInputChange.g, jB)) + fD;
            }
        }
        return fD / i;
    }

    public static final long d(PointerEvent pointerEvent) {
        long jB = b(pointerEvent, true);
        if (Offset.c(jB, 9205357640488583168L)) {
            return 0L;
        }
        return Offset.g(jB, b(pointerEvent, false));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    public static final float e(PointerEvent pointerEvent) {
        ?? r0 = pointerEvent.f1851a;
        int size = ((Collection) r0).size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            PointerInputChange pointerInputChange = (PointerInputChange) r0.get(i);
            if (!pointerInputChange.h || !pointerInputChange.d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jB = b(pointerEvent, true);
            long jB2 = b(pointerEvent, false);
            int size2 = ((Collection) r0).size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                PointerInputChange pointerInputChange2 = (PointerInputChange) r0.get(i4);
                if (pointerInputChange2.d && pointerInputChange2.h) {
                    long j = pointerInputChange2.c;
                    long jG = Offset.g(pointerInputChange2.g, jB2);
                    long jG2 = Offset.g(j, jB);
                    float fA = a(jG2) - a(jG);
                    float fD = Offset.d(Offset.h(jG2, jG)) / 2.0f;
                    if (fA > 180.0f) {
                        fA -= 360.0f;
                    } else if (fA < -180.0f) {
                        fA += 360.0f;
                    }
                    f2 += fA * fD;
                    f += fD;
                }
            }
            if (f != BitmapDescriptorFactory.HUE_RED) {
                return f2 / f;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    public static final float f(PointerEvent pointerEvent) {
        float fC = c(pointerEvent, true);
        float fC2 = c(pointerEvent, false);
        if (fC == BitmapDescriptorFactory.HUE_RED || fC2 == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return fC / fC2;
    }
}
