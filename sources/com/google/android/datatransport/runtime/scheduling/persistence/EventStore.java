package com.google.android.datatransport.runtime.scheduling.persistence;

import androidx.annotation.WorkerThread;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import java.io.Closeable;

@WorkerThread
/* loaded from: classes.dex */
public interface EventStore extends Closeable {
    long D1(TransportContext transportContext);

    boolean E1(TransportContext transportContext);

    void G1(Iterable iterable);

    Iterable T1(TransportContext transportContext);

    void Z0(Iterable iterable);

    void h2(long j, TransportContext transportContext);

    Iterable j1();

    int m();

    PersistedEvent n2(TransportContext transportContext, EventInternal eventInternal);
}
