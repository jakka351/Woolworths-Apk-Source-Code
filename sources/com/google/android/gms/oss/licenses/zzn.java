package com.google.android.gms.oss.licenses;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.dynatrace.android.callback.Callback;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzn implements AdapterView.OnItemClickListener {
    final /* synthetic */ zzp zza;

    public zzn(zzp zzpVar) {
        Objects.requireNonNull(zzpVar);
        this.zza = zzpVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Callback.j(view);
        try {
            com.google.android.gms.internal.oss_licenses.zzg zzgVar = (com.google.android.gms.internal.oss_licenses.zzg) adapterView.getItemAtPosition(i);
            zzp zzpVar = this.zza;
            Intent intent = new Intent(zzpVar.zzb(), (Class<?>) OssLicensesActivity.class);
            intent.putExtra("license", zzgVar);
            zzpVar.startActivity(intent);
        } finally {
            Callback.k();
        }
    }
}
