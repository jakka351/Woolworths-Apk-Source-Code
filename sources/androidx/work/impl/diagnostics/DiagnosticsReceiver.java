package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.impl.workers.DiagnosticsWorker;

@RestrictTo
/* loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3978a = Logger.g("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        Logger loggerE = Logger.e();
        String str = f3978a;
        loggerE.a(str, "Requesting diagnostics");
        try {
            WorkManager.Companion.a(context).a((OneTimeWorkRequest) new OneTimeWorkRequest.Builder(DiagnosticsWorker.class).a());
        } catch (IllegalStateException e) {
            Logger.e().d(str, "WorkManager is not initialized", e);
        }
    }
}
