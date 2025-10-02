package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;

/* loaded from: classes2.dex */
class RendererHolder {

    /* renamed from: a, reason: collision with root package name */
    public final Renderer f3024a;
    public final int b;
    public final Renderer c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public RendererHolder(Renderer renderer, Renderer renderer2, int i) {
        this.f3024a = renderer;
        this.b = i;
        this.c = renderer2;
    }

    public static boolean g(Renderer renderer) {
        return renderer.getState() != 0;
    }

    public static void l(Renderer renderer, long j) {
        renderer.v();
        if (renderer instanceof TextRenderer) {
            TextRenderer textRenderer = (TextRenderer) renderer;
            Assertions.f(textRenderer.q);
            textRenderer.M = j;
        }
    }

    public final void a(Renderer renderer, DefaultMediaClock defaultMediaClock) {
        Assertions.f(this.f3024a == renderer || this.c == renderer);
        if (g(renderer)) {
            if (renderer == defaultMediaClock.f) {
                defaultMediaClock.g = null;
                defaultMediaClock.f = null;
                defaultMediaClock.h = true;
            }
            if (renderer.getState() == 2) {
                renderer.stop();
            }
            renderer.disable();
        }
    }

    public final int b() {
        boolean zG = g(this.f3024a);
        Renderer renderer = this.c;
        return (zG ? 1 : 0) + ((renderer == null || !g(renderer)) ? 0 : 1);
    }

    public final Renderer c(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder != null) {
            SampleStream[] sampleStreamArr = mediaPeriodHolder.c;
            int i = this.b;
            if (sampleStreamArr[i] != null) {
                Renderer renderer = this.f3024a;
                if (renderer.n() == sampleStreamArr[i]) {
                    return renderer;
                }
                Renderer renderer2 = this.c;
                if (renderer2 != null && renderer2.n() == sampleStreamArr[i]) {
                    return renderer2;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(androidx.media3.exoplayer.MediaPeriodHolder r8, androidx.media3.exoplayer.Renderer r9) {
        /*
            r7 = this;
            r0 = 1
            if (r9 != 0) goto L4
            goto L53
        L4:
            androidx.media3.exoplayer.source.SampleStream[] r1 = r8.c
            int r2 = r7.b
            r1 = r1[r2]
            androidx.media3.exoplayer.source.SampleStream r3 = r9.n()
            if (r3 == 0) goto L53
            androidx.media3.exoplayer.source.SampleStream r3 = r9.n()
            if (r3 != r1) goto L42
            if (r1 == 0) goto L53
            boolean r1 = r9.f()
            if (r1 != 0) goto L53
            androidx.media3.exoplayer.MediaPeriodHolder r1 = r8.m
            androidx.media3.exoplayer.MediaPeriodInfo r3 = r8.g
            boolean r3 = r3.g
            if (r3 == 0) goto L42
            if (r1 == 0) goto L42
            boolean r3 = r1.e
            if (r3 == 0) goto L42
            boolean r3 = r9 instanceof androidx.media3.exoplayer.text.TextRenderer
            if (r3 != 0) goto L41
            boolean r3 = r9 instanceof androidx.media3.exoplayer.metadata.MetadataRenderer
            if (r3 != 0) goto L41
            long r3 = r9.o()
            long r5 = r1.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L42
            goto L53
        L41:
            return r0
        L42:
            androidx.media3.exoplayer.MediaPeriodHolder r8 = r8.m
            if (r8 == 0) goto L51
            androidx.media3.exoplayer.source.SampleStream[] r8 = r8.c
            r8 = r8[r2]
            androidx.media3.exoplayer.source.SampleStream r9 = r9.n()
            if (r8 != r9) goto L51
            goto L53
        L51:
            r8 = 0
            return r8
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.RendererHolder.d(androidx.media3.exoplayer.MediaPeriodHolder, androidx.media3.exoplayer.Renderer):boolean");
    }

    public final boolean e() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final boolean f() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return g(this.f3024a);
        }
        Renderer renderer = this.c;
        renderer.getClass();
        return renderer.getState() != 0;
    }

    public final boolean h(int i) {
        int i2 = this.d;
        int i3 = this.b;
        return ((i2 == 2 || i2 == 4) && i == i3) || (i2 == 3 && i != i3);
    }

    public final void i(boolean z) {
        if (z) {
            if (this.e) {
                this.f3024a.reset();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            Renderer renderer = this.c;
            renderer.getClass();
            renderer.reset();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(Renderer renderer, MediaPeriodHolder mediaPeriodHolder, TrackSelectorResult trackSelectorResult, DefaultMediaClock defaultMediaClock) {
        Renderer renderer2;
        int i;
        if (renderer == null || renderer.getState() == 0 || (renderer == (renderer2 = this.f3024a) && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (renderer == this.c && this.d == 3) {
            return 1;
        }
        SampleStream sampleStreamN = renderer.n();
        SampleStream[] sampleStreamArr = mediaPeriodHolder.c;
        int i2 = this.b;
        byte b = sampleStreamN != sampleStreamArr[i2];
        boolean zB = trackSelectorResult.b(i2);
        if (!zB || b != false) {
            if (!renderer.k()) {
                ExoTrackSelection exoTrackSelection = trackSelectorResult.c[i2];
                int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
                Format[] formatArr = new Format[length];
                for (int i3 = 0; i3 < length; i3++) {
                    exoTrackSelection.getClass();
                    formatArr[i3] = exoTrackSelection.i(i3);
                }
                SampleStream sampleStream = mediaPeriodHolder.c[i2];
                sampleStream.getClass();
                renderer.j(formatArr, sampleStream, mediaPeriodHolder.e(), mediaPeriodHolder.p, mediaPeriodHolder.g.f3014a);
                return 3;
            }
            if (!renderer.b()) {
                return 0;
            }
            a(renderer, defaultMediaClock);
            if (!zB || e()) {
                i(renderer == renderer2);
                return 1;
            }
        }
        return 1;
    }

    public final void k() {
        if (!g(this.f3024a)) {
            i(true);
        }
        Renderer renderer = this.c;
        if (renderer == null || renderer.getState() != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        Renderer renderer = this.f3024a;
        if (renderer.getState() == 1 && this.d != 4) {
            renderer.start();
            return;
        }
        Renderer renderer2 = this.c;
        if (renderer2 == null || renderer2.getState() != 1 || this.d == 3) {
            return;
        }
        renderer2.start();
    }
}
