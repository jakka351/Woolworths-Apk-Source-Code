package au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.dynamic.page.ui.content.o;
import au.com.woolworths.sdui.legacy.downloadableasset.DownloadableAssetUiKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"common-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CollapsingToolbarHeaderKt {
    public static final void a(final DownloadableAsset downloadableAsset, final float f, Modifier modifier, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(759085526);
        if ((((composerImplV.I(downloadableAsset) ? 4 : 2) | i | (composerImplV.q(f) ? 32 : 16)) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierA = AnimationModifierKt.a(modifier, AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), null);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i2 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i2))) {
                androidx.camera.core.impl.b.B(i2, composerImplV, i2, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            AnimatedVisibilityKt.d(downloadableAsset != null, SizeKt.e(modifier, 1.0f), EnterExitTransitionKt.e(null, 3), EnterExitTransitionKt.f(null, 3), null, ComposableLambdaKt.c(-413298376, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.foundation.rewards.common.ui.collapinsgtoolbarextras.CollapsingToolbarHeaderKt$CollapsingToolbarHeader$1$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                    DownloadableAsset downloadableAsset2 = downloadableAsset;
                    if (downloadableAsset2 != null) {
                        String assetUrl = downloadableAsset2.getAssetUrl();
                        composer2.o(-2021606340);
                        composer2.o(-40421119);
                        composer2.o(-1438464387);
                        Intrinsics.g(assetUrl.toLowerCase(Locale.ROOT), "toLowerCase(...)");
                        composer2.o(-1438457205);
                        composer2.l();
                        composer2.l();
                        composer2.l();
                        composer2.l();
                        composer2.o(1849434622);
                        Object objG = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (objG == composer$Companion$Empty$1) {
                            objG = new a(1);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierA2 = SemanticsModifierKt.a(Modifier.Companion.d, (Function1) objG);
                        composer2.o(5004770);
                        float f2 = f;
                        boolean zQ = composer2.q(f2);
                        Object objG2 = composer2.G();
                        if (zQ || objG2 == composer$Companion$Empty$1) {
                            objG2 = new o(f2, 4);
                            composer2.A(objG2);
                        }
                        composer2.l();
                        DownloadableAssetUiKt.b(downloadableAsset, GraphicsLayerModifierKt.a(modifierA2, (Function1) objG2), false, false, false, null, null, composer2, 0, 92);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 200064, 16);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(downloadableAsset, f, modifier, i);
        }
    }
}
