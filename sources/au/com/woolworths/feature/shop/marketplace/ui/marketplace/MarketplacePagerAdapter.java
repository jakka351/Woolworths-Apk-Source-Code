package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import au.com.woolworths.feature.shop.marketplace.ui.brands.MarketplaceBrandsFragment;
import au.com.woolworths.feature.shop.marketplace.ui.categories.MarketplaceCategoriesFragment;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceContract;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment;
import au.com.woolworths.feature.shop.marketplace.ui.sellers.MarketplaceSellersFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplacePagerAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MarketplacePagerAdapter extends FragmentStateAdapter {
    public List p;

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment I(int i) {
        MarketplaceContract.Tab tab = (MarketplaceContract.Tab) this.p.get(i);
        if (tab instanceof MarketplaceContract.Tab.Personalised) {
            return new MarketplacePersonalisedFragment();
        }
        if (tab instanceof MarketplaceContract.Tab.Category) {
            return new MarketplaceCategoriesFragment();
        }
        if (tab instanceof MarketplaceContract.Tab.Brand) {
            return new MarketplaceBrandsFragment();
        }
        if (tab instanceof MarketplaceContract.Tab.Seller) {
            return new MarketplaceSellersFragment();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int i() {
        return this.p.size();
    }
}
