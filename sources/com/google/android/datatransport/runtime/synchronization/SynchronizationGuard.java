package com.google.android.datatransport.runtime.synchronization;

import androidx.annotation.WorkerThread;

@WorkerThread
/* loaded from: classes.dex */
public interface SynchronizationGuard {

    public interface CriticalSection<T> {
        Object execute();
    }

    Object d(CriticalSection criticalSection);
}
