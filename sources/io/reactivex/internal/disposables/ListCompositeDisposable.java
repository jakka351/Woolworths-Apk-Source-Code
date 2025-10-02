package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.schedulers.ScheduledRunnable;
import io.reactivex.internal.util.ExceptionHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes7.dex */
public final class ListCompositeDisposable implements Disposable, DisposableContainer {
    public LinkedList d;
    public volatile boolean e;

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean a(Disposable disposable) {
        if (!c(disposable)) {
            return false;
        }
        ((ScheduledRunnable) disposable).dispose();
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.e;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean c(Disposable disposable) {
        if (this.e) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return false;
                }
                LinkedList linkedList = this.d;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean d(Disposable disposable) {
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        LinkedList linkedList = this.d;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.d = linkedList;
                        }
                        linkedList.add(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                LinkedList linkedList = this.d;
                ArrayList arrayList = null;
                this.d = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    try {
                        ((Disposable) it.next()).dispose();
                    } catch (Throwable th) {
                        Exceptions.b(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw ExceptionHelper.d((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
