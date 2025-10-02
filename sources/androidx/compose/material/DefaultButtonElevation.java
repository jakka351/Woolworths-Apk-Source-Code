package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Stable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/DefaultButtonElevation;", "Landroidx/compose/material/ButtonElevation;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DefaultButtonElevation implements ButtonElevation {

    /* renamed from: a, reason: collision with root package name */
    public final float f1263a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public DefaultButtonElevation(float f, float f2, float f3, float f4, float f5) {
        this.f1263a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
    }

    @Override // androidx.compose.material.ButtonElevation
    public final AnimationState a(boolean z, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        Animatable animatable;
        composer.o(-1588756907);
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (objG == obj) {
            objG = new SnapshotStateList();
            composer.A(objG);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objG;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.n(mutableInteractionSource)) || (i & 48) == 32;
        Object objG2 = composer.G();
        if (z3 || objG2 == obj) {
            objG2 = new DefaultButtonElevation$elevation$1$1(mutableInteractionSource, snapshotStateList, null);
            composer.A(objG2);
        }
        EffectsKt.e(composer, mutableInteractionSource, (Function2) objG2);
        Interaction interaction = (Interaction) CollectionsKt.P(snapshotStateList);
        float f = !z ? this.c : interaction instanceof PressInteraction.Press ? this.b : interaction instanceof HoverInteraction.Enter ? this.d : interaction instanceof FocusInteraction.Focus ? this.e : this.f1263a;
        Object objG3 = composer.G();
        if (objG3 == obj) {
            objG3 = new Animatable(new Dp(f), VectorConvertersKt.c, (Object) null, 12);
            composer.A(objG3);
        }
        Animatable animatable2 = (Animatable) objG3;
        Dp dp = new Dp(f);
        boolean zI = composer.I(animatable2) | composer.q(f) | ((((i & 14) ^ 6) > 4 && composer.p(z)) || (i & 6) == 4);
        if ((((i & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !composer.n(this)) && (i & KyberEngine.KyberPolyBytes) != 256) {
            z2 = false;
        }
        boolean zI2 = zI | z2 | composer.I(interaction);
        Object objG4 = composer.G();
        if (zI2 || objG4 == obj) {
            animatable = animatable2;
            Object defaultButtonElevation$elevation$2$1 = new DefaultButtonElevation$elevation$2$1(animatable, f, z, this, interaction, null);
            composer.A(defaultButtonElevation$elevation$2$1);
            objG4 = defaultButtonElevation$elevation$2$1;
        } else {
            animatable = animatable2;
        }
        EffectsKt.e(composer, dp, (Function2) objG4);
        AnimationState animationState = animatable.c;
        composer.l();
        return animationState;
    }
}
