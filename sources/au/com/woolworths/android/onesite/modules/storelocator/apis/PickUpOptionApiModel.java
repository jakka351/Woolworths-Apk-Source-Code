package au.com.woolworths.android.onesite.modules.storelocator.apis;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/storelocator/apis/PickUpOptionApiModel;", "", "<init>", "(Ljava/lang/String;I)V", "DRIVE_THRU", "IN_STORE", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PickUpOptionApiModel {

    @SerializedName("DriveThru")
    public static final PickUpOptionApiModel DRIVE_THRU;

    @SerializedName("Instore")
    public static final PickUpOptionApiModel IN_STORE;
    public static final /* synthetic */ PickUpOptionApiModel[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        PickUpOptionApiModel pickUpOptionApiModel = new PickUpOptionApiModel("DRIVE_THRU", 0);
        DRIVE_THRU = pickUpOptionApiModel;
        PickUpOptionApiModel pickUpOptionApiModel2 = new PickUpOptionApiModel("IN_STORE", 1);
        IN_STORE = pickUpOptionApiModel2;
        PickUpOptionApiModel[] pickUpOptionApiModelArr = {pickUpOptionApiModel, pickUpOptionApiModel2};
        d = pickUpOptionApiModelArr;
        e = EnumEntriesKt.a(pickUpOptionApiModelArr);
    }

    private PickUpOptionApiModel(String str, int i) {
    }

    public static PickUpOptionApiModel valueOf(String str) {
        return (PickUpOptionApiModel) Enum.valueOf(PickUpOptionApiModel.class, str);
    }

    public static PickUpOptionApiModel[] values() {
        return (PickUpOptionApiModel[]) d.clone();
    }
}
