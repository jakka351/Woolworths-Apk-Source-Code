package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/DisposableSaveableStateRegistry;", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry implements SaveableStateRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final Function0 f1967a;
    public final /* synthetic */ SaveableStateRegistry b;

    public DisposableSaveableStateRegistry(SaveableStateRegistry saveableStateRegistry, Function0 function0) {
        this.f1967a = function0;
        this.b = saveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final boolean a(Object obj) {
        return this.b.a(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final SaveableStateRegistry.Entry b(String str, Function0 function0) {
        return this.b.b(str, function0);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Map c() {
        return this.b.c();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public final Object e(String str) {
        return this.b.e(str);
    }
}
