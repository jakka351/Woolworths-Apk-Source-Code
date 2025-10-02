package au.com.woolworths.shop.aem.components.ui.product;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductSectionHeaderKt$lambda$1015104908$1 implements Function2<Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            ProductSectionHeaderKt.a(BitmapDescriptorFactory.HUE_RED, 6, 4, composer, BackgroundKt.b(SizeKt.x(SizeKt.e(Modifier.Companion.d, 1.0f), Alignment.Companion.k, false), WxTheme.a(composer).a(), RectangleShapeKt.f1779a), "16 products");
        }
        return Unit.f24250a;
    }
}
