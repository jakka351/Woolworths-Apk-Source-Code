package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RadioButtonKt {
    public static final float b;
    public static final float c;
    public static final float d;
    public static final float f;

    /* renamed from: a, reason: collision with root package name */
    public static final float f1311a = 24;
    public static final float e = 12;

    static {
        float f2 = 2;
        b = f2;
        float f3 = 20;
        c = f3;
        d = f3 / f2;
        f = f2;
    }

    public static final void a(final boolean z, final Function0 function0, final Modifier modifier, final boolean z2, RadioButtonColors radioButtonColors, Composer composer, final int i) {
        int i2;
        final RadioButtonColors radioButtonColors2;
        RadioButtonColors radioButtonColors3;
        int i3;
        int i4;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        Modifier modifierA;
        ComposerImpl composerImplV = composer.v(1314435585);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.p(z2) ? 2048 : 1024;
        }
        int i5 = i2 | 24576;
        if ((196608 & i) == 0) {
            i5 = 90112 | i2;
        }
        if (composerImplV.z(i5 & 1, (74899 & i5) != 74898)) {
            composerImplV.u0();
            int i6 = i & 1;
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (i6 == 0 || composerImplV.c0()) {
                long jF = MaterialTheme.a(composerImplV).f();
                long jB = Color.b(MaterialTheme.a(composerImplV).d(), 0.6f);
                long jB2 = Color.b(MaterialTheme.a(composerImplV).d(), ContentAlpha.a(0.38f, 0.38f, composerImplV));
                boolean zS = composerImplV.s(jF) | composerImplV.s(jB) | composerImplV.s(jB2);
                Object objG = composerImplV.G();
                if (zS || objG == composer$Companion$Empty$12) {
                    DefaultRadioButtonColors defaultRadioButtonColors = new DefaultRadioButtonColors(jF, jB, jB2);
                    composerImplV.A(defaultRadioButtonColors);
                    objG = defaultRadioButtonColors;
                }
                radioButtonColors3 = (DefaultRadioButtonColors) objG;
            } else {
                composerImplV.j();
                radioButtonColors3 = radioButtonColors;
            }
            composerImplV.W();
            final State stateA = AnimateAsStateKt.a(z ? e / 2 : 0, AnimationSpecKt.e(100, 0, null, 6), null, null, composerImplV, 48, 12);
            final State stateA2 = radioButtonColors3.a(z2, z, composerImplV);
            RadioButtonColors radioButtonColors4 = radioButtonColors3;
            Modifier modifier2 = Modifier.Companion.d;
            if (function0 != null) {
                i3 = 0;
                i4 = 2;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                modifierA = SelectableKt.a(modifier2, z, null, RippleKt.b(f1311a, 4, 0L, false), z2, new Role(3), function0);
            } else {
                i3 = 0;
                i4 = 2;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                modifierA = modifier2;
            }
            if (function0 != null) {
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1291a;
                modifier2 = MinimumInteractiveModifier.d;
            }
            Modifier modifierK = SizeKt.k(PaddingKt.f(SizeKt.z(modifier.x0(modifier2).x0(modifierA), Alignment.Companion.e, i4), b), c);
            boolean zN = composerImplV.n(stateA2) | composerImplV.n(stateA);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float fT1 = drawScope.T1(RadioButtonKt.f);
                        State state = stateA2;
                        float f2 = fT1 / 2;
                        DrawScope.j0(drawScope, ((Color) state.getD()).f1766a, drawScope.T1(RadioButtonKt.d) - f2, 0L, new Stroke(fT1, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30), 0, 108);
                        State state2 = stateA;
                        if (Float.compare(((Dp) state2.getD()).d, 0) > 0) {
                            DrawScope.j0(drawScope, ((Color) state.getD()).f1766a, drawScope.T1(((Dp) state2.getD()).d) - f2, 0L, Fill.f1802a, 0, 108);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            CanvasKt.a(modifierK, (Function1) objG2, composerImplV, i3);
            radioButtonColors2 = radioButtonColors4;
        } else {
            composerImplV.j();
            radioButtonColors2 = radioButtonColors;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.RadioButtonKt$RadioButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    RadioButtonKt.a(z, function0, modifier, z2, radioButtonColors2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
