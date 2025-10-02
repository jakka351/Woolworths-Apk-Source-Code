package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/CardElevation;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CardElevation {

    /* renamed from: a, reason: collision with root package name */
    public final float f1407a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public CardElevation(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f1407a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final State a(boolean z, MutableInteractionSource mutableInteractionSource, Composer composer, int i) {
        Animatable animatable;
        composer.o(-1763481333);
        composer.o(-734838460);
        float f = this.f1407a;
        Object obj = Composer.Companion.f1624a;
        if (mutableInteractionSource == null) {
            Object objG = composer.G();
            if (objG == obj) {
                objG = SnapshotStateKt.f(new Dp(f));
                composer.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            composer.l();
            composer.l();
            return mutableState;
        }
        composer.l();
        Object objG2 = composer.G();
        if (objG2 == obj) {
            objG2 = new SnapshotStateList();
            composer.A(objG2);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objG2;
        boolean z2 = true;
        boolean z3 = (((i & 112) ^ 48) > 32 && composer.n(mutableInteractionSource)) || (i & 48) == 32;
        Object objG3 = composer.G();
        if (z3 || objG3 == obj) {
            objG3 = new CardElevation$animateElevation$1$1(mutableInteractionSource, snapshotStateList, null);
            composer.A(objG3);
        }
        EffectsKt.e(composer, mutableInteractionSource, (Function2) objG3);
        Interaction interaction = (Interaction) CollectionsKt.P(snapshotStateList);
        if (!z) {
            f = this.f;
        } else if (interaction instanceof PressInteraction.Press) {
            f = this.b;
        } else if (interaction instanceof HoverInteraction.Enter) {
            f = this.d;
        } else if (interaction instanceof FocusInteraction.Focus) {
            f = this.c;
        } else if (interaction instanceof DragInteraction.Start) {
            f = this.e;
        }
        Object objG4 = composer.G();
        if (objG4 == obj) {
            objG4 = new Animatable(new Dp(f), VectorConvertersKt.c, (Object) null, 12);
            composer.A(objG4);
        }
        Animatable animatable2 = (Animatable) objG4;
        Dp dp = new Dp(f);
        boolean zI = composer.I(animatable2) | composer.q(f) | ((((i & 14) ^ 6) > 4 && composer.p(z)) || (i & 6) == 4);
        if ((((i & 896) ^ KyberEngine.KyberPolyBytes) <= 256 || !composer.n(this)) && (i & KyberEngine.KyberPolyBytes) != 256) {
            z2 = false;
        }
        boolean zI2 = zI | z2 | composer.I(interaction);
        Object objG5 = composer.G();
        if (zI2 || objG5 == obj) {
            animatable = animatable2;
            Object cardElevation$animateElevation$2$1 = new CardElevation$animateElevation$2$1(animatable, f, z, this, interaction, null);
            composer.A(cardElevation$animateElevation$2$1);
            objG5 = cardElevation$animateElevation$2$1;
        } else {
            animatable = animatable2;
        }
        EffectsKt.e(composer, dp, (Function2) objG5);
        AnimationState animationState = animatable.c;
        composer.l();
        return animationState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CardElevation)) {
            return false;
        }
        CardElevation cardElevation = (CardElevation) obj;
        return Dp.a(this.f1407a, cardElevation.f1407a) && Dp.a(this.b, cardElevation.b) && Dp.a(this.c, cardElevation.c) && Dp.a(this.d, cardElevation.d) && Dp.a(this.f, cardElevation.f);
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + android.support.v4.media.session.a.b(this.d, android.support.v4.media.session.a.b(this.c, android.support.v4.media.session.a.b(this.b, Float.hashCode(this.f1407a) * 31, 31), 31), 31);
    }
}
