package com.google.firebase.events;

import com.google.firebase.messaging.k;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public interface Subscriber {
    void a(k kVar);

    void b(Executor executor, EventHandler eventHandler);
}
