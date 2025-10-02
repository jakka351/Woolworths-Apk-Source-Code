package au.com.woolworths.design.core.ui.component.experimental.ratingbar;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.design.core.ui.component.experimental.ratingbar.ComposableSingletons$StarRatingBarKt$lambda$-1411764453$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$StarRatingBarKt$lambda$1411764453$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$StarRatingBarKt$lambda$1411764453$1 d = new ComposableSingletons$StarRatingBarKt$lambda$1411764453$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            StarRatingBarKt.b(1.25d, null, PaddingKt.f(Modifier.Companion.d, 8), 0L, composer, 3510);
        }
        return Unit.f24250a;
    }
}
