package com.google.android.gms.internal.ads;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class zzgkc implements Map, Serializable {
    private transient zzgke zza;
    private transient zzgke zzb;
    private transient zzgjv zzc;

    public static zzgkc zza() {
        return zzglp.zza;
    }

    public static zzgkc zzb(Object obj, Object obj2) {
        zzgiz.zza("dialog_not_shown_reason", obj2);
        return zzglp.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgkc zzc(Map map) {
        Set setEntrySet = map.entrySet();
        zzgkb zzgkbVar = new zzgkb(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzgkbVar.zzb(setEntrySet);
        return zzgkbVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgkw.zzb(this, obj);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzglz.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzgiz.zzb(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, llqqqql.a0061aaaaa));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgke entrySet() {
        zzgke zzgkeVar = this.zza;
        if (zzgkeVar != null) {
            return zzgkeVar;
        }
        zzgke zzgkeVarZze = zze();
        this.zza = zzgkeVarZze;
        return zzgkeVarZze;
    }

    public abstract zzgke zze();

    @Override // java.util.Map
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgke keySet() {
        zzgke zzgkeVar = this.zzb;
        if (zzgkeVar != null) {
            return zzgkeVar;
        }
        zzgke zzgkeVarZzg = zzg();
        this.zzb = zzgkeVarZzg;
        return zzgkeVarZzg;
    }

    public abstract zzgke zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgjv values() {
        zzgjv zzgjvVar = this.zzc;
        if (zzgjvVar != null) {
            return zzgjvVar;
        }
        zzgjv zzgjvVarZzi = zzi();
        this.zzc = zzgjvVarZzi;
        return zzgjvVarZzi;
    }

    public abstract zzgjv zzi();
}
