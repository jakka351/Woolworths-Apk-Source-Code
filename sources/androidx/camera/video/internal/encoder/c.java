package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.util.Range;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ EncoderImpl e;

    public /* synthetic */ c(EncoderImpl encoderImpl, int i) {
        this.d = i;
        this.e = encoderImpl;
    }

    @Override // java.lang.Runnable
    public final void run() throws MediaCodec.CryptoException {
        ListenableFuture listenableFutureE;
        int i = this.d;
        final EncoderImpl encoderImpl = this.e;
        switch (i) {
            case 0:
                Range range = EncoderImpl.E;
                switch (encoderImpl.t.ordinal()) {
                    case 0:
                        listenableFutureE = Futures.e(new IllegalStateException("Encoder is not started yet."));
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        AtomicReference atomicReference = new AtomicReference();
                        ListenableFuture listenableFutureA = CallbackToFutureAdapter.a(new a(atomicReference, 1));
                        CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) atomicReference.get();
                        completer.getClass();
                        encoderImpl.l.offer(completer);
                        completer.a(new d(7, encoderImpl, completer), encoderImpl.h);
                        encoderImpl.h();
                        listenableFutureE = listenableFutureA;
                        break;
                    case 7:
                        listenableFutureE = Futures.e(new IllegalStateException("Encoder is in error state."));
                        break;
                    case 8:
                        listenableFutureE = Futures.e(new IllegalStateException("Encoder is released."));
                        break;
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl.t);
                }
                Futures.a(listenableFutureE, new FutureCallback<InputBuffer>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final void onFailure(Throwable th) {
                        EncoderImpl.this.g(0, "Unable to acquire InputBuffer.", th);
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public final void onSuccess(Object obj) {
                        InputBuffer inputBuffer = (InputBuffer) obj;
                        EncoderImpl encoderImpl2 = EncoderImpl.this;
                        inputBuffer.d(encoderImpl2.q.b());
                        inputBuffer.e();
                        inputBuffer.a();
                        Futures.a(inputBuffer.b(), new FutureCallback<Void>() { // from class: androidx.camera.video.internal.encoder.EncoderImpl.1.1
                            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                            public final void onFailure(Throwable th) {
                                EncoderImpl encoderImpl3 = EncoderImpl.this;
                                if (!(th instanceof MediaCodec.CodecException)) {
                                    encoderImpl3.g(0, th.getMessage(), th);
                                } else {
                                    MediaCodec.CodecException codecException = (MediaCodec.CodecException) th;
                                    encoderImpl3.g(1, codecException.getMessage(), codecException);
                                }
                            }

                            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                            public final /* bridge */ /* synthetic */ void onSuccess(Object obj2) {
                            }
                        }, encoderImpl2.h);
                    }
                }, encoderImpl.h);
                return;
            case 1:
                int iOrdinal = encoderImpl.t.ordinal();
                if (iOrdinal == 1) {
                    encoderImpl.k();
                    return;
                } else {
                    if (iOrdinal == 6 || iOrdinal == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 2:
                switch (encoderImpl.t.ordinal()) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        encoderImpl.j();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        encoderImpl.m(EncoderImpl.InternalState.j);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl.t);
                }
            case 3:
                encoderImpl.h.execute(new c(encoderImpl, 4));
                return;
            case 4:
                if (encoderImpl.w) {
                    Logger.e(encoderImpl.f625a, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    encoderImpl.x = null;
                    encoderImpl.n();
                    encoderImpl.w = false;
                    return;
                }
                return;
            default:
                encoderImpl.B = true;
                if (encoderImpl.A) {
                    encoderImpl.e.stop();
                    encoderImpl.l();
                    return;
                }
                return;
        }
    }
}
