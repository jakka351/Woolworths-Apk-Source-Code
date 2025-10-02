package au.com.woolworths.shop.checkout.ui.shopperNote;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.shop.checkout.ui.details.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ShopperNoteScreenKt$lambda$1211539841$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ShopperNoteScreenKt$lambda$1211539841$1 d = new ComposableSingletons$ShopperNoteScreenKt$lambda$1211539841$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Flow flowV = FlowKt.v();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new h(20);
                composer.A(objG);
            }
            Function0 function0 = (Function0) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new d(5);
                composer.A(objE);
            }
            composer.l();
            ShopperNoteScreenKt.a(flowV, "Shopper Note", "Save", "This is a preview of the shopper note.", 200, function0, (Function1) objE, composer, 1797552);
        }
        return Unit.f24250a;
    }
}
