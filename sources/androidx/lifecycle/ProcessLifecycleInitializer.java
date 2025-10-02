package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleDispatcher;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleInitializer;", "Landroidx/startup/Initializer;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "lifecycle-process_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    @Override // androidx.startup.Initializer
    public final Object create(Context context) {
        Intrinsics.h(context, "context");
        AppInitializer appInitializerC = AppInitializer.c(context);
        Intrinsics.g(appInitializerC, "getInstance(...)");
        if (!appInitializerC.b.contains(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        if (!LifecycleDispatcher.f2789a.getAndSet(true)) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext).registerActivityLifecycleCallbacks(new LifecycleDispatcher.DispatcherActivityCallback());
        }
        final ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.l;
        processLifecycleOwner.getClass();
        processLifecycleOwner.h = new Handler();
        processLifecycleOwner.i.f(Lifecycle.Event.ON_CREATE);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.f(applicationContext2, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext2).registerActivityLifecycleCallbacks(new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1
            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.h(activity, "activity");
                if (Build.VERSION.SDK_INT < 29) {
                    int i = ReportFragment.e;
                    Fragment fragmentFindFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
                    Intrinsics.f(fragmentFindFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
                    ((ReportFragment) fragmentFindFragmentByTag).d = processLifecycleOwner.k;
                }
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                Intrinsics.h(activity, "activity");
                ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                int i = processLifecycleOwner2.e - 1;
                processLifecycleOwner2.e = i;
                if (i == 0) {
                    Handler handler = processLifecycleOwner2.h;
                    Intrinsics.e(handler);
                    handler.postDelayed(processLifecycleOwner2.j, 700L);
                }
            }

            /* JADX WARN: Type inference failed for: r3v2, types: [androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1] */
            @Override // android.app.Application.ActivityLifecycleCallbacks
            @RequiresApi
            public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
                Intrinsics.h(activity, "activity");
                final ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                ProcessLifecycleOwner.Api29Impl.a(activity, new EmptyActivityLifecycleCallbacks() { // from class: androidx.lifecycle.ProcessLifecycleOwner$attach$1$onActivityPreCreated$1
                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostResumed(Activity activity2) {
                        Intrinsics.h(activity2, "activity");
                        processLifecycleOwner2.a();
                    }

                    @Override // android.app.Application.ActivityLifecycleCallbacks
                    public void onActivityPostStarted(Activity activity2) {
                        Intrinsics.h(activity2, "activity");
                        ProcessLifecycleOwner processLifecycleOwner3 = processLifecycleOwner2;
                        int i = processLifecycleOwner3.d + 1;
                        processLifecycleOwner3.d = i;
                        if (i == 1 && processLifecycleOwner3.g) {
                            processLifecycleOwner3.i.f(Lifecycle.Event.ON_START);
                            processLifecycleOwner3.g = false;
                        }
                    }
                });
            }

            @Override // androidx.lifecycle.EmptyActivityLifecycleCallbacks, android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                Intrinsics.h(activity, "activity");
                ProcessLifecycleOwner processLifecycleOwner2 = processLifecycleOwner;
                int i = processLifecycleOwner2.d - 1;
                processLifecycleOwner2.d = i;
                if (i == 0 && processLifecycleOwner2.f) {
                    processLifecycleOwner2.i.f(Lifecycle.Event.ON_STOP);
                    processLifecycleOwner2.g = true;
                }
            }
        });
        return processLifecycleOwner;
    }

    @Override // androidx.startup.Initializer
    public final List dependencies() {
        return EmptyList.d;
    }
}
