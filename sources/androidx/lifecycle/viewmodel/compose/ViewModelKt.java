package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.Composer;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.reflect.KClass;

@Metadata(d1 = {"androidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModelKt", "androidx/lifecycle/viewmodel/compose/ViewModelKt__ViewModel_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ViewModelKt {
    public static final ViewModel a(ViewModelStoreOwner viewModelStoreOwner, KClass kClass, ViewModelProvider.Factory factory, CreationExtras creationExtras) {
        return (factory != null ? ViewModelProvider.Companion.a(viewModelStoreOwner.getViewModelStore(), factory, creationExtras) : viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? ViewModelProvider.Companion.a(viewModelStoreOwner.getViewModelStore(), ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory(), creationExtras) : ViewModelProvider.Companion.b(viewModelStoreOwner, null, 6)).a(kClass);
    }

    public static final ViewModel b(Class cls, ViewModelStoreOwner viewModelStoreOwner, HiltViewModelFactory hiltViewModelFactory, CreationExtras creationExtras, Composer composer) {
        return a(viewModelStoreOwner, JvmClassMappingKt.e(cls), hiltViewModelFactory, creationExtras);
    }
}
