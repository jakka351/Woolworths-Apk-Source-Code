package androidx.media3.exoplayer.video;

import android.os.SystemClock;
import android.os.Trace;
import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.VideoDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class DecoderVideoRenderer extends BaseRenderer {
    public Surface A;
    public VideoDecoderOutputBufferRenderer B;
    public VideoFrameMetadataListener C;
    public DrmSession D;
    public DrmSession E;
    public int F;
    public boolean G;
    public int H;
    public long I;
    public boolean J;
    public VideoSize K;
    public int L;
    public DecoderCounters M;
    public Format u;
    public Decoder v;
    public DecoderInputBuffer w;
    public VideoDecoderOutputBuffer x;
    public int y;
    public Object z;

    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        throw null;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            r3 = this;
            r0 = 0
            r3.u = r0
            r3.K = r0
            r1 = 0
            int r2 = r3.H
            int r1 = java.lang.Math.min(r2, r1)
            r3.H = r1
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.E     // Catch: java.lang.Throwable -> L19
            androidx.media3.exoplayer.drm.DrmSession.b(r1, r0)     // Catch: java.lang.Throwable -> L19
            r3.E = r0     // Catch: java.lang.Throwable -> L19
            r3.R()     // Catch: java.lang.Throwable -> L19
            throw r0
        L19:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.DecoderVideoRenderer.E():void");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void F(boolean z, boolean z2) {
        this.M = new DecoderCounters();
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void G(long j, boolean z) throws ExoPlaybackException {
        this.J = false;
        this.H = Math.min(this.H, 1);
        this.I = -9223372036854775807L;
        Decoder decoder = this.v;
        if (decoder == null) {
            throw null;
        }
        if (this.F != 0) {
            R();
            Q();
            throw null;
        }
        this.w = null;
        if (this.x != null) {
            throw null;
        }
        decoder.flush();
        decoder.c(this.o);
        this.G = false;
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void J() {
        this.L = 0;
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        int i = Util.f2928a;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void K() {
        if (this.L <= 0) {
            return;
        }
        SystemClock.elapsedRealtime();
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void L(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
    }

    public abstract Decoder N();

    public final void O(long j) throws ExoPlaybackException {
        if (this.x == null) {
            Decoder decoder = this.v;
            decoder.getClass();
            VideoDecoderOutputBuffer videoDecoderOutputBuffer = (VideoDecoderOutputBuffer) decoder.a();
            this.x = videoDecoderOutputBuffer;
            if (videoDecoderOutputBuffer == null) {
                return;
            }
            this.M.f += videoDecoderOutputBuffer.f;
        }
        if (this.x.f(4)) {
            if (this.F != 2) {
                this.x.getClass();
                throw null;
            }
            R();
            Q();
            return;
        }
        if (this.I == -9223372036854775807L) {
            this.I = j;
        }
        VideoDecoderOutputBuffer videoDecoderOutputBuffer2 = this.x;
        videoDecoderOutputBuffer2.getClass();
        long j2 = videoDecoderOutputBuffer2.e - j;
        if (this.y != -1) {
            throw null;
        }
        if (j2 >= -30000) {
            return;
        }
        this.M.f++;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean P() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r13 = this;
            androidx.media3.decoder.Decoder r0 = r13.v
            r1 = 0
            if (r0 == 0) goto Lc6
            int r2 = r13.F
            r3 = 2
            if (r2 == r3) goto Lc6
            boolean r2 = r13.J
            if (r2 == 0) goto L10
            goto Lc6
        L10:
            androidx.media3.decoder.DecoderInputBuffer r2 = r13.w
            if (r2 != 0) goto L20
            java.lang.Object r0 = r0.d()
            androidx.media3.decoder.DecoderInputBuffer r0 = (androidx.media3.decoder.DecoderInputBuffer) r0
            r13.w = r0
            if (r0 != 0) goto L20
            goto Lc6
        L20:
            androidx.media3.decoder.DecoderInputBuffer r0 = r13.w
            r0.getClass()
            int r2 = r13.F
            r4 = 4
            r5 = 0
            r6 = 1
            if (r2 != r6) goto L3b
            r0.d = r4
            androidx.media3.decoder.Decoder r2 = r13.v
            r2.getClass()
            r2.b(r0)
            r13.w = r5
            r13.F = r3
            return r1
        L3b:
            androidx.media3.exoplayer.FormatHolder r2 = r13.f
            r2.a()
            int r3 = r13.M(r2, r0, r1)
            r7 = -5
            if (r3 == r7) goto L6e
            r2 = -4
            if (r3 == r2) goto L55
            r0 = -3
            if (r3 != r0) goto L4f
            goto Lc6
        L4f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L55:
            boolean r2 = r0.f(r4)
            if (r2 == 0) goto L68
            r13.J = r6
            androidx.media3.decoder.Decoder r2 = r13.v
            r2.getClass()
            r2.b(r0)
            r13.w = r5
            return r1
        L68:
            androidx.media3.common.Format r0 = r13.u
            r0.getClass()
            throw r5
        L6e:
            androidx.media3.common.Format r10 = r2.b
            r10.getClass()
            androidx.media3.exoplayer.drm.DrmSession r0 = r2.f3009a
            androidx.media3.exoplayer.drm.DrmSession r1 = r13.E
            androidx.media3.exoplayer.drm.DrmSession.b(r1, r0)
            r13.E = r0
            androidx.media3.common.Format r9 = r13.u
            r13.u = r10
            androidx.media3.decoder.Decoder r1 = r13.v
            if (r1 == 0) goto Lbd
            androidx.media3.exoplayer.drm.DrmSession r2 = r13.D
            if (r0 == r2) goto L98
            androidx.media3.exoplayer.DecoderReuseEvaluation r7 = new androidx.media3.exoplayer.DecoderReuseEvaluation
            java.lang.String r8 = r1.getName()
            r9.getClass()
            r11 = 0
            r12 = 128(0x80, float:1.794E-43)
            r7.<init>(r8, r9, r10, r11, r12)
            goto La6
        L98:
            java.lang.String r8 = r1.getName()
            r9.getClass()
            androidx.media3.exoplayer.DecoderReuseEvaluation r7 = new androidx.media3.exoplayer.DecoderReuseEvaluation
            r11 = 0
            r12 = 1
            r7.<init>(r8, r9, r10, r11, r12)
        La6:
            int r0 = r7.d
            if (r0 != 0) goto Lb7
            boolean r0 = r13.G
            if (r0 == 0) goto Lb1
            r13.F = r6
            goto Lb7
        Lb1:
            r13.R()
            r13.Q()
        Lb7:
            androidx.media3.common.Format r0 = r13.u
            r0.getClass()
            throw r5
        Lbd:
            r13.Q()
            androidx.media3.common.Format r0 = r13.u
            r0.getClass()
            throw r5
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.DecoderVideoRenderer.P():boolean");
    }

    public final void Q() throws ExoPlaybackException {
        if (this.v != null) {
            return;
        }
        DrmSession drmSession = this.E;
        DrmSession.b(this.D, drmSession);
        this.D = drmSession;
        if (drmSession != null && drmSession.d() == null && this.D.c() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            this.u.getClass();
            Decoder decoderN = N();
            this.v = decoderN;
            decoderN.c(this.o);
            S();
            SystemClock.elapsedRealtime();
            this.v.getClass();
            throw null;
        } catch (DecoderException e) {
            Log.d("DecoderVideoRenderer", "Video codec error", e);
            throw null;
        } catch (OutOfMemoryError e2) {
            throw D(e2, this.u, false, 4001);
        }
    }

    public final void R() {
        this.w = null;
        this.x = null;
        this.F = 0;
        this.G = false;
        Decoder decoder = this.v;
        if (decoder == null) {
            DrmSession.b(this.D, null);
            this.D = null;
        } else {
            this.M.b++;
            decoder.release();
            this.v.getClass();
            throw null;
        }
    }

    public abstract void S();

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void i(int i, Object obj) {
        if (i != 1) {
            if (i == 7) {
                this.C = (VideoFrameMetadataListener) obj;
                return;
            }
            return;
        }
        if (obj instanceof Surface) {
            this.A = (Surface) obj;
            this.B = null;
            this.y = 1;
        } else if (obj instanceof VideoDecoderOutputBufferRenderer) {
            this.A = null;
            this.B = (VideoDecoderOutputBufferRenderer) obj;
            this.y = 0;
        } else {
            this.A = null;
            this.B = null;
            this.y = -1;
            obj = null;
        }
        Object obj2 = this.z;
        if (obj2 == obj) {
            if (obj != null) {
                if (this.K != null) {
                    throw null;
                }
                if (this.H == 3 && obj2 != null) {
                    throw null;
                }
                return;
            }
            return;
        }
        this.z = obj;
        if (obj == null) {
            this.K = null;
            this.H = Math.min(this.H, 1);
            return;
        }
        if (this.v != null) {
            S();
        }
        if (this.K != null) {
            throw null;
        }
        this.H = Math.min(this.H, 1);
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        boolean zIsReady;
        if (this.u != null) {
            if (f()) {
                zIsReady = this.q;
            } else {
                SampleStream sampleStream = this.l;
                sampleStream.getClass();
                zIsReady = sampleStream.isReady();
            }
            if (zIsReady || this.x != null) {
                if (this.H != 3) {
                    if (!(this.y != -1)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void m(long j, long j2) throws ExoPlaybackException {
        if (this.u == null) {
            this.f.a();
            throw null;
        }
        Q();
        if (this.v != null) {
            try {
                Trace.beginSection("drainAndFeed");
                O(j);
                P();
                Trace.endSection();
                synchronized (this.M) {
                }
            } catch (DecoderException e) {
                Log.d("DecoderVideoRenderer", "Video codec error", e);
                throw null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void u() {
        if (this.H == 0) {
            this.H = 1;
        }
    }
}
