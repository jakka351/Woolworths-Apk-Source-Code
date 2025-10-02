package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryController;
import androidx.os.SavedStateRegistryOwner;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
class FragmentViewLifecycleOwner implements HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ViewModelStoreOwner {
    public final Fragment d;
    public final ViewModelStore e;
    public final d f;
    public ViewModelProvider.Factory g;
    public LifecycleRegistry h = null;
    public SavedStateRegistryController i = null;

    public FragmentViewLifecycleOwner(Fragment fragment2, ViewModelStore viewModelStore, d dVar) {
        this.d = fragment2;
        this.e = viewModelStore;
        this.f = dVar;
    }

    public final void a(Lifecycle.Event event) {
        this.h.f(event);
    }

    public final void b() {
        if (this.h == null) {
            this.h = new LifecycleRegistry(this, true);
            SavedStateRegistryController savedStateRegistryControllerA = SavedStateRegistryController.Companion.a(this);
            this.i = savedStateRegistryControllerA;
            savedStateRegistryControllerA.f3732a.a();
            this.f.run();
        }
    }

    public final boolean c() {
        return this.h != null;
    }

    public final void d() {
        this.h.h(Lifecycle.State.f);
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment2 = this.d;
        Context applicationContext = fragment2.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(0);
        LinkedHashMap linkedHashMap = mutableCreationExtras.f2811a;
        if (application != null) {
            linkedHashMap.put(ViewModelProvider.AndroidViewModelFactory.d, application);
        }
        linkedHashMap.put(SavedStateHandleSupport.f2796a, fragment2);
        linkedHashMap.put(SavedStateHandleSupport.b, this);
        if (fragment2.getArguments() != null) {
            linkedHashMap.put(SavedStateHandleSupport.c, fragment2.getArguments());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment2 = this.d;
        ViewModelProvider.Factory defaultViewModelProviderFactory = fragment2.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment2.mDefaultFactory)) {
            this.g = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.g == null) {
            Context applicationContext = fragment2.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.g = new SavedStateViewModelFactory(application, fragment2, fragment2.getArguments());
        }
        return this.g;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public final Lifecycle getD() {
        b();
        return this.h;
    }

    @Override // androidx.os.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        b();
        return this.i.b;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        b();
        return this.e;
    }
}
