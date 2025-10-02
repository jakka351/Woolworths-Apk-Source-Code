package au.com.woolworths.feature.shop.instore.cart;

import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.cart.instorecart.InstoreCartAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.instore.cart.InstoreCartContract;
import au.com.woolworths.feature.shop.instore.cart.data.InstoreCartData;
import au.com.woolworths.feature.shop.instore.cart.domain.InstoreCartRepository;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.cart.InstoreCartViewModel$fetchCart$2", f = "InstoreCartViewModel.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InstoreCartViewModel$fetchCart$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InstoreCartViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstoreCartViewModel$fetchCart$2(InstoreCartViewModel instoreCartViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = instoreCartViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InstoreCartViewModel$fetchCart$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstoreCartViewModel$fetchCart$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object instoreCartContent;
        InstoreCartViewModel instoreCartViewModel = this.q;
        MutableStateFlow mutableStateFlow = instoreCartViewModel.j;
        AnalyticsManager analyticsManager = instoreCartViewModel.e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                String strA = instoreCartViewModel.h.a();
                if (strA == null) {
                    strA = "";
                }
                InstoreCartRepository instoreCartRepository = instoreCartViewModel.f;
                this.p = 1;
                obj = instoreCartRepository.a(strA, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            InstoreCartData instoreCartData = (InstoreCartData) obj;
            Intrinsics.h(instoreCartData, "<this>");
            if (instoreCartData.f7318a == 0) {
                analyticsManager.g(new InstoreCartAnalytics.CartScreen());
                instoreCartContent = InstoreCartContract.ViewState.Empty.f7303a;
            } else {
                analyticsManager.g(new InstoreCartAnalytics.CartScreen());
                instoreCartContent = new InstoreCartContract.ViewState.InstoreCartContent(instoreCartData, instoreCartViewModel.g.d());
            }
            mutableStateFlow.setValue(instoreCartContent);
        } catch (NoConnectivityException unused) {
            InstoreCartAnalytics.ErrorScreen.Action.d.getClass();
            analyticsManager.g(new Event() { // from class: au.com.woolworths.analytics.supers.cart.instorecart.InstoreCartAnalytics$ErrorScreen$Action$Companion$networkErrorImpression$1
                public final Object d;

                {
                    SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                    spreadBuilder.b(InstoreCartAnalytics.ErrorScreen.e);
                    spreadBuilder.a(new Pair("event.Category", "error"));
                    spreadBuilder.a(new Pair("event.Action", "impression"));
                    spreadBuilder.a(new Pair("event.Label", "Network Error"));
                    spreadBuilder.a(new Pair("user.MarketOrderCount", ""));
                    spreadBuilder.a(new Pair("user.SupersOrderCount", ""));
                    ArrayList arrayList = spreadBuilder.f24269a;
                    this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                }

                @Override // au.com.woolworths.analytics.Event
                /* renamed from: d */
                public final String getE() {
                    return "error_impression";
                }

                public final boolean equals(Object obj2) {
                    if (!(obj2 instanceof Event)) {
                        return false;
                    }
                    Event event = (Event) obj2;
                    return "error_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                }

                /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                @Override // au.com.woolworths.analytics.Event
                public final Map getData() {
                    return this.d;
                }
            });
            instoreCartViewModel.l = new a(instoreCartViewModel, 1);
            mutableStateFlow.setValue(new InstoreCartContract.ViewState.Error(FullPageMessage.Error.ConnectionError.f8915a));
        } catch (ServerErrorException unused2) {
            InstoreCartViewModel.p6(instoreCartViewModel);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused3) {
            InstoreCartViewModel.p6(instoreCartViewModel);
        }
        return Unit.f24250a;
    }
}
