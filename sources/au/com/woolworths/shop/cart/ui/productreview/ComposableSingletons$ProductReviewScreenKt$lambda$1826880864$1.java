package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposableSingletons$ProductReviewScreenKt$lambda$1826880864$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$ProductReviewScreenKt$lambda$1826880864$1 d = new ComposableSingletons$ProductReviewScreenKt$lambda$1826880864$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope LoadingScreen = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(LoadingScreen, "$this$LoadingScreen");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            TextKt.b(StringResources_androidKt.c(composer, R.string.product_review_updating_cart), PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 48, 0, 131068);
        }
        return Unit.f24250a;
    }
}
