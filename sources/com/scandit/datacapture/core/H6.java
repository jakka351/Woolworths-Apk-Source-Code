package com.scandit.datacapture.core;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsError;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsRequest;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsResponse;
import com.scandit.datacapture.core.internal.module.https.NativeHttpsTaskState;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class H6 extends AbstractC1041j6 {

    /* renamed from: a, reason: collision with root package name */
    private final int f18324a;
    private final NativeHttpsRequest b;
    private final InterfaceC1078n7 c;
    private final P2 d;
    private final A7 e;
    private final ReentrantReadWriteLock f;
    private N7 g;

    public H6(int i, NativeHttpsRequest nativeRequest, C4 taskBackend, Q2 headerParser, C0996e6 c0996e6) {
        Intrinsics.h(nativeRequest, "nativeRequest");
        Intrinsics.h(taskBackend, "taskBackend");
        Intrinsics.h(headerParser, "headerParser");
        this.f18324a = i;
        this.b = nativeRequest;
        this.c = taskBackend;
        this.d = headerParser;
        this.e = c0996e6;
        this.f = new ReentrantReadWriteLock(true);
        this.g = M7.f18347a;
        b();
    }

    private final void b() {
        A7 a7 = this.e;
        if (a7 != null) {
            a7.a(new C1168x7(this, this.g));
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final void cancel() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            N7 n7 = this.g;
            I7 i7 = I7.f18328a;
            if ((n7 instanceof I7) || (n7 instanceof L7)) {
                A7 a7 = this.e;
                if (a7 != null) {
                    a7.a(new C1177y7(this, n7, i7));
                }
            } else {
                a();
                this.g = i7;
                b();
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final NativeHttpsError getError() {
        ReentrantReadWriteLock.ReadLock lock = this.f.readLock();
        lock.lock();
        try {
            N7 n7 = this.g;
            NativeHttpsError nativeHttpsError = ((n7 instanceof J7) || (n7 instanceof I7)) ? new NativeHttpsError() : null;
            lock.unlock();
            return nativeHttpsError;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final int getId() {
        return this.f18324a;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final float getProgress() {
        float fA;
        ReentrantReadWriteLock.ReadLock lock = this.f.readLock();
        lock.lock();
        try {
            N7 n7 = this.g;
            if (n7 instanceof M7) {
                fA = BitmapDescriptorFactory.HUE_RED;
            } else if (n7 instanceof H7) {
                fA = ((H7) n7).a();
            } else {
                if (!(n7 instanceof L7 ? true : n7 instanceof I7)) {
                    throw new NoWhenBranchMatchedException();
                }
                fA = 1.0f;
            }
            return fA;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final NativeHttpsRequest getRequest() {
        return this.b;
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final NativeHttpsResponse getResponse() {
        ReentrantReadWriteLock.ReadLock lock = this.f.readLock();
        lock.lock();
        try {
            N7 n7 = this.g;
            return n7 instanceof K7 ? ((K7) n7).a() : null;
        } finally {
            lock.unlock();
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final NativeHttpsTaskState getState() {
        NativeHttpsTaskState nativeHttpsTaskState;
        ReentrantReadWriteLock.ReadLock lock = this.f.readLock();
        lock.lock();
        try {
            N7 n7 = this.g;
            if (n7 instanceof M7 ? true : n7 instanceof H7) {
                nativeHttpsTaskState = NativeHttpsTaskState.ACTIVE;
            } else if (n7 instanceof L7) {
                nativeHttpsTaskState = NativeHttpsTaskState.COMPLETED;
            } else {
                if (!(n7 instanceof I7)) {
                    throw new NoWhenBranchMatchedException();
                }
                nativeHttpsTaskState = NativeHttpsTaskState.CANCELLED;
            }
            lock.unlock();
            return nativeHttpsTaskState;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.core.internal.module.https.NativeHttpsTask
    public final void start() {
        ReentrantReadWriteLock.ReadLock lock;
        try {
            lock = this.f.readLock();
            lock.lock();
        } catch (C1050k6 unused) {
        } catch (Throwable th) {
            try {
                ReentrantReadWriteLock reentrantReadWriteLock = this.f;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int i = 0;
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    a(th);
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                } catch (Throwable th2) {
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                a();
                throw th3;
            }
        }
        try {
            N7 n7 = this.g;
            if (!(n7 instanceof M7)) {
                B7 b7 = B7.b;
                A7 a7 = this.e;
                if (a7 != null) {
                    a7.a(new C1177y7(this, n7, b7));
                }
                a();
                return;
            }
            lock.unlock();
            a(this.f, new D6(this));
            ((C4) this.c).d();
            OutputStream outputStreamH = ((C4) this.c).h();
            if (outputStreamH != null) {
                a(this.f, new E6(this));
                try {
                    outputStreamH.write(this.b.getBody());
                    outputStreamH.flush();
                    outputStreamH.close();
                } finally {
                }
            }
            a(this.f, new F6(this));
            a(this.f, new G6(this, ((Q2) this.d).a(((C4) this.c).e())));
            a();
        } finally {
            lock.unlock();
        }
    }

    public static final void a(H6 h6, N7 n7) {
        h6.g = n7;
        h6.b();
    }

    @Override // com.scandit.datacapture.core.AbstractC1041j6
    public final void a(C1140u6 exception) {
        Intrinsics.h(exception, "exception");
        ReentrantReadWriteLock reentrantReadWriteLock = this.f;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            a((Throwable) exception);
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(Throwable th) {
        C6 c1131t6;
        C6 c6;
        N7 n7 = this.g;
        if (th instanceof C6) {
            c6 = (C6) th;
        } else {
            if (th instanceof ProtocolException) {
                c1131t6 = new B6(th);
            } else if (th instanceof SocketTimeoutException) {
                c1131t6 = new C1122s6(th);
            } else {
                c1131t6 = th instanceof IOException ? new C1131t6(th) : new C1176y6(th);
            }
            c6 = c1131t6;
        }
        J7 j7 = new J7(c6);
        if (!(n7 instanceof I7)) {
            this.g = j7;
            b();
        } else {
            A7 a7 = this.e;
            if (a7 != null) {
                a7.a(new C1177y7(this, n7, j7));
            }
        }
    }

    private final void a(ReentrantReadWriteLock reentrantReadWriteLock, Function0 function0) {
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            ReentrantReadWriteLock.ReadLock lock2 = this.f.readLock();
            lock2.lock();
            try {
                if (!(this.g instanceof I7)) {
                    lock2.unlock();
                    function0.invoke();
                    return;
                }
                throw C1050k6.f18791a;
            } catch (Throwable th) {
                lock2.unlock();
                throw th;
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    private final void a() {
        try {
            ((C4) this.c).a();
        } catch (Throwable unused) {
        }
    }
}
