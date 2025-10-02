package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyItemStoreLocatorSuburbMatchBinding;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import com.woolworths.R;
import com.xwray.groupie.databinding.BindableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpSuburbItem;", "Lcom/xwray/groupie/databinding/BindableItem;", "Lau/com/woolworths/feature/shop/storelocator/legacy/databinding/EpoxyItemStoreLocatorSuburbMatchBinding;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpSuburbItem extends BindableItem<EpoxyItemStoreLocatorSuburbMatchBinding> {
    public static final /* synthetic */ int i = 0;
    public final PickUpSuburb g;
    public final PickUpLocatorViewModel h;

    public PickUpSuburbItem(PickUpSuburb suburbInfo, PickUpLocatorViewModel locatorViewModel) {
        Intrinsics.h(suburbInfo, "suburbInfo");
        Intrinsics.h(locatorViewModel, "locatorViewModel");
        this.g = suburbInfo;
        this.h = locatorViewModel;
    }

    @Override // com.xwray.groupie.Item
    public final int h() {
        return R.layout.epoxy_item_store_locator_suburb_match;
    }

    @Override // com.xwray.groupie.databinding.BindableItem
    public final void i(ViewDataBinding viewDataBinding) {
        EpoxyItemStoreLocatorSuburbMatchBinding viewBinding = (EpoxyItemStoreLocatorSuburbMatchBinding) viewDataBinding;
        Intrinsics.h(viewBinding, "viewBinding");
        viewBinding.M(this.g);
        viewBinding.L(this.h.n);
        viewBinding.h.setOnClickListener(new a(this, 1));
        viewBinding.l();
    }
}
