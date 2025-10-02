package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.collection.CircularIntArray;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import com.google.common.base.Supplier;
import java.nio.ByteBuffer;

@RequiresApi
/* loaded from: classes2.dex */
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f3095a;
    public final AsynchronousMediaCodecCallback b;
    public final MediaCodecBufferEnqueuer c;
    public final LoudnessCodecController d;
    public boolean e;
    public int f = 0;

    public static final class Factory implements MediaCodecAdapter.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final Supplier f3096a;
        public final Supplier b;

        public Factory(b bVar, b bVar2) {
            this.f3096a = bVar;
            this.b = bVar2;
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AsynchronousMediaCodecAdapter a(MediaCodecAdapter.Configuration configuration) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter;
            String str = configuration.f3105a.f3106a;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = null;
            try {
                Trace.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    asynchronousMediaCodecAdapter = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, (HandlerThread) this.f3096a.get(), new AsynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName, (HandlerThread) this.b.get()), configuration.f);
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                mediaCodecCreateByCodecName = null;
            }
            try {
                Trace.endSection();
                Surface surface = configuration.d;
                AsynchronousMediaCodecAdapter.p(asynchronousMediaCodecAdapter, configuration.b, surface, configuration.e, (surface == null && configuration.f3105a.h && Util.f2928a >= 35) ? 8 : 0);
                return asynchronousMediaCodecAdapter;
            } catch (Exception e3) {
                e = e3;
                asynchronousMediaCodecAdapter2 = asynchronousMediaCodecAdapter;
                if (asynchronousMediaCodecAdapter2 != null) {
                    asynchronousMediaCodecAdapter2.release();
                } else if (mediaCodecCreateByCodecName != null) {
                    mediaCodecCreateByCodecName.release();
                }
                throw e;
            }
        }
    }

    public AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer, LoudnessCodecController loudnessCodecController) {
        this.f3095a = mediaCodec;
        this.b = new AsynchronousMediaCodecCallback(handlerThread);
        this.c = mediaCodecBufferEnqueuer;
        this.d = loudnessCodecController;
    }

    public static void p(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        LoudnessCodecController loudnessCodecController;
        android.media.LoudnessCodecController loudnessCodecController2;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = asynchronousMediaCodecAdapter.b;
        MediaCodec mediaCodec = asynchronousMediaCodecAdapter.f3095a;
        HandlerThread handlerThread = asynchronousMediaCodecCallback.b;
        Assertions.f(asynchronousMediaCodecCallback.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(asynchronousMediaCodecCallback, handler);
        asynchronousMediaCodecCallback.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        asynchronousMediaCodecAdapter.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Util.f2928a >= 35 && (loudnessCodecController = asynchronousMediaCodecAdapter.d) != null && ((loudnessCodecController2 = loudnessCodecController.c) == null || loudnessCodecController2.addMediaCodec(mediaCodec))) {
            Assertions.f(loudnessCodecController.f3102a.add(mediaCodec));
        }
        asynchronousMediaCodecAdapter.f = 1;
    }

    public static String q(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void a(int i, CryptoInfo cryptoInfo, long j, int i2) {
        this.c.a(i, cryptoInfo, j, i2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void c(int i, int i2, int i3, long j) {
        this.c.c(i, i2, i3, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void d(int i) {
        this.f3095a.setVideoScalingMode(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void e(int i) {
        this.f3095a.releaseOutputBuffer(i, false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void f(int i, long j) {
        this.f3095a.releaseOutputBuffer(i, j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void flush() {
        this.c.flush();
        this.f3095a.flush();
        final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.b;
        synchronized (asynchronousMediaCodecCallback.f3100a) {
            asynchronousMediaCodecCallback.l++;
            Handler handler = asynchronousMediaCodecCallback.c;
            int i = Util.f2928a;
            handler.post(new Runnable() { // from class: androidx.media3.exoplayer.mediacodec.c
                @Override // java.lang.Runnable
                public final void run() {
                    AsynchronousMediaCodecCallback asynchronousMediaCodecCallback2 = asynchronousMediaCodecCallback;
                    synchronized (asynchronousMediaCodecCallback2.f3100a) {
                        try {
                            if (asynchronousMediaCodecCallback2.m) {
                                return;
                            }
                            long j = asynchronousMediaCodecCallback2.l - 1;
                            asynchronousMediaCodecCallback2.l = j;
                            if (j > 0) {
                                return;
                            }
                            if (j >= 0) {
                                asynchronousMediaCodecCallback2.a();
                                return;
                            }
                            IllegalStateException illegalStateException = new IllegalStateException();
                            synchronized (asynchronousMediaCodecCallback2.f3100a) {
                                asynchronousMediaCodecCallback2.n = illegalStateException;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
        this.f3095a.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        this.c.d();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.b;
        synchronized (asynchronousMediaCodecCallback.f3100a) {
            try {
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.n;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = asynchronousMediaCodecCallback.k;
                if (cryptoException != null) {
                    asynchronousMediaCodecCallback.k = null;
                    throw cryptoException;
                }
                boolean z = true;
                if (asynchronousMediaCodecCallback.l > 0 || asynchronousMediaCodecCallback.m) {
                    return -1;
                }
                CircularIntArray circularIntArray = asynchronousMediaCodecCallback.e;
                if (circularIntArray.b != circularIntArray.c) {
                    z = false;
                }
                if (z) {
                    return -1;
                }
                int iB = circularIntArray.b();
                if (iB >= 0) {
                    Assertions.g(asynchronousMediaCodecCallback.h);
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) asynchronousMediaCodecCallback.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (iB == -2) {
                    asynchronousMediaCodecCallback.h = (MediaFormat) asynchronousMediaCodecCallback.g.remove();
                }
                return iB;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final boolean h(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.b;
        synchronized (asynchronousMediaCodecCallback.f3100a) {
            asynchronousMediaCodecCallback.o = onBufferAvailableListener;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void i(MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.f3095a.setOnFrameRenderedListener(new a(this, onFrameRenderedListener, 0), handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final MediaFormat j() {
        MediaFormat mediaFormat;
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.b;
        synchronized (asynchronousMediaCodecCallback.f3100a) {
            try {
                mediaFormat = asynchronousMediaCodecCallback.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void k() {
        this.f3095a.detachOutputSurface();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer l(int i) {
        return this.f3095a.getInputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void m(Surface surface) {
        this.f3095a.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final int n() {
        this.c.d();
        AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.b;
        synchronized (asynchronousMediaCodecCallback.f3100a) {
            try {
                IllegalStateException illegalStateException = asynchronousMediaCodecCallback.n;
                if (illegalStateException != null) {
                    asynchronousMediaCodecCallback.n = null;
                    throw illegalStateException;
                }
                MediaCodec.CodecException codecException = asynchronousMediaCodecCallback.j;
                if (codecException != null) {
                    asynchronousMediaCodecCallback.j = null;
                    throw codecException;
                }
                MediaCodec.CryptoException cryptoException = asynchronousMediaCodecCallback.k;
                if (cryptoException != null) {
                    asynchronousMediaCodecCallback.k = null;
                    throw cryptoException;
                }
                boolean z = true;
                int iB = -1;
                if (asynchronousMediaCodecCallback.l > 0 || asynchronousMediaCodecCallback.m) {
                    return -1;
                }
                CircularIntArray circularIntArray = asynchronousMediaCodecCallback.d;
                if (circularIntArray.b != circularIntArray.c) {
                    z = false;
                }
                if (!z) {
                    iB = circularIntArray.b();
                }
                return iB;
            } finally {
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final ByteBuffer o(int i) {
        return this.f3095a.getOutputBuffer(i);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public final void release() {
        LoudnessCodecController loudnessCodecController;
        LoudnessCodecController loudnessCodecController2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                AsynchronousMediaCodecCallback asynchronousMediaCodecCallback = this.b;
                synchronized (asynchronousMediaCodecCallback.f3100a) {
                    asynchronousMediaCodecCallback.m = true;
                    asynchronousMediaCodecCallback.b.quit();
                    asynchronousMediaCodecCallback.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Util.f2928a;
                if (i >= 30 && i < 33) {
                    this.f3095a.stop();
                }
                if (i >= 35 && (loudnessCodecController2 = this.d) != null) {
                    loudnessCodecController2.a(this.f3095a);
                }
                this.f3095a.release();
                this.e = true;
            } finally {
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Util.f2928a;
                    if (i2 >= 30 && i2 < 33) {
                        this.f3095a.stop();
                    }
                    if (i2 >= 35 && (loudnessCodecController = this.d) != null) {
                        loudnessCodecController.a(this.f3095a);
                    }
                    this.f3095a.release();
                    this.e = true;
                } finally {
                }
            }
            throw th;
        }
    }
}
