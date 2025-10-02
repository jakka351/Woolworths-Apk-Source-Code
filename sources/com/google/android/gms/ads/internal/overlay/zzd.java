package com.google.android.gms.ads.internal.overlay;

import android.view.View;
import com.dynatrace.android.callback.Callback;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzd implements View.OnClickListener {
    final /* synthetic */ zzl zza;

    public zzd(zzl zzlVar) {
        Objects.requireNonNull(zzlVar);
        this.zza = zzlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            zzl zzlVar = this.zza;
            zzlVar.zzn = 2;
            zzlVar.zzb.finish();
        } finally {
            Callback.h();
        }
    }
}
