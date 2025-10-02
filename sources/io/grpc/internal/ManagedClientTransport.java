package io.grpc.internal;

import io.grpc.Attributes;
import io.grpc.Status;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public interface ManagedClientTransport extends ClientTransport {

    public interface Listener {
        void a(Status status);

        void b();

        void c();

        void d(boolean z);

        default Attributes e(Attributes attributes) {
            return attributes;
        }
    }

    Runnable e(Listener listener);

    void f(Status status);

    void g(Status status);
}
