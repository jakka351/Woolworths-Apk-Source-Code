package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

@UnstableApi
/* loaded from: classes2.dex */
public final class ContentDataSource extends BaseDataSource {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public static class ContentDataSourceException extends DataSourceException {
    }

    public ContentDataSource(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) throws IOException {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            try {
                Uri uri = dataSpec.f2957a;
                long j = dataSpec.g;
                long j2 = dataSpec.f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f = uriNormalizeScheme;
                o(dataSpec);
                boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
                ContentResolver contentResolver = this.e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uriNormalizeScheme), 2000);
                    } catch (IOException e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            i = 2005;
                        }
                        throw new ContentDataSourceException(e, i);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && j2 > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new ContentDataSourceException(null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.i = -1L;
                    } else {
                        long jPosition = size - channel.position();
                        this.i = jPosition;
                        if (jPosition < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.i = j3;
                    if (j3 < 0) {
                        throw new ContentDataSourceException(null, 2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.i;
                    this.i = j4 == -1 ? j : Math.min(j4, j);
                }
                this.j = true;
                p(dataSpec);
                return j != -1 ? j : this.i;
            } catch (ContentDataSourceException e2) {
                throw e2;
            }
        } catch (IOException e3) {
            e = e3;
            i = 2000;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        this.f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSourceException(e, 2000);
                    }
                } finally {
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        n();
                    }
                }
            } catch (Throwable th) {
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            n();
                        }
                        throw th;
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            n();
                        }
                    }
                } catch (IOException e2) {
                    throw new ContentDataSourceException(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new ContentDataSourceException(e3, 2000);
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
        long j = this.i;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new ContentDataSourceException(e, 2000);
                }
            }
            FileInputStream fileInputStream = this.h;
            int i3 = Util.f2928a;
            int i4 = fileInputStream.read(bArr, i, i2);
            if (i4 != -1) {
                long j2 = this.i;
                if (j2 != -1) {
                    this.i = j2 - i4;
                }
                m(i4);
                return i4;
            }
        }
        return -1;
    }
}
