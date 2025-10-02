package com.google.android.gms.internal.ads;

import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final /* synthetic */ class zzclg implements zzgob {
    static final /* synthetic */ zzclg zza = new zzclg();

    private /* synthetic */ zzclg() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final /* synthetic */ ListenableFuture zza(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzlk)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzi(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return zzgot.zza(new GetTopicsResponse(zzgjz.zzi()));
    }
}
