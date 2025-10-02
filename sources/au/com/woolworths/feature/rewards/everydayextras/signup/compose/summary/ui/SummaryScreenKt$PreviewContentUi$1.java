package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayLoadingState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class SummaryScreenKt$PreviewContentUi$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            LazyListState lazyListStateA = LazyListStateKt.a(0, 0, 3, composer);
            WPayLoadingState wPayLoadingState = WPayLoadingState.f;
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(10);
                composer.A(objE);
            }
            Function1 function1 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE2);
            }
            Function0 function02 = (Function0) objE2;
            Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE3 == composer$Companion$Empty$1) {
                objE3 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui.b(11);
                composer.A(objE3);
            }
            Function1 function12 = (Function1) objE3;
            Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE4 == composer$Companion$Empty$1) {
                objE4 = new au.com.woolworths.android.onesite.repository.b(10);
                composer.A(objE4);
            }
            Function1 function13 = (Function1) objE4;
            Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE5 == composer$Companion$Empty$1) {
                objE5 = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objE5);
            }
            composer.l();
            SummaryScreenKt.c(lazyListStateA, null, false, wPayLoadingState, null, null, false, false, false, null, function0, function1, function02, function12, function13, true, (Function0) objE5, composer, 920350080, 1797558);
        }
        return Unit.f24250a;
    }
}
