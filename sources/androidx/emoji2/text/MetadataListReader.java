package androidx.emoji2.text;

import androidx.annotation.AnyThread;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import org.bouncycastle.crypto.hpke.HPKE;

@AnyThread
@RequiresApi
@RestrictTo
/* loaded from: classes2.dex */
class MetadataListReader {

    public static class ByteBufferReader implements OpenTypeReader {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f2710a;

        public ByteBufferReader(ByteBuffer byteBuffer) {
            this.f2710a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public final void a(int i) {
            ByteBuffer byteBuffer = this.f2710a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    public static class InputStreamOpenTypeReader implements OpenTypeReader {
    }

    public static class OffsetInfo {
    }

    public interface OpenTypeReader {
    }

    public static MetadataList a(MappedByteBuffer mappedByteBuffer) throws IOException {
        ByteBuffer byteBuffer;
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        ByteBufferReader byteBufferReader = new ByteBufferReader(byteBufferDuplicate);
        byteBufferReader.a(4);
        int i = byteBufferDuplicate.getShort() & HPKE.aead_EXPORT_ONLY;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferReader.a(6);
        int i2 = 0;
        while (true) {
            byteBuffer = byteBufferReader.f2710a;
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBuffer.getInt();
            byteBufferReader.a(4);
            j = byteBuffer.getInt() & 4294967295L;
            byteBufferReader.a(4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferReader.a((int) (j - byteBuffer.position()));
            byteBufferReader.a(12);
            long j2 = byteBuffer.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBuffer.getInt();
                long j3 = byteBuffer.getInt() & 4294967295L;
                byteBuffer.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    MetadataList metadataList = new MetadataList();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    metadataList.b = byteBufferDuplicate;
                    metadataList.f2719a = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    metadataList.c = i6;
                    metadataList.d = metadataList.b.getShort(i6);
                    return metadataList;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }
}
