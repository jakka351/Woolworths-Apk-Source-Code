package androidx.camera.core.processing;

import androidx.core.util.Consumer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class Edge<T> implements Consumer<T> {
    public Consumer d;

    @Override // androidx.core.util.Consumer
    public final void accept(Object obj) {
        Intrinsics.f(this.d, "Listener is not set.");
        this.d.accept(obj);
    }
}
