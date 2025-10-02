package dagger.hilt.android.internal.managers;

import dagger.hilt.internal.GeneratedComponentManager;

/* loaded from: classes.dex */
public final class ApplicationComponentManager implements GeneratedComponentManager<Object> {
    public volatile Object d;
    public final Object e = new Object();
    public final ComponentSupplier f;

    public ApplicationComponentManager(ComponentSupplier componentSupplier) {
        this.f = componentSupplier;
    }

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.d == null) {
            synchronized (this.e) {
                try {
                    if (this.d == null) {
                        this.d = this.f.get();
                    }
                } finally {
                }
            }
        }
        return this.d;
    }
}
