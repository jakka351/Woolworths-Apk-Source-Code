package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateWriter;
import java.util.Arrays;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SavedStateHandlesProvider implements SavedStateRegistry.SavedStateProvider {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateRegistry f2797a;
    public boolean b;
    public Bundle c;
    public final Lazy d;

    public SavedStateHandlesProvider(SavedStateRegistry savedStateRegistry, ViewModelStoreOwner viewModelStoreOwner) {
        Intrinsics.h(savedStateRegistry, "savedStateRegistry");
        this.f2797a = savedStateRegistry;
        this.d = LazyKt.b(new d(viewModelStoreOwner, 0));
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final Bundle a() {
        Bundle bundleA = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleA.putAll(bundle);
        }
        for (Map.Entry entry : ((SavedStateHandlesVM) this.d.getD()).e.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA2 = ((SavedStateHandle) entry.getValue()).b.e.a();
            if (!bundleA2.isEmpty()) {
                SavedStateWriter.d(bundleA, str, bundleA2);
            }
        }
        this.b = false;
        return bundleA;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.f2797a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleA2 = BundleKt.a((Pair[]) Arrays.copyOf(new Pair[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleA2.putAll(bundle);
        }
        if (bundleA != null) {
            bundleA2.putAll(bundleA);
        }
        this.c = bundleA2;
        this.b = true;
    }
}
