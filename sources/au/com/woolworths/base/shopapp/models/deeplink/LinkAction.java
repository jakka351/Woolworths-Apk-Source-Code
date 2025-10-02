package au.com.woolworths.base.shopapp.models.deeplink;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/base/shopapp/models/deeplink/LinkAction;", "", "<init>", "(Ljava/lang/String;I)V", "WEB_LINK", "DEEP_LINK", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LinkAction {

    @SerializedName("DEEP_LINK")
    public static final LinkAction DEEP_LINK;

    @SerializedName("WEB_LINK")
    public static final LinkAction WEB_LINK;
    public static final /* synthetic */ LinkAction[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        LinkAction linkAction = new LinkAction("WEB_LINK", 0);
        WEB_LINK = linkAction;
        LinkAction linkAction2 = new LinkAction("DEEP_LINK", 1);
        DEEP_LINK = linkAction2;
        LinkAction[] linkActionArr = {linkAction, linkAction2, new LinkAction("UNKNOWN", 2)};
        d = linkActionArr;
        e = EnumEntriesKt.a(linkActionArr);
    }

    private LinkAction(String str, int i) {
    }

    public static LinkAction valueOf(String str) {
        return (LinkAction) Enum.valueOf(LinkAction.class, str);
    }

    public static LinkAction[] values() {
        return (LinkAction[]) d.clone();
    }
}
