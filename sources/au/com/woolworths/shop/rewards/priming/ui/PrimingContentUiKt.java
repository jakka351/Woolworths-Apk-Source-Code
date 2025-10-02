package au.com.woolworths.shop.rewards.priming.ui;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.OverscrollConfiguration_androidKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.node.ComposeUiNode;
import au.com.woolworths.design.wx.foundation.WxTheme;
import au.com.woolworths.feature.product.list.d0;
import au.com.woolworths.shop.rewards.priming.data.PrimingScreenData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-rewards_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PrimingContentUiKt {
    public static final void a(final PrimingScreenData screenData, Function0 onSignInClick, Function0 onJoinClick, Modifier modifier, LazyListState lazyListState, Composer composer, int i) {
        int i2;
        final LazyListState lazyListStateA;
        Modifier modifier2;
        int i3;
        boolean z;
        Modifier modifier3;
        LazyListState lazyListState2;
        Intrinsics.h(screenData, "screenData");
        Intrinsics.h(onSignInClick, "onSignInClick");
        Intrinsics.h(onJoinClick, "onJoinClick");
        ComposerImpl composerImplV = composer.v(424396417);
        int i4 = (composerImplV.I(screenData) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i4 |= composerImplV.I(onSignInClick) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(onJoinClick) ? 256 : 128;
        }
        int i5 = i4 | 11264;
        if ((i5 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            lazyListState2 = lazyListState;
        } else {
            composerImplV.u0();
            int i6 = i & 1;
            Modifier.Companion companion = Modifier.Companion.d;
            if (i6 == 0 || composerImplV.c0()) {
                i2 = i5 & (-57345);
                lazyListStateA = LazyListStateKt.a(0, 0, 3, composerImplV);
                modifier2 = companion;
            } else {
                composerImplV.j();
                i2 = i5 & (-57345);
                modifier2 = modifier;
                lazyListStateA = lazyListState;
            }
            composerImplV.W();
            long jA = WxTheme.a(composerImplV).a();
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = RectangleShapeKt.f1779a;
            Modifier modifierB = BackgroundKt.b(modifier2, jA, rectangleShapeKt$RectangleShape$1);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i7 = composerImplV.P;
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
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            CompositionLocalKt.a(OverscrollConfiguration_androidKt.f843a.b(null), ComposableLambdaKt.c(1441114551, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.rewards.priming.ui.PrimingContentUiKt$PrimingContentUi$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierA = ColumnScopeInstance.f948a.a(Modifier.Companion.d, 1.0f, true);
                        Arrangement$Center$1 arrangement$Center$1 = Arrangement.e;
                        composer2.o(5004770);
                        PrimingScreenData primingScreenData = screenData;
                        boolean zI = composer2.I(primingScreenData);
                        Object objG = composer2.G();
                        if (zI || objG == Composer.Companion.f1624a) {
                            objG = new a(primingScreenData, 0);
                            composer2.A(objG);
                        }
                        composer2.l();
                        LazyDslKt.b(modifierA, lazyListStateA, null, false, arrangement$Center$1, null, null, false, null, (Function1) objG, composer2, 24576, 492);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
            if (lazyListStateA.b() || lazyListStateA.d()) {
                i3 = i2;
                z = true;
            } else {
                i3 = i2;
                z = false;
            }
            PrimingFooterUiKt.a(onSignInClick, onJoinClick, z, SizeKt.e(BackgroundKt.b(companion, WxTheme.a(composerImplV).a(), rectangleShapeKt$RectangleShape$1), 1.0f), composerImplV, (i3 >> 3) & 126);
            composerImplV.V(true);
            modifier3 = modifier2;
            lazyListState2 = lazyListStateA;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new d0((Object) screenData, (Object) onSignInClick, (Object) onJoinClick, modifier3, (Object) lazyListState2, i, 26);
        }
    }
}
