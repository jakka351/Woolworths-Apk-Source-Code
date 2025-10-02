package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.cart.ui.productreview.h;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.checkout.ui.components.compose.ComposableSingletons$PackagingMethodSelectionKt$lambda$-1161839725$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$PackagingMethodSelectionKt$lambda$1161839725$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$PackagingMethodSelectionKt$lambda$1161839725$1 d = new ComposableSingletons$PackagingMethodSelectionKt$lambda$1161839725$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List listR = CollectionsKt.R(new PackagingMethodOption(1000, false, "Reusable Bags", "$1.50", "/ per order", "imageUrl"), new PackagingMethodOption(1001, true, "Reusable Bags", "$1.00", null, "imageUrl"), new PackagingMethodOption(1002, false, "Reusable Bags", "$1.00", null, "imageUrl"));
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(13);
                composer.A(objG);
            }
            composer.l();
            PackagingMethodSelectionKt.a(438, composer, "How would you like your groceries packaged?", listR, (Function1) objG);
        }
        return Unit.f24250a;
    }
}
