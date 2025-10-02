package au.com.woolworths.shop.checkout.ui.components.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$FulfilmentWindowsEmptyUiKt$lambda$101468052$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FulfilmentWindowsEmptyUiKt$lambda$101468052$1 d = new ComposableSingletons$FulfilmentWindowsEmptyUiKt$lambda$101468052$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            FulfilmentWindowsEmptyUiKt.a("Select Delivery Date", "All windows are currently unavailable", composer, 54);
        }
        return Unit.f24250a;
    }
}
