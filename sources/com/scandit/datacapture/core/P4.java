package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.NativeHintPresenterV2;

/* loaded from: classes6.dex */
public final class P4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Q4 f18358a;

    public P4(Q4 q4) {
        this.f18358a = q4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        NativeHintPresenterV2 nativeHintPresenterV2 = (NativeHintPresenterV2) this.f18358a.b.get();
        if (nativeHintPresenterV2 != null) {
            Q4 q4 = this.f18358a;
            if (q4.c.get()) {
                nativeHintPresenterV2.update();
                q4.f18364a.postDelayed(this, q4.d.get());
            }
        }
    }
}
