package au.com.woolworths.feature.shop.myorders.details.epoxy;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.modeselector.ui.b;
import au.com.woolworths.feature.shop.modeselector.ui.c;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesProductItemKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class YourGroceriesProductItem$buildModel$1 implements Function2<Composer, Integer, Unit> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem$buildModel$1$1, reason: invalid class name */
    final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            Composer composer = (Composer) obj;
            if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                composer.j();
                return Unit.f24250a;
            }
            Map map = EmptyMap.d;
            composer.o(5004770);
            boolean zI = composer.I(null);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                objG = new c(10);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            composer.l();
            composer.o(5004770);
            boolean zI2 = composer.I(null);
            Object objG2 = composer.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new c(11);
                composer.A(objG2);
            }
            Function1 function12 = (Function1) objG2;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new b(7);
                composer.A(objE);
            }
            composer.l();
            YourGroceriesProductItemKt.f(null, function1, function12, (Function2) objE, map, false, false, composer, 27648, 96);
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-576684820, new AnonymousClass1(), composer));
        }
        return Unit.f24250a;
    }
}
