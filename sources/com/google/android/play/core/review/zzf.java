package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;

/* loaded from: classes6.dex */
final class zzf extends com.google.android.play.core.review.internal.zzj {
    public final /* synthetic */ TaskCompletionSource e;
    public final /* synthetic */ zzi f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(zzi zziVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.e = taskCompletionSource2;
        this.f = zziVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void a() {
        HashMap map;
        try {
            zzi zziVar = this.f;
            com.google.android.play.core.review.internal.zzf zzfVar = zziVar.f14767a.m;
            String str = zziVar.b;
            Bundle bundle = new Bundle();
            HashMap map2 = zzj.f14768a;
            synchronized (zzj.class) {
                map = zzj.f14768a;
                map.put("java", 20002);
            }
            bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
            if (map.containsKey("native")) {
                bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
            }
            if (map.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
            }
            zzi zziVar2 = this.f;
            TaskCompletionSource taskCompletionSource = this.e;
            String str2 = zziVar2.b;
            zzfVar.g1(str, bundle, new zzh(zziVar2, new com.google.android.play.core.review.internal.zzi("OnRequestInstallCallback"), taskCompletionSource));
        } catch (RemoteException e) {
            zzi zziVar3 = this.f;
            com.google.android.play.core.review.internal.zzi zziVar4 = zzi.c;
            Object[] objArr = {zziVar3.b};
            zziVar4.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", com.google.android.play.core.review.internal.zzi.c(zziVar4.f14761a, "error requesting in-app review for %s", objArr), e);
            }
            this.e.trySetException(new RuntimeException(e));
        }
    }
}
