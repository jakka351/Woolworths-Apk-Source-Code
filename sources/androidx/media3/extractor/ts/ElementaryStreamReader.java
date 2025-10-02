package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ts.TsPayloadReader;

@UnstableApi
/* loaded from: classes2.dex */
public interface ElementaryStreamReader {
    void a(ParsableByteArray parsableByteArray);

    void b();

    void c(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator);

    void d(int i, long j);

    void e(boolean z);
}
