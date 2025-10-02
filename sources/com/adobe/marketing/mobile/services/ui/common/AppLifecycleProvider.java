package com.adobe.marketing.mobile.services.ui.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider;", "", "AppLifecycleListener", "Companion", "InternalAppLifecycleListener", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class AppLifecycleProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f13250a = LazyKt.b(AppLifecycleProvider$Companion$INSTANCE$2.h);

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider$AppLifecycleListener;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface AppLifecycleListener {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider$Companion;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/common/AppLifecycleProvider$InternalAppLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class InternalAppLifecycleListener implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Intrinsics.h(activity, "activity");
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Intrinsics.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Intrinsics.h(activity, "activity");
            throw null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
            Intrinsics.h(activity, "activity");
            Intrinsics.h(outState, "outState");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            Intrinsics.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            Intrinsics.h(activity, "activity");
        }
    }
}
