package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public class EncodedDataImpl implements EncodedData {
    public final MediaCodec d;
    public final MediaCodec.BufferInfo e;
    public final int f;
    public final ListenableFuture g;
    public final CallbackToFutureAdapter.Completer h;
    public final AtomicBoolean i = new AtomicBoolean(false);

    public EncodedDataImpl(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.d = mediaCodec;
        this.f = i;
        mediaCodec.getOutputBuffer(i);
        this.e = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.g = CallbackToFutureAdapter.a(new a(atomicReference, 0));
        CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) atomicReference.get();
        completer.getClass();
        this.h = completer;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final boolean X() {
        return (this.e.flags & 1) != 0;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        CallbackToFutureAdapter.Completer completer = this.h;
        if (this.i.getAndSet(true)) {
            return;
        }
        try {
            this.d.releaseOutputBuffer(this.f, false);
            completer.b(null);
        } catch (IllegalStateException e) {
            completer.d(e);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final long h0() {
        return this.e.presentationTimeUs;
    }

    @Override // androidx.camera.video.internal.encoder.EncodedData
    public final long size() {
        return this.e.size;
    }
}
