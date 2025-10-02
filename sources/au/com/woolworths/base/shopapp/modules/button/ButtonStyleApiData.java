package au.com.woolworths.base.shopapp.modules.button;

import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/button/ButtonStyleApiData;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "TERTIARY", "DESTRUCTIVE", "INSTOCK", "INFO", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ButtonStyleApiData {

    @SerializedName("DESTRUCTIVE")
    @MappedName
    public static final ButtonStyleApiData DESTRUCTIVE;

    @SerializedName("INFO")
    @MappedName
    public static final ButtonStyleApiData INFO;

    @SerializedName("INSTOCK")
    @MappedName
    public static final ButtonStyleApiData INSTOCK;

    @SerializedName("PRIMARY")
    @MappedName
    public static final ButtonStyleApiData PRIMARY;

    @SerializedName("SECONDARY")
    @MappedName
    public static final ButtonStyleApiData SECONDARY;

    @SerializedName("TERTIARY")
    @MappedName
    public static final ButtonStyleApiData TERTIARY;
    public static final ButtonStyleApiData d;
    public static final /* synthetic */ ButtonStyleApiData[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ButtonStyleApiData buttonStyleApiData = new ButtonStyleApiData("PRIMARY", 0);
        PRIMARY = buttonStyleApiData;
        ButtonStyleApiData buttonStyleApiData2 = new ButtonStyleApiData("SECONDARY", 1);
        SECONDARY = buttonStyleApiData2;
        ButtonStyleApiData buttonStyleApiData3 = new ButtonStyleApiData("TERTIARY", 2);
        TERTIARY = buttonStyleApiData3;
        ButtonStyleApiData buttonStyleApiData4 = new ButtonStyleApiData("DESTRUCTIVE", 3);
        DESTRUCTIVE = buttonStyleApiData4;
        ButtonStyleApiData buttonStyleApiData5 = new ButtonStyleApiData("INSTOCK", 4);
        INSTOCK = buttonStyleApiData5;
        ButtonStyleApiData buttonStyleApiData6 = new ButtonStyleApiData("INFO", 5);
        INFO = buttonStyleApiData6;
        ButtonStyleApiData buttonStyleApiData7 = new ButtonStyleApiData("UNKNOWN", 6);
        d = buttonStyleApiData7;
        ButtonStyleApiData[] buttonStyleApiDataArr = {buttonStyleApiData, buttonStyleApiData2, buttonStyleApiData3, buttonStyleApiData4, buttonStyleApiData5, buttonStyleApiData6, buttonStyleApiData7};
        e = buttonStyleApiDataArr;
        f = EnumEntriesKt.a(buttonStyleApiDataArr);
    }

    private ButtonStyleApiData(String str, int i) {
    }

    public static ButtonStyleApiData valueOf(String str) {
        return (ButtonStyleApiData) Enum.valueOf(ButtonStyleApiData.class, str);
    }

    public static ButtonStyleApiData[] values() {
        return (ButtonStyleApiData[]) e.clone();
    }
}
