package au.com.woolworths.shop.rewards.priming.repository;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/repository/PrimingScreenRepositoryImpl;", "Lau/com/woolworths/shop/rewards/priming/repository/PrimingScreenRepository;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PrimingScreenRepositoryImpl implements PrimingScreenRepository {

    /* renamed from: a, reason: collision with root package name */
    public final DispatcherProvider f12909a;

    public PrimingScreenRepositoryImpl(DispatcherProvider dispatcherProvider) {
        Intrinsics.h(dispatcherProvider, "dispatcherProvider");
        this.f12909a = dispatcherProvider;
    }

    public final Object a(boolean z, Continuation continuation) {
        this.f12909a.getClass();
        return BuildersKt.f(Dispatchers.f24691a, new PrimingScreenRepositoryImpl$fetchPrimingPageData$2(z, this, null), continuation);
    }
}
