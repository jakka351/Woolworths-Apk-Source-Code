package androidx.media3.extractor.ts;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import com.google.common.math.IntMath;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* loaded from: classes2.dex */
final class MpeghUtil {

    public static class MhasPacketHeader {

        /* renamed from: a, reason: collision with root package name */
        public int f3426a;
        public long b;
        public int c;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }
    }

    public static class Mpegh3daConfig {
    }

    public static int a(ParsableBitArray parsableBitArray, int i, int i2, int i3) {
        Assertions.b(Math.max(Math.max(i, i2), i3) <= 31);
        int i4 = (1 << i) - 1;
        int i5 = (1 << i2) - 1;
        IntMath.a(IntMath.a(i4, i5), 1 << i3);
        if (parsableBitArray.b() < i) {
            return -1;
        }
        int iG = parsableBitArray.g(i);
        if (iG == i4) {
            if (parsableBitArray.b() < i2) {
                return -1;
            }
            int iG2 = parsableBitArray.g(i2);
            iG += iG2;
            if (iG2 == i5) {
                if (parsableBitArray.b() < i3) {
                    return -1;
                }
                return parsableBitArray.g(i3) + iG;
            }
        }
        return iG;
    }

    public static void b(ParsableBitArray parsableBitArray) {
        parsableBitArray.o(3);
        parsableBitArray.o(8);
        boolean zF = parsableBitArray.f();
        boolean zF2 = parsableBitArray.f();
        if (zF) {
            parsableBitArray.o(5);
        }
        if (zF2) {
            parsableBitArray.o(6);
        }
    }

    public static void c(ParsableBitArray parsableBitArray) {
        int iG;
        int iG2 = parsableBitArray.g(2);
        if (iG2 == 0) {
            parsableBitArray.o(6);
            return;
        }
        int iA = a(parsableBitArray, 5, 8, 16) + 1;
        if (iG2 == 1) {
            parsableBitArray.o(iA * 7);
            return;
        }
        if (iG2 == 2) {
            boolean zF = parsableBitArray.f();
            int i = zF ? 1 : 5;
            int i2 = zF ? 7 : 5;
            int i3 = zF ? 8 : 6;
            int i4 = 0;
            while (i4 < iA) {
                if (parsableBitArray.f()) {
                    parsableBitArray.o(7);
                    iG = 0;
                } else {
                    if (parsableBitArray.g(2) == 3 && parsableBitArray.g(i2) * i != 0) {
                        parsableBitArray.n();
                    }
                    iG = parsableBitArray.g(i3) * i;
                    if (iG != 0 && iG != 180) {
                        parsableBitArray.n();
                    }
                    parsableBitArray.n();
                }
                if (iG != 0 && iG != 180 && parsableBitArray.f()) {
                    i4++;
                }
                i4++;
            }
        }
    }
}
