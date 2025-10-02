package au.com.woolworths.product.composeui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.product.composeui.ComposableSingletons$ProductVarietiesLinkKt$lambda$-132032866$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductVarietiesLinkKt$lambda$132032866$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductVarietiesLinkKt$lambda$132032866$1 d = new ComposableSingletons$ProductVarietiesLinkKt$lambda$132032866$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCard productCardB = ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            ProductVarietiesLinkKt.a(48, 12, composer, null, productCardB, (Function0) objG, false);
        }
        return Unit.f24250a;
    }
}
