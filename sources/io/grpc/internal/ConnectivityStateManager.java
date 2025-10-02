package io.grpc.internal;

import com.google.common.base.Preconditions;
import com.google.firebase.firestore.remote.h;
import io.grpc.ConnectivityState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes7.dex */
final class ConnectivityStateManager {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f24000a;
    public volatile ConnectivityState b;

    public static final class Listener {

        /* renamed from: a, reason: collision with root package name */
        public final h f24001a;
        public final Executor b;

        public Listener(h hVar, Executor executor) {
            this.f24001a = hVar;
            this.b = executor;
        }
    }

    public final void a(ConnectivityState connectivityState) {
        Preconditions.j(connectivityState, "newState");
        if (this.b == connectivityState || this.b == ConnectivityState.h) {
            return;
        }
        this.b = connectivityState;
        if (this.f24000a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.f24000a;
        this.f24000a = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Listener listener = (Listener) it.next();
            listener.b.execute(listener.f24001a);
        }
    }
}
