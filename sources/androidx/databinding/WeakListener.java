package androidx.databinding;

import androidx.annotation.RestrictTo;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@RestrictTo
/* loaded from: classes2.dex */
class WeakListener<T> extends WeakReference<ViewDataBinding> {

    /* renamed from: a, reason: collision with root package name */
    public final ObservableReference f2552a;
    public final int b;
    public Object c;

    public WeakListener(ViewDataBinding viewDataBinding, int i, ObservableReference observableReference, ReferenceQueue referenceQueue) {
        super(viewDataBinding, referenceQueue);
        this.b = i;
        this.f2552a = observableReference;
    }

    public final ViewDataBinding a() {
        ViewDataBinding viewDataBinding = (ViewDataBinding) get();
        if (viewDataBinding == null) {
            b();
        }
        return viewDataBinding;
    }

    public final boolean b() {
        boolean z;
        Object obj = this.c;
        if (obj != null) {
            this.f2552a.c(obj);
            z = true;
        } else {
            z = false;
        }
        this.c = null;
        return z;
    }
}
