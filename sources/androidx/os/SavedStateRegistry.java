package androidx.os;

import android.os.Bundle;
import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.os.Recreator;
import androidx.os.internal.SavedStateRegistryImpl;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/SavedStateRegistry;", "", "SavedStateProvider", "AutoRecreated", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateRegistryImpl f3731a;
    public Recreator.SavedStateProvider b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public interface AutoRecreated {
        void a(SavedStateRegistryOwner savedStateRegistryOwner);
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SavedStateProvider {
        Bundle a();
    }

    public SavedStateRegistry(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.f3731a = savedStateRegistryImpl;
    }

    public final Bundle a(String key) {
        Intrinsics.h(key, "key");
        SavedStateRegistryImpl savedStateRegistryImpl = this.f3731a;
        if (!savedStateRegistryImpl.g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = savedStateRegistryImpl.f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleI = bundle.containsKey(key) ? SavedStateReader.i(bundle, key) : null;
        bundle.remove(key);
        if (bundle.isEmpty()) {
            savedStateRegistryImpl.f = null;
        }
        return bundleI;
    }

    public final SavedStateProvider b() {
        SavedStateProvider savedStateProvider;
        SavedStateRegistryImpl savedStateRegistryImpl = this.f3731a;
        synchronized (savedStateRegistryImpl.c) {
            Iterator it = savedStateRegistryImpl.d.entrySet().iterator();
            do {
                savedStateProvider = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                SavedStateProvider savedStateProvider2 = (SavedStateProvider) entry.getValue();
                if (Intrinsics.c(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    savedStateProvider = savedStateProvider2;
                }
            } while (savedStateProvider == null);
        }
        return savedStateProvider;
    }

    public final void c(String str, SavedStateProvider provider) {
        Intrinsics.h(provider, "provider");
        SavedStateRegistryImpl savedStateRegistryImpl = this.f3731a;
        synchronized (savedStateRegistryImpl.c) {
            if (savedStateRegistryImpl.d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            savedStateRegistryImpl.d.put(str, provider);
        }
    }

    public final void d() throws NoSuchMethodException, SecurityException {
        if (!this.f3731a.h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        Recreator.SavedStateProvider savedStateProvider = this.b;
        if (savedStateProvider == null) {
            savedStateProvider = new Recreator.SavedStateProvider(this);
        }
        this.b = savedStateProvider;
        try {
            LegacySavedStateHandleController.OnRecreation.class.getDeclaredConstructor(null);
            Recreator.SavedStateProvider savedStateProvider2 = this.b;
            if (savedStateProvider2 != null) {
                savedStateProvider2.b(LegacySavedStateHandleController.OnRecreation.class.getName());
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + LegacySavedStateHandleController.OnRecreation.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
