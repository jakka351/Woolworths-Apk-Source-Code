package au.com.woolworths.foundation.feature.di;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.os.SavedStateRegistryOwner;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/feature/di/AssistedViewModelFactory;", "Landroidx/lifecycle/ViewModel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "feature_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AssistedViewModelFactory<T extends ViewModel> extends AbstractSavedStateViewModelFactory {
    public final Function1 c;

    public AssistedViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Function1 function1) {
        this.f2778a = savedStateRegistryOwner.getSavedStateRegistry();
        this.b = savedStateRegistryOwner.getD();
        this.c = function1;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public final ViewModel e(String str, Class cls, SavedStateHandle savedStateHandle) {
        Object objInvoke = this.c.invoke(savedStateHandle);
        Intrinsics.f(objInvoke, "null cannot be cast to non-null type T of au.com.woolworths.foundation.feature.di.AssistedViewModelFactory.create");
        return (ViewModel) objInvoke;
    }
}
