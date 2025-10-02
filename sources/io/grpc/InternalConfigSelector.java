package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.Attributes;

@Internal
/* loaded from: classes7.dex */
public abstract class InternalConfigSelector {

    /* renamed from: a, reason: collision with root package name */
    public static final Attributes.Key f23944a = new Attributes.Key("internal:io.grpc.config-selector");

    public static final class Result {

        /* renamed from: a, reason: collision with root package name */
        public final Status f23945a;
        public final Object b;

        public static final class Builder {
        }

        public Result(Status status, Object obj) {
            Preconditions.j(status, "status");
            this.f23945a = status;
            this.b = obj;
        }
    }

    public abstract Result a();
}
