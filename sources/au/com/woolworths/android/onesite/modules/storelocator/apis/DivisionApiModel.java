package au.com.woolworths.android.onesite.modules.storelocator.apis;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/storelocator/apis/DivisionApiModel;", "", "<init>", "(Ljava/lang/String;I)V", "SUPERMARKETS", "PETROL", "BWS", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DivisionApiModel {

    @SerializedName("BWS")
    public static final DivisionApiModel BWS;

    @SerializedName("PETROL")
    public static final DivisionApiModel PETROL;

    @SerializedName("SUPERMARKETS")
    public static final DivisionApiModel SUPERMARKETS;
    public static final /* synthetic */ DivisionApiModel[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        DivisionApiModel divisionApiModel = new DivisionApiModel("SUPERMARKETS", 0);
        SUPERMARKETS = divisionApiModel;
        DivisionApiModel divisionApiModel2 = new DivisionApiModel("PETROL", 1);
        PETROL = divisionApiModel2;
        DivisionApiModel divisionApiModel3 = new DivisionApiModel("BWS", 2);
        BWS = divisionApiModel3;
        DivisionApiModel[] divisionApiModelArr = {divisionApiModel, divisionApiModel2, divisionApiModel3};
        d = divisionApiModelArr;
        e = EnumEntriesKt.a(divisionApiModelArr);
    }

    private DivisionApiModel(String str, int i) {
    }

    public static DivisionApiModel valueOf(String str) {
        return (DivisionApiModel) Enum.valueOf(DivisionApiModel.class, str);
    }

    public static DivisionApiModel[] values() {
        return (DivisionApiModel[]) d.clone();
    }
}
