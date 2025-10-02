package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleCustomViewProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRequest;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C0631g3 implements BarcodePickElementsCache {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickViewHighlightStyleCustomViewProvider f17677a;
    private final boolean b = false;
    private final ReentrantReadWriteLock c = new ReentrantReadWriteLock(true);
    private final LinkedHashMap d = new LinkedHashMap();
    private final LinkedHashMap e = new LinkedHashMap();

    public C0631g3(BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider) {
        this.f17677a = barcodePickViewHighlightStyleCustomViewProvider;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0617f5
    public final void a(String str) {
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0617f5
    public final void b(String str) {
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0601e5
    public final InterfaceC0585d5 a(String str, BarcodePickState state, BarcodePickState barcodePickState) {
        Intrinsics.h(state, "state");
        if (str == null) {
            return null;
        }
        C0615f3 c0615f3 = new C0615f3(str, state);
        ReentrantReadWriteLock.ReadLock lock = this.c.readLock();
        lock.lock();
        try {
            C0549c5 c0549c5 = (C0549c5) this.d.get(c0615f3);
            if (c0549c5 != null) {
                return c0549c5;
            }
            if (barcodePickState == null || this.e.get(c0615f3) == null) {
                return null;
            }
            return (C0549c5) this.d.get(new C0615f3(str, barcodePickState));
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.barcode.InterfaceC0617f5
    public final void a(String itemData, String str, BarcodePickState state, Function0 whenDone) {
        Intrinsics.h(itemData, "itemData");
        Intrinsics.h(state, "state");
        Intrinsics.h(whenDone, "whenDone");
        BarcodePickViewHighlightStyleCustomViewProvider barcodePickViewHighlightStyleCustomViewProvider = this.f17677a;
        if (barcodePickViewHighlightStyleCustomViewProvider == null) {
            return;
        }
        ReentrantReadWriteLock.ReadLock lock = this.c.readLock();
        lock.lock();
        try {
            C0615f3 c0615f3 = new C0615f3(itemData, state);
            if (this.b && (this.d.containsKey(c0615f3) || this.e.containsKey(c0615f3))) {
                return;
            }
            C0599e3 c0599e3 = new C0599e3(this, c0615f3, whenDone);
            ReentrantReadWriteLock reentrantReadWriteLock = this.c;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.e.put(c0615f3, c0599e3);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                barcodePickViewHighlightStyleCustomViewProvider.customViewForRequest(new BarcodePickViewHighlightStyleRequest(itemData, str, state), c0599e3);
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } finally {
            lock.unlock();
        }
    }
}
