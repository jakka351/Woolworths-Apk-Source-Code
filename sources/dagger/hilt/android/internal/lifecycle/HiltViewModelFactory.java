package dagger.hilt.android.internal.lifecycle;

import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.internal.ThreadUtil;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.lifecycle.RetainedLifecycle;
import dagger.internal.LazyClassKeyMap;
import java.io.Closeable;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Provider;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class HiltViewModelFactory implements ViewModelProvider.Factory {
    public static final CreationExtras.Key d = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public final Map f23770a;
    public final ViewModelProvider.Factory b;
    public final ViewModelProvider.Factory c;

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$1, reason: invalid class name */
    public class AnonymousClass1 implements CreationExtras.Key<Function1<Object, ViewModel>> {
    }

    /* renamed from: dagger.hilt.android.internal.lifecycle.HiltViewModelFactory$2, reason: invalid class name */
    class AnonymousClass2 implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewModelComponentBuilder f23771a;

        public AnonymousClass2(ViewModelComponentBuilder viewModelComponentBuilder) {
            this.f23771a = viewModelComponentBuilder;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) {
            ViewModel viewModel;
            final RetainedLifecycleImpl retainedLifecycleImpl = new RetainedLifecycleImpl();
            ViewModelComponentBuilder viewModelComponentBuilderA = this.f23771a.a(SavedStateHandleSupport.a(mutableCreationExtras));
            viewModelComponentBuilderA.b(retainedLifecycleImpl);
            ViewModelComponent viewModelComponentBuild = viewModelComponentBuilderA.build();
            Provider provider = (Provider) ((ViewModelFactoriesEntryPoint) EntryPoints.a(ViewModelFactoriesEntryPoint.class, viewModelComponentBuild)).a().get(cls);
            Function1 function1 = (Function1) mutableCreationExtras.f2811a.get(HiltViewModelFactory.d);
            Object obj = ((ViewModelFactoriesEntryPoint) EntryPoints.a(ViewModelFactoriesEntryPoint.class, viewModelComponentBuild)).b().get(cls);
            if (obj == null) {
                if (function1 != null) {
                    throw new IllegalStateException(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("Found creation callback but class "), " does not have an assisted factory specified in @HiltViewModel."));
                }
                if (provider == null) {
                    throw new IllegalStateException(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("Expected the @HiltViewModel-annotated class "), " to be available in the multi-binding of @HiltViewModelMap but none was found."));
                }
                viewModel = (ViewModel) provider.get();
            } else {
                if (provider != null) {
                    throw new AssertionError(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("Found the @HiltViewModel-annotated class "), " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap."));
                }
                if (function1 == null) {
                    throw new IllegalStateException(androidx.constraintlayout.core.state.a.f(cls, new StringBuilder("Found @HiltViewModel-annotated class "), " using @AssistedInject but no creation callback was provided in CreationExtras."));
                }
                viewModel = (ViewModel) function1.invoke(obj);
            }
            Closeable closeable = new Closeable() { // from class: dagger.hilt.android.internal.lifecycle.a
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
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
            };
            viewModel.getClass();
            ViewModelImpl viewModelImpl = viewModel.d;
            if (viewModelImpl == null) {
                return viewModel;
            }
            if (viewModelImpl.d) {
                ViewModelImpl.a(closeable);
                return viewModel;
            }
            synchronized (viewModelImpl.f2818a) {
                viewModelImpl.c.add(closeable);
            }
            return viewModel;
        }
    }

    @EntryPoint
    @InstallIn
    public interface ActivityCreatorEntryPoint {
        ViewModelComponentBuilder b1();

        LazyClassKeyMap g0();
    }

    @EntryPoint
    @InstallIn
    public interface ViewModelFactoriesEntryPoint {
        LazyClassKeyMap a();

        LazyClassKeyMap b();
    }

    @Module
    @InstallIn
    /* loaded from: classes7.dex */
    public interface ViewModelModule {
    }

    public HiltViewModelFactory(Map map, ViewModelProvider.Factory factory, ViewModelComponentBuilder viewModelComponentBuilder) {
        this.f23770a = map;
        this.b = factory;
        this.c = new AnonymousClass2(viewModelComponentBuilder);
    }

    public static HiltViewModelFactory d(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        ActivityCreatorEntryPoint activityCreatorEntryPoint = (ActivityCreatorEntryPoint) EntryPoints.a(ActivityCreatorEntryPoint.class, componentActivity);
        return new HiltViewModelFactory(activityCreatorEntryPoint.g0(), factory, activityCreatorEntryPoint.b1());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) {
        return this.f23770a.containsKey(cls) ? ((AnonymousClass2) this.c).b(cls, mutableCreationExtras) : this.b.b(cls, mutableCreationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel c(Class cls) {
        if (this.f23770a.containsKey(cls)) {
            throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        }
        return this.b.c(cls);
    }
}
