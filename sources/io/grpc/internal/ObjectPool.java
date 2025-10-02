package io.grpc.internal;

import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* loaded from: classes7.dex */
public interface ObjectPool<T> {
    void a(Object obj);

    Object getObject();
}
