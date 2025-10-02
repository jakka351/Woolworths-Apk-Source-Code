package androidx.os;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d;
import androidx.os.SavedStateRegistry;
import androidx.os.internal.SavedStateRegistryImpl;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController;", "", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SavedStateRegistryController {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateRegistryImpl f3732a;
    public final SavedStateRegistry b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/savedstate/SavedStateRegistryController$Companion;", "", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static SavedStateRegistryController a(SavedStateRegistryOwner savedStateRegistryOwner) {
            return new SavedStateRegistryController(new SavedStateRegistryImpl(savedStateRegistryOwner, new d(savedStateRegistryOwner, 1)));
        }
    }

    public SavedStateRegistryController(SavedStateRegistryImpl savedStateRegistryImpl) {
        this.f3732a = savedStateRegistryImpl;
        this.b = new SavedStateRegistry(savedStateRegistryImpl);
    }

    public final void a(Bundle bundle) {
        SavedStateRegistryImpl savedStateRegistryImpl = this.f3732a;
        SavedStateRegistryOwner savedStateRegistryOwner = savedStateRegistryImpl.f3734a;
        if (!savedStateRegistryImpl.e) {
            savedStateRegistryImpl.a();
        }
        if (savedStateRegistryOwner.getD().getD().compareTo(Lifecycle.State.g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + savedStateRegistryOwner.getD().getD()).toString());
        }
        if (savedStateRegistryImpl.g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleI = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleI = SavedStateReader.i(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        savedStateRegistryImpl.f = bundleI;
        savedStateRegistryImpl.g = true;
    }

    public final void b(Bundle bundle) {
        SavedStateRegistryImpl savedStateRegistryImpl = this.f3732a;
        Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle2 = savedStateRegistryImpl.f;
        if (bundle2 != null) {
            bundleA.putAll(bundle2);
        }
        synchronized (savedStateRegistryImpl.c) {
            for (Map.Entry entry : savedStateRegistryImpl.d.entrySet()) {
                SavedStateWriter.d(bundleA, (String) entry.getKey(), ((SavedStateRegistry.SavedStateProvider) entry.getValue()).a());
            }
        }
        if (bundleA.isEmpty()) {
            return;
        }
        SavedStateWriter.d(bundle, "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }
}
