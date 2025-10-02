package com.woolworths.scanlibrary.ui.parking;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.woolworths.scanlibrary.analytics.ClickedScanFromProductInfoTracking;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.ui.navigation.ScreenNavigator;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListFragment;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListInterface;
import com.woolworths.scanlibrary.ui.payment.setup.AddPaymentSetupActivity;
import com.woolworths.scanlibrary.ui.productInfo.ProductInfoActivity;
import com.woolworths.scanlibrary.ui.productInfo.details.ProductInfoFragment;
import com.woolworths.scanlibrary.ui.productInfo.details.views.InterventionItemProductView;
import com.woolworths.scanlibrary.ui.productInfo.details.views.SimpleItemProductView;
import com.woolworths.scanlibrary.ui.productInfo.details.views.WeightRequiredItemProductView;
import com.woolworths.scanlibrary.ui.productInfo.details.views.WeightedItemProductView;
import com.woolworths.scanlibrary.ui.productsearch.SearchActivity;
import com.woolworths.scanlibrary.ui.productsearch.viewholder.NetworkStateItemViewHolder;
import com.woolworths.scanlibrary.ui.receipt.ReceiptActivity;
import com.woolworths.scanlibrary.ui.scanner.additem.AddItemActivity;
import com.woolworths.scanlibrary.ui.tandc.TermsConditionsActivity;
import com.woolworths.scanlibrary.ui.tandc.TermsConditionsContract;
import com.woolworths.scanlibrary.ui.weighted.WeightedArticleSelectionActivity;
import com.woolworths.scanlibrary.util.widget.MoreDetailAlertDialogHelper;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements View.OnClickListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ParkingVoucherActivity parkingVoucherActivity = (ParkingVoucherActivity) obj;
                int i2 = ParkingVoucherActivity.H;
                Callback.g(view);
                try {
                    parkingVoucherActivity.finish();
                    return;
                } finally {
                }
            case 1:
                InstrumentListFragment instrumentListFragment = (InstrumentListFragment) obj;
                Callback.g(view);
                try {
                    InstrumentListInterface.InstrumentListCallback instrumentListCallbackH2 = instrumentListFragment.h2();
                    if (instrumentListCallbackH2 != null) {
                        instrumentListCallbackH2.F4(((InstrumentListContract.Presenter) instrumentListFragment.Q1()).R());
                    }
                    return;
                } finally {
                }
            case 2:
                AddPaymentSetupActivity addPaymentSetupActivity = (AddPaymentSetupActivity) obj;
                int i3 = AddPaymentSetupActivity.G;
                Callback.g(view);
                try {
                    int i4 = AddPaymentActivity.M;
                    AddPaymentActivity.Companion.a(addPaymentSetupActivity, false);
                    return;
                } finally {
                }
            case 3:
                ProductInfoActivity productInfoActivity = (ProductInfoActivity) obj;
                int i5 = ProductInfoActivity.K;
                Callback.g(view);
                try {
                    ScreenNavigator screenNavigator = productInfoActivity.I;
                    if (screenNavigator == null) {
                        Intrinsics.p("screenNavigator");
                        throw null;
                    }
                    screenNavigator.a(productInfoActivity, null);
                    productInfoActivity.N4().b(new ClickedScanFromProductInfoTracking("Clicked Scan Button from PI"));
                    return;
                } finally {
                }
            case 4:
                ProductInfoFragment productInfoFragment = (ProductInfoFragment) obj;
                Callback.g(view);
                try {
                    ProductInfoFragment.h2(productInfoFragment);
                    return;
                } finally {
                }
            case 5:
                InterventionItemProductView interventionItemProductView = (InterventionItemProductView) obj;
                Callback.g(view);
                try {
                    ProductInfoFragment productInfoFragment2 = interventionItemProductView.h;
                    if (productInfoFragment2 == null) {
                        Intrinsics.p("productRemoveListener");
                        throw null;
                    }
                    Item item = interventionItemProductView.g;
                    if (item != null) {
                        productInfoFragment2.i2(item);
                        return;
                    } else {
                        Intrinsics.p("currentItem");
                        throw null;
                    }
                } finally {
                }
            case 6:
                SimpleItemProductView simpleItemProductView = (SimpleItemProductView) obj;
                Callback.g(view);
                try {
                    ProductInfoFragment productInfoFragment3 = simpleItemProductView.h;
                    if (productInfoFragment3 == null) {
                        Intrinsics.p("productRemoveListener");
                        throw null;
                    }
                    Item item2 = simpleItemProductView.g;
                    if (item2 != null) {
                        productInfoFragment3.i2(item2);
                        return;
                    } else {
                        Intrinsics.p("currentItem");
                        throw null;
                    }
                } finally {
                }
            case 7:
                WeightRequiredItemProductView weightRequiredItemProductView = (WeightRequiredItemProductView) obj;
                Callback.g(view);
                try {
                    ProductInfoFragment productInfoFragment4 = weightRequiredItemProductView.h;
                    if (productInfoFragment4 == null) {
                        Intrinsics.p("productRemoveListener");
                        throw null;
                    }
                    Item item3 = weightRequiredItemProductView.g;
                    if (item3 != null) {
                        productInfoFragment4.i2(item3);
                        return;
                    } else {
                        Intrinsics.p("currentItem");
                        throw null;
                    }
                } finally {
                }
            case 8:
                WeightedItemProductView weightedItemProductView = (WeightedItemProductView) obj;
                Callback.g(view);
                try {
                    ProductInfoFragment productInfoFragment5 = weightedItemProductView.h;
                    if (productInfoFragment5 == null) {
                        Intrinsics.p("productRemoveListener");
                        throw null;
                    }
                    Item item4 = weightedItemProductView.g;
                    if (item4 != null) {
                        productInfoFragment5.i2(item4);
                        return;
                    } else {
                        Intrinsics.p("currentItem");
                        throw null;
                    }
                } finally {
                }
            case 9:
                SearchActivity searchActivity = (SearchActivity) obj;
                int i6 = SearchActivity.M;
                Callback.g(view);
                try {
                    searchActivity.finish();
                    return;
                } finally {
                }
            case 10:
                NetworkStateItemViewHolder networkStateItemViewHolder = (NetworkStateItemViewHolder) obj;
                int i7 = NetworkStateItemViewHolder.c;
                Callback.g(view);
                try {
                    networkStateItemViewHolder.b.invoke();
                    return;
                } finally {
                }
            case 11:
                ReceiptActivity receiptActivity = (ReceiptActivity) obj;
                int i8 = ReceiptActivity.N;
                Callback.g(view);
                try {
                    receiptActivity.b5();
                    return;
                } finally {
                }
            case 12:
                AddItemActivity addItemActivity = (AddItemActivity) obj;
                int i9 = AddItemActivity.I;
                Callback.g(view);
                try {
                    addItemActivity.c5();
                    return;
                } finally {
                }
            case 13:
                TermsConditionsActivity termsConditionsActivity = (TermsConditionsActivity) obj;
                int i10 = TermsConditionsActivity.L;
                Callback.g(view);
                try {
                    ((TermsConditionsContract.Presenter) termsConditionsActivity.S4()).c0();
                    return;
                } finally {
                }
            case 14:
                WeightedArticleSelectionActivity weightedArticleSelectionActivity = (WeightedArticleSelectionActivity) obj;
                int i11 = WeightedArticleSelectionActivity.J;
                Callback.g(view);
                try {
                    weightedArticleSelectionActivity.finish();
                    return;
                } finally {
                }
            default:
                MoreDetailAlertDialogHelper moreDetailAlertDialogHelper = (MoreDetailAlertDialogHelper) obj;
                Lazy lazy = moreDetailAlertDialogHelper.j;
                Lazy lazy2 = moreDetailAlertDialogHelper.g;
                Callback.g(view);
                try {
                    if (((TextView) lazy2.getD()).getVisibility() == 0) {
                        ((TextView) lazy2.getD()).setVisibility(8);
                        ((ImageView) lazy.getD()).setImageResource(R.drawable.sng_ic_arrow_down_24dp);
                    } else {
                        ((TextView) lazy2.getD()).setVisibility(0);
                        ((ImageView) lazy.getD()).setImageResource(R.drawable.sng_ic_arrow_up_24dp);
                    }
                    return;
                } finally {
                }
        }
    }
}
