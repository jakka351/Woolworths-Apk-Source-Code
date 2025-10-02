package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbeb;
import com.google.android.gms.internal.ads.zzbyb;
import com.google.android.gms.internal.ads.zzbyi;
import com.google.android.gms.internal.ads.zzfhr;
import com.google.android.gms.internal.ads.zzfib;
import com.google.android.gms.internal.ads.zzgoq;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
final class zzad implements zzgoq {
    final /* synthetic */ ListenableFuture zza;
    final /* synthetic */ zzbyi zzb;
    final /* synthetic */ zzbyb zzc;
    final /* synthetic */ zzfhr zzd;
    final /* synthetic */ zzau zze;

    public zzad(zzau zzauVar, ListenableFuture listenableFuture, zzbyi zzbyiVar, zzbyb zzbybVar, zzfhr zzfhrVar) {
        this.zza = listenableFuture;
        this.zzb = zzbyiVar;
        this.zzc = zzbybVar;
        this.zzd = zzfhrVar;
        Objects.requireNonNull(zzauVar);
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        String message = th.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzik)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th, "SignalGeneratorImpl.generateSignals");
        }
        zzfib zzfibVarZzy = zzau.zzy(this.zza, this.zzb);
        if (((Boolean) zzbeb.zze.zze()).booleanValue() && zzfibVarZzy != null) {
            zzfhr zzfhrVar = this.zzd;
            zzfhrVar.zzj(th);
            zzfhrVar.zzd(false);
            zzfibVarZzy.zza(zzfhrVar);
            zzfibVarZzy.zzh();
        }
        zzbyb zzbybVar = this.zzc;
        if (zzbybVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
                sb.append("Internal error. ");
                sb.append(message);
                message = sb.toString();
            }
            zzbybVar.zzb(message);
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(@Nullable Object obj) {
        ListenableFuture listenableFuture = this.zza;
        AtomicBoolean atomicBooleanZzN = this.zze.zzN();
        zzbj zzbjVar = (zzbj) obj;
        zzfib zzfibVarZzy = zzau.zzy(listenableFuture, this.zzb);
        atomicBooleanZzN.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzie)).booleanValue()) {
            try {
                zzbyb zzbybVar = this.zzc;
                if (zzbybVar != null) {
                    zzbybVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
            }
            if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarZzy == null) {
                return;
            }
            zzfhr zzfhrVar = this.zzd;
            zzfhrVar.zzk("QueryInfo generation has been disabled.");
            zzfhrVar.zzd(false);
            zzfibVarZzy.zza(zzfhrVar);
            zzfibVarZzy.zzh();
            return;
        }
        try {
            try {
                if (zzbjVar == null) {
                    zzbyb zzbybVar2 = this.zzc;
                    if (zzbybVar2 != null) {
                        zzbybVar2.zzc(null, null, null);
                    }
                    zzfhr zzfhrVar2 = this.zzd;
                    zzfhrVar2.zzd(true);
                    if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarZzy == null) {
                        return;
                    }
                    zzfibVarZzy.zza(zzfhrVar2);
                    zzfibVarZzy.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbjVar.zzc) ? new JSONObject(zzbjVar.zzc) : new JSONObject(zzbjVar.zzb)).optString("request_id", ""))) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        zzbyb zzbybVar3 = this.zzc;
                        if (zzbybVar3 != null) {
                            zzbybVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzfhr zzfhrVar3 = this.zzd;
                        zzfhrVar3.zzk("Request ID empty");
                        zzfhrVar3.zzd(false);
                        if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarZzy == null) {
                            return;
                        }
                        zzfibVarZzy.zza(zzfhrVar3);
                        zzfibVarZzy.zzh();
                        return;
                    }
                    Bundle bundle = zzbjVar.zzf;
                    zzau zzauVar = this.zze;
                    if (zzauVar.zzF() && bundle != null && bundle.getInt(zzauVar.zzH(), -1) == -1) {
                        bundle.putInt(zzauVar.zzH(), zzauVar.zzI().get());
                    }
                    if (zzauVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzG()))) {
                        if (TextUtils.isEmpty(zzauVar.zzK())) {
                            zzauVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzauVar.zzz(), zzauVar.zzJ().afmaVersion));
                        }
                        bundle.putString(zzauVar.zzG(), zzauVar.zzK());
                    }
                    zzbyb zzbybVar4 = this.zzc;
                    if (zzbybVar4 != null) {
                        if (TextUtils.isEmpty(zzbjVar.zzc)) {
                            zzbybVar4.zzc(zzbjVar.zza, zzbjVar.zzb, bundle);
                        } else {
                            zzbybVar4.zzc(zzbjVar.zza, zzbjVar.zzc, bundle);
                        }
                    }
                    this.zzd.zzd(true);
                    if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarZzy == null) {
                        return;
                    }
                    zzfibVarZzy.zza(this.zzd);
                    zzfibVarZzy.zzh();
                } catch (JSONException e2) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    zzbyb zzbybVar5 = this.zzc;
                    if (zzbybVar5 != null) {
                        String string = e2.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 33);
                        sb.append("Internal error for request JSON: ");
                        sb.append(string);
                        zzbybVar5.zzb(sb.toString());
                    }
                    zzfhr zzfhrVar4 = this.zzd;
                    zzfhrVar4.zzj(e2);
                    zzfhrVar4.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarZzy == null) {
                        return;
                    }
                    zzfibVarZzy.zza(zzfhrVar4);
                    zzfibVarZzy.zzh();
                }
            } catch (RemoteException e3) {
                zzfhr zzfhrVar5 = this.zzd;
                zzfhrVar5.zzj(e3);
                zzfhrVar5.zzd(false);
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e3);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e3, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbeb.zze.zze()).booleanValue() || zzfibVarZzy == null) {
                    return;
                }
                zzfibVarZzy.zza(this.zzd);
                zzfibVarZzy.zzh();
            }
        } catch (Throwable th) {
            if (((Boolean) zzbeb.zze.zze()).booleanValue() && zzfibVarZzy != null) {
                zzfibVarZzy.zza(this.zzd);
                zzfibVarZzy.zzh();
            }
            throw th;
        }
    }
}
