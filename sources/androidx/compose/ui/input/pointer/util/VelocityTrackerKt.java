package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\b\u0003*\u0018\b\u0002\u0010\u0002\"\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0012\u0004\u0012\u00020\u00010\u0000*\f\b\u0002\u0010\u0003\"\u00020\u00012\u00020\u0001¨\u0006\u0004"}, d2 = {"", "", "Matrix", "Vector", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class VelocityTrackerKt {
    public static final void a(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        boolean zA = PointerEventKt.a(pointerInputChange);
        long j = pointerInputChange.b;
        if (zA) {
            velocityTracker.d();
        }
        if (!PointerEventKt.c(pointerInputChange)) {
            List list = pointerInputChange.k;
            if (list == null) {
                list = EmptyList.d;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                HistoricalChange historicalChange = (HistoricalChange) list.get(i);
                velocityTracker.a(historicalChange.f1846a, historicalChange.c);
            }
            velocityTracker.a(j, pointerInputChange.l);
        }
        if (PointerEventKt.c(pointerInputChange) && j - velocityTracker.c > 40) {
            velocityTracker.d();
        }
        velocityTracker.c = j;
    }

    public static final float b(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final void c(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            InlineClassHelperKt.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] destination = fArr5[i9];
            float[] fArr7 = fArr4[i9];
            Intrinsics.h(fArr7, "<this>");
            Intrinsics.h(destination, "destination");
            System.arraycopy(fArr7, 0, destination, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr8 = fArr5[i10];
                float fB = b(destination, fArr8);
                for (int i11 = 0; i11 < i; i11++) {
                    destination[i11] = destination[i11] - (fArr8[i11] * fB);
                }
            }
            float fSqrt = (float) Math.sqrt(b(destination, destination));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                destination[i12] = destination[i12] * f;
            }
            float[] fArr9 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr9[i13] = i13 < i9 ? BitmapDescriptorFactory.HUE_RED : b(destination, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fB2 = b(fArr5[i14], fArr2);
            float[] fArr10 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fB2 -= fArr10[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fB2 / fArr10[i14];
        }
    }
}
