package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.remote.Stream;
import com.google.firebase.firestore.util.Assert;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ AbstractStream e;

    public /* synthetic */ a(AbstractStream abstractStream, int i) {
        this.d = i;
        this.e = abstractStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        AbstractStream abstractStream = this.e;
        switch (i) {
            case 0:
                Stream.State state = abstractStream.h;
                Assert.b(state == Stream.State.i, "State should still be backoff but was %s", state);
                abstractStream.h = Stream.State.d;
                abstractStream.g();
                Assert.b(abstractStream.d(), "Stream should have started", new Object[0]);
                break;
            default:
                int i2 = AbstractStream.r;
                if (abstractStream.c()) {
                    abstractStream.h = Stream.State.g;
                    break;
                }
                break;
        }
    }
}
