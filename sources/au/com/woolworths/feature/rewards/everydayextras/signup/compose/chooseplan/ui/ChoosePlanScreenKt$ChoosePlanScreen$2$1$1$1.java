package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan.EverydayExtrasChoosePlanContentItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ChoosePlanScreenKt$ChoosePlanScreen$2$1$1$1 extends FunctionReferenceImpl implements Function1<EverydayExtrasChoosePlanContentItem.SubscribePlan, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EverydayExtrasChoosePlanContentItem.SubscribePlan p0 = (EverydayExtrasChoosePlanContentItem.SubscribePlan) obj;
        Intrinsics.h(p0, "p0");
        ((EverydayExtraChoosePlanViewModel) this.receiver).v6(p0);
        return Unit.f24250a;
    }
}
