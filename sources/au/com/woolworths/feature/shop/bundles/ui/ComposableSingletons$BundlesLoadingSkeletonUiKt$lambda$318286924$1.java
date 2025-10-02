package au.com.woolworths.feature.shop.bundles.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.shared.ui.compose.rewards.ShimmerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$318286924$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$318286924$1 d = new ComposableSingletons$BundlesLoadingSkeletonUiKt$lambda$318286924$1();

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ColumnScope Card = (ColumnScope) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        Intrinsics.h(Card, "$this$Card");
        if ((iIntValue & 17) == 16 && composer.c()) {
            composer.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.g, Alignment.Companion.n, composer, 54);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composer, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            if (composer.w() == null) {
                ComposablesKt.b();
                throw null;
            }
            composer.i();
            if (composer.getO()) {
                composer.K(function0);
            } else {
                composer.e();
            }
            Updater.b(composer, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function2);
            }
            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
            float f = 24;
            float f2 = 42;
            float f3 = 8;
            Modifier modifierA = ClipKt.a(SizeKt.q(PaddingKt.j(PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 100), RoundedCornerShapeKt.b(f3));
            long j = CoreTheme.b(composer).e.f4848a.d;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            BoxKt.a(ShimmerKt.b(BackgroundKt.b(modifierA, j, rectangleShapeKt$RectangleShape$1)), composer, 0);
            float f4 = 134;
            float f5 = 10;
            BoxKt.a(ShimmerKt.b(BackgroundKt.b(ClipKt.a(SizeKt.r(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f4, f5), RoundedCornerShapeKt.b(f3)), CoreTheme.b(composer).e.f4848a.d, rectangleShapeKt$RectangleShape$1)), composer, 0);
            float f6 = 12;
            BoxKt.a(ShimmerKt.b(BackgroundKt.b(ClipKt.a(SizeKt.r(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), f4, f5), RoundedCornerShapeKt.b(f3)), CoreTheme.b(composer).e.f4848a.d, rectangleShapeKt$RectangleShape$1)), composer, 0);
            BoxKt.a(ShimmerKt.b(BackgroundKt.b(ClipKt.a(SizeKt.r(PaddingKt.h(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f6, BitmapDescriptorFactory.HUE_RED, 32, 5), f2, BitmapDescriptorFactory.HUE_RED, 2), 60, f), RoundedCornerShapeKt.b(f3)), CoreTheme.b(composer).e.f4848a.d, rectangleShapeKt$RectangleShape$1)), composer, 0);
            composer.f();
        }
        return Unit.f24250a;
    }
}
