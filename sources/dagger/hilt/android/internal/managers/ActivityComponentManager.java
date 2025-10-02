package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModelProvider;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager;
import dagger.hilt.internal.GeneratedComponentManager;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class ActivityComponentManager implements GeneratedComponentManager<Object> {
    public volatile ActivityComponent d;
    public final Object e = new Object();
    public final Activity f;
    public final GeneratedComponentManager g;

    @EntryPoint
    @InstallIn
    public interface ActivityComponentBuilderEntryPoint {
        ActivityComponentBuilder a();
    }

    public ActivityComponentManager(Activity activity) {
        this.f = activity;
        this.g = new ActivityRetainedComponentManager((ComponentActivity) activity);
    }

    public final ActivityComponent a() {
        String str;
        Activity activity = this.f;
        if (activity.getApplication() instanceof GeneratedComponentManager) {
            ActivityComponentBuilder activityComponentBuilderA = ((ActivityComponentBuilderEntryPoint) EntryPoints.a(ActivityComponentBuilderEntryPoint.class, this.g)).a();
            activityComponentBuilderA.a(activity);
            return activityComponentBuilderA.build();
        }
        StringBuilder sb = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activity.getApplication().getClass();
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    public final SavedStateHandleHolder b() {
        ActivityRetainedComponentManager activityRetainedComponentManager = (ActivityRetainedComponentManager) this.g;
        ComponentActivity owner = activityRetainedComponentManager.d;
        ActivityRetainedComponentManager.AnonymousClass1 anonymousClass1 = new ActivityRetainedComponentManager.AnonymousClass1(activityRetainedComponentManager.e);
        Intrinsics.h(owner, "owner");
        return ((ActivityRetainedComponentManager.ActivityRetainedComponentViewModel) new ViewModelProvider(owner.getD(), anonymousClass1, owner.getDefaultViewModelCreationExtras()).a(JvmClassMappingKt.e(ActivityRetainedComponentManager.ActivityRetainedComponentViewModel.class))).f;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.d == null) {
            synchronized (this.e) {
                try {
                    if (this.d == null) {
                        this.d = a();
                    }
                } finally {
                }
            }
        }
        return this.d;
    }
}
