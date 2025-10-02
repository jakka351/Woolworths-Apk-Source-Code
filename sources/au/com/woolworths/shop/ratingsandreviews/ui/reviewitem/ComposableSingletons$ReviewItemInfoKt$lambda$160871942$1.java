package au.com.woolworths.shop.ratingsandreviews.ui.reviewitem;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ReviewItemInfoKt$lambda$160871942$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ReviewItemInfoKt$lambda$160871942$1 d = new ComposableSingletons$ReviewItemInfoKt$lambda$160871942$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ReviewItemInfoKt.a("Candice", "1 week ago", PaddingKt.g(Modifier.Companion.d, 16, 4), composer, 438);
        }
        return Unit.f24250a;
    }
}
