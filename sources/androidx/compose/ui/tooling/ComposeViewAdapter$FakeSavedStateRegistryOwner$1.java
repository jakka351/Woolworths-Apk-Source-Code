package androidx.compose.ui.tooling;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.os.SavedStateRegistry;
import androidx.os.SavedStateRegistryController;
import androidx.os.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/tooling/ComposeViewAdapter$FakeSavedStateRegistryOwner$1", "Landroidx/savedstate/SavedStateRegistryOwner;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ComposeViewAdapter$FakeSavedStateRegistryOwner$1 implements SavedStateRegistryOwner {
    public final LifecycleRegistry d;
    public final SavedStateRegistryController e;

    public ComposeViewAdapter$FakeSavedStateRegistryOwner$1() {
        LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this, false);
        this.d = lifecycleRegistry;
        SavedStateRegistryController savedStateRegistryControllerA = SavedStateRegistryController.Companion.a(this);
        savedStateRegistryControllerA.a(new Bundle());
        this.e = savedStateRegistryControllerA;
        lifecycleRegistry.h(Lifecycle.State.h);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    /* renamed from: getLifecycle */
    public final Lifecycle getD() {
        return this.d;
    }

    @Override // androidx.os.SavedStateRegistryOwner
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.e.b;
    }
}
