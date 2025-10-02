package androidx.lifecycle;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModel;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class ViewModel {
    public final ViewModelImpl d = new ViewModelImpl();

    public final void l6(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        ViewModelImpl viewModelImpl = this.d;
        if (viewModelImpl != null) {
            if (viewModelImpl.d) {
                ViewModelImpl.a(autoCloseable);
                return;
            }
            synchronized (viewModelImpl.f2818a) {
                autoCloseable2 = (AutoCloseable) viewModelImpl.b.put(str, autoCloseable);
            }
            ViewModelImpl.a(autoCloseable2);
        }
    }

    public final void m6() {
        ViewModelImpl viewModelImpl = this.d;
        if (viewModelImpl != null && !viewModelImpl.d) {
            viewModelImpl.d = true;
            synchronized (viewModelImpl.f2818a) {
                try {
                    Iterator it = viewModelImpl.b.values().iterator();
                    while (it.hasNext()) {
                        ViewModelImpl.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = viewModelImpl.c.iterator();
                    while (it2.hasNext()) {
                        ViewModelImpl.a((AutoCloseable) it2.next());
                    }
                    viewModelImpl.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        o6();
    }

    public final AutoCloseable n6(String str) {
        AutoCloseable autoCloseable;
        ViewModelImpl viewModelImpl = this.d;
        if (viewModelImpl == null) {
            return null;
        }
        synchronized (viewModelImpl.f2818a) {
            autoCloseable = (AutoCloseable) viewModelImpl.b.get(str);
        }
        return autoCloseable;
    }

    public void o6() {
    }
}
