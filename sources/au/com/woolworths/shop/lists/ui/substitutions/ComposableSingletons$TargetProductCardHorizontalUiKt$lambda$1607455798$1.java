package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.runtime.Composer;
import au.com.woolworths.product.composeui.ProductCardPreviewDataKt;
import au.com.woolworths.product.models.ProductCard;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$TargetProductCardHorizontalUiKt$lambda$1607455798$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$TargetProductCardHorizontalUiKt$lambda$1607455798$1 d = new ComposableSingletons$TargetProductCardHorizontalUiKt$lambda$1607455798$1();

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
            composer.j();
        } else {
            TargetProductCardHorizontalUiKt.a(ProductCardPreviewDataKt.b(null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, -4609, 3), false, 96, null, false, false, false, null, BitmapDescriptorFactory.HUE_RED, null, composer, ProductCard.$stable | 3504, 2032);
        }
        return Unit.f24250a;
    }
}
