package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.stats.ConnectionTracker;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzq extends GmsClientSupervisor {
    private final HashMap zzb = new HashMap();
    private final Context zzc;
    private volatile Handler zzd;
    private final zzp zze;
    private final ConnectionTracker zzf;
    private final long zzg;
    private final long zzh;

    @Nullable
    private volatile Executor zzi;

    public zzq(Context context, Looper looper, @Nullable Executor executor) {
        zzp zzpVar = new zzp(this, null);
        this.zze = zzpVar;
        this.zzc = context.getApplicationContext();
        this.zzd = new com.google.android.gms.internal.common.zzg(looper, zzpVar);
        this.zzf = ConnectionTracker.getInstance();
        this.zzg = 5000L;
        this.zzh = 300000L;
        this.zzi = executor;
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final ConnectionResult zza(zzn zznVar, ServiceConnection serviceConnection, String str, @Nullable Executor executor) {
        ConnectionResult connectionResultZzj;
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.zzb;
        synchronized (map) {
            try {
                zzo zzoVar = (zzo) map.get(zznVar);
                if (executor == null) {
                    executor = this.zzi;
                }
                if (zzoVar == null) {
                    zzoVar = new zzo(this, zznVar);
                    zzoVar.zzb(serviceConnection, serviceConnection, str);
                    connectionResultZzj = zzoVar.zzj(str, executor);
                    map.put(zznVar, zzoVar);
                } else {
                    this.zzd.removeMessages(0, zznVar);
                    if (zzoVar.zzf(serviceConnection)) {
                        String string = zznVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    zzoVar.zzb(serviceConnection, serviceConnection, str);
                    int iZze = zzoVar.zze();
                    if (iZze == 1) {
                        serviceConnection.onServiceConnected(zzoVar.zzi(), zzoVar.zzh());
                    } else if (iZze == 2) {
                        connectionResultZzj = zzoVar.zzj(str, executor);
                    }
                    connectionResultZzj = null;
                }
                if (zzoVar.zzd()) {
                    return ConnectionResult.RESULT_SUCCESS;
                }
                if (connectionResultZzj == null) {
                    connectionResultZzj = new ConnectionResult(-1);
                }
                return connectionResultZzj;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.GmsClientSupervisor
    public final void zzc(zzn zznVar, ServiceConnection serviceConnection, String str) {
        Preconditions.checkNotNull(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.zzb;
        synchronized (map) {
            try {
                zzo zzoVar = (zzo) map.get(zznVar);
                if (zzoVar == null) {
                    String string = zznVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!zzoVar.zzf(serviceConnection)) {
                    String string2 = zznVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                zzoVar.zzc(serviceConnection, str);
                if (zzoVar.zzg()) {
                    this.zzd.sendMessageDelayed(this.zzd.obtainMessage(0, zznVar), this.zzg);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(Looper looper) {
        synchronized (this.zzb) {
            this.zzd = new com.google.android.gms.internal.common.zzg(looper, this.zze);
        }
    }

    public final void zze(@Nullable Executor executor) {
        synchronized (this.zzb) {
            this.zzi = executor;
        }
    }

    public final /* synthetic */ HashMap zzf() {
        return this.zzb;
    }

    public final /* synthetic */ Context zzg() {
        return this.zzc;
    }

    public final /* synthetic */ Handler zzh() {
        return this.zzd;
    }

    public final /* synthetic */ ConnectionTracker zzi() {
        return this.zzf;
    }

    public final /* synthetic */ long zzj() {
        return this.zzh;
    }
}
