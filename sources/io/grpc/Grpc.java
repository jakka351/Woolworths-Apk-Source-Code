package io.grpc;

import io.grpc.Attributes;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes7.dex */
public final class Grpc {

    /* renamed from: a, reason: collision with root package name */
    public static final Attributes.Key f23938a = new Attributes.Key("io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR");
    public static final Attributes.Key b = new Attributes.Key("io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR");
    public static final Attributes.Key c = new Attributes.Key("io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION");

    @ExperimentalApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TransportAttr {
    }
}
