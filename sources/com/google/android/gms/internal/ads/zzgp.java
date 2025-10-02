package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes5.dex */
public class zzgp extends zzgb {
    public final int zzb;

    public zzgp(zzge zzgeVar, int i, int i2) {
        super(zzb(2008, 1));
        this.zzb = 1;
    }

    public static zzgp zza(IOException iOException, zzge zzgeVar, int i) {
        String message = iOException.getMessage();
        int i2 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION : (message == null || !zzggj.zza(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        return i2 == 2007 ? new zzgo(iOException, zzgeVar) : new zzgp(iOException, zzgeVar, i2, i);
    }

    private static int zzb(int i, int i2) {
        return i == 2000 ? i2 != 1 ? 2000 : 2001 : i;
    }

    public zzgp(IOException iOException, zzge zzgeVar, int i, int i2) {
        super(iOException, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgp(String str, zzge zzgeVar, int i, int i2) {
        super(str, zzb(i, i2));
        this.zzb = i2;
    }

    public zzgp(String str, @Nullable IOException iOException, zzge zzgeVar, int i, int i2) {
        super(str, iOException, zzb(i, i2));
        this.zzb = i2;
    }
}
