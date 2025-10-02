package androidx.media3.extractor.metadata;

import androidx.media3.common.Metadata;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.nio.ByteBuffer;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class SimpleMetadataDecoder implements MetadataDecoder {
    @Override // androidx.media3.extractor.metadata.MetadataDecoder
    public final Metadata a(MetadataInputBuffer metadataInputBuffer) {
        ByteBuffer byteBuffer = metadataInputBuffer.g;
        byteBuffer.getClass();
        Assertions.b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return b(metadataInputBuffer, byteBuffer);
    }

    public abstract Metadata b(MetadataInputBuffer metadataInputBuffer, ByteBuffer byteBuffer);
}
