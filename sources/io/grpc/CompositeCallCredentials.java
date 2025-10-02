package io.grpc;

import com.google.common.base.Preconditions;
import io.grpc.CallCredentials;
import java.util.concurrent.Executor;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class CompositeCallCredentials extends CallCredentials {

    public static final class CombiningMetadataApplier extends CallCredentials.MetadataApplier {

        /* renamed from: a, reason: collision with root package name */
        public final CallCredentials.MetadataApplier f23927a;
        public final Metadata b;

        public CombiningMetadataApplier(CallCredentials.MetadataApplier metadataApplier, Metadata metadata) {
            this.f23927a = metadataApplier;
            this.b = metadata;
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public final void a(Metadata metadata) {
            Metadata metadata2 = new Metadata();
            metadata2.d(this.b);
            metadata2.d(metadata);
            this.f23927a.a(metadata2);
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public final void b(Status status) {
            this.f23927a.b(status);
        }
    }

    public final class WrappingMetadataApplier extends CallCredentials.MetadataApplier {

        /* renamed from: a, reason: collision with root package name */
        public final CallCredentials.RequestInfo f23928a;
        public final Executor b;
        public final CallCredentials.MetadataApplier c;
        public final Context d;

        public WrappingMetadataApplier(CallCredentials.RequestInfo requestInfo, Executor executor, CallCredentials.MetadataApplier metadataApplier, Context context) {
            this.f23928a = requestInfo;
            this.b = executor;
            this.c = metadataApplier;
            Preconditions.j(context, "context");
            this.d = context;
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public final void a(Metadata metadata) {
            Context context = this.d;
            Context contextB = context.b();
            try {
                new CombiningMetadataApplier(this.c, metadata);
                throw null;
            } catch (Throwable th) {
                context.e(contextB);
                throw th;
            }
        }

        @Override // io.grpc.CallCredentials.MetadataApplier
        public final void b(Status status) {
            this.c.b(status);
        }
    }

    @Override // io.grpc.CallCredentials
    public final void a(CallCredentials.RequestInfo requestInfo, Executor executor, CallCredentials.MetadataApplier metadataApplier) {
        new WrappingMetadataApplier(requestInfo, executor, metadataApplier, Context.d());
        throw null;
    }
}
