package com.woolworths.scanlibrary.ui.payment.instrumentlist;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.pay.sdk.models.CreditCardInstrument;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import com.woolworths.R;
import com.woolworths.scanlibrary.base.BaseDisposableObserver;
import com.woolworths.scanlibrary.base.BasePresenter;
import com.woolworths.scanlibrary.base.mvp.MvpView;
import com.woolworths.scanlibrary.domain.payment.GetInstrumentsUC;
import com.woolworths.scanlibrary.domain.payment.RemoveInstrumentUC;
import com.woolworths.scanlibrary.models.error.ApigeeErrorResponse;
import com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract;
import com.woolworths.scanlibrary.ui.payment.instrumenttype.PayAtCheckout;
import com.woolworths.scanlibrary.util.event.Event;
import com.woolworths.scanlibrary.util.resource.ResourceResolverImpl;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.operators.single.SingleObserveOn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListPresenter;", "Lcom/woolworths/scanlibrary/base/BasePresenter;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$View;", "Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListContract$Presenter;", "RemoveInstrumentObserver", "GetInstrumentsObserver", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class InstrumentListPresenter extends BasePresenter<InstrumentListContract.View> implements InstrumentListContract.Presenter {
    public final GetInstrumentsUC c;
    public final RemoveInstrumentUC d;
    public final ResourceResolverImpl e;
    public final ArrayList f;
    public final ArrayList g;
    public final MutableLiveData h;
    public final CompositeDisposable i;
    public boolean j;
    public final boolean k;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListPresenter$GetInstrumentsObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/payment/GetInstrumentsUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class GetInstrumentsObserver extends BaseDisposableObserver<GetInstrumentsUC.ResponseValue> {
        public final InstrumentListContract.View g;
        public final MutableLiveData h;
        public final /* synthetic */ InstrumentListPresenter i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GetInstrumentsObserver(InstrumentListPresenter instrumentListPresenter, InstrumentListContract.View view, MutableLiveData liveEvent) {
            super(view, 2000);
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            this.i = instrumentListPresenter;
            this.g = view;
            this.h = liveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void c(int i, int i2, ApigeeErrorResponse apigeeErrorResponse, Function0 function0) {
            this.h.j(new Event(InstrumentListContract.InstrumentListViewEvent.FetchInstrumentListFailureEvent.f21285a));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver
        public final void e(MvpView.ErrorType errorType) {
            this.h.j(new Event(InstrumentListContract.InstrumentListViewEvent.FetchInstrumentListFailureEvent.f21285a));
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            GetInstrumentsUC.ResponseValue response = (GetInstrumentsUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            List list = response.f21190a;
            InstrumentListPresenter instrumentListPresenter = this.i;
            instrumentListPresenter.h1(list);
            this.h.j(new Event(new InstrumentListContract.InstrumentListViewEvent.UpdateFetchedInstrumentList(instrumentListPresenter.g)));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/payment/instrumentlist/InstrumentListPresenter$RemoveInstrumentObserver;", "Lcom/woolworths/scanlibrary/base/BaseDisposableObserver;", "Lcom/woolworths/scanlibrary/domain/payment/RemoveInstrumentUC$ResponseValue;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class RemoveInstrumentObserver extends BaseDisposableObserver<RemoveInstrumentUC.ResponseValue> {
        public final PaymentInstrument g;
        public final InstrumentListContract.View h;
        public final MutableLiveData i;
        public final /* synthetic */ InstrumentListPresenter j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RemoveInstrumentObserver(InstrumentListPresenter instrumentListPresenter, PaymentInstrument paymentInstrumentToRemove, InstrumentListContract.View view, MutableLiveData liveEvent) {
            super(view, 2001);
            Intrinsics.h(paymentInstrumentToRemove, "paymentInstrumentToRemove");
            Intrinsics.h(view, "view");
            Intrinsics.h(liveEvent, "liveEvent");
            this.j = instrumentListPresenter;
            this.g = paymentInstrumentToRemove;
            this.h = view;
            this.i = liveEvent;
        }

        @Override // com.woolworths.scanlibrary.base.BaseDisposableObserver, io.reactivex.SingleObserver
        public final void onSuccess(Object obj) {
            RemoveInstrumentUC.ResponseValue response = (RemoveInstrumentUC.ResponseValue) obj;
            Intrinsics.h(response, "response");
            InstrumentListPresenter instrumentListPresenter = this.j;
            instrumentListPresenter.h.j(new Event(new InstrumentListContract.InstrumentListViewEvent.SetLoadingIndicatorEvent(false)));
            ArrayList arrayList = instrumentListPresenter.f;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((PaymentInstrument) next).getInstrumentId().equals(this.g.getInstrumentId())) {
                    arrayList2.add(next);
                }
            }
            instrumentListPresenter.h1(arrayList2);
            this.i.j(new Event(new InstrumentListContract.InstrumentListViewEvent.UpdateFetchedInstrumentList(instrumentListPresenter.g)));
        }
    }

    public InstrumentListPresenter(InstrumentListContract.View view, GetInstrumentsUC getInstrumentsUC, RemoveInstrumentUC removeInstrumentUC, ResourceResolverImpl resourceResolverImpl) {
        super(view);
        this.c = getInstrumentsUC;
        this.d = removeInstrumentUC;
        this.e = resourceResolverImpl;
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new MutableLiveData();
        this.i = new CompositeDisposable();
        this.j = true;
        this.k = true;
        view.k1(this);
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract.Presenter
    /* renamed from: C, reason: from getter */
    public final ArrayList getG() {
        return this.g;
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract.Presenter
    public final ArrayList E() {
        ArrayList arrayList = this.f;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PaymentInstrument paymentInstrument = (PaymentInstrument) it.next();
            Intrinsics.f(paymentInstrument, "null cannot be cast to non-null type au.com.woolworths.pay.sdk.models.CreditCardInstrument");
            arrayList2.add((CreditCardInstrument) paymentInstrument);
        }
        return arrayList2;
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract.Presenter
    public final boolean R() {
        return !this.f.isEmpty();
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract.Presenter
    public final void Z0() {
        Event event = new Event(new InstrumentListContract.InstrumentListViewEvent.SetLoadingIndicatorEvent(true));
        MutableLiveData mutableLiveData = this.h;
        mutableLiveData.j(event);
        SingleObserveOn singleObserveOnF = this.c.b(new GetInstrumentsUC.RequestValues()).f(AndroidSchedulers.a());
        MvpView mvpView = this.f21139a;
        Intrinsics.g(mvpView, "getView(...)");
        GetInstrumentsObserver getInstrumentsObserver = new GetInstrumentsObserver(this, (InstrumentListContract.View) mvpView, mutableLiveData);
        singleObserveOnF.a(getInstrumentsObserver);
        this.i.d(getInstrumentsObserver);
    }

    public final void h1(List list) {
        ArrayList arrayList = this.f;
        arrayList.clear();
        arrayList.addAll(list);
        ArrayList arrayList2 = this.g;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        if (this.j && this.k) {
            arrayList2.add(new PayAtCheckout(this.e.getString(R.string.sng_label_payment_at_checkout)));
        }
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract.Presenter
    /* renamed from: v0, reason: from getter */
    public final MutableLiveData getH() {
        return this.h;
    }

    @Override // com.woolworths.scanlibrary.ui.payment.instrumentlist.InstrumentListContract.Presenter
    public final void z(PaymentInstrument paymentInstrument) {
        Intrinsics.h(paymentInstrument, "paymentInstrument");
        MvpView mvpView = this.f21139a;
        ((InstrumentListContract.View) mvpView).N3(true);
        SingleObserveOn singleObserveOnF = this.d.b(new RemoveInstrumentUC.RequestValues(paymentInstrument)).f(AndroidSchedulers.a());
        Intrinsics.g(mvpView, "getView(...)");
        RemoveInstrumentObserver removeInstrumentObserver = new RemoveInstrumentObserver(this, paymentInstrument, (InstrumentListContract.View) mvpView, this.h);
        singleObserveOnF.a(removeInstrumentObserver);
        this.i.d(removeInstrumentObserver);
    }
}
