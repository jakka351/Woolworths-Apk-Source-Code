package au.com.woolworths.feature.rewards.offers.banner;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/banner/RewardsBannerInteractor;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsBannerInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final RewardsBannerRepository f6264a;

    public RewardsBannerInteractor(RewardsBannerRepository rewardsBannerRepository) {
        this.f6264a = rewardsBannerRepository;
    }

    public final Object a(String str, Continuation continuation) {
        RewardsBannerRepository rewardsBannerRepository = this.f6264a;
        rewardsBannerRepository.b.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        return BuildersKt.f(DefaultIoScheduler.f, new RewardsBannerRepository$notifyBannerDismissed$2(rewardsBannerRepository, str, null), continuation);
    }
}
