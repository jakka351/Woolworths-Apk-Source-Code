package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ h(EncoderImpl.MediaCodecCallback mediaCodecCallback, MediaCodec.BufferInfo bufferInfo, MediaCodec mediaCodec, int i) {
        this.f = mediaCodecCallback;
        this.g = bufferInfo;
        this.h = mediaCodec;
        this.e = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[RETURN, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.encoder.h.run():void");
    }

    public /* synthetic */ h(EncoderImpl encoderImpl, int i, String str, Throwable th) {
        this.f = encoderImpl;
        this.e = i;
        this.g = str;
        this.h = th;
    }
}
