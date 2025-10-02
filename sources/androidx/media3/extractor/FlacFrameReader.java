package androidx.media3.extractor;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import org.bouncycastle.asn1.BERTags;

@UnstableApi
/* loaded from: classes2.dex */
public final class FlacFrameReader {

    public static final class SampleNumberHolder {

        /* renamed from: a, reason: collision with root package name */
        public long f3235a;
    }

    public static boolean a(ParsableByteArray parsableByteArray, FlacStreamMetadata flacStreamMetadata, int i, SampleNumberHolder sampleNumberHolder) {
        long jW = parsableByteArray.w();
        long j = jW >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jW >> 12) & 15);
        int i3 = (int) ((jW >> 8) & 15);
        int i4 = (int) ((jW >> 4) & 15);
        int i5 = (int) ((jW >> 1) & 7);
        boolean z2 = (jW & 1) == 1;
        if (i4 <= 7) {
            if (i4 != flacStreamMetadata.g - 1) {
                return false;
            }
        } else if (i4 > 10 || flacStreamMetadata.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == flacStreamMetadata.i) || z2) {
            return false;
        }
        try {
            long jB = parsableByteArray.B();
            if (!z) {
                jB *= flacStreamMetadata.b;
            }
            sampleNumberHolder.f3235a = jB;
            int iB = b(i2, parsableByteArray);
            if (iB == -1 || iB > flacStreamMetadata.b) {
                return false;
            }
            int i6 = flacStreamMetadata.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != flacStreamMetadata.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iA = parsableByteArray.A();
                    if (i3 == 14) {
                        iA *= 10;
                    }
                    if (iA != i6) {
                        return false;
                    }
                } else if (parsableByteArray.u() * 1000 != i6) {
                    return false;
                }
            }
            int iU = parsableByteArray.u();
            int i7 = parsableByteArray.b;
            byte[] bArr = parsableByteArray.f2922a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = parsableByteArray.b; i10 < i8; i10++) {
                i9 = Util.l[i9 ^ (bArr[i10] & 255)];
            }
            int i11 = Util.f2928a;
            return iU == i9;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(int i, ParsableByteArray parsableByteArray) {
        switch (i) {
            case 1:
                return BERTags.PRIVATE;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return parsableByteArray.u() + 1;
            case 7:
                return parsableByteArray.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }
}
