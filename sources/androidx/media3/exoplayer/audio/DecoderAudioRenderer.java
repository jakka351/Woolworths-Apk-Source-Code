package androidx.media3.exoplayer.audio;

import android.os.SystemClock;
import android.os.Trace;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.Decoder;
import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoderOutputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.MediaClock;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.common.collect.ImmutableList;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class DecoderAudioRenderer<T extends Decoder<DecoderInputBuffer, ? extends SimpleDecoderOutputBuffer, ? extends DecoderException>> extends BaseRenderer implements MediaClock {
    public int A;
    public long B;
    public DecoderCounters u;
    public Format v;
    public Decoder w;
    public SimpleDecoderOutputBuffer x;
    public DrmSession y;
    public DrmSession z;

    @RequiresApi
    public static final class Api23 {
    }

    public final class AudioSinkListener implements AudioSink.Listener {
        @Override // androidx.media3.exoplayer.audio.AudioSink.Listener
        public final void b(AudioSink.AudioTrackConfig audioTrackConfig) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long A() {
        if (this.k != 2) {
            throw null;
        }
        throw null;
    }

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
            r3.v = r0
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.B = r1
            androidx.media3.exoplayer.drm.DrmSession r1 = r3.z     // Catch: java.lang.Throwable -> L15
            androidx.media3.exoplayer.drm.DrmSession.b(r1, r0)     // Catch: java.lang.Throwable -> L15
            r3.z = r0     // Catch: java.lang.Throwable -> L15
            r3.R()     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L15:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.DecoderAudioRenderer.E():void");
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void F(boolean z, boolean z2) {
        this.u = new DecoderCounters();
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void G(long j, boolean z) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void J() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void K() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void L(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        if (this.B != -9223372036854775807L) {
            throw null;
        }
        this.B = j2;
        if (j2 != -9223372036854775807L) {
            throw null;
        }
    }

    public abstract Decoder N();

    public final void O() throws ExoPlaybackException {
        if (this.x == null) {
            SimpleDecoderOutputBuffer simpleDecoderOutputBuffer = (SimpleDecoderOutputBuffer) this.w.a();
            this.x = simpleDecoderOutputBuffer;
            if (simpleDecoderOutputBuffer == null) {
                return;
            }
            int i = simpleDecoderOutputBuffer.f;
            if (i > 0) {
                this.u.f += i;
                throw null;
            }
            if (simpleDecoderOutputBuffer.f(134217728)) {
                throw null;
            }
        }
        if (this.x.f(4)) {
            if (this.A != 2) {
                this.x.getClass();
                throw null;
            }
            R();
            Q();
            return;
        }
        Format.Builder builderA = P().a();
        builderA.F = 0;
        builderA.G = 0;
        Format format = this.v;
        builderA.k = format.l;
        builderA.f2855a = format.f2854a;
        builderA.b = format.b;
        builderA.c = ImmutableList.o(format.c);
        Format format2 = this.v;
        builderA.d = format2.d;
        builderA.e = format2.e;
        builderA.f = format2.f;
        builderA.a();
        throw null;
    }

    public abstract Format P();

    public final void Q() throws ExoPlaybackException {
        if (this.w != null) {
            return;
        }
        DrmSession drmSession = this.z;
        DrmSession.b(this.y, drmSession);
        this.y = drmSession;
        if (drmSession != null && drmSession.d() == null && this.y.c() == null) {
            return;
        }
        try {
            SystemClock.elapsedRealtime();
            Trace.beginSection("createAudioDecoder");
            Decoder decoderN = N();
            this.w = decoderN;
            decoderN.c(this.o);
            Trace.endSection();
            SystemClock.elapsedRealtime();
            this.w.getClass();
            throw null;
        } catch (DecoderException e) {
            Log.d("DecoderAudioRenderer", "Audio codec error", e);
            throw null;
        } catch (OutOfMemoryError e2) {
            throw D(e2, this.v, false, 4001);
        }
    }

    public final void R() {
        this.x = null;
        this.A = 0;
        Decoder decoder = this.w;
        if (decoder == null) {
            DrmSession.b(this.y, null);
            this.y = null;
        } else {
            this.u.b++;
            decoder.release();
            this.w.getClass();
            throw null;
        }
    }

    public abstract int S();

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        if (!MimeTypes.i(format.n)) {
            return RendererCapabilities.g(0, 0, 0, 0);
        }
        int iS = S();
        return iS <= 2 ? RendererCapabilities.g(iS, 0, 0, 0) : iS | 168;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean b() {
        return false;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void c(PlaybackParameters playbackParameters) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters d() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final boolean h() {
        return false;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void i(int i, Object obj) {
        if (i == 2) {
            ((Float) obj).getClass();
            throw null;
        }
        if (i == 3) {
            throw null;
        }
        if (i == 6) {
            throw null;
        }
        if (i == 12) {
            if (Util.f2928a < 23) {
                return;
            }
            throw null;
        }
        if (i == 9) {
            ((Boolean) obj).getClass();
            throw null;
        }
        if (i != 10) {
            return;
        }
        ((Integer) obj).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void m(long j, long j2) throws ExoPlaybackException {
        if (this.v == null) {
            this.f.a();
            throw null;
        }
        Q();
        if (this.w != null) {
            try {
                Trace.beginSection("drainAndFeed");
                O();
                Trace.endSection();
                synchronized (this.u) {
                }
            } catch (DecoderException e) {
                Log.d("DecoderAudioRenderer", "Audio codec error", e);
                throw null;
            } catch (AudioSink.ConfigurationException e2) {
                throw D(e2, e2.d, false, 5001);
            } catch (AudioSink.InitializationException e3) {
                throw D(e3, e3.f, e3.e, 5001);
            } catch (AudioSink.WriteException e4) {
                throw D(e4, e4.f, e4.e, 5002);
            }
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final MediaClock q() {
        return this;
    }
}
