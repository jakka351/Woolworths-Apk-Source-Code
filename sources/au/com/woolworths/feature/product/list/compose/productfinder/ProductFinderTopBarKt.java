package au.com.woolworths.feature.product.list.compose.productfinder;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.wx.component.button.IconButtonKt;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.ComposeProductListCallbacks;
import au.com.woolworths.foundation.shop.instore.navigation.productfinder.ProductFinderSearchButtonKt;
import au.com.woolworths.foundation.shop.instore.navigation.productfinder.ProductFinderTitleKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductFinderTopBarKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ProductFinderTopBarKt$EmptyCallbacks$1 f5270a = new ProductFinderTopBarKt$EmptyCallbacks$1();

    public static final void a(String str, String str2, boolean z, ComposeProductListCallbacks composeProductListCallbacks, Composer composer, int i) {
        int i2;
        Object productFinderTopBarKt$ProductFinderTopBar$1$1$1$1;
        Function2 function2;
        Modifier.Companion companion;
        BiasAlignment.Vertical vertical;
        int i3;
        Function2 function22;
        Function2 function23;
        boolean z2;
        ComposeProductListCallbacks composeProductListCallbacks2;
        boolean z3;
        ComposerImpl composerImplV = composer.v(792249122);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(str2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(composeProductListCallbacks) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            composeProductListCallbacks2 = composeProductListCallbacks;
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion2 = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion2);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function24 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function24);
            Function2 function25 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function25);
            Function2 function26 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function26);
            }
            Function2 function27 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function27);
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            BiasAlignment.Vertical vertical2 = Alignment.Companion.k;
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(arrangement$Start$1, vertical2, composerImplV, 48);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, companion2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function24);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function25);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function26);
            }
            Updater.b(composerImplV, modifierD2, function27);
            ImageVector imageVectorA = ArrowBackKt.a();
            String strC = StringResources_androidKt.c(composerImplV, R.string.content_description_back_button);
            long jH = WxTheme.a(composerImplV).h();
            composerImplV.o(5004770);
            int i6 = i2 & 7168;
            boolean z4 = i6 == 2048;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z4 || objG == composer$Companion$Empty$1) {
                function2 = function25;
                companion = companion2;
                vertical = vertical2;
                i3 = i6;
                function22 = function24;
                function23 = function26;
                z2 = false;
                productFinderTopBarKt$ProductFinderTopBar$1$1$1$1 = new ProductFinderTopBarKt$ProductFinderTopBar$1$1$1$1(0, composeProductListCallbacks, ComposeProductListCallbacks.class, "onBackClick", "onBackClick()V", 0);
                composerImplV.A(productFinderTopBarKt$ProductFinderTopBar$1$1$1$1);
            } else {
                function2 = function25;
                i3 = i6;
                function22 = function24;
                function23 = function26;
                companion = companion2;
                vertical = vertical2;
                productFinderTopBarKt$ProductFinderTopBar$1$1$1$1 = objG;
                z2 = false;
            }
            composerImplV.V(z2);
            IconButtonKt.c(imageVectorA, strC, (Function0) ((KFunction) productFinderTopBarKt$ProductFinderTopBar$1$1$1$1), null, false, jH, composerImplV, 0, 24);
            ProductFinderTitleKt.a(1.0f, (i2 & 14) | 48, 4, composerImplV, null, str);
            composerImplV.V(true);
            Modifier.Companion companion3 = companion;
            Modifier modifierF = PaddingKt.f(SizeKt.e(companion3, 1.0f), 16);
            RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(arrangement$Start$1, vertical, composerImplV, 48);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierF);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function2);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function23);
            }
            Updater.b(composerImplV, modifierD3, function27);
            Modifier modifierA = RowScopeInstance.f974a.a(companion3, 1.0f, true);
            composerImplV.o(5004770);
            int i8 = i3;
            boolean z5 = i8 == 2048;
            Object objG2 = composerImplV.G();
            if (z5 || objG2 == composer$Companion$Empty$1) {
                objG2 = new ProductFinderTopBarKt$ProductFinderTopBar$1$2$1$1(0, composeProductListCallbacks, ComposeProductListCallbacks.class, "onSearchClick", "onSearchClick()V", 0);
                composeProductListCallbacks2 = composeProductListCallbacks;
                composerImplV.A(objG2);
            } else {
                composeProductListCallbacks2 = composeProductListCallbacks;
            }
            composerImplV.V(false);
            ProductFinderSearchButtonKt.a((Function0) ((KFunction) objG2), ToneColors.j, ToneColors.e, modifierA, str2, composerImplV, (i2 << 9) & 57344, 0);
            composerImplV.o(588203075);
            if (z) {
                String strC2 = StringResources_androidKt.c(composerImplV, R.string.content_description_olive_button);
                composerImplV.o(5004770);
                boolean zN = composerImplV.n(strC2);
                Object objG3 = composerImplV.G();
                if (zN || objG3 == composer$Companion$Empty$1) {
                    objG3 = new androidx.navigation.fragment.d(strC2, 7);
                    composerImplV.A(objG3);
                }
                composerImplV.V(false);
                Modifier modifierK = SizeKt.k(ClipKt.a(PaddingKt.j(SemanticsModifierKt.b(companion3, false, (Function1) objG3), 14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14), RoundedCornerShapeKt.f1100a), 32);
                composerImplV.o(5004770);
                boolean z6 = i8 == 2048;
                Object objG4 = composerImplV.G();
                if (z6 || objG4 == composer$Companion$Empty$1) {
                    objG4 = new androidx.lifecycle.a(composeProductListCallbacks2, 17);
                    composerImplV.A(objG4);
                }
                z3 = false;
                composerImplV.V(false);
                ImageKt.a(PainterResources_androidKt.a(R.drawable.ic_olive_navigation, 0, composerImplV), null, ClickableKt.d(modifierK, false, null, null, (Function0) objG4, 7), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, 48, 120);
            } else {
                z3 = false;
            }
            android.support.v4.media.session.a.C(composerImplV, z3, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.pullrefresh.a(str, str2, z, composeProductListCallbacks2, i, 2);
        }
    }
}
