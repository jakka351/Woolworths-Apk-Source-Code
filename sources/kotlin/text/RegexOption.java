package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/RegexOption;", "Lkotlin/text/FlagEnum;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RegexOption implements FlagEnum {
    public static final RegexOption e;
    public static final /* synthetic */ RegexOption[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int d;

    static {
        RegexOption regexOption = new RegexOption("IGNORE_CASE", 0, 2);
        e = regexOption;
        RegexOption[] regexOptionArr = {regexOption, new RegexOption("MULTILINE", 1, 8), new RegexOption("LITERAL", 2, 16), new RegexOption("UNIX_LINES", 3, 1), new RegexOption("COMMENTS", 4, 4), new RegexOption("DOT_MATCHES_ALL", 5, 32), new RegexOption("CANON_EQ", 6, 128)};
        f = regexOptionArr;
        g = EnumEntriesKt.a(regexOptionArr);
    }

    public RegexOption(String str, int i, int i2) {
        this.d = i2;
    }

    public static RegexOption valueOf(String str) {
        return (RegexOption) Enum.valueOf(RegexOption.class, str);
    }

    public static RegexOption[] values() {
        return (RegexOption[]) f.clone();
    }

    @Override // kotlin.text.FlagEnum
    /* renamed from: getValue, reason: from getter */
    public final int getD() {
        return this.d;
    }
}
