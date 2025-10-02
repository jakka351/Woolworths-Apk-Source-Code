package androidx.media3.exoplayer.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleDecoder;
import androidx.media3.extractor.text.SubtitleParser;
import androidx.media3.extractor.text.cea.Cea608Decoder;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public interface SubtitleDecoderFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final SubtitleDecoderFactory f3161a = new SubtitleDecoderFactory() { // from class: androidx.media3.exoplayer.text.SubtitleDecoderFactory.1
        public final DefaultSubtitleParserFactory b = new DefaultSubtitleParserFactory();

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public final boolean a(Format format) {
            String str = format.n;
            return this.b.a(format) || Objects.equals(str, "application/cea-608") || Objects.equals(str, "application/x-mp4-cea-608") || Objects.equals(str, "application/cea-708");
        }

        @Override // androidx.media3.exoplayer.text.SubtitleDecoderFactory
        public final SubtitleDecoder b(Format format) {
            String str = format.n;
            int i = format.I;
            if (str != null) {
                switch (str) {
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new Cea608Decoder(str, i);
                    case "application/cea-708":
                        return new Cea708Decoder(i, format.q);
                }
            }
            DefaultSubtitleParserFactory defaultSubtitleParserFactory = this.b;
            if (!defaultSubtitleParserFactory.a(format)) {
                throw new IllegalArgumentException(YU.a.A("Attempted to create decoder for unsupported MIME type: ", str));
            }
            SubtitleParser subtitleParserC = defaultSubtitleParserFactory.c(format);
            return new DelegatingSubtitleDecoder(subtitleParserC.getClass().getSimpleName().concat("Decoder"), subtitleParserC);
        }
    };

    boolean a(Format format);

    SubtitleDecoder b(Format format);
}
