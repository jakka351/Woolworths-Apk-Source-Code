package io.reactivex.disposables;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.OpenHashSet;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CompositeDisposable implements Disposable, DisposableContainer {
    public OpenHashSet d;
    public volatile boolean e;

    public static void f(OpenHashSet openHashSet) {
        if (openHashSet == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : openHashSet.d) {
            if (obj instanceof Disposable) {
                try {
                    ((Disposable) obj).dispose();
                } catch (Throwable th) {
                    Exceptions.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw ExceptionHelper.d((Throwable) arrayList.get(0));
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean a(Disposable disposable) {
        if (!c(disposable)) {
            return false;
        }
        disposable.dispose();
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return this.e;
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean c(Disposable disposable) {
        Object obj;
        ObjectHelper.b(disposable, "disposables is null");
        if (this.e) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return false;
                }
                OpenHashSet openHashSet = this.d;
                if (openHashSet != null) {
                    Object[] objArr = openHashSet.d;
                    int i = openHashSet.f24241a;
                    int iHashCode = disposable.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj2 = objArr[i2];
                    if (obj2 != null) {
                        if (obj2.equals(disposable)) {
                            openHashSet.b(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj = objArr[i2];
                                if (obj == null) {
                                }
                            } while (!obj.equals(disposable));
                            openHashSet.b(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // io.reactivex.internal.disposables.DisposableContainer
    public final boolean d(Disposable disposable) {
        ObjectHelper.b(disposable, "disposable is null");
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        OpenHashSet openHashSet = this.d;
                        if (openHashSet == null) {
                            openHashSet = new OpenHashSet();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            openHashSet.f24241a = iNumberOfLeadingZeros - 1;
                            openHashSet.c = (int) (0.75f * iNumberOfLeadingZeros);
                            openHashSet.d = new Object[iNumberOfLeadingZeros];
                            this.d = openHashSet;
                        }
                        openHashSet.a(disposable);
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
                OpenHashSet openHashSet = this.d;
                this.d = null;
                f(openHashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                OpenHashSet openHashSet = this.d;
                this.d = null;
                f(openHashSet);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int g() {
        if (this.e) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return 0;
                }
                OpenHashSet openHashSet = this.d;
                return openHashSet != null ? openHashSet.b : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
