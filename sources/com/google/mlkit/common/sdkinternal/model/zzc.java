package com.google.mlkit.common.sdkinternal.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.WorkerThread;

@WorkerThread
/* loaded from: classes6.dex */
final class zzc extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getLongExtra("extra_download_id", -1L) == 0) {
            throw null;
        }
    }
}
