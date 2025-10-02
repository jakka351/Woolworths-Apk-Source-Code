package com.adobe.marketing.mobile.services.internal.context;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.adobe.marketing.mobile.services.AppContextService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App;", "Lcom/adobe/marketing/mobile/services/AppContextService;", "ActivityLifecycleCallbacks", "ActivityTracker", "AppStateTracker", "InternalActivityLifecycleCallbacks", "InternalActivityLifecycleListener", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class App implements AppContextService {

    /* renamed from: a, reason: collision with root package name */
    public static final App f13247a = new App();
    public static volatile WeakReference b;
    public static volatile WeakReference c;
    public static volatile ConnectivityManager d;
    public static final ActivityTracker e;
    public static final AppStateTracker f;
    public static InternalActivityLifecycleCallbacks g;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;", "", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface ActivityLifecycleCallbacks {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class DefaultImpls {
        }

        void onActivityPaused(Activity activity);

        void onActivityResumed(Activity activity);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityTracker;", "Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleListener;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class ActivityTracker implements InternalActivityLifecycleListener {

        /* renamed from: a, reason: collision with root package name */
        public volatile ArrayList f13248a;

        @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            Iterator it = this.f13248a.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleCallbacks) it.next()).onActivityPaused(activity);
            }
        }

        @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            new WeakReference(activity);
            Iterator it = this.f13248a.iterator();
            while (it.hasNext()) {
                ((ActivityLifecycleCallbacks) it.next()).onActivityResumed(activity);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$AppStateTracker;", "Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleListener;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class AppStateTracker implements InternalActivityLifecycleListener {
        @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // com.adobe.marketing.mobile.services.internal.context.App.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/content/ComponentCallbacks2;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    @SourceDebugExtension
    public static final class InternalActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
        public final List d;

        public InternalActivityLifecycleCallbacks(List list) {
            this.d = list;
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
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((InternalActivityLifecycleListener) it.next()).onActivityPaused(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            Intrinsics.h(activity, "activity");
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((InternalActivityLifecycleListener) it.next()).onActivityResumed(activity);
            }
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

        @Override // android.content.ComponentCallbacks
        public final void onConfigurationChanged(Configuration newConfig) {
            Intrinsics.h(newConfig, "newConfig");
        }

        @Override // android.content.ComponentCallbacks
        public final void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public final void onTrimMemory(int i) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((InternalActivityLifecycleListener) it.next()).getClass();
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bb\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/adobe/marketing/mobile/services/internal/context/App$InternalActivityLifecycleListener;", "Lcom/adobe/marketing/mobile/services/internal/context/App$ActivityLifecycleCallbacks;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface InternalActivityLifecycleListener extends ActivityLifecycleCallbacks {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class DefaultImpls {
        }
    }

    static {
        ActivityTracker activityTracker = new ActivityTracker();
        activityTracker.f13248a = new ArrayList();
        e = activityTracker;
        f = new AppStateTracker();
    }

    public final Context a() {
        WeakReference weakReference = c;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    public final void b(Application application) {
        WeakReference weakReference = b;
        if ((weakReference != null ? (Application) weakReference.get() : null) != null) {
            return;
        }
        b = new WeakReference(application);
        Context applicationContext = application.getApplicationContext();
        if (applicationContext != null) {
            c = new WeakReference(applicationContext);
        }
        Object systemService = application.getSystemService("connectivity");
        d = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        InternalActivityLifecycleCallbacks internalActivityLifecycleCallbacks = new InternalActivityLifecycleCallbacks(CollectionsKt.R(e, f));
        g = internalActivityLifecycleCallbacks;
        application.registerActivityLifecycleCallbacks(internalActivityLifecycleCallbacks);
        application.registerComponentCallbacks(g);
    }
}
