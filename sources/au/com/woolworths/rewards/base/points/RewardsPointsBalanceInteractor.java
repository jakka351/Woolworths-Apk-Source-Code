package au.com.woolworths.rewards.base.points;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalanceRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/points/RewardsPointsBalanceInteractor;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsPointsBalanceInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsPointsBalanceRepository f9376a;
    public final DispatcherProvider b;

    public RewardsPointsBalanceInteractor(RewardsPointsBalanceRepository rewardsPointsBalanceRepository, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(rewardsPointsBalanceRepository, "rewardsPointsBalanceRepository");
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f9376a = rewardsPointsBalanceRepository;
        this.b = dispatcherProvider;
    }

    public final Object a(Function1 function1, SuspendLambda suspendLambda) throws Throwable {
        this.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        Object objF = BuildersKt.f(MainDispatcherLoader.f24726a, new RewardsPointsBalanceInteractor$onBalanceChanged$2(this, function1, null), suspendLambda);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }
}
