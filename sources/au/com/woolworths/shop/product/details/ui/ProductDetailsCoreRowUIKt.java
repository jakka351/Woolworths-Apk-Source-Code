package au.com.woolworths.shop.product.details.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.core.ui.component.stable.DividerKt;
import au.com.woolworths.design.core.ui.component.stable.corerow.CoreRowSpec;
import au.com.woolworths.design.core.ui.component.stable.corerow.SimpleRowKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.sdui.common.IconAsset;
import au.com.woolworths.sdui.common.corerow.ImageUtilKt;
import au.com.woolworths.sdui.common.corerow.model.CoreRowModel;
import au.com.woolworths.shop.product.details.data.BasicCoreRow;
import au.com.woolworths.shop.product.details.data.ProductDetailsCoreRow;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-details_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductDetailsCoreRowUIKt {
    public static final void a(CoreRowModel coreRowModel, Function0 function0, Composer composer, int i, int i2) {
        int i3;
        Function0 function02;
        Function0 function03;
        ComposerImpl composerImplV = composer.v(2059587858);
        int i4 = i | (composerImplV.n(coreRowModel) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
        } else {
            i3 = i4 | (composerImplV.I(function0) ? 32 : 16);
        }
        if ((i3 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            function03 = function0;
        } else {
            if (i5 != 0) {
                composerImplV.o(1849434622);
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.android.onesite.deeplink.h(20);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                function02 = (Function0) objG;
            } else {
                function02 = function0;
            }
            String str = coreRowModel.f9998a;
            String str2 = coreRowModel.d;
            String str3 = coreRowModel.c;
            IconAsset iconAsset = coreRowModel.e;
            composerImplV.o(-715983735);
            CoreRowSpec.Image imageA = iconAsset == null ? null : ImageUtilKt.a(iconAsset, CoreRowSpec.ImageSize.f4756a, null, composerImplV, 6);
            composerImplV.V(false);
            IconAsset iconAsset2 = coreRowModel.b;
            composerImplV.o(-715980759);
            CoreRowSpec.Image imageA2 = iconAsset2 == null ? null : ImageUtilKt.a(iconAsset2, CoreRowSpec.ImageSize.f4756a, null, composerImplV, 6);
            composerImplV.V(false);
            String str4 = coreRowModel.f;
            SimpleRowKt.a(str2, function02, null, str3, str, imageA2, imageA, str4 != null ? new CoreRowSpec.TrailingDisplay.Text(str4) : null, null, composerImplV, i3 & 112, 260);
            function03 = function02;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(coreRowModel, function03, i, i2, 11);
        }
    }

    public static final void b(ProductDetailsCoreRow productDetailsCoreRow, Function1 onActionClick, Composer composer, int i) {
        Object obj = productDetailsCoreRow.b;
        Intrinsics.h(onActionClick, "onActionClick");
        ComposerImpl composerImplV = composer.v(-176668343);
        int i2 = (composerImplV.I(productDetailsCoreRow) ? 4 : 2) | i | (composerImplV.I(onActionClick) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-867983741);
            if (productDetailsCoreRow.f12605a) {
                DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImplV).e.b.e, composerImplV, null);
            }
            composerImplV.V(false);
            if (obj instanceof BasicCoreRow) {
                composerImplV.o(-867977980);
                CoreRowModel coreRowModel = ((BasicCoreRow) obj).f12595a;
                composerImplV.o(-1633490746);
                boolean zI = ((i2 & 112) == 32) | composerImplV.I(productDetailsCoreRow);
                Object objG = composerImplV.G();
                if (zI || objG == Composer.Companion.f1624a) {
                    objG = new au.com.woolworths.shop.checkout.ui.details.c(18, onActionClick, productDetailsCoreRow);
                    composerImplV.A(objG);
                }
                composerImplV.V(false);
                a(coreRowModel, (Function0) objG, composerImplV, 0, 0);
                composerImplV.V(false);
            } else if (obj instanceof CoreRowModel) {
                composerImplV.o(-867971369);
                a((CoreRowModel) obj, null, composerImplV, 0, 2);
                composerImplV.V(false);
            } else {
                composerImplV.o(-1137233393);
                composerImplV.V(false);
            }
            DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 5, CoreTheme.b(composerImplV).e.b.e, composerImplV, null);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.rewards.common.ui.b(productDetailsCoreRow, i, 26, onActionClick);
        }
    }
}
