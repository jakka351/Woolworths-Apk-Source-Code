package io.grpc;

import com.google.firebase.firestore.remote.h;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public abstract class ManagedChannel extends Channel {
    public void i() {
    }

    public ConnectivityState j() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void k(ConnectivityState connectivityState, h hVar) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public abstract ManagedChannel l();
}
