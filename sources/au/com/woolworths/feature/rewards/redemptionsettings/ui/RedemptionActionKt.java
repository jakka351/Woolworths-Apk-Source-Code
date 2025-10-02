package au.com.woolworths.feature.rewards.redemptionsettings.ui;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionAction;
import coil3.compose.SingletonAsyncImageKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"redemption-settings_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RedemptionActionKt {
    public static final void a(RewardsRedemptionAction rewardsRedemptionAction, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-417878269);
        if ((((composerImplV.n(rewardsRedemptionAction) ? 4 : 2) | i | 48) & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composerImplV, 48);
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
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            SingletonAsyncImageKt.a(rewardsRedemptionAction.getIconUrl(), null, SizeKt.q(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 16, BitmapDescriptorFactory.HUE_RED, 11), 40), null, null, composerImplV, 432, 2040);
            RedemptionCommonUIKt.b(rewardsRedemptionAction.getTitle(), rewardsRedemptionAction.getBody(), null, false, composerImplV, 0, 12);
            composerImpl = composerImplV;
            composerImpl.V(true);
            modifier = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new androidx.navigation.compose.d(rewardsRedemptionAction, i, 27, modifier);
        }
    }

    public static final void b(final RewardsRedemptionAction item, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Intrinsics.h(item, "item");
        ComposerImpl composerImplV = composer.v(1745508773);
        int i5 = (composerImplV.n(item) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
        } else {
            i3 = i5 | (composerImplV.n(modifier) ? 32 : 16);
        }
        if ((i2 & 4) != 0) {
            i4 = i3 | KyberEngine.KyberPolyBytes;
        } else {
            i4 = i3 | (composerImplV.p(false) ? 256 : 128);
        }
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier modifier3 = i6 != 0 ? Modifier.Companion.d : modifier;
            RedemptionCommonUIKt.a(false, modifier3, null, ComposableLambdaKt.c(-2094619929, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.ui.RedemptionActionKt$RedemptionAction$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    BoxScope SettingBox = (BoxScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(SettingBox, "$this$SettingBox");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        RedemptionActionKt.a(item, null, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i4 >> 6) & 14) | 3072 | (i4 & 112), 4);
            modifier2 = modifier3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(item, modifier2, i, i2, 14);
        }
    }
}
