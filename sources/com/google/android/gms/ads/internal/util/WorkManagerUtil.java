package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

@KeepForSdk
/* loaded from: classes5.dex */
public class WorkManagerUtil extends zzbn {
    @UsedByReflection("This class must be instantiated reflectively so that the default class loader can be used.")
    public WorkManagerUtil() {
    }

    private static void zzb(Context context) {
        try {
            Context context2 = context.getApplicationContext();
            Configuration configuration = new Configuration(new Configuration.Builder());
            Intrinsics.h(context2, "context");
            WorkManagerImpl.f(context2, configuration);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(@NonNull IObjectWrapper iObjectWrapper, @NonNull String str, @NonNull String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(@NonNull IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            WorkManagerImpl workManagerImplA = WorkManager.Companion.a(context);
            CancelWorkRunnable.d(workManagerImplA, "offline_ping_sender_work");
            Constraints.Builder builder = new Constraints.Builder();
            builder.b(NetworkType.e);
            Constraints constraintsA = builder.a();
            OneTimeWorkRequest.Builder builder2 = new OneTimeWorkRequest.Builder(OfflinePingSender.class);
            builder2.c.j = constraintsA;
            builder2.d.add("offline_ping_sender_work");
            workManagerImplA.a((OneTimeWorkRequest) builder2.a());
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) throws IOException {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        Constraints.Builder builder = new Constraints.Builder();
        builder.b(NetworkType.e);
        Constraints constraintsA = builder.a();
        Data.Builder builder2 = new Data.Builder();
        builder2.d("uri", zzaVar.zza);
        builder2.d("gws_query_id", zzaVar.zzb);
        builder2.d("image_url", zzaVar.zzc);
        Data dataA = builder2.a();
        OneTimeWorkRequest.Builder builder3 = new OneTimeWorkRequest.Builder(OfflineNotificationPoster.class);
        WorkSpec workSpec = builder3.c;
        workSpec.j = constraintsA;
        workSpec.e = dataA;
        builder3.d.add("offline_notification_work");
        try {
            WorkManager.Companion.a(context).a((OneTimeWorkRequest) builder3.a());
            return true;
        } catch (IllegalStateException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e);
            return false;
        }
    }
}
