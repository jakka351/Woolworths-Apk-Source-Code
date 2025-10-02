package androidx.media3.extractor;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.id3.Id3Decoder;
import java.io.EOFException;

@UnstableApi
/* loaded from: classes2.dex */
public final class Id3Peeker {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3244a = new ParsableByteArray(10);

    public final Metadata a(ExtractorInput extractorInput, Id3Decoder.FramePredicate framePredicate) throws Throwable {
        ParsableByteArray parsableByteArray = this.f3244a;
        Metadata metadataC = null;
        int i = 0;
        while (true) {
            try {
                extractorInput.b(0, 10, parsableByteArray.f2922a);
                parsableByteArray.G(0);
                if (parsableByteArray.x() != 4801587) {
                    break;
                }
                parsableByteArray.H(3);
                int iT = parsableByteArray.t();
                int i2 = iT + 10;
                if (metadataC == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(parsableByteArray.f2922a, 0, bArr, 0, 10);
                    extractorInput.b(10, iT, bArr);
                    metadataC = new Id3Decoder(framePredicate).c(i2, bArr);
                } else {
                    extractorInput.k(iT);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        extractorInput.i();
        extractorInput.k(i);
        return metadataC;
    }
}
