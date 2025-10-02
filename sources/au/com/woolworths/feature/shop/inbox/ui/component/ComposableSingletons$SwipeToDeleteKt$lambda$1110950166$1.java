package au.com.woolworths.feature.shop.inbox.ui.component;

import androidx.compose.material.DismissValue;
import androidx.compose.material.SwipeToDismissKt;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.inbox.ui.component.ComposableSingletons$SwipeToDeleteKt$lambda$-1110950166$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SwipeToDeleteKt$lambda$1110950166$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            DismissValue dismissValue = DismissValue.d;
            SwipeToDeleteKt.a(SwipeToDismissKt.b(6, 2, composer), ComposableSingletons$SwipeToDeleteKt.f7299a, null, 0L, 0L, ComposableSingletons$SwipeToDeleteKt.b, composer, 196656, 28);
        }
        return Unit.f24250a;
    }
}
