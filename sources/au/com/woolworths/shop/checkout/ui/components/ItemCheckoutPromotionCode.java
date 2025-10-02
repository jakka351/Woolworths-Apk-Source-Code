package au.com.woolworths.shop.checkout.ui.components;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionCode;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionDiscounts;
import au.com.woolworths.shop.checkout.ui.product.CheckoutPromoCodeListener;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/ItemCheckoutPromotionCode;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/shop/checkout/ui/components/ItemCheckoutPromotionCode$ViewHolder;", "ViewHolder", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class ItemCheckoutPromotionCode extends EpoxyModelWithHolder<ViewHolder> {
    public CheckoutPromotionCode n;
    public CheckoutPromoCodeListener o;
    public ItemCheckoutPromotionCode$addTextChangedListener$1 p;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/ItemCheckoutPromotionCode$ViewHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewHolder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public TextInputLayout f10688a;
        public TextInputEditText b;
        public Button c;
        public View d;
        public EpoxyRecyclerView e;
        public Button f;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            TextInputLayout textInputLayout = (TextInputLayout) itemView.findViewById(R.id.text_input_layout);
            Intrinsics.h(textInputLayout, "<set-?>");
            this.f10688a = textInputLayout;
            TextInputEditText textInputEditText = (TextInputEditText) itemView.findViewById(R.id.text_input_edit_text);
            Intrinsics.h(textInputEditText, "<set-?>");
            this.b = textInputEditText;
            Button button = (Button) itemView.findViewById(R.id.promo_apply_button);
            Intrinsics.h(button, "<set-?>");
            this.c = button;
            View viewFindViewById = itemView.findViewById(R.id.discounts_container);
            Intrinsics.h(viewFindViewById, "<set-?>");
            this.d = viewFindViewById;
            EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) itemView.findViewById(R.id.discounts_recycler_view);
            Intrinsics.h(epoxyRecyclerView, "<set-?>");
            this.e = epoxyRecyclerView;
            Button button2 = (Button) itemView.findViewById(R.id.promo_remove_button);
            Intrinsics.h(button2, "<set-?>");
            this.f = button2;
        }

        public final TextInputEditText b() {
            TextInputEditText textInputEditText = this.b;
            if (textInputEditText != null) {
                return textInputEditText;
            }
            Intrinsics.p("textInputEditText");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.text.TextWatcher, au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode$addTextChangedListener$1] */
    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void h(final ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        TextInputLayout textInputLayout = holder.f10688a;
        if (textInputLayout == null) {
            Intrinsics.p("textInputLayout");
            throw null;
        }
        CheckoutPromotionCode checkoutPromotionCode = this.n;
        if (checkoutPromotionCode == null) {
            Intrinsics.p("promotionCode");
            throw null;
        }
        textInputLayout.setHint(checkoutPromotionCode.b);
        TextInputEditText textInputEditTextB = holder.b();
        final Button button = holder.c;
        if (button == null) {
            Intrinsics.p("promoApplyButton");
            throw null;
        }
        ?? r5 = new TextWatcher() { // from class: au.com.woolworths.shop.checkout.ui.components.ItemCheckoutPromotionCode$addTextChangedListener$1
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
                boolean z = false;
                if (editable != null && editable.length() > 0) {
                    z = true;
                }
                button.setEnabled(z);
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.p = r5;
        textInputEditTextB.addTextChangedListener(r5);
        holder.b().setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: au.com.woolworths.shop.checkout.ui.components.a
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                if (i != 6) {
                    return false;
                }
                CheckoutPromoCodeListener checkoutPromoCodeListener = this.d.o;
                if (checkoutPromoCodeListener != null) {
                    checkoutPromoCodeListener.Z2(String.valueOf(holder.b().getText()));
                    return true;
                }
                Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                throw null;
            }
        });
        Button button2 = holder.c;
        if (button2 == null) {
            Intrinsics.p("promoApplyButton");
            throw null;
        }
        holder.b().setText("");
        CheckoutPromotionCode checkoutPromotionCode2 = this.n;
        if (checkoutPromotionCode2 == null) {
            Intrinsics.p("promotionCode");
            throw null;
        }
        button2.setText(checkoutPromotionCode2.c);
        button2.setOnClickListener(new androidx.navigation.ui.a(19, this, holder));
        View view = holder.d;
        if (view == null) {
            Intrinsics.p("discountsContainer");
            throw null;
        }
        CheckoutPromotionCode checkoutPromotionCode3 = this.n;
        if (checkoutPromotionCode3 == null) {
            Intrinsics.p("promotionCode");
            throw null;
        }
        CheckoutPromotionDiscounts checkoutPromotionDiscounts = checkoutPromotionCode3.d;
        view.setVisibility((checkoutPromotionDiscounts == null || !(checkoutPromotionDiscounts.f10579a.isEmpty() ^ true)) ? 8 : 0);
        CheckoutPromotionCode checkoutPromotionCode4 = this.n;
        if (checkoutPromotionCode4 == null) {
            Intrinsics.p("promotionCode");
            throw null;
        }
        CheckoutPromotionDiscounts checkoutPromotionDiscounts2 = checkoutPromotionCode4.d;
        if (checkoutPromotionDiscounts2 != null) {
            Button button3 = holder.f;
            if (button3 == null) {
                Intrinsics.p("promoRemoveButton");
                throw null;
            }
            button3.setText(checkoutPromotionDiscounts2.b);
            button3.setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 12));
            EpoxyRecyclerView epoxyRecyclerView = holder.e;
            if (epoxyRecyclerView != null) {
                epoxyRecyclerView.F0(new d(checkoutPromotionDiscounts2, 12));
            } else {
                Intrinsics.p("discountsRecyclerView");
                throw null;
            }
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void A(ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        holder.b().removeTextChangedListener(this.p);
        this.p = null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_checkout_promotion_code;
    }
}
