package io.grpc.internal;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes7.dex */
public abstract class InUseStateAggregator<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Set f24021a = Collections.newSetFromMap(new IdentityHashMap());

    public abstract void a();

    public abstract void b();

    public final void c(Object obj, boolean z) {
        Set set = this.f24021a;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                a();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            b();
        }
    }
}
