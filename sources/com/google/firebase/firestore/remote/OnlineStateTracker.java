package com.google.firebase.firestore.remote;

import com.google.firebase.firestore.core.OnlineState;
import com.google.firebase.firestore.util.AsyncQueue;
import com.google.firebase.firestore.util.Logger;

/* loaded from: classes6.dex */
class OnlineStateTracker {
    public int b;
    public AsyncQueue.DelayedTask c;
    public final AsyncQueue e;
    public final i f;

    /* renamed from: a, reason: collision with root package name */
    public OnlineState f15575a = OnlineState.d;
    public boolean d = true;

    public interface OnlineStateCallback {
    }

    public OnlineStateTracker(AsyncQueue asyncQueue, i iVar) {
        this.e = asyncQueue;
        this.f = iVar;
    }

    public final void a(String str) {
        String strH = YU.a.h("Could not reach Cloud Firestore backend. ", str, "\nThis typically indicates that your device does not have a healthy Internet connection at the moment. The client will operate in offline mode until it is able to successfully connect to the backend.");
        if (!this.d) {
            Logger.a("OnlineStateTracker", "%s", strH);
        } else {
            Logger.c("OnlineStateTracker", "%s", strH);
            this.d = false;
        }
    }

    public final void b(OnlineState onlineState) {
        if (onlineState != this.f15575a) {
            this.f15575a = onlineState;
            this.f.f15592a.f(onlineState);
        }
    }

    public final void c(OnlineState onlineState) {
        AsyncQueue.DelayedTask delayedTask = this.c;
        if (delayedTask != null) {
            delayedTask.a();
            this.c = null;
        }
        this.b = 0;
        if (onlineState == OnlineState.e) {
            this.d = false;
        }
        b(onlineState);
    }
}
