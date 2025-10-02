package au.com.woolworths.sdui.rewards.broadcastbanner;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.foundation.rewards.banner.dismiss.BannerRemoteDismissInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/broadcastbanner/RemoteDismissibleBannerViewModel;", "Landroidx/lifecycle/ViewModel;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RemoteDismissibleBannerViewModel extends ViewModel {
    public final BannerRemoteDismissInteractor e;

    public RemoteDismissibleBannerViewModel(BannerRemoteDismissInteractor bannerRemoteDismissInteractor) {
        Intrinsics.h(bannerRemoteDismissInteractor, "bannerRemoteDismissInteractor");
        this.e = bannerRemoteDismissInteractor;
    }
}
