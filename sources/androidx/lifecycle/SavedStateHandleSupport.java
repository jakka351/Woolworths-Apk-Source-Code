package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryOwner;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SavedStateHandleSupport {

    /* renamed from: a, reason: collision with root package name */
    public static final SavedStateHandleSupport$special$$inlined$Key$1 f2796a = new SavedStateHandleSupport$special$$inlined$Key$1();
    public static final SavedStateHandleSupport$special$$inlined$Key$2 b = new SavedStateHandleSupport$special$$inlined$Key$2();
    public static final SavedStateHandleSupport$special$$inlined$Key$3 c = new SavedStateHandleSupport$special$$inlined$Key$3();

    public static final SavedStateHandle a(CreationExtras creationExtras) {
        Intrinsics.h(creationExtras, "<this>");
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) creationExtras.a(f2796a);
        if (savedStateRegistryOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) creationExtras.a(b);
        if (viewModelStoreOwner == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) creationExtras.a(c);
        String str = (String) creationExtras.a(ViewModelProvider.b);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        SavedStateRegistry.SavedStateProvider savedStateProviderB = savedStateRegistryOwner.getSavedStateRegistry().b();
        Bundle bundle2 = null;
        SavedStateHandlesProvider savedStateHandlesProvider = savedStateProviderB instanceof SavedStateHandlesProvider ? (SavedStateHandlesProvider) savedStateProviderB : null;
        if (savedStateHandlesProvider == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = c(viewModelStoreOwner).e;
        SavedStateHandle savedStateHandle = (SavedStateHandle) linkedHashMap.get(str);
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        savedStateHandlesProvider.b();
        Bundle bundle3 = savedStateHandlesProvider.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                savedStateHandlesProvider.c = null;
            }
            bundle2 = bundle4;
        }
        SavedStateHandle savedStateHandleA = SavedStateHandle.Companion.a(bundle2, bundle);
        linkedHashMap.put(str, savedStateHandleA);
        return savedStateHandleA;
    }

    public static final void b(SavedStateRegistryOwner savedStateRegistryOwner) {
        Lifecycle.State d = savedStateRegistryOwner.getD().getD();
        if (d != Lifecycle.State.e && d != Lifecycle.State.f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (savedStateRegistryOwner.getSavedStateRegistry().b() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(savedStateRegistryOwner.getSavedStateRegistry(), (ViewModelStoreOwner) savedStateRegistryOwner);
            savedStateRegistryOwner.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            savedStateRegistryOwner.getD().a(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesVM c(ViewModelStoreOwner viewModelStoreOwner) {
        ViewModelProvider viewModelProviderB = ViewModelProvider.Companion.b(viewModelStoreOwner, new SavedStateHandleSupport$savedStateHandlesVM$1(), 4);
        return (SavedStateHandlesVM) viewModelProviderB.f2802a.a(Reflection.f24268a.b(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
