package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes5.dex */
public final class zzgn extends zzfs {

    @Nullable
    private RandomAccessFile zza;

    @Nullable
    private Uri zzb;
    private long zzc;
    private boolean zzd;

    public zzgn() {
        super(false);
    }

    @Override // com.google.android.gms.internal.ads.zzi
    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.zzc;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.zza;
            String str = zzeo.zza;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.zzc -= i3;
                zzh(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new zzgm(e, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final long zzb(zzge zzgeVar) throws IOException {
        Uri uri = zzgeVar.zza;
        this.zzb = uri;
        zzf(zzgeVar);
        try {
            String path = uri.getPath();
            if (path == null) {
                throw null;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.zza = randomAccessFile;
            try {
                long j = zzgeVar.zze;
                randomAccessFile.seek(j);
                long length = zzgeVar.zzf;
                if (length == -1) {
                    length = this.zza.length() - j;
                }
                this.zzc = length;
                if (length < 0) {
                    throw new zzgm(null, null, 2008);
                }
                this.zzd = true;
                zzg(zzgeVar);
                return this.zzc;
            } catch (IOException e) {
                throw new zzgm(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new zzgm(e2, ((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment2 = uri.getFragment();
            StringBuilder sbV = YU.a.v("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbV.append(fragment2);
            throw new zzgm(sbV.toString(), e2, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);
        } catch (SecurityException e3) {
            throw new zzgm(e3, 2006);
        } catch (RuntimeException e4) {
            throw new zzgm(e4, 2000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzga
    @Nullable
    public final Uri zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzga
    public final void zzd() throws zzgm {
        this.zzb = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.zza;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.zza = null;
                if (this.zzd) {
                    this.zzd = false;
                    zzi();
                }
            } catch (IOException e) {
                throw new zzgm(e, 2000);
            }
        } catch (Throwable th) {
            this.zza = null;
            if (this.zzd) {
                this.zzd = false;
                zzi();
            }
            throw th;
        }
    }
}
