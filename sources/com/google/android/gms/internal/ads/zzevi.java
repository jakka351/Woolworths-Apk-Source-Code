package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsResponse;
import androidx.privacysandbox.ads.adservices.topics.Topic;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final /* synthetic */ class zzevi implements zzgob {
    static final /* synthetic */ zzevi zza = new zzevi();

    private /* synthetic */ zzevi() {
    }

    @Override // com.google.android.gms.internal.ads.zzgob
    public final ListenableFuture zza(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (getTopicsResponse == null) {
            return zzgot.zza(new zzevk("", 1, null));
        }
        zzhme zzhmeVarZzc = zzhmf.zzc();
        for (Topic topic : getTopicsResponse.f3634a) {
            zzhmc zzhmcVarZzc = zzhmd.zzc();
            zzhmcVarZzc.zza(topic.c);
            zzhmcVarZzc.zzb(topic.b);
            zzhmcVarZzc.zzc(topic.f3635a);
            zzhmeVarZzc.zza((zzhmd) zzhmcVarZzc.zzbu());
        }
        return zzgot.zza(new zzevk(Base64.encodeToString(((zzhmf) zzhmeVarZzc.zzbu()).zzaN(), 1), 1, null));
    }
}
