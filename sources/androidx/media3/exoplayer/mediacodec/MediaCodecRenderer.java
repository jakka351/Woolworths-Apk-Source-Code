package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoConfig;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.OggOpusAudioPacketizer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.FrameworkCryptoConfig;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.SampleStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class MediaCodecRenderer extends BaseRenderer {
    public static final byte[] E0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final BatchBuffer A;
    public DecoderCounters A0;
    public final MediaCodec.BufferInfo B;
    public OutputStreamInfo B0;
    public final ArrayDeque C;
    public long C0;
    public final OggOpusAudioPacketizer D;
    public boolean D0;
    public Format E;
    public Format F;
    public DrmSession G;
    public DrmSession H;
    public Renderer.WakeupListener I;
    public MediaCrypto J;
    public final long K;
    public float L;
    public float M;
    public MediaCodecAdapter N;
    public Format O;
    public MediaFormat P;
    public boolean Q;
    public float R;
    public ArrayDeque S;
    public DecoderInitializationException T;
    public MediaCodecInfo U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public long c0;
    public long d0;
    public int e0;
    public int f0;
    public ByteBuffer g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public int p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public long t0;
    public final MediaCodecAdapter.Factory u;
    public long u0;
    public final MediaCodecSelector v;
    public boolean v0;
    public final float w;
    public boolean w0;
    public final DecoderInputBuffer x;
    public boolean x0;
    public final DecoderInputBuffer y;
    public boolean y0;
    public final DecoderInputBuffer z;
    public ExoPlaybackException z0;

    @RequiresApi
    public static final class Api31 {
    }

    public final class MediaCodecRendererCodecAdapterListener implements MediaCodecAdapter.OnBufferAvailableListener {
        public MediaCodecRendererCodecAdapterListener() {
        }
    }

    public static final class OutputStreamInfo {
        public static final OutputStreamInfo e = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f3109a;
        public final long b;
        public final long c;
        public final TimedValueQueue d = new TimedValueQueue();

        public OutputStreamInfo(long j, long j2, long j3) {
            this.f3109a = j;
            this.b = j2;
            this.c = j3;
        }
    }

    public MediaCodecRenderer(int i, MediaCodecAdapter.Factory factory, MediaCodecSelector mediaCodecSelector, float f) {
        super(i);
        this.u = factory;
        mediaCodecSelector.getClass();
        this.v = mediaCodecSelector;
        this.w = f;
        this.x = new DecoderInputBuffer(0);
        this.y = new DecoderInputBuffer(0);
        this.z = new DecoderInputBuffer(2);
        BatchBuffer batchBuffer = new BatchBuffer(2);
        batchBuffer.n = 32;
        this.A = batchBuffer;
        this.B = new MediaCodec.BufferInfo();
        this.L = 1.0f;
        this.M = 1.0f;
        this.K = -9223372036854775807L;
        this.C = new ArrayDeque();
        this.B0 = OutputStreamInfo.e;
        batchBuffer.n(0);
        batchBuffer.g.order(ByteOrder.nativeOrder());
        OggOpusAudioPacketizer oggOpusAudioPacketizer = new OggOpusAudioPacketizer();
        oggOpusAudioPacketizer.f3067a = AudioProcessor.f2893a;
        oggOpusAudioPacketizer.c = 0;
        oggOpusAudioPacketizer.b = 2;
        this.D = oggOpusAudioPacketizer;
        this.R = -1.0f;
        this.V = 0;
        this.n0 = 0;
        this.e0 = -1;
        this.f0 = -1;
        this.d0 = -9223372036854775807L;
        this.t0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.c0 = -9223372036854775807L;
        this.o0 = 0;
        this.p0 = 0;
        this.A0 = new DecoderCounters();
    }

    public final void A0() {
        z0();
        this.z0 = null;
        this.S = null;
        this.U = null;
        this.O = null;
        this.P = null;
        this.Q = false;
        this.s0 = false;
        this.R = -1.0f;
        this.V = 0;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.b0 = false;
        this.m0 = false;
        this.n0 = 0;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public void B(float f, float f2) {
        this.L = f;
        this.M = f2;
        H0(this.O);
    }

    public final void B0(DrmSession drmSession) {
        DrmSession.b(this.G, drmSession);
        this.G = drmSession;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.RendererCapabilities
    public final int C() {
        return 8;
    }

    public final void C0(OutputStreamInfo outputStreamInfo) {
        this.B0 = outputStreamInfo;
        long j = outputStreamInfo.c;
        if (j != -9223372036854775807L) {
            this.D0 = true;
            p0(j);
        }
    }

    public boolean D0(DecoderInputBuffer decoderInputBuffer) {
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void E() throws MediaCryptoException {
        this.E = null;
        C0(OutputStreamInfo.e);
        this.C.clear();
        V();
    }

    public boolean E0(MediaCodecInfo mediaCodecInfo) {
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void F(boolean z, boolean z2) {
        this.A0 = new DecoderCounters();
    }

    public boolean F0(Format format) {
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void G(long j, boolean z) {
        this.v0 = false;
        this.w0 = false;
        this.y0 = false;
        if (this.j0) {
            this.A.l();
            this.z.l();
            this.k0 = false;
            OggOpusAudioPacketizer oggOpusAudioPacketizer = this.D;
            oggOpusAudioPacketizer.getClass();
            oggOpusAudioPacketizer.f3067a = AudioProcessor.f2893a;
            oggOpusAudioPacketizer.c = 0;
            oggOpusAudioPacketizer.b = 2;
        } else if (V()) {
            h0();
        }
        if (this.B0.d.h() > 0) {
            this.x0 = true;
        }
        this.B0.d.b();
        this.C.clear();
    }

    public abstract int G0(MediaCodecSelector mediaCodecSelector, Format format);

    public final boolean H0(Format format) {
        if (Util.f2928a >= 23 && this.N != null && this.p0 != 3 && this.k != 0) {
            float f = this.M;
            format.getClass();
            Format[] formatArr = this.m;
            formatArr.getClass();
            float fZ = Z(f, formatArr);
            float f2 = this.R;
            if (f2 != fZ) {
                if (fZ == -1.0f) {
                    if (this.q0) {
                        this.o0 = 1;
                        this.p0 = 3;
                        return false;
                    }
                    x0();
                    h0();
                    return false;
                }
                if (f2 != -1.0f || fZ > this.w) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fZ);
                    MediaCodecAdapter mediaCodecAdapter = this.N;
                    mediaCodecAdapter.getClass();
                    mediaCodecAdapter.b(bundle);
                    this.R = fZ;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void I() {
        try {
            Q();
            x0();
        } finally {
            DrmSession.b(this.H, null);
            this.H = null;
        }
    }

    public final void I0() throws MediaCryptoException, ExoPlaybackException {
        DrmSession drmSession = this.H;
        drmSession.getClass();
        CryptoConfig cryptoConfigD = drmSession.d();
        if (cryptoConfigD instanceof FrameworkCryptoConfig) {
            try {
                MediaCrypto mediaCrypto = this.J;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((FrameworkCryptoConfig) cryptoConfigD).b);
            } catch (MediaCryptoException e) {
                throw D(e, this.E, false, 6006);
            }
        }
        B0(this.H);
        this.o0 = 0;
        this.p0 = 0;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void J() {
    }

    public final void J0(long j) {
        Format format = (Format) this.B0.d.f(j);
        if (format == null && this.D0 && this.P != null) {
            format = (Format) this.B0.d.e();
        }
        if (format != null) {
            this.F = format;
        } else if (!this.Q || this.F == null) {
            return;
        }
        Format format2 = this.F;
        format2.getClass();
        o0(format2, this.P);
        this.Q = false;
        this.D0 = false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public void K() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void L(androidx.media3.common.Format[] r13, long r14, long r16, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r18) {
        /*
            r12 = this;
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r13 = r12.B0
            long r0 = r13.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r4 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.C0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.C
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.t0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.C0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r5 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.C0(r5)
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r13 = r12.B0
            long r13 = r13.c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.r0()
        L51:
            return
        L52:
            androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo r5 = new androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$OutputStreamInfo
            long r6 = r12.t0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.L(androidx.media3.common.Format[], long, long, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x030b  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.N(long, long):boolean");
    }

    public DecoderReuseEvaluation O(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        return new DecoderReuseEvaluation(mediaCodecInfo.f3106a, format, format2, 0, 1);
    }

    public MediaCodecDecoderException P(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        return new MediaCodecDecoderException(illegalStateException, mediaCodecInfo);
    }

    public final void Q() {
        this.l0 = false;
        this.A.l();
        this.z.l();
        this.k0 = false;
        this.j0 = false;
        OggOpusAudioPacketizer oggOpusAudioPacketizer = this.D;
        oggOpusAudioPacketizer.getClass();
        oggOpusAudioPacketizer.f3067a = AudioProcessor.f2893a;
        oggOpusAudioPacketizer.c = 0;
        oggOpusAudioPacketizer.b = 2;
    }

    public final boolean R() throws MediaCryptoException, ExoPlaybackException {
        if (!this.q0) {
            I0();
            return true;
        }
        this.o0 = 1;
        if (this.X) {
            this.p0 = 3;
            return false;
        }
        this.p0 = 2;
        return true;
    }

    public final boolean S(long j, long j2) throws MediaCryptoException, ExoPlaybackException {
        boolean z;
        boolean z2;
        MediaCodec.BufferInfo bufferInfo;
        boolean zV0;
        int iG;
        MediaCodecAdapter mediaCodecAdapter = this.N;
        mediaCodecAdapter.getClass();
        int i = this.f0;
        MediaCodec.BufferInfo bufferInfo2 = this.B;
        if (i < 0) {
            if (this.Y && this.r0) {
                try {
                    iG = mediaCodecAdapter.g(bufferInfo2);
                } catch (IllegalStateException unused) {
                    u0();
                    if (this.w0) {
                        x0();
                    }
                }
            } else {
                iG = mediaCodecAdapter.g(bufferInfo2);
            }
            if (iG < 0) {
                if (iG == -2) {
                    this.s0 = true;
                    MediaCodecAdapter mediaCodecAdapter2 = this.N;
                    mediaCodecAdapter2.getClass();
                    MediaFormat mediaFormatJ = mediaCodecAdapter2.j();
                    if (this.V != 0 && mediaFormatJ.getInteger("width") == 32 && mediaFormatJ.getInteger("height") == 32) {
                        this.a0 = true;
                        return true;
                    }
                    this.P = mediaFormatJ;
                    this.Q = true;
                    return true;
                }
                if (this.b0 && (this.v0 || this.o0 == 2)) {
                    u0();
                }
                long j3 = this.c0;
                if (j3 != -9223372036854775807L) {
                    long j4 = j3 + 100;
                    Clock clock = this.j;
                    clock.getClass();
                    if (j4 < clock.currentTimeMillis()) {
                        u0();
                        return false;
                    }
                }
                return false;
            }
            if (this.a0) {
                this.a0 = false;
                mediaCodecAdapter.e(iG);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                u0();
                return false;
            }
            this.f0 = iG;
            ByteBuffer byteBufferO = mediaCodecAdapter.o(iG);
            this.g0 = byteBufferO;
            if (byteBufferO != null) {
                byteBufferO.position(bufferInfo2.offset);
                this.g0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j5 = bufferInfo2.presentationTimeUs;
            this.h0 = j5 < this.o;
            long j6 = this.u0;
            this.i0 = j6 != -9223372036854775807L && j6 <= j5;
            J0(j5);
        }
        if (this.Y && this.r0) {
            try {
                ByteBuffer byteBuffer = this.g0;
                int i2 = this.f0;
                int i3 = bufferInfo2.flags;
                long j7 = bufferInfo2.presentationTimeUs;
                boolean z3 = this.h0;
                boolean z4 = this.i0;
                Format format = this.F;
                format.getClass();
                z = false;
                z2 = true;
                bufferInfo = bufferInfo2;
                try {
                    zV0 = v0(j, j2, mediaCodecAdapter, byteBuffer, i2, i3, 1, j7, z3, z4, format);
                } catch (IllegalStateException unused2) {
                    u0();
                    if (!this.w0) {
                        return z;
                    }
                    x0();
                    return z;
                }
            } catch (IllegalStateException unused3) {
                z = false;
            }
        } else {
            z = false;
            z2 = true;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.g0;
            int i4 = this.f0;
            int i5 = bufferInfo.flags;
            long j8 = bufferInfo.presentationTimeUs;
            boolean z5 = this.h0;
            boolean z6 = this.i0;
            Format format2 = this.F;
            format2.getClass();
            zV0 = v0(j, j2, mediaCodecAdapter, byteBuffer2, i4, i5, 1, j8, z5, z6, format2);
        }
        if (!zV0) {
            return z;
        }
        q0(bufferInfo.presentationTimeUs);
        boolean z7 = (bufferInfo.flags & 4) != 0 ? z2 : z;
        if (!z7 && this.r0 && this.i0) {
            Clock clock2 = this.j;
            clock2.getClass();
            this.c0 = clock2.currentTimeMillis();
        }
        this.f0 = -1;
        this.g0 = null;
        if (!z7) {
            return z2;
        }
        u0();
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean T() throws android.media.MediaCryptoException, androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.T():boolean");
    }

    public final void U() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.N;
            Assertions.g(mediaCodecAdapter);
            mediaCodecAdapter.flush();
        } finally {
            z0();
        }
    }

    public final boolean V() throws MediaCryptoException {
        if (this.N == null) {
            return false;
        }
        int i = this.p0;
        if (i == 3 || ((this.W && !this.s0) || (this.X && this.r0))) {
            x0();
            return true;
        }
        if (i == 2) {
            int i2 = Util.f2928a;
            Assertions.f(i2 >= 23);
            if (i2 >= 23) {
                try {
                    I0();
                } catch (ExoPlaybackException e) {
                    Log.h("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                    x0();
                    return true;
                }
            }
        }
        U();
        return false;
    }

    public final List W(boolean z) {
        Format format = this.E;
        format.getClass();
        MediaCodecSelector mediaCodecSelector = this.v;
        ArrayList arrayListA0 = a0(mediaCodecSelector, format, z);
        if (!arrayListA0.isEmpty() || !z) {
            return arrayListA0;
        }
        ArrayList arrayListA02 = a0(mediaCodecSelector, format, false);
        if (!arrayListA02.isEmpty()) {
            Log.g("MediaCodecRenderer", "Drm session requires secure decoder for " + format.n + ", but no secure decoder available. Trying to proceed with " + arrayListA02 + ".");
        }
        return arrayListA02;
    }

    public int X(DecoderInputBuffer decoderInputBuffer) {
        return 0;
    }

    public boolean Y() {
        return false;
    }

    public float Z(float f, Format[] formatArr) {
        return -1.0f;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) throws ExoPlaybackException {
        try {
            return G0(this.v, format);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw D(e, format, false, 4002);
        }
    }

    public abstract ArrayList a0(MediaCodecSelector mediaCodecSelector, Format format, boolean z);

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public boolean b() {
        return this.w0;
    }

    public abstract MediaCodecAdapter.Configuration b0(MediaCodecInfo mediaCodecInfo, Format format, MediaCrypto mediaCrypto, float f);

    public final long c0() {
        return this.B0.c;
    }

    public final long d0() {
        return this.B0.b;
    }

    public void e0(DecoderInputBuffer decoderInputBuffer) {
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.f0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo, android.media.MediaCrypto):void");
    }

    public final boolean g0(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        Format format = this.F;
        return format == null || !Objects.equals(format.n, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h0() {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.h0():void");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public void i(int i, Object obj) {
        if (i == 11) {
            Renderer.WakeupListener wakeupListener = (Renderer.WakeupListener) obj;
            wakeupListener.getClass();
            this.I = wakeupListener;
            t0(wakeupListener);
        }
    }

    public final void i0(MediaCrypto mediaCrypto, boolean z) throws DecoderInitializationException {
        Format format = this.E;
        format.getClass();
        if (this.S == null) {
            try {
                List listW = W(z);
                this.S = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listW;
                if (!arrayList.isEmpty()) {
                    this.S.add((MediaCodecInfo) arrayList.get(0));
                }
                this.T = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(format, e, z, -49998);
            }
        }
        if (this.S.isEmpty()) {
            throw new DecoderInitializationException(format, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.S;
        arrayDeque.getClass();
        while (this.N == null) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) arrayDeque.peekFirst();
            mediaCodecInfo.getClass();
            if (!j0(format) || !E0(mediaCodecInfo)) {
                return;
            }
            try {
                f0(mediaCodecInfo, mediaCrypto);
            } catch (Exception e2) {
                Log.h("MediaCodecRenderer", "Failed to initialize decoder: " + mediaCodecInfo, e2);
                arrayDeque.removeFirst();
                DecoderInitializationException decoderInitializationException = new DecoderInitializationException("Decoder init failed: " + mediaCodecInfo.f3106a + ", " + format, e2, format.n, z, mediaCodecInfo, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null);
                k0(decoderInitializationException);
                DecoderInitializationException decoderInitializationException2 = this.T;
                if (decoderInitializationException2 == null) {
                    this.T = decoderInitializationException;
                } else {
                    this.T = new DecoderInitializationException(decoderInitializationException2.getMessage(), decoderInitializationException2.getCause(), decoderInitializationException2.d, decoderInitializationException2.e, decoderInitializationException2.f, decoderInitializationException2.g);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.T;
                }
            }
        }
        this.S = null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public boolean isReady() {
        boolean zIsReady;
        if (this.E != null) {
            if (f()) {
                zIsReady = this.q;
            } else {
                SampleStream sampleStream = this.l;
                sampleStream.getClass();
                zIsReady = sampleStream.isReady();
            }
            if (!zIsReady) {
                if (!(this.f0 >= 0)) {
                    if (this.d0 != -9223372036854775807L) {
                        Clock clock = this.j;
                        clock.getClass();
                        if (clock.elapsedRealtime() < this.d0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean j0(Format format) {
        return true;
    }

    public void k0(Exception exc) {
    }

    public void l0(long j, long j2, String str) {
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0079 A[EDGE_INSN: B:87:0x0079->B:90:? BREAK  A[LOOP:1: B:31:0x0053->B:41:0x0078], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a BREAK  A[LOOP:2: B:42:0x0079->B:52:0x0099], SYNTHETIC] */
    @Override // androidx.media3.exoplayer.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.m(long, long):void");
    }

    public void m0(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d5, code lost:
    
        if (r4.h(r2) != false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.media3.exoplayer.DecoderReuseEvaluation n0(androidx.media3.exoplayer.FormatHolder r14) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.mediacodec.MediaCodecRenderer.n0(androidx.media3.exoplayer.FormatHolder):androidx.media3.exoplayer.DecoderReuseEvaluation");
    }

    public void o0(Format format, MediaFormat mediaFormat) {
    }

    public void p0(long j) {
    }

    public void q0(long j) {
        this.C0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.C;
            if (arrayDeque.isEmpty() || j < ((OutputStreamInfo) arrayDeque.peek()).f3109a) {
                return;
            }
            OutputStreamInfo outputStreamInfo = (OutputStreamInfo) arrayDeque.poll();
            outputStreamInfo.getClass();
            C0(outputStreamInfo);
            r0();
        }
    }

    public void r0() {
    }

    public void s0(DecoderInputBuffer decoderInputBuffer) {
    }

    public void t0(Renderer.WakeupListener wakeupListener) {
    }

    public final void u0() throws MediaCryptoException, ExoPlaybackException {
        int i = this.p0;
        if (i == 1) {
            U();
            return;
        }
        if (i == 2) {
            U();
            I0();
        } else if (i != 3) {
            this.w0 = true;
            y0();
        } else {
            x0();
            h0();
        }
    }

    public abstract boolean v0(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format);

    public final boolean w0(int i) throws MediaCryptoException, ExoPlaybackException {
        FormatHolder formatHolder = this.f;
        formatHolder.a();
        DecoderInputBuffer decoderInputBuffer = this.x;
        decoderInputBuffer.l();
        int iM = M(formatHolder, decoderInputBuffer, i | 4);
        if (iM == -5) {
            n0(formatHolder);
            return true;
        }
        if (iM != -4 || !decoderInputBuffer.f(4)) {
            return false;
        }
        this.v0 = true;
        u0();
        return false;
    }

    public final void x0() {
        try {
            MediaCodecAdapter mediaCodecAdapter = this.N;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.release();
                this.A0.b++;
                MediaCodecInfo mediaCodecInfo = this.U;
                mediaCodecInfo.getClass();
                m0(mediaCodecInfo.f3106a);
            }
            this.N = null;
            try {
                MediaCrypto mediaCrypto = this.J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.N = null;
            try {
                MediaCrypto mediaCrypto2 = this.J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    public void y0() {
    }

    public void z0() {
        this.e0 = -1;
        this.y.g = null;
        this.f0 = -1;
        this.g0 = null;
        this.d0 = -9223372036854775807L;
        this.r0 = false;
        this.c0 = -9223372036854775807L;
        this.q0 = false;
        this.Z = false;
        this.a0 = false;
        this.h0 = false;
        this.i0 = false;
        this.t0 = -9223372036854775807L;
        this.u0 = -9223372036854775807L;
        this.C0 = -9223372036854775807L;
        this.o0 = 0;
        this.p0 = 0;
        this.n0 = this.m0 ? 1 : 0;
    }

    public static class DecoderInitializationException extends Exception {
        public final String d;
        public final boolean e;
        public final MediaCodecInfo f;
        public final String g;

        public DecoderInitializationException(Format format, MediaCodecUtil.DecoderQueryException decoderQueryException, boolean z, int i) {
            this("Decoder init failed: [" + i + "], " + format, decoderQueryException, format.n, z, null, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i));
        }

        public DecoderInitializationException(String str, Throwable th, String str2, boolean z, MediaCodecInfo mediaCodecInfo, String str3) {
            super(str, th);
            this.d = str2;
            this.e = z;
            this.f = mediaCodecInfo;
            this.g = str3;
        }
    }
}
