package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CompositeGeneratedAdaptersObserver implements LifecycleEventObserver {
    public final GeneratedAdapter[] d;

    public CompositeGeneratedAdaptersObserver(GeneratedAdapter[] generatedAdapterArr) {
        this.d = generatedAdapterArr;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        new HashMap();
        GeneratedAdapter[] generatedAdapterArr = this.d;
        for (GeneratedAdapter generatedAdapter : generatedAdapterArr) {
            generatedAdapter.a();
        }
        for (GeneratedAdapter generatedAdapter2 : generatedAdapterArr) {
            generatedAdapter2.a();
        }
    }
}
