package au.com.woolworths.feature.shop.catalogue.generated.callback;

import androidx.databinding.adapters.SearchViewBindingAdapter;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueStoreSelectorBindingImpl;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnQueryTextSubmit implements SearchViewBindingAdapter.OnQueryTextSubmit {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityCatalogueStoreSelectorBindingImpl f6836a;

    public interface Listener {
    }

    public OnQueryTextSubmit(ActivityCatalogueStoreSelectorBindingImpl activityCatalogueStoreSelectorBindingImpl) {
        this.f6836a = activityCatalogueStoreSelectorBindingImpl;
    }

    @Override // androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextSubmit
    public final boolean onQueryTextSubmit(String queryTextValue) {
        CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel = this.f6836a.C;
        if (catalogueStoreSelectorViewModel == null) {
            return false;
        }
        Intrinsics.h(queryTextValue, "queryTextValue");
        catalogueStoreSelectorViewModel.k.f(queryTextValue);
        return false;
    }
}
