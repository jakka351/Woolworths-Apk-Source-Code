package androidx.camera.video.internal.encoder;

import android.view.Surface;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.l;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface Encoder {

    public interface ByteBufferInput extends EncoderInput, BufferProvider<InputBuffer> {
    }

    public interface EncoderInput {
    }

    public interface SurfaceInput extends EncoderInput {

        public interface OnSurfaceUpdateListener {
            void a(Surface surface);
        }

        void a(Executor executor, l lVar);
    }

    void a(EncoderCallback encoderCallback, Executor executor);

    void b(long j);

    EncoderInfoImpl c();

    ListenableFuture d();

    void e();

    int f();

    void pause();

    void release();

    void start();
}
