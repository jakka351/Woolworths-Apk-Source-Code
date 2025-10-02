package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(androidx.compose.ui.Modifier r25, androidx.compose.ui.graphics.Shape r26, long r27, long r29, androidx.compose.foundation.BorderStroke r31, float r32, final kotlin.jvm.functions.Function2 r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.a(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function0 r27, final androidx.compose.ui.Modifier r28, boolean r29, final androidx.compose.ui.graphics.Shape r30, final long r31, final long r33, androidx.compose.foundation.BorderStroke r35, float r36, final androidx.compose.foundation.interaction.MutableInteractionSource r37, final androidx.compose.runtime.internal.ComposableLambdaImpl r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final boolean z, final Function0 function0, final Modifier modifier, final boolean z2, final Shape shape, final long j, final long j2, final BorderStroke borderStroke, float f, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        boolean z3;
        int i2;
        Function0 function02;
        boolean z4;
        Shape shape2;
        long j3;
        BorderStroke borderStroke2;
        final float f2;
        final float f3;
        ComposerImpl composerImplV = composer.v(262027249);
        if ((i & 6) == 0) {
            z3 = z;
            i2 = (composerImplV.p(z3) ? 4 : 2) | i;
        } else {
            z3 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            function02 = function0;
            i2 |= composerImplV.I(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z2;
            i2 |= composerImplV.p(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i & 24576) == 0) {
            shape2 = shape;
            i2 |= composerImplV.n(shape2) ? 16384 : 8192;
        } else {
            shape2 = shape;
        }
        if ((196608 & i) == 0) {
            j3 = j;
            i2 |= composerImplV.s(j3) ? 131072 : 65536;
        } else {
            j3 = j;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.s(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            borderStroke2 = borderStroke;
            i2 |= composerImplV.n(borderStroke2) ? 8388608 : 4194304;
        } else {
            borderStroke2 = borderStroke;
        }
        int i3 = i2 | 100663296;
        if ((805306368 & i) == 0) {
            i3 |= composerImplV.n(null) ? 536870912 : 268435456;
        }
        if (composerImplV.z(i3 & 1, (306783379 & i3) != 306783378)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                f3 = 0;
            } else {
                composerImplV.j();
                f3 = f;
            }
            composerImplV.W();
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ElevationOverlayKt.b;
            final float f4 = ((Dp) composerImplV.x(dynamicProvidableCompositionLocal)).d + f3;
            final boolean z5 = z3;
            final Function0 function03 = function02;
            final boolean z6 = z4;
            final Shape shape3 = shape2;
            final long j4 = j3;
            final BorderStroke borderStroke3 = borderStroke2;
            CompositionLocalKt.b(new ProvidedValue[]{b.g(j2, ContentColorKt.f1261a), dynamicProvidableCompositionLocal.b(new Dp(f4))}, ComposableLambdaKt.c(-1391199439, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        StaticProvidableCompositionLocal staticProvidableCompositionLocal = InteractiveComponentSizeKt.f1291a;
                        Modifier modifierA = SelectableKt.a(SurfaceKt.d(modifier.x0(MinimumInteractiveModifier.d), shape3, SurfaceKt.e(j4, (ElevationOverlay) composer2.x(ElevationOverlayKt.f1281a), f4, composer2), borderStroke3, f3), z5, null, RippleKt.b(BitmapDescriptorFactory.HUE_RED, 7, 0L, false), z6, null, function03);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, true);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
                        ComposeUiNode.e3.getClass();
                        Function0 function04 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function04);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        a.x(0, composer2, composableLambdaImpl);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 56);
            f2 = f3;
        } else {
            composerImplV.j();
            f2 = f;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SurfaceKt.c(z, function0, modifier, z2, shape, j, j2, borderStroke, f2, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final Modifier d(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        Modifier modifierA = ShadowKt.a(modifier, f, shape, false, 0L, 0L, 24);
        Modifier modifierB = Modifier.Companion.d;
        if (borderStroke != null) {
            modifierB = BorderKt.b(modifierB, borderStroke.f828a, borderStroke.b, shape);
        }
        return ClipKt.a(BackgroundKt.b(modifierA.x0(modifierB), j, shape), shape);
    }

    public static final long e(long j, ElevationOverlay elevationOverlay, float f, Composer composer) {
        if (!Color.c(j, MaterialTheme.a(composer).g()) || elevationOverlay == null) {
            composer.o(1082990783);
            composer.l();
            return j;
        }
        composer.o(1082922676);
        long jA = elevationOverlay.a(j, f, composer, 0);
        composer.l();
        return jA;
    }
}
