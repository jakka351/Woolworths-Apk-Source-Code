package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ExtractorsFactory;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.mp3.Mp3Extractor;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.EOFException;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class BundledExtractorsAdapter implements ProgressiveMediaExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final ExtractorsFactory f3119a;
    public Extractor b;
    public DefaultExtractorInput c;

    public BundledExtractorsAdapter(ExtractorsFactory extractorsFactory) {
        this.f3119a = extractorsFactory;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void a(long j, long j2) {
        Extractor extractor = this.b;
        extractor.getClass();
        extractor.a(j, j2);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final long b() {
        DefaultExtractorInput defaultExtractorInput = this.c;
        if (defaultExtractorInput != null) {
            return defaultExtractorInput.d;
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void c(DataSource dataSource, Uri uri, Map map, long j, long j2, ExtractorOutput extractorOutput) throws UnrecognizedInputFormatException {
        DefaultExtractorInput defaultExtractorInput = new DefaultExtractorInput(dataSource, j, j2);
        this.c = defaultExtractorInput;
        if (this.b != null) {
            return;
        }
        Extractor[] extractorArrB = this.f3119a.b(uri, map);
        ImmutableList.Builder builderN = ImmutableList.n(extractorArrB.length);
        boolean z = true;
        if (extractorArrB.length == 1) {
            this.b = extractorArrB[0];
        } else {
            int length = extractorArrB.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Extractor extractor = extractorArrB[i];
                try {
                } catch (EOFException unused) {
                    if (this.b != null || defaultExtractorInput.d == j) {
                    }
                } catch (Throwable th) {
                    if (this.b == null && defaultExtractorInput.d != j) {
                        z = false;
                    }
                    Assertions.f(z);
                    defaultExtractorInput.f = 0;
                    throw th;
                }
                if (extractor.i(defaultExtractorInput)) {
                    this.b = extractor;
                    defaultExtractorInput.f = 0;
                    break;
                } else {
                    builderN.f(extractor.e());
                    boolean z2 = this.b != null || defaultExtractorInput.d == j;
                    Assertions.f(z2);
                    defaultExtractorInput.f = 0;
                    i++;
                }
            }
            if (this.b == null) {
                String str = "None of the available extractors (" + new Joiner(", ").c(Lists.d(ImmutableList.q(extractorArrB), new l(1))) + ") could read the stream.";
                uri.getClass();
                ImmutableList immutableListJ = builderN.j();
                UnrecognizedInputFormatException unrecognizedInputFormatException = new UnrecognizedInputFormatException(str, null, false, 1);
                ImmutableList.o(immutableListJ);
                throw unrecognizedInputFormatException;
            }
        }
        this.b.j(extractorOutput);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void d() {
        Extractor extractor = this.b;
        if (extractor == null) {
            return;
        }
        Extractor extractorC = extractor.c();
        if (extractorC instanceof Mp3Extractor) {
            ((Mp3Extractor) extractorC).q = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final int e(PositionHolder positionHolder) {
        Extractor extractor = this.b;
        extractor.getClass();
        DefaultExtractorInput defaultExtractorInput = this.c;
        defaultExtractorInput.getClass();
        return extractor.f(defaultExtractorInput, positionHolder);
    }

    @Override // androidx.media3.exoplayer.source.ProgressiveMediaExtractor
    public final void release() {
        Extractor extractor = this.b;
        if (extractor != null) {
            extractor.release();
            this.b = null;
        }
        this.c = null;
    }
}
