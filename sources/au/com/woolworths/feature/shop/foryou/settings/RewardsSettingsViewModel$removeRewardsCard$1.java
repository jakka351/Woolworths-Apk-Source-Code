package au.com.woolworths.feature.shop.foryou.settings;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsContract;
import au.com.woolworths.feature.shop.foryou.settings.analytics.RewardsSettingsActionData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.foryou.settings.RewardsSettingsViewModel$removeRewardsCard$1", f = "RewardsSettingsViewModel.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RewardsSettingsViewModel$removeRewardsCard$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ RewardsSettingsViewModel q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsSettingsViewModel$removeRewardsCard$1(RewardsSettingsViewModel rewardsSettingsViewModel, Continuation continuation) {
        super(2, continuation);
        this.q = rewardsSettingsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RewardsSettingsViewModel$removeRewardsCard$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RewardsSettingsViewModel$removeRewardsCard$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        RewardsSettingsViewModel rewardsSettingsViewModel = this.q;
        SharedFlowImpl sharedFlowImpl = rewardsSettingsViewModel.h;
        MutableLiveData mutableLiveData = rewardsSettingsViewModel.j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ArrayList arrayList2 = rewardsSettingsViewModel.k;
                if (arrayList2 == null) {
                    Intrinsics.p("options");
                    throw null;
                }
                mutableLiveData.m(new RewardsSettingsContract.ViewState(arrayList2, true));
                RewardsSettingsInteractor rewardsSettingsInteractor = rewardsSettingsViewModel.e;
                this.p = 1;
                if (rewardsSettingsInteractor.a(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            sharedFlowImpl.f(RewardsSettingsContract.Actions.CloseRewards.f7138a);
            arrayList = rewardsSettingsViewModel.k;
        } catch (Throwable th) {
            AnalyticsManager analyticsManager = rewardsSettingsViewModel.g;
            rewardsSettingsViewModel.f.getClass();
            if (th instanceof NoConnectivityException) {
                analyticsManager.c(RewardsSettingsActionData.m);
                sharedFlowImpl.f(new RewardsSettingsContract.Actions.RemoveCardNetworkError());
            } else {
                analyticsManager.c(RewardsSettingsActionData.o);
                sharedFlowImpl.f(new RewardsSettingsContract.Actions.RemoveCardServerError());
            }
            ArrayList arrayList3 = rewardsSettingsViewModel.k;
            if (arrayList3 == null) {
                Intrinsics.p("options");
                throw null;
            }
            mutableLiveData.m(new RewardsSettingsContract.ViewState(arrayList3, false));
        }
        if (arrayList != null) {
            mutableLiveData.m(new RewardsSettingsContract.ViewState(arrayList, false));
            return Unit.f24250a;
        }
        Intrinsics.p("options");
        throw null;
    }
}
