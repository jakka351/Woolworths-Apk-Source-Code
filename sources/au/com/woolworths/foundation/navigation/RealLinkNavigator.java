package au.com.woolworths.foundation.navigation;

import android.app.Activity;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@ExperimentalNavigationApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/navigation/RealLinkNavigator;", "Lau/com/woolworths/foundation/navigation/LinkNavigator;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class RealLinkNavigator implements LinkNavigator {

    /* renamed from: a, reason: collision with root package name */
    public final Application f8539a;
    public Activity b;
    public boolean c;

    public RealLinkNavigator(Application application) {
        this.f8539a = application;
    }

    @Override // au.com.woolworths.foundation.navigation.LinkNavigator
    public final void a(String url) {
        Intrinsics.h(url, "url");
        if (!this.c) {
            throw new IllegalArgumentException("LinkNavigator not initialized.");
        }
        Activity activity = this.b;
        if (activity == null) {
            return;
        }
        try {
            activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(activity, com.woolworths.R.string.no_browser_installed_message, 0).show();
        }
    }

    @Override // au.com.woolworths.foundation.navigation.LinkNavigator
    public final void initialize() {
        if (this.c) {
            return;
        }
        this.f8539a.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: au.com.woolworths.foundation.navigation.RealLinkNavigator.initialize.1
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
                RealLinkNavigator.this.b = null;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                Intrinsics.h(activity, "activity");
                RealLinkNavigator.this.b = activity;
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
        });
        this.c = true;
    }
}
