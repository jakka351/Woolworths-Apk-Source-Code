package com.woolworths.scanlibrary.ui.receipt;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.ReceiptScreenTracking;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.domain.receipt.GetEmailReceiptUC;
import com.woolworths.scanlibrary.models.cart.Promotion;
import com.woolworths.scanlibrary.models.discount.Discount;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import com.woolworths.scanlibrary.models.receipt.ReceiptItem;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import com.woolworths.scanlibrary.models.receipt.VoucherInfo;
import com.woolworths.scanlibrary.models.receipt.Vouchers;
import com.woolworths.scanlibrary.ui.receipt.ReceiptContract;
import com.woolworths.scanlibrary.ui.receipt.adapter.AppliedPromotion;
import com.woolworths.scanlibrary.ui.receipt.adapter.DashedDivider;
import com.woolworths.scanlibrary.ui.receipt.adapter.GeneralVoucher;
import com.woolworths.scanlibrary.ui.receipt.adapter.Item;
import com.woolworths.scanlibrary.ui.receipt.adapter.ParkingVoucher;
import com.woolworths.scanlibrary.ui.receipt.adapter.PosBarcode;
import com.woolworths.scanlibrary.ui.receipt.adapter.Title;
import com.woolworths.scanlibrary.ui.receipt.adapter.TotalDiscount;
import com.woolworths.scanlibrary.ui.receipt.adapter.TotalPayment;
import com.woolworths.scanlibrary.util.discount.DiscountComparator;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/ReceiptPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/receipt/ReceiptContract$View;", "Lcom/woolworths/scanlibrary/ui/receipt/ReceiptContract$Presenter;", "GetEmailReceiptObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReceiptPresenter extends BasePresenter<ReceiptContract.View> implements ReceiptContract.Presenter {
    public final GetEmailReceiptUC c;
    public final AnalyticsProvider d;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/ReceiptPresenter$GetEmailReceiptObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/receipt/GetEmailReceiptUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class GetEmailReceiptObserver extends BaseDisposableObserver<GetEmailReceiptUC.ResponseValue> {
        public final ReceiptContract.View g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetEmailReceiptObserver(ReceiptContract.View view) {
            super(view, 24);
            Intrinsics.h(view, "view");
            this.g = view;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            this.e.n(i, i2, apigeeErrorResponse, function0);
            this.g.N3(false);
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetEmailReceiptUC.ResponseValue response = (GetEmailReceiptUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            ReceiptContract.View view = this.g;
            view.N3(false);
            view.D3(response.f21200a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceiptPresenter(ReceiptContract.View view, GetEmailReceiptUC getEmailReceiptUC, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = getEmailReceiptUC;
        this.d = analyticsAggregator;
        analyticsAggregator.a(new ReceiptScreenTracking("Receipt Screen"));
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.ReceiptContract.Presenter
    public final void L(String cartId) {
        Intrinsics.h(cartId, "cartId");
        MvpView mvpView = this.f21139a;
        ((ReceiptContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.c.b(new GetEmailReceiptUC.RequestValues(cartId)).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "getView(...)");
        GetEmailReceiptObserver getEmailReceiptObserver = new GetEmailReceiptObserver((ReceiptContract.View) mvpView);
        singleObserveOnF.a(getEmailReceiptObserver);
        this.b.d(getEmailReceiptObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.ReceiptContract.Presenter
    public final ArrayList Q(Receipt receipt) {
        Voucher parking;
        List<Promotion> offers;
        Intrinsics.h(receipt, "receipt");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Title(receipt.getStoreInfo().getName(), receipt.getReceiptMessage()));
        for (ReceiptItem receiptItem : receipt.getLineItems()) {
            arrayList.add(new Item(receiptItem));
            receipt.getOffers();
            ArrayList arrayList2 = new ArrayList();
            if (receiptItem.getItemIs().getPromotionalItem() && (offers = receiptItem.getOffers()) != null && (!offers.isEmpty())) {
                Iterator<Promotion> it = receiptItem.getOffers().iterator();
                while (it.hasNext()) {
                    arrayList2.add(new AppliedPromotion(it.next()));
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.addAll(arrayList2);
            }
        }
        if (!receipt.getTotalDiscounts().isEmpty()) {
            arrayList.add(new DashedDivider(4));
            List<Discount> discounts = receipt.getTotalDiscounts();
            Intrinsics.h(discounts, "discounts");
            for (Discount discount : CollectionsKt.u0(new DiscountComparator(), discounts)) {
                arrayList.add(new com.woolworths.scanlibrary.ui.receipt.adapter.Discount(discount.getName(), discount.getAmount()));
            }
        }
        if (!Intrinsics.c(receipt.getTotalSavings(), BigDecimal.ZERO)) {
            if (receipt.getTotalDiscounts().isEmpty()) {
                arrayList.add(new DashedDivider(4));
            }
            arrayList.add(new TotalDiscount(receipt.getTotalSavings()));
        }
        arrayList.add(new DashedDivider(4));
        arrayList.add(new TotalPayment(receipt));
        if (receipt.getVoucherInfo() != null && (!r1.isEmpty())) {
            arrayList.add(new DashedDivider(4));
            Iterator<VoucherInfo> it2 = receipt.getVoucherInfo().iterator();
            while (it2.hasNext()) {
                arrayList.add(new GeneralVoucher(it2.next()));
            }
        }
        arrayList.add(new PosBarcode(receipt));
        Vouchers vouchers = receipt.getVouchers();
        if (vouchers != null && (parking = vouchers.getParking()) != null) {
            arrayList.add(new ParkingVoucher(parking));
        }
        return arrayList;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.ReceiptContract.Presenter
    public final Voucher Y0(Receipt receipt) {
        Intrinsics.h(receipt, "receipt");
        Vouchers vouchers = receipt.getVouchers();
        if (vouchers != null) {
            return vouchers.getParking();
        }
        return null;
    }
}
