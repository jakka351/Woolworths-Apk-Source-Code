package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraButtonStyle;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EverydayExtraButtonStyle {
    public static final Companion e;
    public static final EnumType f;
    public static final EverydayExtraButtonStyle g;
    public static final /* synthetic */ EverydayExtraButtonStyle[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/EverydayExtraButtonStyle$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        EverydayExtraButtonStyle everydayExtraButtonStyle = new EverydayExtraButtonStyle("PRIMARY", 0, "PRIMARY");
        EverydayExtraButtonStyle everydayExtraButtonStyle2 = new EverydayExtraButtonStyle("SECONDARY", 1, "SECONDARY");
        EverydayExtraButtonStyle everydayExtraButtonStyle3 = new EverydayExtraButtonStyle("TERTIARY", 2, "TERTIARY");
        EverydayExtraButtonStyle everydayExtraButtonStyle4 = new EverydayExtraButtonStyle("UNKNOWN__", 3, "UNKNOWN__");
        g = everydayExtraButtonStyle4;
        EverydayExtraButtonStyle[] everydayExtraButtonStyleArr = {everydayExtraButtonStyle, everydayExtraButtonStyle2, everydayExtraButtonStyle3, everydayExtraButtonStyle4};
        h = everydayExtraButtonStyleArr;
        i = EnumEntriesKt.a(everydayExtraButtonStyleArr);
        e = new Companion();
        f = new EnumType("EverydayExtraButtonStyle", CollectionsKt.R("PRIMARY", "SECONDARY", "TERTIARY"));
    }

    public EverydayExtraButtonStyle(String str, int i2, String str2) {
        this.d = str2;
    }

    public static EverydayExtraButtonStyle valueOf(String str) {
        return (EverydayExtraButtonStyle) Enum.valueOf(EverydayExtraButtonStyle.class, str);
    }

    public static EverydayExtraButtonStyle[] values() {
        return (EverydayExtraButtonStyle[]) h.clone();
    }
}
