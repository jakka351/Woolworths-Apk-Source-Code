package au.com.woolworths.shop.lists.ui.lists.compose;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.TextKt;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import au.com.woolworths.design.wx.foundation.ToneColors;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.foundation.swrve.embedded.campaign.standardcampaign.ui.f;
import au.com.woolworths.product.composeui.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AddListItemKt {
    public static final void a(int i, Composer composer, Modifier modifier, Function0 onClick, boolean z) {
        int i2;
        boolean z2;
        Modifier modifier2;
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(1811104660);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.p(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(onClick) ? 32 : 16;
        }
        int i3 = i2 | KyberEngine.KyberPolyBytes;
        if ((i3 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            composerImplV.o(5004770);
            boolean z3 = (i3 & 112) == 32;
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new f(23, onClick);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierD = ClickableKt.d(modifierE, false, null, null, (Function0) objG, 7);
            float f = 16;
            float f2 = 12;
            Modifier modifierG = PaddingKt.g(modifierD, f, f2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            ImageKt.b(AddKt.a(), PaddingKt.f(BackgroundKt.b(SizeKt.q(companion, 40), WxTheme.a(composerImplV).b(), RoundedCornerShapeKt.f1100a), 8), null, composerImplV, 48, 120);
            TextKt.b(StringResources_androidKt.c(composerImplV, R.string.shop_lists_add_list), PaddingKt.h(companion, f, BitmapDescriptorFactory.HUE_RED, 2), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, WxTheme.b(composerImplV).l, composerImplV, 48, 0, 65532);
            composerImplV = composerImplV;
            composerImplV.o(1396391014);
            if (z) {
                SpacerKt.a(composerImplV, RowScopeInstance.f974a.a(companion, 1.0f, true));
                Modifier modifierA = ZIndexModifierKt.a(companion, 3.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.h;
                b(PainterResources_androidKt.a(R.drawable.ic_shop_lists_camera_icon, 0, composerImplV), GraphicsLayerModifierKt.b(modifierA, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((Density) composerImplV.x(staticProvidableCompositionLocal)).T1(f2), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131063), composerImplV, 0);
                z2 = false;
                b(PainterResources_androidKt.a(R.drawable.ic_shop_lists_photo_icon, 0, composerImplV), GraphicsLayerModifierKt.b(ZIndexModifierKt.a(companion, 2.0f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ((Density) composerImplV.x(staticProvidableCompositionLocal)).T1(6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131063), composerImplV, 0);
                b(PainterResources_androidKt.a(R.drawable.ic_shop_lists_edit_icon, 0, composerImplV), ZIndexModifierKt.a(companion, 1.0f), composerImplV, 48);
            } else {
                z2 = false;
            }
            composerImplV.V(z2);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new q(z, onClick, modifier2, i, 1);
        }
    }

    public static final void b(Painter painter, Modifier modifier, Composer composer, int i) {
        Painter painter2;
        ComposerImpl composerImplV = composer.v(-1092436691);
        int i2 = (composerImplV.I(painter) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            painter2 = painter;
        } else {
            Modifier modifierB = BackgroundKt.b(BorderKt.a(SizeKt.q(modifier, 36), 1, ToneColors.i, RoundedCornerShapeKt.f1100a), ToneColors.k, RectangleShapeKt.f1779a);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(16);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            Modifier modifierB2 = SemanticsModifierKt.b(modifierB, false, (Function1) objG);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB2);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            painter2 = painter;
            ImageKt.a(painter2, null, BoxScopeInstance.f944a.g(SizeKt.q(Modifier.Companion.d, 18), Alignment.Companion.e), null, null, BitmapDescriptorFactory.HUE_RED, null, composerImplV, (i2 & 14) | 48, 120);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.lists.ui.details.ui.compose.b(painter2, i, 1, modifier);
        }
    }
}
