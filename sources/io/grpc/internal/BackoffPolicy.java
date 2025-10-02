package io.grpc.internal;

/* loaded from: classes7.dex */
public interface BackoffPolicy {

    public interface Provider {
        ExponentialBackoffPolicy get();
    }

    long a();
}
