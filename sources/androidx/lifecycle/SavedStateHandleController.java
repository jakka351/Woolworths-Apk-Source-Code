package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.os.SavedStateRegistry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/SavedStateHandleController;", "Landroidx/lifecycle/LifecycleEventObserver;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SavedStateHandleController implements LifecycleEventObserver, AutoCloseable {
    public final String d;
    public final SavedStateHandle e;
    public boolean f;

    public SavedStateHandleController(String str, SavedStateHandle savedStateHandle) {
        this.d = str;
        this.e = savedStateHandle;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.f = false;
            lifecycleOwner.getD().c(this);
        }
    }

    public final void a(Lifecycle lifecycle, SavedStateRegistry registry) {
        Intrinsics.h(registry, "registry");
        Intrinsics.h(lifecycle, "lifecycle");
        if (this.f) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f = true;
        lifecycle.a(this);
        registry.c(this.d, this.e.b.e);
    }

    /* renamed from: b, reason: from getter */
    public final SavedStateHandle getE() {
        return this.e;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
