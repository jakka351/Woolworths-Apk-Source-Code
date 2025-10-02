package com.scandit.datacapture.core;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC1023h6 {
    public static final ExecutorService a() {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Intrinsics.g(executorServiceNewFixedThreadPool, "newFixedThreadPool(Runti…().availableProcessors())");
        return executorServiceNewFixedThreadPool;
    }
}
