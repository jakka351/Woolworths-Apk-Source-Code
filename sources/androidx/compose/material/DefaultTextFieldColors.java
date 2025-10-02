package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Immutable
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material/DefaultTextFieldColors;", "Landroidx/compose/material/TextFieldColors;", "", "focused", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class DefaultTextFieldColors implements TextFieldColors {

    /* renamed from: a, reason: collision with root package name */
    public final long f1273a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final long p;
    public final long q;
    public final long r;
    public final long s;
    public final long t;
    public final long u;

    public DefaultTextFieldColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21) {
        this.f1273a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
        this.f = j6;
        this.g = j7;
        this.h = j8;
        this.i = j9;
        this.j = j10;
        this.k = j11;
        this.l = j12;
        this.m = j13;
        this.n = j14;
        this.o = j15;
        this.p = j16;
        this.q = j17;
        this.r = j18;
        this.s = j19;
        this.t = j20;
        this.u = j21;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState a(boolean z, boolean z2, Composer composer) {
        composer.o(1016171324);
        return a.h(!z ? this.j : z2 ? this.k : this.i, composer);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState b(boolean z, boolean z2, InteractionSource interactionSource, Composer composer) {
        composer.o(727091888);
        return a.h(!z ? this.r : z2 ? this.s : ((Boolean) FocusInteractionKt.a(interactionSource, composer, 0).getD()).booleanValue() ? this.p : this.q, composer);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final State c(boolean z, boolean z2, InteractionSource interactionSource, Composer composer, int i) {
        Composer composer2;
        State stateL;
        composer.o(998675979);
        long j = !z ? this.h : z2 ? this.g : ((Boolean) FocusInteractionKt.a(interactionSource, composer, (i >> 6) & 14).getD()).booleanValue() ? this.e : this.f;
        if (z) {
            composer.o(1614254271);
            composer2 = composer;
            stateL = SingleValueAnimationKt.b(j, AnimationSpecKt.e(150, 0, null, 6), null, composer2, 48, 12);
            composer2.l();
        } else {
            composer2 = composer;
            composer2.o(1614357129);
            stateL = SnapshotStateKt.l(new Color(j), composer2);
            composer2.l();
        }
        composer2.l();
        return stateL;
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState d(boolean z, Composer composer) {
        composer.o(9804418);
        return a.h(z ? this.f1273a : this.b, composer);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState e(boolean z, Composer composer) {
        composer.o(264799724);
        return a.h(z ? this.t : this.u, composer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DefaultTextFieldColors.class != obj.getClass()) {
            return false;
        }
        DefaultTextFieldColors defaultTextFieldColors = (DefaultTextFieldColors) obj;
        return Color.c(this.f1273a, defaultTextFieldColors.f1273a) && Color.c(this.b, defaultTextFieldColors.b) && Color.c(this.c, defaultTextFieldColors.c) && Color.c(this.d, defaultTextFieldColors.d) && Color.c(this.e, defaultTextFieldColors.e) && Color.c(this.f, defaultTextFieldColors.f) && Color.c(this.g, defaultTextFieldColors.g) && Color.c(this.h, defaultTextFieldColors.h) && Color.c(this.i, defaultTextFieldColors.i) && Color.c(this.j, defaultTextFieldColors.j) && Color.c(this.k, defaultTextFieldColors.k) && Color.c(this.l, defaultTextFieldColors.l) && Color.c(this.m, defaultTextFieldColors.m) && Color.c(this.n, defaultTextFieldColors.n) && Color.c(this.o, defaultTextFieldColors.o) && Color.c(this.p, defaultTextFieldColors.p) && Color.c(this.q, defaultTextFieldColors.q) && Color.c(this.r, defaultTextFieldColors.r) && Color.c(this.s, defaultTextFieldColors.s) && Color.c(this.t, defaultTextFieldColors.t) && Color.c(this.u, defaultTextFieldColors.u);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final State f(boolean z, boolean z2, InteractionSource interactionSource, Composer composer) {
        composer.o(1383318157);
        return a.h(!z ? this.m : z2 ? this.n : this.l, composer);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState g(Composer composer) {
        composer.o(-1423938813);
        return a.h(this.o, composer);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState h(boolean z, boolean z2, Composer composer) {
        composer.o(225259054);
        return a.h(!z ? this.m : z2 ? this.n : this.l, composer);
    }

    public final int hashCode() {
        int i = Color.l;
        return Long.hashCode(this.u) + b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(b.b(Long.hashCode(this.f1273a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t);
    }

    @Override // androidx.compose.material.TextFieldColors
    public final MutableState i(boolean z, Composer composer) {
        composer.o(-1446422485);
        return a.h(z ? this.d : this.c, composer);
    }

    @Override // androidx.compose.material.TextFieldColors
    /* renamed from: a, reason: collision with other method in class */
    public final State mo1a(boolean z, boolean z2, Composer composer) {
        long j;
        composer.o(-1519634405);
        if (!z) {
            j = this.j;
        } else if (z2) {
            j = this.k;
        } else {
            j = this.i;
        }
        return a.h(j, composer);
    }
}
