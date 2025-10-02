package androidx.camera.video.internal.encoder;

import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface InputBuffer {
    boolean a();

    ListenableFuture b();

    ByteBuffer c();

    boolean cancel();

    void d(long j);

    void e();
}
