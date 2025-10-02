package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.medallia.digital.mobilesdk.q2;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzgw extends zzfs {
    private final Context zza;

    @Nullable
    private zzge zzb;

    @Nullable
    private AssetFileDescriptor zzc;

    @Nullable
    private InputStream zzd;
    private long zze;
    private boolean zzf;

    public zzgw(Context context) {
        super(false);
        this.zza = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 15);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    private static AssetFileDescriptor zzk(Context context, zzge zzgeVar) throws zzgv, Resources.NotFoundException, PackageManager.NameNotFoundException {
        Resources resourcesForApplication;
        int identifier;
        Uri uriNormalizeScheme = zzgeVar.zza.normalizeScheme();
        if (TextUtils.equals("rawresource", uriNormalizeScheme.getScheme())) {
            resourcesForApplication = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                int size = pathSegments.size();
                throw new zzgv(YU.a.n(new StringBuilder(String.valueOf(size).length() + 61), "rawresource:// URI must have exactly one path element, found ", size));
            }
            identifier = zzl(pathSegments.get(0));
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                String scheme = uriNormalizeScheme.getScheme();
                throw new zzgv(YU.a.p(new StringBuilder(String.valueOf(scheme).length() + 62), "Unsupported URI scheme (", scheme, "). Only android.resource is supported."), null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
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
                    throw new zzgv("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                identifier = zzl(path);
            } else {
                identifier = resourcesForApplication.getIdentifier(YU.a.p(new StringBuilder(packageName.length() + 1 + path.length()), packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new zzgv("Resource not found.", null, 2005);
                }
            }
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resourcesForApplication.openRawResourceFd(identifier);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                return assetFileDescriptorOpenRawResourceFd;
            }
            throw new zzgv("Resource is compressed: ".concat(String.valueOf(uriNormalizeScheme)), null, 2000);
        } catch (Resources.NotFoundException e2) {
            throw new zzgv(null, e2, 2005);
        }
    }

    private static int zzl(String str) throws zzgv {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new zzgv("Resource identifier must be an integer.", null, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zze;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new zzgv(null, e, 2000);
            }
        }
        InputStream inputStream = this.zzd;
        String str = zzeo.zza;
        int i3 = inputStream.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.zze == -1) {
                return -1;
            }
            throw new zzgv("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.zze;
        if (j2 != -1) {
            this.zze = j2 - i3;
        }
        zzh(i3);
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws zzgb, Resources.NotFoundException, PackageManager.NameNotFoundException {
        long size;
        this.zzb = zzgeVar;
        zzf(zzgeVar);
        AssetFileDescriptor assetFileDescriptorZzk = zzk(this.zza, zzgeVar);
        this.zzc = assetFileDescriptorZzk;
        long length = assetFileDescriptorZzk.getLength();
        FileInputStream fileInputStream = new FileInputStream(this.zzc.getFileDescriptor());
        this.zzd = fileInputStream;
        if (length != -1) {
            try {
                if (zzgeVar.zze > length) {
                    throw new zzgv(null, null, 2008);
                }
            } catch (zzgv e) {
                throw e;
            } catch (IOException e2) {
                throw new zzgv(null, e2, 2000);
            }
        }
        long startOffset = this.zzc.getStartOffset();
        long j = zzgeVar.zze;
        long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
        if (jSkip != j) {
            throw new zzgv(null, null, 2008);
        }
        if (length == -1) {
            FileChannel channel = fileInputStream.getChannel();
            if (channel.size() == 0) {
                this.zze = -1L;
                size = -1;
            } else {
                size = channel.size() - channel.position();
                this.zze = size;
                if (size < 0) {
                    throw new zzgv(null, null, 2008);
                }
            }
        } else {
            size = length - jSkip;
            this.zze = size;
            if (size < 0) {
                throw new zzgb(2008);
            }
        }
        long j2 = zzgeVar.zzf;
        if (j2 != -1) {
            this.zze = size == -1 ? j2 : Math.min(size, j2);
        }
        this.zzf = true;
        zzg(zzgeVar);
        return j2 != -1 ? j2 : this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        zzge zzgeVar = this.zzb;
        if (zzgeVar != null) {
            return zzgeVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgv {
        this.zzb = null;
        try {
            try {
                try {
                    InputStream inputStream = this.zzd;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.zzc;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                    } catch (IOException e) {
                        throw new zzgv(null, e, 2000);
                    }
                } catch (Throwable th) {
                    this.zzd = null;
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.zzc;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.zzc = null;
                        if (this.zzf) {
                            this.zzf = false;
                            zzi();
                        }
                        throw th;
                    } catch (IOException e2) {
                        throw new zzgv(null, e2, 2000);
                    }
                }
            } catch (Throwable th2) {
                this.zzc = null;
                if (this.zzf) {
                    this.zzf = false;
                    zzi();
                }
                throw th2;
            }
        } catch (IOException e3) {
            throw new zzgv(null, e3, 2000);
        }
    }
}
