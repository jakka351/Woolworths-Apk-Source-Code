package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.image.ImageDecoder;
import java.util.ArrayDeque;

@UnstableApi
/* loaded from: classes2.dex */
public class ImageRenderer extends BaseRenderer {
    public long A;
    public long B;
    public int C;
    public int D;
    public Format E;
    public ImageDecoder F;
    public DecoderInputBuffer G;
    public ImageOutput H;
    public Bitmap I;
    public boolean J;
    public TileInfo K;
    public TileInfo L;
    public int M;
    public boolean N;
    public final ImageDecoder.Factory u;
    public final DecoderInputBuffer v;
    public final ArrayDeque w;
    public boolean x;
    public boolean y;
    public OutputStreamInfo z;

    public static final class OutputStreamInfo {
        public static final OutputStreamInfo c = new OutputStreamInfo(-9223372036854775807L, -9223372036854775807L);

        /* renamed from: a, reason: collision with root package name */
        public final long f3093a;
        public final long b;

        public OutputStreamInfo(long j, long j2) {
            this.f3093a = j;
            this.b = j2;
        }
    }

    public static class TileInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f3094a;
        public final long b;
        public Bitmap c;

        public TileInfo(int i, long j) {
            this.f3094a = i;
            this.b = j;
        }
    }

    public ImageRenderer(ImageDecoder.Factory factory) {
        super(4);
        this.u = factory;
        this.H = ImageOutput.f3092a;
        this.v = new DecoderInputBuffer(0);
        this.z = OutputStreamInfo.c;
        this.w = new ArrayDeque();
        this.B = -9223372036854775807L;
        this.A = -9223372036854775807L;
        this.C = 0;
        this.D = 1;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void E() {
        this.E = null;
        this.z = OutputStreamInfo.c;
        this.w.clear();
        Q();
        this.H.a();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void F(boolean z, boolean z2) {
        this.D = z2 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void G(long j, boolean z) {
        this.D = Math.min(this.D, 1);
        this.y = false;
        this.x = false;
        this.I = null;
        this.K = null;
        this.L = null;
        this.J = false;
        this.G = null;
        ImageDecoder imageDecoder = this.F;
        if (imageDecoder != null) {
            imageDecoder.flush();
        }
        this.w.clear();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void H() {
        Q();
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void I() {
        Q();
        this.D = Math.min(this.D, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.BaseRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L(androidx.media3.common.Format[] r5, long r6, long r8, androidx.media3.exoplayer.source.MediaSource.MediaPeriodId r10) {
        /*
            r4 = this;
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r5 = r4.z
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.w
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.B
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.A
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r6 = new androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo
            long r0 = r4.B
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo r5 = new androidx.media3.exoplayer.image.ImageRenderer$OutputStreamInfo
            r5.<init>(r0, r8)
            r4.z = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.image.ImageRenderer.L(androidx.media3.common.Format[], long, long, androidx.media3.exoplayer.source.MediaSource$MediaPeriodId):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean N(long r13) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.image.ImageRenderer.N(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean O(long r13) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.image.ImageRenderer.O(long):boolean");
    }

    public final void P() throws ExoPlaybackException {
        if (this.N) {
            Format format = this.E;
            format.getClass();
            ImageDecoder.Factory factory = this.u;
            int iA = factory.a(format);
            if (iA != RendererCapabilities.g(4, 0, 0, 0) && iA != RendererCapabilities.g(3, 0, 0, 0)) {
                throw D(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.E, false, 4005);
            }
            ImageDecoder imageDecoder = this.F;
            if (imageDecoder != null) {
                imageDecoder.release();
            }
            this.F = factory.b();
            this.N = false;
        }
    }

    public final void Q() {
        this.G = null;
        this.C = 0;
        this.B = -9223372036854775807L;
        ImageDecoder imageDecoder = this.F;
        if (imageDecoder != null) {
            imageDecoder.release();
            this.F = null;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        return this.u.a(format);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean b() {
        return this.y;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void i(int i, Object obj) {
        if (i != 15) {
            return;
        }
        ImageOutput imageOutput = obj instanceof ImageOutput ? (ImageOutput) obj : null;
        if (imageOutput == null) {
            imageOutput = ImageOutput.f3092a;
        }
        this.H = imageOutput;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        int i = this.D;
        if (i != 3) {
            return i == 0 && this.J;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void m(long j, long j2) throws ExoPlaybackException {
        if (this.y) {
            return;
        }
        if (this.E == null) {
            FormatHolder formatHolder = this.f;
            formatHolder.a();
            DecoderInputBuffer decoderInputBuffer = this.v;
            decoderInputBuffer.l();
            int iM = M(formatHolder, decoderInputBuffer, 2);
            if (iM != -5) {
                if (iM == -4) {
                    Assertions.f(decoderInputBuffer.f(4));
                    this.x = true;
                    this.y = true;
                    return;
                }
                return;
            }
            Format format = formatHolder.b;
            Assertions.g(format);
            this.E = format;
            this.N = true;
        }
        if (this.F == null) {
            P();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (N(j)) {
            }
            while (O(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw D(e, null, false, 4003);
        }
    }
}
