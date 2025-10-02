package com.salesforce.marketingcloud.sfmcsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorType;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SFMCSdkReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(@NotNull Context context, @NotNull Intent intent) {
        BehaviorType behaviorTypeFromString;
        Intrinsics.h(context, "context");
        Intrinsics.h(intent, "intent");
        final String action = intent.getAction();
        if (action == null) {
            action = "";
        }
        if (StringsKt.D(action)) {
            return;
        }
        String oldValue = context.getApplicationContext().getPackageName() + new Regex(".");
        Intrinsics.h(oldValue, "oldValue");
        int iC = StringsKt.C(action, oldValue, 0, false, 2);
        if (iC >= 0) {
            action = StringsKt.S(action, iC, oldValue.length() + iC, "").toString();
        }
        SFMCSdkLogger.INSTANCE.d("~$SFMCSdkReceiver", new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.SFMCSdkReceiver.onReceive.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final String invoke() {
                return "onReceive with action: " + action;
            }
        });
        if (!Intrinsics.c(action, "android.intent.action.MY_PACKAGE_REPLACED") || (behaviorTypeFromString = BehaviorType.INSTANCE.fromString(action)) == null) {
            return;
        }
        SFMCSdkJobIntentService.INSTANCE.enqueueSystemBehavior(context, behaviorTypeFromString, intent.getExtras());
    }
}
