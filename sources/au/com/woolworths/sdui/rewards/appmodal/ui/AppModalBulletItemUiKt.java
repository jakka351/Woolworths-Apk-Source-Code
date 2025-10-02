package au.com.woolworths.sdui.rewards.appmodal.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.homepage.presentation.marketplace.a;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class AppModalBulletItemUiKt {
    public static final void a(FeatureInfoBulletItem featureInfoBulletItem, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-79925287);
        if (((i | (composerImplV.n(featureInfoBulletItem) ? 4 : 2)) & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 48);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, rowMeasurePolicyA, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                b.B(i2, composerImplV, i2, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            SingletonAsyncImageKt.b(featureInfoBulletItem.getIconUrl(), null, SizeKt.q(companion, 42), PainterResources_androidKt.a(R.drawable.ic_rewards_logo_placeholder, 0, composerImplV), PainterResources_androidKt.a(R.drawable.ic_rewards_logo_placeholder, 0, composerImplV), null, null, null, null, null, null, null, composerImplV, 432, 0, 32736);
            float f = 16;
            Modifier modifierJ = PaddingKt.j(companion, f, BitmapDescriptorFactory.HUE_RED, f, f, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            TextKt.b(featureInfoBulletItem.getTitle(), PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 4, 7), CoreTheme.b(composerImplV).e.d.d, 0L, null, 0L, null, new TextAlign(5), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).e.f5133a.b, composerImplV, 48, 0, 65016);
            TextKt.b(featureInfoBulletItem.getContent(), null, CoreTheme.b(composerImplV).e.d.b, 0L, null, 0L, null, new TextAlign(5), 0L, 0, false, 0, 0, null, CoreTheme.f(composerImplV).f5120a.b.f5123a, composerImplV, 0, 0, 65018);
            composerImplV = composerImplV;
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(i, 21, featureInfoBulletItem);
        }
    }
}
