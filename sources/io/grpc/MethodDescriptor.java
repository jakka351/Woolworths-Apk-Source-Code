package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.medallia.digital.mobilesdk.q2;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReferenceArray;
import javax.annotation.concurrent.Immutable;

@Immutable
/* loaded from: classes7.dex */
public final class MethodDescriptor<ReqT, RespT> {

    /* renamed from: a, reason: collision with root package name */
    public final MethodType f23962a;
    public final String b;
    public final String c;
    public final Marshaller d;
    public final Marshaller e;
    public final boolean f;
    public final boolean g;

    public static final class Builder<ReqT, RespT> {

        /* renamed from: a, reason: collision with root package name */
        public Marshaller f23963a;
        public Marshaller b;
        public MethodType c;
        public String d;
        public boolean e;
        public boolean f;

        public final MethodDescriptor a() {
            return new MethodDescriptor(this.c, this.d, this.f23963a, this.b, this.e, this.f);
        }
    }

    public interface Marshaller<T> {
        InputStream a(Object obj);

        Object b(InputStream inputStream);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class MethodType {
        public static final MethodType d;
        public static final MethodType e;
        public static final MethodType f;
        public static final /* synthetic */ MethodType[] g;

        static {
            MethodType methodType = new MethodType("UNARY", 0);
            d = methodType;
            MethodType methodType2 = new MethodType("CLIENT_STREAMING", 1);
            MethodType methodType3 = new MethodType("SERVER_STREAMING", 2);
            e = methodType3;
            MethodType methodType4 = new MethodType("BIDI_STREAMING", 3);
            f = methodType4;
            g = new MethodType[]{methodType, methodType2, methodType3, methodType4, new MethodType("UNKNOWN", 4)};
        }

        public static MethodType valueOf(String str) {
            return (MethodType) Enum.valueOf(MethodType.class, str);
        }

        public static MethodType[] values() {
            return (MethodType[]) g.clone();
        }
    }

    @ExperimentalApi
    public interface PrototypeMarshaller<T> extends ReflectableMarshaller<T> {
    }

    @ExperimentalApi
    public interface ReflectableMarshaller<T> extends Marshaller<T> {
    }

    public MethodDescriptor(MethodType methodType, String str, Marshaller marshaller, Marshaller marshaller2, boolean z, boolean z2) {
        new AtomicReferenceArray(2);
        Preconditions.j(methodType, "type");
        this.f23962a = methodType;
        Preconditions.j(str, "fullMethodName");
        this.b = str;
        int iLastIndexOf = str.lastIndexOf(47);
        this.c = iLastIndexOf == -1 ? null : str.substring(0, iLastIndexOf);
        Preconditions.j(marshaller, "requestMarshaller");
        this.d = marshaller;
        Preconditions.j(marshaller2, "responseMarshaller");
        this.e = marshaller2;
        this.f = z;
        this.g = z2;
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        Preconditions.j(str, "fullServiceName");
        sb.append(str);
        sb.append(q2.c);
        Preconditions.j(str2, "methodName");
        sb.append(str2);
        return sb.toString();
    }

    public static Builder b() {
        Builder builder = new Builder();
        builder.f23963a = null;
        builder.b = null;
        return builder;
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.b, "fullMethodName");
        toStringHelperB.c(this.f23962a, "type");
        toStringHelperB.d("idempotent", this.f);
        toStringHelperB.d("safe", false);
        toStringHelperB.d("sampledToLocalTracing", this.g);
        toStringHelperB.c(this.d, "requestMarshaller");
        toStringHelperB.c(this.e, "responseMarshaller");
        toStringHelperB.c(null, "schemaDescriptor");
        toStringHelperB.d = true;
        return toStringHelperB.toString();
    }
}
