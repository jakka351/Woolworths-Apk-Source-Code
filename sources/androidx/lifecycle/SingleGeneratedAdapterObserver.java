package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SingleGeneratedAdapterObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SingleGeneratedAdapterObserver implements LifecycleEventObserver {
    public final GeneratedAdapter d;

    public SingleGeneratedAdapterObserver(GeneratedAdapter generatedAdapter) {
        this.d = generatedAdapter;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        GeneratedAdapter generatedAdapter = this.d;
        generatedAdapter.a();
        generatedAdapter.a();
    }
}
