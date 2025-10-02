package au.com.woolworths.shop.aem.components.ui.merchcardfullimage;

import androidx.compose.runtime.Composer;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.merchcardfullimage.MerchCardFullImageData;
import au.com.woolworths.shop.aem.components.ui.merchcard.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
final class MerchCardFullImageKt$Preview_MerchCardFullImageUi$2 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            MerchCardFullImageData merchCardFullImageData = new MerchCardFullImageData(new ImageWithAltText("", ""), null, new ButtonData(null, "Shop now", null, true, null, null, null, null), "T&Cs apply.", "Winner, Best Cheese – Block category");
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new a(3);
                composer.A(objG);
            }
            composer.l();
            MerchCardFullImageKt.a(merchCardFullImageData, (Function1) objG, null, null, composer, 48, 8);
        }
        return Unit.f24250a;
    }
}
