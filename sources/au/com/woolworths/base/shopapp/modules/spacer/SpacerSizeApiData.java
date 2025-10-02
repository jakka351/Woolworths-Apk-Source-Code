package au.com.woolworths.base.shopapp.modules.spacer;

import au.com.woolworths.graphql.DefaultValue;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/spacer/SpacerSizeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "SMALL", "REGULAR", "LARGE", "X_LARGE", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpacerSizeApiData {

    @SerializedName("LARGE")
    public static final SpacerSizeApiData LARGE;

    @DefaultValue
    @SerializedName("REGULAR")
    public static final SpacerSizeApiData REGULAR;

    @SerializedName("SMALL")
    public static final SpacerSizeApiData SMALL;

    @SerializedName("XLARGE")
    @MappedName
    public static final SpacerSizeApiData X_LARGE;
    public static final /* synthetic */ SpacerSizeApiData[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        SpacerSizeApiData spacerSizeApiData = new SpacerSizeApiData("SMALL", 0);
        SMALL = spacerSizeApiData;
        SpacerSizeApiData spacerSizeApiData2 = new SpacerSizeApiData("REGULAR", 1);
        REGULAR = spacerSizeApiData2;
        SpacerSizeApiData spacerSizeApiData3 = new SpacerSizeApiData("LARGE", 2);
        LARGE = spacerSizeApiData3;
        SpacerSizeApiData spacerSizeApiData4 = new SpacerSizeApiData("X_LARGE", 3);
        X_LARGE = spacerSizeApiData4;
        SpacerSizeApiData[] spacerSizeApiDataArr = {spacerSizeApiData, spacerSizeApiData2, spacerSizeApiData3, spacerSizeApiData4};
        d = spacerSizeApiDataArr;
        e = EnumEntriesKt.a(spacerSizeApiDataArr);
    }

    private SpacerSizeApiData(String str, int i) {
    }

    public static SpacerSizeApiData valueOf(String str) {
        return (SpacerSizeApiData) Enum.valueOf(SpacerSizeApiData.class, str);
    }

    public static SpacerSizeApiData[] values() {
        return (SpacerSizeApiData[]) d.clone();
    }
}
