package au.com.woolworths.feature.shop.shippingcalculator.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.shop.recipes.recipes.list.b;
import au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.shippingcalculator.ui.ComposableSingletons$ShippingCalculatorScreenKt$lambda$-1993045199$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ShippingCalculatorScreenKt$lambda$1993045199$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ShippingCalculatorContract.ViewState viewState = new ShippingCalculatorContract.ViewState();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new b(4);
                composer.A(objE);
            }
            Function1 function1 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.feature.shop.modeselector.ui.b(19);
                composer.A(objE2);
            }
            composer.l();
            ShippingCalculatorScreenKt.b(viewState, function0, function1, (Function2) objE2, null, composer, 3504);
        }
        return Unit.f24250a;
    }
}
