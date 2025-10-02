package androidx.databinding;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class ObservableField<T> extends BaseObservableField implements Serializable {
    public Object e;

    public ObservableField(Object obj) {
        this.e = obj;
    }

    public final void i(Object obj) throws Throwable {
        if (obj != this.e) {
            this.e = obj;
            synchronized (this) {
                try {
                    PropertyChangeRegistry propertyChangeRegistry = this.d;
                    if (propertyChangeRegistry == null) {
                        return;
                    }
                    propertyChangeRegistry.b(0, this, null);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
