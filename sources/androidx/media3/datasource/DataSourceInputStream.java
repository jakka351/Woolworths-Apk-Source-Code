package androidx.media3.datasource;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import java.io.InputStream;

@UnstableApi
/* loaded from: classes2.dex */
public final class DataSourceInputStream extends InputStream {
    public final DataSource d;
    public final DataSpec e;
    public boolean g = false;
    public boolean h = false;
    public final byte[] f = new byte[1];

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
        this.d = dataSource;
        this.e = dataSpec;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.h) {
            return;
        }
        this.d.close();
        this.h = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        Assertions.f(!this.h);
        boolean z = this.g;
        DataSource dataSource = this.d;
        if (!z) {
            dataSource.a(this.e);
            this.g = true;
        }
        int i3 = dataSource.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
