package io.grpc;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.salesforce.marketingcloud.storage.db.k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.ThreadSafe;
import me.oriient.positioningengine.ondevice.ml.MlModel;

@ExperimentalApi
/* loaded from: classes7.dex */
public abstract class NameResolver {

    /* renamed from: io.grpc.NameResolver$1, reason: invalid class name */
    class AnonymousClass1 extends Listener2 {
        @Override // io.grpc.NameResolver.Listener
        public final void a(Status status) {
            throw null;
        }

        @Override // io.grpc.NameResolver.Listener2
        public final void b(ResolutionResult resolutionResult) {
            List list = resolutionResult.f23967a;
            Attributes attributes = resolutionResult.b;
            ResolutionResult.Builder builderA = ResolutionResult.a();
            builderA.f23968a = list;
            builderA.b = attributes;
            new ResolutionResult(list, attributes, builderA.c);
            throw null;
        }
    }

    @ExperimentalApi
    public static final class Args {

        /* renamed from: a, reason: collision with root package name */
        public final int f23964a;
        public final ProxyDetector b;
        public final SynchronizationContext c;
        public final ServiceConfigParser d;
        public final ScheduledExecutorService e;
        public final ChannelLogger f;
        public final Executor g;

        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public Integer f23965a;
            public ProxyDetector b;
            public ScheduledExecutorService c;
            public Executor d;
        }

        public Args(Integer num, ProxyDetector proxyDetector, SynchronizationContext synchronizationContext, ServiceConfigParser serviceConfigParser, ScheduledExecutorService scheduledExecutorService, ChannelLogger channelLogger, Executor executor) {
            Preconditions.j(num, "defaultPort not set");
            this.f23964a = num.intValue();
            Preconditions.j(proxyDetector, "proxyDetector not set");
            this.b = proxyDetector;
            Preconditions.j(synchronizationContext, "syncContext not set");
            this.c = synchronizationContext;
            Preconditions.j(serviceConfigParser, "serviceConfigParser not set");
            this.d = serviceConfigParser;
            this.e = scheduledExecutorService;
            this.f = channelLogger;
            this.g = executor;
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.a(this.f23964a, "defaultPort");
            toStringHelperB.c(this.b, "proxyDetector");
            toStringHelperB.c(this.c, "syncContext");
            toStringHelperB.c(this.d, "serviceConfigParser");
            toStringHelperB.c(this.e, "scheduledExecutorService");
            toStringHelperB.c(this.f, "channelLogger");
            toStringHelperB.c(this.g, "executor");
            toStringHelperB.c(null, "overrideAuthority");
            return toStringHelperB.toString();
        }
    }

    @ExperimentalApi
    public static abstract class Factory {
        public abstract String a();

        public abstract NameResolver b(URI uri, Args args);
    }

    @ExperimentalApi
    @ThreadSafe
    public interface Listener {
        void a(Status status);
    }

    @ExperimentalApi
    public static abstract class Listener2 implements Listener {
        public abstract void b(ResolutionResult resolutionResult);
    }

    @ExperimentalApi
    public static final class ResolutionResult {

        /* renamed from: a, reason: collision with root package name */
        public final List f23967a;
        public final Attributes b;
        public final ConfigOrError c;

        @ExperimentalApi
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public List f23968a;
            public Attributes b;
            public ConfigOrError c;
        }

        public ResolutionResult(List list, Attributes attributes, ConfigOrError configOrError) {
            this.f23967a = Collections.unmodifiableList(new ArrayList(list));
            Preconditions.j(attributes, k.a.h);
            this.b = attributes;
            this.c = configOrError;
        }

        public static Builder a() {
            Builder builder = new Builder();
            builder.f23968a = Collections.EMPTY_LIST;
            builder.b = Attributes.b;
            return builder;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ResolutionResult)) {
                return false;
            }
            ResolutionResult resolutionResult = (ResolutionResult) obj;
            return Objects.a(this.f23967a, resolutionResult.f23967a) && Objects.a(this.b, resolutionResult.b) && Objects.a(this.c, resolutionResult.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f23967a, this.b, this.c});
        }

        public final String toString() {
            MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
            toStringHelperB.c(this.f23967a, "addresses");
            toStringHelperB.c(this.b, k.a.h);
            toStringHelperB.c(this.c, "serviceConfig");
            return toStringHelperB.toString();
        }
    }

    @ExperimentalApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ResolutionResultAttr {
    }

    @ExperimentalApi
    public static abstract class ServiceConfigParser {
        public abstract ConfigOrError a(Map map);
    }

    public abstract String a();

    public void b() {
    }

    public abstract void c();

    public void d(Listener2 listener2) {
        e(listener2);
    }

    public void e(Listener2 listener2) {
        d(listener2);
    }

    @ExperimentalApi
    public static final class ConfigOrError {

        /* renamed from: a, reason: collision with root package name */
        public final Status f23966a;
        public final Object b;

        public ConfigOrError(Object obj) {
            this.b = obj;
            this.f23966a = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && ConfigOrError.class == obj.getClass()) {
                ConfigOrError configOrError = (ConfigOrError) obj;
                if (Objects.a(this.f23966a, configOrError.f23966a) && Objects.a(this.b, configOrError.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f23966a, this.b});
        }

        public final String toString() {
            Object obj = this.b;
            if (obj != null) {
                MoreObjects.ToStringHelper toStringHelperB = MoreObjects.b(this);
                toStringHelperB.c(obj, MlModel.MODEL_FILE_SUFFIX);
                return toStringHelperB.toString();
            }
            MoreObjects.ToStringHelper toStringHelperB2 = MoreObjects.b(this);
            toStringHelperB2.c(this.f23966a, "error");
            return toStringHelperB2.toString();
        }

        public ConfigOrError(Status status) {
            this.b = null;
            Preconditions.j(status, "status");
            this.f23966a = status;
            Preconditions.e("cannot use OK status: %s", status, !status.f());
        }
    }
}
