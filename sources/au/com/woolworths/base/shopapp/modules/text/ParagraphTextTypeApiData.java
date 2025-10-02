package au.com.woolworths.base.shopapp.modules.text;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/text/ParagraphTextTypeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "BODY", "CAPTION", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ParagraphTextTypeApiData {

    @SerializedName("BODY")
    public static final ParagraphTextTypeApiData BODY;

    @SerializedName("CAPTION")
    public static final ParagraphTextTypeApiData CAPTION;
    public static final ParagraphTextTypeApiData d;
    public static final /* synthetic */ ParagraphTextTypeApiData[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        ParagraphTextTypeApiData paragraphTextTypeApiData = new ParagraphTextTypeApiData("BODY", 0);
        BODY = paragraphTextTypeApiData;
        ParagraphTextTypeApiData paragraphTextTypeApiData2 = new ParagraphTextTypeApiData("CAPTION", 1);
        CAPTION = paragraphTextTypeApiData2;
        ParagraphTextTypeApiData paragraphTextTypeApiData3 = new ParagraphTextTypeApiData("UNKNOWN", 2);
        d = paragraphTextTypeApiData3;
        ParagraphTextTypeApiData[] paragraphTextTypeApiDataArr = {paragraphTextTypeApiData, paragraphTextTypeApiData2, paragraphTextTypeApiData3};
        e = paragraphTextTypeApiDataArr;
        f = EnumEntriesKt.a(paragraphTextTypeApiDataArr);
    }

    private ParagraphTextTypeApiData(String str, int i) {
    }

    public static ParagraphTextTypeApiData valueOf(String str) {
        return (ParagraphTextTypeApiData) Enum.valueOf(ParagraphTextTypeApiData.class, str);
    }

    public static ParagraphTextTypeApiData[] values() {
        return (ParagraphTextTypeApiData[]) e.clone();
    }
}
