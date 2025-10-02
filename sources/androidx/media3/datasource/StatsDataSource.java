package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.util.Collections;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class StatsDataSource implements DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final DataSource f2970a;
    public long b;
    public Uri c;
    public Map d;

    public StatsDataSource(DataSource dataSource) {
        dataSource.getClass();
        this.f2970a = dataSource;
        this.c = Uri.EMPTY;
        this.d = Collections.EMPTY_MAP;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        DataSource dataSource = this.f2970a;
        this.c = dataSpec.f2957a;
        this.d = Collections.EMPTY_MAP;
        try {
            return dataSource.a(dataSpec);
        } finally {
            Uri uri = dataSource.getUri();
            if (uri != null) {
                this.c = uri;
            }
            this.d = dataSource.d();
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f2970a.close();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map d() {
        return this.f2970a.d();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void g(TransferListener transferListener) {
        transferListener.getClass();
        this.f2970a.g(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f2970a.getUri();
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f2970a.read(bArr, i, i2);
        if (i3 != -1) {
            this.b += i3;
        }
        return i3;
    }
}
