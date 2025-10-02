package au.com.woolworths.feature.shop.catalogue.generated.callback;

import androidx.databinding.adapters.SearchViewBindingAdapter;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueStoreSelectorBindingImpl;
import au.com.woolworths.feature.shop.catalogue.storeselector.CatalogueStoreSelectorViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnQueryTextChange implements SearchViewBindingAdapter.OnQueryTextChange {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityCatalogueStoreSelectorBindingImpl f6835a;

    public interface Listener {
    }

    public OnQueryTextChange(ActivityCatalogueStoreSelectorBindingImpl activityCatalogueStoreSelectorBindingImpl) {
        this.f6835a = activityCatalogueStoreSelectorBindingImpl;
    }

    @Override // androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange
    public final boolean onQueryTextChange(String queryTextValue) {
        CatalogueStoreSelectorViewModel catalogueStoreSelectorViewModel = this.f6835a.C;
        if (catalogueStoreSelectorViewModel == null) {
            return false;
        }
        Intrinsics.h(queryTextValue, "queryTextValue");
        if (queryTextValue.length() < 3 && queryTextValue.length() != 0) {
            return true;
        }
        catalogueStoreSelectorViewModel.k.f(queryTextValue);
        return true;
    }
}
