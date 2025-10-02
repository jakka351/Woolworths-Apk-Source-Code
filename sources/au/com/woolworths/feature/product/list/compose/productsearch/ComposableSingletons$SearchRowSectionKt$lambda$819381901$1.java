package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$SearchRowSectionKt$lambda$819381901$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$SearchRowSectionKt$lambda$819381901$1 d = new ComposableSingletons$SearchRowSectionKt$lambda$819381901$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            SearchTilesSectionKt.d(SizeKt.q(Modifier.Companion.d, 40), composer, 6);
        }
        return Unit.f24250a;
    }
}
