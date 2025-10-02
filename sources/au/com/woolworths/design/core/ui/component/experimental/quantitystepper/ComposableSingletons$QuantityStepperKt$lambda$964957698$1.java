package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperSpec;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$QuantityStepperKt$lambda$964957698$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            QuantityStepperSpec.Variant[] variantArr = QuantityStepperSpec.Variant.d;
            QuantityStepperSpec.Size size = QuantityStepperSpec.Size.e;
            Side side = Side.d;
            ImageVector imageVector = CoreTheme.e(composer).f4879a.q;
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            QuantityStepperKt.b(side, imageVector, null, true, true, (Function0) objG, null, null, composer, 14377398, 768);
        }
        return Unit.f24250a;
    }
}
