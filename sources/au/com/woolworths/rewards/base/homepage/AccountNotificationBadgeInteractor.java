package au.com.woolworths.rewards.base.homepage;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/homepage/AccountNotificationBadgeInteractor;", "", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AccountNotificationBadgeInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DispatcherProvider f9366a;
    public final MutableStateFlow b;

    public AccountNotificationBadgeInteractor(DispatcherProvider dispatcher) {
        Intrinsics.h(dispatcher, "dispatcher");
        this.f9366a = dispatcher;
        this.b = StateFlowKt.a(Boolean.FALSE);
    }
}
