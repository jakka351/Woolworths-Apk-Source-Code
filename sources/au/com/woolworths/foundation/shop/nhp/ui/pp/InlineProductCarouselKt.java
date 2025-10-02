package au.com.woolworths.foundation.shop.nhp.ui.pp;

import android.content.Context;
import androidx.camera.core.impl.b;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import au.com.woolworths.design.core.ui.component.experimental.CardKt;
import au.com.woolworths.feature.rewards.account.authentication.ui.a;
import au.com.woolworths.feature.shop.marketplace.ui.categories.d;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.ProductInBannerData;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "currentPairIndex", "nhp-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class InlineProductCarouselKt {
    public static final void a(List list, boolean z, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        ComposerImpl composerImplV = composer.v(-625870961);
        int i2 = i | (composerImplV.I(list) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | KyberEngine.KyberPolyBytes;
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            ArrayList arrayListO0 = CollectionsKt.O0(list, 2, 2);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotIntStateKt.a(0);
                composerImplV.A(objG);
            }
            MutableIntState mutableIntState = (MutableIntState) objG;
            composerImplV.V(false);
            Boolean boolValueOf = Boolean.valueOf(z);
            composerImplV.o(-1746271574);
            boolean zI = ((i2 & 112) == 32) | composerImplV.I(arrayListO0);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new InlineProductCarouselKt$InlineProductCarousel$1$1(z, arrayListO0, mutableIntState, null);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, boolValueOf, (Function2) objG2);
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            Integer numValueOf = Integer.valueOf(mutableIntState.d());
            composerImplV.o(-1746271574);
            boolean zI2 = composerImplV.I(arrayListO0) | composerImplV.I(context);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new InlineProductCarouselKt$InlineProductCarousel$2$1(arrayListO0, mutableIntState, context, null);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, numValueOf, (Function2) objG3);
            List list2 = (List) arrayListO0.get(mutableIntState.d());
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(list);
            Object objG4 = composerImplV.G();
            if (zI3 || objG4 == composer$Companion$Empty$1) {
                objG4 = new d(list, 2);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierB = SemanticsModifierKt.b(companion, true, (Function1) objG4);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            b(0, composerImplV, null, ((ProductInBannerData) list2.get(0)).c);
            composerImplV.o(-1440973336);
            if (list2.size() > 1) {
                SpacerKt.a(composerImplV, SizeKt.u(companion, 4));
                b(0, composerImplV, null, ((ProductInBannerData) list2.get(1)).c);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(list, z, modifier2, i, 6);
        }
    }

    public static final void b(int i, Composer composer, Modifier modifier, String str) {
        Modifier modifier2;
        String str2 = str;
        ComposerImpl composerImplV = composer.v(-1339879676);
        int i2 = (composerImplV.n(str2) ? 4 : 2) | i | 48;
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierQ = SizeKt.q(companion, 60);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierQ);
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
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CardKt.a(SizeKt.c, RoundedCornerShapeKt.b(4), 0L, 0L, null, null, ComposableSingletons$InlineProductCarouselKt.f8787a, composerImplV, 1572870, 60);
            str2 = str;
            CrossfadeKt.b(str2, null, AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, EasingKt.d, 2), "crossfade", ComposableSingletons$InlineProductCarouselKt.c, composerImplV, (i2 & 14) | 27648, 2);
            composerImplV.V(true);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.experimental.badge.a(str2, modifier2, i, 15);
        }
    }
}
