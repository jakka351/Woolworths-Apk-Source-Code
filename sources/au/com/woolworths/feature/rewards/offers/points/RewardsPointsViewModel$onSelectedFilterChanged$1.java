package au.com.woolworths.feature.rewards.offers.points;

import au.com.woolworths.feature.rewards.offers.data.OffersFilterAnalytics;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.list.analytics.RewardsFilterActionData;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel$onSelectedFilterChanged$1", f = "RewardsPointsViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsPointsViewModel$onSelectedFilterChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ RewardsPointsViewModel p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPointsViewModel$onSelectedFilterChanged$1(RewardsPointsViewModel rewardsPointsViewModel, int i, Continuation continuation) {
        super(2, continuation);
        this.p = rewardsPointsViewModel;
        this.q = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsPointsViewModel$onSelectedFilterChanged$1(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RewardsPointsViewModel$onSelectedFilterChanged$1 rewardsPointsViewModel$onSelectedFilterChanged$1 = (RewardsPointsViewModel$onSelectedFilterChanged$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        rewardsPointsViewModel$onSelectedFilterChanged$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objJ;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        RewardsPointsViewModel rewardsPointsViewModel = this.p;
        Set set = ((RewardsPointsContract.ViewState) rewardsPointsViewModel.A.getValue()).h;
        if (set != null) {
            Set set2 = set;
            boolean z = set2 instanceof List;
            int i = this.q;
            if (z) {
                objJ = CollectionsKt.J(i, (List) set2);
            } else if (i < 0) {
                objJ = null;
            } else {
                int i2 = 0;
                for (Object obj2 : set2) {
                    int i3 = i2 + 1;
                    if (i == i2) {
                        objJ = obj2;
                        break;
                    }
                    i2 = i3;
                }
                objJ = null;
            }
            RewardsOfferFilterData rewardsOfferFilterData = (RewardsOfferFilterData) objJ;
            if (rewardsOfferFilterData != null) {
                OffersFilterAnalytics offersFilterAnalytics = rewardsOfferFilterData.e;
                if (offersFilterAnalytics != null) {
                    rewardsPointsViewModel.p.c(new RewardsFilterActionData(offersFilterAnalytics.f6277a));
                }
                MutableStateFlow mutableStateFlow = rewardsPointsViewModel.w;
                mutableStateFlow.setValue(RewardsPointsContract.ViewState.a((RewardsPointsContract.ViewState) mutableStateFlow.getValue(), false, null, rewardsOfferFilterData, false, null, null, 3839));
            }
        }
        return Unit.f24250a;
    }
}
