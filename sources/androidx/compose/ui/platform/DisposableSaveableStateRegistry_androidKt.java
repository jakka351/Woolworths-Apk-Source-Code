package androidx.compose.ui.platform;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.io.Serializable;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final Class[] f1968a = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final boolean a(Object obj) {
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getE() == SnapshotStateKt.g() || snapshotMutableState.getE() == SnapshotStateKt.n() || snapshotMutableState.getE() == SnapshotStateKt.k()) {
                Object d = snapshotMutableState.getD();
                if (d == null) {
                    return true;
                }
                return a(d);
            }
        } else {
            if ((obj instanceof Function) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i = 0; i < 7; i++) {
                if (f1968a[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
