package au.com.woolworths.feature.rewards.card.overlay;

import android.content.Intent;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsCardOverlayActivity$onCreate$1$1$3$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        RewardsCardOverlayActivity rewardsCardOverlayActivity = (RewardsCardOverlayActivity) this.receiver;
        int i = RewardsCardOverlayActivity.z;
        rewardsCardOverlayActivity.getClass();
        rewardsCardOverlayActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://pay.google.com/gp/v/save/".concat(p0))));
        return Unit.f24250a;
    }
}
