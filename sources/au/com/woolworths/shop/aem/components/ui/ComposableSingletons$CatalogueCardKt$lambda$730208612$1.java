package au.com.woolworths.shop.aem.components.ui;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$CatalogueCardKt$lambda$730208612$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$CatalogueCardKt$lambda$730208612$1 d = new ComposableSingletons$CatalogueCardKt$lambda$730208612$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            BoxKt.a(AspectRatioKt.a(Modifier.Companion.d, 1.1f), composer, 6);
        }
        return Unit.f24250a;
    }
}
