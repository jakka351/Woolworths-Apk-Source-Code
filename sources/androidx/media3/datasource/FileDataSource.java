package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

@UnstableApi
/* loaded from: classes2.dex */
public final class FileDataSource extends BaseDataSource {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean h;

    public static final class Factory implements DataSource.Factory {
        @Override // androidx.media3.datasource.DataSource.Factory
        public final DataSource a() {
            return new FileDataSource(false);
        }
    }

    public static class FileDataSourceException extends DataSourceException {
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) throws IOException {
        Uri uri = dataSpec.f2957a;
        long j = dataSpec.f;
        this.f = uri;
        o(dataSpec);
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = dataSpec.g;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new FileDataSourceException(2008, null, null);
                }
                this.h = true;
                p(dataSpec);
                return this.g;
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment2 = uri.getFragment();
            StringBuilder sbV = YU.a.v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbV.append(fragment2);
            throw new FileDataSourceException(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, e2, sbV.toString());
        } catch (SecurityException e3) {
            throw new FileDataSourceException(e3, 2006);
        } catch (RuntimeException e4) {
            throw new FileDataSourceException(e4, 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new FileDataSourceException(e, 2000);
            }
        } finally {
            this.e = null;
            if (this.h) {
                this.h = false;
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
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            int i3 = Util.f2928a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.g -= i4;
                m(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new FileDataSourceException(e, 2000);
        }
    }
}
