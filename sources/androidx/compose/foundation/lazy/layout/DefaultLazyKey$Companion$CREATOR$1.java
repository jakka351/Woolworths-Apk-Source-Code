package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/lazy/layout/DefaultLazyKey$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultLazyKey$Companion$CREATOR$1 implements Parcelable.Creator<DefaultLazyKey> {
    @Override // android.os.Parcelable.Creator
    public final DefaultLazyKey createFromParcel(Parcel parcel) {
        return new DefaultLazyKey(parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final DefaultLazyKey[] newArray(int i) {
        return new DefaultLazyKey[i];
    }
}
