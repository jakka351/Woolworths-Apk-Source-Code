package me.oriient.internal.services.websocket.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class d implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f25679a = Executors.defaultThreadFactory();
    public final AtomicInteger b = new AtomicInteger(1);
    public final String c = "connectionLostChecker";

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f25679a.newThread(runnable);
        threadNewThread.setName(this.c + "-" + this.b);
        return threadNewThread;
    }
}
