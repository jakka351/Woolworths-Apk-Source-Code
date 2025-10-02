package com.woolworths.scanlibrary.ui.transaction;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import com.woolworths.scanlibrary.analytics.AnalyticsProvider;
import com.woolworths.scanlibrary.analytics.TransactionHistoryScreenTracking;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.domain.receipt.GetReceiptWithCartIdUC;
import com.woolworths.scanlibrary.domain.transaction.GetTransactionListUseCase;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.models.transactions.Transaction;
import com.woolworths.scanlibrary.ui.transaction.TransactionListCategory;
import com.woolworths.scanlibrary.ui.transaction.TransactionListContract;
import com.woolworths.scanlibrary.util.extensions.DateExtKt;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/transaction/TransactionListPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/transaction/TransactionListContract$View;", "Lcom/woolworths/scanlibrary/ui/transaction/TransactionListContract$Presenter;", "GetTxnListObserver", "GetReceiptObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TransactionListPresenter extends BasePresenter<TransactionListContract.View> implements TransactionListContract.Presenter {
    public final GetTransactionListUseCase c;
    public final GetReceiptWithCartIdUC d;
    public final AnalyticsProvider e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/transaction/TransactionListPresenter$GetReceiptObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/receipt/GetReceiptWithCartIdUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class GetReceiptObserver extends BaseDisposableObserver<GetReceiptWithCartIdUC.ResponseValue> {
        public TransactionListContract.View g;

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            this.g.N3(false);
            this.e.n(i, i2, apigeeErrorResponse, new h(20));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetReceiptWithCartIdUC.ResponseValue response = (GetReceiptWithCartIdUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            TransactionListContract.View view = this.g;
            view.N3(false);
            view.O3(response.f21203a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/transaction/TransactionListPresenter$GetTxnListObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/transaction/GetTransactionListUseCase$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class GetTxnListObserver extends BaseDisposableObserver<GetTransactionListUseCase.ResponseValue> {
        public final TransactionListContract.View g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetTxnListObserver(TransactionListContract.View view) {
            super(view, 16);
            Intrinsics.h(view, "view");
            this.g = view;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            this.g.N3(false);
            this.e.n(i, i2, apigeeErrorResponse, new h(20));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetTransactionListUseCase.ResponseValue response = (GetTransactionListUseCase.ResponseValue) obj;
            Intrinsics.h(response, "response");
            List<Transaction> historyList = response.f21207a.getHistoryList();
            TransactionListContract.View view = this.g;
            view.N3(false);
            ArrayList arrayList = new ArrayList();
            String str = "";
            for (Transaction transaction : CollectionsKt.u0(new TransactionListPresenter$GetTxnListObserver$groupTransactions$$inlined$sortedByDescending$1(), historyList)) {
                String strA = DateExtKt.a("MMM, yyyy", transaction.getTxnTime());
                if (!Intrinsics.c(str, strA)) {
                    Date txnTime = transaction.getTxnTime();
                    Intrinsics.h(txnTime, "<this>");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(txnTime);
                    Date date = new Date();
                    Calendar calendar2 = Calendar.getInstance();
                    calendar2.setTime(date);
                    arrayList = CollectionsKt.d0(new TransactionListCategory.TransactionGroupHeader(strA, (calendar2.get(2) + ((calendar2.get(1) - calendar.get(1)) * 12)) - calendar.get(2)), arrayList);
                    str = strA;
                }
                arrayList = CollectionsKt.d0(new TransactionListCategory.TransactionLineItem(transaction), arrayList);
            }
            view.X1(arrayList);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionListPresenter(TransactionListContract.View view, GetTransactionListUseCase getTransactionListUseCase, GetReceiptWithCartIdUC getReceiptWithCartIdUC, AnalyticsProvider analyticsAggregator) {
        super(view);
        Intrinsics.h(analyticsAggregator, "analyticsAggregator");
        this.c = getTransactionListUseCase;
        this.d = getReceiptWithCartIdUC;
        this.e = analyticsAggregator;
        view.k1(this);
        analyticsAggregator.a(new TransactionHistoryScreenTracking("Transaction History Screen"));
    }

    @Override // com.woolworths.scanlibrary.ui.transaction.TransactionListContract.Presenter
    public final void L0(String cartId) {
        Intrinsics.h(cartId, "cartId");
        MvpView mvpView = this.f21139a;
        ((TransactionListContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.d.b(new GetReceiptWithCartIdUC.RequestValues(cartId)).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        TransactionListContract.View view = (TransactionListContract.View) mvpView;
        GetReceiptObserver getReceiptObserver = new GetReceiptObserver(view, 12);
        getReceiptObserver.g = view;
        singleObserveOnF.a(getReceiptObserver);
        this.b.d(getReceiptObserver);
    }

    @Override // com.woolworths.scanlibrary.ui.transaction.TransactionListContract.Presenter
    public final void q() {
        MvpView mvpView = this.f21139a;
        ((TransactionListContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.c.b(new GetTransactionListUseCase.RequestValues()).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "mvpView");
        GetTxnListObserver getTxnListObserver = new GetTxnListObserver((TransactionListContract.View) mvpView);
        singleObserveOnF.a(getTxnListObserver);
        this.b.d(getTxnListObserver);
    }
}
