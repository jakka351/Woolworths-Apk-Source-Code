package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzbsd extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbsd(zzbfp zzbfpVar) {
        try {
            this.zzb = zzbfpVar.zzb();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
            this.zzb = "";
        }
        try {
            for (Object obj : zzbfpVar.zzc()) {
                zzbfw zzbfwVarZzh = obj instanceof IBinder ? zzbfv.zzh((IBinder) obj) : null;
                if (zzbfwVarZzh != null) {
                    this.zza.add(new zzbsf(zzbfwVarZzh));
                }
            }
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzb;
    }
}
