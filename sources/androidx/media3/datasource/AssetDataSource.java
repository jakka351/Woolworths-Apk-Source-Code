package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.medallia.digital.mobilesdk.q2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

@UnstableApi
/* loaded from: classes2.dex */
public final class AssetDataSource extends BaseDataSource {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public static final class AssetDataSourceException extends DataSourceException {
    }

    public AssetDataSource(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) throws IOException {
        try {
            Uri uri = dataSpec.f2957a;
            long j = dataSpec.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(q2.c)) {
                path = path.substring(1);
            }
            o(dataSpec);
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new AssetDataSourceException(null, 2008);
            }
            long j2 = dataSpec.g;
            if (j2 != -1) {
                this.h = j2;
            } else {
                long jAvailable = this.g.available();
                this.h = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            p(dataSpec);
            return this.h;
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            throw new AssetDataSourceException(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                n();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.f;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new AssetDataSourceException(e, 2000);
                }
            }
            InputStream inputStream = this.g;
            int i3 = Util.f2928a;
            int i4 = inputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.h;
                if (j2 != -1) {
                    this.h = j2 - i4;
                }
                m(i4);
                return i4;
            }
        }
        return -1;
    }
}
