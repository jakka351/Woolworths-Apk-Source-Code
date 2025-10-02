package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
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
/* renamed from: au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui.ComposableSingletons$SummaryScreenKt$lambda$-40723071$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SummaryScreenKt$lambda$40723071$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SummaryScreenKt$lambda$40723071$1 d = new ComposableSingletons$SummaryScreenKt$lambda$40723071$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            EverydayExtraSummaryContract.ViewState.ServiceMessage serviceMessage = new EverydayExtraSummaryContract.ViewState.ServiceMessage(ServiceMessageProvider.f8656a);
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composer);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(5);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(6);
                composer.A(objE);
            }
            Function1 function12 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(7);
                composer.A(objE2);
            }
            Function1 function13 = (Function1) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE3);
            }
            Function0 function0 = (Function0) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE4);
            }
            Function0 function02 = (Function0) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objE5);
            }
            Function1 function14 = (Function1) objE5;
            Object objE6 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE6 == composer$Companion$Empty$1) {
                objE6 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE6);
            }
            Function0 function03 = (Function0) objE6;
            Object objE7 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE7 == composer$Companion$Empty$1) {
                objE7 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE7);
            }
            composer.l();
            RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
            SummaryScreenKt.b(serviceMessage, lazyListStateA, false, function1, function12, function13, function0, function02, function14, function03, (Function0) objE7, true, composer, 920350088, 54, 0);
        }
        return Unit.f24250a;
    }
}
