package io.grpc.internal;

import com.google.common.annotations.VisibleForTesting;
import io.grpc.Attributes;
import io.grpc.NameResolver;
import io.grpc.Status;
import io.grpc.SynchronizationContext;
import java.util.IdentityHashMap;

/* loaded from: classes7.dex */
final class RetryingNameResolver extends ForwardingNameResolver {
    public static final Attributes.Key d = new Attributes.Key("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");
    public final RetryScheduler b;
    public final SynchronizationContext c;

    @VisibleForTesting
    public class DelayedNameResolverRefresh implements Runnable {
        public DelayedNameResolverRefresh() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            RetryingNameResolver.this.b();
        }
    }

    public class ResolutionResultListener {
        public ResolutionResultListener() {
        }
    }

    public class RetryingListener extends NameResolver.Listener2 {

        /* renamed from: a, reason: collision with root package name */
        public final NameResolver.Listener2 f24098a;

        public RetryingListener(NameResolver.Listener2 listener2) {
            this.f24098a = listener2;
        }

        @Override // io.grpc.NameResolver.Listener
        public final void a(Status status) {
            this.f24098a.a(status);
            RetryingNameResolver.this.c.execute(new a(this, 2));
        }

        @Override // io.grpc.NameResolver.Listener2
        public final void b(NameResolver.ResolutionResult resolutionResult) {
            Attributes attributes = resolutionResult.b;
            IdentityHashMap identityHashMap = attributes.f23916a;
            Attributes.Key key = RetryingNameResolver.d;
            if (identityHashMap.get(key) != null) {
                throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
            }
            NameResolver.ResolutionResult.Builder builderA = NameResolver.ResolutionResult.a();
            builderA.f23968a = resolutionResult.f23967a;
            builderA.b = attributes;
            builderA.c = resolutionResult.c;
            attributes.getClass();
            Attributes.Builder builder = new Attributes.Builder(attributes);
            builder.b(key, RetryingNameResolver.this.new ResolutionResultListener());
            Attributes attributesA = builder.a();
            builderA.b = attributesA;
            this.f24098a.b(new NameResolver.ResolutionResult(builderA.f23968a, attributesA, builderA.c));
        }
    }

    public RetryingNameResolver(NameResolver nameResolver, RetryScheduler retryScheduler, SynchronizationContext synchronizationContext) {
        super(nameResolver);
        this.b = retryScheduler;
        this.c = synchronizationContext;
    }

    @Override // io.grpc.internal.ForwardingNameResolver, io.grpc.NameResolver
    public final void c() {
        super.c();
        this.b.reset();
    }

    @Override // io.grpc.internal.ForwardingNameResolver, io.grpc.NameResolver
    public final void e(NameResolver.Listener2 listener2) {
        super.e(new RetryingListener(listener2));
    }
}
