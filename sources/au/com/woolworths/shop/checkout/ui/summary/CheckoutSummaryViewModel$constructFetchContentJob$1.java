package au.com.woolworths.shop.checkout.ui.summary;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.analytics.supers.checkout.CheckoutAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.checkout.data.source.NoProductsException;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscounts;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutAnalyticsExtKt;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutSummaryActions;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel;
import au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.CheckoutSummaryViewModel$constructFetchContentJob$1", f = "CheckoutSummaryViewModel.kt", l = {438}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CheckoutSummaryViewModel$constructFetchContentJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public CheckoutSummaryViewModel p;
    public c q;
    public int r;
    public int s;
    public final /* synthetic */ CheckoutSummaryViewModel t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutSummaryViewModel$constructFetchContentJob$1(CheckoutSummaryViewModel checkoutSummaryViewModel, Continuation continuation) {
        super(2, continuation);
        this.t = checkoutSummaryViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CheckoutSummaryViewModel$constructFetchContentJob$1(this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CheckoutSummaryViewModel$constructFetchContentJob$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [au.com.woolworths.shop.checkout.ui.summary.c] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        final CheckoutSummaryViewModel checkoutSummaryViewModel;
        int i;
        c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i2 = this.s;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                checkoutSummaryViewModel = this.t;
                ?? r1 = new Function1() { // from class: au.com.woolworths.shop.checkout.ui.summary.c
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Checkout checkout = (Checkout) obj2;
                        CheckoutSummaryViewModel checkoutSummaryViewModel2 = checkoutSummaryViewModel;
                        AnalyticsManager analyticsManager = checkoutSummaryViewModel2.p;
                        List list = checkout.h;
                        if (list != null) {
                            List list2 = list;
                            if ((list2 instanceof Collection) && list2.isEmpty()) {
                                checkoutSummaryViewModel2.E6(CheckoutSummaryActions.DataLoaded.e, CheckoutAnalyticsExtKt.a(checkout));
                            } else {
                                Iterator it = list2.iterator();
                                while (it.hasNext()) {
                                    String tealiumEvent = ((AnalyticsData) it.next()).getTealiumEvent();
                                    CheckoutSummaryActions.DataLoaded.e.getClass();
                                    if (Intrinsics.c(tealiumEvent, CheckoutSummaryActions.DataLoaded.f.f)) {
                                        break;
                                    }
                                }
                                checkoutSummaryViewModel2.E6(CheckoutSummaryActions.DataLoaded.e, CheckoutAnalyticsExtKt.a(checkout));
                            }
                        }
                        List<AnalyticsData> list3 = checkout.h;
                        if (list3 != null) {
                            for (AnalyticsData analyticsData : list3) {
                                String tealiumEvent2 = analyticsData.getTealiumEvent();
                                final CheckoutSummaryActions.DataLoaded dataLoaded = CheckoutSummaryActions.DataLoaded.e;
                                dataLoaded.getClass();
                                if (Intrinsics.c(tealiumEvent2, CheckoutSummaryActions.DataLoaded.f.f)) {
                                    checkoutSummaryViewModel2.C6(AnalyticsDataKt.b(new Event() { // from class: au.com.woolworths.android.onesite.analytics.ActionExtKt$toEvent$1
                                        @Override // au.com.woolworths.analytics.Event
                                        /* renamed from: d */
                                        public final String getE() {
                                            return dataLoaded.getI().f;
                                        }

                                        @Override // au.com.woolworths.analytics.Event
                                        public final Map getData() {
                                            return dataLoaded.l();
                                        }
                                    }, analyticsData), CheckoutAnalyticsExtKt.a(checkout));
                                } else {
                                    analyticsManager.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, analyticsData));
                                }
                            }
                        }
                        List list4 = checkout.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj3 : list4) {
                            if (obj3 instanceof CheckoutRewardsAndDiscounts) {
                                arrayList.add(obj3);
                            }
                        }
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Iterator it3 = ((Iterable) ((CheckoutRewardsAndDiscounts) it2.next()).c).iterator();
                            while (it3.hasNext()) {
                                analyticsManager.g(AnalyticsDataKt.b(CheckoutAnalytics.Summary.d, (AnalyticsData) it3.next()));
                            }
                        }
                        return Unit.f24250a;
                    }
                };
                CheckoutContentViewModel.A6(checkoutSummaryViewModel.j, true);
                CheckoutSummaryInteractor checkoutSummaryInteractor = checkoutSummaryViewModel.o;
                this.p = checkoutSummaryViewModel;
                this.q = r1;
                this.r = 1;
                this.s = 1;
                obj = checkoutSummaryInteractor.f10823a.n(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                i = 1;
                cVar = r1;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.r;
                c cVar2 = this.q;
                checkoutSummaryViewModel = this.p;
                ResultKt.b(obj);
                cVar = cVar2;
            }
            Checkout checkout = (Checkout) obj;
            if (i == 0) {
                z = false;
            }
            checkoutSummaryViewModel.y6(checkout, z);
            if (cVar != null) {
                cVar.invoke(checkout);
            }
        } catch (NoConnectivityException unused) {
            CheckoutContentViewModel.p6(checkoutSummaryViewModel, checkoutSummaryViewModel.j, CheckoutFullPageErrorState.d);
        } catch (ServerErrorException unused2) {
            CheckoutContentViewModel.p6(checkoutSummaryViewModel, checkoutSummaryViewModel.j, CheckoutFullPageErrorState.e);
        } catch (NoProductsException unused3) {
            CheckoutContentViewModel.p6(checkoutSummaryViewModel, checkoutSummaryViewModel.j, CheckoutFullPageErrorState.f);
        }
        return Unit.f24250a;
    }
}
