package me.oriient.internal.services.sensorsManager;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.sensorsManager.SensorManagerError;

/* loaded from: classes7.dex */
public final class J implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.h(parcel, "parcel");
        return new SensorManagerError.SensorsStuck(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new SensorManagerError.SensorsStuck[i];
    }
}
