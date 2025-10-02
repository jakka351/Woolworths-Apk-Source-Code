package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.ComposableSingletons$YourGroceriesTotalPriceKt$lambda$-538118595$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$YourGroceriesTotalPriceKt$lambda$538118595$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$YourGroceriesTotalPriceKt$lambda$538118595$1 d = new ComposableSingletons$YourGroceriesTotalPriceKt$lambda$538118595$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                composer.A(objG);
            }
            composer.l();
            YourGroceriesTotalPriceKt.a(3126, 4, composer, null, "Total (Incl. GST)", "$999.00", (Function0) objG);
        }
        return Unit.f24250a;
    }
}
