package au.com.woolworths.shop.digipay.creditcard;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.pay.sdk.models.CardCaptureInfo;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.web.FormFocusState;
import au.com.woolworths.shop.digipay.DigipayContract;
import au.com.woolworths.shop.digipay.DigipayInteractor;
import au.com.woolworths.shop.digipay.creditcard.CreditCardContract;
import au.com.woolworths.shop.digipay.models.AddNewCreditCard;
import au.com.woolworths.shop.digipay.models.CreditCardHeading;
import au.com.woolworths.shop.digipay.models.ManageCreditCardFooter;
import au.com.woolworths.shop.digipay.models.PaymentInfo;
import au.com.woolworths.shop.digipay.models.SavedCreditCard;
import au.com.woolworths.shop.digipay.models.SavedCreditCardFooter;
import au.com.woolworths.shop.digipay.models.SubmittedInstrument;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import timber.log.Timber;

@HiltViewModel
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/digipay/creditcard/CreditCardViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/digipay/creditcard/CreditCardEventHandler;", "Lau/com/woolworths/shop/digipay/creditcard/CardCaptureViewEventHandler;", "Lau/com/woolworths/shop/digipay/creditcard/CvvStepUpViewEventHandler;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CreditCardViewModel extends ViewModel implements CreditCardEventHandler, CardCaptureViewEventHandler, CvvStepUpViewEventHandler {
    public final DigipayInteractor e;
    public final MutableLiveData f;
    public final SharedFlowImpl g;
    public PaymentInfo h;

    public CreditCardViewModel(DigipayInteractor interactor) {
        Intrinsics.h(interactor, "interactor");
        this.e = interactor;
        this.f = new MutableLiveData();
        this.g = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CvvStepUpViewEventHandler
    public final void A1(BaseError baseError) {
        DigipayContract.Error error = DigipayContract.Error.d;
        DigipayInteractor digipayInteractor = this.e;
        digipayInteractor.getClass();
        digipayInteractor.j.f(new DigipayContract.Actions.EmitError());
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler
    public final void A3() {
        ArrayList arrayList;
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            List list = viewState.f10914a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof AddNewCreditCard) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            O();
        } else {
            mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.Q(new CreditCardHeading())));
        }
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler
    public final void B1() {
        s6(true);
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler
    public final void C2() {
        Timber.f27013a.b("onCardCaptureLoaded", new Object[0]);
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            List list = viewState.f10914a;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (Object objA : list) {
                if (objA instanceof AddNewCreditCard) {
                    objA = AddNewCreditCard.a((AddNewCreditCard) objA, null, false, 55);
                }
                arrayList.add(objA);
            }
            mutableLiveData.m(new CreditCardContract.ViewState(arrayList));
        }
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CvvStepUpViewEventHandler
    public final void C3(FormFocusState formFocusState) {
        Timber.f27013a.b("onCvvStepUpViewFocusChanged", new Object[0]);
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler
    public final void E3(String instrumentId, String stepUpToken) {
        Intrinsics.h(instrumentId, "instrumentId");
        Intrinsics.h(stepUpToken, "stepUpToken");
        Timber.f27013a.b("onCardCaptureComplete", new Object[0]);
        DigipayInteractor digipayInteractor = this.e;
        digipayInteractor.getClass();
        digipayInteractor.j.f(new DigipayContract.Actions.EmitSubmittedInstrumentData(new SubmittedInstrument(instrumentId, stepUpToken)));
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler
    public final void J0(SavedCreditCard savedCreditCard) {
        Intrinsics.h(savedCreditCard, "savedCreditCard");
        this.g.f(new CreditCardContract.Actions.RemoveSavedCreditCard(savedCreditCard));
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler
    public final void J2(boolean z) {
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            List list = viewState.f10914a;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (Object objA : list) {
                if (objA instanceof AddNewCreditCard) {
                    objA = AddNewCreditCard.a((AddNewCreditCard) objA, null, z, 31);
                }
                arrayList.add(objA);
            }
            mutableLiveData.m(new CreditCardContract.ViewState(arrayList));
        }
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CvvStepUpViewEventHandler
    public final void J3(String instrumentId, String stepUpToken) {
        Intrinsics.h(instrumentId, "instrumentId");
        Intrinsics.h(stepUpToken, "stepUpToken");
        Timber.f27013a.b(YU.a.i("onCvvStepUpComplete instrumentId:", instrumentId, ", stepUpToken:", stepUpToken), new Object[0]);
        DigipayInteractor digipayInteractor = this.e;
        digipayInteractor.getClass();
        digipayInteractor.j.f(new DigipayContract.Actions.EmitSubmittedInstrumentData(new SubmittedInstrument(instrumentId, stepUpToken)));
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CvvStepUpViewEventHandler
    public final void K1(boolean z, boolean z2) {
        this.e.h.m(Boolean.valueOf(z));
        r6(z || z2);
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler
    public final void O() {
        p6(null);
        f6();
        BuildersKt.c(ViewModelKt.a(this), null, null, new CreditCardViewModel$onAddNewCreditCardClick$1(this, null), 3);
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler
    public final void U5() {
        s6(false);
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CvvStepUpViewEventHandler
    public final void W1() {
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            List list = viewState.f10914a;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (Object objA : list) {
                if (objA instanceof SavedCreditCard) {
                    SavedCreditCard savedCreditCard = (SavedCreditCard) objA;
                    objA = savedCreditCard.e ? SavedCreditCard.a(savedCreditCard, false, true, false, 383) : SavedCreditCard.a(savedCreditCard, false, false, false, 383);
                }
                arrayList.add(objA);
            }
            mutableLiveData.m(new CreditCardContract.ViewState(arrayList));
        }
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler
    public final void Z4() {
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            List list = viewState.f10914a;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (Object addNewCreditCard : list) {
                if (addNewCreditCard instanceof AddNewCreditCard) {
                    addNewCreditCard = new AddNewCreditCard(null, this.e.d(), null, false, true, false);
                }
                arrayList.add(addNewCreditCard);
            }
            mutableLiveData.m(new CreditCardContract.ViewState(arrayList));
        }
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CvvStepUpViewEventHandler
    public final void a3(boolean z) {
        Timber.f27013a.b("onCvvStepUpReturnKeyPressed", new Object[0]);
        r6(z);
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler
    public final void c2(boolean z, boolean z2) {
        this.e.h.m(Boolean.valueOf(z));
        if (z || z2) {
            q6(null);
        }
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler
    public final void d1(boolean z) {
        if (z) {
            q6(null);
        }
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler
    public final void f6() {
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            List list = viewState.f10914a;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (Object objA : list) {
                if (objA instanceof AddNewCreditCard) {
                    objA = AddNewCreditCard.a((AddNewCreditCard) objA, null, false, 59);
                }
                arrayList.add(objA);
            }
            mutableLiveData.m(new CreditCardContract.ViewState(arrayList));
        }
        this.e.h.m(Boolean.FALSE);
        this.g.f(CreditCardContract.Actions.ClearCardCaptureView.f10911a);
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler
    public final void i4() {
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    @Override // au.com.woolworths.shop.digipay.creditcard.CreditCardEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k6(au.com.woolworths.shop.digipay.models.SavedCreditCard r10) {
        /*
            r9 = this;
            java.lang.String r0 = "savedCreditCard"
            kotlin.jvm.internal.Intrinsics.h(r10, r0)
            androidx.lifecycle.MutableLiveData r0 = r9.f
            java.lang.Object r1 = r0.e()
            au.com.woolworths.shop.digipay.creditcard.CreditCardContract$ViewState r1 = (au.com.woolworths.shop.digipay.creditcard.CreditCardContract.ViewState) r1
            if (r1 == 0) goto L82
            java.util.List r1 = r1.f10914a
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.CollectionsKt.s(r1, r3)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L22:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L76
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof au.com.woolworths.shop.digipay.creditcard.CreditCardCaptureInlineErrorState
            r5 = 0
            if (r4 == 0) goto L33
        L31:
            r3 = r5
            goto L72
        L33:
            boolean r4 = r3 instanceof au.com.woolworths.shop.digipay.models.SavedCreditCard
            r6 = 1
            if (r4 == 0) goto L64
            au.com.woolworths.shop.digipay.DigipayInteractor r4 = r9.e
            androidx.lifecycle.MutableLiveData r4 = r4.h
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r4.m(r5)
            kotlinx.coroutines.flow.SharedFlowImpl r4 = r9.g
            au.com.woolworths.shop.digipay.creditcard.CreditCardContract$Actions$ClearCvvStepUpViewForSelectedCard r5 = au.com.woolworths.shop.digipay.creditcard.CreditCardContract.Actions.ClearCvvStepUpViewForSelectedCard.f10912a
            r4.f(r5)
            boolean r4 = r3.equals(r10)
            r5 = 495(0x1ef, float:6.94E-43)
            r7 = 0
            if (r4 == 0) goto L5d
            r4 = r3
            au.com.woolworths.shop.digipay.models.SavedCreditCard r4 = (au.com.woolworths.shop.digipay.models.SavedCreditCard) r4
            boolean r8 = r4.e
            if (r8 != 0) goto L5d
            au.com.woolworths.shop.digipay.models.SavedCreditCard r3 = au.com.woolworths.shop.digipay.models.SavedCreditCard.a(r4, r6, r7, r7, r5)
            goto L72
        L5d:
            au.com.woolworths.shop.digipay.models.SavedCreditCard r3 = (au.com.woolworths.shop.digipay.models.SavedCreditCard) r3
            au.com.woolworths.shop.digipay.models.SavedCreditCard r3 = au.com.woolworths.shop.digipay.models.SavedCreditCard.a(r3, r7, r7, r7, r5)
            goto L72
        L64:
            boolean r4 = r3 instanceof au.com.woolworths.shop.digipay.models.AddNewCreditCard
            if (r4 == 0) goto L69
            goto L31
        L69:
            boolean r4 = r3 instanceof au.com.woolworths.shop.digipay.models.SavedCreditCardFooter
            if (r4 == 0) goto L72
            au.com.woolworths.shop.digipay.models.SavedCreditCardFooter r3 = new au.com.woolworths.shop.digipay.models.SavedCreditCardFooter
            r3.<init>(r6)
        L72:
            r2.add(r3)
            goto L22
        L76:
            java.util.ArrayList r10 = kotlin.collections.CollectionsKt.B(r2)
            au.com.woolworths.shop.digipay.creditcard.CreditCardContract$ViewState r1 = new au.com.woolworths.shop.digipay.creditcard.CreditCardContract$ViewState
            r1.<init>(r10)
            r0.m(r1)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.digipay.creditcard.CreditCardViewModel.k6(au.com.woolworths.shop.digipay.models.SavedCreditCard):void");
    }

    public final void p6(CardCaptureInfo cardCaptureInfo) {
        ArrayList arrayList;
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            List list = viewState.f10914a;
            arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof SavedCreditCard) {
                    arrayList.add(obj);
                }
            }
        } else {
            arrayList = null;
        }
        DigipayInteractor digipayInteractor = this.e;
        if (arrayList == null || arrayList.isEmpty()) {
            mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.R(new CreditCardHeading(), new AddNewCreditCard(cardCaptureInfo, digipayInteractor.d(), null, false, false, false))));
            return;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(SavedCreditCard.a((SavedCreditCard) it.next(), false, false, false, 495));
        }
        mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.G(CollectionsKt.R(arrayList2, CollectionsKt.R(new AddNewCreditCard(cardCaptureInfo, digipayInteractor.d(), null, false, false, false), new SavedCreditCardFooter(false))))));
    }

    public final void q6(CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState) {
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState != null) {
            List list = viewState.f10914a;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (Object objA : list) {
                if (objA instanceof AddNewCreditCard) {
                    objA = AddNewCreditCard.a((AddNewCreditCard) objA, creditCardCaptureInlineErrorState, false, 59);
                }
                arrayList.add(objA);
            }
            mutableLiveData.m(new CreditCardContract.ViewState(arrayList));
        }
    }

    public final void r6(boolean z) {
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        List list = viewState != null ? viewState.f10914a : null;
        if (list == null) {
            list = EmptyList.d;
        }
        ArrayList arrayListJ0 = CollectionsKt.J0(list);
        if (z) {
            final au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a aVar = new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(14);
            arrayListJ0.removeIf(new Predicate() { // from class: au.com.woolworths.shop.digipay.creditcard.d
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((Boolean) aVar.invoke(obj)).booleanValue();
                }
            });
        } else {
            arrayListJ0.add(0, CreditCardCaptureInlineErrorState.j);
        }
        mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.G0(arrayListJ0)));
    }

    public final void s6(boolean z) {
        MutableLiveData mutableLiveData = this.f;
        CreditCardContract.ViewState viewState = (CreditCardContract.ViewState) mutableLiveData.e();
        if (viewState == null) {
            throw new IllegalStateException("Switching to/from Manage Credit Card mode BUT there is no Saved Credit Card");
        }
        List list = viewState.f10914a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SavedCreditCard) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(SavedCreditCard.a((SavedCreditCard) it.next(), false, false, z, 239));
        }
        if (z) {
            mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.G(CollectionsKt.R(arrayList2, CollectionsKt.Q(new ManageCreditCardFooter())))));
        } else {
            mutableLiveData.m(new CreditCardContract.ViewState(CollectionsKt.G(CollectionsKt.R(arrayList2, CollectionsKt.Q(new SavedCreditCardFooter(true))))));
        }
    }

    @Override // au.com.woolworths.shop.digipay.creditcard.CardCaptureViewEventHandler
    public final void u5(FormFocusState formFocusState) {
        CreditCardCaptureInlineErrorState creditCardCaptureInlineErrorState;
        if (formFocusState.f9191a.booleanValue()) {
            return;
        }
        if (CreditCardErrorExtKt.a(formFocusState) >= 3) {
            creditCardCaptureInlineErrorState = CreditCardCaptureInlineErrorState.f;
        } else {
            Boolean bool = formFocusState.f;
            Boolean bool2 = Boolean.FALSE;
            creditCardCaptureInlineErrorState = (Intrinsics.c(bool, bool2) && Intrinsics.c(formFocusState.e, bool2)) ? CreditCardCaptureInlineErrorState.i : CreditCardErrorExtKt.a(formFocusState) == 2 ? CreditCardCaptureInlineErrorState.f : Intrinsics.c(formFocusState.c, bool2) ? Intrinsics.c(formFocusState.g, Boolean.TRUE) ? CreditCardCaptureInlineErrorState.k : CreditCardCaptureInlineErrorState.e : Intrinsics.c(formFocusState.e, bool2) ? CreditCardCaptureInlineErrorState.h : Intrinsics.c(formFocusState.f, bool2) ? CreditCardCaptureInlineErrorState.g : Intrinsics.c(formFocusState.d, bool2) ? CreditCardCaptureInlineErrorState.j : null;
        }
        q6(creditCardCaptureInlineErrorState);
    }
}
