package com.woolworths.scanlibrary.ui.productInfo.details.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ViewSimpleProductInfoBinding;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoContract;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;
import com.woolworths.scanlibrary.util.widget.ProductBadgeView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/views/SimpleItemProductView;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/views/ProductInformationView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public class SimpleItemProductView implements ProductInformationView {

    /* renamed from: a, reason: collision with root package name */
    public final Item f21295a;
    public final List b;
    public ViewSimpleProductInfoBinding c;
    public View d;
    public Context e;
    public ProductInfoContract.Presenter f;
    public Item g;
    public ProductInfoFragment h;

    public SimpleItemProductView(Item item, List list) {
        this.f21295a = item;
        this.b = list;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public boolean a() {
        return true;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewSimpleProductInfoBinding viewSimpleProductInfoBinding = (ViewSimpleProductInfoBinding) DataBindingUtil.c(layoutInflater, R.layout.view_simple_product_info, viewGroup, false, null);
        this.c = viewSimpleProductInfoBinding;
        if (viewSimpleProductInfoBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ProductBadgeView productBadgeView = viewSimpleProductInfoBinding.y;
        List list = this.b;
        Item item = this.f21295a;
        productBadgeView.setBadges(ItemExtKt.a(item, list));
        ViewSimpleProductInfoBinding viewSimpleProductInfoBinding2 = this.c;
        if (viewSimpleProductInfoBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = viewSimpleProductInfoBinding2.h;
        this.d = view;
        if (view == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        this.e = view.getContext();
        ViewSimpleProductInfoBinding viewSimpleProductInfoBinding3 = this.c;
        if (viewSimpleProductInfoBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewSimpleProductInfoBinding3.M(item);
        this.g = item;
        ViewSimpleProductInfoBinding viewSimpleProductInfoBinding4 = this.c;
        if (viewSimpleProductInfoBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewSimpleProductInfoBinding4.L(Boolean.valueOf(f()));
        ViewSimpleProductInfoBinding viewSimpleProductInfoBinding5 = this.c;
        if (viewSimpleProductInfoBinding5 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewSimpleProductInfoBinding5.F.setVisibility(ItemExtKt.b(item) ? 0 : 8);
        if (item.getItemIs().getLinkedpromo()) {
            ViewSimpleProductInfoBinding viewSimpleProductInfoBinding6 = this.c;
            if (viewSimpleProductInfoBinding6 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView = viewSimpleProductInfoBinding6.F;
            Context context = this.e;
            if (context == null) {
                Intrinsics.p("context");
                throw null;
            }
            textView.setText(context.getString(R.string.sng_label_savings_applied));
        } else if (item.getItemIs().getPromotionalitem()) {
            ViewSimpleProductInfoBinding viewSimpleProductInfoBinding7 = this.c;
            if (viewSimpleProductInfoBinding7 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView2 = viewSimpleProductInfoBinding7.F;
            Context context2 = this.e;
            if (context2 == null) {
                Intrinsics.p("context");
                throw null;
            }
            String string = context2.getString(R.string.sng_label_save);
            Intrinsics.g(string, "getString(...)");
            a.B(new Object[]{BigDecimalExtKt.a(item.getDiscountamount())}, 1, string, textView2);
        }
        if (item.getItemIs().getReducedtoclear()) {
            ViewSimpleProductInfoBinding viewSimpleProductInfoBinding8 = this.c;
            if (viewSimpleProductInfoBinding8 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            viewSimpleProductInfoBinding8.F.setVisibility(8);
        }
        ViewSimpleProductInfoBinding viewSimpleProductInfoBinding9 = this.c;
        if (viewSimpleProductInfoBinding9 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView textView3 = viewSimpleProductInfoBinding9.E;
        textView3.setVisibility(0);
        textView3.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 6));
        View view2 = this.d;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final View c() {
        return g();
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final void d(ProductInfoContract.Presenter presenter) {
        this.f = presenter;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final void e(ProductInfoFragment productInfoFragment) {
        this.h = productInfoFragment;
    }

    public final boolean f() {
        return Intrinsics.c(this.f21295a.getItemIs().getQuantityUpdateAllowed(), Boolean.TRUE);
    }

    public final TextView g() {
        ViewSimpleProductInfoBinding viewSimpleProductInfoBinding = this.c;
        if (viewSimpleProductInfoBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView itemQuantity = viewSimpleProductInfoBinding.C;
        Intrinsics.g(itemQuantity, "itemQuantity");
        return itemQuantity;
    }
}
