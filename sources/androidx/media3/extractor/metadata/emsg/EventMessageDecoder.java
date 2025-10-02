package androidx.media3.extractor.metadata.emsg;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.metadata.MetadataInputBuffer;
import androidx.media3.extractor.metadata.SimpleMetadataDecoder;
import java.nio.ByteBuffer;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class EventMessageDecoder extends SimpleMetadataDecoder {
    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    public final Metadata b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(byteBuffer.array(), byteBuffer.limit());
        String strP = parsableByteArray.p();
        strP.getClass();
        String strP2 = parsableByteArray.p();
        strP2.getClass();
        return new Metadata(new EventMessage(strP, strP2, parsableByteArray.o(), parsableByteArray.o(), Arrays.copyOfRange(parsableByteArray.f2922a, parsableByteArray.b, parsableByteArray.c)));
    }
}
