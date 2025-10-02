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
import com.woolworths.scanlibrary.databinding.ViewWeightedItemProductInfoBinding;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/views/WeightedItemProductView;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/views/ProductInformationView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WeightedItemProductView implements ProductInformationView {

    /* renamed from: a, reason: collision with root package name */
    public final Item f21297a;
    public final List b;
    public ViewWeightedItemProductInfoBinding c;
    public View d;
    public Context e;
    public ProductInfoContract.Presenter f;
    public Item g;
    public ProductInfoFragment h;

    public WeightedItemProductView(Item item, List list) {
        this.f21297a = item;
        this.b = list;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final boolean a() {
        return true;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewWeightedItemProductInfoBinding viewWeightedItemProductInfoBinding = (ViewWeightedItemProductInfoBinding) DataBindingUtil.c(layoutInflater, R.layout.view_weighted_item_product_info, viewGroup, false, null);
        this.c = viewWeightedItemProductInfoBinding;
        if (viewWeightedItemProductInfoBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ProductBadgeView productBadgeView = viewWeightedItemProductInfoBinding.y;
        List list = this.b;
        Item item = this.f21297a;
        productBadgeView.setBadges(ItemExtKt.a(item, list));
        ViewWeightedItemProductInfoBinding viewWeightedItemProductInfoBinding2 = this.c;
        if (viewWeightedItemProductInfoBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = viewWeightedItemProductInfoBinding2.h;
        this.d = view;
        if (view == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        this.e = view.getContext();
        ViewWeightedItemProductInfoBinding viewWeightedItemProductInfoBinding3 = this.c;
        if (viewWeightedItemProductInfoBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewWeightedItemProductInfoBinding3.L(item);
        this.g = item;
        ViewWeightedItemProductInfoBinding viewWeightedItemProductInfoBinding4 = this.c;
        if (viewWeightedItemProductInfoBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewWeightedItemProductInfoBinding4.G.setVisibility(ItemExtKt.b(item) ? 0 : 8);
        if (item.getItemIs().getLinkedpromo()) {
            ViewWeightedItemProductInfoBinding viewWeightedItemProductInfoBinding5 = this.c;
            if (viewWeightedItemProductInfoBinding5 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView = viewWeightedItemProductInfoBinding5.G;
            Context context = this.e;
            if (context == null) {
                Intrinsics.p("context");
                throw null;
            }
            textView.setText(context.getString(R.string.sng_label_savings_applied));
        } else if (item.getItemIs().getPromotionalitem()) {
            ViewWeightedItemProductInfoBinding viewWeightedItemProductInfoBinding6 = this.c;
            if (viewWeightedItemProductInfoBinding6 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView2 = viewWeightedItemProductInfoBinding6.G;
            Context context2 = this.e;
            if (context2 == null) {
                Intrinsics.p("context");
                throw null;
            }
            String string = context2.getString(R.string.sng_label_save);
            Intrinsics.g(string, "getString(...)");
            a.B(new Object[]{BigDecimalExtKt.a(item.getDiscountamount())}, 1, string, textView2);
        }
        ViewWeightedItemProductInfoBinding viewWeightedItemProductInfoBinding7 = this.c;
        if (viewWeightedItemProductInfoBinding7 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        TextView textView3 = viewWeightedItemProductInfoBinding7.F;
        textView3.setVisibility(0);
        textView3.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 8));
        View view2 = this.d;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final View c() {
        return null;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final void d(ProductInfoContract.Presenter presenter) {
        this.f = presenter;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final void e(ProductInfoFragment productInfoFragment) {
        this.h = productInfoFragment;
    }
}
