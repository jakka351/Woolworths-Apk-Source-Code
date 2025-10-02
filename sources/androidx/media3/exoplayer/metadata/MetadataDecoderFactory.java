package androidx.media3.exoplayer.metadata;

import YU.a;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.media3.extractor.metadata.emsg.EventMessageDecoder;
import androidx.media3.extractor.metadata.icy.IcyDecoder;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import androidx.media3.extractor.metadata.scte35.SpliceInfoDecoder;

@UnstableApi
/* loaded from: classes2.dex */
public interface MetadataDecoderFactory {

    /* renamed from: a, reason: collision with root package name */
    public static final MetadataDecoderFactory f3115a = new AnonymousClass1();

    /* renamed from: androidx.media3.exoplayer.metadata.MetadataDecoderFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements MetadataDecoderFactory {
        public final SimpleMetadataDecoder a(Format format) {
            String str = format.n;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new AppInfoTableDecoder();
                    case "application/x-icy":
                        return new IcyDecoder();
                    case "application/id3":
                        return new Id3Decoder(null);
                    case "application/x-emsg":
                        return new EventMessageDecoder();
                    case "application/x-scte35":
                        return new SpliceInfoDecoder();
                }
            }
            throw new IllegalArgumentException(a.A("Attempted to create decoder for unsupported MIME type: ", str));
        }

        public final boolean b(Format format) {
            String str = format.n;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }
}
