package com.google.android.gms.internal.ads;

import android.view.InputEvent;
import androidx.annotation.VisibleForTesting;
import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzdpn {

    @Nullable
    private volatile InputEvent zza;

    @VisibleForTesting
    public zzdpn() {
    }

    public final void zza(InputEvent inputEvent) {
        this.zza = inputEvent;
    }

    @Nullable
    public final InputEvent zzb() {
        return this.zza;
    }
}
