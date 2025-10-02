package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
final class FragmentManagerViewModel extends ViewModel {
    public static final ViewModelProvider.Factory k = new AnonymousClass1();
    public final boolean h;
    public final HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final HashMap g = new HashMap();
    public boolean i = false;
    public boolean j = false;

    /* renamed from: androidx.fragment.app.FragmentManagerViewModel$1, reason: invalid class name */
    public class AnonymousClass1 implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel c(Class cls) {
            return new FragmentManagerViewModel(true);
        }
    }

    public FragmentManagerViewModel(boolean z) {
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FragmentManagerViewModel.class == obj.getClass()) {
            FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
            if (this.e.equals(fragmentManagerViewModel.e) && this.f.equals(fragmentManagerViewModel.f) && this.g.equals(fragmentManagerViewModel.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + (this.e.hashCode() * 31)) * 31);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        if (FragmentManager.Q(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.i = true;
    }

    public final void p6(Fragment fragment2) {
        if (this.j) {
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment2.mWho;
        HashMap map = this.e;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment2.mWho, fragment2);
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment2);
        }
    }

    public final void q6(Fragment fragment2, boolean z) {
        if (FragmentManager.Q(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment2);
        }
        s6(fragment2.mWho, z);
    }

    public final void r6(String str, boolean z) {
        if (FragmentManager.Q(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        s6(str, z);
    }

    public final void s6(String str, boolean z) {
        HashMap map = this.f;
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) map.get(str);
        if (fragmentManagerViewModel != null) {
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(fragmentManagerViewModel.f.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fragmentManagerViewModel.r6((String) it.next(), true);
                }
            }
            fragmentManagerViewModel.o6();
            map.remove(str);
        }
        HashMap map2 = this.g;
        ViewModelStore viewModelStore = (ViewModelStore) map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.a();
            map2.remove(str);
        }
    }

    public final void t6(Fragment fragment2) {
        if (this.j) {
            if (FragmentManager.Q(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.e.remove(fragment2.mWho) == null || !FragmentManager.Q(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment2);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.g.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
