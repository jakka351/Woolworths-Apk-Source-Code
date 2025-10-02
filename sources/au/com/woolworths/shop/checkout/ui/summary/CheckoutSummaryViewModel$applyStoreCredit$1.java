package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutCredit;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditItem;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetDataExtKt;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel$applyStoreCredit$1", f = "CheckoutSummaryViewModel.kt", l = {273}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutSummaryViewModel$applyStoreCredit$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CheckoutSummaryViewModel q;
    public final /* synthetic */ CheckoutStoreCreditItem r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryViewModel$applyStoreCredit$1(CheckoutSummaryViewModel checkoutSummaryViewModel, CheckoutStoreCreditItem checkoutStoreCreditItem, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutSummaryViewModel;
        this.r = checkoutStoreCreditItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutSummaryViewModel$applyStoreCredit$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutSummaryViewModel$applyStoreCredit$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CheckoutContentContract.ViewState viewState;
        ModalBottomSheetData modalBottomSheetDataC;
        Object value2;
        CheckoutContentContract.ViewState viewState2;
        Checkout checkoutA;
        ModalBottomSheetData modalBottomSheetDataC2;
        Object value3;
        CheckoutContentContract.ViewState viewState3;
        ModalBottomSheetData modalBottomSheetDataC3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        CheckoutStoreCreditItem checkoutStoreCreditItem = this.r;
        CheckoutSummaryViewModel checkoutSummaryViewModel = this.q;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                MutableStateFlow mutableStateFlow = checkoutSummaryViewModel.j;
                do {
                    value2 = mutableStateFlow.getValue();
                    viewState2 = (CheckoutContentContract.ViewState) value2;
                    Checkout checkout = viewState2.d;
                    checkoutA = checkout != null ? Checkout.a(checkout, null, 1015) : null;
                    ModalBottomSheetData modalBottomSheetData = viewState2.g;
                    if (modalBottomSheetData != null) {
                        LinkedHashSet linkedHashSet = checkoutSummaryViewModel.s;
                        linkedHashSet.add(checkoutStoreCreditItem.f);
                        modalBottomSheetDataC2 = ModalBottomSheetDataExtKt.c(modalBottomSheetData, linkedHashSet, null);
                    } else {
                        modalBottomSheetDataC2 = null;
                    }
                } while (!mutableStateFlow.d(value2, CheckoutContentContract.ViewState.a(viewState2, false, checkoutA, modalBottomSheetDataC2, 167)));
                CheckoutSummaryInteractor checkoutSummaryInteractor = checkoutSummaryViewModel.o;
                String str = checkoutStoreCreditItem.f;
                this.p = 1;
                obj = checkoutSummaryInteractor.f10823a.b(CollectionsKt.Q(str), this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            ApplyCheckoutCredit applyCheckoutCredit = (ApplyCheckoutCredit) obj;
            Checkout checkout2 = applyCheckoutCredit.c;
            if (checkout2 != null) {
                checkoutSummaryViewModel.y6(checkout2, true);
            }
            MutableStateFlow mutableStateFlow2 = checkoutSummaryViewModel.j;
            do {
                value3 = mutableStateFlow2.getValue();
                viewState3 = (CheckoutContentContract.ViewState) value3;
                ModalBottomSheetData modalBottomSheetData2 = viewState3.g;
                if (modalBottomSheetData2 != null) {
                    LinkedHashSet linkedHashSet2 = checkoutSummaryViewModel.s;
                    linkedHashSet2.remove(checkoutStoreCreditItem.f);
                    PlainText plainText = new PlainText(applyCheckoutCredit.b);
                    if (applyCheckoutCredit.f10555a) {
                        plainText = null;
                    }
                    modalBottomSheetDataC3 = ModalBottomSheetDataExtKt.c(modalBottomSheetData2, linkedHashSet2, plainText);
                } else {
                    modalBottomSheetDataC3 = null;
                }
            } while (!mutableStateFlow2.d(value3, CheckoutContentContract.ViewState.a(viewState3, false, null, modalBottomSheetDataC3, 191)));
        } catch (Exception e) {
            AnalyticsManager analyticsManager = checkoutSummaryViewModel.p;
            CheckoutAnalytics.Summary.Action.Companion companion = CheckoutAnalytics.Summary.Action.d;
            final String str2 = checkoutStoreCreditItem.g;
            final String str3 = checkoutStoreCreditItem.f;
            companion.getClass();
            analyticsManager.g(new Event(str2, str3) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$applyCreditError$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(CheckoutAnalytics.Summary.f);
                    spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                    spreadBuilder.a(new Pair("event.Action", "discount_error"));
                    spreadBuilder.a(new Pair("event.Label", "Store credit application failed"));
                    spreadBuilder.a(new Pair("checkout.storeCreditAmount", str2));
                    androidx.constraintlayout.core.state.a.y("checkout.storeCreditCode", str3, spreadBuilder);
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getD() {
                    return "checkout_store_credit_application_failure";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "checkout_store_credit_application_failure".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            MutableStateFlow mutableStateFlow3 = checkoutSummaryViewModel.j;
            do {
                value = mutableStateFlow3.getValue();
                viewState = (CheckoutContentContract.ViewState) value;
                ModalBottomSheetData modalBottomSheetData3 = viewState.g;
                if (modalBottomSheetData3 != null) {
                    LinkedHashSet linkedHashSet3 = checkoutSummaryViewModel.s;
                    linkedHashSet3.remove(str3);
                    modalBottomSheetDataC = ModalBottomSheetDataExtKt.c(modalBottomSheetData3, linkedHashSet3, new ResText(e instanceof NoConnectivityException ? R.string.error_no_network : R.string.checkout_store_credit_apply_error_server));
                } else {
                    modalBottomSheetDataC = null;
                }
            } while (!mutableStateFlow3.d(value, CheckoutContentContract.ViewState.a(viewState, false, null, modalBottomSheetDataC, 191)));
        }
        return Unit.f24250a;
    }
}
