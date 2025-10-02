package com.google.android.gms.wallet;

import android.app.Activity;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;

@Deprecated
/* loaded from: classes2.dex */
public final class zzd extends Fragment {

    @VisibleForTesting
    boolean zza;
    private int zzb;

    @Nullable
    private zzc zzc;

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(@Nullable Task task) throws PendingIntent.CanceledException {
        if (this.zza) {
            return;
        }
        this.zza = true;
        Activity activity = getActivity();
        activity.getFragmentManager().beginTransaction().remove(this).commit();
        if (task != null) {
            AutoResolveHelper.zzf(activity, this.zzb, task);
        } else {
            AutoResolveHelper.zze(activity, this.zzb, 0, new Intent());
        }
    }

    private final void zzc() {
        zzc zzcVar = this.zzc;
        if (zzcVar != null) {
            zzcVar.zzb(this);
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.zzb = getArguments().getInt("requestCode");
        if (AutoResolveHelper.zza != getArguments().getLong("initializationElapsedRealtime")) {
            this.zzc = null;
        } else {
            this.zzc = (zzc) zzc.zzb.get(getArguments().getInt("resolveCallId"));
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("delivered")) {
            z = true;
        }
        this.zza = z;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        zzc();
    }

    @Override // android.app.Fragment
    public final void onResume() throws PendingIntent.CanceledException {
        super.onResume();
        zzc zzcVar = this.zzc;
        if (zzcVar != null) {
            zzcVar.zzc(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
        }
        zzb(null);
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.zza);
        zzc();
    }
}
