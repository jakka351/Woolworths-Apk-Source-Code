package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class TsUtil {
    public static long a(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.G(i);
        if (parsableByteArray.a() < 5) {
            return -9223372036854775807L;
        }
        int iG = parsableByteArray.g();
        if ((8388608 & iG) != 0 || ((2096896 & iG) >> 8) != i2 || (iG & 32) == 0 || parsableByteArray.u() < 7 || parsableByteArray.a() < 7 || (parsableByteArray.u() & 16) != 16) {
            return -9223372036854775807L;
        }
        parsableByteArray.e(0, 6, new byte[6]);
        return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
    }
}
