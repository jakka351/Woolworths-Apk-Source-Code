package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnet/yslibrary/android/keyboardvisibilityevent/AutoActivityLifecycleCallback;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes8.dex */
public abstract class AutoActivityLifecycleCallback implements Application.ActivityLifecycleCallbacks {
    public final ShoppingListDetailsActivity d;

    public AutoActivityLifecycleCallback(ShoppingListDetailsActivity shoppingListDetailsActivity) {
        this.d = shoppingListDetailsActivity;
    }

    public abstract void a();

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.h(activity, "activity");
        ShoppingListDetailsActivity shoppingListDetailsActivity = this.d;
        if (activity == shoppingListDetailsActivity) {
            shoppingListDetailsActivity.getApplication().unregisterActivityLifecycleCallbacks(this);
            a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.h(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Intrinsics.h(activity, "activity");
        Intrinsics.h(bundle, "bundle");
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
