package com.scandit.datacapture.core.ui.animation;

import android.os.SystemClock;
import android.view.Choreographer;

/* loaded from: classes6.dex */
final class c extends AnimationHandler$AnimationFrameCallbackProvider {
    private final Choreographer b;
    private final Choreographer.FrameCallback c;

    public c(a aVar) {
        super(aVar);
        this.b = Choreographer.getInstance();
        this.c = new Choreographer.FrameCallback() { // from class: com.scandit.datacapture.core.ui.animation.v
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.d.a(j);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        a aVar = this.f18886a;
        aVar.f18890a.e = SystemClock.uptimeMillis();
        d dVar = aVar.f18890a;
        d.b(dVar, dVar.e);
        if (aVar.f18890a.b.size() > 0) {
            d.c(aVar.f18890a).a();
        }
    }

    @Override // com.scandit.datacapture.core.ui.animation.AnimationHandler$AnimationFrameCallbackProvider
    public final void a() {
        this.b.postFrameCallback(this.c);
    }
}
