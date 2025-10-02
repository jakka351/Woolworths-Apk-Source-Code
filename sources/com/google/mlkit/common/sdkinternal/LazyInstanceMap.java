package com.google.mlkit.common.sdkinternal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
/* loaded from: classes.dex */
public abstract class LazyInstanceMap<K, V> {

    @GuardedBy
    private final Map zza = new HashMap();

    public abstract Object create(Object obj);

    @NonNull
    @KeepForSdk
    public V get(@NonNull K k) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k)) {
                    return (V) this.zza.get(k);
                }
                V v = (V) create(k);
                this.zza.put(k, v);
                return v;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
