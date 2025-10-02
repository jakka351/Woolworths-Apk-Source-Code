package com.google.android.gms.oss.licenses;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class zzm extends AsyncTaskLoader {
    private List zza;
    private final zze zzb;

    public zzm(Context context, zze zzeVar) {
        super(context.getApplicationContext());
        this.zzb = zzeVar;
    }

    @Override // androidx.loader.content.Loader
    public final /* synthetic */ void deliverResult(Object obj) {
        List list = (List) obj;
        this.zza = list;
        super.deliverResult(list);
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        ArrayList arrayListZza = com.google.android.gms.internal.oss_licenses.zzh.zza(getContext(), R.raw.keep_third_party_licenses);
        zzk zzkVarZzc = this.zzb.zzc();
        Task taskWithTimeout = Tasks.withTimeout(zzkVarZzc.doRead(new zzj(zzkVarZzc, arrayListZza)), 2L, TimeUnit.SECONDS);
        try {
            Tasks.await(taskWithTimeout);
            if (taskWithTimeout.isSuccessful()) {
                return (List) taskWithTimeout.getResult();
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.w("OssLicensesLoader", "Error getting license list from service: ".concat(String.valueOf(e.getMessage())));
        }
        return arrayListZza;
    }

    @Override // androidx.loader.content.Loader
    public final void onStartLoading() {
        List list = this.zza;
        if (list != null) {
            super.deliverResult(list);
        } else {
            forceLoad();
        }
    }

    @Override // androidx.loader.content.Loader
    public final void onStopLoading() {
        cancelLoad();
    }
}
