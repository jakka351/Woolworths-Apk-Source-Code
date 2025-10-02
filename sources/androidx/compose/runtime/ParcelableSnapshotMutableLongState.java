package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.SnapshotMutableLongStateImpl;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState;", "Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroid/os/Parcelable;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint
/* loaded from: classes2.dex */
final class ParcelableSnapshotMutableLongState extends SnapshotMutableLongStateImpl implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new ParcelableSnapshotMutableLongState$Companion$CREATOR$1();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableLongState$Companion;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public ParcelableSnapshotMutableLongState(long j) {
        Snapshot snapshotK = SnapshotKt.k();
        SnapshotMutableLongStateImpl.LongStateStateRecord longStateStateRecord = new SnapshotMutableLongStateImpl.LongStateStateRecord(snapshotK.getB(), j);
        if (!(snapshotK instanceof GlobalSnapshot)) {
            longStateStateRecord.b = new SnapshotMutableLongStateImpl.LongStateStateRecord(1, j);
        }
        this.e = longStateStateRecord;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(e());
    }
}
