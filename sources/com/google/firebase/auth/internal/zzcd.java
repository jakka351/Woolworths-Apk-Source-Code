package com.google.firebase.auth.internal;

import com.google.android.gms.common.api.internal.BackgroundDetector;

/* loaded from: classes6.dex */
final class zzcd implements BackgroundDetector.BackgroundStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzca f15208a;

    public zzcd(zzca zzcaVar) {
        this.f15208a = zzcaVar;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        if (z) {
            this.f15208a.c = true;
            this.f15208a.a();
            return;
        }
        this.f15208a.c = false;
        zzca zzcaVar = this.f15208a;
        if (zzcaVar.f15205a <= 0 || zzcaVar.c) {
            return;
        }
        this.f15208a.b.a();
    }
}
