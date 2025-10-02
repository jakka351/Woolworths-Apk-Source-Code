package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.RadioButtonTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
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

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RadioButtonKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1475a;
    public static final float b = 12;
    public static final float c;

    static {
        float f = 2;
        f1475a = f;
        c = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v9 */
    public static final void a(final boolean z, final Function0 function0, final Modifier modifier, final boolean z2, final RadioButtonColors radioButtonColors, Composer composer, final int i) {
        State state;
        State stateL;
        final State state2;
        final State state3;
        ?? r11;
        int i2;
        Modifier modifierA;
        ComposerImpl composerImplV = composer.v(408580840);
        if (((i | (composerImplV.p(z) ? 4 : 2) | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128) | (composerImplV.p(z2) ? 2048 : 1024) | (composerImplV.n(radioButtonColors) ? 16384 : 8192) | 196608) & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            State stateA = AnimateAsStateKt.a(z ? b / 2 : 0, AnimationSpecKt.e(100, 0, null, 6), null, null, composerImplV, 48, 12);
            long j = (z2 && z) ? radioButtonColors.f1474a : (!z2 || z) ? (z2 || !z) ? radioButtonColors.d : radioButtonColors.c : radioButtonColors.b;
            if (z2) {
                composerImplV.o(350067971);
                state = stateA;
                stateL = SingleValueAnimationKt.b(j, AnimationSpecKt.e(100, 0, null, 6), null, composerImplV, 48, 12);
                composerImplV.V(false);
            } else {
                state = stateA;
                composerImplV.o(350170674);
                stateL = SnapshotStateKt.l(new Color(j), composerImplV);
                composerImplV.V(false);
            }
            composerImplV.o(1327106656);
            Modifier modifier2 = Modifier.Companion.d;
            if (function0 != null) {
                state3 = stateL;
                state2 = state;
                r11 = 0;
                i2 = 2;
                modifierA = SelectableKt.a(modifier2, z, null, RippleKt.b(false, RadioButtonTokens.b / 2, 0L, composerImplV, 54, 4), z2, new Role(3), function0);
            } else {
                state2 = state;
                state3 = stateL;
                r11 = 0;
                i2 = 2;
                modifierA = modifier2;
            }
            composerImplV.V(r11);
            if (function0 != null) {
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1454a;
                modifier2 = MinimumInteractiveModifier.d;
            }
            Modifier modifierK = SizeKt.k(PaddingKt.f(SizeKt.z(modifier.x0(modifier2).x0(modifierA), Alignment.Companion.e, i2), f1475a), RadioButtonTokens.f1599a);
            boolean zN = composerImplV.n(state3) | composerImplV.n(state2);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float fT1 = drawScope.T1(RadioButtonKt.c);
                        State state4 = state3;
                        float f = 2;
                        float f2 = fT1 / f;
                        DrawScope.j0(drawScope, ((Color) state4.getD()).f1766a, drawScope.T1(RadioButtonTokens.f1599a / f) - f2, 0L, new Stroke(fT1, BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30), 0, 108);
                        State state5 = state2;
                        if (Float.compare(((Dp) state5.getD()).d, 0) > 0) {
                            DrawScope.j0(drawScope, ((Color) state4.getD()).f1766a, drawScope.T1(((Dp) state5.getD()).d) - f2, 0L, Fill.f1802a, 0, 108);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            CanvasKt.a(modifierK, (Function1) objG, composerImplV, r11);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(z, function0, modifier, z2, radioButtonColors, i) { // from class: androidx.compose.material3.RadioButtonKt$RadioButton$2
                public final /* synthetic */ boolean h;
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Modifier j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ RadioButtonColors l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    RadioButtonKt.a(this.h, this.i, this.j, this.k, this.l, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
