package androidx.databinding;

import androidx.databinding.Observable;

/* loaded from: classes2.dex */
public class BaseObservable implements Observable {
    public transient PropertyChangeRegistry d;

    @Override // androidx.databinding.Observable
    public final void e(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new PropertyChangeRegistry(PropertyChangeRegistry.i);
                }
            } finally {
            }
        }
        PropertyChangeRegistry propertyChangeRegistry = this.d;
        synchronized (propertyChangeRegistry) {
            try {
                int iLastIndexOf = propertyChangeRegistry.d.lastIndexOf(onPropertyChangedCallback);
                if (iLastIndexOf < 0 || propertyChangeRegistry.a(iLastIndexOf)) {
                    propertyChangeRegistry.d.add(onPropertyChangedCallback);
                }
            } finally {
            }
        }
    }

    @Override // androidx.databinding.Observable
    public final void f(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.d;
                if (propertyChangeRegistry == null) {
                    return;
                }
                synchronized (propertyChangeRegistry) {
                    try {
                        if (propertyChangeRegistry.g == 0) {
                            propertyChangeRegistry.d.remove(onPropertyChangedCallback);
                        } else {
                            int iLastIndexOf = propertyChangeRegistry.d.lastIndexOf(onPropertyChangedCallback);
                            if (iLastIndexOf >= 0) {
                                propertyChangeRegistry.f(iLastIndexOf);
                            }
                        }
                    } finally {
                    }
                }
            } finally {
            }
        }
    }

    public final void h(int i) throws Throwable {
        synchronized (this) {
            try {
                PropertyChangeRegistry propertyChangeRegistry = this.d;
                if (propertyChangeRegistry == null) {
                    return;
                }
                propertyChangeRegistry.b(i, this, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
