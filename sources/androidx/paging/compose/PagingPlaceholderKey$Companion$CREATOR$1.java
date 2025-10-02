package androidx.paging.compose;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/paging/compose/PagingPlaceholderKey$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Landroidx/paging/compose/PagingPlaceholderKey;", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PagingPlaceholderKey$Companion$CREATOR$1 implements Parcelable.Creator<PagingPlaceholderKey> {
    @Override // android.os.Parcelable.Creator
    public final PagingPlaceholderKey createFromParcel(Parcel parcel) {
        Intrinsics.h(parcel, "parcel");
        return new PagingPlaceholderKey(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final PagingPlaceholderKey[] newArray(int i) {
        return new PagingPlaceholderKey[i];
    }
}
