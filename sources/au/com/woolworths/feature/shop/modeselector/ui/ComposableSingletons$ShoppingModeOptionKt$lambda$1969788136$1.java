package au.com.woolworths.feature.shop.modeselector.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.feature.shop.modeselector.model.ShoppingModeSection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$ShoppingModeOptionKt$lambda$1969788136$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ShoppingModeOptionKt$lambda$1969788136$1 d = new ComposableSingletons$ShoppingModeOptionKt$lambda$1969788136$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ShoppingModeSection.ShoppingModeSelectorOptionsSection shoppingModeSelectorOptionsSection = ShoppingModeOptionKt.f7549a;
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.shop.marketplace.ui.facet.a(25);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new b(4);
                composer.A(objE);
            }
            composer.l();
            ShoppingModeOptionKt.a(shoppingModeSelectorOptionsSection, function1, (Function2) objE, null, composer, 432, 8);
        }
        return Unit.f24250a;
    }
}
