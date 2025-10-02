package au.com.woolworths.foundation.ui.image.gallery;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.graphics.painter.ColorPainter;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$GalleryImagesCarouselKt$lambda$777657030$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            List listQ = CollectionsKt.Q(new GalleryImageForPreview("123"));
            ColorPainter colorPainter = new ColorPainter(CoreTheme.b(composer).f4782a.f4783a.b.c);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.feature.shop.bundles.ui.a(29);
                composer.A(objG);
            }
            composer.l();
            PagerState pagerStateC = PagerStateKt.c((Function0) objG, composer, 390, 2);
            composer.o(1849434622);
            Object objG2 = composer.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(7);
                composer.A(objG2);
            }
            Function2 function2 = (Function2) objG2;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new l(22);
                composer.A(objE);
            }
            Function1 function1 = (Function1) objE;
            Object objE2 = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE2 == composer$Companion$Empty$1) {
                objE2 = new au.com.woolworths.foundation.shop.olive.voice.ui.permission.a(5);
                composer.A(objE2);
            }
            composer.l();
            GalleryImagesCarouselKt.a(listQ, colorPainter, function2, pagerStateC, function1, null, (Function2) objE2, false, false, composer, 1597824, 416);
        }
        return Unit.f24250a;
    }
}
