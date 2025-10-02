package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;
import com.google.android.gms.common.internal.Preconditions;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzp extends Fragment implements LoaderManager.LoaderCallbacks {
    private ListView zza;
    private ArrayAdapter zzb;
    private zzd zzc;

    @Nullable
    private String zzd;
    private zze zze;
    private Context zzf;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.zzf = context;
        this.zze = zze.zza(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        Bundle arguments;
        super.onCreate(bundle);
        if (bundle == null && (arguments = getArguments()) != null) {
            this.zzd = arguments.getString("license_activity_package_name");
        }
        if (this.zzd == null) {
            this.zzd = this.zzf.getPackageName();
        }
        this.zzc = zze.zzb(this.zzf, this.zzd);
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final Loader onCreateLoader(int i, @Nullable Bundle bundle) {
        return new zzm(this.zzf, this.zze);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        zzd zzdVar = this.zzc;
        return layoutInflater.inflate(zzdVar.zza.getIdentifier("license_menu_fragment", "layout", zzdVar.zzb), viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.getSupportLoaderManager().a();
        }
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        this.zzb.clear();
        this.zzb.addAll((List) obj);
        this.zzb.notifyDataSetChanged();
    }

    @Override // androidx.loader.app.LoaderManager.LoaderCallbacks
    public final void onLoaderReset(Loader loader) {
        this.zzb.clear();
        this.zzb.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        Preconditions.checkNotNull(activity);
        activity.getSupportLoaderManager().d(54321, this);
        zzd zzdVar = this.zzc;
        this.zza = (ListView) view.findViewById(zzdVar.zza.getIdentifier("license_list", "id", zzdVar.zzb));
        zzo zzoVar = new zzo(this, activity);
        this.zzb = zzoVar;
        this.zza.setAdapter((ListAdapter) zzoVar);
        this.zza.setOnItemClickListener(new zzn(this));
    }

    public final /* synthetic */ zzd zza() {
        return this.zzc;
    }

    public final /* synthetic */ Context zzb() {
        return this.zzf;
    }
}
