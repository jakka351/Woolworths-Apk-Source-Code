package androidx.media3.datasource;

import android.net.Uri;
import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;

@RequiresApi
@UnstableApi
/* loaded from: classes2.dex */
public class MediaDataSourceAdapter extends BaseDataSource {
    public Uri e;

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        this.e = dataSpec.f2957a;
        o(dataSpec);
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
        throw null;
    }
}
