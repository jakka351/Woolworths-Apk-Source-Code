package au.com.woolworths.shop.checkout.ui.components;

import android.app.AlertDialog;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import au.com.woolworths.feature.product.list.q;
import au.com.woolworths.shop.checkout.databinding.ItemCheckoutOrderTotalSectionBinding;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderDetailSectionMessage;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection;
import au.com.woolworths.shop.checkout.ui.listener.OrderTotalListener;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/OrderTotalSectionEpoxyModel;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/shop/checkout/ui/components/OrderTotalSectionEpoxyModel$ViewHolder;", "ViewHolder", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class OrderTotalSectionEpoxyModel extends EpoxyModelWithHolder<ViewHolder> {
    public OrderTotalDetailsSection n;
    public OrderTotalListener o;
    public SpannableStringBuilder p;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/OrderTotalSectionEpoxyModel$ViewHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewHolder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public ItemCheckoutOrderTotalSectionBinding f10689a;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            int i = R.id.help_image_button;
            ImageButton imageButton = (ImageButton) ViewBindings.a(R.id.help_image_button, itemView);
            if (imageButton != null) {
                i = R.id.info_image_button;
                ImageButton imageButton2 = (ImageButton) ViewBindings.a(R.id.info_image_button, itemView);
                if (imageButton2 != null) {
                    i = R.id.label_text_view;
                    TextView textView = (TextView) ViewBindings.a(R.id.label_text_view, itemView);
                    if (textView != null) {
                        i = R.id.value_image_view;
                        ImageView imageView = (ImageView) ViewBindings.a(R.id.value_image_view, itemView);
                        if (imageView != null) {
                            i = R.id.value_text_view;
                            TextView textView2 = (TextView) ViewBindings.a(R.id.value_text_view, itemView);
                            if (textView2 != null) {
                                this.f10689a = new ItemCheckoutOrderTotalSectionBinding((ConstraintLayout) itemView, imageButton, imageButton2, textView, imageView, textView2);
                                return;
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(itemView.getResources().getResourceName(i)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel.ViewHolder r8) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.h(r8, r0)
            au.com.woolworths.shop.checkout.databinding.ItemCheckoutOrderTotalSectionBinding r8 = r8.f10689a
            r0 = 0
            if (r8 == 0) goto Lcc
            android.widget.TextView r1 = r8.f
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r2 = r7.K()
            java.lang.String r2 = r2.f10647a
            r1.setText(r2)
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r2 = r7.K()
            au.com.woolworths.shop.checkout.domain.model.breakdown.DetailsSectionValueType r2 = r2.b
            int r3 = r2.d
            r1.setTextAppearance(r3)
            java.lang.Integer r2 = r2.e
            java.lang.String r3 = "getContext(...)"
            if (r2 == 0) goto L38
            int r2 = r2.intValue()
            android.content.Context r4 = r1.getContext()
            kotlin.jvm.internal.Intrinsics.g(r4, r3)
            int r2 = au.com.woolworths.android.onesite.utils.Extensions.a(r2, r4)
            r1.setTextColor(r2)
        L38:
            android.widget.ImageView r1 = r8.g
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r2 = r7.K()
            java.lang.String r2 = r2.e
            au.com.woolworths.android.onesite.bindings.BindingAdaptersKt.e(r1, r2, r0)
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r2 = r7.K()
            java.lang.String r2 = r2.e
            r4 = 8
            r5 = 0
            if (r2 == 0) goto L50
            r2 = r5
            goto L51
        L50:
            r2 = r4
        L51:
            r1.setVisibility(r2)
            android.widget.ImageButton r1 = r8.d
            au.com.woolworths.shop.checkout.ui.components.b r2 = new au.com.woolworths.shop.checkout.ui.components.b
            r6 = 0
            r2.<init>(r7)
            r1.setOnClickListener(r2)
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r2 = r7.K()
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderDetailSectionMessage r2 = r2.f
            if (r2 == 0) goto L79
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r2 = r7.K()
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderDetailSectionMessage r2 = r2.f
            if (r2 == 0) goto L72
            au.com.woolworths.shop.checkout.domain.model.breakdown.MessageType r2 = r2.c
            goto L73
        L72:
            r2 = r0
        L73:
            au.com.woolworths.shop.checkout.domain.model.breakdown.MessageType r6 = au.com.woolworths.shop.checkout.domain.model.breakdown.MessageType.e
            if (r2 == r6) goto L79
            r2 = r5
            goto L7a
        L79:
            r2 = r4
        L7a:
            r1.setVisibility(r2)
            android.widget.ImageButton r1 = r8.e
            au.com.woolworths.shop.checkout.ui.components.b r2 = new au.com.woolworths.shop.checkout.ui.components.b
            r6 = 1
            r2.<init>(r7)
            r1.setOnClickListener(r2)
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r2 = r7.K()
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderDetailSectionMessage r2 = r2.f
            if (r2 == 0) goto L92
            au.com.woolworths.shop.checkout.domain.model.breakdown.MessageType r0 = r2.c
        L92:
            au.com.woolworths.shop.checkout.domain.model.breakdown.MessageType r2 = au.com.woolworths.shop.checkout.domain.model.breakdown.MessageType.e
            if (r0 != r2) goto L97
            r4 = r5
        L97:
            r1.setVisibility(r4)
            android.widget.TextView r8 = r8.h
            android.text.SpannableStringBuilder r0 = r7.p
            if (r0 == 0) goto La1
            goto La7
        La1:
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r0 = r7.K()
            java.lang.String r0 = r0.c
        La7:
            r8.setText(r0)
            au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsSection r0 = r7.K()
            au.com.woolworths.shop.checkout.domain.model.breakdown.DetailsSectionValueType r0 = r0.d
            int r1 = r0.d
            r8.setTextAppearance(r1)
            java.lang.Integer r0 = r0.e
            if (r0 == 0) goto Lcb
            int r0 = r0.intValue()
            android.content.Context r1 = r8.getContext()
            kotlin.jvm.internal.Intrinsics.g(r1, r3)
            int r0 = au.com.woolworths.android.onesite.utils.Extensions.a(r0, r1)
            r8.setTextColor(r0)
        Lcb:
            return
        Lcc:
            java.lang.String r8 = "binding"
            kotlin.jvm.internal.Intrinsics.p(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel.h(au.com.woolworths.shop.checkout.ui.components.OrderTotalSectionEpoxyModel$ViewHolder):void");
    }

    public final OrderTotalDetailsSection K() {
        OrderTotalDetailsSection orderTotalDetailsSection = this.n;
        if (orderTotalDetailsSection != null) {
            return orderTotalDetailsSection;
        }
        Intrinsics.p("orderTotalDetails");
        throw null;
    }

    public final void L(OrderDetailSectionMessage orderDetailSectionMessage, Context context) {
        if (orderDetailSectionMessage != null) {
            String str = orderDetailSectionMessage.b;
            String str2 = orderDetailSectionMessage.f10646a;
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            if (str2 != null && str2.length() != 0) {
                builder.setTitle(str2);
            }
            if (str != null && str.length() != 0) {
                builder.setMessage(str);
            }
            builder.setPositiveButton(R.string.ok, new q(1));
            builder.create();
            builder.show();
            OrderTotalListener orderTotalListener = this.o;
            if (orderTotalListener != null) {
                orderTotalListener.v4(str2);
            }
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_checkout_order_total_section;
    }
}
