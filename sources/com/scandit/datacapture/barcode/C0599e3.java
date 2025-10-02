package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewAsyncCallback;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewResponse;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0599e3 implements BarcodePickViewHighlightStyleCustomViewAsyncCallback {

    /* renamed from: a, reason: collision with root package name */
    private final C0615f3 f17625a;
    private final Function0 b;
    final /* synthetic */ C0631g3 c;

    public C0599e3(C0631g3 c0631g3, C0615f3 key, Function0 whenDone) {
        Intrinsics.h(key, "key");
        Intrinsics.h(whenDone, "whenDone");
        this.c = c0631g3;
        this.f17625a = key;
        this.b = whenDone;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewAsyncCallback
    public final void onData(BarcodePickViewHighlightStyleCustomViewResponse barcodePickViewHighlightStyleCustomViewResponse) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.c.c;
        C0631g3 c0631g3 = this.c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (barcodePickViewHighlightStyleCustomViewResponse == null) {
                c0631g3.d.remove(this.f17625a);
            } else {
                c0631g3.d.put(this.f17625a, new C0549c5(barcodePickViewHighlightStyleCustomViewResponse.getView$scandit_barcode_capture(), barcodePickViewHighlightStyleCustomViewResponse.getStatusIconStyle$scandit_barcode_capture()));
            }
            c0631g3.e.remove(this.f17625a);
            this.b.invoke();
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
}
