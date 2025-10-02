package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncCallback;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleResponse;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class F2 implements BarcodePickViewHighlightStyleAsyncCallback {

    /* renamed from: a, reason: collision with root package name */
    private final G2 f17156a;
    private final Function0 b;
    final /* synthetic */ H2 c;

    public F2(H2 h2, G2 key, Function0 whenDone) {
        Intrinsics.h(key, "key");
        Intrinsics.h(whenDone, "whenDone");
        this.c = h2;
        this.f17156a = key;
        this.b = whenDone;
    }

    @Override // com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncCallback
    public final void onData(BarcodePickViewHighlightStyleResponse barcodePickViewHighlightStyleResponse) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.c.e;
        H2 h2 = this.c;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (barcodePickViewHighlightStyleResponse == null) {
                h2.h.remove(this.f17156a);
                h2.g.remove(this.f17156a);
            } else {
                h2.h.put(this.f17156a, new C0533b5(barcodePickViewHighlightStyleResponse.getIcon$scandit_barcode_capture(), barcodePickViewHighlightStyleResponse.getBrush$scandit_barcode_capture(), barcodePickViewHighlightStyleResponse.getStatusIconStyle$scandit_barcode_capture()));
                LinkedHashMap linkedHashMap = h2.g;
                G2 g2 = this.f17156a;
                linkedHashMap.put(g2, new C0533b5(H2.b(h2, barcodePickViewHighlightStyleResponse, g2.a()), H2.a(h2, barcodePickViewHighlightStyleResponse, this.f17156a.a()), barcodePickViewHighlightStyleResponse.getStatusIconStyle$scandit_barcode_capture()));
            }
            h2.i.remove(this.f17156a);
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
