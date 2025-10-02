package androidx.media3.exoplayer.text;

import androidx.media3.extractor.text.SimpleSubtitleDecoder;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleParser;

/* loaded from: classes2.dex */
final class DelegatingSubtitleDecoder extends SimpleSubtitleDecoder {
    public final SubtitleParser p;

    public DelegatingSubtitleDecoder(String str, SubtitleParser subtitleParser) {
        super(str);
        this.p = subtitleParser;
    }

    @Override // androidx.media3.extractor.text.SimpleSubtitleDecoder
    public final Subtitle n(byte[] bArr, int i, boolean z) {
        SubtitleParser subtitleParser = this.p;
        if (z) {
            subtitleParser.reset();
        }
        return subtitleParser.b(0, i, bArr);
    }
}
