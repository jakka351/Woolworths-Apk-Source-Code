package au.com.woolworths.shared.ui.compose.shop.chatentrycard;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.shared.ui.compose.shop.chatentrycard.ComposableSingletons$AskOliveIconLottieKt$lambda$-638487201$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$AskOliveIconLottieKt$lambda$638487201$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            AskOliveIconLottieKt.a(composer, 0);
        }
        return Unit.f24250a;
    }
}
