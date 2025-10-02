package au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextDecoration;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.IconKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonSpec;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.TertiaryIconButtonKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem;
import au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesSubstitutedProduct;
import au.com.woolworths.feature.shop.myorders.details.models.OrderProductListProductPriceStyle;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"my-orders_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesProductItemKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[OrderProductListProductPriceStyle.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OrderProductListProductPriceStyle orderProductListProductPriceStyle = OrderProductListProductPriceStyle.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void a(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(708881516);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 6, 0L, composerImplV, BackgroundKt.b(PaddingKt.j(Modifier.Companion.d, 96, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 10), CoreTheme.b(composerImplV).e.b.f4852a, RectangleShapeKt.f1779a));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.b(i, 13);
        }
    }

    public static final void b(YourGroceriesProductItem yourGroceriesProductItem, Function1 function1, boolean z, Composer composer, int i) {
        int i2;
        Function2 function2;
        long j;
        ComposerImpl composerImplV = composer.v(3057129);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.I(yourGroceriesProductItem) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(yourGroceriesProductItem);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f(6, function1, yourGroceriesProductItem);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            float f = 16;
            Modifier modifierF = PaddingKt.f(ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7), f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical = Alignment.Companion.j;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            SingletonAsyncImageKt.b(yourGroceriesProductItem.c, StringResources_androidKt.c(composerImplV, R.string.your_groceries_product_image_content_desc), SizeKt.q(companion, 64), PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composerImplV), PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composerImplV), null, null, null, null, null, null, null, composerImplV, KyberEngine.KyberPolyBytes, 0, 32736);
            composerImplV = composerImplV;
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                function2 = function24;
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            } else {
                function2 = function24;
            }
            Updater.b(composerImplV, modifierD2, function25);
            Function2 function26 = function2;
            TextKt.a(yourGroceriesProductItem.b, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            float f2 = 8;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f2));
            TextKt.a(yourGroceriesProductItem.d, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).d.d.e.b, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            Modifier modifierE2 = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierE2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function26);
            }
            Updater.b(composerImplV, modifierD3, function25);
            TextKt.a(yourGroceriesProductItem.e, CoreTheme.f(composerImplV).f5120a.f5121a.c, RowScopeInstance.f974a.a(companion, 1.0f, true), CoreTheme.b(composerImplV).d.d.f4845a, null, 0, 0, false, 0, null, composerImplV, 0, 1008);
            SpacerKt.a(composerImplV, SizeKt.u(companion, f2));
            String str = yourGroceriesProductItem.f;
            TextStyle textStyle = CoreTheme.f(composerImplV).f5120a.f5121a.c;
            int iOrdinal = yourGroceriesProductItem.g.ordinal();
            if (iOrdinal == 0) {
                composerImplV.o(-1523470770);
                j = CoreTheme.b(composerImplV).d.d.f4845a;
                composerImplV.V(false);
            } else {
                if (iOrdinal != 1) {
                    throw au.com.woolworths.android.onesite.a.w(-1523474571, composerImplV, false);
                }
                composerImplV.o(-1523467029);
                j = CoreTheme.a(composerImplV).f4774a.f4777a.b;
                composerImplV.V(false);
            }
            TextKt.a(str, textStyle, null, j, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            android.support.v4.media.session.a.C(composerImplV, true, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.filter.b(yourGroceriesProductItem, function1, z, i, 9);
        }
    }

    public static final void c(final String str, Boolean bool, Map map, final Function2 function2, Composer composer, int i) {
        int i2;
        ImageVector imageVector;
        ImageVector imageVector2;
        ComposerImpl composerImplV = composer.v(1855507240);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(bool) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(map) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function2) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(bool2)) {
                Boolean bool3 = (Boolean) map.get(str);
                if (Intrinsics.c(bool3, bool2)) {
                    composerImplV.o(1187394656);
                    imageVector = CoreTheme.e(composerImplV).f4879a.B;
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1187458051);
                    imageVector = CoreTheme.e(composerImplV).f4879a.E;
                    composerImplV.V(false);
                }
                if (Intrinsics.c(bool3, Boolean.FALSE)) {
                    composerImplV.o(1187569341);
                    imageVector2 = CoreTheme.e(composerImplV).f4879a.D;
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1187635681);
                    imageVector2 = CoreTheme.e(composerImplV).f4879a.C;
                    composerImplV.V(false);
                }
                ImageVector imageVector3 = imageVector2;
                Modifier.Companion companion = Modifier.Companion.d;
                SpacerKt.a(composerImplV, SizeKt.g(companion, 10));
                RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
                int i3 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
                ComposeUiNode.e3.getClass();
                Function0 function0 = ComposeUiNode.Companion.b;
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                Function2 function22 = ComposeUiNode.Companion.j;
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                    androidx.camera.core.impl.b.B(i3, composerImplV, i3, function22);
                }
                Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
                Modifier modifierA = rowScopeInstance.a(companion, 1.0f, true);
                IconButtonSpec.Size size = IconButtonSpec.Size.g;
                composerImplV.o(-1633490746);
                int i4 = i2 & 7168;
                int i5 = i2 & 14;
                boolean z = (i4 == 2048) | (i5 == 4);
                Object objG = composerImplV.G();
                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                if (z || objG == composer$Companion$Empty$1) {
                    final int i6 = 0;
                    objG = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    function2.invoke(str, Boolean.TRUE);
                                    break;
                                default:
                                    function2.invoke(str, Boolean.FALSE);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                TertiaryIconButtonKt.a(imageVector, "rate up", (Function0) objG, modifierA, false, size, composerImplV, 196656, 16);
                SpacerKt.a(composerImplV, SizeKt.u(companion, 16));
                Modifier modifierA2 = rowScopeInstance.a(companion, 1.0f, true);
                composerImplV.o(-1633490746);
                boolean z2 = (i5 == 4) | (i4 == 2048);
                Object objG2 = composerImplV.G();
                if (z2 || objG2 == composer$Companion$Empty$1) {
                    final int i7 = 1;
                    objG2 = new Function0() { // from class: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.g
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i7) {
                                case 0:
                                    function2.invoke(str, Boolean.TRUE);
                                    break;
                                default:
                                    function2.invoke(str, Boolean.FALSE);
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                TertiaryIconButtonKt.a(imageVector3, "rate down", (Function0) objG2, modifierA2, false, size, composerImplV, 196656, 16);
                composerImplV.V(true);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(str, bool, map, function2, i, 23);
        }
    }

    public static final void d(Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1988220889);
        if (i == 0 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierH = PaddingKt.h(companion, 16, BitmapDescriptorFactory.HUE_RED, 2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SpacerKt.a(composerImplV, SizeKt.u(companion, 80));
            RowScopeInstance rowScopeInstance = RowScopeInstance.f974a;
            float f = 1;
            Modifier modifierG = SizeKt.g(rowScopeInstance.a(companion, 1.0f, true), f);
            long j = CoreTheme.b(composerImplV).e.b.f4852a;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            BoxKt.a(BackgroundKt.b(modifierG, j, rectangleShapeKt$RectangleShape$1), composerImplV, 0);
            IconKt.b(CoreTheme.e(composerImplV).f4879a.v, "", PaddingKt.h(companion, 6, BitmapDescriptorFactory.HUE_RED, 2), CoreTheme.b(composerImplV).e.c.f4854a, composerImplV, 432, 0);
            BoxKt.a(BackgroundKt.b(SizeKt.g(rowScopeInstance.a(companion, 1.0f, true), f), CoreTheme.b(composerImplV).e.b.f4852a, rectangleShapeKt$RectangleShape$1), composerImplV, 0);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.modeselector.ui.b(i, 12);
        }
    }

    public static final void e(YourGroceriesSubstitutedProduct yourGroceriesSubstitutedProduct, Function1 function1, Function2 function2, Map map, Composer composer, int i) {
        int i2;
        YourGroceriesSubstitutedProduct yourGroceriesSubstitutedProduct2;
        Function2 function22;
        boolean z;
        ComposerImpl composerImplV = composer.v(820549782);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(yourGroceriesSubstitutedProduct) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(map) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            yourGroceriesSubstitutedProduct2 = yourGroceriesSubstitutedProduct;
        } else {
            boolean zEquals = yourGroceriesSubstitutedProduct.f.equals(Boolean.TRUE);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(yourGroceriesSubstitutedProduct);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.feature.shop.myorders.details.ui.compose.orderdetails.f(7, function1, yourGroceriesSubstitutedProduct);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            int i3 = i2;
            float f = 16;
            Modifier modifierF = PaddingKt.f(ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7), f);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, Alignment.Companion.j, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierF);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function23 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function23);
            Function2 function24 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function24);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function25);
            }
            Function2 function26 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function26);
            SingletonAsyncImageKt.b(yourGroceriesSubstitutedProduct.b, "Product image", SizeKt.q(companion, 64), PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composerImplV), PainterResources_androidKt.a(R.drawable.ic_product_image_unavailable, 0, composerImplV), null, null, null, null, null, null, null, composerImplV, 432, 0, 32736);
            SpacerKt.a(composerImplV, SizeKt.u(companion, f));
            Arrangement$Top$1 arrangement$Top$1 = Arrangement.c;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.m;
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function24);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function25);
            }
            Updater.b(composerImplV, modifierD2, function26);
            composerImplV.o(1542706960);
            yourGroceriesSubstitutedProduct2 = yourGroceriesSubstitutedProduct;
            TextKt.a(yourGroceriesSubstitutedProduct.g, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).d.d.e.b, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            composerImplV.V(false);
            composerImplV.o(1542715755);
            TextKt.a(yourGroceriesSubstitutedProduct2.e, CoreTheme.f(composerImplV).f5120a.f5121a.f5122a, null, CoreTheme.b(composerImplV).e.d.d, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            composerImplV.V(false);
            float f2 = 8;
            SpacerKt.a(composerImplV, SizeKt.g(companion, f2));
            Modifier modifierE2 = SizeKt.e(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, Alignment.Companion.l, composerImplV, 48);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierE2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA2, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function24);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function25);
            }
            Updater.b(composerImplV, modifierD3, function26);
            Modifier modifierA = RowScopeInstance.f974a.a(companion, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicyA2 = ColumnKt.a(arrangement$Top$1, horizontal, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierA);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA2, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function24);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function25);
            }
            Updater.b(composerImplV, modifierD4, function26);
            composerImplV.o(-1415612985);
            TextKt.a(yourGroceriesSubstitutedProduct2.i, CoreTheme.f(composerImplV).f5120a.c.f5124a, null, CoreTheme.b(composerImplV).d.d.e.b, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            composerImplV.V(false);
            composerImplV.o(-1415602306);
            TextKt.a(yourGroceriesSubstitutedProduct2.j, CoreTheme.f(composerImplV).f5120a.f5121a.c, null, CoreTheme.b(composerImplV).d.d.f4845a, null, 0, 0, false, 0, null, composerImplV, 0, 1012);
            ComposerImpl composerImpl = composerImplV;
            composerImpl.V(false);
            composerImpl.V(true);
            SpacerKt.a(composerImpl, SizeKt.u(companion, f2));
            ColumnMeasurePolicy columnMeasurePolicyA3 = ColumnKt.a(arrangement$Top$1, Alignment.Companion.o, composerImpl, 48);
            int i8 = composerImpl.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ5 = composerImpl.Q();
            Modifier modifierD5 = ComposedModifierKt.d(composerImpl, companion);
            composerImpl.i();
            if (composerImpl.O) {
                composerImpl.K(function0);
            } else {
                composerImpl.e();
            }
            Updater.b(composerImpl, columnMeasurePolicyA3, function23);
            Updater.b(composerImpl, persistentCompositionLocalMapQ5, function24);
            if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i8))) {
                function22 = function25;
                androidx.camera.core.impl.b.B(i8, composerImpl, i8, function22);
            } else {
                function22 = function25;
            }
            Updater.b(composerImpl, modifierD5, function26);
            composerImpl.o(-766775808);
            if (zEquals) {
                RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(arrangement$Start$1, Alignment.Companion.k, composerImpl, 48);
                int i9 = composerImpl.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ6 = composerImpl.Q();
                Modifier modifierD6 = ComposedModifierKt.d(composerImpl, companion);
                composerImpl.i();
                if (composerImpl.O) {
                    composerImpl.K(function0);
                } else {
                    composerImpl.e();
                }
                Updater.b(composerImpl, rowMeasurePolicyA3, function23);
                Updater.b(composerImpl, persistentCompositionLocalMapQ6, function24);
                if (composerImpl.O || !Intrinsics.c(composerImpl.G(), Integer.valueOf(i9))) {
                    androidx.camera.core.impl.b.B(i9, composerImpl, i9, function22);
                }
                Updater.b(composerImpl, modifierD6, function26);
                IconKt.b(CoreTheme.e(composerImpl).i.j, "", SizeKt.q(companion, 13), CoreTheme.b(composerImpl).e.c.f4854a, composerImpl, 432, 0);
                composerImpl.o(-826165659);
                TextKt.a(yourGroceriesSubstitutedProduct2.h, CoreTheme.f(composerImpl).f5120a.c.f5124a, null, CoreTheme.b(composerImpl).d.d.e.b, null, 0, 0, false, 0, null, composerImpl, 0, 1012);
                composerImpl = composerImpl;
                z = false;
                composerImpl.V(false);
                composerImpl.V(true);
            } else {
                z = false;
            }
            composerImpl.V(z);
            ComposerImpl composerImpl2 = composerImpl;
            TextKt.a(yourGroceriesSubstitutedProduct2.d, CoreTheme.f(composerImpl).f5120a.f5121a.c, null, CoreTheme.b(composerImpl).d.d.f4845a, zEquals ? TextDecoration.d : TextDecoration.b, 0, 0, false, 0, null, composerImpl2, 0, 996);
            composerImplV = composerImpl2;
            composerImplV.V(true);
            composerImplV.V(true);
            c(yourGroceriesSubstitutedProduct2.f7710a, yourGroceriesSubstitutedProduct2.k, map, function2, composerImplV, ((i3 >> 3) & 896) | ((i3 << 3) & 7168));
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.product.list.compose.d(yourGroceriesSubstitutedProduct2, function1, function2, map, i, 22);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem r28, kotlin.jvm.functions.Function1 r29, kotlin.jvm.functions.Function1 r30, kotlin.jvm.functions.Function2 r31, java.util.Map r32, boolean r33, boolean r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesProductItemKt.f(au.com.woolworths.feature.shop.myorders.details.epoxy.YourGroceriesProductItem, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, java.util.Map, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
