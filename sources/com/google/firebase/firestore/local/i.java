package com.google.firebase.firestore.local;

/* loaded from: classes6.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ LocalStore e;

    public /* synthetic */ i(LocalStore localStore, int i) {
        this.d = i;
        this.e = localStore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                this.e.d.start();
                break;
            default:
                this.e.c.start();
                break;
        }
    }
}
