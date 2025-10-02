package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shared.ui.compose.rewards.ShimmerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$538851156$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    public static final ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$538851156$1 d = new ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$538851156$1();

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyItemScope items = (LazyItemScope) obj;
        ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        Intrinsics.h(items, "$this$items");
        if ((iIntValue & 129) == 128 && composer.c()) {
            composer.j();
        } else {
            BundlesLoadingSkeletonUiKt.b(composer, 0);
            BundlesLoadingSkeletonUiKt.c(composer, 0);
            BoxKt.a(ShimmerKt.b(BackgroundKt.b(ClipKt.a(SizeKt.r(PaddingKt.j(PaddingKt.h(SizeKt.e(Modifier.Companion.d, 1.0f), 16, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, 24, BitmapDescriptorFactory.HUE_RED, 32, 5), 344, 40), RoundedCornerShapeKt.b(8)), CoreTheme.b(composer).e.f4848a.d, RectangleShapeKt.f1779a)), composer, 0);
        }
        return Unit.f24250a;
    }
}
