package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class CartProductKt$PreviewCartProduct$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
            return Unit.f24250a;
        }
        Double dValueOf = Double.valueOf(1.0d);
        composer.o(1849434622);
        Object objG = composer.G();
        if (objG == Composer.Companion.f1624a) {
            objG = new au.com.woolworths.shop.aem.components.ui.merchcard.a(28);
            composer.A(objG);
        }
        composer.l();
        CartProductKt.a(true, null, dValueOf, null, (Function1) objG, composer, 24966, 8);
        throw null;
    }
}
