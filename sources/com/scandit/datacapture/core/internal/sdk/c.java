package com.scandit.datacapture.core.internal.sdk;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ReentrantLock f18665a;
    final /* synthetic */ AtomicBoolean b;
    final /* synthetic */ AtomicReference c;
    final /* synthetic */ Condition d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, AtomicReference atomicReference, Condition condition) {
        super(1);
        this.f18665a = reentrantLock;
        this.b = atomicBoolean;
        this.c = atomicReference;
        this.d = condition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ReentrantLock reentrantLock = this.f18665a;
        AtomicBoolean atomicBoolean = this.b;
        AtomicReference atomicReference = this.c;
        Condition condition = this.d;
        reentrantLock.lock();
        try {
            atomicBoolean.set(true);
            atomicReference.set(obj);
            condition.signalAll();
            reentrantLock.unlock();
            return Unit.f24250a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
