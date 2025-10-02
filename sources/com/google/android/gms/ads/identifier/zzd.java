package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzd {
    private static volatile zzd zza;
    private static final Object zzb = new Object();
    private static final Duration zzc = Duration.ofMinutes(30);

    @Nullable
    private final TelemetryLoggingClient zzd;
    private final AtomicLong zze = new AtomicLong(-1);

    private zzd(Context context, String str) {
        this.zzd = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("ads_identifier:api").build());
    }

    public static zzd zza(Context context) {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        zza = new zzd(context, "ads_identifier:api");
                    }
                } finally {
                }
            }
        }
        return zza;
    }

    public static /* synthetic */ void zzb(zzd zzdVar, long j, Exception exc) {
        ConnectionResult connectionResult;
        Log.i("AdvertisingIdClient", "getting error as ".concat(String.valueOf(exc.getMessage())));
        if ((exc instanceof ApiException) && (connectionResult = ((ApiException) exc).getStatus().getConnectionResult()) != null && connectionResult.getErrorCode() == 24) {
            zzdVar.zze.set(j);
        }
    }

    public final synchronized void zzc(int i, int i2, long j, long j2, int i3) {
        AtomicLong atomicLong = this.zze;
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.zze.get() == -1 || jElapsedRealtime - this.zze.get() > zzc.toMillis()) {
            TelemetryLoggingClient telemetryLoggingClient = this.zzd;
            if (telemetryLoggingClient != null) {
                telemetryLoggingClient.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i2, 0, j, j2, null, null, 0, i3)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.ads.identifier.zzc
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        zzd.zzb(this.zza, jElapsedRealtime, exc);
                    }
                });
            }
        }
    }
}
