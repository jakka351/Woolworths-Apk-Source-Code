package io.grpc;

import com.google.protobuf.GeneratedMessageLite;

/* loaded from: classes7.dex */
public abstract class ClientCall<ReqT, RespT> {

    public static abstract class Listener<T> {
        public void a(Status status, Metadata metadata) {
        }

        public void b(Metadata metadata) {
        }

        public void c(Object obj) {
        }

        public void d() {
        }
    }

    public abstract void a(String str, Throwable th);

    public abstract void b();

    public abstract void c();

    public abstract void d(GeneratedMessageLite generatedMessageLite);

    public abstract void e(Listener listener, Metadata metadata);
}
