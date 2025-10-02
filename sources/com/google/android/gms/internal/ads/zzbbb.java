package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbbb implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbat zza;
    final /* synthetic */ zzbzm zzb;
    final /* synthetic */ zzbbd zzc;

    public zzbbb(zzbbd zzbbdVar, zzbat zzbatVar, zzbzm zzbzmVar) {
        this.zza = zzbatVar;
        this.zzb = zzbzmVar;
        Objects.requireNonNull(zzbbdVar);
        this.zzc = zzbbdVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        zzbbd zzbbdVar = this.zzc;
        synchronized (zzbbdVar.zzf()) {
            try {
                if (zzbbdVar.zzd()) {
                    return;
                }
                zzbbdVar.zze(true);
                final zzbas zzbasVarZzc = zzbbdVar.zzc();
                if (zzbasVarZzc == null) {
                    return;
                }
                zzgpd zzgpdVar = zzbzh.zza;
                final zzbat zzbatVar = this.zza;
                final zzbzm zzbzmVar = this.zzb;
                final ListenableFuture listenableFutureSubmit = zzgpdVar.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbba
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() throws IOException {
                        zzbzm zzbzmVar2 = zzbzmVar;
                        zzbas zzbasVar = zzbasVarZzc;
                        zzbbb zzbbbVar = this.zza;
                        try {
                            zzbav zzbavVarZzq = zzbasVar.zzq();
                            boolean zZzp = zzbasVar.zzp();
                            zzbat zzbatVar2 = zzbatVar;
                            zzbaq zzbaqVarZzf = zZzp ? zzbavVarZzq.zzf(zzbatVar2) : zzbavVarZzq.zze(zzbatVar2);
                            if (!zzbaqVarZzf.zza()) {
                                zzbzmVar2.zzd(new RuntimeException("No entry contents."));
                                zzbbbVar.zzc.zzb();
                                return;
                            }
                            zzbay zzbayVar = new zzbay(zzbbbVar, zzbaqVarZzf.zzb(), 1);
                            int i = zzbayVar.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbayVar.unread(i);
                            zzbzmVar2.zzc(zzbbf.zza(zzbayVar, zzbaqVarZzf.zzd(), zzbaqVarZzf.zzg(), zzbaqVarZzf.zzf(), zzbaqVarZzf.zze()));
                        } catch (RemoteException e) {
                            e = e;
                            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzbzmVar2.zzd(e);
                            zzbbbVar.zzc.zzb();
                        } catch (IOException e2) {
                            e = e2;
                            int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to obtain a cache service instance.", e);
                            zzbzmVar2.zzd(e);
                            zzbbbVar.zzc.zzb();
                        }
                    }
                });
                zzbzmVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbaz
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        if (zzbzmVar.isCancelled()) {
                            listenableFutureSubmit.cancel(true);
                        }
                    }
                }, zzbzh.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
