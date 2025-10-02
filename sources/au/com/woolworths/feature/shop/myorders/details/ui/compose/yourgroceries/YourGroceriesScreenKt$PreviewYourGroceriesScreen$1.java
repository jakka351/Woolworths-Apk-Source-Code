package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class YourGroceriesScreenKt$PreviewYourGroceriesScreen$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        Flow flowV = FlowKt.v();
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
            objE = new au.com.woolworths.android.onesite.deeplink.h(20);
            composer.A(objE);
        }
        Function0 function02 = (Function0) objE;
        Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE2 == composer$Companion$Empty$1) {
            objE2 = new l(7);
            composer.A(objE2);
        }
        Function1 function1 = (Function1) objE2;
        Object objE3 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE3 == composer$Companion$Empty$1) {
            objE3 = new l(8);
            composer.A(objE3);
        }
        Function1 function12 = (Function1) objE3;
        Object objE4 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE4 == composer$Companion$Empty$1) {
            objE4 = new l(9);
            composer.A(objE4);
        }
        Function1 function13 = (Function1) objE4;
        Object objE5 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE5 == composer$Companion$Empty$1) {
            objE5 = new l(10);
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
        Function0 function04 = (Function0) objE7;
        Object objE8 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE8 == composer$Companion$Empty$1) {
            objE8 = new au.com.woolworths.feature.shop.modeselector.ui.b(15);
            composer.A(objE8);
        }
        Function2 function2 = (Function2) objE8;
        Object objE9 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
        if (objE9 == composer$Companion$Empty$1) {
            objE9 = new au.com.woolworths.android.onesite.deeplink.h(20);
            composer.A(objE9);
        }
        composer.l();
        YourGroceriesScreenKt.a(null, flowV, function0, function02, function1, function12, function13, function14, function03, function04, function2, (Function0) objE9, composer, 920350080, 54);
        throw null;
    }
}
