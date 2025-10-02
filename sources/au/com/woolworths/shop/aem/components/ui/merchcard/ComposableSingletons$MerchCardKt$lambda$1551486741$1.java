package au.com.woolworths.shop.aem.components.ui.merchcard;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.button.ButtonData;
import au.com.woolworths.shop.aem.components.model.button.ButtonStyle;
import au.com.woolworths.shop.aem.components.model.merchcard.MerchCardData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.shop.aem.components.ui.merchcard.ComposableSingletons$MerchCardKt$lambda$-1551486741$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$MerchCardKt$lambda$1551486741$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            MerchCardData merchCardData = new MerchCardData(new ImageWithAltText("", ""), new ImageWithAltText("", ""), "Merch Card Title", "Merch Card Description has a long text", new ButtonData("", "Shop Now", ButtonStyle.e, true, null, null, null, null), null, null, null);
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new au.com.woolworths.shop.aem.components.ui.chatentrycard.b(29);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = au.com.woolworths.android.onesite.a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new a(0);
                composer.A(objE);
            }
            composer.l();
            MerchCardKt.b(merchCardData, function1, (Function1) objE, SizeKt.z(Modifier.Companion.d, null, 3), composer, 3504, 0);
        }
        return Unit.f24250a;
    }
}
