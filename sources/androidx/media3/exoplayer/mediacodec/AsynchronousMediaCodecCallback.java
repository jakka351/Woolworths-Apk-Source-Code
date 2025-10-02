package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import java.util.ArrayDeque;

@RequiresApi
/* loaded from: classes2.dex */
final class AsynchronousMediaCodecCallback extends MediaCodec.Callback {
    public final HandlerThread b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public MediaCodec.CryptoException k;
    public long l;
    public boolean m;
    public IllegalStateException n;
    public MediaCodecAdapter.OnBufferAvailableListener o;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3100a = new Object();
    public final CircularIntArray d = new CircularIntArray();
    public final CircularIntArray e = new CircularIntArray();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public AsynchronousMediaCodecCallback(HandlerThread handlerThread) {
        this.b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        CircularIntArray circularIntArray = this.d;
        circularIntArray.c = circularIntArray.b;
        CircularIntArray circularIntArray2 = this.e;
        circularIntArray2.c = circularIntArray2.b;
        this.f.clear();
        arrayDeque.clear();
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f3100a) {
            this.k = cryptoException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f3100a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        Renderer.WakeupListener wakeupListener;
        synchronized (this.f3100a) {
            this.d.a(i);
            MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.o;
            if (onBufferAvailableListener != null && (wakeupListener = MediaCodecRenderer.this.I) != null) {
                wakeupListener.b();
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        Renderer.WakeupListener wakeupListener;
        synchronized (this.f3100a) {
            try {
                MediaFormat mediaFormat = this.i;
                if (mediaFormat != null) {
                    this.e.a(-2);
                    this.g.add(mediaFormat);
                    this.i = null;
                }
                this.e.a(i);
                this.f.add(bufferInfo);
                MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener = this.o;
                if (onBufferAvailableListener != null && (wakeupListener = MediaCodecRenderer.this.I) != null) {
                    wakeupListener.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f3100a) {
            this.e.a(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
