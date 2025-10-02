package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/activity/result/ActivityResult$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/ActivityResult;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ActivityResult$Companion$CREATOR$1 implements Parcelable.Creator<ActivityResult> {
    @Override // android.os.Parcelable.Creator
    public final ActivityResult createFromParcel(Parcel parcel) {
        Intrinsics.h(parcel, "parcel");
        return new ActivityResult(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final ActivityResult[] newArray(int i) {
        return new ActivityResult[i];
    }
}
