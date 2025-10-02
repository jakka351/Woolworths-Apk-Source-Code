package au.com.woolworths.shop.checkout.ui.components;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.checkout.databinding.ItemOrderConfirmationBannerImageBinding;
import au.com.woolworths.shop.checkout.domain.model.confirmation.OrderConfirmationContent;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/BannerImageEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/shop/checkout/ui/components/BannerImageEpoxyModel$ViewHolder;", "ViewHolder", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BannerImageEpoxyModel extends EpoxyModelWithHolder<ViewHolder> {
    public OrderConfirmationContent.BannerImage n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/BannerImageEpoxyModel$ViewHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewHolder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemOrderConfirmationBannerImageBinding f10680a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            ImageView imageView = (ImageView) ViewBindings.a(R.id.image_view, itemView);
            if (imageView == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(R.id.image_view)));
            }
            this.f10680a = new ItemOrderConfirmationBannerImageBinding((FrameLayout) itemView, imageView);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void h(ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        ItemOrderConfirmationBannerImageBinding itemOrderConfirmationBannerImageBinding = holder.f10680a;
        if (itemOrderConfirmationBannerImageBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ImageView imageView = itemOrderConfirmationBannerImageBinding.e;
        OrderConfirmationContent.BannerImage bannerImage = this.n;
        if (bannerImage == null) {
            Intrinsics.p("bannerImage");
            throw null;
        }
        imageView.setContentDescription(bannerImage.getAltText());
        OrderConfirmationContent.BannerImage bannerImage2 = this.n;
        if (bannerImage2 != null) {
            BindingAdaptersKt.e(imageView, bannerImage2.getImageUrl(), null);
        } else {
            Intrinsics.p("bannerImage");
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_order_confirmation_banner_image;
    }
}
