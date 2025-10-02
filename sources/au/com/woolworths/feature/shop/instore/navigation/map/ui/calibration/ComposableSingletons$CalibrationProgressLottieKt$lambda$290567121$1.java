package au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration;

import androidx.compose.foundation.layout.SizeKt;
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
/* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.calibration.ComposableSingletons$CalibrationProgressLottieKt$lambda$-290567121$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$CalibrationProgressLottieKt$lambda$290567121$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 200);
            composer.o(1849434622);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new h(20);
                composer.A(objG);
            }
            composer.l();
            CalibrationProgressLottieKt.a(438, composer, modifierQ, (Function0) objG);
        }
        return Unit.f24250a;
    }
}
