package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.cart.ui.productreview.h;
import au.com.woolworths.shop.checkout.domain.model.InputTextLimit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$PreferenceTextUiKt$lambda$1986040162$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PreferenceTextUiKt$lambda$1986040162$1 d = new ComposableSingletons$PreferenceTextUiKt$lambda$1986040162$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InputTextLimit inputTextLimit = new InputTextLimit(10, 3);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(16);
                composer.A(objG);
            }
            composer.l();
            PreferenceTextUiKt.c("Driver Instructions (optional)", null, true, inputTextLimit, "e.g. Please ring the door bell only once", "hello 123", "1", "Save", (Function1) objG, composer, 115043766);
        }
        return Unit.f24250a;
    }
}
