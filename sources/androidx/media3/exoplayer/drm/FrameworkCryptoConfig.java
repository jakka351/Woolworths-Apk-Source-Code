package androidx.media3.exoplayer.drm;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.CryptoConfig;
import java.util.UUID;

@UnstableApi
/* loaded from: classes2.dex */
public final class FrameworkCryptoConfig implements CryptoConfig {
    public static final boolean c;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f3085a;
    public final byte[] b;

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    static {
        /*
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1e
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            androidx.media3.exoplayer.drm.FrameworkCryptoConfig.c = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.FrameworkCryptoConfig.<clinit>():void");
    }

    public FrameworkCryptoConfig(UUID uuid, byte[] bArr) {
        this.f3085a = uuid;
        this.b = bArr;
    }
}
