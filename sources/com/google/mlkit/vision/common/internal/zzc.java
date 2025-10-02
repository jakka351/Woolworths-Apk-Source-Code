package com.google.mlkit.vision.common.internal;

import com.google.android.gms.tasks.OnFailureListener;

/* loaded from: classes6.dex */
public final /* synthetic */ class zzc implements OnFailureListener {
    public static final /* synthetic */ zzc d = new zzc();

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        MobileVisionBase.h.e("MobileVisionBase", "Error preloading model resource", exc);
    }
}
