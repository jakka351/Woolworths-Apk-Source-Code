package au.com.woolworths.feature.shop.catalogue.generated.callback;

import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueDetailsBindingImpl;
import au.com.woolworths.feature.shop.catalogue.details.CatalogueDetailsViewModel;

/* loaded from: classes3.dex */
public final class OnPageSelectedListener implements au.com.woolworths.android.onesite.bindings.OnPageSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityCatalogueDetailsBindingImpl f6833a;

    public interface Listener {
    }

    public OnPageSelectedListener(ActivityCatalogueDetailsBindingImpl activityCatalogueDetailsBindingImpl) {
        this.f6833a = activityCatalogueDetailsBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.bindings.OnPageSelectedListener
    public final void a(int i) {
        CatalogueDetailsViewModel catalogueDetailsViewModel = this.f6833a.F;
        if (catalogueDetailsViewModel != null) {
            catalogueDetailsViewModel.r6(i);
        }
    }
}
