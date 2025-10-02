package au.com.woolworths.foundation.shop.bottomsheet;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/bottomsheet/PresentationStyle;", "", "<init>", "(Ljava/lang/String;I)V", "BOTTOMSHEET", "POPUP", "bottomsheet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PresentationStyle {

    @DefaultValue
    @SerializedName("BOTTOMSHEET")
    public static final PresentationStyle BOTTOMSHEET;

    @SerializedName("POPUP")
    public static final PresentationStyle POPUP;
    public static final /* synthetic */ PresentationStyle[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        PresentationStyle presentationStyle = new PresentationStyle("BOTTOMSHEET", 0);
        BOTTOMSHEET = presentationStyle;
        PresentationStyle presentationStyle2 = new PresentationStyle("POPUP", 1);
        POPUP = presentationStyle2;
        PresentationStyle[] presentationStyleArr = {presentationStyle, presentationStyle2};
        d = presentationStyleArr;
        e = EnumEntriesKt.a(presentationStyleArr);
    }

    private PresentationStyle(String str, int i) {
    }

    public static PresentationStyle valueOf(String str) {
        return (PresentationStyle) Enum.valueOf(PresentationStyle.class, str);
    }

    public static PresentationStyle[] values() {
        return (PresentationStyle[]) d.clone();
    }
}
