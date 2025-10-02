package au.com.woolworths.shop.checkout.ui.summary;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.shop.cart.ui.shared.InfoModalKt;
import au.com.woolworths.shop.checkout.databinding.FragmentCheckoutContentBinding;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetDataExtKt;
import au.com.woolworths.shop.checkout.ui.details.d;
import au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeConfirmationDialogKt;
import au.com.woolworths.shop.checkout.ui.summary.promocode.PromoCodeModalKt;
import au.com.woolworths.shop.checkout.ui.summary.rewards.RewardsQuantitySelectorModalKt;
import au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditModalKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$observeData$1", f = "CheckoutSummaryFragment.kt", l = {145}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class CheckoutSummaryFragment$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ CheckoutSummaryFragment q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$observeData$1$1", f = "CheckoutSummaryFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$observeData$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CheckoutContentContract.ViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ CheckoutSummaryFragment q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheckoutSummaryFragment checkoutSummaryFragment, Continuation continuation) {
            super(2, continuation);
            this.q = checkoutSummaryFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CheckoutContentContract.ViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            final CheckoutContentContract.ViewState viewState = (CheckoutContentContract.ViewState) this.p;
            final CheckoutSummaryFragment checkoutSummaryFragment = this.q;
            checkoutSummaryFragment.m2(viewState, checkoutSummaryFragment.o2().q);
            FragmentCheckoutContentBinding fragmentCheckoutContentBinding = checkoutSummaryFragment.f;
            Intrinsics.e(fragmentCheckoutContentBinding);
            ComposeView composeView = fragmentCheckoutContentBinding.y;
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindow.f1984a);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$updateBottomSheet$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final CheckoutContentContract.ViewState viewState2 = viewState;
                        final ModalBottomSheetData modalBottomSheetData = viewState2.g;
                        if (modalBottomSheetData != null) {
                            final CheckoutSummaryFragment checkoutSummaryFragment2 = checkoutSummaryFragment;
                            CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1001923943, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryFragment$updateBottomSheet$1$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer2 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        final ModalBottomSheetData modalBottomSheetData2 = modalBottomSheetData;
                                        boolean z = modalBottomSheetData2 instanceof ModalBottomSheetData.Info;
                                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                        final CheckoutSummaryFragment checkoutSummaryFragment3 = checkoutSummaryFragment2;
                                        if (z) {
                                            composer2.o(-776230639);
                                            ModalBottomSheetData.Info info = (ModalBottomSheetData.Info) modalBottomSheetData2;
                                            String str = info.f10759a;
                                            String str2 = info.b;
                                            String upperCase = info.c.toUpperCase(Locale.ROOT);
                                            Intrinsics.g(upperCase, "toUpperCase(...)");
                                            composer2.o(-1633490746);
                                            boolean zI = composer2.I(checkoutSummaryFragment3) | composer2.n(modalBottomSheetData2);
                                            Object objG = composer2.G();
                                            if (zI || objG == composer$Companion$Empty$1) {
                                                final int i = 0;
                                                objG = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.summary.a
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Object value;
                                                        Object value2;
                                                        CheckoutContentContract.ViewState viewState3;
                                                        ModalBottomSheetData.PromoCode promoCode;
                                                        switch (i) {
                                                            case 0:
                                                                CheckoutSummaryViewModel checkoutSummaryViewModelO2 = checkoutSummaryFragment3.o2();
                                                                AnalyticsData analyticsData = ((ModalBottomSheetData.Info) modalBottomSheetData2).d;
                                                                if (analyticsData != null) {
                                                                    checkoutSummaryViewModelO2.p.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, analyticsData));
                                                                }
                                                                MutableStateFlow mutableStateFlow = checkoutSummaryViewModelO2.j;
                                                                do {
                                                                    value = mutableStateFlow.getValue();
                                                                } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) value, false, null, null, 191)));
                                                                return Unit.f24250a;
                                                            case 1:
                                                                CheckoutSummaryViewModel checkoutSummaryViewModelO22 = checkoutSummaryFragment3.o2();
                                                                String str3 = ((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b;
                                                                ModalBottomSheetData modalBottomSheetData3 = ((CheckoutContentContract.ViewState) checkoutSummaryViewModelO22.j.getValue()).g;
                                                                if (modalBottomSheetData3 != null) {
                                                                    List listA = ModalBottomSheetDataExtKt.a(modalBottomSheetData3);
                                                                    AnalyticsManager analyticsManager = checkoutSummaryViewModelO22.p;
                                                                    CheckoutAnalytics.Summary.Action.Companion companion = CheckoutAnalytics.Summary.Action.d;
                                                                    String code = CollectionsKt.M(listA, null, null, null, new d(17), 31);
                                                                    companion.getClass();
                                                                    Intrinsics.h(code, "code");
                                                                    analyticsManager.g(new Event(code, str3) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$replacePromoCodeConfirmButtonClick$1
                                                                        public final Object d;

                                                                        {
                                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                                                                            spreadBuilder.b(CheckoutAnalytics.Summary.f);
                                                                            spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                                                                            spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                                                            spreadBuilder.a(new Pair("event.Label", "Promo code replacement dialog"));
                                                                            spreadBuilder.a(new Pair("event.Description", "Replacement confirmed"));
                                                                            androidx.constraintlayout.core.state.a.z("checkout.promoCodes", code, spreadBuilder, "checkout.exclusivepromoCodes", str3);
                                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                                        }

                                                                        @Override // au.com.woolworths.analytics.Event
                                                                        /* renamed from: d */
                                                                        public final String getE() {
                                                                            return "checkout_store_promo_code_replacement_dialog";
                                                                        }

                                                                        public final boolean equals(Object obj6) {
                                                                            if (!(obj6 instanceof Event)) {
                                                                                return false;
                                                                            }
                                                                            Event event = (Event) obj6;
                                                                            return "checkout_store_promo_code_replacement_dialog".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                                        }

                                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                                        @Override // au.com.woolworths.analytics.Event
                                                                        public final Map getData() {
                                                                            return this.d;
                                                                        }
                                                                    });
                                                                }
                                                                checkoutSummaryViewModelO22.J6(str3, true);
                                                                break;
                                                            case 2:
                                                                CheckoutSummaryViewModel checkoutSummaryViewModelO23 = checkoutSummaryFragment3.o2();
                                                                String str4 = ((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b;
                                                                MutableStateFlow mutableStateFlow2 = checkoutSummaryViewModelO23.j;
                                                                do {
                                                                    value2 = mutableStateFlow2.getValue();
                                                                    viewState3 = (CheckoutContentContract.ViewState) value2;
                                                                    ModalBottomSheetData modalBottomSheetData4 = ((CheckoutContentContract.ViewState) mutableStateFlow2.getValue()).g;
                                                                    promoCode = modalBottomSheetData4 instanceof ModalBottomSheetData.PromoCode ? (ModalBottomSheetData.PromoCode) modalBottomSheetData4 : null;
                                                                } while (!mutableStateFlow2.d(value2, CheckoutContentContract.ViewState.a(viewState3, false, null, promoCode != null ? ModalBottomSheetData.PromoCode.a(promoCode, null, null, null, null, null, null, 47) : null, 191)));
                                                                ModalBottomSheetData modalBottomSheetData5 = ((CheckoutContentContract.ViewState) mutableStateFlow2.getValue()).g;
                                                                if (modalBottomSheetData5 != null) {
                                                                    List listA2 = ModalBottomSheetDataExtKt.a(modalBottomSheetData5);
                                                                    AnalyticsManager analyticsManager2 = checkoutSummaryViewModelO23.p;
                                                                    CheckoutAnalytics.Summary.Action.Companion companion2 = CheckoutAnalytics.Summary.Action.d;
                                                                    String code2 = CollectionsKt.M(listA2, null, null, null, new d(18), 31);
                                                                    companion2.getClass();
                                                                    Intrinsics.h(code2, "code");
                                                                    analyticsManager2.g(new Event(code2, str4) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$replacePromoCodeCancelButtonClick$1
                                                                        public final Object d;

                                                                        {
                                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                                                                            spreadBuilder.b(CheckoutAnalytics.Summary.f);
                                                                            spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                                                                            spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                                                            spreadBuilder.a(new Pair("event.Label", "Promo code replacement dialog"));
                                                                            spreadBuilder.a(new Pair("event.Description", "Replacement denied"));
                                                                            androidx.constraintlayout.core.state.a.z("checkout.promoCodes", code2, spreadBuilder, "checkout.exclusivepromoCodes", str4);
                                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                                        }

                                                                        @Override // au.com.woolworths.analytics.Event
                                                                        /* renamed from: d */
                                                                        public final String getE() {
                                                                            return "checkout_store_promo_code_replacement_dialog";
                                                                        }

                                                                        public final boolean equals(Object obj6) {
                                                                            if (!(obj6 instanceof Event)) {
                                                                                return false;
                                                                            }
                                                                            Event event = (Event) obj6;
                                                                            return "checkout_store_promo_code_replacement_dialog".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                                        }

                                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                                        @Override // au.com.woolworths.analytics.Event
                                                                        public final Map getData() {
                                                                            return this.d;
                                                                        }
                                                                    });
                                                                }
                                                                return Unit.f24250a;
                                                            default:
                                                                checkoutSummaryFragment3.o2().J6(((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b, false);
                                                                break;
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                composer2.A(objG);
                                            }
                                            Function0 function0 = (Function0) objG;
                                            composer2.l();
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO2 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI2 = composer2.I(checkoutSummaryViewModelO2);
                                            Object objG2 = composer2.G();
                                            if (zI2 || objG2 == composer$Companion$Empty$1) {
                                                CheckoutSummaryFragment$updateBottomSheet$1$1$1$2$1 checkoutSummaryFragment$updateBottomSheet$1$1$1$2$1 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$2$1(0, checkoutSummaryViewModelO2, CheckoutSummaryViewModel.class, "onDismissModalBottomSheet", "onDismissModalBottomSheet()V", 0);
                                                composer2.A(checkoutSummaryFragment$updateBottomSheet$1$1$1$2$1);
                                                objG2 = checkoutSummaryFragment$updateBottomSheet$1$1$1$2$1;
                                            }
                                            composer2.l();
                                            InfoModalKt.a(str, str2, upperCase, function0, (Function0) ((KFunction) objG2), null, composer2, 0);
                                            composer2.l();
                                        } else if (modalBottomSheetData2 instanceof ModalBottomSheetData.RewardsQuantitySelector) {
                                            composer2.o(1707192315);
                                            ModalBottomSheetData.RewardsQuantitySelector rewardsQuantitySelector = (ModalBottomSheetData.RewardsQuantitySelector) modalBottomSheetData2;
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO22 = checkoutSummaryFragment3.o2();
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO23 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI3 = composer2.I(checkoutSummaryViewModelO23);
                                            Object objG3 = composer2.G();
                                            if (zI3 || objG3 == composer$Companion$Empty$1) {
                                                objG3 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$3$1(3, checkoutSummaryViewModelO23, CheckoutSummaryViewModel.class, "onUpdateAmountClick", "onUpdateAmountClick(ILjava/lang/String;Lau/com/woolworths/shop/checkout/ui/summary/rewards/RewardsQuantitySelectorActionType;)V", 0);
                                                composer2.A(objG3);
                                            }
                                            KFunction kFunction = (KFunction) objG3;
                                            composer2.l();
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO24 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI4 = composer2.I(checkoutSummaryViewModelO24);
                                            Object objG4 = composer2.G();
                                            if (zI4 || objG4 == composer$Companion$Empty$1) {
                                                CheckoutSummaryFragment$updateBottomSheet$1$1$1$4$1 checkoutSummaryFragment$updateBottomSheet$1$1$1$4$1 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$4$1(0, checkoutSummaryViewModelO24, CheckoutSummaryViewModel.class, "onDismissModalBottomSheet", "onDismissModalBottomSheet()V", 0);
                                                composer2.A(checkoutSummaryFragment$updateBottomSheet$1$1$1$4$1);
                                                objG4 = checkoutSummaryFragment$updateBottomSheet$1$1$1$4$1;
                                            }
                                            composer2.l();
                                            RewardsQuantitySelectorModalKt.b(rewardsQuantitySelector, checkoutSummaryViewModelO22, (Function0) ((KFunction) objG4), null, null, (Function3) kFunction, composer2, 0);
                                            composer2.l();
                                        } else if (modalBottomSheetData2 instanceof ModalBottomSheetData.StoreCredit) {
                                            composer2.o(-776198408);
                                            ModalBottomSheetData.StoreCredit storeCredit = (ModalBottomSheetData.StoreCredit) modalBottomSheetData2;
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO25 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI5 = composer2.I(checkoutSummaryViewModelO25);
                                            Object objG5 = composer2.G();
                                            if (zI5 || objG5 == composer$Companion$Empty$1) {
                                                CheckoutSummaryFragment$updateBottomSheet$1$1$1$5$1 checkoutSummaryFragment$updateBottomSheet$1$1$1$5$1 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$5$1(0, checkoutSummaryViewModelO25, CheckoutSummaryViewModel.class, "onDismissModalBottomSheet", "onDismissModalBottomSheet()V", 0);
                                                composer2.A(checkoutSummaryFragment$updateBottomSheet$1$1$1$5$1);
                                                objG5 = checkoutSummaryFragment$updateBottomSheet$1$1$1$5$1;
                                            }
                                            composer2.l();
                                            Function0 function02 = (Function0) ((KFunction) objG5);
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO26 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI6 = composer2.I(checkoutSummaryViewModelO26);
                                            Object objG6 = composer2.G();
                                            if (zI6 || objG6 == composer$Companion$Empty$1) {
                                                objG6 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$6$1(0, checkoutSummaryViewModelO26, CheckoutSummaryViewModel.class, "onReloadStoreCredit", "onReloadStoreCredit()V", 0);
                                                composer2.A(objG6);
                                            }
                                            composer2.l();
                                            Function0 function03 = (Function0) ((KFunction) objG6);
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO27 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI7 = composer2.I(checkoutSummaryViewModelO27);
                                            Object objG7 = composer2.G();
                                            if (zI7 || objG7 == composer$Companion$Empty$1) {
                                                CheckoutSummaryFragment$updateBottomSheet$1$1$1$7$1 checkoutSummaryFragment$updateBottomSheet$1$1$1$7$1 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$7$1(1, checkoutSummaryViewModelO27, CheckoutSummaryViewModel.class, "applyStoreCredit", "applyStoreCredit(Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditItem;)V", 0);
                                                composer2.A(checkoutSummaryFragment$updateBottomSheet$1$1$1$7$1);
                                                objG7 = checkoutSummaryFragment$updateBottomSheet$1$1$1$7$1;
                                            }
                                            composer2.l();
                                            Function1 function1 = (Function1) ((KFunction) objG7);
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO28 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI8 = composer2.I(checkoutSummaryViewModelO28);
                                            Object objG8 = composer2.G();
                                            if (zI8 || objG8 == composer$Companion$Empty$1) {
                                                objG8 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$8$1(1, checkoutSummaryViewModelO28, CheckoutSummaryViewModel.class, "removeStoreCredit", "removeStoreCredit(Lau/com/woolworths/shop/checkout/domain/model/CheckoutStoreCreditItem;)V", 0);
                                                composer2.A(objG8);
                                            }
                                            composer2.l();
                                            Function1 function12 = (Function1) ((KFunction) objG8);
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO29 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI9 = composer2.I(checkoutSummaryViewModelO29);
                                            Object objG9 = composer2.G();
                                            if (zI9 || objG9 == composer$Companion$Empty$1) {
                                                CheckoutSummaryFragment$updateBottomSheet$1$1$1$9$1 checkoutSummaryFragment$updateBottomSheet$1$1$1$9$1 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$9$1(0, checkoutSummaryViewModelO29, CheckoutSummaryViewModel.class, "onStoreCreditSnackbarMessageShown", "onStoreCreditSnackbarMessageShown()V", 0);
                                                composer2.A(checkoutSummaryFragment$updateBottomSheet$1$1$1$9$1);
                                                objG9 = checkoutSummaryFragment$updateBottomSheet$1$1$1$9$1;
                                            }
                                            composer2.l();
                                            StoreCreditModalKt.a(storeCredit, function02, function03, function1, function12, (Function0) ((KFunction) objG9), null, null, composer2, 0);
                                            composer2.l();
                                        } else {
                                            if (!(modalBottomSheetData2 instanceof ModalBottomSheetData.PromoCode)) {
                                                throw au.com.woolworths.android.onesite.a.x(composer2, -776231214);
                                            }
                                            composer2.o(1708276850);
                                            ModalBottomSheetData.PromoCode promoCode = (ModalBottomSheetData.PromoCode) modalBottomSheetData2;
                                            ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeConfirmation applyCheckoutPromoCodeConfirmation = promoCode.e;
                                            composer2.o(-776177235);
                                            if (applyCheckoutPromoCodeConfirmation != null) {
                                                composer2.o(-1633490746);
                                                boolean zI10 = composer2.I(checkoutSummaryFragment3) | composer2.n(modalBottomSheetData2);
                                                Object objG10 = composer2.G();
                                                if (zI10 || objG10 == composer$Companion$Empty$1) {
                                                    final int i2 = 1;
                                                    objG10 = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.summary.a
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Object value;
                                                            Object value2;
                                                            CheckoutContentContract.ViewState viewState3;
                                                            ModalBottomSheetData.PromoCode promoCode2;
                                                            switch (i2) {
                                                                case 0:
                                                                    CheckoutSummaryViewModel checkoutSummaryViewModelO210 = checkoutSummaryFragment3.o2();
                                                                    AnalyticsData analyticsData = ((ModalBottomSheetData.Info) modalBottomSheetData2).d;
                                                                    if (analyticsData != null) {
                                                                        checkoutSummaryViewModelO210.p.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, analyticsData));
                                                                    }
                                                                    MutableStateFlow mutableStateFlow = checkoutSummaryViewModelO210.j;
                                                                    do {
                                                                        value = mutableStateFlow.getValue();
                                                                    } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) value, false, null, null, 191)));
                                                                    return Unit.f24250a;
                                                                case 1:
                                                                    CheckoutSummaryViewModel checkoutSummaryViewModelO222 = checkoutSummaryFragment3.o2();
                                                                    String str3 = ((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b;
                                                                    ModalBottomSheetData modalBottomSheetData3 = ((CheckoutContentContract.ViewState) checkoutSummaryViewModelO222.j.getValue()).g;
                                                                    if (modalBottomSheetData3 != null) {
                                                                        List listA = ModalBottomSheetDataExtKt.a(modalBottomSheetData3);
                                                                        AnalyticsManager analyticsManager = checkoutSummaryViewModelO222.p;
                                                                        CheckoutAnalytics.Summary.Action.Companion companion = CheckoutAnalytics.Summary.Action.d;
                                                                        String code = CollectionsKt.M(listA, null, null, null, new d(17), 31);
                                                                        companion.getClass();
                                                                        Intrinsics.h(code, "code");
                                                                        analyticsManager.g(new Event(code, str3) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$replacePromoCodeConfirmButtonClick$1
                                                                            public final Object d;

                                                                            {
                                                                                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                                                                                spreadBuilder.b(CheckoutAnalytics.Summary.f);
                                                                                spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                                                                                spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                                                                spreadBuilder.a(new Pair("event.Label", "Promo code replacement dialog"));
                                                                                spreadBuilder.a(new Pair("event.Description", "Replacement confirmed"));
                                                                                androidx.constraintlayout.core.state.a.z("checkout.promoCodes", code, spreadBuilder, "checkout.exclusivepromoCodes", str3);
                                                                                ArrayList arrayList = spreadBuilder.f24269a;
                                                                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                                            }

                                                                            @Override // au.com.woolworths.analytics.Event
                                                                            /* renamed from: d */
                                                                            public final String getE() {
                                                                                return "checkout_store_promo_code_replacement_dialog";
                                                                            }

                                                                            public final boolean equals(Object obj6) {
                                                                                if (!(obj6 instanceof Event)) {
                                                                                    return false;
                                                                                }
                                                                                Event event = (Event) obj6;
                                                                                return "checkout_store_promo_code_replacement_dialog".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                                            }

                                                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                                            @Override // au.com.woolworths.analytics.Event
                                                                            public final Map getData() {
                                                                                return this.d;
                                                                            }
                                                                        });
                                                                    }
                                                                    checkoutSummaryViewModelO222.J6(str3, true);
                                                                    break;
                                                                case 2:
                                                                    CheckoutSummaryViewModel checkoutSummaryViewModelO232 = checkoutSummaryFragment3.o2();
                                                                    String str4 = ((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b;
                                                                    MutableStateFlow mutableStateFlow2 = checkoutSummaryViewModelO232.j;
                                                                    do {
                                                                        value2 = mutableStateFlow2.getValue();
                                                                        viewState3 = (CheckoutContentContract.ViewState) value2;
                                                                        ModalBottomSheetData modalBottomSheetData4 = ((CheckoutContentContract.ViewState) mutableStateFlow2.getValue()).g;
                                                                        promoCode2 = modalBottomSheetData4 instanceof ModalBottomSheetData.PromoCode ? (ModalBottomSheetData.PromoCode) modalBottomSheetData4 : null;
                                                                    } while (!mutableStateFlow2.d(value2, CheckoutContentContract.ViewState.a(viewState3, false, null, promoCode2 != null ? ModalBottomSheetData.PromoCode.a(promoCode2, null, null, null, null, null, null, 47) : null, 191)));
                                                                    ModalBottomSheetData modalBottomSheetData5 = ((CheckoutContentContract.ViewState) mutableStateFlow2.getValue()).g;
                                                                    if (modalBottomSheetData5 != null) {
                                                                        List listA2 = ModalBottomSheetDataExtKt.a(modalBottomSheetData5);
                                                                        AnalyticsManager analyticsManager2 = checkoutSummaryViewModelO232.p;
                                                                        CheckoutAnalytics.Summary.Action.Companion companion2 = CheckoutAnalytics.Summary.Action.d;
                                                                        String code2 = CollectionsKt.M(listA2, null, null, null, new d(18), 31);
                                                                        companion2.getClass();
                                                                        Intrinsics.h(code2, "code");
                                                                        analyticsManager2.g(new Event(code2, str4) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$replacePromoCodeCancelButtonClick$1
                                                                            public final Object d;

                                                                            {
                                                                                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                                                                                spreadBuilder.b(CheckoutAnalytics.Summary.f);
                                                                                spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                                                                                spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                                                                spreadBuilder.a(new Pair("event.Label", "Promo code replacement dialog"));
                                                                                spreadBuilder.a(new Pair("event.Description", "Replacement denied"));
                                                                                androidx.constraintlayout.core.state.a.z("checkout.promoCodes", code2, spreadBuilder, "checkout.exclusivepromoCodes", str4);
                                                                                ArrayList arrayList = spreadBuilder.f24269a;
                                                                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                                            }

                                                                            @Override // au.com.woolworths.analytics.Event
                                                                            /* renamed from: d */
                                                                            public final String getE() {
                                                                                return "checkout_store_promo_code_replacement_dialog";
                                                                            }

                                                                            public final boolean equals(Object obj6) {
                                                                                if (!(obj6 instanceof Event)) {
                                                                                    return false;
                                                                                }
                                                                                Event event = (Event) obj6;
                                                                                return "checkout_store_promo_code_replacement_dialog".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                                            }

                                                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                                            @Override // au.com.woolworths.analytics.Event
                                                                            public final Map getData() {
                                                                                return this.d;
                                                                            }
                                                                        });
                                                                    }
                                                                    return Unit.f24250a;
                                                                default:
                                                                    checkoutSummaryFragment3.o2().J6(((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b, false);
                                                                    break;
                                                            }
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer2.A(objG10);
                                                }
                                                Function0 function04 = (Function0) objG10;
                                                composer2.l();
                                                composer2.o(-1633490746);
                                                boolean zI11 = composer2.I(checkoutSummaryFragment3) | composer2.n(modalBottomSheetData2);
                                                Object objG11 = composer2.G();
                                                if (zI11 || objG11 == composer$Companion$Empty$1) {
                                                    final int i3 = 2;
                                                    objG11 = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.summary.a
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            Object value;
                                                            Object value2;
                                                            CheckoutContentContract.ViewState viewState3;
                                                            ModalBottomSheetData.PromoCode promoCode2;
                                                            switch (i3) {
                                                                case 0:
                                                                    CheckoutSummaryViewModel checkoutSummaryViewModelO210 = checkoutSummaryFragment3.o2();
                                                                    AnalyticsData analyticsData = ((ModalBottomSheetData.Info) modalBottomSheetData2).d;
                                                                    if (analyticsData != null) {
                                                                        checkoutSummaryViewModelO210.p.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, analyticsData));
                                                                    }
                                                                    MutableStateFlow mutableStateFlow = checkoutSummaryViewModelO210.j;
                                                                    do {
                                                                        value = mutableStateFlow.getValue();
                                                                    } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) value, false, null, null, 191)));
                                                                    return Unit.f24250a;
                                                                case 1:
                                                                    CheckoutSummaryViewModel checkoutSummaryViewModelO222 = checkoutSummaryFragment3.o2();
                                                                    String str3 = ((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b;
                                                                    ModalBottomSheetData modalBottomSheetData3 = ((CheckoutContentContract.ViewState) checkoutSummaryViewModelO222.j.getValue()).g;
                                                                    if (modalBottomSheetData3 != null) {
                                                                        List listA = ModalBottomSheetDataExtKt.a(modalBottomSheetData3);
                                                                        AnalyticsManager analyticsManager = checkoutSummaryViewModelO222.p;
                                                                        CheckoutAnalytics.Summary.Action.Companion companion = CheckoutAnalytics.Summary.Action.d;
                                                                        String code = CollectionsKt.M(listA, null, null, null, new d(17), 31);
                                                                        companion.getClass();
                                                                        Intrinsics.h(code, "code");
                                                                        analyticsManager.g(new Event(code, str3) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$replacePromoCodeConfirmButtonClick$1
                                                                            public final Object d;

                                                                            {
                                                                                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                                                                                spreadBuilder.b(CheckoutAnalytics.Summary.f);
                                                                                spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                                                                                spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                                                                spreadBuilder.a(new Pair("event.Label", "Promo code replacement dialog"));
                                                                                spreadBuilder.a(new Pair("event.Description", "Replacement confirmed"));
                                                                                androidx.constraintlayout.core.state.a.z("checkout.promoCodes", code, spreadBuilder, "checkout.exclusivepromoCodes", str3);
                                                                                ArrayList arrayList = spreadBuilder.f24269a;
                                                                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                                            }

                                                                            @Override // au.com.woolworths.analytics.Event
                                                                            /* renamed from: d */
                                                                            public final String getE() {
                                                                                return "checkout_store_promo_code_replacement_dialog";
                                                                            }

                                                                            public final boolean equals(Object obj6) {
                                                                                if (!(obj6 instanceof Event)) {
                                                                                    return false;
                                                                                }
                                                                                Event event = (Event) obj6;
                                                                                return "checkout_store_promo_code_replacement_dialog".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                                            }

                                                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                                            @Override // au.com.woolworths.analytics.Event
                                                                            public final Map getData() {
                                                                                return this.d;
                                                                            }
                                                                        });
                                                                    }
                                                                    checkoutSummaryViewModelO222.J6(str3, true);
                                                                    break;
                                                                case 2:
                                                                    CheckoutSummaryViewModel checkoutSummaryViewModelO232 = checkoutSummaryFragment3.o2();
                                                                    String str4 = ((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b;
                                                                    MutableStateFlow mutableStateFlow2 = checkoutSummaryViewModelO232.j;
                                                                    do {
                                                                        value2 = mutableStateFlow2.getValue();
                                                                        viewState3 = (CheckoutContentContract.ViewState) value2;
                                                                        ModalBottomSheetData modalBottomSheetData4 = ((CheckoutContentContract.ViewState) mutableStateFlow2.getValue()).g;
                                                                        promoCode2 = modalBottomSheetData4 instanceof ModalBottomSheetData.PromoCode ? (ModalBottomSheetData.PromoCode) modalBottomSheetData4 : null;
                                                                    } while (!mutableStateFlow2.d(value2, CheckoutContentContract.ViewState.a(viewState3, false, null, promoCode2 != null ? ModalBottomSheetData.PromoCode.a(promoCode2, null, null, null, null, null, null, 47) : null, 191)));
                                                                    ModalBottomSheetData modalBottomSheetData5 = ((CheckoutContentContract.ViewState) mutableStateFlow2.getValue()).g;
                                                                    if (modalBottomSheetData5 != null) {
                                                                        List listA2 = ModalBottomSheetDataExtKt.a(modalBottomSheetData5);
                                                                        AnalyticsManager analyticsManager2 = checkoutSummaryViewModelO232.p;
                                                                        CheckoutAnalytics.Summary.Action.Companion companion2 = CheckoutAnalytics.Summary.Action.d;
                                                                        String code2 = CollectionsKt.M(listA2, null, null, null, new d(18), 31);
                                                                        companion2.getClass();
                                                                        Intrinsics.h(code2, "code");
                                                                        analyticsManager2.g(new Event(code2, str4) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$replacePromoCodeCancelButtonClick$1
                                                                            public final Object d;

                                                                            {
                                                                                SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                                                                                spreadBuilder.b(CheckoutAnalytics.Summary.f);
                                                                                spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                                                                                spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                                                                spreadBuilder.a(new Pair("event.Label", "Promo code replacement dialog"));
                                                                                spreadBuilder.a(new Pair("event.Description", "Replacement denied"));
                                                                                androidx.constraintlayout.core.state.a.z("checkout.promoCodes", code2, spreadBuilder, "checkout.exclusivepromoCodes", str4);
                                                                                ArrayList arrayList = spreadBuilder.f24269a;
                                                                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                                            }

                                                                            @Override // au.com.woolworths.analytics.Event
                                                                            /* renamed from: d */
                                                                            public final String getE() {
                                                                                return "checkout_store_promo_code_replacement_dialog";
                                                                            }

                                                                            public final boolean equals(Object obj6) {
                                                                                if (!(obj6 instanceof Event)) {
                                                                                    return false;
                                                                                }
                                                                                Event event = (Event) obj6;
                                                                                return "checkout_store_promo_code_replacement_dialog".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                                            }

                                                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                                            @Override // au.com.woolworths.analytics.Event
                                                                            public final Map getData() {
                                                                                return this.d;
                                                                            }
                                                                        });
                                                                    }
                                                                    return Unit.f24250a;
                                                                default:
                                                                    checkoutSummaryFragment3.o2().J6(((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b, false);
                                                                    break;
                                                            }
                                                            return Unit.f24250a;
                                                        }
                                                    };
                                                    composer2.A(objG11);
                                                }
                                                composer2.l();
                                                PromoCodeConfirmationDialogKt.a(applyCheckoutPromoCodeConfirmation, function04, (Function0) objG11, composer2, 0);
                                            }
                                            composer2.l();
                                            boolean z2 = viewState2.f10755a;
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO210 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI12 = composer2.I(checkoutSummaryViewModelO210);
                                            Object objG12 = composer2.G();
                                            if (zI12 || objG12 == composer$Companion$Empty$1) {
                                                CheckoutSummaryFragment$updateBottomSheet$1$1$1$11$1 checkoutSummaryFragment$updateBottomSheet$1$1$1$11$1 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$11$1(1, checkoutSummaryViewModelO210, CheckoutSummaryViewModel.class, "promoCodeChanged", "promoCodeChanged(Ljava/lang/String;)V", 0);
                                                composer2.A(checkoutSummaryFragment$updateBottomSheet$1$1$1$11$1);
                                                objG12 = checkoutSummaryFragment$updateBottomSheet$1$1$1$11$1;
                                            }
                                            composer2.l();
                                            Function1 function13 = (Function1) ((KFunction) objG12);
                                            composer2.o(-1633490746);
                                            boolean zI13 = composer2.I(checkoutSummaryFragment3) | composer2.n(modalBottomSheetData2);
                                            Object objG13 = composer2.G();
                                            if (zI13 || objG13 == composer$Companion$Empty$1) {
                                                final int i4 = 3;
                                                objG13 = new Function0() { // from class: au.com.woolworths.shop.checkout.ui.summary.a
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Object value;
                                                        Object value2;
                                                        CheckoutContentContract.ViewState viewState3;
                                                        ModalBottomSheetData.PromoCode promoCode2;
                                                        switch (i4) {
                                                            case 0:
                                                                CheckoutSummaryViewModel checkoutSummaryViewModelO2102 = checkoutSummaryFragment3.o2();
                                                                AnalyticsData analyticsData = ((ModalBottomSheetData.Info) modalBottomSheetData2).d;
                                                                if (analyticsData != null) {
                                                                    checkoutSummaryViewModelO2102.p.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, analyticsData));
                                                                }
                                                                MutableStateFlow mutableStateFlow = checkoutSummaryViewModelO2102.j;
                                                                do {
                                                                    value = mutableStateFlow.getValue();
                                                                } while (!mutableStateFlow.d(value, CheckoutContentContract.ViewState.a((CheckoutContentContract.ViewState) value, false, null, null, 191)));
                                                                return Unit.f24250a;
                                                            case 1:
                                                                CheckoutSummaryViewModel checkoutSummaryViewModelO222 = checkoutSummaryFragment3.o2();
                                                                String str3 = ((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b;
                                                                ModalBottomSheetData modalBottomSheetData3 = ((CheckoutContentContract.ViewState) checkoutSummaryViewModelO222.j.getValue()).g;
                                                                if (modalBottomSheetData3 != null) {
                                                                    List listA = ModalBottomSheetDataExtKt.a(modalBottomSheetData3);
                                                                    AnalyticsManager analyticsManager = checkoutSummaryViewModelO222.p;
                                                                    CheckoutAnalytics.Summary.Action.Companion companion = CheckoutAnalytics.Summary.Action.d;
                                                                    String code = CollectionsKt.M(listA, null, null, null, new d(17), 31);
                                                                    companion.getClass();
                                                                    Intrinsics.h(code, "code");
                                                                    analyticsManager.g(new Event(code, str3) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$replacePromoCodeConfirmButtonClick$1
                                                                        public final Object d;

                                                                        {
                                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                                                                            spreadBuilder.b(CheckoutAnalytics.Summary.f);
                                                                            spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                                                                            spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                                                            spreadBuilder.a(new Pair("event.Label", "Promo code replacement dialog"));
                                                                            spreadBuilder.a(new Pair("event.Description", "Replacement confirmed"));
                                                                            androidx.constraintlayout.core.state.a.z("checkout.promoCodes", code, spreadBuilder, "checkout.exclusivepromoCodes", str3);
                                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                                        }

                                                                        @Override // au.com.woolworths.analytics.Event
                                                                        /* renamed from: d */
                                                                        public final String getE() {
                                                                            return "checkout_store_promo_code_replacement_dialog";
                                                                        }

                                                                        public final boolean equals(Object obj6) {
                                                                            if (!(obj6 instanceof Event)) {
                                                                                return false;
                                                                            }
                                                                            Event event = (Event) obj6;
                                                                            return "checkout_store_promo_code_replacement_dialog".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                                        }

                                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                                        @Override // au.com.woolworths.analytics.Event
                                                                        public final Map getData() {
                                                                            return this.d;
                                                                        }
                                                                    });
                                                                }
                                                                checkoutSummaryViewModelO222.J6(str3, true);
                                                                break;
                                                            case 2:
                                                                CheckoutSummaryViewModel checkoutSummaryViewModelO232 = checkoutSummaryFragment3.o2();
                                                                String str4 = ((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b;
                                                                MutableStateFlow mutableStateFlow2 = checkoutSummaryViewModelO232.j;
                                                                do {
                                                                    value2 = mutableStateFlow2.getValue();
                                                                    viewState3 = (CheckoutContentContract.ViewState) value2;
                                                                    ModalBottomSheetData modalBottomSheetData4 = ((CheckoutContentContract.ViewState) mutableStateFlow2.getValue()).g;
                                                                    promoCode2 = modalBottomSheetData4 instanceof ModalBottomSheetData.PromoCode ? (ModalBottomSheetData.PromoCode) modalBottomSheetData4 : null;
                                                                } while (!mutableStateFlow2.d(value2, CheckoutContentContract.ViewState.a(viewState3, false, null, promoCode2 != null ? ModalBottomSheetData.PromoCode.a(promoCode2, null, null, null, null, null, null, 47) : null, 191)));
                                                                ModalBottomSheetData modalBottomSheetData5 = ((CheckoutContentContract.ViewState) mutableStateFlow2.getValue()).g;
                                                                if (modalBottomSheetData5 != null) {
                                                                    List listA2 = ModalBottomSheetDataExtKt.a(modalBottomSheetData5);
                                                                    AnalyticsManager analyticsManager2 = checkoutSummaryViewModelO232.p;
                                                                    CheckoutAnalytics.Summary.Action.Companion companion2 = CheckoutAnalytics.Summary.Action.d;
                                                                    String code2 = CollectionsKt.M(listA2, null, null, null, new d(18), 31);
                                                                    companion2.getClass();
                                                                    Intrinsics.h(code2, "code");
                                                                    analyticsManager2.g(new Event(code2, str4) { // from class: au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics$Summary$Action$Companion$replacePromoCodeCancelButtonClick$1
                                                                        public final Object d;

                                                                        {
                                                                            SpreadBuilder spreadBuilder = new SpreadBuilder(7);
                                                                            spreadBuilder.b(CheckoutAnalytics.Summary.f);
                                                                            spreadBuilder.a(new Pair("event.Category", "Rewards, store credit and promo tiles"));
                                                                            spreadBuilder.a(new Pair("event.Action", "dialog_click"));
                                                                            spreadBuilder.a(new Pair("event.Label", "Promo code replacement dialog"));
                                                                            spreadBuilder.a(new Pair("event.Description", "Replacement denied"));
                                                                            androidx.constraintlayout.core.state.a.z("checkout.promoCodes", code2, spreadBuilder, "checkout.exclusivepromoCodes", str4);
                                                                            ArrayList arrayList = spreadBuilder.f24269a;
                                                                            this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                                                        }

                                                                        @Override // au.com.woolworths.analytics.Event
                                                                        /* renamed from: d */
                                                                        public final String getE() {
                                                                            return "checkout_store_promo_code_replacement_dialog";
                                                                        }

                                                                        public final boolean equals(Object obj6) {
                                                                            if (!(obj6 instanceof Event)) {
                                                                                return false;
                                                                            }
                                                                            Event event = (Event) obj6;
                                                                            return "checkout_store_promo_code_replacement_dialog".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                                                        }

                                                                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                                                        @Override // au.com.woolworths.analytics.Event
                                                                        public final Map getData() {
                                                                            return this.d;
                                                                        }
                                                                    });
                                                                }
                                                                return Unit.f24250a;
                                                            default:
                                                                checkoutSummaryFragment3.o2().J6(((ModalBottomSheetData.PromoCode) modalBottomSheetData2).b, false);
                                                                break;
                                                        }
                                                        return Unit.f24250a;
                                                    }
                                                };
                                                composer2.A(objG13);
                                            }
                                            Function0 function05 = (Function0) objG13;
                                            composer2.l();
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO211 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI14 = composer2.I(checkoutSummaryViewModelO211);
                                            Object objG14 = composer2.G();
                                            if (zI14 || objG14 == composer$Companion$Empty$1) {
                                                CheckoutSummaryFragment$updateBottomSheet$1$1$1$13$1 checkoutSummaryFragment$updateBottomSheet$1$1$1$13$1 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$13$1(1, checkoutSummaryViewModelO211, CheckoutSummaryViewModel.class, "removeCheckoutPromoCode", "removeCheckoutPromoCode(Ljava/lang/String;)V", 0);
                                                composer2.A(checkoutSummaryFragment$updateBottomSheet$1$1$1$13$1);
                                                objG14 = checkoutSummaryFragment$updateBottomSheet$1$1$1$13$1;
                                            }
                                            composer2.l();
                                            Function1 function14 = (Function1) ((KFunction) objG14);
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO212 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI15 = composer2.I(checkoutSummaryViewModelO212);
                                            Object objG15 = composer2.G();
                                            if (zI15 || objG15 == composer$Companion$Empty$1) {
                                                objG15 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$14$1(0, checkoutSummaryViewModelO212, CheckoutSummaryViewModel.class, "onPromoCodeSnackBarMessageShown", "onPromoCodeSnackBarMessageShown()V", 0);
                                                composer2.A(objG15);
                                            }
                                            composer2.l();
                                            Function0 function06 = (Function0) ((KFunction) objG15);
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO213 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI16 = composer2.I(checkoutSummaryViewModelO213);
                                            Object objG16 = composer2.G();
                                            if (zI16 || objG16 == composer$Companion$Empty$1) {
                                                objG16 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$15$1(0, checkoutSummaryViewModelO213, CheckoutSummaryViewModel.class, "onDismissModalBottomSheet", "onDismissModalBottomSheet()V", 0);
                                                composer2.A(objG16);
                                            }
                                            composer2.l();
                                            Function0 function07 = (Function0) ((KFunction) objG16);
                                            CheckoutSummaryViewModel checkoutSummaryViewModelO214 = checkoutSummaryFragment3.o2();
                                            composer2.o(5004770);
                                            boolean zI17 = composer2.I(checkoutSummaryViewModelO214);
                                            Object objG17 = composer2.G();
                                            if (zI17 || objG17 == composer$Companion$Empty$1) {
                                                CheckoutSummaryFragment$updateBottomSheet$1$1$1$16$1 checkoutSummaryFragment$updateBottomSheet$1$1$1$16$1 = new CheckoutSummaryFragment$updateBottomSheet$1$1$1$16$1(1, checkoutSummaryViewModelO214, CheckoutSummaryViewModel.class, "onInsetBannerActionClick", "onInsetBannerActionClick(Lau/com/woolworths/shop/checkout/domain/model/ApplyCheckoutPromoCodeResult$ApplyCheckoutPromoCodeAdditionalInfo;)V", 0);
                                                composer2.A(checkoutSummaryFragment$updateBottomSheet$1$1$1$16$1);
                                                objG17 = checkoutSummaryFragment$updateBottomSheet$1$1$1$16$1;
                                            }
                                            composer2.l();
                                            PromoCodeModalKt.a(z2, promoCode, function13, function05, function14, function06, function07, (Function1) ((KFunction) objG17), null, null, composer2, 0);
                                            composer2.l();
                                        }
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                    }
                    return Unit.f24250a;
                }
            }, true, 2124735805));
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryFragment$observeData$1(CheckoutSummaryFragment checkoutSummaryFragment, Continuation continuation) {
        super(2, continuation);
        this.q = checkoutSummaryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutSummaryFragment$observeData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutSummaryFragment$observeData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CheckoutSummaryFragment checkoutSummaryFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(checkoutSummaryFragment, null), FlowExtKt.a(checkoutSummaryFragment.o2().m, checkoutSummaryFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
