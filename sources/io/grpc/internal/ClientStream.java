package io.grpc.internal;

import io.grpc.Attributes;
import io.grpc.Deadline;
import io.grpc.DecompressorRegistry;
import io.grpc.Status;

/* loaded from: classes7.dex */
public interface ClientStream extends Stream {
    void c(int i);

    void d(int i);

    void e(Status status);

    void f();

    Attributes getAttributes();

    void i();

    void j(DecompressorRegistry decompressorRegistry);

    void k();

    void l(InsightBuilder insightBuilder);

    void m(Deadline deadline);

    void n(ClientStreamListener clientStreamListener);
}
