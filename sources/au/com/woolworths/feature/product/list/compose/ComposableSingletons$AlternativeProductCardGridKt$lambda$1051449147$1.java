package au.com.woolworths.feature.product.list.compose;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.feature.product.list.c0;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardConfig;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.product.list.compose.ComposableSingletons$AlternativeProductCardGridKt$lambda$-1051449147$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$AlternativeProductCardGridKt$lambda$1051449147$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AlternativeProductCardGridKt$lambda$1051449147$1 d = new ComposableSingletons$AlternativeProductCardGridKt$lambda$1051449147$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductCard productCardB = ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3);
            ProductCardConfig productCardConfig = new ProductCardConfig(false, false, false, false, false, false, null, 124, null);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new androidx.navigation.compose.h(24, (byte) 0);
                composer.A(objG);
            }
            Function2 function2 = (Function2) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new c0(5);
                composer.A(objE);
            }
            composer.l();
            AlternativeProductCardGridKt.a(productCardB, productCardConfig, function2, (Function1) objE, null, false, composer, ProductCard.$stable | 3456 | (ProductCardConfig.$stable << 3), 48);
        }
        return Unit.f24250a;
    }
}
