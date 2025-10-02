package com.google.android.gms.ads.internal.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzr extends AnimatorListenerAdapter {
    final /* synthetic */ zzt zza;

    public zzr(zzt zztVar) {
        Objects.requireNonNull(zztVar);
        this.zza = zztVar;
    }

    private final void zza(boolean z) {
        zzt zztVar = this.zza;
        zztVar.setEnabled(z);
        zztVar.zzb().setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        zza(false);
    }
}
