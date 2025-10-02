package androidx.navigation.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.navigation.compose.internal.WeakReference;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/compose/BackStackEntryIdViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/SavedStateHandle;", "handle", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BackStackEntryIdViewModel extends ViewModel {
    public final String e;
    public WeakReference f;

    public BackStackEntryIdViewModel(@NotNull SavedStateHandle savedStateHandle) {
        String string = (String) savedStateHandle.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            savedStateHandle.b(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.e = string;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        WeakReference weakReference = this.f;
        if (weakReference == null) {
            Intrinsics.p("saveableStateHolderRef");
            throw null;
        }
        SaveableStateHolder saveableStateHolder = (SaveableStateHolder) weakReference.f3500a.get();
        if (saveableStateHolder != null) {
            saveableStateHolder.d(this.e);
        }
        WeakReference weakReference2 = this.f;
        if (weakReference2 != null) {
            weakReference2.f3500a.clear();
        } else {
            Intrinsics.p("saveableStateHolderRef");
            throw null;
        }
    }
}
