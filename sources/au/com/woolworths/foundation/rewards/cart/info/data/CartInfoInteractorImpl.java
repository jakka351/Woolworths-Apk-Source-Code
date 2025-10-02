package au.com.woolworths.foundation.rewards.cart.info.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.foundation.rewards.cart.info.domain.model.CartInfoResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/cart/info/data/CartInfoInteractorImpl;", "Lau/com/woolworths/foundation/rewards/cart/info/data/CartInfoInteractor;", "cart-info_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CartInfoInteractorImpl implements CartInfoInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final CartInfoRepositoryImpl f8550a;
    public final Job b;
    public final MutableStateFlow c;

    public CartInfoInteractorImpl(CartInfoRepositoryImpl cartInfoRepositoryImpl, DispatcherProvider dispatcherProvider) {
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f8550a = cartInfoRepositoryImpl;
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        ContextScope contextScopeA = CoroutineScopeKt.a(DefaultIoScheduler.f);
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.c = mutableStateFlowA;
        if (mutableStateFlowA.getValue() == null) {
            Job job = this.b;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                this.b = BuildersKt.c(contextScopeA, null, null, new CartInfoInteractorImpl$fetchCartInfo$1(this, null), 3);
            }
        }
    }

    @Override // au.com.woolworths.foundation.rewards.cart.info.data.CartInfoInteractor
    public final void clear() {
        CartInfoResponse cartInfoResponse = new CartInfoResponse(0, "");
        MutableStateFlow mutableStateFlow = this.c;
        mutableStateFlow.setValue(cartInfoResponse);
        mutableStateFlow.setValue(null);
    }
}
