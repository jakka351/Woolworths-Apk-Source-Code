package androidx.compose.ui.spatial;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RectList {

    /* renamed from: a, reason: collision with root package name */
    public long[] f2025a;
    public long[] b;
    public int c;

    public static void a(RectList rectList, int i, int i2, int i3, int i4, int i5, int i6) {
        long[] jArr = rectList.f2025a;
        int i7 = rectList.c;
        int i8 = i7 + 3;
        rectList.c = i8;
        int length = jArr.length;
        if (length <= i8) {
            int iMax = Math.max(length * 2, i8);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Intrinsics.g(jArrCopyOf, "copyOf(...)");
            rectList.f2025a = jArrCopyOf;
            long[] jArrCopyOf2 = Arrays.copyOf(rectList.b, iMax);
            Intrinsics.g(jArrCopyOf2, "copyOf(...)");
            rectList.b = jArrCopyOf2;
        }
        long[] jArr2 = rectList.f2025a;
        jArr2[i7] = (i2 << 32) | (i3 & 4294967295L);
        jArr2[i7 + 1] = (i5 & 4294967295L) | (i4 << 32);
        int i9 = i6 & 67108863;
        jArr2[i7 + 2] = (0 << 63) | (0 << 62) | (1 << 61) | (0 << 52) | (i9 << 26) | (i & 67108863);
        if (i6 < 0) {
            return;
        }
        for (int i10 = i7 - 3; i10 >= 0; i10 -= 3) {
            int i11 = i10 + 2;
            long j = jArr2[i11];
            if ((((int) j) & 67108863) == i9) {
                jArr2[i11] = (j & (-2301339409586323457L)) | (((i7 - i10) & 511) << 52);
                return;
            }
        }
    }

    public final void b(int i, Function4 function4) {
        int i2 = i & 67108863;
        long[] jArr = this.f2025a;
        int i3 = this.c;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i3; i4 += 3) {
            if ((((int) jArr[i4 + 2]) & 67108863) == i2) {
                long j = jArr[i4];
                long j2 = jArr[i4 + 1];
                function4.invoke(Integer.valueOf((int) (j >> 32)), Integer.valueOf((int) j), Integer.valueOf((int) (j2 >> 32)), Integer.valueOf((int) j2));
                return;
            }
        }
    }
}
