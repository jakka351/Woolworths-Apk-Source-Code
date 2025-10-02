package au.com.woolworths.feature.rewards.account.closeaccount;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.android.onesite.modules.rewards.RewardsAccountInteractor;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/closeaccount/CloseAccountInteractor;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloseAccountInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CloseAccountRepository f5687a;
    public final RewardsAccountInteractor b;
    public final ContextScope c;

    public CloseAccountInteractor(CloseAccountRepository closeAccountRepository, RewardsAccountInteractor rewardsAccountInteractor, DispatcherProvider dispatcher) {
        Intrinsics.h(rewardsAccountInteractor, "rewardsAccountInteractor");
        Intrinsics.h(dispatcher, "dispatcher");
        this.f5687a = closeAccountRepository;
        this.b = rewardsAccountInteractor;
        Job jobB = SupervisorKt.b();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        this.c = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.c((JobSupport) jobB, DefaultIoScheduler.f));
    }

    public final Object a(String str, Continuation continuation) {
        CloseAccountRepository closeAccountRepository = this.f5687a;
        closeAccountRepository.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new CloseAccountRepository$closeAccount$2(closeAccountRepository, str, null), continuation);
    }
}
