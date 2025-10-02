package au.com.woolworths.shop.rewards.priming;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingViewModel;", "Landroidx/lifecycle/ViewModel;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsSetupPrimingViewModel extends ViewModel {
    public final LaunchManager e;
    public final GetScreenDataInteractor f;
    public final AnalyticsManager g;
    public boolean h;
    public boolean i;
    public final MutableStateFlow j;
    public final StateFlow k;
    public final SharedFlowImpl l;
    public final SharedFlow m;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12903a;

        static {
            int[] iArr = new int[LaunchManager.LaunchState.values().length];
            try {
                iArr[4] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f12903a = iArr;
        }
    }

    public RewardsSetupPrimingViewModel(LaunchManager launchManager, GetScreenDataInteractor getScreenDataInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(launchManager, "launchManager");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = launchManager;
        this.f = getScreenDataInteractor;
        this.g = analyticsManager;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(RewardsSetupPrimingContract.Companion.f12901a);
        this.j = mutableStateFlowA;
        this.k = FlowKt.b(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p6(boolean r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel$updatePrimingScreen$1
            if (r0 == 0) goto L13
            r0 = r8
            au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel$updatePrimingScreen$1 r0 = (au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel$updatePrimingScreen$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel$updatePrimingScreen$1 r0 = new au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel$updatePrimingScreen$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlinx.coroutines.flow.MutableStateFlow r3 = r6.j
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.b(r8)
            goto L55
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            kotlin.ResultKt.b(r8)
        L34:
            java.lang.Object r8 = r3.getValue()
            r2 = r8
            au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract$ViewState r2 = (au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract.ViewState) r2
            au.com.woolworths.shop.rewards.priming.data.PrimingScreenData r2 = r2.b
            au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract$ViewState r5 = new au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract$ViewState
            r5.<init>(r4, r2)
            boolean r8 = r3.d(r8, r5)
            if (r8 == 0) goto L34
            r0.r = r4
            au.com.woolworths.shop.rewards.priming.GetScreenDataInteractor r8 = r6.f
            au.com.woolworths.shop.rewards.priming.repository.PrimingScreenRepositoryImpl r8 = r8.f12895a
            java.lang.Object r8 = r8.a(r7, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            au.com.woolworths.shop.rewards.priming.data.PrimingScreenData r8 = (au.com.woolworths.shop.rewards.priming.data.PrimingScreenData) r8
        L57:
            java.lang.Object r7 = r3.getValue()
            r0 = r7
            au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract$ViewState r0 = (au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract.ViewState) r0
            r0.getClass()
            au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract$ViewState r0 = new au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract$ViewState
            r1 = 0
            r0.<init>(r1, r8)
            boolean r7 = r3.d(r7, r0)
            if (r7 == 0) goto L57
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel.p6(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
