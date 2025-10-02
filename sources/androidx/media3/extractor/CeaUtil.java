package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class CeaUtil {
    public static void a(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int i;
        while (true) {
            if (parsableByteArray.a() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (parsableByteArray.a() == 0) {
                    i = -1;
                    break;
                }
                int iU = parsableByteArray.u();
                i2 += iU;
                if (iU != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (parsableByteArray.a() == 0) {
                    i3 = -1;
                    break;
                }
                int iU2 = parsableByteArray.u();
                i3 += iU2;
                if (iU2 != 255) {
                    break;
                }
            }
            int i4 = parsableByteArray.b + i3;
            if (i3 == -1 || i3 > parsableByteArray.a()) {
                Log.g("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = parsableByteArray.c;
            } else if (i == 4 && i3 >= 8) {
                int iU3 = parsableByteArray.u();
                int iA = parsableByteArray.A();
                int iG = iA == 49 ? parsableByteArray.g() : 0;
                int iU4 = parsableByteArray.u();
                if (iA == 47) {
                    parsableByteArray.H(1);
                }
                boolean z = iU3 == 181 && (iA == 49 || iA == 47) && iU4 == 3;
                if (iA == 49) {
                    z &= iG == 1195456820;
                }
                if (z) {
                    b(j, parsableByteArray, trackOutputArr);
                }
            }
            parsableByteArray.G(i4);
        }
    }

    public static void b(long j, ParsableByteArray parsableByteArray, TrackOutput[] trackOutputArr) {
        int iU = parsableByteArray.u();
        if ((iU & 64) != 0) {
            parsableByteArray.H(1);
            int i = (iU & 31) * 3;
            int i2 = parsableByteArray.b;
            for (TrackOutput trackOutput : trackOutputArr) {
                parsableByteArray.G(i2);
                trackOutput.c(i, parsableByteArray);
                Assertions.f(j != -9223372036854775807L);
                trackOutput.g(j, 1, i, 0, null);
            }
        }
    }
}
