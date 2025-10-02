package com.salesforce.marketingcloud.sfmcsdk;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.JobIntentService;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorManagerImpl;
import com.salesforce.marketingcloud.sfmcsdk.components.behaviors.BehaviorType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0014¨\u0006\u000f"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkJobIntentService;", "Landroidx/core/app/JobIntentService;", "()V", "handleSystemBehavior", "", "context", "Landroid/content/Context;", "behaviorType", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorType;", SFMCSdkJobIntentService.EXTRA_DATA, "Landroid/os/Bundle;", "onHandleWork", "intent", "Landroid/content/Intent;", "Companion", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SFMCSdkJobIntentService extends JobIntentService {

    @NotNull
    private static final String ACTION_SYSTEM_BEHAVIOR = "com.salesforce.marketingcloud.sfmcsdk.SYSTEM_BEHAVIOR";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String EXTRA_BEHAVIOR = "behavior";

    @NotNull
    private static final String EXTRA_DATA = "data";
    private static final int JOB_ID = 331122;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/SFMCSdkJobIntentService$Companion;", "", "()V", "ACTION_SYSTEM_BEHAVIOR", "", "EXTRA_BEHAVIOR", "EXTRA_DATA", "JOB_ID", "", "enqueueSystemBehavior", "", "context", "Landroid/content/Context;", "behaviorType", "Lcom/salesforce/marketingcloud/sfmcsdk/components/behaviors/BehaviorType;", "behaviorData", "Landroid/os/Bundle;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void enqueueSystemBehavior(@NotNull Context context, @NotNull BehaviorType behaviorType, @Nullable Bundle behaviorData) {
            Intrinsics.h(context, "context");
            Intrinsics.h(behaviorType, "behaviorType");
            Bundle bundle = new Bundle();
            bundle.putString(SFMCSdkJobIntentService.EXTRA_BEHAVIOR, behaviorType.getIntentFilter());
            bundle.putBundle(SFMCSdkJobIntentService.EXTRA_DATA, behaviorData);
            JobIntentService.enqueueWork(context, (Class<?>) SFMCSdkJobIntentService.class, SFMCSdkJobIntentService.JOB_ID, new Intent(SFMCSdkJobIntentService.ACTION_SYSTEM_BEHAVIOR).putExtras(bundle));
        }

        private Companion() {
        }
    }

    private final void handleSystemBehavior(Context context, BehaviorType behaviorType, Bundle data) {
        if (behaviorType != null) {
            BehaviorManagerImpl.INSTANCE.notifyBehavior$sfmcsdk_release(context, behaviorType, data);
        }
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NotNull Intent intent) {
        Bundle bundleExtra;
        Intrinsics.h(intent, "intent");
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        Context context = getApplicationContext();
        if (!action.equals(ACTION_SYSTEM_BEHAVIOR) || (bundleExtra = intent.getBundleExtra(EXTRA_DATA)) == null) {
            return;
        }
        Intrinsics.g(context, "context");
        handleSystemBehavior(context, BehaviorType.INSTANCE.fromString(intent.getStringExtra(EXTRA_BEHAVIOR)), bundleExtra);
    }
}
