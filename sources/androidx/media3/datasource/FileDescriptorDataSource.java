package androidx.media3.datasource;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

@UnstableApi
/* loaded from: classes2.dex */
public class FileDescriptorDataSource extends BaseDataSource {
    public static final Set i = Collections.newSetFromMap(new ConcurrentHashMap());
    public Uri e;
    public FileInputStream f;
    public long g;
    public boolean h;

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) throws DataSourceException, ErrnoException {
        try {
            Uri uri = dataSpec.f2957a;
            long j = dataSpec.g;
            long j2 = dataSpec.f;
            this.e = uri;
            o(dataSpec);
            if (!i.add(null)) {
                throw new DataSourceException(new IllegalStateException("Attempted to re-use an already in-use file descriptor"), -2);
            }
            if (j2 > 0) {
                throw new DataSourceException(2008);
            }
            try {
                Os.lseek(null, j2, OsConstants.SEEK_SET);
                this.f = new FileInputStream((FileDescriptor) null);
                long j3 = 0 - j2;
                this.g = j3;
                if (j3 < 0) {
                    throw new DataSourceException(2008);
                }
                if (j != -1) {
                    this.g = j3 == -1 ? j : Math.min(j3, j);
                }
                this.h = true;
                p(dataSpec);
                return j != -1 ? j : this.g;
            } catch (ErrnoException e) {
                throw new DataSourceException(e, 2000);
            }
        } catch (DataSourceException e2) {
            throw e2;
        } catch (IOException e3) {
            throw new DataSourceException(e3, e3 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.e = null;
        i.remove(null);
        try {
            try {
                FileInputStream fileInputStream = this.f;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new DataSourceException(e, 2000);
            }
        } finally {
            this.f = null;
            if (this.h) {
                this.h = false;
                n();
            }
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        return this.e;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j = this.g;
        if (j != 0) {
            if (j != -1) {
                i3 = (int) Math.min(j, i3);
            }
            try {
                FileInputStream fileInputStream = this.f;
                int i4 = Util.f2928a;
                int i5 = fileInputStream.read(bArr, i2, i3);
                if (i5 != -1) {
                    long j2 = this.g;
                    if (j2 != -1) {
                        this.g = j2 - i5;
                    }
                    m(i5);
                    return i5;
                }
            } catch (IOException e) {
                throw new DataSourceException(e, 2000);
            }
        }
        return -1;
    }
}
