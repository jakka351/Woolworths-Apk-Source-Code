package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final /* synthetic */ class zzbjh implements zzbjl {
    static final /* synthetic */ zzbjh zza = new zzbjh();

    private /* synthetic */ zzbjh() {
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcgd zzcgdVar = (zzcgd) obj;
        zzbjl zzbjlVar = zzbjk.zza;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int i = Integer.parseInt(str);
            int i2 = Integer.parseInt(str2);
            int i3 = Integer.parseInt(str3);
            zzauu zzauuVarZzS = zzcgdVar.zzS();
            if (zzauuVarZzS != null) {
                zzauuVarZzS.zzb().zze(i, i2, i3);
            }
        } catch (NumberFormatException unused) {
            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse touch parameters from gmsg.");
        }
    }
}
