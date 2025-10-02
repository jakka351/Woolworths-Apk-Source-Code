package au.com.woolworths.feature.rewards.card;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/RewardsCardInteractor;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsCardInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsCardRepository f5817a;

    public RewardsCardInteractor(RewardsCardRepository rewardsCardRepository) {
        this.f5817a = rewardsCardRepository;
    }

    public final Object a(Continuation continuation) {
        RewardsCardRepository rewardsCardRepository = this.f5817a;
        rewardsCardRepository.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new RewardsCardRepository$fetchDigitalWalletToken$2(rewardsCardRepository, null), continuation);
    }
}
