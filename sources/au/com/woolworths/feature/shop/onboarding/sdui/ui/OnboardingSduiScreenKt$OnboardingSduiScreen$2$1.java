package au.com.woolworths.feature.shop.onboarding.sdui.ui;

import au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiViewModel;
import au.com.woolworths.feature.shop.onboarding.sdui.data.ButtonActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class OnboardingSduiScreenKt$OnboardingSduiScreen$2$1 extends FunctionReferenceImpl implements Function1<ButtonActionData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((OnboardingSduiViewModel) this.receiver).p6((ButtonActionData) obj);
        return Unit.f24250a;
    }
}
