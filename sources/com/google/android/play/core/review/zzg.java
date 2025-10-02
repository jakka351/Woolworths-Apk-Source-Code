package com.google.android.play.core.review;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzt;

/* loaded from: classes6.dex */
class zzg extends com.google.android.play.core.review.internal.zzg {
    public final com.google.android.play.core.review.internal.zzi d;
    public final TaskCompletionSource e;
    public final /* synthetic */ zzi f;

    public zzg(zzi zziVar, com.google.android.play.core.review.internal.zzi zziVar2, TaskCompletionSource taskCompletionSource) {
        this.f = zziVar;
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
        this.d = zziVar2;
        this.e = taskCompletionSource;
    }

    @Override // com.google.android.play.core.review.internal.zzh
    public void zzb(Bundle bundle) {
        zzt zztVar = this.f.f14767a;
        if (zztVar != null) {
            zztVar.d(this.e);
        }
        this.d.a("onGetLaunchReviewFlowInfo", new Object[0]);
    }
}
