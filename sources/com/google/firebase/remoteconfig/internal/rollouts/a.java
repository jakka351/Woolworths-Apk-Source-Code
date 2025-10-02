package com.google.firebase.remoteconfig.internal.rollouts;

import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ RolloutsStateSubscriber e;
    public final /* synthetic */ RolloutsState f;

    public /* synthetic */ a(RolloutsStateSubscriber rolloutsStateSubscriber, RolloutsState rolloutsState, int i) {
        this.d = i;
        this.e = rolloutsStateSubscriber;
        this.f = rolloutsState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.a(this.f);
                break;
            default:
                this.e.a(this.f);
                break;
        }
    }
}
