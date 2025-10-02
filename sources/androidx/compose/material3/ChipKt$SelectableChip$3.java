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
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ChipKt$SelectableChip$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ TextStyle m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ Function2 p;
    public final /* synthetic */ Shape q;
    public final /* synthetic */ SelectableChipColors r;
    public final /* synthetic */ SelectableChipElevation s;
    public final /* synthetic */ BorderStroke t;
    public final /* synthetic */ float u;
    public final /* synthetic */ PaddingValues v;
    public final /* synthetic */ MutableInteractionSource w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChipKt$SelectableChip$3(boolean z, Modifier modifier, Function0 function0, boolean z2, Function2 function2, TextStyle textStyle, Function2 function22, Function2 function23, Function2 function24, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, float f, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        super(2);
        this.h = z;
        this.i = modifier;
        this.j = function0;
        this.k = z2;
        this.l = function2;
        this.m = textStyle;
        this.n = function22;
        this.o = function23;
        this.p = function24;
        this.q = shape;
        this.r = selectableChipColors;
        this.s = selectableChipElevation;
        this.t = borderStroke;
        this.u = f;
        this.v = paddingValues;
        this.w = mutableInteractionSource;
        this.x = i;
        this.y = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        MutableInteractionSource mutableInteractionSource;
        MutableInteractionSource mutableInteractionSource2;
        int i3;
        Modifier modifier;
        boolean z;
        SelectableChipColors selectableChipColors;
        Shape shape;
        MutableInteractionSource mutableInteractionSource3;
        boolean z2;
        AnimationState animationState;
        Modifier modifier2;
        TextStyle textStyle;
        Function2 function2;
        Function2 function22;
        Function2 function23;
        float f;
        PaddingValues paddingValues;
        Function0 function0;
        BorderStroke borderStroke;
        ComposerImpl composerImpl;
        boolean z3;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.x | 1);
        int iA2 = RecomposeScopeImplKt.a(this.y);
        float f2 = ChipKt.f1411a;
        ComposerImpl composerImplV = ((Composer) obj).v(402951308);
        int i4 = iA & 6;
        boolean z4 = this.h;
        if (i4 == 0) {
            i = (composerImplV.p(z4) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i5 = iA & 48;
        Modifier modifier3 = this.i;
        if (i5 == 0) {
            i |= composerImplV.n(modifier3) ? 32 : 16;
        }
        int i6 = iA & KyberEngine.KyberPolyBytes;
        Function0 function02 = this.j;
        if (i6 == 0) {
            i |= composerImplV.I(function02) ? 256 : 128;
        }
        int i7 = iA & 3072;
        boolean z5 = this.k;
        if (i7 == 0) {
            i |= composerImplV.p(z5) ? 2048 : 1024;
        }
        int i8 = iA & 24576;
        final Function2 function24 = this.l;
        if (i8 == 0) {
            i |= composerImplV.I(function24) ? 16384 : 8192;
        }
        int i9 = iA & 196608;
        int i10 = 16;
        final TextStyle textStyle2 = this.m;
        if (i9 == 0) {
            i |= composerImplV.n(textStyle2) ? 131072 : 65536;
        }
        int i11 = iA & 1572864;
        final Function2 function25 = this.n;
        if (i11 == 0) {
            i |= composerImplV.I(function25) ? 1048576 : 524288;
        }
        int i12 = iA & 12582912;
        final Function2 function26 = this.o;
        if (i12 == 0) {
            i |= composerImplV.I(function26) ? 8388608 : 4194304;
        }
        int i13 = iA & 100663296;
        final Function2 function27 = this.p;
        if (i13 == 0) {
            i |= composerImplV.I(function27) ? 67108864 : 33554432;
        }
        int i14 = iA & 805306368;
        Shape shape2 = this.q;
        if (i14 == 0) {
            i |= composerImplV.n(shape2) ? 536870912 : 268435456;
        }
        int i15 = iA2 & 6;
        SelectableChipColors selectableChipColors2 = this.r;
        if (i15 == 0) {
            i2 = iA2 | (composerImplV.n(selectableChipColors2) ? 4 : 2);
        } else {
            i2 = iA2;
        }
        int i16 = iA2 & 48;
        SelectableChipElevation selectableChipElevation = this.s;
        if (i16 == 0) {
            if (composerImplV.n(selectableChipElevation)) {
                i10 = 32;
            }
            i2 |= i10;
        }
        int i17 = iA2 & KyberEngine.KyberPolyBytes;
        BorderStroke borderStroke2 = this.t;
        if (i17 == 0) {
            i2 |= composerImplV.n(borderStroke2) ? 256 : 128;
        }
        int i18 = iA2 & 3072;
        final float f3 = this.u;
        if (i18 == 0) {
            i2 |= composerImplV.q(f3) ? 2048 : 1024;
        }
        int i19 = iA2 & 24576;
        final PaddingValues paddingValues2 = this.v;
        if (i19 == 0) {
            i2 |= composerImplV.n(paddingValues2) ? 16384 : 8192;
        }
        int i20 = iA2 & 196608;
        MutableInteractionSource mutableInteractionSource4 = this.w;
        if (i20 == 0) {
            i2 |= composerImplV.n(mutableInteractionSource4) ? 131072 : 65536;
        }
        int i21 = i2;
        if ((306783379 & i) == 306783378 && (i21 & 74899) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            mutableInteractionSource2 = mutableInteractionSource4;
            i3 = iA2;
            selectableChipColors = selectableChipColors2;
            shape = shape2;
            modifier2 = modifier3;
            function2 = function25;
            function22 = function26;
            function23 = function27;
            function0 = function02;
            borderStroke = borderStroke2;
            paddingValues = paddingValues2;
            z3 = z5;
            textStyle = textStyle2;
            f = f3;
            z = z4;
        } else {
            composerImplV.o(2072749057);
            Object obj3 = Composer.Companion.f1624a;
            if (mutableInteractionSource4 == null) {
                Object objG = composerImplV.G();
                if (objG == obj3) {
                    objG = InteractionSourceKt.a();
                    composerImplV.A(objG);
                }
                mutableInteractionSource = (MutableInteractionSource) objG;
                mutableInteractionSource2 = mutableInteractionSource4;
            } else {
                mutableInteractionSource = mutableInteractionSource4;
                mutableInteractionSource2 = mutableInteractionSource;
            }
            composerImplV.V(false);
            i3 = iA2;
            Modifier modifierB = SemanticsModifierKt.b(modifier3, false, ChipKt$SelectableChip$1.h);
            if (z5 && !z4) {
                selectableChipColors2.getClass();
            } else {
                selectableChipColors2.getClass();
            }
            composerImplV.o(2072762384);
            if (selectableChipElevation == null) {
                z2 = z5;
                modifier = modifierB;
                z = z4;
                selectableChipColors = selectableChipColors2;
                shape = shape2;
                mutableInteractionSource3 = mutableInteractionSource;
                animationState = null;
            } else {
                int i22 = ((i >> 9) & 14) | ((i21 << 3) & 896);
                Object objG2 = composerImplV.G();
                if (objG2 == obj3) {
                    objG2 = new SnapshotStateList();
                    composerImplV.A(objG2);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objG2;
                modifier = modifierB;
                Object objG3 = composerImplV.G();
                if (objG3 == obj3) {
                    objG3 = SnapshotStateKt.f(null);
                    composerImplV.A(objG3);
                }
                MutableState mutableState = (MutableState) objG3;
                boolean zN = composerImplV.n(mutableInteractionSource);
                Object objG4 = composerImplV.G();
                if (zN || objG4 == obj3) {
                    z = z4;
                    objG4 = new SelectableChipElevation$animateElevation$1$1(mutableInteractionSource, snapshotStateList, null);
                    composerImplV.A(objG4);
                } else {
                    z = z4;
                }
                EffectsKt.e(composerImplV, mutableInteractionSource, (Function2) objG4);
                Interaction interaction = (Interaction) CollectionsKt.P(snapshotStateList);
                Object objG5 = composerImplV.G();
                if (objG5 == obj3) {
                    selectableChipColors = selectableChipColors2;
                    shape = shape2;
                    mutableInteractionSource3 = mutableInteractionSource;
                    objG5 = new Animatable(new Dp(BitmapDescriptorFactory.HUE_RED), VectorConvertersKt.c, (Object) null, 12);
                    composerImplV.A(objG5);
                } else {
                    selectableChipColors = selectableChipColors2;
                    shape = shape2;
                    mutableInteractionSource3 = mutableInteractionSource;
                }
                Animatable animatable = (Animatable) objG5;
                Dp dp = new Dp(BitmapDescriptorFactory.HUE_RED);
                boolean zI = ((((i22 & 14) ^ 6) > 4 && composerImplV.p(z5)) || (i22 & 6) == 4) | composerImplV.I(animatable) | composerImplV.q(BitmapDescriptorFactory.HUE_RED) | composerImplV.I(interaction);
                Object objG6 = composerImplV.G();
                if (zI || objG6 == obj3) {
                    z2 = z5;
                    objG6 = new SelectableChipElevation$animateElevation$2$1(animatable, BitmapDescriptorFactory.HUE_RED, z2, interaction, mutableState, null);
                    composerImplV.A(objG6);
                } else {
                    z2 = z5;
                }
                EffectsKt.e(composerImplV, dp, (Function2) objG6);
                animationState = animatable.c;
            }
            composerImplV.V(false);
            float f4 = animationState != null ? ((Dp) ((SnapshotMutableStateImpl) animationState.e).getD()).d : 0;
            modifier2 = modifier3;
            final boolean z6 = z2;
            final boolean z7 = z;
            final SelectableChipColors selectableChipColors3 = selectableChipColors;
            textStyle = textStyle2;
            function2 = function25;
            function22 = function26;
            function23 = function27;
            f = f3;
            paddingValues = paddingValues2;
            boolean z8 = z2;
            function0 = function02;
            borderStroke = borderStroke2;
            composerImpl = composerImplV;
            SurfaceKt.b(z, function0, modifier, z8, shape, 0L, 0L, f4, borderStroke, mutableInteractionSource3, ComposableLambdaKt.c(-577614814, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ChipKt$SelectableChip$2
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
                        SelectableChipColors selectableChipColors4 = selectableChipColors3;
                        boolean z9 = z6;
                        boolean z10 = z7;
                        if (z9 && !z10) {
                            selectableChipColors4.getClass();
                        } else {
                            selectableChipColors4.getClass();
                        }
                        if (z9 && !z10) {
                            selectableChipColors4.getClass();
                        } else {
                            selectableChipColors4.getClass();
                        }
                        if (z9 && !z10) {
                            selectableChipColors4.getClass();
                        } else {
                            selectableChipColors4.getClass();
                        }
                        ChipKt.a(function24, textStyle2, 0L, function25, function26, function27, 0L, 0L, f3, paddingValues2, composer, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i >> 15) & 57344) | (i & 14) | ((i >> 3) & 112) | (i & 7168) | ((i21 << 21) & 1879048192), BERTags.PRIVATE);
            z3 = z8;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ChipKt$SelectableChip$3(z, modifier2, function0, z3, function24, textStyle, function2, function22, function23, shape, selectableChipColors, selectableChipElevation, borderStroke, f, paddingValues, mutableInteractionSource2, iA, i3);
        }
        return Unit.f24250a;
    }
}
