package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001¨\u0006\u0004"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableState$Companion$CREATOR$1", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ParcelableSnapshotMutableState$Companion$CREATOR$1 implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
    public static ParcelableSnapshotMutableState a(Parcel parcel, ClassLoader classLoader) {
        SnapshotMutationPolicy snapshotMutationPolicy;
        if (classLoader == null) {
            classLoader = ParcelableSnapshotMutableState$Companion$CREATOR$1.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            snapshotMutationPolicy = NeverEqualPolicy.f1650a;
        } else if (i == 1) {
            snapshotMutationPolicy = StructuralEqualityPolicy.f1671a;
        } else {
            if (i != 2) {
                throw new IllegalStateException(YU.a.e(i, "Unsupported MutableState policy ", " was restored"));
            }
            snapshotMutationPolicy = ReferentialEqualityPolicy.f1660a;
        }
        return new ParcelableSnapshotMutableState(value, snapshotMutationPolicy);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new ParcelableSnapshotMutableState[i];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
