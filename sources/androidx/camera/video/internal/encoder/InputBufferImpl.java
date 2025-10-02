package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
class InputBufferImpl implements InputBuffer {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f633a;
    public final int b;
    public final ByteBuffer c;
    public final ListenableFuture d;
    public final CallbackToFutureAdapter.Completer e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;

    public InputBufferImpl(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.f633a = mediaCodec;
        Preconditions.d(i);
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        this.d = CallbackToFutureAdapter.a(new a(atomicReference, 3));
        CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) atomicReference.get();
        completer.getClass();
        this.e = completer;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final boolean a() throws MediaCodec.CryptoException {
        CallbackToFutureAdapter.Completer completer = this.e;
        ByteBuffer byteBuffer = this.c;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.f633a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
            completer.b(null);
            return true;
        } catch (IllegalStateException e) {
            completer.d(e);
            return false;
        }
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final ListenableFuture b() {
        return Futures.h(this.d);
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final ByteBuffer c() {
        if (this.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        return this.c;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final boolean cancel() throws MediaCodec.CryptoException {
        CallbackToFutureAdapter.Completer completer = this.e;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.f633a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            completer.b(null);
        } catch (IllegalStateException e) {
            completer.d(e);
        }
        return true;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final void d(long j) {
        if (this.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        Preconditions.b(j >= 0);
        this.g = j;
    }

    @Override // androidx.camera.video.internal.encoder.InputBuffer
    public final void e() {
        if (this.f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
        this.h = true;
    }
}
