package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ItemPickUpLocationItemHeaderBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import com.woolworths.R;
import com.xwray.groupie.databinding.BindableItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocationItemHeader;", "Lcom/xwray/groupie/databinding/BindableItem;", "Lau/com/woolworths/feature/shop/storelocator/legacy/databinding/ItemPickUpLocationItemHeaderBinding;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpLocationItemHeader extends BindableItem<ItemPickUpLocationItemHeaderBinding> {
    public final PickUpLocatorContract.SectionType g;

    public PickUpLocationItemHeader(PickUpLocatorContract.SectionType sectionHeader) {
        Intrinsics.h(sectionHeader, "sectionHeader");
        this.g = sectionHeader;
    }

    @Override // com.xwray.groupie.Item
    public final int h() {
        return R.layout.item_pick_up_location_item_header;
    }

    @Override // com.xwray.groupie.databinding.BindableItem
    public final void i(ViewDataBinding viewDataBinding) {
        ItemPickUpLocationItemHeaderBinding viewBinding = (ItemPickUpLocationItemHeaderBinding) viewDataBinding;
        Intrinsics.h(viewBinding, "viewBinding");
        viewBinding.L(this.g);
        viewBinding.l();
    }
}
