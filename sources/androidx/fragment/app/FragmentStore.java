package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
class FragmentStore {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2757a = new ArrayList();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public FragmentManagerViewModel d;

    public final void a(Fragment fragment2) {
        if (this.f2757a.contains(fragment2)) {
            throw new IllegalStateException("Fragment already added: " + fragment2);
        }
        synchronized (this.f2757a) {
            this.f2757a.add(fragment2);
        }
        fragment2.mAdded = true;
    }

    public final Fragment b(String str) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) this.b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.k();
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (FragmentStateManager fragmentStateManager : this.b.values()) {
            if (fragmentStateManager != null && (fragmentFindFragmentByWho = fragmentStateManager.k().findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f2757a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f2757a) {
            arrayList = new ArrayList(this.f2757a);
        }
        return arrayList;
    }

    public final void g(FragmentStateManager fragmentStateManager) {
        Fragment fragmentK = fragmentStateManager.k();
        String str = fragmentK.mWho;
        HashMap map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragmentK.mWho, fragmentStateManager);
        if (fragmentK.mRetainInstanceChangedWhileDetached) {
            if (fragmentK.mRetainInstance) {
                this.d.p6(fragmentK);
            } else {
                this.d.t6(fragmentK);
            }
            fragmentK.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.Q(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    public final void h(FragmentStateManager fragmentStateManager) {
        Fragment fragmentK = fragmentStateManager.k();
        if (fragmentK.mRetainInstance) {
            this.d.t6(fragmentK);
        }
        String str = fragmentK.mWho;
        HashMap map = this.b;
        if (map.get(str) == fragmentStateManager && ((FragmentStateManager) map.put(fragmentK.mWho, null)) != null && FragmentManager.Q(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
