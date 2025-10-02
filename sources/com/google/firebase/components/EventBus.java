package com.google.firebase.components;

import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.messaging.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class EventBus implements Subscriber, Publisher {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15231a = new HashMap();
    public ArrayDeque b = new ArrayDeque();
    public final Executor c;

    public EventBus(Executor executor) {
        this.c = executor;
    }

    @Override // com.google.firebase.events.Subscriber
    public final void a(k kVar) {
        b(this.c, kVar);
    }

    @Override // com.google.firebase.events.Subscriber
    public final synchronized void b(Executor executor, EventHandler eventHandler) {
        try {
            executor.getClass();
            if (!this.f15231a.containsKey(DataCollectionDefaultChange.class)) {
                this.f15231a.put(DataCollectionDefaultChange.class, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f15231a.get(DataCollectionDefaultChange.class)).put(eventHandler, executor);
        } catch (Throwable th) {
            throw th;
        }
    }
}
