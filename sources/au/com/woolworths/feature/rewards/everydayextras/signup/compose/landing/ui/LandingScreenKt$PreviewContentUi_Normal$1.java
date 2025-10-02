package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.feature.product.list.legacy.a0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class LandingScreenKt$PreviewContentUi_Normal$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        composer.o(1849434622);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(23);
            composer.A(objG);
        }
        Function1 function1 = (Function1) objG;
        Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new au.com.woolworths.android.onesite.deeplink.h(20);
            composer.A(objE);
        }
        Function0 function0 = (Function0) objE;
        Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE2 == composer$Companion$Empty$1) {
            objE2 = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(24);
            composer.A(objE2);
        }
        Function1 function12 = (Function1) objE2;
        Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE3 == composer$Companion$Empty$1) {
            objE3 = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(25);
            composer.A(objE3);
        }
        Function1 function13 = (Function1) objE3;
        Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE4 == composer$Companion$Empty$1) {
            objE4 = new a0(13);
            composer.A(objE4);
        }
        Function2 function2 = (Function2) objE4;
        Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE5 == composer$Companion$Empty$1) {
            objE5 = new au.com.woolworths.feature.rewards.account.closeaccount.ui.d(26);
            composer.A(objE5);
        }
        composer.l();
        LandingScreenKt.b(false, null, null, function1, function0, function12, function13, function2, (Function1) objE5, composer, 115043718);
        throw null;
    }
}
