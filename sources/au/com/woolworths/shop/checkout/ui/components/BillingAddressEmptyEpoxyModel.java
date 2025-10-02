package au.com.woolworths.shop.checkout.ui.components;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.shop.checkout.databinding.ItemCheckoutSummaryBillingAddressEmptyBinding;
import au.com.woolworths.shop.checkout.domain.model.CheckoutSummaryBillingAddressEmpty;
import au.com.woolworths.shop.checkout.ui.details.c;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/BillingAddressEmptyEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/shop/checkout/ui/components/BillingAddressEmptyEpoxyModel$ViewHolder;", "ViewHolder", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BillingAddressEmptyEpoxyModel extends EpoxyModelWithHolder<ViewHolder> {
    public CheckoutSummaryBillingAddressEmpty n;
    public c o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/BillingAddressEmptyEpoxyModel$ViewHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewHolder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemCheckoutSummaryBillingAddressEmptyBinding f10681a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.button;
            Button button = (Button) ViewBindings.a(R.id.button, itemView);
            if (button != null) {
                i = R.id.display_text_view;
                TextView textView = (TextView) ViewBindings.a(R.id.display_text_view, itemView);
                if (textView != null) {
                    i = R.id.title_text_view;
                    TextView textView2 = (TextView) ViewBindings.a(R.id.title_text_view, itemView);
                    if (textView2 != null) {
                        this.f10681a = new ItemCheckoutSummaryBillingAddressEmptyBinding((ConstraintLayout) itemView, button, textView, textView2);
                        return;
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i)));
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void h(ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        ItemCheckoutSummaryBillingAddressEmptyBinding itemCheckoutSummaryBillingAddressEmptyBinding = holder.f10681a;
        if (itemCheckoutSummaryBillingAddressEmptyBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        Button button = itemCheckoutSummaryBillingAddressEmptyBinding.d;
        TextView textView = itemCheckoutSummaryBillingAddressEmptyBinding.f;
        CheckoutSummaryBillingAddressEmpty checkoutSummaryBillingAddressEmpty = this.n;
        if (checkoutSummaryBillingAddressEmpty == null) {
            Intrinsics.p("billingAddressEmpty");
            throw null;
        }
        textView.setText(checkoutSummaryBillingAddressEmpty.f10589a);
        TextView textView2 = itemCheckoutSummaryBillingAddressEmptyBinding.e;
        CheckoutSummaryBillingAddressEmpty checkoutSummaryBillingAddressEmpty2 = this.n;
        if (checkoutSummaryBillingAddressEmpty2 == null) {
            Intrinsics.p("billingAddressEmpty");
            throw null;
        }
        textView2.setText(checkoutSummaryBillingAddressEmpty2.b);
        CheckoutSummaryBillingAddressEmpty checkoutSummaryBillingAddressEmpty3 = this.n;
        if (checkoutSummaryBillingAddressEmpty3 == null) {
            Intrinsics.p("billingAddressEmpty");
            throw null;
        }
        button.setText(checkoutSummaryBillingAddressEmpty3.c);
        button.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 11));
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_checkout_summary_billing_address_empty;
    }
}
