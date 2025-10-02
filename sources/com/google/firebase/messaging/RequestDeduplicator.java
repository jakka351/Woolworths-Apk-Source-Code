package com.google.firebase.messaging;

import androidx.collection.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
class RequestDeduplicator {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f15648a;
    public final ArrayMap b = new ArrayMap(0);

    public interface GetTokenRequest {
    }

    public RequestDeduplicator(ExecutorService executorService) {
        this.f15648a = executorService;
    }
}
