package au.com.woolworths.product.deliveryaddressprompt;

import androidx.compose.runtime.Composer;
import au.com.woolworths.android.onesite.deeplink.h;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.product.deliveryaddressprompt.ComposableSingletons$AddDeliveryAddressBottomSheetScreenKt$lambda$-1839376443$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$AddDeliveryAddressBottomSheetScreenKt$lambda$1839376443$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            AddDeliveryAddressBottomSheetScreenKt.a((Function0) objG, composer, 6);
        }
        return Unit.f24250a;
    }
}
