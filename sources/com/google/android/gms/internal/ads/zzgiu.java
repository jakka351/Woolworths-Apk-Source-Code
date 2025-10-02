package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes5.dex */
abstract class zzgiu extends zzgix implements Serializable {
    private final transient Map zza;
    private transient int zzb;

    public zzgiu(Map map) {
        zzghc.zza(map.isEmpty());
        this.zza = map;
    }

    public Collection zza(Collection collection) {
        throw null;
    }

    public Collection zzb(Object obj, Collection collection) {
        throw null;
    }

    public abstract Collection zzc();

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final int zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgix, com.google.android.gms.internal.ads.zzgkx
    public final boolean zze(Object obj, Object obj2) {
        Map map = this.zza;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.zzb++;
            return true;
        }
        Collection collectionZzc = zzc();
        if (!collectionZzc.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.zzb++;
        map.put(obj, collectionZzc);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgkx
    public final void zzf() {
        Map map = this.zza;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.zzb = 0;
    }

    public final List zzg(Object obj, List list, zzgir zzgirVar) {
        return list instanceof RandomAccess ? new zzgin(this, obj, list, zzgirVar) : new zzgit(this, obj, list, zzgirVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public Set zzh() {
        throw null;
    }

    public final Set zzi() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzgim(this, (NavigableMap) map) : map instanceof SortedMap ? new zzgip(this, (SortedMap) map) : new zzgik(this, map);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final Collection zzj() {
        return new zzgiw(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public final Iterator zzk() {
        return new zzgie(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    public Map zzl() {
        throw null;
    }

    public final Map zzm() {
        Map map = this.zza;
        return map instanceof NavigableMap ? new zzgil(this, (NavigableMap) map) : map instanceof SortedMap ? new zzgio(this, (SortedMap) map) : new zzgih(this, map);
    }

    public final /* synthetic */ void zzn(Object obj) {
        Object objRemove;
        try {
            objRemove = this.zza.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            objRemove = null;
        }
        Collection collection = (Collection) objRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.zzb -= size;
        }
    }

    public final /* synthetic */ Map zzo() {
        return this.zza;
    }

    public final /* synthetic */ int zzp() {
        return this.zzb;
    }

    public final /* synthetic */ void zzq(int i) {
        this.zzb = i;
    }
}
