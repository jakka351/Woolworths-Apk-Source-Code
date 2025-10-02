package dagger.hilt.android.internal.managers;

import android.content.Context;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.EntryPointAccessors;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.lifecycle.RetainedLifecycleImpl;
import dagger.hilt.android.lifecycle.RetainedLifecycle;
import dagger.hilt.internal.GeneratedComponentManager;
import java.util.Iterator;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class ActivityRetainedComponentManager implements GeneratedComponentManager<ActivityRetainedComponent> {
    public final ComponentActivity d;
    public final ComponentActivity e;
    public volatile ActivityRetainedComponent f;
    public final Object g = new Object();

    /* renamed from: dagger.hilt.android.internal.managers.ActivityRetainedComponentManager$1, reason: invalid class name */
    class AnonymousClass1 implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f23773a;

        public AnonymousClass1(Context context) {
            this.f23773a = context;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) {
            SavedStateHandleHolder savedStateHandleHolder = new SavedStateHandleHolder();
            savedStateHandleHolder.f23774a = mutableCreationExtras;
            ActivityRetainedComponentBuilder activityRetainedComponentBuilderP = ((ActivityRetainedComponentBuilderEntryPoint) EntryPointAccessors.a(this.f23773a, ActivityRetainedComponentBuilderEntryPoint.class)).P();
            activityRetainedComponentBuilderP.a(savedStateHandleHolder);
            return new ActivityRetainedComponentViewModel(activityRetainedComponentBuilderP.build(), savedStateHandleHolder);
        }
    }

    @EntryPoint
    @InstallIn
    public interface ActivityRetainedComponentBuilderEntryPoint {
        ActivityRetainedComponentBuilder P();
    }

    public static final class ActivityRetainedComponentViewModel extends ViewModel {
        public final ActivityRetainedComponent e;
        public final SavedStateHandleHolder f;

        public ActivityRetainedComponentViewModel(ActivityRetainedComponent activityRetainedComponent, SavedStateHandleHolder savedStateHandleHolder) {
            this.e = activityRetainedComponent;
            this.f = savedStateHandleHolder;
        }

        @Override // androidx.lifecycle.ViewModel
        public final void o6() {
            RetainedLifecycleImpl retainedLifecycleImpl = (RetainedLifecycleImpl) ((ActivityRetainedLifecycleEntryPoint) EntryPoints.a(ActivityRetainedLifecycleEntryPoint.class, this.e)).b();
            retainedLifecycleImpl.getClass();
            if (ThreadUtil.f23768a == null) {
                ThreadUtil.f23768a = Looper.getMainLooper().getThread();
            }
            if (Thread.currentThread() != ThreadUtil.f23768a) {
                throw new IllegalStateException("Must be called on the Main thread.");
            }
            Iterator it = retainedLifecycleImpl.f23772a.iterator();
            while (it.hasNext()) {
                ((RetainedLifecycle.OnClearedListener) it.next()).a();
            }
        }
    }

    @EntryPoint
    @InstallIn
    public interface ActivityRetainedLifecycleEntryPoint {
        ActivityRetainedLifecycle b();
    }

    @Module
    @InstallIn
    public static abstract class LifecycleModule {
    }

    public ActivityRetainedComponentManager(ComponentActivity componentActivity) {
        this.d = componentActivity;
        this.e = componentActivity;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.f == null) {
            synchronized (this.g) {
                try {
                    if (this.f == null) {
                        ComponentActivity owner = this.d;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e);
                        Intrinsics.h(owner, "owner");
                        this.f = ((ActivityRetainedComponentViewModel) new ViewModelProvider(owner.getViewModelStore(), anonymousClass1, owner.getDefaultViewModelCreationExtras()).a(JvmClassMappingKt.e(ActivityRetainedComponentViewModel.class))).e;
                    }
                } finally {
                }
            }
        }
        return this.f;
    }
}
