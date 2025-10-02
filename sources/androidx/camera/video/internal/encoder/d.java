package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Observable;
import androidx.camera.video.internal.BufferProvider;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        EncoderCallback encoderCallback;
        Executor executor;
        switch (this.d) {
            case 0:
                Executor executor2 = (Executor) this.e;
                EncoderImpl.MediaCodecCallback mediaCodecCallback = (EncoderImpl.MediaCodecCallback) this.f;
                Range range = EncoderImpl.E;
                Objects.requireNonNull(mediaCodecCallback);
                executor2.execute(new i(mediaCodecCallback, 3));
                return;
            case 1:
                ((EncoderImpl) this.e).m.remove((InputBufferImpl) this.f);
                return;
            case 2:
                ((CallbackToFutureAdapter.Completer) this.f).b(((EncoderImpl.ByteBufferInput) this.e).b);
                return;
            case 3:
                EncoderImpl.ByteBufferInput byteBufferInput = (EncoderImpl.ByteBufferInput) this.e;
                Observable.Observer observer = (Observable.Observer) this.f;
                LinkedHashMap linkedHashMap = byteBufferInput.f628a;
                observer.getClass();
                linkedHashMap.remove(observer);
                return;
            case 4:
                EncoderImpl.MediaCodecCallback mediaCodecCallback2 = (EncoderImpl.MediaCodecCallback) this.f;
                MediaCodec.CodecException codecException = (MediaCodec.CodecException) this.e;
                EncoderImpl encoderImpl = EncoderImpl.this;
                switch (encoderImpl.t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        encoderImpl.g(1, codecException.getMessage(), codecException);
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: " + encoderImpl.t);
                }
            case 5:
                EncoderImpl.MediaCodecCallback mediaCodecCallback3 = (EncoderImpl.MediaCodecCallback) this.f;
                MediaFormat mediaFormat = (MediaFormat) this.e;
                if (mediaCodecCallback3.j) {
                    Logger.e(EncoderImpl.this.f625a, "Receives onOutputFormatChanged after codec is reset.");
                    return;
                }
                switch (EncoderImpl.this.t.ordinal()) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        synchronized (EncoderImpl.this.b) {
                            EncoderImpl encoderImpl2 = EncoderImpl.this;
                            encoderCallback = encoderImpl2.r;
                            executor = encoderImpl2.s;
                        }
                        try {
                            executor.execute(new i(encoderCallback, mediaFormat));
                            return;
                        } catch (RejectedExecutionException e) {
                            Logger.c(EncoderImpl.this.f625a, "Unable to post to the supplied executor.", e);
                            return;
                        }
                    default:
                        throw new IllegalStateException("Unknown state: " + EncoderImpl.this.t);
                }
            case 6:
                EncoderCallback encoderCallback2 = (EncoderCallback) this.e;
                EncodedDataImpl encodedDataImpl = (EncodedDataImpl) this.f;
                int i = EncoderImpl.MediaCodecCallback.l;
                encoderCallback2.d(encodedDataImpl);
                return;
            case 7:
                ((EncoderImpl) this.e).l.remove((CallbackToFutureAdapter.Completer) this.f);
                return;
            case 8:
                ((Observable.Observer) ((Map.Entry) this.e).getKey()).a((BufferProvider.State) this.f);
                return;
            case 9:
                ((Observable.Observer) this.e).a((BufferProvider.State) this.f);
                return;
            default:
                ((Encoder.SurfaceInput.OnSurfaceUpdateListener) this.e).a((Surface) this.f);
                return;
        }
    }

    public /* synthetic */ d(EncoderImpl.MediaCodecCallback mediaCodecCallback, Object obj, int i) {
        this.d = i;
        this.f = mediaCodecCallback;
        this.e = obj;
    }
}
