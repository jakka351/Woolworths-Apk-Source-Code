package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.compose.runtime.Composer;
import au.com.woolworths.design.wx.preview.ThemeForPreviewKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: au.com.woolworths.feature.shop.product.availability.ui.ComposableSingletons$ProductPanelUiKt$lambda$-484778953$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$ProductPanelUiKt$lambda$484778953$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ThemeForPreviewKt.b(null, ComposableSingletons$ProductPanelUiKt.f7998a, composer, 48);
        }
        return Unit.f24250a;
    }
}
