package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;

/* loaded from: classes6.dex */
final class zzh extends zzg {
    @Override // com.google.android.play.core.review.zzg, com.google.android.play.core.review.internal.zzh
    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        this.e.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
