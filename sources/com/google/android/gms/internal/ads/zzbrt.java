package com.google.android.gms.internal.ads;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbrt implements View.OnClickListener {
    final /* synthetic */ zzbrv zza;

    public zzbrt(zzbrv zzbrvVar) {
        Objects.requireNonNull(zzbrvVar);
        this.zza = zzbrvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            this.zza.zzb(true);
        } finally {
            Callback.h();
        }
    }
}
