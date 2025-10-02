package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "lifecycle-viewmodel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public class ViewModelStore {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2804a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f2804a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModel) it.next()).m6();
        }
        linkedHashMap.clear();
    }
}
