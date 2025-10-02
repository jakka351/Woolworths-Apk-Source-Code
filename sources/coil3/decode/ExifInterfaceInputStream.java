package coil3.decode;

import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/decode/ExifInterfaceInputStream;", "Ljava/io/InputStream;", "coil-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ExifInterfaceInputStream extends InputStream {
    public final InputStream d;
    public int e = 1073741824;

    public ExifInterfaceInputStream(InputStream inputStream) {
        this.d = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.e;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.d.read();
        if (i == -1) {
            this.e = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.d.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i = this.d.read(bArr);
        if (i == -1) {
            this.e = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d.read(bArr, i, i2);
        if (i3 == -1) {
            this.e = 0;
        }
        return i3;
    }
}
