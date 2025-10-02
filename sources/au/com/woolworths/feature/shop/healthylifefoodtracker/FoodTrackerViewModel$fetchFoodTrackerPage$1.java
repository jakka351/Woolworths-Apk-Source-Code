package au.com.woolworths.feature.shop.healthylifefoodtracker;

import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.healthylife.foodtracker.HealthyLifeFoodTrackerAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerContentFeed;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerPage;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.FoodTrackerWebView;
import au.com.woolworths.foundation.ui.fullpagemessage.legacy.FullPageMessage;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerViewModel$fetchFoodTrackerPage$1", f = "FoodTrackerViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FoodTrackerViewModel$fetchFoodTrackerPage$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FoodTrackerViewModel q;
    public final /* synthetic */ Function1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodTrackerViewModel$fetchFoodTrackerPage$1(FoodTrackerViewModel foodTrackerViewModel, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = foodTrackerViewModel;
        this.r = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoodTrackerViewModel$fetchFoodTrackerPage$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FoodTrackerViewModel$fetchFoodTrackerPage$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Exception {
        FoodTrackerViewModel foodTrackerViewModel = this.q;
        AnalyticsManager analyticsManager = foodTrackerViewModel.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                FoodTrackerInteractor foodTrackerInteractor = foodTrackerViewModel.e;
                String str = foodTrackerViewModel.k;
                this.p = 1;
                obj = foodTrackerInteractor.f7158a.a(str, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            FoodTrackerPage foodTrackerPage = (FoodTrackerPage) obj;
            String f7167a = foodTrackerPage != null ? foodTrackerPage.getF7165a() : null;
            if (f7167a == null) {
                f7167a = "";
            }
            FoodTrackerViewModel.q6(foodTrackerViewModel, foodTrackerViewModel.h, false, foodTrackerPage, f7167a, null, null, null, false, 120);
            Function1 function1 = this.r;
            if (function1 != null) {
                function1.invoke(foodTrackerPage);
            }
            if (foodTrackerPage instanceof FoodTrackerContentFeed) {
                analyticsManager.g(HealthyLifeFoodTrackerAnalytics.LandingPage.Action.e);
                HealthyLifeFoodTrackerAnalytics.LandingPage.Action.Companion companion = HealthyLifeFoodTrackerAnalytics.LandingPage.Action.d;
                final String str2 = ((FoodTrackerContentFeed) foodTrackerPage).d.e;
                final String str3 = ((FoodTrackerContentFeed) foodTrackerPage).d.b;
                companion.getClass();
                analyticsManager.g(new Event(str2, str3) { // from class: au.com.woolworths.analytics.supers.healthylife.foodtracker.HealthyLifeFoodTrackerAnalytics$LandingPage$Action$Companion$actionBannerImpression$1
                    public final Object d;

                    {
                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                        spreadBuilder.b(HealthyLifeFoodTrackerAnalytics.LandingPage.e);
                        spreadBuilder.a(new Pair("event.Category", "banner"));
                        spreadBuilder.a(new Pair("event.Action", "impression"));
                        a.z("event.Label", str2, spreadBuilder, "event.Description", str3);
                        ArrayList arrayList = spreadBuilder.f24269a;
                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d */
                    public final String getE() {
                        return "banner_impression";
                    }

                    public final boolean equals(Object obj2) {
                        if (!(obj2 instanceof Event)) {
                            return false;
                        }
                        Event event = (Event) obj2;
                        return "banner_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.d;
                    }
                });
            } else if (foodTrackerPage instanceof FoodTrackerWebView) {
                analyticsManager.g(HealthyLifeFoodTrackerAnalytics.WebviewPage.Action.d);
            }
        } catch (NoConnectivityException unused) {
            FoodTrackerViewModel.q6(foodTrackerViewModel, foodTrackerViewModel.h, false, null, null, null, FullPageMessage.Error.ConnectionError.f8919a, null, false, 110);
            analyticsManager.g(HealthyLifeFoodTrackerAnalytics.FullPageErrorState.Action.d);
        } catch (ServerErrorException unused2) {
            FoodTrackerViewModel.q6(foodTrackerViewModel, foodTrackerViewModel.h, false, null, null, null, FullPageMessage.Error.ServerError.f8920a, null, false, 110);
            analyticsManager.g(HealthyLifeFoodTrackerAnalytics.FullPageErrorState.Action.e);
        }
        return Unit.f24250a;
    }
}
