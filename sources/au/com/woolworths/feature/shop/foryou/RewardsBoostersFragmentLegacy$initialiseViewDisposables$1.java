package au.com.woolworths.feature.shop.foryou;

import android.content.Context;
import android.view.View;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersContractLegacy;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy;
import au.com.woolworths.rewards.base.ContextExtKt;
import au.com.woolworths.rewards.tooltip.Tooltip;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsBoostersFragmentLegacy$initialiseViewDisposables$1 extends FunctionReferenceImpl implements Function1<RewardsBoostersContractLegacy.Actions, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context;
        RewardsBoostersContractLegacy.Actions p0 = (RewardsBoostersContractLegacy.Actions) obj;
        Intrinsics.h(p0, "p0");
        RewardsBoostersFragmentLegacy rewardsBoostersFragmentLegacy = (RewardsBoostersFragmentLegacy) this.receiver;
        RewardsBoostersFragmentLegacy.Companion companion = RewardsBoostersFragmentLegacy.n;
        rewardsBoostersFragmentLegacy.getClass();
        if (!(p0 instanceof RewardsBoostersContractLegacy.Actions.ShowTooltip)) {
            throw new NoWhenBranchMatchedException();
        }
        Tooltip.BalanceIndicator balanceIndicator = ((RewardsBoostersContractLegacy.Actions.ShowTooltip) p0).f7133a;
        View viewFindViewById = rewardsBoostersFragmentLegacy.I1().h.findViewById(balanceIndicator.b);
        if (viewFindViewById != null && (context = rewardsBoostersFragmentLegacy.getContext()) != null) {
            ContextExtKt.a(context, viewFindViewById, balanceIndicator.f9967a, balanceIndicator.d, null, 56);
        }
        return Unit.f24250a;
    }
}
