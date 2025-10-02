package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$AddressEditorKt$lambda$1849030246$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AddressEditorKt$lambda$1849030246$1 d = new ComposableSingletons$AddressEditorKt$lambda$1849030246$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierF = PaddingKt.f(Modifier.Companion.d, 16);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            AddressEditorKt.a("Deliver to:", "123, Street, Suburb, State, 9999", "EDIT", (Function0) objG, modifierF, composer, 28086);
        }
        return Unit.f24250a;
    }
}
