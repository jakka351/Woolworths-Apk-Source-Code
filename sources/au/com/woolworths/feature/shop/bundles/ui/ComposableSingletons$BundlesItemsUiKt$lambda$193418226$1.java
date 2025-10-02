package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.preview.ThemeForPreviewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$BundlesItemsUiKt$lambda$193418226$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ThemeForPreviewKt.b(null, ComposableSingletons$BundlesItemsUiKt.b, composer, 48);
        }
        return Unit.f24250a;
    }
}
