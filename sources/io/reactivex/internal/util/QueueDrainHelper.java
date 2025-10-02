package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.queue.MpscLinkedQueue;

/* loaded from: classes7.dex */
public final class QueueDrainHelper {
    public static boolean a(boolean z, boolean z2, Observer observer, MpscLinkedQueue mpscLinkedQueue, Disposable disposable, ObservableQueueDrain observableQueueDrain) {
        if (observableQueueDrain.e()) {
            mpscLinkedQueue.clear();
            disposable.dispose();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable thC = observableQueueDrain.c();
        if (thC != null) {
            mpscLinkedQueue.clear();
            if (disposable != null) {
                disposable.dispose();
            }
            observer.onError(thC);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        observer.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r1 = r7.i(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(io.reactivex.internal.queue.MpscLinkedQueue r8, io.reactivex.observers.SerializedObserver r9, io.reactivex.disposables.Disposable r10, io.reactivex.internal.observers.QueueDrainObserver r11) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r11.h
            boolean r3 = r8.isEmpty()
            r5 = r8
            r4 = r9
            r6 = r10
            r7 = r11
            boolean r8 = a(r2, r3, r4, r5, r6, r7)
            if (r8 == 0) goto L13
            goto L30
        L13:
            boolean r2 = r7.h
            java.lang.Object r8 = r5.poll()
            if (r8 != 0) goto L1d
            r3 = r0
            goto L1f
        L1d:
            r9 = 0
            r3 = r9
        L1f:
            boolean r9 = a(r2, r3, r4, r5, r6, r7)
            r10 = r3
            if (r9 == 0) goto L27
            goto L30
        L27:
            if (r10 == 0) goto L36
            int r8 = -r1
            int r1 = r7.i(r8)
            if (r1 != 0) goto L31
        L30:
            return
        L31:
            r9 = r4
            r8 = r5
            r10 = r6
            r11 = r7
            goto L2
        L36:
            r7.a(r4, r8)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.QueueDrainHelper.b(io.reactivex.internal.queue.MpscLinkedQueue, io.reactivex.observers.SerializedObserver, io.reactivex.disposables.Disposable, io.reactivex.internal.observers.QueueDrainObserver):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0027, code lost:
    
        if (r10 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0029, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(io.reactivex.internal.queue.MpscLinkedQueue r8, io.reactivex.subscribers.SerializedSubscriber r9, io.reactivex.disposables.Disposable r10, io.reactivex.internal.subscribers.QueueDrainSubscriber r11) {
        /*
            r0 = 1
            r1 = r0
        L2:
            boolean r2 = r11.i
            java.lang.Object r3 = r8.poll()
            if (r3 != 0) goto Lc
            r4 = r0
            goto Ld
        Lc:
            r4 = 0
        Ld:
            boolean r5 = r11.h
            if (r5 == 0) goto L15
            r8.clear()
            goto L27
        L15:
            if (r2 == 0) goto L2d
            java.lang.Throwable r2 = r11.j
            if (r2 == 0) goto L22
            r8.clear()
            r9.onError(r2)
            goto L27
        L22:
            if (r4 == 0) goto L2d
            r9.onComplete()
        L27:
            if (r10 == 0) goto L36
            r10.dispose()
            return
        L2d:
            if (r4 == 0) goto L37
            int r1 = -r1
            int r1 = r11.f(r1)
            if (r1 != 0) goto L2
        L36:
            return
        L37:
            long r4 = r11.h()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L54
            boolean r2 = r11.a(r3, r9)
            if (r2 == 0) goto L2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 == 0) goto L2
            r11.g()
            goto L2
        L54:
            r8.clear()
            if (r10 == 0) goto L5c
            r10.dispose()
        L5c:
            io.reactivex.exceptions.MissingBackpressureException r8 = new io.reactivex.exceptions.MissingBackpressureException
            java.lang.String r10 = "Could not emit value due to lack of requests."
            r8.<init>(r10)
            r9.onError(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.QueueDrainHelper.c(io.reactivex.internal.queue.MpscLinkedQueue, io.reactivex.subscribers.SerializedSubscriber, io.reactivex.disposables.Disposable, io.reactivex.internal.subscribers.QueueDrainSubscriber):void");
    }
}
