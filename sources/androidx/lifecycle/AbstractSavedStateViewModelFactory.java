package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.os.SavedStateRegistry;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    public SavedStateRegistry f2778a;
    public Lifecycle b;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel b(Class cls, MutableCreationExtras mutableCreationExtras) throws NoSuchMethodException, SecurityException {
        String str = (String) mutableCreationExtras.f2811a.get(ViewModelProvider.b);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        SavedStateRegistry savedStateRegistry = this.f2778a;
        if (savedStateRegistry == null) {
            return e(str, cls, SavedStateHandleSupport.a(mutableCreationExtras));
        }
        Intrinsics.e(savedStateRegistry);
        Lifecycle lifecycle = this.b;
        Intrinsics.e(lifecycle);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(savedStateRegistry, lifecycle, str, null);
        ViewModel viewModelE = e(str, cls, savedStateHandleControllerB.e);
        viewModelE.l6("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return viewModelE;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final ViewModel c(Class cls) throws NoSuchMethodException, SecurityException {
        Lifecycle lifecycle = this.b;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (lifecycle == null) {
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        SavedStateRegistry savedStateRegistry = this.f2778a;
        Intrinsics.e(savedStateRegistry);
        Intrinsics.e(lifecycle);
        SavedStateHandleController savedStateHandleControllerB = LegacySavedStateHandleController.b(savedStateRegistry, lifecycle, canonicalName, null);
        ViewModel viewModelE = e(canonicalName, cls, savedStateHandleControllerB.e);
        viewModelE.l6("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerB);
        return viewModelE;
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public final void d(ViewModel viewModel) throws NoSuchMethodException, SecurityException {
        SavedStateRegistry savedStateRegistry = this.f2778a;
        if (savedStateRegistry != null) {
            Lifecycle lifecycle = this.b;
            Intrinsics.e(lifecycle);
            LegacySavedStateHandleController.a(viewModel, savedStateRegistry, lifecycle);
        }
    }

    public abstract ViewModel e(String str, Class cls, SavedStateHandle savedStateHandle);
}
