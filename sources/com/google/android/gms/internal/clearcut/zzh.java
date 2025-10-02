package com.google.android.gms.internal.clearcut;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

/* loaded from: classes5.dex */
final class zzh extends BaseImplementation.ApiMethodImpl<Status, zzj> {
    private final com.google.android.gms.clearcut.zze zzao;

    public zzh(com.google.android.gms.clearcut.zze zzeVar, GoogleApiClient googleApiClient) {
        super(ClearcutLogger.API, googleApiClient);
        this.zzao = zzeVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzj zzjVar = (zzj) anyClient;
        zzi zziVar = new zzi(this);
        try {
            com.google.android.gms.clearcut.zze zzeVar = this.zzao;
            ClearcutLogger.zzb zzbVar = zzeVar.zzt;
            if (zzbVar != null) {
                zzha zzhaVar = zzeVar.zzaa;
                if (zzhaVar.zzbjp.length == 0) {
                    zzhaVar.zzbjp = zzbVar.zza();
                }
            }
            ClearcutLogger.zzb zzbVar2 = zzeVar.zzan;
            if (zzbVar2 != null) {
                zzha zzhaVar2 = zzeVar.zzaa;
                if (zzhaVar2.zzbjw.length == 0) {
                    zzhaVar2.zzbjw = zzbVar2.zza();
                }
            }
            zzha zzhaVar3 = zzeVar.zzaa;
            int iZzas = zzhaVar3.zzas();
            byte[] bArr = new byte[iZzas];
            zzfz.zza(zzhaVar3, bArr, 0, iZzas);
            zzeVar.zzah = bArr;
            ((zzn) zzjVar.getService()).zza(zziVar, this.zzao);
        } catch (RuntimeException e) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.MessageProducer ", e);
            setFailedResult(new Status(10, "MessageProducer"));
        }
    }
}
