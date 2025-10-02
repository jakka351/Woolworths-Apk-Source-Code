package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import io.grpc.ClientStreamTracer;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.CheckReturnValue;
import javax.annotation.concurrent.Immutable;

@CheckReturnValue
@Immutable
/* loaded from: classes7.dex */
public final class CallOptions {
    public static final CallOptions i;

    /* renamed from: a, reason: collision with root package name */
    public final Deadline f23919a;
    public final Executor b;
    public final CallCredentials c;
    public final Object[][] d;
    public final List e;
    public final Boolean f;
    public final Integer g;
    public final Integer h;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Deadline f23920a;
        public Executor b;
        public CallCredentials c;
        public Object[][] d;
        public List e;
        public Boolean f;
        public Integer g;
        public Integer h;
    }

    public static final class Key<T> {

        /* renamed from: a, reason: collision with root package name */
        public final String f23921a;

        public Key(String str) {
            this.f23921a = str;
        }

        public final String toString() {
            return this.f23921a;
        }
    }

    static {
        Builder builder = new Builder();
        builder.d = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        builder.e = Collections.EMPTY_LIST;
        i = new CallOptions(builder);
    }

    public CallOptions(Builder builder) {
        this.f23919a = builder.f23920a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
    }

    public static Builder c(CallOptions callOptions) {
        Builder builder = new Builder();
        builder.f23920a = callOptions.f23919a;
        builder.b = callOptions.b;
        builder.c = callOptions.c;
        builder.d = callOptions.d;
        builder.e = callOptions.e;
        builder.f = callOptions.f;
        builder.g = callOptions.g;
        builder.h = callOptions.h;
        return builder;
    }

    public final Object a(Key key) {
        Preconditions.j(key, "key");
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.d;
            if (i2 >= objArr.length) {
                return null;
            }
            if (key.equals(objArr[i2][0])) {
                return objArr[i2][1];
            }
            i2++;
        }
    }

    public final boolean b() {
        return Boolean.TRUE.equals(this.f);
    }

    public final CallOptions d(CallCredentials callCredentials) {
        Builder builderC = c(this);
        builderC.c = callCredentials;
        return new CallOptions(builderC);
    }

    public final CallOptions e(Deadline deadline) {
        Builder builderC = c(this);
        builderC.f23920a = deadline;
        return new CallOptions(builderC);
    }

    public final CallOptions f(Executor executor) {
        Builder builderC = c(this);
        builderC.b = executor;
        return new CallOptions(builderC);
    }

    public final CallOptions g(int i2) {
        Preconditions.b(i2, "invalid maxsize %s", i2 >= 0);
        Builder builderC = c(this);
        builderC.g = Integer.valueOf(i2);
        return new CallOptions(builderC);
    }

    public final CallOptions h(int i2) {
        Preconditions.b(i2, "invalid maxsize %s", i2 >= 0);
        Builder builderC = c(this);
        builderC.h = Integer.valueOf(i2);
        return new CallOptions(builderC);
    }

    public final CallOptions i(Key key, Object obj) {
        Object[][] objArr;
        Preconditions.j(key, "key");
        Builder builderC = c(this);
        int i2 = 0;
        while (true) {
            objArr = this.d;
            if (i2 >= objArr.length) {
                i2 = -1;
                break;
            }
            if (key.equals(objArr[i2][0])) {
                break;
            }
            i2++;
        }
        Object[][] objArr2 = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr.length + (i2 == -1 ? 1 : 0), 2);
        builderC.d = objArr2;
        System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        if (i2 == -1) {
            builderC.d[objArr.length] = new Object[]{key, obj};
        } else {
            builderC.d[i2] = new Object[]{key, obj};
        }
        return new CallOptions(builderC);
    }

    public final CallOptions j(ClientStreamTracer.Factory factory) {
        List list = this.e;
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(factory);
        Builder builderC = c(this);
        builderC.e = Collections.unmodifiableList(arrayList);
        return new CallOptions(builderC);
    }

    public final CallOptions k() {
        Builder builderC = c(this);
        builderC.f = Boolean.TRUE;
        return new CallOptions(builderC);
    }

    public final CallOptions l() {
        Builder builderC = c(this);
        builderC.f = Boolean.FALSE;
        return new CallOptions(builderC);
    }

    public final String toString() {
        MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
        toStringHelperB.c(this.f23919a, "deadline");
        toStringHelperB.c(null, "authority");
        toStringHelperB.c(this.c, "callCredentials");
        Executor executor = this.b;
        toStringHelperB.c(executor != null ? executor.getClass() : null, "executor");
        toStringHelperB.c(null, "compressorName");
        toStringHelperB.c(Arrays.deepToString(this.d), "customOptions");
        toStringHelperB.d("waitForReady", b());
        toStringHelperB.c(this.g, "maxInboundMessageSize");
        toStringHelperB.c(this.h, "maxOutboundMessageSize");
        toStringHelperB.c(this.e, "streamTracerFactories");
        return toStringHelperB.toString();
    }
}
