package au.com.woolworths.feature.shop.wpay.ui.common.component;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.wpay.ui.common.component.ComposableSingletons$LoadingScreenKt$lambda$-1312230982$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$LoadingScreenKt$lambda$1312230982$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            LoadingScreenKt.a(null, 0L, composer, 0, 3);
        }
        return Unit.f24250a;
    }
}
