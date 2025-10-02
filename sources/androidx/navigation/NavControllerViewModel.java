package androidx.navigation;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.UnsignedKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavControllerViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/navigation/NavViewModelStoreProvider;", "<init>", "()V", "Companion", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavControllerViewModel extends ViewModel implements NavViewModelStoreProvider {
    public final LinkedHashMap e = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/NavControllerViewModel$Companion;", "", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        LinkedHashMap linkedHashMap = this.e;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((ViewModelStore) it.next()).a();
        }
        linkedHashMap.clear();
    }

    @Override // androidx.navigation.NavViewModelStoreProvider
    public final ViewModelStore r3(String backStackEntryId) {
        Intrinsics.h(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.e;
        ViewModelStore viewModelStore = (ViewModelStore) linkedHashMap.get(backStackEntryId);
        if (viewModelStore != null) {
            return viewModelStore;
        }
        ViewModelStore viewModelStore2 = new ViewModelStore();
        linkedHashMap.put(backStackEntryId, viewModelStore2);
        return viewModelStore2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        int iIdentityHashCode = System.identityHashCode(this);
        CharsKt.b(16);
        sb.append(UnsignedKt.c(16, iIdentityHashCode & 4294967295L));
        sb.append("} ViewModelStores (");
        Iterator it = this.e.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        Intrinsics.g(string, "toString(...)");
        return string;
    }
}
