package androidx.media3.extractor.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    public Subtitle h;
    public long i;

    @Override // androidx.media3.extractor.text.Subtitle
    public final long a(int i) {
        Subtitle subtitle = this.h;
        subtitle.getClass();
        return subtitle.a(i) + this.i;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int b() {
        Subtitle subtitle = this.h;
        subtitle.getClass();
        return subtitle.b();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final int c(long j) {
        Subtitle subtitle = this.h;
        subtitle.getClass();
        return subtitle.c(j - this.i);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public final List d(long j) {
        Subtitle subtitle = this.h;
        subtitle.getClass();
        return subtitle.d(j - this.i);
    }

    @Override // androidx.media3.decoder.DecoderOutputBuffer
    public final void l() {
        super.l();
        this.h = null;
    }
}
