package au.com.woolworths.feature.shop.healthylifefoodtracker;

import au.com.woolworths.analytics.supers.healthylife.foodtracker.HealthyLifeFoodTrackerAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.feature.shop.healthylifefoodtracker.data.UpdateFoodTrackerConsent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerViewModel$onGiveConsentToFoodTrackerClick$1", f = "FoodTrackerViewModel.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FoodTrackerViewModel$onGiveConsentToFoodTrackerClick$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ FoodTrackerViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodTrackerViewModel$onGiveConsentToFoodTrackerClick$1(FoodTrackerViewModel foodTrackerViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = foodTrackerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FoodTrackerViewModel$onGiveConsentToFoodTrackerClick$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FoodTrackerViewModel$onGiveConsentToFoodTrackerClick$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
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
                this.p = 1;
                obj = foodTrackerInteractor.f7158a.b(true, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            UpdateFoodTrackerConsent updateFoodTrackerConsent = (UpdateFoodTrackerConsent) obj;
            if (updateFoodTrackerConsent.b == null) {
                foodTrackerViewModel.p6(null);
            } else {
                FoodTrackerViewModel.q6(foodTrackerViewModel, foodTrackerViewModel.h, false, null, null, StatefulButtonState.d, null, new PlainText(updateFoodTrackerConsent.b), false, 87);
                analyticsManager.g(HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.g);
            }
        } catch (NoConnectivityException unused) {
            FoodTrackerViewModel.q6(foodTrackerViewModel, foodTrackerViewModel.h, false, null, null, StatefulButtonState.d, null, new ResText(com.woolworths.R.string.food_tracker_server_network_snackbar_message), false, 87);
            analyticsManager.g(HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.h);
        } catch (ServerErrorException unused2) {
            FoodTrackerViewModel.q6(foodTrackerViewModel, foodTrackerViewModel.h, false, null, null, StatefulButtonState.d, null, new ResText(com.woolworths.R.string.food_tracker_server_error_snackbar_message), false, 87);
            analyticsManager.g(HealthyLifeFoodTrackerAnalytics.ConsentModal.Action.g);
        }
        return Unit.f24250a;
    }
}
