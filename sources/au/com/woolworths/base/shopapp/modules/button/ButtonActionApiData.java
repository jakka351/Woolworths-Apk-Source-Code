package au.com.woolworths.base.shopapp.modules.button;

import au.com.woolworths.graphql.MappedValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/button/ButtonActionApiData;", "", "<init>", "(Ljava/lang/String;I)V", "ADD_TO_CART", "CANCEL_ORDER", "CHANGE_STORE", "CHECK_IN_15_MIN_AWAY", "CHECK_IN_IM_HERE", "CHECK_IN_ON_MY_WAY", "CONTINUE_AS_GUEST", "EDIT_ORDER", "LINK", "LOGIN", "SAVE_TO_LIST", "SET_LOCATION_TRACKING_PERMISSIONS", "SHOW_MAP", "SIGN_UP", "SKIP_LOCATION_TRACKING_PERMISSIONS", "TERMS_AND_CONDITIONS", "UPDATE_LOCATION_TRACKING_PERMISSIONS", "VIEW_INVOICE", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonActionApiData {

    @MappedValue
    @SerializedName("add-to-cart")
    public static final ButtonActionApiData ADD_TO_CART;

    @MappedValue
    @SerializedName("cancel-order")
    public static final ButtonActionApiData CANCEL_ORDER;

    @MappedValue
    @SerializedName("change-store")
    public static final ButtonActionApiData CHANGE_STORE;

    @MappedValue
    @SerializedName("checkin-15mins-away")
    public static final ButtonActionApiData CHECK_IN_15_MIN_AWAY;

    @MappedValue
    @SerializedName("checkin-im-here")
    public static final ButtonActionApiData CHECK_IN_IM_HERE;

    @MappedValue
    @SerializedName("checkin-on-my-way")
    public static final ButtonActionApiData CHECK_IN_ON_MY_WAY;

    @MappedValue
    @SerializedName("continue-as-guest")
    public static final ButtonActionApiData CONTINUE_AS_GUEST;

    @MappedValue
    @SerializedName("edit-order")
    public static final ButtonActionApiData EDIT_ORDER;

    @MappedValue
    @SerializedName("LINK")
    public static final ButtonActionApiData LINK;

    @MappedValue
    @SerializedName("login")
    public static final ButtonActionApiData LOGIN;

    @MappedValue
    @SerializedName("save-to-list")
    public static final ButtonActionApiData SAVE_TO_LIST;

    @MappedValue
    @SerializedName("set-location-tracking-permissions")
    public static final ButtonActionApiData SET_LOCATION_TRACKING_PERMISSIONS;

    @MappedValue
    @SerializedName("SHOW_MAP")
    public static final ButtonActionApiData SHOW_MAP;

    @MappedValue
    @SerializedName("sign-up")
    public static final ButtonActionApiData SIGN_UP;

    @MappedValue
    @SerializedName("skip-location-tracking-permissions")
    public static final ButtonActionApiData SKIP_LOCATION_TRACKING_PERMISSIONS;

    @MappedValue
    @SerializedName("terms-and-conditions")
    public static final ButtonActionApiData TERMS_AND_CONDITIONS;

    @MappedValue
    @SerializedName("update-location-tracking-permissions")
    public static final ButtonActionApiData UPDATE_LOCATION_TRACKING_PERMISSIONS;

    @MappedValue
    @SerializedName("view-invoice")
    public static final ButtonActionApiData VIEW_INVOICE;
    public static final ButtonActionApiData d;
    public static final /* synthetic */ ButtonActionApiData[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ButtonActionApiData buttonActionApiData = new ButtonActionApiData("ADD_TO_CART", 0);
        ADD_TO_CART = buttonActionApiData;
        ButtonActionApiData buttonActionApiData2 = new ButtonActionApiData("CANCEL_ORDER", 1);
        CANCEL_ORDER = buttonActionApiData2;
        ButtonActionApiData buttonActionApiData3 = new ButtonActionApiData("CHANGE_STORE", 2);
        CHANGE_STORE = buttonActionApiData3;
        ButtonActionApiData buttonActionApiData4 = new ButtonActionApiData("CHECK_IN_15_MIN_AWAY", 3);
        CHECK_IN_15_MIN_AWAY = buttonActionApiData4;
        ButtonActionApiData buttonActionApiData5 = new ButtonActionApiData("CHECK_IN_IM_HERE", 4);
        CHECK_IN_IM_HERE = buttonActionApiData5;
        ButtonActionApiData buttonActionApiData6 = new ButtonActionApiData("CHECK_IN_ON_MY_WAY", 5);
        CHECK_IN_ON_MY_WAY = buttonActionApiData6;
        ButtonActionApiData buttonActionApiData7 = new ButtonActionApiData("CONTINUE_AS_GUEST", 6);
        CONTINUE_AS_GUEST = buttonActionApiData7;
        ButtonActionApiData buttonActionApiData8 = new ButtonActionApiData("EDIT_ORDER", 7);
        EDIT_ORDER = buttonActionApiData8;
        ButtonActionApiData buttonActionApiData9 = new ButtonActionApiData("LINK", 8);
        LINK = buttonActionApiData9;
        ButtonActionApiData buttonActionApiData10 = new ButtonActionApiData("LOGIN", 9);
        LOGIN = buttonActionApiData10;
        ButtonActionApiData buttonActionApiData11 = new ButtonActionApiData("SAVE_TO_LIST", 10);
        SAVE_TO_LIST = buttonActionApiData11;
        ButtonActionApiData buttonActionApiData12 = new ButtonActionApiData("SET_LOCATION_TRACKING_PERMISSIONS", 11);
        SET_LOCATION_TRACKING_PERMISSIONS = buttonActionApiData12;
        ButtonActionApiData buttonActionApiData13 = new ButtonActionApiData("SHOW_MAP", 12);
        SHOW_MAP = buttonActionApiData13;
        ButtonActionApiData buttonActionApiData14 = new ButtonActionApiData("SIGN_UP", 13);
        SIGN_UP = buttonActionApiData14;
        ButtonActionApiData buttonActionApiData15 = new ButtonActionApiData("SKIP_LOCATION_TRACKING_PERMISSIONS", 14);
        SKIP_LOCATION_TRACKING_PERMISSIONS = buttonActionApiData15;
        ButtonActionApiData buttonActionApiData16 = new ButtonActionApiData("TERMS_AND_CONDITIONS", 15);
        TERMS_AND_CONDITIONS = buttonActionApiData16;
        ButtonActionApiData buttonActionApiData17 = new ButtonActionApiData("UNKNOWN", 16);
        d = buttonActionApiData17;
        ButtonActionApiData buttonActionApiData18 = new ButtonActionApiData("UPDATE_LOCATION_TRACKING_PERMISSIONS", 17);
        UPDATE_LOCATION_TRACKING_PERMISSIONS = buttonActionApiData18;
        ButtonActionApiData buttonActionApiData19 = new ButtonActionApiData("VIEW_INVOICE", 18);
        VIEW_INVOICE = buttonActionApiData19;
        ButtonActionApiData[] buttonActionApiDataArr = {buttonActionApiData, buttonActionApiData2, buttonActionApiData3, buttonActionApiData4, buttonActionApiData5, buttonActionApiData6, buttonActionApiData7, buttonActionApiData8, buttonActionApiData9, buttonActionApiData10, buttonActionApiData11, buttonActionApiData12, buttonActionApiData13, buttonActionApiData14, buttonActionApiData15, buttonActionApiData16, buttonActionApiData17, buttonActionApiData18, buttonActionApiData19};
        e = buttonActionApiDataArr;
        f = EnumEntriesKt.a(buttonActionApiDataArr);
    }

    private ButtonActionApiData(String str, int i) {
    }

    public static ButtonActionApiData valueOf(String str) {
        return (ButtonActionApiData) Enum.valueOf(ButtonActionApiData.class, str);
    }

    public static ButtonActionApiData[] values() {
        return (ButtonActionApiData[]) e.clone();
    }
}
