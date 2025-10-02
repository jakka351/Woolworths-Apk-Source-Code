package au.com.woolworths.shop.checkout.ui.components;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.checkout.databinding.ItemOrderConfirmationSubtitleBinding;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/ConfirmationSubtitleEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/shop/checkout/ui/components/ConfirmationSubtitleEpoxyModel$ViewHolder;", "ViewHolder", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ConfirmationSubtitleEpoxyModel extends EpoxyModelWithHolder<ViewHolder> {
    public String n;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/ConfirmationSubtitleEpoxyModel$ViewHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewHolder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemOrderConfirmationSubtitleBinding f10685a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            TextView textView = (TextView) itemView;
            this.f10685a = new ItemOrderConfirmationSubtitleBinding(textView, textView);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void h(ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        ItemOrderConfirmationSubtitleBinding itemOrderConfirmationSubtitleBinding = holder.f10685a;
        if (itemOrderConfirmationSubtitleBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView subtitleTextView = itemOrderConfirmationSubtitleBinding.d;
        Intrinsics.g(subtitleTextView, "subtitleTextView");
        String str = this.n;
        if (str != null) {
            BindingAdaptersKt.l(subtitleTextView, str, false, null, null);
        } else {
            Intrinsics.p(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_order_confirmation_subtitle;
    }
}
