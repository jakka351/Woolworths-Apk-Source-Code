package au.com.woolworths.sdui.legacy.title;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.sdui.legacy.title.ComposableSingletons$CoreRowListTitleUIKt$lambda$-4431254$1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class ComposableSingletons$CoreRowListTitleUIKt$lambda$4431254$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            CoreRowListTitleUIKt.a(6, composer, null, "Featured Brands");
        }
        return Unit.f24250a;
    }
}
