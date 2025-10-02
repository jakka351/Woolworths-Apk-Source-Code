package io.grpc;

import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public abstract class CallCredentials {

    public static abstract class MetadataApplier {
        public abstract void a(Metadata metadata);

        public abstract void b(Status status);
    }

    public static abstract class RequestInfo {
    }

    public abstract void a(RequestInfo requestInfo, Executor executor, MetadataApplier metadataApplier);
}
