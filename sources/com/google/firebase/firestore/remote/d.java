package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;
import java.util.Locale;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                AbstractStream abstractStream = AbstractStream.this;
                Logger.a(abstractStream.getClass().getSimpleName(), "(%x) Stream is open", Integer.valueOf(System.identityHashCode(abstractStream)));
                abstractStream.h = Stream.State.f;
                abstractStream.l.e();
                if (abstractStream.f15557a == null) {
                    abstractStream.f15557a = abstractStream.f.a(AsyncQueue.TimerId.h, AbstractStream.p, new a(abstractStream, 1));
                    break;
                }
                break;
            default:
                OnlineStateTracker onlineStateTracker = (OnlineStateTracker) this.e;
                onlineStateTracker.c = null;
                Assert.b(onlineStateTracker.f15575a == OnlineState.d, "Timer should be canceled if we transitioned to a different state.", new Object[0]);
                Locale locale = Locale.ENGLISH;
                onlineStateTracker.a("Backend didn't respond within 10 seconds\n");
                onlineStateTracker.b(OnlineState.f);
                break;
        }
    }
}
