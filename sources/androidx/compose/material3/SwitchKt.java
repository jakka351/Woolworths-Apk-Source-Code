package androidx.compose.material3;

import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SwitchKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1508a;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float e;
    public static final SnapSpec f;
    public static final TweenSpec g;

    static {
        float f2 = SwitchTokens.b;
        f1508a = f2;
        b = SwitchTokens.g;
        c = SwitchTokens.f;
        float f3 = SwitchTokens.d;
        d = f3;
        e = (f3 - f2) / 2;
        f = new SnapSpec(0);
        g = new TweenSpec(100, (Easing) null, 6);
    }

    public static final void a(final boolean z, final Function1 function1, final Modifier modifier, final Function2 function2, final SwitchColors switchColors, final MutableInteractionSource mutableInteractionSource, Composer composer, final int i) {
        MutableInteractionSource mutableInteractionSource2;
        Modifier modifierA;
        ComposerImpl composerImplV = composer.v(1580463220);
        int i2 = i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(function1) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128) | (composerImplV.I(function2) ? 2048 : 1024) | (composerImplV.p(true) ? 16384 : 8192) | (composerImplV.n(switchColors) ? 131072 : 65536) | (composerImplV.n(mutableInteractionSource) ? 1048576 : 524288);
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            composerImplV.o(783532531);
            if (mutableInteractionSource == null) {
                Object objG = composerImplV.G();
                if (objG == Composer.Companion.f1624a) {
                    objG = InteractionSourceKt.a();
                    composerImplV.A(objG);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objG;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerImplV.V(false);
            if (function1 != null) {
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1454a;
                modifierA = ToggleableKt.a(MinimumInteractiveModifier.d, z, mutableInteractionSource2, null, true, new Role(2), function1);
            } else {
                modifierA = Modifier.Companion.d;
            }
            Modifier modifierL = SizeKt.l(SizeKt.z(modifier.x0(modifierA), Alignment.Companion.e, 2), c, d);
            float f2 = SwitchTokens.f1607a;
            int i3 = i2 << 3;
            int i4 = i2 >> 6;
            b(modifierL, z, switchColors, function2, mutableInteractionSource2, ShapesKt.b(ShapeKeyTokens.g, composerImplV), composerImplV, (i3 & 112) | (i4 & 896) | (i4 & 7168) | (i3 & 57344));
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(z, function1, modifier, function2, switchColors, mutableInteractionSource, i) { // from class: androidx.compose.material3.SwitchKt$Switch$1
                public final /* synthetic */ boolean h;
                public final /* synthetic */ Function1 i;
                public final /* synthetic */ Modifier j;
                public final /* synthetic */ Function2 k;
                public final /* synthetic */ SwitchColors l;
                public final /* synthetic */ MutableInteractionSource m;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    SwitchKt.a(this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Modifier modifier, final boolean z, SwitchColors switchColors, Function2 function2, final InteractionSource interactionSource, final Shape shape, Composer composer, final int i) {
        int i2;
        final SwitchColors switchColors2 = switchColors;
        final Function2 function22 = function2;
        ComposerImpl composerImplV = composer.v(-1594099146);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(switchColors2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function22) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(interactionSource) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(shape) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long j = z ? switchColors2.b : switchColors2.f;
            long j2 = z ? switchColors2.f1507a : switchColors2.e;
            float f2 = SwitchTokens.f1607a;
            Shape shapeB = ShapesKt.b(ShapeKeyTokens.g, composerImplV);
            Modifier modifierB = BackgroundKt.b(BorderKt.a(modifier, SwitchTokens.e, z ? switchColors2.c : switchColors2.g, shapeB), j, shapeB);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            int i4 = i2;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function23 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicyD, function23);
            Function2 function24 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function24);
            Function2 function25 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function25);
            }
            Function2 function26 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function26);
            Modifier modifierB2 = BackgroundKt.b(IndicationKt.a(BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.d).x0(new ThumbElement(interactionSource, z)), interactionSource, RippleKt.b(false, SwitchTokens.c / 2, 0L, composerImplV, 54, 4)), j2, shape);
            MeasurePolicy measurePolicyD2 = BoxKt.d(Alignment.Companion.e, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function23);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function24);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function25);
            }
            Updater.b(composerImplV, modifierD2, function26);
            composerImplV.o(1163457794);
            switchColors2 = switchColors;
            if (function2 != null) {
                function22 = function2;
                CompositionLocalKt.a(androidx.camera.core.impl.b.g(z ? switchColors2.d : switchColors2.h, ContentColorKt.f1427a), function22, composerImplV, ((i4 >> 9) & 112) | 8);
            } else {
                function22 = function2;
            }
            android.support.v4.media.session.a.C(composerImplV, false, true, true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SwitchKt.b(modifier, z, switchColors2, function22, interactionSource, shape, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
