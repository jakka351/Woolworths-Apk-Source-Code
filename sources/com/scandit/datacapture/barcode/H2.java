package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickBrush;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon;
import com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.elementsprovider.BarcodePickElementsCache;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickState;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleAsyncProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleRequest;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewHighlightStyleResponse;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class H2 implements BarcodePickElementsCache {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickViewHighlightStyleAsyncProvider f17180a;
    private final S2 b;
    private final InterfaceC0600e4 c;
    private final boolean d;
    private final ReentrantReadWriteLock e;
    private final HashSet f;
    private final LinkedHashMap g;
    private final LinkedHashMap h;
    private final LinkedHashMap i;

    public H2(BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider, S2 brushProvider, InterfaceC0600e4 iconProvider, boolean z) {
        Intrinsics.h(brushProvider, "brushProvider");
        Intrinsics.h(iconProvider, "iconProvider");
        this.f17180a = barcodePickViewHighlightStyleAsyncProvider;
        this.b = brushProvider;
        this.c = iconProvider;
        this.d = z;
        this.e = new ReentrantReadWriteLock(true);
        this.f = new HashSet();
        this.g = new LinkedHashMap();
        this.h = new LinkedHashMap();
        this.i = new LinkedHashMap();
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0601e5
    public final InterfaceC0585d5 a(String str, BarcodePickState state, BarcodePickState barcodePickState) {
        C0533b5 c0533b5;
        Intrinsics.h(state, "state");
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            if (str == null) {
                c0533b5 = new C0533b5(this.c.a(state), this.b.b(state), null);
            } else if (this.f.contains(str)) {
                c0533b5 = a(str, state);
            } else {
                c0533b5 = (C0533b5) this.h.get(new G2(str, state));
                if (c0533b5 == null) {
                    c0533b5 = new C0533b5(this.c.a(state), this.b.b(state), null);
                }
            }
            return c0533b5;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.barcode.InterfaceC0617f5
    public final void b(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.e;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            if (CollectionsKt.t(this.f, str)) {
                a(str);
            } else if (str != null) {
                ReentrantReadWriteLock reentrantReadWriteLock2 = this.e;
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock2.readLock();
                int readHoldCount2 = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
                for (int i3 = 0; i3 < readHoldCount2; i3++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
                writeLock2.lock();
                try {
                    this.f.add(str);
                    for (int i4 = 0; i4 < readHoldCount2; i4++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                } catch (Throwable th) {
                    for (int i5 = 0; i5 < readHoldCount2; i5++) {
                        lock2.lock();
                    }
                    writeLock2.unlock();
                    throw th;
                }
            }
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th2) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th2;
        }
    }

    public static final BarcodePickIcon b(H2 h2, BarcodePickViewHighlightStyleResponse barcodePickViewHighlightStyleResponse, BarcodePickState barcodePickState) {
        BarcodePickIcon selectedIcon$scandit_barcode_capture = barcodePickViewHighlightStyleResponse.getSelectedIcon$scandit_barcode_capture();
        G8 g8 = G8.b;
        if (Intrinsics.c(selectedIcon$scandit_barcode_capture, g8)) {
            selectedIcon$scandit_barcode_capture = h2.c.b(barcodePickState);
            if (Intrinsics.c(selectedIcon$scandit_barcode_capture, g8)) {
                BarcodePickIcon icon$scandit_barcode_capture = barcodePickViewHighlightStyleResponse.getIcon$scandit_barcode_capture();
                return Intrinsics.c(icon$scandit_barcode_capture, g8) ? h2.c.a(barcodePickState) : icon$scandit_barcode_capture;
            }
        }
        return selectedIcon$scandit_barcode_capture;
    }

    /* JADX WARN: Finally extract failed */
    @Override // com.scandit.datacapture.barcode.InterfaceC0617f5
    public final void a(String itemData, String str, BarcodePickState state, Function0 whenDone) {
        Intrinsics.h(itemData, "itemData");
        Intrinsics.h(state, "state");
        Intrinsics.h(whenDone, "whenDone");
        BarcodePickViewHighlightStyleAsyncProvider barcodePickViewHighlightStyleAsyncProvider = this.f17180a;
        if (barcodePickViewHighlightStyleAsyncProvider == null) {
            return;
        }
        ReentrantReadWriteLock.ReadLock lock = this.e.readLock();
        lock.lock();
        try {
            G2 g2 = new G2(itemData, state);
            if (this.d && (this.h.containsKey(g2) || this.i.containsKey(g2))) {
                return;
            }
            F2 f2 = new F2(this, g2, whenDone);
            ReentrantReadWriteLock reentrantReadWriteLock = this.e;
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.i.put(g2, f2);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                barcodePickViewHighlightStyleAsyncProvider.styleForRequest(new BarcodePickViewHighlightStyleRequest(itemData, str, state), f2);
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

    @Override // com.scandit.datacapture.barcode.InterfaceC0617f5
    public final void a(String str) {
        if (str != null) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.e;
            ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                this.f.remove(str);
            } finally {
                while (i < readHoldCount) {
                    lock.lock();
                    i++;
                }
                writeLock.unlock();
            }
        }
    }

    private final C0533b5 a(String str, BarcodePickState barcodePickState) {
        C0533b5 c0533b5 = (C0533b5) this.g.get(new G2(str, barcodePickState));
        if (c0533b5 != null) {
            return c0533b5;
        }
        BarcodePickIcon barcodePickIconB = this.c.b(barcodePickState);
        if (Intrinsics.c(barcodePickIconB, G8.b)) {
            barcodePickIconB = this.c.a(barcodePickState);
        }
        BarcodePickBrush barcodePickBrushA = this.b.a(barcodePickState);
        if (Intrinsics.c(barcodePickBrushA, E8.f17149a)) {
            barcodePickBrushA = this.b.b(barcodePickState);
        }
        return new C0533b5(barcodePickIconB, barcodePickBrushA, null);
    }

    public static final BarcodePickBrush a(H2 h2, BarcodePickViewHighlightStyleResponse barcodePickViewHighlightStyleResponse, BarcodePickState barcodePickState) {
        BarcodePickBrush selectedBrush$scandit_barcode_capture = barcodePickViewHighlightStyleResponse.getSelectedBrush$scandit_barcode_capture();
        E8 e8 = E8.f17149a;
        if (Intrinsics.c(selectedBrush$scandit_barcode_capture, e8)) {
            selectedBrush$scandit_barcode_capture = h2.b.a(barcodePickState);
            if (Intrinsics.c(selectedBrush$scandit_barcode_capture, e8)) {
                BarcodePickBrush brush$scandit_barcode_capture = barcodePickViewHighlightStyleResponse.getBrush$scandit_barcode_capture();
                return Intrinsics.c(brush$scandit_barcode_capture, e8) ? h2.b.b(barcodePickState) : brush$scandit_barcode_capture;
            }
        }
        return selectedBrush$scandit_barcode_capture;
    }
}
