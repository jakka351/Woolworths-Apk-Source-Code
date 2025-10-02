package au.com.woolworths.feature.product.list.v2.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
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
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.foundation.ui.shimmers.ShimmerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
final class ProductListSkeletonUiKt$ProductListSkeletonUiDisplayGrid$1$1$1 implements Function4<LazyGridItemScope, Integer, Composer, Integer, Unit> {
    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        LazyGridItemScope items = (LazyGridItemScope) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        Intrinsics.h(items, "$this$items");
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= composer.r(iIntValue) ? 32 : 16;
        }
        if ((iIntValue2 & 145) == 144 && composer.c()) {
            composer.j();
        } else {
            IntrinsicSize intrinsicSize = IntrinsicSize.d;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierA = IntrinsicKt.a(companion, intrinsicSize);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composer, 0);
            int p = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
            Modifier modifierD = ComposedModifierKt.d(composer, modifierA);
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
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composer, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composer, persistentCompositionLocalMapD, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                androidx.camera.core.impl.b.z(p, composer, p, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composer, modifierD, function24);
            Modifier modifierA2 = RowScopeInstance.f974a.a(companion, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer, 48);
            int p2 = composer.getP();
            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer.d();
            Modifier modifierD2 = ComposedModifierKt.d(composer, modifierA2);
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
            Updater.b(composer, columnMeasurePolicyA, function2);
            Updater.b(composer, persistentCompositionLocalMapD2, function22);
            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p2))) {
                androidx.camera.core.impl.b.z(p2, composer, p2, function23);
            }
            Updater.b(composer, modifierD2, function24);
            composer.o(-481086192);
            if (iIntValue == 0 || iIntValue == 1) {
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer).e.b.e, composer, null);
            }
            composer.l();
            Modifier modifierQ = SizeKt.q(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 40, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 88);
            long j = CoreTheme.b(composer).e.f4848a.d;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            BoxKt.a(ShimmerKt.b(composer, BackgroundKt.b(modifierQ, j, rectangleShapeKt$RectangleShape$1)), composer, 0);
            float f = 16;
            float f2 = 24;
            float f3 = 10;
            float f4 = 2;
            BoxKt.a(ShimmerKt.b(composer, BackgroundKt.b(ClipKt.a(SizeKt.g(SizeKt.e(PaddingKt.j(companion, f2, f, f2, BitmapDescriptorFactory.HUE_RED, 8), 1.0f), f3), RoundedCornerShapeKt.b(f4)), CoreTheme.b(composer).e.f4848a.d, rectangleShapeKt$RectangleShape$1)), composer, 0);
            float f5 = 36;
            BoxKt.a(ShimmerKt.b(composer, BackgroundKt.b(ClipKt.a(SizeKt.g(SizeKt.e(PaddingKt.j(companion, f5, f, f5, BitmapDescriptorFactory.HUE_RED, 8), 1.0f), f3), RoundedCornerShapeKt.b(f4)), CoreTheme.b(composer).e.f4848a.d, rectangleShapeKt$RectangleShape$1)), composer, 0);
            BoxKt.a(ShimmerKt.b(composer, BackgroundKt.b(ClipKt.a(SizeKt.r(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, 12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 70, f5), RoundedCornerShapeKt.b(f4)), CoreTheme.b(composer).e.f4848a.d, rectangleShapeKt$RectangleShape$1)), composer, 0);
            float f6 = 8;
            BoxKt.a(ShimmerKt.b(composer, BackgroundKt.b(ClipKt.a(SizeKt.g(SizeKt.e(PaddingKt.i(companion, f6, 50, f6, 20), 1.0f), f5), RoundedCornerShapeKt.b(4)), CoreTheme.b(composer).e.f4848a.d, rectangleShapeKt$RectangleShape$1)), composer, 0);
            composer.o(-481011407);
            if (iIntValue != 6) {
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composer).e.b.e, composer, null);
            }
            composer.l();
            composer.f();
            composer.o(984897414);
            if ((iIntValue + 1) % 2 != 0) {
                DividerKt.b(BitmapDescriptorFactory.HUE_RED, 0, 4, CoreTheme.b(composer).e.b.e, composer, SizeKt.c(companion, 1.0f));
            }
            composer.l();
            composer.f();
        }
        return Unit.f24250a;
    }
}
