package au.com.woolworths.feature.shop.homepage.presentation.order;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class OrderCardUIKt$OrderCardItemPreview$1 implements Function2<Composer, Integer, Unit> {
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
            objG = new h(20);
            composer.A(objG);
        }
        Function0 function0 = (Function0) objG;
        Object objE = a.e(composer, 1849434622);
        if (objE == composer$Companion$Empty$1) {
            objE = new h(20);
            composer.A(objE);
        }
        Function0 function02 = (Function0) objE;
        Object objE2 = a.e(composer, 1849434622);
        if (objE2 == composer$Companion$Empty$1) {
            objE2 = new h(20);
            composer.A(objE2);
        }
        composer.l();
        OrderCardUIKt.c(null, function0, function02, (Function0) objE2, null, null, composer, 200112, 16);
        throw null;
    }
}
