package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChipKt$Chip$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ TextStyle l;
    public final /* synthetic */ long m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ Shape p;
    public final /* synthetic */ ChipColors q;
    public final /* synthetic */ ChipElevation r;
    public final /* synthetic */ BorderStroke s;
    public final /* synthetic */ float t;
    public final /* synthetic */ PaddingValues u;
    public final /* synthetic */ MutableInteractionSource v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$Chip$3(Modifier modifier, Function0 function0, boolean z, Function2 function2, TextStyle textStyle, long j, Function2 function22, Function2 function23, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        super(2);
        this.h = modifier;
        this.i = function0;
        this.j = z;
        this.k = function2;
        this.l = textStyle;
        this.m = j;
        this.n = function22;
        this.o = function23;
        this.p = shape;
        this.q = chipColors;
        this.r = chipElevation;
        this.s = borderStroke;
        this.t = f;
        this.u = paddingValues;
        this.v = mutableInteractionSource;
        this.w = i;
        this.x = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v24 */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        int i3;
        MutableInteractionSource mutableInteractionSource;
        Modifier modifier;
        int i4;
        Function2 function2;
        int i5;
        int i6;
        Modifier modifier2;
        boolean z;
        Object chipElevation$animateElevation$2$1;
        PaddingValues paddingValues;
        final ChipColors chipColors;
        MutableInteractionSource mutableInteractionSource2;
        boolean z2;
        Animatable animatable;
        BorderStroke borderStroke;
        AnimationState animationState;
        ?? r5;
        TextStyle textStyle;
        ChipColors chipColors2;
        PaddingValues paddingValues2;
        ComposerImpl composerImpl;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke2;
        boolean z3;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.w | 1);
        int iA2 = RecomposeScopeImplKt.a(this.x);
        float f = ChipKt.f1411a;
        ComposerImpl composerImplV = ((Composer) obj).v(1400504719);
        int i7 = iA & 6;
        Modifier modifier3 = this.h;
        if (i7 == 0) {
            i = (composerImplV.n(modifier3) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i8 = iA & 48;
        int i9 = i;
        Function0 function0 = this.i;
        if (i8 == 0) {
            i2 = (composerImplV.I(function0) ? 32 : 16) | i9;
        } else {
            i2 = i9;
        }
        int i10 = iA & KyberEngine.KyberPolyBytes;
        boolean z4 = this.j;
        if (i10 == 0) {
            i2 |= composerImplV.p(z4) ? 256 : 128;
        }
        int i11 = iA & 3072;
        Function2 function22 = this.k;
        if (i11 == 0) {
            i2 |= composerImplV.I(function22) ? 2048 : 1024;
        }
        int i12 = iA & 24576;
        final TextStyle textStyle2 = this.l;
        if (i12 == 0) {
            i2 |= composerImplV.n(textStyle2) ? 16384 : 8192;
        }
        int i13 = 196608 & iA;
        final long j = this.m;
        if (i13 == 0) {
            i2 |= composerImplV.s(j) ? 131072 : 65536;
        }
        int i14 = 1572864 & iA;
        Function2 function23 = this.n;
        if (i14 == 0) {
            i2 |= composerImplV.I(function23) ? 1048576 : 524288;
        }
        int i15 = 12582912 & iA;
        final Function2 function24 = function23;
        final Function2 function25 = this.o;
        if (i15 == 0) {
            i2 |= composerImplV.I(function25) ? 8388608 : 4194304;
        }
        int i16 = 100663296 & iA;
        int i17 = i2;
        Shape shape = this.p;
        if (i16 == 0) {
            i17 |= composerImplV.n(shape) ? 67108864 : 33554432;
        }
        int i18 = 805306368 & iA;
        ChipColors chipColors3 = this.q;
        if (i18 == 0) {
            i17 |= composerImplV.n(chipColors3) ? 536870912 : 268435456;
        }
        int i19 = i17;
        int i20 = iA2 & 6;
        ChipElevation chipElevation = this.r;
        if (i20 == 0) {
            i3 = (composerImplV.n(chipElevation) ? 4 : 2) | iA2;
        } else {
            i3 = iA2;
        }
        int i21 = iA2 & 48;
        BorderStroke borderStroke3 = this.s;
        if (i21 == 0) {
            i3 |= composerImplV.n(borderStroke3) ? 32 : 16;
        }
        int i22 = iA2 & KyberEngine.KyberPolyBytes;
        final float f2 = this.t;
        if (i22 == 0) {
            i3 |= composerImplV.q(f2) ? 256 : 128;
        }
        int i23 = iA2 & 3072;
        PaddingValues paddingValues3 = this.u;
        if (i23 == 0) {
            i3 |= composerImplV.n(paddingValues3) ? 2048 : 1024;
        }
        int i24 = iA2 & 24576;
        MutableInteractionSource mutableInteractionSource4 = this.v;
        if (i24 == 0) {
            i3 |= composerImplV.n(mutableInteractionSource4) ? 16384 : 8192;
        }
        if ((306783379 & i19) == 306783378 && (i3 & 9363) == 9362 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            i4 = iA;
            function2 = function22;
            i6 = iA2;
            modifier2 = modifier3;
            textStyle = textStyle2;
            mutableInteractionSource3 = mutableInteractionSource4;
            z3 = z4;
            paddingValues2 = paddingValues3;
            borderStroke2 = borderStroke3;
            chipColors2 = chipColors3;
        } else {
            composerImplV.o(1985614987);
            Object obj3 = Composer.Companion.f1624a;
            if (mutableInteractionSource4 == null) {
                Object objG = composerImplV.G();
                if (objG == obj3) {
                    objG = InteractionSourceKt.a();
                    composerImplV.A(objG);
                }
                mutableInteractionSource = (MutableInteractionSource) objG;
            } else {
                mutableInteractionSource = mutableInteractionSource4;
            }
            composerImplV.V(false);
            Modifier modifierB = SemanticsModifierKt.b(modifier3, false, ChipKt$Chip$1.h);
            composerImplV.o(1985624506);
            if (chipElevation == null) {
                chipColors = chipColors3;
                modifier = modifierB;
                i4 = iA;
                function2 = function22;
                i6 = iA2;
                modifier2 = modifier3;
                z = z4;
                mutableInteractionSource2 = mutableInteractionSource;
                paddingValues = paddingValues3;
                borderStroke = borderStroke3;
                r5 = 0;
                animationState = null;
            } else {
                int i25 = ((i19 >> 6) & 14) | ((i3 << 6) & 896);
                modifier = modifierB;
                Object objG2 = composerImplV.G();
                if (objG2 == obj3) {
                    objG2 = new SnapshotStateList();
                    composerImplV.A(objG2);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objG2;
                i4 = iA;
                Object objG3 = composerImplV.G();
                if (objG3 == obj3) {
                    objG3 = SnapshotStateKt.f(null);
                    composerImplV.A(objG3);
                }
                MutableState mutableState = (MutableState) objG3;
                boolean zN = composerImplV.n(mutableInteractionSource);
                Object objG4 = composerImplV.G();
                if (zN || objG4 == obj3) {
                    function2 = function22;
                    objG4 = new ChipElevation$animateElevation$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerImplV.A(objG4);
                } else {
                    function2 = function22;
                }
                EffectsKt.e(composerImplV, mutableInteractionSource, (Function2) objG4);
                Interaction interaction = (Interaction) CollectionsKt.P(snapshotStateList);
                Object objG5 = composerImplV.G();
                if (objG5 == obj3) {
                    i5 = i25;
                    i6 = iA2;
                    modifier2 = modifier3;
                    objG5 = new Animatable(new Dp(BitmapDescriptorFactory.HUE_RED), VectorConvertersKt.c, (Object) null, 12);
                    composerImplV.A(objG5);
                } else {
                    i5 = i25;
                    i6 = iA2;
                    modifier2 = modifier3;
                }
                Animatable animatable2 = (Animatable) objG5;
                Dp dp = new Dp(BitmapDescriptorFactory.HUE_RED);
                boolean zI = composerImplV.I(animatable2) | composerImplV.q(BitmapDescriptorFactory.HUE_RED) | ((((i5 & 14) ^ 6) > 4 && composerImplV.p(z4)) || (i5 & 6) == 4) | composerImplV.I(interaction);
                Object objG6 = composerImplV.G();
                if (zI || objG6 == obj3) {
                    z = z4;
                    paddingValues = paddingValues3;
                    chipColors = chipColors3;
                    mutableInteractionSource2 = mutableInteractionSource;
                    z2 = false;
                    animatable = animatable2;
                    borderStroke = borderStroke3;
                    chipElevation$animateElevation$2$1 = new ChipElevation$animateElevation$2$1(animatable, BitmapDescriptorFactory.HUE_RED, z, interaction, mutableState, null);
                    composerImplV.A(chipElevation$animateElevation$2$1);
                } else {
                    chipColors = chipColors3;
                    z = z4;
                    mutableInteractionSource2 = mutableInteractionSource;
                    paddingValues = paddingValues3;
                    animatable = animatable2;
                    chipElevation$animateElevation$2$1 = objG6;
                    borderStroke = borderStroke3;
                    z2 = false;
                }
                EffectsKt.e(composerImplV, dp, (Function2) chipElevation$animateElevation$2$1);
                animationState = animatable.c;
                r5 = z2;
            }
            composerImplV.V(r5);
            float f3 = animationState != null ? ((Dp) ((SnapshotMutableStateImpl) animationState.e).getD()).d : (float) r5;
            final boolean z5 = z;
            final Function2 function26 = function2;
            final PaddingValues paddingValues4 = paddingValues;
            Function2<Composer, Integer, Unit> function27 = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$Chip$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    Composer composer = (Composer) obj4;
                    if ((((Number) obj5).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        ChipKt.a(function26, textStyle2, j, function24, null, function25, 0L, 0L, f2, paddingValues4, composer, 24576);
                    }
                    return Unit.f24250a;
                }
            };
            textStyle = textStyle2;
            chipColors2 = chipColors;
            paddingValues2 = paddingValues4;
            function24 = function24;
            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
            composerImpl = composerImplV;
            mutableInteractionSource3 = mutableInteractionSource4;
            BorderStroke borderStroke4 = borderStroke;
            SurfaceKt.c(function0, modifier, z5, shape, 0L, 0L, BitmapDescriptorFactory.HUE_RED, f3, borderStroke4, mutableInteractionSource5, ComposableLambdaKt.c(-1985962652, function27, composerImplV), composerImpl, ((i19 >> 3) & 14) | (i19 & 896) | ((i19 >> 15) & 7168) | ((i3 << 21) & 234881024), 96);
            borderStroke2 = borderStroke4;
            z3 = z5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ChipKt$Chip$3(modifier2, function0, z3, function2, textStyle, j, function24, function25, shape, chipColors2, chipElevation, borderStroke2, f2, paddingValues2, mutableInteractionSource3, i4, i6);
        }
        return Unit.f24250a;
    }
}
