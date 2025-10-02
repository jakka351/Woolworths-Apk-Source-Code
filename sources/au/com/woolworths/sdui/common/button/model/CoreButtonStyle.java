package au.com.woolworths.sdui.common.button.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/button/model/CoreButtonStyle;", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoreButtonStyle {
    public static final CoreButtonStyle d;
    public static final CoreButtonStyle e;
    public static final CoreButtonStyle f;
    public static final CoreButtonStyle g;
    public static final /* synthetic */ CoreButtonStyle[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        CoreButtonStyle coreButtonStyle = new CoreButtonStyle("PRIMARY", 0);
        d = coreButtonStyle;
        CoreButtonStyle coreButtonStyle2 = new CoreButtonStyle("SECONDARY", 1);
        e = coreButtonStyle2;
        CoreButtonStyle coreButtonStyle3 = new CoreButtonStyle("TERTIARY", 2);
        f = coreButtonStyle3;
        CoreButtonStyle coreButtonStyle4 = new CoreButtonStyle("DESTRUCTIVE", 3);
        g = coreButtonStyle4;
        CoreButtonStyle[] coreButtonStyleArr = {coreButtonStyle, coreButtonStyle2, coreButtonStyle3, coreButtonStyle4};
        h = coreButtonStyleArr;
        i = EnumEntriesKt.a(coreButtonStyleArr);
    }

    public static CoreButtonStyle valueOf(String str) {
        return (CoreButtonStyle) Enum.valueOf(CoreButtonStyle.class, str);
    }

    public static CoreButtonStyle[] values() {
        return (CoreButtonStyle[]) h.clone();
    }
}
