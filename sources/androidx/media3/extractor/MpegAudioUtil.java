package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@UnstableApi
/* loaded from: classes2.dex */
public final class MpegAudioUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f3246a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] b = {44100, 48000, 32000};
    public static final int[] c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class Header {

        /* renamed from: a, reason: collision with root package name */
        public int f3247a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public final boolean a(int i) {
            int i2;
            int i3;
            int i4;
            int i5;
            if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
                return false;
            }
            this.f3247a = i2;
            this.b = MpegAudioUtil.f3246a[3 - i3];
            int i6 = MpegAudioUtil.b[i5];
            this.d = i6;
            if (i2 == 2) {
                this.d = i6 / 2;
            } else if (i2 == 0) {
                this.d = i6 / 4;
            }
            int i7 = (i >>> 9) & 1;
            int i8 = 1152;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        throw new IllegalArgumentException();
                    }
                    i8 = KyberEngine.KyberPolyBytes;
                }
            } else if (i2 != 3) {
                i8 = 576;
            }
            this.g = i8;
            if (i3 == 3) {
                int i9 = i2 == 3 ? MpegAudioUtil.c[i4 - 1] : MpegAudioUtil.d[i4 - 1];
                this.f = i9;
                this.c = (((i9 * 12) / this.d) + i7) * 4;
            } else {
                if (i2 == 3) {
                    int i10 = i3 == 2 ? MpegAudioUtil.e[i4 - 1] : MpegAudioUtil.f[i4 - 1];
                    this.f = i10;
                    this.c = ((i10 * 144) / this.d) + i7;
                } else {
                    int i11 = MpegAudioUtil.g[i4 - 1];
                    this.f = i11;
                    this.c = (((i3 == 1 ? 72 : 144) * i11) / this.d) + i7;
                }
            }
            this.e = ((i >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = b[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? c[i4 - 1] : d[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        int i8 = i2 == 3 ? i3 == 2 ? e[i4 - 1] : f[i4 - 1] : g[i4 - 1];
        if (i2 == 3) {
            return androidx.constraintlayout.core.state.a.a(i8, 144, i6, i7);
        }
        return androidx.constraintlayout.core.state.a.a(i3 == 1 ? 72 : 144, i8, i6, i7);
    }
}
