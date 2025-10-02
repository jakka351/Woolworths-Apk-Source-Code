package au.com.woolworths.shop.aem.components.ui.categorytile;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.design.core.ui.foundation.elevation.CoreElevation;
import au.com.woolworths.feature.shop.instore.cart.ui.d;
import au.com.woolworths.sdui.common.alert.a;
import au.com.woolworths.shop.aem.components.model.productcategorytile.ProductCategoryTileData;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.CachePolicy;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-aem-components_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCategoryTileKt {
    public static final void a(final ProductCategoryTileData data, Modifier modifier, CoreElevation coreElevation, float f, final Function1 onProductCategoryTileClick, Composer composer, int i, int i2) {
        Modifier modifier2;
        final CoreElevation coreElevation2;
        final float f2;
        float f3;
        CoreElevation coreElevation3;
        Modifier modifier3;
        Intrinsics.h(data, "data");
        Intrinsics.h(onProductCategoryTileClick, "onProductCategoryTileClick");
        ComposerImpl composerImplV = composer.v(-3504065);
        int i3 = (composerImplV.I(data) ? 4 : 2) | i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i3 | (((i2 & 4) == 0 && composerImplV.n(coreElevation)) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= 3072;
        } else if ((i & 3072) == 0) {
            i5 |= composerImplV.q(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= composerImplV.I(onProductCategoryTileClick) ? 16384 : 8192;
        }
        if ((i5 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            coreElevation3 = coreElevation;
            f3 = f;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                modifier2 = i4 != 0 ? Modifier.Companion.d : modifier;
                CoreElevation coreElevation4 = (i2 & 4) != 0 ? CoreTheme.c(composerImplV).b : coreElevation;
                if (i6 != 0) {
                    coreElevation2 = coreElevation4;
                    f2 = 116;
                    composerImplV.W();
                    final Modifier modifier4 = modifier2;
                    CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1573281179, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.categorytile.ProductCategoryTileKt$ProductCategoryTile$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer2 = (Composer) obj;
                            if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierG = SizeKt.g(SizeKt.u(modifier4, f2), 148);
                                RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
                                BorderStroke borderStrokeA = BorderStrokeKt.a(CoreTheme.b(composer2).e.b.e, 1);
                                composer2.o(-1633490746);
                                Function1 function1 = onProductCategoryTileClick;
                                boolean zN = composer2.n(function1);
                                final ProductCategoryTileData productCategoryTileData = data;
                                boolean zI = zN | composer2.I(productCategoryTileData);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new a(10, function1, productCategoryTileData);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                CardKt.b((Function0) objG, modifierG, false, roundedCornerShapeB, 0L, 0L, 0L, 0L, coreElevation2, borderStrokeA, null, ComposableLambdaKt.c(-1859391744, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.categorytile.ProductCategoryTileKt$ProductCategoryTile$1.2
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                        ColumnScope Card = (ColumnScope) obj3;
                                        Composer composer3 = (Composer) obj4;
                                        int iIntValue = ((Number) obj5).intValue();
                                        Intrinsics.h(Card, "$this$Card");
                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            Modifier.Companion companion = Modifier.Companion.d;
                                            float f4 = 8;
                                            Modifier modifierI = PaddingKt.i(SizeKt.e(companion, 1.0f), f4, 24, f4, 12);
                                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer3, 48);
                                            int p = composer3.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                            Modifier modifierD = ComposedModifierKt.d(composer3, modifierI);
                                            ComposeUiNode.e3.getClass();
                                            Function0 function0 = ComposeUiNode.Companion.b;
                                            if (composer3.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer3.i();
                                            if (composer3.getO()) {
                                                composer3.K(function0);
                                            } else {
                                                composer3.e();
                                            }
                                            Function2 function2 = ComposeUiNode.Companion.g;
                                            Updater.b(composer3, columnMeasurePolicyA, function2);
                                            Function2 function22 = ComposeUiNode.Companion.f;
                                            Updater.b(composer3, persistentCompositionLocalMapD, function22);
                                            Function2 function23 = ComposeUiNode.Companion.j;
                                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                                b.z(p, composer3, p, function23);
                                            }
                                            Function2 function24 = ComposeUiNode.Companion.d;
                                            Updater.b(composer3, modifierD, function24);
                                            ImageRequest.Builder builder = new ImageRequest.Builder((Context) composer3.x(AndroidCompositionLocals_androidKt.b));
                                            ProductCategoryTileData productCategoryTileData2 = productCategoryTileData;
                                            builder.c = productCategoryTileData2.d;
                                            ImageRequests_androidKt.d(builder, R.drawable.ic_wapple_circular_placeholder);
                                            ImageRequests_androidKt.a(builder, R.drawable.ic_wapple_circular_placeholder);
                                            builder.j = CachePolicy.f;
                                            SingletonAsyncImageKt.a(builder.a(), null, SizeKt.q(companion, 64), null, null, composer3, 432, 2040);
                                            Modifier modifierC = SizeKt.c(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f);
                                            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                                            int p2 = composer3.getP();
                                            PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                            Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierC);
                                            if (composer3.w() == null) {
                                                ComposablesKt.b();
                                                throw null;
                                            }
                                            composer3.i();
                                            if (composer3.getO()) {
                                                composer3.K(function0);
                                            } else {
                                                composer3.e();
                                            }
                                            Updater.b(composer3, measurePolicyD, function2);
                                            Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                                            if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                                b.z(p2, composer3, p2, function23);
                                            }
                                            Updater.b(composer3, modifierD2, function24);
                                            TextKt.a(productCategoryTileData2.e, CoreTheme.f(composer3).f5120a.b.b, null, CoreTheme.b(composer3).e.d.d, null, 3, 2, false, 2, null, composer3, 102236160, 660);
                                            composer3.f();
                                            composer3.f();
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), composer2, 0, 1268);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV));
                    f3 = f2;
                    coreElevation3 = coreElevation2;
                    modifier3 = modifier4;
                } else {
                    coreElevation2 = coreElevation4;
                }
            } else {
                composerImplV.j();
                modifier2 = modifier;
                coreElevation2 = coreElevation;
            }
            f2 = f;
            composerImplV.W();
            final Modifier modifier42 = modifier2;
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(1573281179, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.categorytile.ProductCategoryTileKt$ProductCategoryTile$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierG = SizeKt.g(SizeKt.u(modifier42, f2), 148);
                        RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(12);
                        BorderStroke borderStrokeA = BorderStrokeKt.a(CoreTheme.b(composer2).e.b.e, 1);
                        composer2.o(-1633490746);
                        Function1 function1 = onProductCategoryTileClick;
                        boolean zN = composer2.n(function1);
                        final ProductCategoryTileData productCategoryTileData = data;
                        boolean zI = zN | composer2.I(productCategoryTileData);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new a(10, function1, productCategoryTileData);
                            composer2.A(objG);
                        }
                        composer2.l();
                        CardKt.b((Function0) objG, modifierG, false, roundedCornerShapeB, 0L, 0L, 0L, 0L, coreElevation2, borderStrokeA, null, ComposableLambdaKt.c(-1859391744, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.aem.components.ui.categorytile.ProductCategoryTileKt$ProductCategoryTile$1.2
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                ColumnScope Card = (ColumnScope) obj3;
                                Composer composer3 = (Composer) obj4;
                                int iIntValue = ((Number) obj5).intValue();
                                Intrinsics.h(Card, "$this$Card");
                                if ((iIntValue & 17) == 16 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    float f4 = 8;
                                    Modifier modifierI = PaddingKt.i(SizeKt.e(companion, 1.0f), f4, 24, f4, 12);
                                    ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composer3, 48);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierI);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Function2 function2 = ComposeUiNode.Companion.g;
                                    Updater.b(composer3, columnMeasurePolicyA, function2);
                                    Function2 function22 = ComposeUiNode.Companion.f;
                                    Updater.b(composer3, persistentCompositionLocalMapD, function22);
                                    Function2 function23 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        b.z(p, composer3, p, function23);
                                    }
                                    Function2 function24 = ComposeUiNode.Companion.d;
                                    Updater.b(composer3, modifierD, function24);
                                    ImageRequest.Builder builder = new ImageRequest.Builder((Context) composer3.x(AndroidCompositionLocals_androidKt.b));
                                    ProductCategoryTileData productCategoryTileData2 = productCategoryTileData;
                                    builder.c = productCategoryTileData2.d;
                                    ImageRequests_androidKt.d(builder, R.drawable.ic_wapple_circular_placeholder);
                                    ImageRequests_androidKt.a(builder, R.drawable.ic_wapple_circular_placeholder);
                                    builder.j = CachePolicy.f;
                                    SingletonAsyncImageKt.a(builder.a(), null, SizeKt.q(companion, 64), null, null, composer3, 432, 2040);
                                    Modifier modifierC = SizeKt.c(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13), 1.0f);
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                                    int p2 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer3.d();
                                    Modifier modifierD2 = ComposedModifierKt.d(composer3, modifierC);
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, measurePolicyD, function2);
                                    Updater.b(composer3, persistentCompositionLocalMapD2, function22);
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p2))) {
                                        b.z(p2, composer3, p2, function23);
                                    }
                                    Updater.b(composer3, modifierD2, function24);
                                    TextKt.a(productCategoryTileData2.e, CoreTheme.f(composer3).f5120a.b.b, null, CoreTheme.b(composer3).e.d.d, null, 3, 2, false, 2, null, composer3, 102236160, 660);
                                    composer3.f();
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0, 1268);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            f3 = f2;
            coreElevation3 = coreElevation2;
            modifier3 = modifier42;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d(data, modifier3, coreElevation3, f3, onProductCategoryTileClick, i, i2);
        }
    }
}
