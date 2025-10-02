package com.google.android.gms.common.api.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.internal.common.zzg;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzc {
    private final Map zza = Collections.synchronizedMap(new ArrayMap(0));
    private int zzb = 0;

    @Nullable
    private Bundle zzc;

    @Nullable
    public final LifecycleCallback zza(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.zza.get(str));
    }

    public final void zzb(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.zza;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(YU.a.p(new StringBuilder(String.valueOf(str).length() + 59), "LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.zzb > 0) {
            new zzg(Looper.getMainLooper()).post(new zzb(this, lifecycleCallback, str));
        }
    }

    public final boolean zzc() {
        return this.zzb > 0;
    }

    public final boolean zzd() {
        return this.zzb >= 2;
    }

    public final void zze(@Nullable Bundle bundle) {
        this.zzb = 1;
        this.zzc = bundle;
        for (Map.Entry entry : this.zza.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void zzf() {
        this.zzb = 2;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    public final void zzg() {
        this.zzb = 3;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    public final void zzh(int i, int i2, @Nullable Intent intent) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i, i2, intent);
        }
    }

    public final void zzi(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.zza.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void zzj() {
        this.zzb = 4;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    public final void zzk() {
        this.zzb = 5;
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    public final void zzl(String str, @Nullable FileDescriptor fileDescriptor, PrintWriter printWriter, @Nullable String[] strArr) {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final /* synthetic */ int zzm() {
        return this.zzb;
    }

    public final /* synthetic */ Bundle zzn() {
        return this.zzc;
    }
}
