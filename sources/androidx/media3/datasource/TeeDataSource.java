package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class TeeDataSource implements DataSource {

    /* renamed from: a, reason: collision with root package name */
    public final DataSource f2971a;
    public final DataSink b;
    public boolean c;
    public long d;

    public TeeDataSource(DataSource dataSource, DataSink dataSink) {
        this.f2971a = dataSource;
        dataSink.getClass();
        this.b = dataSink;
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        long jA = this.f2971a.a(dataSpec);
        this.d = jA;
        if (jA == 0) {
            return 0L;
        }
        long j = dataSpec.g;
        if (j == -1 && jA != -1 && j != jA) {
            dataSpec = new DataSpec(dataSpec.f2957a, dataSpec.b, dataSpec.c, dataSpec.d, dataSpec.e, dataSpec.f, jA, dataSpec.h, dataSpec.i);
        }
        this.c = true;
        this.b.a(dataSpec);
        return this.d;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        DataSink dataSink = this.b;
        try {
            this.f2971a.close();
        } finally {
            if (this.c) {
                this.c = false;
                dataSink.close();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map d() {
        return this.f2971a.d();
    }

    @Override // androidx.media3.datasource.DataSource
    public final void g(TransferListener transferListener) {
        transferListener.getClass();
        this.f2971a.g(transferListener);
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f2971a.getUri();
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.f2971a.read(bArr, i, i2);
        if (i3 > 0) {
            this.b.write(bArr, i, i3);
            long j = this.d;
            if (j != -1) {
                this.d = j - i3;
            }
        }
        return i3;
    }
}
