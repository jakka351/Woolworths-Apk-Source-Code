package androidx.camera.video.internal.encoder;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface EncoderFactory {
    EncoderImpl d(Executor executor, VideoEncoderConfig videoEncoderConfig);
}
