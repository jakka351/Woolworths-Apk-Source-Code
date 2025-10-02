package au.com.woolworths.shop.checkout.ui.compose;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.design.core.ui.component.stable.SurfaceKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shop.checkout.ui.compose.ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$-267249065$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$FulfilmentFeesBottomSheetKt$lambda$267249065$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SurfaceKt.b(SizeKt.c, null, 0L, 0L, null, null, ComposableSingletons$FulfilmentFeesBottomSheetKt.b, composer, 62);
        }
        return Unit.f24250a;
    }
}
