package io.grpc;

/* loaded from: classes7.dex */
public abstract class ServerCall<ReqT, RespT> {

    public static abstract class Listener<ReqT> {
    }

    public abstract void a(Status status, Metadata metadata);

    public Attributes b() {
        return Attributes.b;
    }

    public String c() {
        return null;
    }

    public abstract boolean d();

    public boolean e() {
        return true;
    }

    public abstract void f(int i);

    public abstract void g(Metadata metadata);

    public abstract void h(Object obj);
}
