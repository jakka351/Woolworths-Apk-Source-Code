package au.com.woolworths.compose.utils.viewmodel;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/compose/utils/viewmodel/StoreOwnerWithFactory;", "Lau/com/woolworths/compose/utils/viewmodel/StoreOwnerWithoutFactory;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class StoreOwnerWithFactory extends StoreOwnerWithoutFactory implements HasDefaultViewModelProviderFactory {
    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final CreationExtras getDefaultViewModelCreationExtras() {
        throw null;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        throw null;
    }
}
