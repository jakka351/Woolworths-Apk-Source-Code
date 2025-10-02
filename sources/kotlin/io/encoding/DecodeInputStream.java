package kotlin.io.encoding;

import YU.a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalEncodingApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DecodeInputStream extends InputStream {
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        read(null, 0, 1);
        throw null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] destination, int i, int i2) throws IOException {
        Intrinsics.h(destination, "destination");
        if (i >= 0 && i2 >= 0 && i + i2 <= destination.length) {
            throw new IOException("The input stream is closed.");
        }
        StringBuilder sbQ = a.q(i, i2, "offset: ", ", length: ", ", buffer size: ");
        sbQ.append(destination.length);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }
}
