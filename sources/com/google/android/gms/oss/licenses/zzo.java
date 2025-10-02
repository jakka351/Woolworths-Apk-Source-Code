package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes5.dex */
final class zzo extends ArrayAdapter {
    final /* synthetic */ zzp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzo(zzp zzpVar, Context context) {
        super(context, zze.zzg(zzpVar.zza()), zze.zzh(zzpVar.zza()), new ArrayList());
        Objects.requireNonNull(zzpVar);
        this.zza = zzpVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, @Nullable View view, ViewGroup viewGroup) {
        if (view == null) {
            zzp zzpVar = this.zza;
            LayoutInflater layoutInflater = zzpVar.getLayoutInflater();
            zzd zzdVarZza = zzpVar.zza();
            view = layoutInflater.inflate((XmlPullParser) zzdVarZza.zza.getXml(zze.zzg(zzdVarZza)), viewGroup, false);
        }
        com.google.android.gms.internal.oss_licenses.zzg zzgVar = (com.google.android.gms.internal.oss_licenses.zzg) getItem(i);
        if (zzgVar != null) {
            ((TextView) view.findViewById(zze.zzh(this.zza.zza()))).setText(zzgVar.zzb());
        }
        return view;
    }
}
