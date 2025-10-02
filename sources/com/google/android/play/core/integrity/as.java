package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;

/* loaded from: classes6.dex */
final class as extends com.google.android.play.integrity.internal.q {

    /* renamed from: a, reason: collision with root package name */
    @VisibleForTesting
    final TaskCompletionSource f14723a;

    @VisibleForTesting
    final com.google.android.play.integrity.internal.ae b;
    private final com.google.android.play.integrity.internal.s c;
    private final String d;
    private final k e;
    private final Activity f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, com.google.android.play.integrity.internal.ae aeVar) {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
        this.c = new com.google.android.play.integrity.internal.s("RequestDialogCallbackImpl");
        this.d = context.getPackageName();
        this.e = kVar;
        this.f14723a = taskCompletionSource;
        this.f = activity;
        this.b = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.r
    public final void b(Bundle bundle) {
        this.b.d(this.f14723a);
        this.c.b("onRequestDialog(%s)", this.d);
        ApiException apiExceptionA = this.e.a(bundle);
        if (apiExceptionA != null) {
            this.f14723a.trySetException(apiExceptionA);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            com.google.android.play.integrity.internal.s sVar = this.c;
            Object[] objArr = {this.d};
            sVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", com.google.android.play.integrity.internal.s.c(sVar.f14775a, "onRequestDialog(%s): got null dialog intent", objArr));
            }
            this.f14723a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.b.a()));
        com.google.android.play.integrity.internal.s sVar2 = this.c;
        Object[] objArr2 = new Object[0];
        sVar2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", com.google.android.play.integrity.internal.s.c(sVar2.f14775a, "Starting dialog intent...", objArr2));
        }
        this.f.startActivityForResult(intent, 0);
    }
}
