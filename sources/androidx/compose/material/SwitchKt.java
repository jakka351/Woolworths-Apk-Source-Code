package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004¨\u0006\n²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u001a\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"", "forceAnimationCheck", "Lkotlin/Function1;", "", "currentOnCheckedChange", "currentChecked", "Landroidx/compose/ui/graphics/Color;", "trackColor", "thumbColor", "resolvedThumbColor", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SwitchKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1333a;
    public static final float c;
    public static final float f;
    public static final float g;
    public static final float h;
    public static final float b = 14;
    public static final float d = 24;
    public static final float e = 2;
    public static final TweenSpec i = new TweenSpec(100, (Easing) null, 6);
    public static final float j = 1;
    public static final float k = 6;
    public static final float l = 125;

    static {
        float f2 = 34;
        f1333a = f2;
        float f3 = 20;
        c = f3;
        f = f2;
        g = f3;
        h = f2 - f3;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r33, final kotlin.jvm.functions.Function1 r34, androidx.compose.ui.Modifier r35, final boolean r36, final androidx.compose.material.SwitchColors r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwitchKt.a(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material.SwitchColors, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final boolean z, final boolean z2, final SwitchColors switchColors, final Function0 function0, final InteractionSource interactionSource, Composer composer, final int i2) {
        int i3;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        long jA;
        ComposerImpl composerImplV = composer.v(70908914);
        int i4 = i2 & 6;
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
        if (i4 == 0) {
            i3 = (composerImplV.n(boxScopeInstance) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.p(z2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(switchColors) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.I(function0) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerImplV.n(interactionSource) ? 131072 : 65536;
        }
        if (composerImplV.z(i3 & 1, (74899 & i3) != 74898)) {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                objG = new SnapshotStateList();
                composerImplV.A(objG);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) objG;
            boolean z3 = (458752 & i3) == 131072;
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == composer$Companion$Empty$12) {
                objG2 = new SwitchKt$SwitchImpl$1$1(interactionSource, snapshotStateList, null);
                composerImplV.A(objG2);
            }
            EffectsKt.e(composerImplV, interactionSource, (Function2) objG2);
            float f2 = !snapshotStateList.isEmpty() ? k : j;
            DefaultSwitchColors defaultSwitchColors = (DefaultSwitchColors) switchColors;
            composerImplV.o(-1176343362);
            final MutableState mutableStateL = SnapshotStateKt.l(new Color(z2 ? z ? defaultSwitchColors.b : defaultSwitchColors.d : z ? defaultSwitchColors.f : defaultSwitchColors.h), composerImplV);
            composerImplV.l();
            BiasAlignment biasAlignment = Alignment.Companion.e;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierX0 = boxScopeInstance.g(companion, biasAlignment).x0(SizeKt.c);
            boolean zN = composerImplV.n(mutableStateL);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == composer$Companion$Empty$12) {
                objG3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$2$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        float f3 = SwitchKt.f1333a;
                        long j2 = ((Color) mutableStateL.getD()).f1766a;
                        float fT1 = drawScope.T1(SwitchKt.f1333a);
                        float fT12 = drawScope.T1(SwitchKt.b);
                        float f4 = fT12 / 2;
                        drawScope.b1(j2, OffsetKt.a(f4, Offset.f(drawScope.M0())), OffsetKt.a(fT1 - f4, Offset.f(drawScope.M0())), fT12, (464 & 16) != 0 ? 0 : 1, (464 & 32) != 0 ? null : null, 3);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            CanvasKt.a(modifierX0, (Function1) objG3, composerImplV, 0);
            composerImplV.o(-66424183);
            MutableState mutableStateL2 = SnapshotStateKt.l(new Color(z2 ? z ? defaultSwitchColors.f1272a : defaultSwitchColors.c : z ? defaultSwitchColors.e : defaultSwitchColors.g), composerImplV);
            composerImplV.l();
            ElevationOverlay elevationOverlay = (ElevationOverlay) composerImplV.x(ElevationOverlayKt.f1281a);
            float f3 = ((Dp) composerImplV.x(ElevationOverlayKt.b)).d + f2;
            int i5 = i3;
            if (!Color.c(((Color) mutableStateL2.getD()).f1766a, MaterialTheme.a(composerImplV).g()) || elevationOverlay == null) {
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                composerImplV.o(1478584670);
                composerImplV.V(false);
                jA = ((Color) mutableStateL2.getD()).f1766a;
            } else {
                composerImplV.o(1478495731);
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                jA = elevationOverlay.a(((Color) mutableStateL2.getD()).f1766a, f3, composerImplV, 0);
                composerImplV.V(false);
            }
            State stateB = SingleValueAnimationKt.b(jA, null, null, composerImplV, 0, 14);
            Modifier modifierG = boxScopeInstance.g(companion, Alignment.Companion.d);
            boolean z4 = (i5 & 57344) == 16384;
            Object objG4 = composerImplV.G();
            if (z4 || objG4 == composer$Companion$Empty$1) {
                objG4 = new Function1<Density, IntOffset>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$3$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return new IntOffset(IntOffsetKt.a(MathKt.b(((Number) function0.invoke()).floatValue()), 0));
                    }
                };
                composerImplV.A(objG4);
            }
            Modifier modifierK = SizeKt.k(IndicationKt.a(androidx.compose.foundation.layout.OffsetKt.a(modifierG, (Function1) objG4), interactionSource, RippleKt.b(d, 4, 0L, false)), c);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.f1100a;
            SpacerKt.a(composerImplV, BackgroundKt.b(ShadowKt.a(modifierK, f2, roundedCornerShape, false, 0L, 0L, 24), ((Color) stateB.getD()).f1766a, roundedCornerShape));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SwitchKt$SwitchImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SwitchKt.b(z, z2, switchColors, function0, interactionSource, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
