package androidx.media3.exoplayer.text;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.BaseRenderer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.extractor.text.CueDecoder;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleInputBuffer;
import androidx.media3.extractor.text.SubtitleOutputBuffer;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class TextRenderer extends BaseRenderer implements Handler.Callback {
    public SubtitleDecoder A;
    public SubtitleInputBuffer B;
    public SubtitleOutputBuffer C;
    public SubtitleOutputBuffer D;
    public int E;
    public final Handler F;
    public final TextOutput G;
    public final FormatHolder H;
    public boolean I;
    public boolean J;
    public Format K;
    public long L;
    public long M;
    public IOException N;
    public final CueDecoder u;
    public final DecoderInputBuffer v;
    public CuesResolver w;
    public final SubtitleDecoderFactory x;
    public boolean y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRenderer(TextOutput textOutput, Looper looper) {
        super(3);
        SubtitleDecoderFactory subtitleDecoderFactory = SubtitleDecoderFactory.f3161a;
        this.G = textOutput;
        this.F = looper == null ? null : new Handler(looper, this);
        this.x = subtitleDecoderFactory;
        this.u = new CueDecoder();
        this.v = new DecoderInputBuffer(1);
        this.H = new FormatHolder();
        this.M = -9223372036854775807L;
        this.L = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void E() {
        this.K = null;
        this.M = -9223372036854775807L;
        O();
        this.L = -9223372036854775807L;
        if (this.A != null) {
            R();
            SubtitleDecoder subtitleDecoder = this.A;
            subtitleDecoder.getClass();
            subtitleDecoder.release();
            this.A = null;
            this.z = 0;
        }
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void G(long j, boolean z) {
        this.L = j;
        CuesResolver cuesResolver = this.w;
        if (cuesResolver != null) {
            cuesResolver.clear();
        }
        O();
        this.I = false;
        this.J = false;
        this.M = -9223372036854775807L;
        Format format = this.K;
        if (format == null || Objects.equals(format.n, "application/x-media3-cues")) {
            return;
        }
        if (this.z == 0) {
            R();
            SubtitleDecoder subtitleDecoder = this.A;
            subtitleDecoder.getClass();
            subtitleDecoder.flush();
            subtitleDecoder.c(this.o);
            return;
        }
        R();
        SubtitleDecoder subtitleDecoder2 = this.A;
        subtitleDecoder2.getClass();
        subtitleDecoder2.release();
        this.A = null;
        this.z = 0;
        this.y = true;
        Format format2 = this.K;
        format2.getClass();
        SubtitleDecoder subtitleDecoderB = this.x.b(format2);
        this.A = subtitleDecoderB;
        subtitleDecoderB.c(this.o);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void L(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        Format format = formatArr[0];
        this.K = format;
        if (Objects.equals(format.n, "application/x-media3-cues")) {
            this.w = this.K.J == 1 ? new MergingCuesResolver() : new ReplacingCuesResolver();
            return;
        }
        N();
        if (this.A != null) {
            this.z = 1;
            return;
        }
        this.y = true;
        Format format2 = this.K;
        format2.getClass();
        SubtitleDecoder subtitleDecoderB = this.x.b(format2);
        this.A = subtitleDecoderB;
        subtitleDecoderB.c(this.o);
    }

    public final void N() {
        Assertions.e("Legacy decoding is disabled, can't handle " + this.K.n + " samples (expected application/x-media3-cues).", Objects.equals(this.K.n, "application/cea-608") || Objects.equals(this.K.n, "application/x-mp4-cea-608") || Objects.equals(this.K.n, "application/cea-708"));
    }

    public final void O() {
        ImmutableList immutableListT = ImmutableList.t();
        Q(this.L);
        CueGroup cueGroup = new CueGroup(immutableListT);
        Handler handler = this.F;
        if (handler != null) {
            handler.obtainMessage(1, cueGroup).sendToTarget();
            return;
        }
        ImmutableList immutableList = cueGroup.f2898a;
        TextOutput textOutput = this.G;
        textOutput.q(immutableList);
        textOutput.t(cueGroup);
    }

    public final long P() {
        if (this.E == -1) {
            return Long.MAX_VALUE;
        }
        this.C.getClass();
        if (this.E >= this.C.b()) {
            return Long.MAX_VALUE;
        }
        return this.C.a(this.E);
    }

    public final long Q(long j) {
        Assertions.f(j != -9223372036854775807L);
        return j - this.n;
    }

    public final void R() {
        this.B = null;
        this.E = -1;
        SubtitleOutputBuffer subtitleOutputBuffer = this.C;
        if (subtitleOutputBuffer != null) {
            subtitleOutputBuffer.m();
            this.C = null;
        }
        SubtitleOutputBuffer subtitleOutputBuffer2 = this.D;
        if (subtitleOutputBuffer2 != null) {
            subtitleOutputBuffer2.m();
            this.D = null;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities
    public final int a(Format format) {
        if (Objects.equals(format.n, "application/x-media3-cues") || this.x.a(format)) {
            return RendererCapabilities.g(format.M == 0 ? 4 : 2, 0, 0, 0);
        }
        return MimeTypes.k(format.n) ? RendererCapabilities.g(1, 0, 0, 0) : RendererCapabilities.g(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean b() {
        return this.J;
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        CueGroup cueGroup = (CueGroup) message.obj;
        ImmutableList immutableList = cueGroup.f2898a;
        TextOutput textOutput = this.G;
        textOutput.q(immutableList);
        textOutput.t(cueGroup);
        return true;
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        if (this.K != null) {
            if (this.N == null) {
                try {
                    w();
                } catch (IOException e) {
                    this.N = e;
                }
            }
            if (this.N != null) {
                Format format = this.K;
                format.getClass();
                if (Objects.equals(format.n, "application/x-media3-cues")) {
                    CuesResolver cuesResolver = this.w;
                    cuesResolver.getClass();
                    return cuesResolver.b(this.L) != Long.MIN_VALUE;
                }
                if (!this.J) {
                    if (this.I) {
                        SubtitleOutputBuffer subtitleOutputBuffer = this.C;
                        long j = this.L;
                        if (subtitleOutputBuffer == null || subtitleOutputBuffer.a(subtitleOutputBuffer.b() - 1) <= j) {
                            SubtitleOutputBuffer subtitleOutputBuffer2 = this.D;
                            long j2 = this.L;
                            if ((subtitleOutputBuffer2 == null || subtitleOutputBuffer2.a(subtitleOutputBuffer2.b() - 1) <= j2) && this.B != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01dd  */
    @Override // androidx.media3.exoplayer.Renderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(long r21, long r23) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.TextRenderer.m(long, long):void");
    }
}
