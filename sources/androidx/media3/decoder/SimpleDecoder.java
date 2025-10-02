package androidx.media3.decoder;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.DecoderOutputBuffer;
import androidx.media3.exoplayer.image.ImageOutputBuffer;
import java.util.ArrayDeque;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {

    /* renamed from: a, reason: collision with root package name */
    public final Thread f2989a;
    public final DecoderInputBuffer[] e;
    public final DecoderOutputBuffer[] f;
    public int g;
    public int h;
    public DecoderInputBuffer i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public int m;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public SimpleDecoder(DecoderInputBuffer[] decoderInputBufferArr, DecoderOutputBuffer[] decoderOutputBufferArr) {
        this.e = decoderInputBufferArr;
        this.g = decoderInputBufferArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = g();
        }
        this.f = decoderOutputBufferArr;
        this.h = decoderOutputBufferArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = h();
        }
        Thread thread = new Thread() { // from class: androidx.media3.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                do {
                    try {
                    } catch (InterruptedException e) {
                        throw new IllegalStateException(e);
                    }
                } while (SimpleDecoder.this.k());
            }
        };
        this.f2989a = thread;
        thread.start();
    }

    @Override // androidx.media3.decoder.Decoder
    public final void c(long j) {
        synchronized (this.b) {
            try {
                Assertions.f(this.g == this.e.length || this.k);
                this.n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final Object d() {
        DecoderInputBuffer decoderInputBuffer;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                Assertions.f(this.i == null);
                int i = this.g;
                if (i == 0) {
                    decoderInputBuffer = null;
                } else {
                    DecoderInputBuffer[] decoderInputBufferArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    decoderInputBuffer = decoderInputBufferArr[i2];
                }
                this.i = decoderInputBuffer;
            } catch (Throwable th) {
                throw th;
            }
        }
        return decoderInputBuffer;
    }

    @Override // androidx.media3.decoder.Decoder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void b(DecoderInputBuffer decoderInputBuffer) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                Assertions.b(decoderInputBuffer == this.i);
                this.c.addLast(decoderInputBuffer);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                DecoderInputBuffer decoderInputBuffer = this.i;
                if (decoderInputBuffer != null) {
                    decoderInputBuffer.l();
                    DecoderInputBuffer[] decoderInputBufferArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    decoderInputBufferArr[i] = decoderInputBuffer;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    DecoderInputBuffer decoderInputBuffer2 = (DecoderInputBuffer) this.c.removeFirst();
                    decoderInputBuffer2.l();
                    DecoderInputBuffer[] decoderInputBufferArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    decoderInputBufferArr2[i2] = decoderInputBuffer2;
                }
                while (!this.d.isEmpty()) {
                    ((DecoderOutputBuffer) this.d.removeFirst()).m();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract DecoderInputBuffer g();

    public abstract DecoderOutputBuffer h();

    public abstract DecoderException i(Throwable th);

    public abstract DecoderException j(DecoderInputBuffer decoderInputBuffer, DecoderOutputBuffer decoderOutputBuffer, boolean z);

    public final boolean k() {
        boolean z;
        DecoderException decoderExceptionI;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            DecoderInputBuffer decoderInputBuffer = (DecoderInputBuffer) this.c.removeFirst();
            DecoderOutputBuffer[] decoderOutputBufferArr = this.f;
            int i = this.h - 1;
            this.h = i;
            DecoderOutputBuffer decoderOutputBuffer = decoderOutputBufferArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (decoderInputBuffer.f(4)) {
                decoderOutputBuffer.e(4);
            } else {
                decoderOutputBuffer.e = decoderInputBuffer.i;
                if (decoderInputBuffer.f(134217728)) {
                    decoderOutputBuffer.e(134217728);
                }
                long j = decoderInputBuffer.i;
                synchronized (this.b) {
                    long j2 = this.n;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    decoderOutputBuffer.g = true;
                }
                try {
                    decoderExceptionI = j(decoderInputBuffer, decoderOutputBuffer, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionI = i(e);
                } catch (RuntimeException e2) {
                    decoderExceptionI = i(e2);
                }
                if (decoderExceptionI != null) {
                    synchronized (this.b) {
                        this.j = decoderExceptionI;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        decoderOutputBuffer.m();
                    } else if (decoderOutputBuffer.g) {
                        this.m++;
                        decoderOutputBuffer.m();
                    } else {
                        decoderOutputBuffer.f = this.m;
                        this.m = 0;
                        this.d.addLast(decoderOutputBuffer);
                    }
                    decoderInputBuffer.l();
                    DecoderInputBuffer[] decoderInputBufferArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    decoderInputBufferArr[i2] = decoderInputBuffer;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // androidx.media3.decoder.Decoder
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final DecoderOutputBuffer a() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (DecoderOutputBuffer) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(DecoderOutputBuffer decoderOutputBuffer) {
        synchronized (this.b) {
            decoderOutputBuffer.l();
            DecoderOutputBuffer[] decoderOutputBufferArr = this.f;
            int i = this.h;
            this.h = i + 1;
            decoderOutputBufferArr[i] = decoderOutputBuffer;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public final void release() throws InterruptedException {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.f2989a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // androidx.media3.decoder.Decoder
    public /* bridge */ /* synthetic */ ImageOutputBuffer a() {
        return (ImageOutputBuffer) a();
    }
}
