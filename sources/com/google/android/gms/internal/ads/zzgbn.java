package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public interface zzgbn {
    String zza();

    ListenableFuture zzb();

    ListenableFuture zzc(Context context);

    ListenableFuture zzd(Context context, String str, View view, Activity activity);

    ListenableFuture zze(Context context, String str, View view, Activity activity);

    void zzf(InputEvent inputEvent);

    int zzg();
}
