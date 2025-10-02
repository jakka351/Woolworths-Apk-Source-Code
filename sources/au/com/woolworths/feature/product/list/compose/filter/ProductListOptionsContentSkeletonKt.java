package au.com.woolworths.feature.product.list.compose.filter;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.compose.utils.layout.SpacerKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.shared.ui.compose.StatefulButtonKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"product-list_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListOptionsContentSkeletonKt {
    public static final void a(ProductListOptionsContract.ViewState viewState, Function0 onSeeResultButtonClick, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Function3 function3;
        Intrinsics.h(viewState, "viewState");
        boolean z = viewState.f5258a;
        Intrinsics.h(onSeeResultButtonClick, "onSeeResultButtonClick");
        ComposerImpl composerImplV = composer.v(-1234355894);
        int i2 = i | (composerImplV.I(viewState) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onSeeResultButtonClick) ? 32 : 16;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            function3 = composableLambdaImpl;
        } else {
            FillElement fillElement = SizeKt.c;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, fillElement);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            long jA = WxTheme.a(composerImplV).a();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier.Companion companion = Modifier.Companion.d;
            float f = 16;
            Modifier modifierH = PaddingKt.h(BackgroundKt.b(companion, jA, rectangleShapeKt$RectangleShape$1).x0(fillElement), f, BitmapDescriptorFactory.HUE_RED, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.n, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.f948a;
            SpacerKt.c(columnScopeInstance, 4, composerImplV, 54);
            function3 = composableLambdaImpl;
            function3.invoke(columnScopeInstance, composerImplV, 54);
            int i5 = viewState.i;
            String strA = StringResources_androidKt.a(R.plurals.product_filters_see_x_results, i5, new Object[]{Integer.valueOf(i5)}, composerImplV);
            StatefulButtonKt.b(strA, strA, SizeKt.e(PaddingKt.h(companion, BitmapDescriptorFactory.HUE_RED, f, 1), 1.0f), z ? StatefulButtonState.e : StatefulButtonState.d, 0L, onSeeResultButtonClick, composerImplV, ((i2 << 12) & 458752) | KyberEngine.KyberPolyBytes, 16);
            composerImplV.V(true);
            composerImplV.o(-1014425308);
            if (z) {
                LoadingScreenKt.a(composerImplV, 0);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.lifecycle.compose.c(viewState, onSeeResultButtonClick, function3, i, 19);
        }
    }
}
