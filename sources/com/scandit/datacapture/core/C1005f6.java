package com.scandit.datacapture.core;

import java.util.TimerTask;

/* renamed from: com.scandit.datacapture.core.f6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1005f6 extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC1041j6 f18498a;

    public C1005f6(AbstractC1041j6 abstractC1041j6) {
        this.f18498a = abstractC1041j6;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f18498a.cancel();
    }
}
