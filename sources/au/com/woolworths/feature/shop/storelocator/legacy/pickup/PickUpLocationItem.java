package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.EpoxyLegacyItemStoreLocatorLocationBinding;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import com.woolworths.R;
import com.xwray.groupie.databinding.BindableItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocationItem;", "Lcom/xwray/groupie/databinding/BindableItem;", "Lau/com/woolworths/feature/shop/storelocator/legacy/databinding/EpoxyLegacyItemStoreLocatorLocationBinding;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpLocationItem extends BindableItem<EpoxyLegacyItemStoreLocatorLocationBinding> {
    public static final /* synthetic */ int j = 0;
    public final Store g;
    public final Function1 h;
    public EpoxyLegacyItemStoreLocatorLocationBinding i;

    public PickUpLocationItem(Store pickUpLocation, Function1 function1) {
        Intrinsics.h(pickUpLocation, "pickUpLocation");
        this.g = pickUpLocation;
        this.h = function1;
    }

    @Override // com.xwray.groupie.Item
    public final int h() {
        return R.layout.epoxy_legacy_item_store_locator_location;
    }

    @Override // com.xwray.groupie.databinding.BindableItem
    public final void i(ViewDataBinding viewDataBinding) {
        EpoxyLegacyItemStoreLocatorLocationBinding viewBinding = (EpoxyLegacyItemStoreLocatorLocationBinding) viewDataBinding;
        Intrinsics.h(viewBinding, "viewBinding");
        this.i = viewBinding;
        Store store = this.g;
        viewBinding.L(store);
        viewBinding.h.setOnClickListener(new a(this, 0));
        ImageView imageView = viewBinding.A;
        Intrinsics.h(store, "<this>");
        ViewCompat.N(imageView, store.d);
        viewBinding.l();
    }
}
