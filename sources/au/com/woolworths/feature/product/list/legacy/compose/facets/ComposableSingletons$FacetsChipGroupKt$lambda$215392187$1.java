package au.com.woolworths.feature.product.list.legacy.compose.facets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.feature.product.list.legacy.y;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.product.list.legacy.compose.facets.ComposableSingletons$FacetsChipGroupKt$lambda$-215392187$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$FacetsChipGroupKt$lambda$215392187$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ArrayList arrayListB = FacetsChipGroupKt.b();
            composer.o(1849434622);
            Object objG = composer.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new y(23);
                composer.A(objG);
            }
            Function1 function1 = (Function1) objG;
            Object objE = a.e(composer, 1849434622);
            if (objE == composer$Companion$Empty$1) {
                objE = new h(20);
                composer.A(objE);
            }
            composer.l();
            FacetsChipGroupKt.a(3462, composer, arrayListB, (Function0) objE, function1, false);
        }
        return Unit.f24250a;
    }
}
