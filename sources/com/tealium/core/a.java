package com.tealium.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/a;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tealium.core.messaging.c f19131a;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/tealium/core/a$a", "Landroid/app/Application$ActivityLifecycleCallbacks;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: com.tealium.core.a$a, reason: collision with other inner class name */
    public final class C0380a implements Application.ActivityLifecycleCallbacks {
        public C0380a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            Intrinsics.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            Intrinsics.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Intrinsics.h(activity, "activity");
            a.this.f19131a.onActivityPaused(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Intrinsics.h(activity, "activity");
            a.this.f19131a.onActivityResumed(activity);
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
            a.this.f19131a.m(activity, activity.isChangingConfigurations());
        }
    }

    public a(TealiumConfig tealiumConfig, com.tealium.core.messaging.c cVar, ContextScope contextScope) {
        this.f19131a = cVar;
        tealiumConfig.f19129a.registerActivityLifecycleCallbacks(new C0380a());
    }
}
