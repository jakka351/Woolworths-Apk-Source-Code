package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/TextElementType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextElementType {
    public static final Companion e;
    public static final TextElementType f;
    public static final /* synthetic */ TextElementType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/TextElementType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        TextElementType textElementType = new TextElementType("BOLD", 0, "BOLD");
        TextElementType textElementType2 = new TextElementType("PLAIN", 1, "PLAIN");
        TextElementType textElementType3 = new TextElementType("UNKNOWN__", 2, "UNKNOWN__");
        f = textElementType3;
        TextElementType[] textElementTypeArr = {textElementType, textElementType2, textElementType3};
        g = textElementTypeArr;
        h = EnumEntriesKt.a(textElementTypeArr);
        e = new Companion();
        CollectionsKt.R("BOLD", "PLAIN");
    }

    public TextElementType(String str, int i, String str2) {
        this.d = str2;
    }

    public static TextElementType valueOf(String str) {
        return (TextElementType) Enum.valueOf(TextElementType.class, str);
    }

    public static TextElementType[] values() {
        return (TextElementType[]) g.clone();
    }
}
