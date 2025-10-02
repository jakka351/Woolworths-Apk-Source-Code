package androidx.os.internal;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.d;
import androidx.os.SavedStateRegistryOwner;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl;", "", "Companion", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SavedStateRegistryImpl {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateRegistryOwner f3734a;
    public final d b;
    public boolean e;
    public Bundle f;
    public boolean g;
    public final SynchronizedObject c = new SynchronizedObject();
    public final LinkedHashMap d = new LinkedHashMap();
    public boolean h = true;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/savedstate/internal/SavedStateRegistryImpl$Companion;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public SavedStateRegistryImpl(SavedStateRegistryOwner savedStateRegistryOwner, d dVar) {
        this.f3734a = savedStateRegistryOwner;
        this.b = dVar;
    }

    public final void a() {
        SavedStateRegistryOwner savedStateRegistryOwner = this.f3734a;
        if (savedStateRegistryOwner.getD().getD() != Lifecycle.State.e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.b.invoke();
        savedStateRegistryOwner.getD().a(new a(this, 0));
        this.e = true;
    }
}
