package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes5.dex */
final class zzdt extends AbstractSet {
    private final /* synthetic */ zzdp zza;

    public zzdt(zzdp zzdpVar) {
        this.zza = zzdpVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Map mapZzb = this.zza.zzb();
        if (mapZzb != null) {
            return mapZzb.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iZza = this.zza.zza(entry.getKey());
            if (iZza != -1 && zzcz.zza(this.zza.zzc[iZza], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.zza.zzf();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@NullableDecl Object obj) {
        Map mapZzb = this.zza.zzb();
        if (mapZzb != null) {
            return mapZzb.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.zza.zza()) {
            return false;
        }
        int iZzi = this.zza.zzi();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = this.zza.zze;
        zzdp zzdpVar = this.zza;
        int iZza = zzea.zza(key, value, iZzi, obj2, zzdpVar.zza, zzdpVar.zzb, zzdpVar.zzc);
        if (iZza == -1) {
            return false;
        }
        this.zza.zza(iZza, iZzi);
        zzdp.zzd(this.zza);
        this.zza.zzc();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
