package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class ByteArrayDataSource extends BaseDataSource {
    public Uri e;
    public int f;
    public int g;

    public interface UriResolver {
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        o(dataSpec);
        this.e = dataSpec.f2957a;
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.e = null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.e;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.g;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        Assertions.g(null);
        System.arraycopy(null, this.f, bArr, i, iMin);
        this.f += iMin;
        this.g -= iMin;
        m(iMin);
        return iMin;
    }
}
