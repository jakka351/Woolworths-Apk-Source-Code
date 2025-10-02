package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbtl;
import com.google.android.gms.internal.ads.zzgoq;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nonnull;

/* loaded from: classes5.dex */
final class zzaf implements zzgoq {
    final /* synthetic */ zzbtl zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;

    public zzaf(zzau zzauVar, zzbtl zzbtlVar, boolean z) {
        this.zza = zzbtlVar;
        this.zzb = z;
        Objects.requireNonNull(zzauVar);
        this.zzc = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final void zza(Throwable th) {
        try {
            zzbtl zzbtlVar = this.zza;
            String message = th.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 16);
            sb.append("Internal error: ");
            sb.append(message);
            zzbtlVar.zzf(sb.toString());
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgoq
    public final /* bridge */ /* synthetic */ void zzb(@Nonnull Object obj) {
        List<Uri> list = (List) obj;
        try {
            zzau zzauVar = this.zzc;
            zzauVar.zzw(list);
            this.zza.zze(list);
            if (!zzauVar.zzD() && !this.zzb) {
                return;
            }
            for (Uri uri : list) {
                if (zzauVar.zzd(uri)) {
                    zzauVar.zzB().zzb(zzau.zzZ(uri, zzauVar.zzM(), "1").toString(), null, null, null);
                } else {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzhT)).booleanValue()) {
                        zzauVar.zzB().zzb(uri.toString(), null, null, null);
                    }
                }
            }
        } catch (RemoteException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }
}
