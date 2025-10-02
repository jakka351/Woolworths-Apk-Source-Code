package au.com.woolworths.base.shopapp.modules.listsectionheader;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/listsectionheader/ListSectionHeaderTypeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListSectionHeaderTypeApiData {

    @SerializedName("PRIMARY")
    public static final ListSectionHeaderTypeApiData PRIMARY;

    @SerializedName("SECONDARY")
    public static final ListSectionHeaderTypeApiData SECONDARY;
    public static final ListSectionHeaderTypeApiData d;
    public static final /* synthetic */ ListSectionHeaderTypeApiData[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ListSectionHeaderTypeApiData listSectionHeaderTypeApiData = new ListSectionHeaderTypeApiData("PRIMARY", 0);
        PRIMARY = listSectionHeaderTypeApiData;
        ListSectionHeaderTypeApiData listSectionHeaderTypeApiData2 = new ListSectionHeaderTypeApiData("SECONDARY", 1);
        SECONDARY = listSectionHeaderTypeApiData2;
        ListSectionHeaderTypeApiData listSectionHeaderTypeApiData3 = new ListSectionHeaderTypeApiData("UNKNOWN", 2);
        d = listSectionHeaderTypeApiData3;
        ListSectionHeaderTypeApiData[] listSectionHeaderTypeApiDataArr = {listSectionHeaderTypeApiData, listSectionHeaderTypeApiData2, listSectionHeaderTypeApiData3};
        e = listSectionHeaderTypeApiDataArr;
        f = EnumEntriesKt.a(listSectionHeaderTypeApiDataArr);
    }

    private ListSectionHeaderTypeApiData(String str, int i) {
    }

    public static ListSectionHeaderTypeApiData valueOf(String str) {
        return (ListSectionHeaderTypeApiData) Enum.valueOf(ListSectionHeaderTypeApiData.class, str);
    }

    public static ListSectionHeaderTypeApiData[] values() {
        return (ListSectionHeaderTypeApiData[]) e.clone();
    }
}
