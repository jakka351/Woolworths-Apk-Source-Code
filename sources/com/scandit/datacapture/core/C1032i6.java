package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.https.NativeHttpsRequest;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSession;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionConfiguration;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsSessionDelegate;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.i6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1032i6 extends NativeHttpsSession {

    /* renamed from: a, reason: collision with root package name */
    private final NativeHttpsSessionConfiguration f18534a;
    private final InterfaceC0987d6 b;
    private final ReentrantReadWriteLock c;
    private NativeHttpsSessionDelegate d;

    public C1032i6(NativeHttpsSessionConfiguration config, C1014g6 client) {
        Intrinsics.h(config, "config");
        Intrinsics.h(client, "client");
        this.f18534a = config;
        this.b = client;
        this.c = new ReentrantReadWriteLock(true);
        client.a(new D4(config.getAllowsCellularAccess()));
        client.a(new K4(this));
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final NativeHttpsSessionConfiguration getConfiguration() {
        return this.f18534a;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final NativeHttpsSessionDelegate getDelegate() {
        ReentrantReadWriteLock.ReadLock lock = this.c.readLock();
        lock.lock();
        try {
            return this.d;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final void setDelegate(NativeHttpsSessionDelegate nativeHttpsSessionDelegate) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.d = nativeHttpsSessionDelegate;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final void shouldAllowExpiredCertificates(boolean z) {
        ((C1014g6) this.b).a(z);
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsSession
    public final NativeHttpsTask startRequest(NativeHttpsRequest request) {
        Intrinsics.h(request, "request");
        H6 h6A = ((C1014g6) this.b).a(request);
        ((C1014g6) this.b).a(h6A);
        return h6A;
    }
}
