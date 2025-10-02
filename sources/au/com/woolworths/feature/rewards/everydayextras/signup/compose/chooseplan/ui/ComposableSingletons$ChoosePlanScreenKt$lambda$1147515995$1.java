package au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanContract;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import au.com.woolworths.foundation.rewards.servicemessages.ui.ServiceMessageProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ComposableSingletons$ChoosePlanScreenKt$lambda$-1147515995$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ChoosePlanScreenKt$lambda$1147515995$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ChoosePlanScreenKt$lambda$1147515995$1 d = new ComposableSingletons$ChoosePlanScreenKt$lambda$1147515995$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            EverydayExtraChoosePlanContract.ViewState.ServiceMessage serviceMessage = new EverydayExtraChoosePlanContract.ViewState.ServiceMessage(ServiceMessageProvider.f8656a);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(10);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(11);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new h(20);
                composer.A(objE2);
            }
            Function0 function0 = (Function0) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(12);
                composer.A(objE3);
            }
            Function1 function13 = (Function1) objE3;
            composer.l();
            RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
            ChoosePlanScreenKt.b(serviceMessage, function1, function12, function0, function13, composer, 28088);
        }
        return Unit.f24250a;
    }
}
