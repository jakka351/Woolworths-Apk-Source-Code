package com.google.android.recaptcha.internal;

import com.google.android.gms.location.GeofenceStatusCodes;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzbl {

    @JvmField
    @NotNull
    public static final zzbl zza = new zzbl(9999);

    @JvmField
    @NotNull
    public static final zzbl zzb = new zzbl(GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION);

    @JvmField
    @NotNull
    public static final zzbl zzc = new zzbl(GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT);

    @JvmField
    @NotNull
    public static final zzbl zzd = new zzbl(1006);

    @JvmField
    @NotNull
    public static final zzbl zze = new zzbl(1007);

    @JvmField
    @NotNull
    public static final zzbl zzf = new zzbl(1008);

    @JvmField
    @NotNull
    public static final zzbl zzg = new zzbl(1009);

    @JvmField
    @NotNull
    public static final zzbl zzh = new zzbl(1010);
    private final int zzi;

    private zzbl(int i) {
        this.zzi = i;
    }

    public final int zza() {
        return this.zzi;
    }
}
