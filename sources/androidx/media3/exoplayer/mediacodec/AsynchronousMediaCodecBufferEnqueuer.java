package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

@RequiresApi
/* loaded from: classes2.dex */
class AsynchronousMediaCodecBufferEnqueuer implements MediaCodecBufferEnqueuer {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f3097a;
    public final HandlerThread b;
    public Handler c;
    public final AtomicReference d;
    public final ConditionVariable e;
    public boolean f;

    public static class MessageParams {

        /* renamed from: a, reason: collision with root package name */
        public int f3099a;
        public int b;
        public final MediaCodec.CryptoInfo c = new MediaCodec.CryptoInfo();
        public long d;
        public int e;
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        ConditionVariable conditionVariable = new ConditionVariable();
        this.f3097a = mediaCodec;
        this.b = handlerThread;
        this.e = conditionVariable;
        this.d = new AtomicReference();
    }

    public static MessageParams e() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new MessageParams();
                }
                return (MessageParams) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void a(int i, CryptoInfo cryptoInfo, long j, int i2) {
        d();
        MessageParams messageParamsE = e();
        messageParamsE.f3099a = i;
        messageParamsE.b = 0;
        messageParamsE.d = j;
        messageParamsE.e = i2;
        MediaCodec.CryptoInfo cryptoInfo2 = messageParamsE.c;
        cryptoInfo2.numSubSamples = cryptoInfo.f;
        int[] iArr = cryptoInfo.d;
        int[] iArrCopyOf = cryptoInfo2.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo2.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = cryptoInfo.e;
        int[] iArrCopyOf2 = cryptoInfo2.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo2.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = cryptoInfo.b;
        byte[] bArrCopyOf = cryptoInfo2.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo2.key = bArrCopyOf;
        byte[] bArr2 = cryptoInfo.f2987a;
        byte[] bArrCopyOf2 = cryptoInfo2.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo2.iv = bArrCopyOf2;
        cryptoInfo2.mode = cryptoInfo.c;
        if (Util.f2928a >= 24) {
            cryptoInfo2.setPattern(new MediaCodec.CryptoInfo.Pattern(cryptoInfo.g, cryptoInfo.h));
        }
        this.c.obtainMessage(2, messageParamsE).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void b(Bundle bundle) {
        d();
        Handler handler = this.c;
        int i = Util.f2928a;
        handler.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void c(int i, int i2, int i3, long j) {
        d();
        MessageParams messageParamsE = e();
        messageParamsE.f3099a = i;
        messageParamsE.b = i2;
        messageParamsE.d = j;
        messageParamsE.e = i3;
        Handler handler = this.c;
        int i4 = Util.f2928a;
        handler.obtainMessage(1, messageParamsE).sendToTarget();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void d() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void flush() {
        if (this.f) {
            try {
                Handler handler = this.c;
                handler.getClass();
                handler.removeCallbacksAndMessages(null);
                ConditionVariable conditionVariable = this.e;
                conditionVariable.d();
                Handler handler2 = this.c;
                handler2.getClass();
                handler2.obtainMessage(3).sendToTarget();
                conditionVariable.a();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecBufferEnqueuer
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper()) { // from class: androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) throws MediaCodec.CryptoException {
                AsynchronousMediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer = AsynchronousMediaCodecBufferEnqueuer.this;
                ArrayDeque arrayDeque = AsynchronousMediaCodecBufferEnqueuer.g;
                int i = message.what;
                MessageParams messageParams = null;
                if (i == 1) {
                    MessageParams messageParams2 = (MessageParams) message.obj;
                    try {
                        asynchronousMediaCodecBufferEnqueuer.f3097a.queueInputBuffer(messageParams2.f3099a, 0, messageParams2.b, messageParams2.d, messageParams2.e);
                    } catch (RuntimeException e) {
                        AtomicReference atomicReference = asynchronousMediaCodecBufferEnqueuer.d;
                        while (!atomicReference.compareAndSet(null, e) && atomicReference.get() == null) {
                        }
                    }
                    messageParams = messageParams2;
                } else if (i == 2) {
                    MessageParams messageParams3 = (MessageParams) message.obj;
                    int i2 = messageParams3.f3099a;
                    MediaCodec.CryptoInfo cryptoInfo = messageParams3.c;
                    long j = messageParams3.d;
                    int i3 = messageParams3.e;
                    try {
                        synchronized (AsynchronousMediaCodecBufferEnqueuer.h) {
                            asynchronousMediaCodecBufferEnqueuer.f3097a.queueSecureInputBuffer(i2, 0, cryptoInfo, j, i3);
                        }
                    } catch (RuntimeException e2) {
                        AtomicReference atomicReference2 = asynchronousMediaCodecBufferEnqueuer.d;
                        while (!atomicReference2.compareAndSet(null, e2) && atomicReference2.get() == null) {
                        }
                    }
                    messageParams = messageParams3;
                } else if (i == 3) {
                    asynchronousMediaCodecBufferEnqueuer.e.e();
                } else if (i != 4) {
                    AtomicReference atomicReference3 = asynchronousMediaCodecBufferEnqueuer.d;
                    IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                    while (!atomicReference3.compareAndSet(null, illegalStateException) && atomicReference3.get() == null) {
                    }
                } else {
                    try {
                        asynchronousMediaCodecBufferEnqueuer.f3097a.setParameters((Bundle) message.obj);
                    } catch (RuntimeException e3) {
                        AtomicReference atomicReference4 = asynchronousMediaCodecBufferEnqueuer.d;
                        while (!atomicReference4.compareAndSet(null, e3) && atomicReference4.get() == null) {
                        }
                    }
                }
                if (messageParams != null) {
                    ArrayDeque arrayDeque2 = AsynchronousMediaCodecBufferEnqueuer.g;
                    synchronized (arrayDeque2) {
                        arrayDeque2.add(messageParams);
                    }
                }
            }
        };
        this.f = true;
    }
}
