package io.branch.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import io.branch.referral.BranchLogger;
import io.branch.referral.NativeShareLinkManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/branch/receivers/SharingBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Branch-SDK_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SharingBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Intrinsics.h(context, "context");
        Intrinsics.h(intent, "intent");
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
        BranchLogger.e("Intent: " + intent);
        BranchLogger.e("Clicked component: " + componentName);
        NativeShareLinkManager.a().getClass();
        NativeShareLinkManager.a().getClass();
    }
}
