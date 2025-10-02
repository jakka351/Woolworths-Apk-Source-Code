package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.internal.zzt;

@SuppressLint
/* loaded from: classes6.dex */
public final class zzd implements ReviewManager {

    /* renamed from: a, reason: collision with root package name */
    public final zzi f14766a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public zzd(zzi zziVar) {
        this.f14766a = zziVar;
    }

    @Override // com.google.android.play.core.review.ReviewManager
    public final Task a(Activity activity, ReviewInfo reviewInfo) {
        if (reviewInfo.b()) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(activity, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", reviewInfo.a());
        intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.b, taskCompletionSource));
        activity.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    public final Task b() {
        zzi zziVar = this.f14766a;
        String str = zziVar.b;
        com.google.android.play.core.review.internal.zzi zziVar2 = zzi.c;
        zziVar2.a("requestInAppReview (%s)", str);
        zzt zztVar = zziVar.f14767a;
        if (zztVar != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            zztVar.c(new zzf(zziVar, taskCompletionSource, taskCompletionSource), taskCompletionSource);
            return taskCompletionSource.getTask();
        }
        Object[] objArr = new Object[0];
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", com.google.android.play.core.review.internal.zzi.c(zziVar2.f14761a, "Play Store app is either not installed or not the official version", objArr));
        }
        return Tasks.forException(new ReviewException(-1));
    }
}
