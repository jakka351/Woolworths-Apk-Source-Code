package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.medallia.digital.mobilesdk.q2;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class RawResourceDataSource extends BaseDataSource {
    public final Context e;
    public DataSpec f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public static class RawResourceDataSourceException extends DataSourceException {
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // androidx.media3.datasource.DataSource
    public final long a(DataSpec dataSpec) throws DataSourceException, Resources.NotFoundException, PackageManager.NameNotFoundException, NumberFormatException {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        this.f = dataSpec;
        o(dataSpec);
        Uri uri = dataSpec.f2957a;
        long j = dataSpec.g;
        long j2 = dataSpec.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new RawResourceDataSourceException(2000, null, "rawresource:// URI must have exactly one path element, found " + pathSegments.size());
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, null, "Resource identifier must be an integer.");
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new RawResourceDataSourceException(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, null, "Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.");
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith(q2.c)) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new RawResourceDataSourceException(2005, e, "Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.");
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new RawResourceDataSourceException(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, null, "Resource identifier must be an integer.");
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(androidx.camera.core.impl.b.o(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new RawResourceDataSourceException(2005, null, "Resource not found.");
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new RawResourceDataSourceException(2000, null, android.support.v4.media.session.a.m(uriNormalizeScheme, "Resource is compressed: "));
            }
            this.g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
            this.h = fileInputStream;
            try {
                if (length != -1 && j2 > length) {
                    throw new RawResourceDataSourceException(2008, null, null);
                }
                long startOffset = this.g.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new RawResourceDataSourceException(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.i = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.i = size;
                        if (size < 0) {
                            throw new RawResourceDataSourceException(2008, null, null);
                        }
                    }
                } else {
                    long j3 = length - jSkip;
                    this.i = j3;
                    if (j3 < 0) {
                        throw new DataSourceException(2008);
                    }
                }
                if (j != -1) {
                    long j4 = this.i;
                    this.i = j4 == -1 ? j : Math.min(j4, j);
                }
                this.j = true;
                p(dataSpec);
                return j != -1 ? j : this.i;
            } catch (RawResourceDataSourceException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException(2000, e3, null);
            }
        } catch (Resources.NotFoundException e4) {
            throw new RawResourceDataSourceException(2005, e4, null);
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
                        throw new RawResourceDataSourceException(2000, e, null);
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
                    throw new RawResourceDataSourceException(2000, e2, null);
                }
            }
        } catch (IOException e3) {
            throw new RawResourceDataSourceException(2000, e3, null);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        DataSpec dataSpec = this.f;
        if (dataSpec != null) {
            return dataSpec.f2957a;
        }
        return null;
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
                    throw new RawResourceDataSourceException(2000, e, null);
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
            if (this.i != -1) {
                throw new RawResourceDataSourceException(2000, new EOFException(), "End of stream reached having not read sufficient data.");
            }
        }
        return -1;
    }
}
