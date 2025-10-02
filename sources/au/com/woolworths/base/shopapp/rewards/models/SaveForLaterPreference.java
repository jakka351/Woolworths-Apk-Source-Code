package au.com.woolworths.base.shopapp.rewards.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/shopapp/rewards/models/SaveForLaterPreference;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOMATIC", "QUARTERLY_QFF", "CHRISTMAS", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SaveForLaterPreference {

    @SerializedName("AUTOMATIC")
    public static final SaveForLaterPreference AUTOMATIC;

    @SerializedName("CHRISTMAS")
    public static final SaveForLaterPreference CHRISTMAS;

    @SerializedName("QUARTERLY_QFF")
    public static final SaveForLaterPreference QUARTERLY_QFF;
    public static final /* synthetic */ SaveForLaterPreference[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        SaveForLaterPreference saveForLaterPreference = new SaveForLaterPreference("AUTOMATIC", 0);
        AUTOMATIC = saveForLaterPreference;
        SaveForLaterPreference saveForLaterPreference2 = new SaveForLaterPreference("QUARTERLY_QFF", 1);
        QUARTERLY_QFF = saveForLaterPreference2;
        SaveForLaterPreference saveForLaterPreference3 = new SaveForLaterPreference("CHRISTMAS", 2);
        CHRISTMAS = saveForLaterPreference3;
        SaveForLaterPreference[] saveForLaterPreferenceArr = {saveForLaterPreference, saveForLaterPreference2, saveForLaterPreference3};
        d = saveForLaterPreferenceArr;
        e = EnumEntriesKt.a(saveForLaterPreferenceArr);
    }

    private SaveForLaterPreference(String str, int i) {
    }

    public static SaveForLaterPreference valueOf(String str) {
        return (SaveForLaterPreference) Enum.valueOf(SaveForLaterPreference.class, str);
    }

    public static SaveForLaterPreference[] values() {
        return (SaveForLaterPreference[]) d.clone();
    }
}
