package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.cart.ui.productreview.h;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.checkout.ui.components.compose.ComposableSingletons$CollectionMethodKt$lambda$-952540379$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CollectionMethodKt$lambda$952540379$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CollectionMethodKt$lambda$952540379$1 d = new ComposableSingletons$CollectionMethodKt$lambda$952540379$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List listR = CollectionsKt.R(new CollectionMethodOption("Option 1", CollectionMethodOptionModeId.e, true, null), new CollectionMethodOption("Option 2", CollectionMethodOptionModeId.f, false, null));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(6);
                composer.A(objG);
            }
            composer.l();
            CollectionMethodKt.a(390, composer, "Select a collection method", listR, (Function1) objG);
        }
        return Unit.f24250a;
    }
}
