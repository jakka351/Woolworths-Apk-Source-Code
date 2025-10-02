package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ButtonKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v15 */
    public static final void a(final Function0 function0, final Modifier modifier, final boolean z, final Shape shape, final ButtonColors buttonColors, final ButtonElevation buttonElevation, final BorderStroke borderStroke, final PaddingValues paddingValues, final MutableInteractionSource mutableInteractionSource, final Function3 function3, Composer composer, final int i) {
        int i2;
        MutableInteractionSource mutableInteractionSource2;
        long j;
        Animatable animatable;
        MutableInteractionSource mutableInteractionSource3;
        int i3;
        final long j2;
        boolean z2;
        AnimationState animationState;
        ?? r12;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(650121315);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.p(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(shape) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(buttonColors) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(buttonElevation) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.n(borderStroke) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.n(paddingValues) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerImplV.n(mutableInteractionSource) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerImplV.I(function3) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) == 306783378 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            composerImplV.o(-239156623);
            Object obj = Composer.Companion.f1624a;
            if (mutableInteractionSource == null) {
                Object objG = composerImplV.G();
                if (objG == obj) {
                    objG = InteractionSourceKt.a();
                    composerImplV.A(objG);
                }
                mutableInteractionSource2 = (MutableInteractionSource) objG;
            } else {
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerImplV.V(false);
            long j3 = z ? buttonColors.f1403a : buttonColors.c;
            long j4 = z ? buttonColors.b : buttonColors.d;
            composerImplV.o(-239150048);
            if (buttonElevation == null) {
                i3 = i2;
                mutableInteractionSource3 = mutableInteractionSource2;
                animationState = null;
                r12 = 0;
                j2 = j4;
            } else {
                int i4 = ((i2 >> 6) & 14) | ((i2 >> 9) & 896);
                Object objG2 = composerImplV.G();
                if (objG2 == obj) {
                    objG2 = new SnapshotStateList();
                    composerImplV.A(objG2);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objG2;
                boolean zN = composerImplV.n(mutableInteractionSource2);
                int i5 = i2;
                Object objG3 = composerImplV.G();
                if (zN || objG3 == obj) {
                    objG3 = new ButtonElevation$animateElevation$1$1(mutableInteractionSource2, snapshotStateList, null);
                    composerImplV.A(objG3);
                }
                EffectsKt.e(composerImplV, mutableInteractionSource2, (Function2) objG3);
                Interaction interaction = (Interaction) CollectionsKt.P(snapshotStateList);
                Object objG4 = composerImplV.G();
                if (objG4 == obj) {
                    j = j4;
                    objG4 = new Animatable(new Dp(BitmapDescriptorFactory.HUE_RED), VectorConvertersKt.c, (Object) null, 12);
                    composerImplV.A(objG4);
                } else {
                    j = j4;
                }
                Animatable animatable2 = (Animatable) objG4;
                Dp dp = new Dp(BitmapDescriptorFactory.HUE_RED);
                boolean z3 = true;
                boolean zI = ((((i4 & 14) ^ 6) > 4 && composerImplV.p(z)) || (i4 & 6) == 4) | composerImplV.I(animatable2) | composerImplV.q(BitmapDescriptorFactory.HUE_RED);
                if ((((i4 & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !composerImplV.n(buttonElevation)) && (i4 & KyberEngine.KyberPolyBytes) != 256) {
                    z3 = false;
                }
                boolean zI2 = zI | z3 | composerImplV.I(interaction);
                Object objG5 = composerImplV.G();
                if (zI2 || objG5 == obj) {
                    animatable = animatable2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i3 = i5;
                    j2 = j;
                    z2 = false;
                    ButtonElevation$animateElevation$2$1 buttonElevation$animateElevation$2$1 = new ButtonElevation$animateElevation$2$1(animatable, BitmapDescriptorFactory.HUE_RED, z, buttonElevation, interaction, null);
                    composerImplV.A(buttonElevation$animateElevation$2$1);
                    objG5 = buttonElevation$animateElevation$2$1;
                } else {
                    animatable = animatable2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    i3 = i5;
                    j2 = j;
                    z2 = false;
                }
                EffectsKt.e(composerImplV, dp, (Function2) objG5);
                animationState = animatable.c;
                r12 = z2;
            }
            composerImplV.V(r12);
            composerImpl = composerImplV;
            long j5 = j2;
            SurfaceKt.c(function0, SemanticsModifierKt.b(modifier, r12, ButtonKt$Button$1.h), z, shape, j3, j5, BitmapDescriptorFactory.HUE_RED, animationState != null ? ((Dp) ((SnapshotMutableStateImpl) animationState.e).getD()).d : (float) r12, borderStroke, mutableInteractionSource3, ComposableLambdaKt.c(956488494, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Composer composer2 = (Composer) obj2;
                    if ((((Number) obj3).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        TextStyle textStyle = MaterialTheme.b(composer2).m;
                        final PaddingValues paddingValues2 = paddingValues;
                        final Function3 function32 = function3;
                        ProvideContentColorTextStyleKt.a(j2, textStyle, ComposableLambdaKt.c(1327513942, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                if ((((Number) obj5).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    Modifier modifierE = PaddingKt.e(SizeKt.a(Modifier.Companion.d, ButtonDefaults.b, ButtonDefaults.c), paddingValues2);
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composer3, 54);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierE);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function02 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function02);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer3, p, function2);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    function32.invoke(RowScopeInstance.f974a, composer3, 6);
                                    composer3.f();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, KyberEngine.KyberPolyBytes);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i3 << 6) & 234881024) | (i3 & 8078), 64);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ButtonKt$Button$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    ButtonKt.a(function0, modifier, z, shape, buttonColors, buttonElevation, borderStroke, paddingValues, mutableInteractionSource, function3, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function0 r22, androidx.compose.ui.Modifier r23, boolean r24, androidx.compose.ui.graphics.Shape r25, androidx.compose.material3.ButtonColors r26, androidx.compose.foundation.layout.PaddingValues r27, final androidx.compose.runtime.internal.ComposableLambdaImpl r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ButtonKt.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.ButtonColors, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }
}
