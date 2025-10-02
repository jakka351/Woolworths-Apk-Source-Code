package au.com.woolworths.foundation.shop.video.advertising.ui;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.foundation.shop.video.advertising.ui.ComposableSingletons$VideoAdBottomSheetUiKt$lambda$-696230918$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$VideoAdBottomSheetUiKt$lambda$696230918$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            VideoAdBottomSheetUiKt.a(composer, 0);
        }
        return Unit.f24250a;
    }
}
