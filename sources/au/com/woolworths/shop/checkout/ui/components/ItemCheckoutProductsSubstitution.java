package au.com.woolworths.shop.checkout.ui.components;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.details.d;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductSubstitution;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductSubstitutionOption;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductSubstitutionOptionId;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProducts;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@EpoxyModelClass
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/ItemCheckoutProductsSubstitution;", "Lcom/airbnb/epoxy/EpoxyModelWithHolder;", "Lau/com/woolworths/shop/checkout/ui/components/ItemCheckoutProductsSubstitution$ViewHolder;", "ViewHolder", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class ItemCheckoutProductsSubstitution extends EpoxyModelWithHolder<ViewHolder> {
    public CheckoutProducts n;
    public CheckoutProductListener o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/ItemCheckoutProductsSubstitution$ViewHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ViewHolder extends EpoxyHolder {

        /* renamed from: a, reason: collision with root package name */
        public TextView f10687a;
        public ImageButton b;
        public ImageView c;
        public Spinner d;

        @Override // com.airbnb.epoxy.EpoxyHolder
        public final void a(View itemView) {
            Intrinsics.h(itemView, "itemView");
            TextView textView = (TextView) itemView.findViewById(R.id.substitution_title_text_view);
            Intrinsics.h(textView, "<set-?>");
            this.f10687a = textView;
            ImageButton imageButton = (ImageButton) itemView.findViewById(R.id.tool_tip_button);
            Intrinsics.h(imageButton, "<set-?>");
            this.b = imageButton;
            ImageView imageView = (ImageView) itemView.findViewById(R.id.substitution_image_view);
            Intrinsics.h(imageView, "<set-?>");
            this.c = imageView;
            Spinner spinner = (Spinner) itemView.findViewById(R.id.substitution_spinner);
            Intrinsics.h(spinner, "<set-?>");
            this.d = spinner;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void h(ViewHolder holder) throws Throwable {
        Throwable th;
        Object next;
        Intrinsics.h(holder, "holder");
        CheckoutProducts checkoutProducts = this.n;
        if (checkoutProducts == null) {
            Intrinsics.p("products");
            throw null;
        }
        CheckoutProductSubstitution checkoutProductSubstitution = checkoutProducts.c;
        if (checkoutProductSubstitution != null) {
            final ArrayList arrayList = checkoutProductSubstitution.c;
            String str = checkoutProductSubstitution.b;
            TextView textView = holder.f10687a;
            if (textView == null) {
                Intrinsics.p("substitutionTitleTextView");
                throw null;
            }
            textView.setText(checkoutProductSubstitution.f10571a);
            ImageButton imageButton = holder.b;
            if (imageButton == null) {
                Intrinsics.p("toolTipButton");
                throw null;
            }
            imageButton.setOnClickListener(new androidx.navigation.ui.a(18, this, checkoutProductSubstitution));
            Spinner spinner = holder.d;
            if (spinner == null) {
                Intrinsics.p("substitutionSpinner");
                throw null;
            }
            final d dVar = new d(holder, 11);
            spinner.setAccessibilityDelegate(new ItemCheckoutProductsSubstitution$setup$1());
            spinner.setOnItemSelectedListener(null);
            ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((CheckoutProductSubstitutionOption) it.next()).f10572a);
            }
            th = null;
            ArrayAdapter arrayAdapter = new ArrayAdapter(spinner.getContext(), R.layout.item_checkout_substitution_option, arrayList2);
            arrayAdapter.setDropDownViewResource(R.layout.item_checkout_substitution_option_item);
            spinner.setAdapter((SpinnerAdapter) arrayAdapter);
            spinner.setSelection(arrayList2.indexOf(str), false);
            spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: au.com.woolworths.shop.checkout.ui.components.ItemCheckoutProductsSubstitution$setup$4
                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
                    ItemCheckoutProductsSubstitution itemCheckoutProductsSubstitution = this;
                    Callback.l(view);
                    try {
                        CheckoutProductSubstitutionOption checkoutProductSubstitutionOption = (CheckoutProductSubstitutionOption) arrayList.get(i);
                        dVar.invoke(Integer.valueOf(checkoutProductSubstitutionOption.b == CheckoutProductSubstitutionOptionId.f ? R.drawable.ic_substitution_not_allowed : R.drawable.ic_substitution_allowed));
                        CheckoutProductListener checkoutProductListener = itemCheckoutProductsSubstitution.o;
                        if (checkoutProductListener == null) {
                            Intrinsics.p(ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                            throw null;
                        }
                        CheckoutProducts checkoutProducts2 = itemCheckoutProductsSubstitution.n;
                        if (checkoutProducts2 == null) {
                            Intrinsics.p("products");
                            throw null;
                        }
                        checkoutProductListener.f1(checkoutProductSubstitutionOption, checkoutProducts2.e);
                        Callback.m();
                    } catch (Throwable th2) {
                        Callback.m();
                        throw th2;
                    }
                }

                @Override // android.widget.AdapterView.OnItemSelectedListener
                public final void onNothingSelected(AdapterView adapterView) {
                }
            });
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it2.next();
                    if (((CheckoutProductSubstitutionOption) next).f10572a.equals(str)) {
                        break;
                    }
                }
            }
            CheckoutProductSubstitutionOption checkoutProductSubstitutionOption = (CheckoutProductSubstitutionOption) next;
            if (checkoutProductSubstitutionOption != null) {
                ImageView imageView = holder.c;
                if (imageView == null) {
                    Intrinsics.p("substitutionImageView");
                    throw null;
                }
                imageView.setImageResource(checkoutProductSubstitutionOption.b == CheckoutProductSubstitutionOptionId.f ? R.drawable.ic_substitution_not_allowed : R.drawable.ic_substitution_allowed);
            }
        } else {
            th = null;
        }
        CheckoutProducts checkoutProducts2 = this.n;
        if (checkoutProducts2 == null) {
            Intrinsics.p("products");
            throw th;
        }
        int i = checkoutProducts2.c == null ? 8 : 0;
        TextView textView2 = holder.f10687a;
        if (textView2 == null) {
            Intrinsics.p("substitutionTitleTextView");
            throw th;
        }
        textView2.setVisibility(i);
        ImageButton imageButton2 = holder.b;
        if (imageButton2 == null) {
            Intrinsics.p("toolTipButton");
            throw th;
        }
        imageButton2.setVisibility(i);
        ImageView imageView2 = holder.c;
        if (imageView2 == null) {
            Intrinsics.p("substitutionImageView");
            throw th;
        }
        imageView2.setVisibility(i);
        Spinner spinner2 = holder.d;
        if (spinner2 != null) {
            spinner2.setVisibility(i);
        } else {
            Intrinsics.p("substitutionSpinner");
            throw th;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public void A(ViewHolder holder) {
        Intrinsics.h(holder, "holder");
        Spinner spinner = holder.d;
        if (spinner != null) {
            spinner.setOnItemSelectedListener(null);
        } else {
            Intrinsics.p("substitutionSpinner");
            throw null;
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        return R.layout.item_checkout_products_substitution;
    }
}
