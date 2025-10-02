package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.observers.QueueDrainObserver;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.observers.SerializedObserver;
import io.reactivex.subjects.UnicastSubject;

/* loaded from: classes7.dex */
public final class ObservableWindowTimed<T> extends AbstractObservableWithUpstream<T, Observable<T>> {

    public static final class WindowExactBoundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable {
        public final Scheduler.Worker j;
        public long k;
        public long l;
        public Disposable m;
        public UnicastSubject n;
        public volatile boolean o;
        public final SequentialDisposable p;

        public static final class ConsumerIndexHolder implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public WindowExactBoundedObserver(SerializedObserver serializedObserver) {
            super(serializedObserver, new MpscLinkedQueue());
            this.p = new SequentialDisposable();
            this.j = null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.m, disposable)) {
                this.m = disposable;
                SerializedObserver serializedObserver = this.e;
                serializedObserver.d(this);
                if (this.g) {
                    return;
                }
                UnicastSubject unicastSubjectN = UnicastSubject.n();
                this.n = unicastSubjectN;
                serializedObserver.onNext(unicastSubjectN);
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g = true;
        }

        public final void j() {
            MpscLinkedQueue mpscLinkedQueue = this.f;
            SerializedObserver serializedObserver = this.e;
            UnicastSubject unicastSubjectN = this.n;
            int i = 1;
            while (!this.o) {
                boolean z = this.h;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof ConsumerIndexHolder;
                if (z && (z2 || z3)) {
                    this.n = null;
                    mpscLinkedQueue.clear();
                    Throwable th = this.i;
                    if (th != null) {
                        unicastSubjectN.onError(th);
                    } else {
                        unicastSubjectN.onComplete();
                    }
                    DisposableHelper.a(this.p);
                    Scheduler.Worker worker = this.j;
                    if (worker != null) {
                        worker.dispose();
                        return;
                    }
                    return;
                }
                if (z2) {
                    i = i(-i);
                    if (i == 0) {
                        return;
                    }
                } else if (z3) {
                    unicastSubjectN.onComplete();
                    this.k = 0L;
                    unicastSubjectN = UnicastSubject.n();
                    this.n = unicastSubjectN;
                    serializedObserver.onNext(unicastSubjectN);
                } else {
                    unicastSubjectN.onNext(objPoll);
                    long j = this.k + 1;
                    if (j >= 0) {
                        this.l++;
                        this.k = 0L;
                        unicastSubjectN.onComplete();
                        unicastSubjectN = UnicastSubject.n();
                        this.n = unicastSubjectN;
                        this.e.onNext(unicastSubjectN);
                    } else {
                        this.k = j;
                    }
                }
            }
            this.m.dispose();
            mpscLinkedQueue.clear();
            DisposableHelper.a(this.p);
            Scheduler.Worker worker2 = this.j;
            if (worker2 != null) {
                worker2.dispose();
            }
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.h = true;
            if (f()) {
                j();
            }
            this.e.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.i = th;
            this.h = true;
            if (f()) {
                j();
            }
            this.e.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.o) {
                return;
            }
            if (g()) {
                UnicastSubject unicastSubject = this.n;
                unicastSubject.onNext(obj);
                long j = this.k + 1;
                if (j >= 0) {
                    this.l++;
                    this.k = 0L;
                    unicastSubject.onComplete();
                    UnicastSubject unicastSubjectN = UnicastSubject.n();
                    this.n = unicastSubjectN;
                    this.e.onNext(unicastSubjectN);
                } else {
                    this.k = j;
                }
                if (i(-1) == 0) {
                    return;
                }
            } else {
                this.f.offer(obj);
                if (!f()) {
                    return;
                }
            }
            j();
        }
    }

    public static final class WindowExactUnboundedObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Observer<T>, Disposable, Runnable {
        public static final Object m = new Object();
        public Disposable j;
        public UnicastSubject k;
        public volatile boolean l;

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.j, disposable)) {
                this.j = disposable;
                this.k = UnicastSubject.n();
                SerializedObserver serializedObserver = this.e;
                serializedObserver.d(this);
                serializedObserver.onNext(this.k);
                if (!this.g) {
                    throw null;
                }
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            r8.k = null;
            r1.clear();
            r1 = r8.i;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
        
            if (r1 == null) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            r3.onError(r1);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void j() {
            /*
                r8 = this;
                java.lang.Object r0 = io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.m
                io.reactivex.internal.queue.MpscLinkedQueue r1 = r8.f
                io.reactivex.observers.SerializedObserver r2 = r8.e
                io.reactivex.subjects.UnicastSubject r3 = r8.k
                r4 = 1
            L9:
                boolean r5 = r8.l
                boolean r6 = r8.h
                java.lang.Object r7 = r1.poll()
                if (r6 == 0) goto L29
                if (r7 == 0) goto L17
                if (r7 != r0) goto L29
            L17:
                r0 = 0
                r8.k = r0
                r1.clear()
                java.lang.Throwable r1 = r8.i
                if (r1 == 0) goto L25
                r3.onError(r1)
                goto L28
            L25:
                r3.onComplete()
            L28:
                throw r0
            L29:
                if (r7 != 0) goto L33
                int r4 = -r4
                int r4 = r8.i(r4)
                if (r4 != 0) goto L9
                return
            L33:
                if (r7 != r0) goto L4a
                r3.onComplete()
                if (r5 != 0) goto L44
                io.reactivex.subjects.UnicastSubject r3 = io.reactivex.subjects.UnicastSubject.n()
                r8.k = r3
                r2.onNext(r3)
                goto L9
            L44:
                io.reactivex.disposables.Disposable r5 = r8.j
                r5.dispose()
                goto L9
            L4a:
                r3.onNext(r7)
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.operators.observable.ObservableWindowTimed.WindowExactUnboundedObserver.j():void");
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.h = true;
            if (f()) {
                j();
            }
            this.e.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.i = th;
            this.h = true;
            if (f()) {
                j();
            }
            this.e.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (this.l) {
                return;
            }
            if (g()) {
                this.k.onNext(obj);
                if (i(-1) == 0) {
                    return;
                }
            } else {
                this.f.offer(obj);
                if (!f()) {
                    return;
                }
            }
            j();
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.g) {
                this.l = true;
            }
            this.f.offer(m);
            if (f()) {
                j();
            }
        }
    }

    public static final class WindowSkipObserver<T> extends QueueDrainObserver<T, Object, Observable<T>> implements Disposable, Runnable {
        public Disposable j;
        public volatile boolean k;

        public final class CompletionTask implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public static final class SubjectWork<T> {

            /* renamed from: a, reason: collision with root package name */
            public final UnicastSubject f24234a;
            public final boolean b;

            public SubjectWork(UnicastSubject unicastSubject, boolean z) {
                this.f24234a = unicastSubject;
                this.b = z;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.g;
        }

        @Override // io.reactivex.Observer
        public final void d(Disposable disposable) {
            if (DisposableHelper.l(this.j, disposable)) {
                this.j = disposable;
                this.e.d(this);
                if (this.g) {
                    return;
                }
                UnicastSubject.n();
                throw null;
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.g = true;
        }

        public final void j() {
            MpscLinkedQueue mpscLinkedQueue = this.f;
            int i = 1;
            while (!this.k) {
                boolean z = this.h;
                Object objPoll = mpscLinkedQueue.poll();
                boolean z2 = objPoll == null;
                boolean z3 = objPoll instanceof SubjectWork;
                if (z && (z2 || z3)) {
                    mpscLinkedQueue.clear();
                    this.i.getClass();
                    throw null;
                }
                if (z2) {
                    i = i(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    if (!z3) {
                        throw null;
                    }
                    if (!((SubjectWork) objPoll).b) {
                        throw null;
                    }
                    if (!this.g) {
                        UnicastSubject.n();
                        throw null;
                    }
                }
            }
            this.j.dispose();
            mpscLinkedQueue.clear();
            throw null;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.h = true;
            if (f()) {
                j();
            }
            this.e.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th) {
            this.i = th;
            this.h = true;
            if (f()) {
                j();
            }
            this.e.onError(th);
        }

        @Override // io.reactivex.Observer
        public final void onNext(Object obj) {
            if (g()) {
                throw null;
            }
            this.f.offer(obj);
            if (f()) {
                j();
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            SubjectWork subjectWork = new SubjectWork(UnicastSubject.n(), true);
            if (!this.g) {
                this.f.offer(subjectWork);
            }
            if (f()) {
                j();
            }
        }
    }

    @Override // io.reactivex.Observable
    public final void h(Observer observer) {
        this.d.a(new WindowExactBoundedObserver(new SerializedObserver(observer)));
    }
}
