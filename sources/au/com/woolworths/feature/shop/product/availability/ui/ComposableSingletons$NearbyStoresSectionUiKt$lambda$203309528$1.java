package au.com.woolworths.feature.shop.product.availability.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: au.com.woolworths.feature.shop.product.availability.ui.ComposableSingletons$NearbyStoresSectionUiKt$lambda$-203309528$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class ComposableSingletons$NearbyStoresSectionUiKt$lambda$203309528$1 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$NearbyStoresSectionUiKt$lambda$203309528$1 d = new ComposableSingletons$NearbyStoresSectionUiKt$lambda$203309528$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LazyItemScope item = (LazyItemScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(item, "$this$item");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            float f = 16;
            TextKt.a(StringResources_androidKt.c(composer, R.string.nearby_stores), CoreTheme.f(composer).e.b.b, PaddingKt.i(BackgroundKt.b(SizeKt.e(Modifier.Companion.d, 1.0f), CoreTheme.d(composer).f4872a.b, RectangleShapeKt.f1779a), f, 11, f, 9), 0L, null, 0, 0, false, 0, null, composer, 0, 1016);
        }
        return Unit.f24250a;
    }
}
