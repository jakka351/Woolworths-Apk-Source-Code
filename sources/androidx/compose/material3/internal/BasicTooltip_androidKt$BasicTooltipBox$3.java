package androidx.compose.material3.internal;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.RememberedCoroutineScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class BasicTooltip_androidKt$BasicTooltipBox$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ PopupPositionProvider h;
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ TooltipState j;
    public final /* synthetic */ Modifier k;
    public final /* synthetic */ boolean l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ ComposableLambdaImpl n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltip_androidKt$BasicTooltipBox$3(PopupPositionProvider popupPositionProvider, ComposableLambdaImpl composableLambdaImpl, TooltipState tooltipState, Modifier modifier, boolean z, boolean z2, ComposableLambdaImpl composableLambdaImpl2, int i) {
        super(2);
        this.h = popupPositionProvider;
        this.i = composableLambdaImpl;
        this.j = tooltipState;
        this.k = modifier;
        this.l = z;
        this.m = z2;
        this.n = composableLambdaImpl2;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        PopupPositionProvider popupPositionProvider;
        ComposableLambdaImpl composableLambdaImpl;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        boolean z;
        Modifier modifier;
        boolean z2;
        ComposableLambdaImpl composableLambdaImpl2;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.o | 1);
        ComposerImpl composerImplV = ((Composer) obj).v(-550509567);
        int i2 = iA & 6;
        PopupPositionProvider popupPositionProvider2 = this.h;
        if (i2 == 0) {
            i = (composerImplV.n(popupPositionProvider2) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        ComposableLambdaImpl composableLambdaImpl3 = this.i;
        if (i3 == 0) {
            i |= composerImplV.I(composableLambdaImpl3) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        final TooltipState tooltipState = this.j;
        if (i4 == 0) {
            i |= (iA & 512) == 0 ? composerImplV.n(tooltipState) : composerImplV.I(tooltipState) ? 256 : 128;
        }
        int i5 = iA & 3072;
        Modifier modifier2 = this.k;
        if (i5 == 0) {
            i |= composerImplV.n(modifier2) ? 2048 : 1024;
        }
        int i6 = iA & 24576;
        boolean z3 = this.l;
        if (i6 == 0) {
            i |= composerImplV.p(z3) ? 16384 : 8192;
        }
        int i7 = 196608 & iA;
        boolean z4 = this.m;
        if (i7 == 0) {
            i |= composerImplV.p(z4) ? 131072 : 65536;
        }
        int i8 = 1572864 & iA;
        ComposableLambdaImpl composableLambdaImpl4 = this.n;
        if (i8 == 0) {
            i |= composerImplV.I(composableLambdaImpl4) ? 1048576 : 524288;
        }
        if ((599187 & i) == 599186 && composerImplV.c()) {
            composerImplV.j();
            popupPositionProvider = popupPositionProvider2;
            composableLambdaImpl = composableLambdaImpl3;
            z = z3;
            modifier = modifier2;
            z2 = z4;
            composableLambdaImpl2 = composableLambdaImpl4;
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = new CompositionScopedCoroutineScopeCanceller(new RememberedCoroutineScope(composerImplV.y()));
                composerImplV.A(objG);
            }
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objG).d;
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i9 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, Modifier.Companion.d);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            popupPositionProvider = popupPositionProvider2;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i9))) {
                b.B(i9, composerImplV, i9, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-625876949);
            if (tooltipState.isVisible()) {
                int i10 = i >> 3;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                BasicTooltip_androidKt.a(popupPositionProvider, tooltipState, coroutineScope, z3, composableLambdaImpl3, composerImplV, (i & 14) | (i10 & 112) | (i10 & 7168) | ((i << 9) & 57344));
                composableLambdaImpl = composableLambdaImpl3;
                composerImplV = composerImplV;
            } else {
                composableLambdaImpl = composableLambdaImpl3;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
            }
            z = z3;
            composerImplV.V(false);
            int i11 = i >> 3;
            int i12 = ((i >> 15) & 14) | (i11 & 112) | (i11 & 896) | ((i >> 9) & 7168);
            modifier = modifier2;
            z2 = z4;
            composableLambdaImpl2 = composableLambdaImpl4;
            BasicTooltip_androidKt.b(z2, tooltipState, modifier, composableLambdaImpl2, composerImplV, i12);
            boolean z5 = true;
            composerImplV.V(true);
            if ((i & 896) != 256 && ((i & 512) == 0 || !composerImplV.I(tooltipState))) {
                z5 = false;
            }
            Object objG2 = composerImplV.G();
            if (z5 || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$BasicTooltipBox$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        final TooltipState tooltipState2 = tooltipState;
                        return new DisposableEffectResult() { // from class: androidx.compose.material3.internal.BasicTooltip_androidKt$BasicTooltipBox$2$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                tooltipState2.a();
                            }
                        };
                    }
                };
                composerImplV.A(objG2);
            }
            EffectsKt.c(tooltipState, (Function1) objG2, composerImplV);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            PopupPositionProvider popupPositionProvider3 = popupPositionProvider;
            recomposeScopeImplX.d = new BasicTooltip_androidKt$BasicTooltipBox$3(popupPositionProvider3, composableLambdaImpl, tooltipState, modifier, z, z2, composableLambdaImpl2, iA);
        }
        return Unit.f24250a;
    }
}
