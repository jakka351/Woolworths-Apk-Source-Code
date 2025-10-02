package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.legacy.ItemDeliveryAddressSearchResultBindingModel_;
import au.com.woolworths.android.onesite.legacy.ItemDeliveryAddressSearchResultFooterBindingModel_;
import au.com.woolworths.android.onesite.legacy.ItemDeliveryAddressSearchResultHeaderBindingModel_;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import com.airbnb.epoxy.TypedEpoxyController;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchController;", "Lcom/airbnb/epoxy/TypedEpoxyController;", "", "Lau/com/woolworths/base/shopapp/models/address/AddressResult$Address;", "handler", "Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchResultClickListener;", "<init>", "(Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchResultClickListener;)V", "getHandler", "()Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchResultClickListener;", "buildModels", "", "data", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeliveryAddressSearchController extends TypedEpoxyController<List<? extends AddressResult.Address>> {
    public static final int $stable = 8;

    @NotNull
    private final DeliveryAddressSearchResultClickListener handler;

    public DeliveryAddressSearchController(@NotNull DeliveryAddressSearchResultClickListener handler) {
        Intrinsics.h(handler, "handler");
        this.handler = handler;
    }

    @NotNull
    public final DeliveryAddressSearchResultClickListener getHandler() {
        return this.handler;
    }

    @Override // com.airbnb.epoxy.TypedEpoxyController
    public void buildModels(@NotNull List<? extends AddressResult.Address> data) {
        Intrinsics.h(data, "data");
        ItemDeliveryAddressSearchResultHeaderBindingModel_ itemDeliveryAddressSearchResultHeaderBindingModel_ = new ItemDeliveryAddressSearchResultHeaderBindingModel_();
        itemDeliveryAddressSearchResultHeaderBindingModel_.M();
        add(itemDeliveryAddressSearchResultHeaderBindingModel_);
        for (AddressResult.Address address : data) {
            ItemDeliveryAddressSearchResultBindingModel_ itemDeliveryAddressSearchResultBindingModel_ = new ItemDeliveryAddressSearchResultBindingModel_();
            itemDeliveryAddressSearchResultBindingModel_.M("delivery_address_result_" + address.b());
            itemDeliveryAddressSearchResultBindingModel_.t();
            itemDeliveryAddressSearchResultBindingModel_.n = address;
            DeliveryAddressSearchResultClickListener deliveryAddressSearchResultClickListener = this.handler;
            itemDeliveryAddressSearchResultBindingModel_.t();
            itemDeliveryAddressSearchResultBindingModel_.o = deliveryAddressSearchResultClickListener;
            add(itemDeliveryAddressSearchResultBindingModel_);
        }
        ItemDeliveryAddressSearchResultFooterBindingModel_ itemDeliveryAddressSearchResultFooterBindingModel_ = new ItemDeliveryAddressSearchResultFooterBindingModel_();
        itemDeliveryAddressSearchResultFooterBindingModel_.M();
        DeliveryAddressSearchResultClickListener deliveryAddressSearchResultClickListener2 = this.handler;
        itemDeliveryAddressSearchResultFooterBindingModel_.t();
        itemDeliveryAddressSearchResultFooterBindingModel_.n = deliveryAddressSearchResultClickListener2;
        add(itemDeliveryAddressSearchResultFooterBindingModel_);
    }
}
