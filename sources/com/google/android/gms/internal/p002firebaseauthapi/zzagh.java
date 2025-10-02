package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzagh extends zzael {
    private final String zza;
    private final /* synthetic */ zzagc zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzagh(zzagc zzagcVar, zzael zzaelVar, String str) {
        super(zzaelVar);
        Objects.requireNonNull(zzagcVar);
        this.zzb = zzagcVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael, com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(Status status) {
        int i = 0;
        zzagc.zza.e(a.i("SMS verification code request failed: ", CommonStatusCodes.getStatusCodeString(status.getStatusCode()), " ", status.getStatusMessage()), new Object[0]);
        zzagj zzagjVar = (zzagj) this.zzb.zzd.get(this.zza);
        if (zzagjVar == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(zzagjVar.zzb);
        this.zzb.zzb(this.zza);
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((zzael) obj).zza(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael, com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zzb(String str) {
        zzagc.zza.d("onCodeSent", new Object[0]);
        zzagj zzagjVar = (zzagj) this.zzb.zzd.get(this.zza);
        if (zzagjVar == null) {
            return;
        }
        Iterator<zzael> it = zzagjVar.zzb.iterator();
        while (it.hasNext()) {
            it.next().zzb(str);
        }
        zzagjVar.zzg = true;
        zzagjVar.zzd = str;
        if (zzagjVar.zza <= 0) {
            this.zzb.zze(this.zza);
        } else if (!zzagjVar.zzc) {
            this.zzb.zzd(this.zza);
        } else {
            if (zzac.zzc(zzagjVar.zze)) {
                return;
            }
            zzagc.zzb(this.zzb, this.zza);
        }
    }
}
