package au.com.woolworths.feature.rewards.card.overlay.ui;

import android.os.Build;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayContract;
import au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferedChannel;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsCardOverlayScreenKt$RewardsCardOverlayScreen$2$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        RewardsCardOverlayViewModel rewardsCardOverlayViewModel = (RewardsCardOverlayViewModel) this.receiver;
        rewardsCardOverlayViewModel.getClass();
        BufferedChannel bufferedChannel = rewardsCardOverlayViewModel.k;
        bufferedChannel.k(new RewardsCardOverlayContract.Action.CopyCardNumberToClipboard(p0));
        if (Build.VERSION.SDK_INT < 33) {
            bufferedChannel.k(RewardsCardOverlayContract.Action.ShowCardNumberCopiedMessage.f5830a);
        }
        return Unit.f24250a;
    }
}
