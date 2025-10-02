package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.compose.material.ScaffoldKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.ui.ComposableSingletons$InstoreMapScreenKt$lambda$-5198771$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$InstoreMapScreenKt$lambda$5198771$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            InstoreMapScreenKt.c(InstoreMapScreenKt.f7385a, new InstoreMapContract.ViewState.Content(null, null, null, null, null, false, new OriientError.MissingSensors(), null, null, 1048447), ScaffoldKt.d(null, composer, 3), null, composer, 6, 24);
        }
        return Unit.f24250a;
    }
}
