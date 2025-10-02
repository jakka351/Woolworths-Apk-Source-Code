package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.ProvideContentColorTextStyleKt;
import androidx.compose.material3.tokens.ExtendedFabPrimaryTokens;
import androidx.compose.material3.tokens.FabPrimaryTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class FloatingActionButtonKt$FloatingActionButton$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ Shape j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ FloatingActionButtonElevation m;
    public final /* synthetic */ MutableInteractionSource n;
    public final /* synthetic */ ComposableLambdaImpl o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonKt$FloatingActionButton$3(Function0 function0, Modifier modifier, Shape shape, long j, long j2, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.h = function0;
        this.i = modifier;
        this.j = shape;
        this.k = j;
        this.l = j2;
        this.m = floatingActionButtonElevation;
        this.n = mutableInteractionSource;
        this.o = composableLambdaImpl;
        this.p = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        MutableInteractionSource mutableInteractionSource;
        int i2;
        ComposerImpl composerImpl;
        Function0 function0;
        Shape shape;
        long j;
        long j2;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.p | 1);
        float f = FloatingActionButtonKt.f1451a;
        ComposerImpl composerImplV = ((Composer) obj).v(-731723913);
        int i3 = iA & 6;
        Function0 function02 = this.h;
        if (i3 == 0) {
            i = (composerImplV.I(function02) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i4 = iA & 48;
        Modifier modifier = this.i;
        if (i4 == 0) {
            i |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = iA & KyberEngine.KyberPolyBytes;
        Shape shape2 = this.j;
        if (i5 == 0) {
            i |= composerImplV.n(shape2) ? 256 : 128;
        }
        int i6 = iA & 3072;
        long j3 = this.k;
        if (i6 == 0) {
            i |= composerImplV.s(j3) ? 2048 : 1024;
        }
        int i7 = iA & 24576;
        final long j4 = this.l;
        if (i7 == 0) {
            i |= composerImplV.s(j4) ? 16384 : 8192;
        }
        int i8 = 196608 & iA;
        FloatingActionButtonElevation floatingActionButtonElevation = this.m;
        if (i8 == 0) {
            i |= composerImplV.n(floatingActionButtonElevation) ? 131072 : 65536;
        }
        int i9 = 1572864 & iA;
        MutableInteractionSource mutableInteractionSource2 = this.n;
        if (i9 == 0) {
            i |= composerImplV.n(mutableInteractionSource2) ? 1048576 : 524288;
        }
        int i10 = 12582912 & iA;
        final ComposableLambdaImpl composableLambdaImpl = this.o;
        if (i10 == 0) {
            i |= composerImplV.I(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if ((4793491 & i) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            function0 = function02;
            shape = shape2;
            j = j3;
            j2 = j4;
        } else {
            composerImplV.u0();
            if ((iA & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            composerImplV.o(519755085);
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (mutableInteractionSource2 == null) {
                Object objG = composerImplV.G();
                if (objG == composer$Companion$Empty$1) {
                    objG = InteractionSourceKt.a();
                    composerImplV.A(objG);
                }
                mutableInteractionSource = (MutableInteractionSource) objG;
            } else {
                mutableInteractionSource = mutableInteractionSource2;
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifier, false, FloatingActionButtonKt$FloatingActionButton$1.h);
            floatingActionButtonElevation.getClass();
            int i11 = i >> 12;
            int i12 = i11 & 112;
            boolean zN = composerImplV.n(mutableInteractionSource);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                i2 = i11;
                objG2 = new FloatingActionButtonElevationAnimatable(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                composerImplV.A(objG2);
            } else {
                i2 = i11;
            }
            FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = (FloatingActionButtonElevationAnimatable) objG2;
            int i13 = i12 ^ 48;
            int i14 = i;
            boolean zI = composerImplV.I(floatingActionButtonElevationAnimatable) | ((i13 > 32 && composerImplV.n(floatingActionButtonElevation)) || (i2 & 48) == 32);
            Object objG3 = composerImplV.G();
            if (zI || objG3 == composer$Companion$Empty$1) {
                objG3 = new FloatingActionButtonElevation$animateElevation$1$1(floatingActionButtonElevationAnimatable, floatingActionButtonElevation, null);
                composerImplV.A(objG3);
            }
            EffectsKt.e(composerImplV, floatingActionButtonElevation, (Function2) objG3);
            boolean zN2 = composerImplV.n(mutableInteractionSource) | composerImplV.I(floatingActionButtonElevationAnimatable);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == composer$Companion$Empty$1) {
                objG4 = new FloatingActionButtonElevation$animateElevation$2$1(mutableInteractionSource, floatingActionButtonElevationAnimatable, null);
                composerImplV.A(objG4);
            }
            EffectsKt.e(composerImplV, mutableInteractionSource, (Function2) objG4);
            int i15 = i14 << 3;
            int i16 = (i14 & 14) | (i15 & 7168) | (57344 & i15) | (i15 & 458752);
            composerImpl = composerImplV;
            function0 = function02;
            shape = shape2;
            j = j3;
            j2 = j4;
            SurfaceKt.c(function0, modifierB, false, shape, j, j2, BitmapDescriptorFactory.HUE_RED, ((Dp) ((SnapshotMutableStateImpl) floatingActionButtonElevationAnimatable.e.c.e).getD()).d, null, mutableInteractionSource, ComposableLambdaKt.c(1249316354, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        TextStyle textStyleA = TypographyKt.a(ExtendedFabPrimaryTokens.f1578a, composer);
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        ProvideContentColorTextStyleKt.a(j4, textStyleA, ComposableLambdaKt.c(-1771489750, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.FloatingActionButtonKt$FloatingActionButton$2.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer2 = (Composer) obj5;
                                if ((((Number) obj6).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Modifier modifierA = SizeKt.a(Modifier.Companion.d, FabPrimaryTokens.b, FabPrimaryTokens.f1580a);
                                    MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                                    int p = composer2.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function03 = ComposeUiNode.Companion.b;
                                    if (composer2.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer2.i();
                                    if (composer2.getO()) {
                                        composer2.K(function03);
                                    } else {
                                        composer2.e();
                                    }
                                    Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                    Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                        androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                    }
                                    Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                    android.support.v4.media.session.a.x(0, composer2, composableLambdaImpl2);
                                }
                                return Unit.f24250a;
                            }
                        }, composer), composer, KyberEngine.KyberPolyBytes);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, i16, 260);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new FloatingActionButtonKt$FloatingActionButton$3(function0, modifier, shape, j, j2, floatingActionButtonElevation, mutableInteractionSource2, composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
