package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzfdy {

    @GuardedBy
    private static zzfdy zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcy zzc;
    private final AtomicReference zzd = new AtomicReference();

    @VisibleForTesting
    public zzfdy(Context context, com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.zzb = context;
        this.zzc = zzcyVar;
    }

    public static zzfdy zza(Context context) {
        synchronized (zzfdy.class) {
            try {
                zzfdy zzfdyVar = zza;
                if (zzfdyVar != null) {
                    return zzfdyVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbej.zzb.zze()).longValue();
                com.google.android.gms.ads.internal.client.zzcy zzcyVarZzf = null;
                if (jLongValue > 0 && jLongValue <= 253410000) {
                    zzcyVarZzf = zzf(applicationContext);
                }
                zzfdy zzfdyVar2 = new zzfdy(applicationContext, zzcyVarZzf);
                zza = zzfdyVar2;
                return zzfdyVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public static com.google.android.gms.ads.internal.client.zzcy zzf(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcx.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfc zzg() {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                return zzcyVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i, boolean z, int i2) {
        com.google.android.gms.ads.internal.client.zzfc zzfcVarZzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzI = com.google.android.gms.ads.internal.util.zzs.zzI(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i2, true, zZzI);
        return (((Boolean) zzbej.zzc.zze()).booleanValue() && (zzfcVarZzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzfcVarZzg.zza(), true, zZzI) : versionInfoParcel;
    }

    public final void zzc(zzbox zzboxVar) {
        if (!((Boolean) zzbej.zza.zze()).booleanValue()) {
            com.google.android.gms.common.api.internal.a.s(this.zzd, zzboxVar);
            return;
        }
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        zzbox adapterCreator = null;
        if (zzcyVar != null) {
            try {
                adapterCreator = zzcyVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference = this.zzd;
        if (adapterCreator != null) {
            zzboxVar = adapterCreator;
        }
        com.google.android.gms.common.api.internal.a.s(atomicReference, zzboxVar);
    }

    public final zzbox zzd() {
        return (zzbox) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfc zzfcVarZzg = zzg();
        if (zzfcVarZzg != null) {
            return zzfcVarZzg.zzb();
        }
        return null;
    }
}
