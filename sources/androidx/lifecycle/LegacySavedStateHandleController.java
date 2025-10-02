package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandle;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LegacySavedStateHandleController {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnRecreation implements SavedStateRegistry.AutoRecreated {
        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public final void a(SavedStateRegistryOwner savedStateRegistryOwner) throws NoSuchMethodException, SecurityException {
            if (!(savedStateRegistryOwner instanceof ViewModelStoreOwner)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + savedStateRegistryOwner).toString());
            }
            ViewModelStore viewModelStore = ((ViewModelStoreOwner) savedStateRegistryOwner).getViewModelStore();
            SavedStateRegistry savedStateRegistry = savedStateRegistryOwner.getSavedStateRegistry();
            viewModelStore.getClass();
            LinkedHashMap linkedHashMap = viewModelStore.f2804a;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                String key = (String) it.next();
                Intrinsics.h(key, "key");
                ViewModel viewModel = (ViewModel) linkedHashMap.get(key);
                if (viewModel != null) {
                    LegacySavedStateHandleController.a(viewModel, savedStateRegistry, savedStateRegistryOwner.getD());
                }
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d();
        }
    }

    public static final void a(ViewModel viewModel, SavedStateRegistry registry, Lifecycle lifecycle) throws NoSuchMethodException, SecurityException {
        Intrinsics.h(registry, "registry");
        Intrinsics.h(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) viewModel.n6("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.f) {
            return;
        }
        savedStateHandleController.a(lifecycle, registry);
        c(lifecycle, registry);
    }

    public static final SavedStateHandleController b(SavedStateRegistry registry, Lifecycle lifecycle, String str, Bundle bundle) throws NoSuchMethodException, SecurityException {
        Intrinsics.h(registry, "registry");
        Intrinsics.h(lifecycle, "lifecycle");
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, SavedStateHandle.Companion.a(registry.a(str), bundle));
        savedStateHandleController.a(lifecycle, registry);
        c(lifecycle, registry);
        return savedStateHandleController;
    }

    public static void c(final Lifecycle lifecycle, final SavedStateRegistry savedStateRegistry) throws NoSuchMethodException, SecurityException {
        Lifecycle.State d = lifecycle.getD();
        if (d == Lifecycle.State.e || d.compareTo(Lifecycle.State.g) >= 0) {
            savedStateRegistry.d();
        } else {
            lifecycle.a(new LifecycleEventObserver() { // from class: androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws NoSuchMethodException, SecurityException {
                    if (event == Lifecycle.Event.ON_START) {
                        lifecycle.c(this);
                        savedStateRegistry.d();
                    }
                }
            });
        }
    }
}
