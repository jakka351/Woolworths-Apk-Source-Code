package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint
/* loaded from: classes.dex */
final class ParcelableSnapshotMutableState<T> extends SnapshotMutableStateImpl<T> implements Parcelable {

    @JvmField
    @NotNull
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new ParcelableSnapshotMutableState$Companion$CREATOR$1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$Companion;", "", "", "PolicyNeverEquals", "I", "PolicyReferentialEquality", "PolicyStructuralEquality", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getD());
        NeverEqualPolicy neverEqualPolicy = NeverEqualPolicy.f1650a;
        SnapshotMutationPolicy snapshotMutationPolicy = this.e;
        if (Intrinsics.c(snapshotMutationPolicy, neverEqualPolicy)) {
            i2 = 0;
        } else if (Intrinsics.c(snapshotMutationPolicy, StructuralEqualityPolicy.f1671a)) {
            i2 = 1;
        } else {
            if (!Intrinsics.c(snapshotMutationPolicy, ReferentialEqualityPolicy.f1660a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
