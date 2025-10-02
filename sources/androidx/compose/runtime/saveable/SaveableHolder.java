package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableHolder;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/runtime/RememberObserver;", "runtime-saveable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class SaveableHolder<T> implements SaverScope, RememberObserver {
    public Saver d;
    public SaveableStateRegistry e;
    public String f;
    public Object g;
    public Object[] h;
    public SaveableStateRegistry.Entry i;
    public final Function0 j = new SaveableHolder$valueProvider$1(this);

    public SaveableHolder(Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        this.d = saver;
        this.e = saveableStateRegistry;
        this.f = str;
        this.g = obj;
        this.h = objArr;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean a(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.e;
        return saveableStateRegistry == null || saveableStateRegistry.a(obj);
    }

    public final void b() {
        String strA;
        SaveableStateRegistry saveableStateRegistry = this.e;
        if (this.i != null) {
            throw new IllegalArgumentException(("entry(" + this.i + ") is not null").toString());
        }
        if (saveableStateRegistry != null) {
            Function0 function0 = this.j;
            Object objInvoke = ((SaveableHolder$valueProvider$1) function0).invoke();
            if (objInvoke == null || saveableStateRegistry.a(objInvoke)) {
                this.i = saveableStateRegistry.b(this.f, function0);
                return;
            }
            if (objInvoke instanceof SnapshotMutableState) {
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) objInvoke;
                if (snapshotMutableState.getE() == SnapshotStateKt.g() || snapshotMutableState.getE() == SnapshotStateKt.n() || snapshotMutableState.getE() == SnapshotStateKt.k()) {
                    strA = "MutableState containing " + snapshotMutableState.getD() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = RememberSaveableKt.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void c() {
        b();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void g() {
        SaveableStateRegistry.Entry entry = this.i;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void i() {
        SaveableStateRegistry.Entry entry = this.i;
        if (entry != null) {
            entry.unregister();
        }
    }
}
