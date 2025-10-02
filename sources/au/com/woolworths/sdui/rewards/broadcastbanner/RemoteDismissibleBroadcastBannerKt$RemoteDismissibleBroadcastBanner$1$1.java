package au.com.woolworths.sdui.rewards.broadcastbanner;

import au.com.woolworths.sdui.rewards.model.ActionData;
import au.com.woolworths.sdui.rewards.model.broadcastbanner.RemoteDismissibleBroadcastBannerListener;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class RemoteDismissibleBroadcastBannerKt$RemoteDismissibleBroadcastBanner$1$1 extends FunctionReferenceImpl implements Function1<ActionData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ActionData p0 = (ActionData) obj;
        Intrinsics.h(p0, "p0");
        ((RemoteDismissibleBroadcastBannerListener) this.receiver).a();
        return Unit.f24250a;
    }
}
