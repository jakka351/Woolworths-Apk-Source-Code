package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class AesCipherDataSource implements DataSource {
    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map d() {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void g(TransferListener transferListener) {
        transferListener.getClass();
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        throw null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        throw null;
    }
}
