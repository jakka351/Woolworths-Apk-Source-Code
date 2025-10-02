package au.com.woolworths.feature.shop.inbox.ui.component;

import androidx.compose.material.icons.filled.DeleteKt;
import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.component.icon.IconKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.inbox.ui.component.ComposableSingletons$SwipeToDeleteKt$lambda$-1292332674$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$SwipeToDeleteKt$lambda$1292332674$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SwipeToDeleteKt$lambda$1292332674$1 d = new ComposableSingletons$SwipeToDeleteKt$lambda$1292332674$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            IconKt.b(DeleteKt.a(), null, null, 0L, composer, 48, 12);
        }
        return Unit.f24250a;
    }
}
