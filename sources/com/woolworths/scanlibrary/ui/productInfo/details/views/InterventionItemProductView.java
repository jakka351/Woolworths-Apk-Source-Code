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
import com.woolworths.scanlibrary.databinding.ViewInterventionProductInfoBinding;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/productInfo/details/views/InterventionItemProductView;", "Lcom/woolworths/scanlibrary/ui/productInfo/details/views/ProductInformationView;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InterventionItemProductView implements ProductInformationView {

    /* renamed from: a, reason: collision with root package name */
    public final Item f21294a;
    public final List b;
    public ViewInterventionProductInfoBinding c;
    public View d;
    public Context e;
    public ProductInfoContract.Presenter f;
    public Item g;
    public ProductInfoFragment h;

    public InterventionItemProductView(Item item, List list) {
        this.f21294a = item;
        this.b = list;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final boolean a() {
        return false;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewInterventionProductInfoBinding viewInterventionProductInfoBinding = (ViewInterventionProductInfoBinding) DataBindingUtil.c(layoutInflater, R.layout.view_intervention_product_info, viewGroup, false, null);
        this.c = viewInterventionProductInfoBinding;
        if (viewInterventionProductInfoBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ProductBadgeView productBadgeView = viewInterventionProductInfoBinding.y;
        List list = this.b;
        Item item = this.f21294a;
        productBadgeView.setBadges(ItemExtKt.a(item, list));
        ViewInterventionProductInfoBinding viewInterventionProductInfoBinding2 = this.c;
        if (viewInterventionProductInfoBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = viewInterventionProductInfoBinding2.h;
        this.d = view;
        if (view == null) {
            Intrinsics.p("rootView");
            throw null;
        }
        this.e = view.getContext();
        ViewInterventionProductInfoBinding viewInterventionProductInfoBinding3 = this.c;
        if (viewInterventionProductInfoBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewInterventionProductInfoBinding3.M(item);
        this.g = item;
        ViewInterventionProductInfoBinding viewInterventionProductInfoBinding4 = this.c;
        if (viewInterventionProductInfoBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewInterventionProductInfoBinding4.L(Boolean.valueOf(Intrinsics.c(item.getItemIs().getQuantityUpdateAllowed(), Boolean.TRUE)));
        ViewInterventionProductInfoBinding viewInterventionProductInfoBinding5 = this.c;
        if (viewInterventionProductInfoBinding5 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewInterventionProductInfoBinding5.E.setVisibility(ItemExtKt.b(item) ? 0 : 8);
        if (item.getItemIs().getLinkedpromo()) {
            ViewInterventionProductInfoBinding viewInterventionProductInfoBinding6 = this.c;
            if (viewInterventionProductInfoBinding6 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView = viewInterventionProductInfoBinding6.E;
            Context context = this.e;
            if (context == null) {
                Intrinsics.p("context");
                throw null;
            }
            textView.setText(context.getString(R.string.sng_label_savings_applied));
        } else if (item.getItemIs().getPromotionalitem()) {
            ViewInterventionProductInfoBinding viewInterventionProductInfoBinding7 = this.c;
            if (viewInterventionProductInfoBinding7 == null) {
                Intrinsics.p("binding");
                throw null;
            }
            TextView textView2 = viewInterventionProductInfoBinding7.E;
            Context context2 = this.e;
            if (context2 == null) {
                Intrinsics.p("context");
                throw null;
            }
            String string = context2.getString(R.string.sng_label_save);
            Intrinsics.g(string, "getString(...)");
            a.B(new Object[]{BigDecimalExtKt.a(item.getDiscountamount())}, 1, string, textView2);
        }
        ViewInterventionProductInfoBinding viewInterventionProductInfoBinding8 = this.c;
        if (viewInterventionProductInfoBinding8 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        viewInterventionProductInfoBinding8.D.setOnClickListener(new com.woolworths.scanlibrary.ui.parking.a(this, 5));
        View view2 = this.d;
        if (view2 != null) {
            return view2;
        }
        Intrinsics.p("rootView");
        throw null;
    }

    @Override // com.woolworths.scanlibrary.ui.productInfo.details.views.ProductInformationView
    public final View c() {
        ViewInterventionProductInfoBinding viewInterventionProductInfoBinding = this.c;
        if (viewInterventionProductInfoBinding != null) {
            return viewInterventionProductInfoBinding.B;
        }
        Intrinsics.p("binding");
        throw null;
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
