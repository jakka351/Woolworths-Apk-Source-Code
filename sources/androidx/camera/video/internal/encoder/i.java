package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.camera.video.internal.encoder.EncoderImpl;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(EncoderCallback encoderCallback, MediaFormat mediaFormat) {
        this.d = 0;
        this.e = encoderCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                int i2 = EncoderImpl.MediaCodecCallback.l;
                ((EncoderCallback) obj).b(new androidx.camera.core.internal.a(3));
                break;
            case 1:
                ((EncoderCallback) obj).getClass();
                break;
            case 2:
                ((EncoderCallback) obj).c();
                break;
            default:
                ((EncoderImpl.MediaCodecCallback) obj).a();
                break;
        }
    }

    public /* synthetic */ i(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }
}
