package io.reactivex.internal.disposables;

import com.google.android.gms.common.api.internal.a;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DisposableHelper implements Disposable {
    public static final DisposableHelper d;
    public static final /* synthetic */ DisposableHelper[] e;

    static {
        DisposableHelper disposableHelper = new DisposableHelper("DISPOSED", 0);
        d = disposableHelper;
        e = new DisposableHelper[]{disposableHelper};
    }

    public static boolean a(AtomicReference atomicReference) {
        Disposable disposable;
        Disposable disposable2 = (Disposable) atomicReference.get();
        DisposableHelper disposableHelper = d;
        if (disposable2 == disposableHelper || (disposable = (Disposable) atomicReference.getAndSet(disposableHelper)) == disposableHelper) {
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable.dispose();
        return true;
    }

    public static boolean c(Disposable disposable) {
        return disposable == d;
    }

    public static boolean d(AtomicReference atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == d) {
                if (disposable == null) {
                    return false;
                }
                disposable.dispose();
                return false;
            }
        } while (!a.t(atomicReference, disposable2, disposable));
        return true;
    }

    public static boolean e(AtomicReference atomicReference, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) atomicReference.get();
            if (disposable2 == d) {
                if (disposable == null) {
                    return false;
                }
                disposable.dispose();
                return false;
            }
        } while (!a.t(atomicReference, disposable2, disposable));
        if (disposable2 == null) {
            return true;
        }
        disposable2.dispose();
        return true;
    }

    public static boolean f(AtomicReference atomicReference, Disposable disposable) {
        ObjectHelper.b(disposable, "d is null");
        while (!atomicReference.compareAndSet(null, disposable)) {
            if (atomicReference.get() != null) {
                disposable.dispose();
                if (atomicReference.get() == d) {
                    return false;
                }
                RxJavaPlugins.b(new ProtocolViolationException());
                return false;
            }
        }
        return true;
    }

    public static boolean l(Disposable disposable, Disposable disposable2) {
        if (disposable2 == null) {
            RxJavaPlugins.b(new NullPointerException("next is null"));
            return false;
        }
        if (disposable == null) {
            return true;
        }
        disposable2.dispose();
        RxJavaPlugins.b(new ProtocolViolationException());
        return false;
    }

    public static DisposableHelper valueOf(String str) {
        return (DisposableHelper) Enum.valueOf(DisposableHelper.class, str);
    }

    public static DisposableHelper[] values() {
        return (DisposableHelper[]) e.clone();
    }

    @Override // io.reactivex.disposables.Disposable
    public final boolean b() {
        return true;
    }

    @Override // io.reactivex.disposables.Disposable
    public final void dispose() {
    }
}
