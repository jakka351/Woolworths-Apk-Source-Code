package dagger.hilt.android.internal.lifecycle;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import dagger.Module;
import dagger.hilt.EntryPoint;
import dagger.hilt.EntryPoints;
import dagger.hilt.InstallIn;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.internal.LazyClassKeyMap;

/* loaded from: classes.dex */
public final class DefaultViewModelFactories {

    @EntryPoint
    @InstallIn
    public interface ActivityEntryPoint {
        InternalFactoryFactory a();
    }

    @Module
    @InstallIn
    /* loaded from: classes7.dex */
    public interface ActivityModule {
    }

    @EntryPoint
    @InstallIn
    /* loaded from: classes7.dex */
    public interface FragmentEntryPoint {
        InternalFactoryFactory a();
    }

    public static final class InternalFactoryFactory {

        /* renamed from: a, reason: collision with root package name */
        public final LazyClassKeyMap f23769a;
        public final ViewModelComponentBuilder b;

        public InternalFactoryFactory(LazyClassKeyMap lazyClassKeyMap, ViewModelComponentBuilder viewModelComponentBuilder) {
            this.f23769a = lazyClassKeyMap;
            this.b = viewModelComponentBuilder;
        }
    }

    public static HiltViewModelFactory a(ComponentActivity componentActivity, ViewModelProvider.Factory factory) {
        InternalFactoryFactory internalFactoryFactoryA = ((ActivityEntryPoint) EntryPoints.a(ActivityEntryPoint.class, componentActivity)).a();
        LazyClassKeyMap lazyClassKeyMap = internalFactoryFactoryA.f23769a;
        factory.getClass();
        return new HiltViewModelFactory(lazyClassKeyMap, factory, internalFactoryFactoryA.b);
    }

    public static HiltViewModelFactory b(Fragment fragment2, ViewModelProvider.Factory factory) {
        InternalFactoryFactory internalFactoryFactoryA = ((FragmentEntryPoint) EntryPoints.a(FragmentEntryPoint.class, fragment2)).a();
        LazyClassKeyMap lazyClassKeyMap = internalFactoryFactoryA.f23769a;
        factory.getClass();
        return new HiltViewModelFactory(lazyClassKeyMap, factory, internalFactoryFactoryA.b);
    }
}
