package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class zzfeh {

    @Nullable
    @VisibleForTesting
    static Task zza;

    @Nullable
    @VisibleForTesting
    public static AppSetIdClient zzb;
    private static final Object zzc = new Object();

    public static void zza(Context context, boolean z) {
        synchronized (zzc) {
            try {
                if (zzb == null) {
                    zzb = AppSet.getClient(context);
                }
                Task task = zza;
                if (task == null || ((task.isComplete() && !zza.isSuccessful()) || (z && zza.isComplete()))) {
                    zza = ((AppSetIdClient) Preconditions.checkNotNull(zzb, "the appSetIdClient shouldn't be null")).getAppSetIdInfo();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    public static Task zzb(Context context) {
        Task task;
        zza(context, false);
        synchronized (zzc) {
            task = zza;
        }
        return task;
    }
}
