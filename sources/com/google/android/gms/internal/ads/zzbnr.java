package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzbnr implements zzbmi, zzbnq {
    private final zzbnq zza;
    private final HashSet zzb = new HashSet();

    public zzbnr(zzbnq zzbnqVar) {
        this.zza = zzbnqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmi, com.google.android.gms.internal.ads.zzbmt
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet hashSet = this.zzb;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbjl) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbjl) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzm(String str, zzbjl zzbjlVar) {
        this.zza.zzm(str, zzbjlVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbjlVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnq
    public final void zzn(String str, zzbjl zzbjlVar) {
        this.zza.zzn(str, zzbjlVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbjlVar));
    }
}
