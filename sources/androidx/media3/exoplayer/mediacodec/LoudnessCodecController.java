package androidx.media3.exoplayer.mediacodec;

import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.HashSet;
import java.util.Iterator;

@RequiresApi
@UnstableApi
/* loaded from: classes2.dex */
public final class LoudnessCodecController {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f3102a = new HashSet();
    public final d b = LoudnessParameterUpdateListener.f3104a;
    public android.media.LoudnessCodecController c;

    public interface LoudnessParameterUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public static final d f3104a = new d();
    }

    public final void a(MediaCodec mediaCodec) {
        android.media.LoudnessCodecController loudnessCodecController;
        if (!this.f3102a.remove(mediaCodec) || (loudnessCodecController = this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public final void b(int i) {
        android.media.LoudnessCodecController loudnessCodecController = this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        android.media.LoudnessCodecController loudnessCodecControllerCreate = android.media.LoudnessCodecController.create(i, MoreExecutors.a(), new LoudnessCodecController$OnLoudnessCodecUpdateListener() { // from class: androidx.media3.exoplayer.mediacodec.LoudnessCodecController.1
            public final Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
                LoudnessCodecController.this.b.getClass();
                return bundle;
            }
        });
        this.c = loudnessCodecControllerCreate;
        Iterator it = this.f3102a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }
}
