package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public final class ResolvingDataSource implements DataSource {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2969a;

    public static final class Factory implements DataSource.Factory {
        @Override // androidx.media3.datasource.DataSource.Factory
        public final DataSource a() {
            throw null;
        }
    }

    public interface Resolver {
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) {
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        if (this.f2969a) {
            this.f2969a = false;
            throw null;
        }
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
        throw null;
    }
}
