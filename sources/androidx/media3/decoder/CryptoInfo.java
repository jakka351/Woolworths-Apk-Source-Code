package androidx.media3.decoder;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class CryptoInfo {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2987a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final PatternHolderV24 j;

    @RequiresApi
    public static final class PatternHolderV24 {

        /* renamed from: a, reason: collision with root package name */
        public final MediaCodec.CryptoInfo f2988a;
        public final MediaCodec.CryptoInfo.Pattern b = new MediaCodec.CryptoInfo.Pattern(0, 0);

        public PatternHolderV24(MediaCodec.CryptoInfo cryptoInfo) {
            this.f2988a = cryptoInfo;
        }
    }

    public CryptoInfo() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = Util.f2928a >= 24 ? new PatternHolderV24(cryptoInfo) : null;
    }

    public final void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.f2987a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (Util.f2928a >= 24) {
            PatternHolderV24 patternHolderV24 = this.j;
            patternHolderV24.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = patternHolderV24.b;
            pattern.set(i3, i4);
            patternHolderV24.f2988a.setPattern(pattern);
        }
    }
}
