package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.lifecycle.viewmodel.internal.JvmViewModelProviders;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/SavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public final Application f2798a;
    public final ViewModelProvider.AndroidViewModelFactory b;
    public final Bundle c;
    public final Lifecycle d;
    public final SavedStateRegistry e;

    public SavedStateViewModelFactory() {
        this.b = new ViewModelProvider.AndroidViewModelFactory(null);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel a(KClass modelClass, MutableCreationExtras mutableCreationExtras) {
        Intrinsics.h(modelClass, "modelClass");
        return b(JvmClassMappingKt.b(modelClass), mutableCreationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) {
        LinkedHashMap linkedHashMap = mutableCreationExtras.f2811a;
        String str = (String) linkedHashMap.get(ViewModelProvider.b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(SavedStateHandleSupport.f2796a) == null || linkedHashMap.get(SavedStateHandleSupport.b) == null) {
            if (this.d != null) {
                return e(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(ViewModelProvider.AndroidViewModelFactory.d);
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.c(cls, SavedStateViewModelFactory_androidKt.b) : SavedStateViewModelFactory_androidKt.c(cls, SavedStateViewModelFactory_androidKt.f2799a);
        return constructorC == null ? this.b.b(cls, mutableCreationExtras) : (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.d(cls, constructorC, SavedStateHandleSupport.a(mutableCreationExtras)) : SavedStateViewModelFactory_androidKt.d(cls, constructorC, application, SavedStateHandleSupport.a(mutableCreationExtras));
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel c(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public final void d(ViewModel viewModel) throws NoSuchMethodException, SecurityException {
        Lifecycle lifecycle = this.d;
        if (lifecycle != null) {
            SavedStateRegistry savedStateRegistry = this.e;
            Intrinsics.e(savedStateRegistry);
            LegacySavedStateHandleController.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public final ViewModel e(Class cls, String str) throws NoSuchMethodException, SecurityException {
        Lifecycle lifecycle = this.d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
        Application application = this.f2798a;
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.c(cls, SavedStateViewModelFactory_androidKt.b) : SavedStateViewModelFactory_androidKt.c(cls, SavedStateViewModelFactory_androidKt.f2799a);
        if (constructorC == null) {
            if (application != null) {
                return this.b.c(cls);
            }
            if (ViewModelProvider.NewInstanceFactory.f2803a == null) {
                ViewModelProvider.NewInstanceFactory.f2803a = new ViewModelProvider.NewInstanceFactory();
            }
            Intrinsics.e(ViewModelProvider.NewInstanceFactory.f2803a);
            return JvmViewModelProviders.a(cls);
        }
        SavedStateRegistry savedStateRegistry = this.e;
        Intrinsics.e(savedStateRegistry);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(savedStateRegistry, lifecycle, str, this.c);
        ViewModel viewModelD = (!zIsAssignableFrom || application == null) ? SavedStateViewModelFactory_androidKt.d(cls, constructorC, savedStateHandleControllerB.getE()) : SavedStateViewModelFactory_androidKt.d(cls, constructorC, application, savedStateHandleControllerB.getE());
        viewModelD.l6("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return viewModelD;
    }

    public SavedStateViewModelFactory(Application application, SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        this.e = savedStateRegistryOwner.getSavedStateRegistry();
        this.d = savedStateRegistryOwner.getD();
        this.c = bundle;
        this.f2798a = application;
        if (application != null) {
            if (ViewModelProvider.AndroidViewModelFactory.c == null) {
                ViewModelProvider.AndroidViewModelFactory.c = new ViewModelProvider.AndroidViewModelFactory(application);
            }
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.c;
            Intrinsics.e(androidViewModelFactory);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory(null);
        }
        this.b = androidViewModelFactory;
    }
}
