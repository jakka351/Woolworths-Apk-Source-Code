package kotlin.text;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/CharCategory;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CharCategory {
    public static final /* synthetic */ CharCategory[] d;
    public static final /* synthetic */ EnumEntries e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CharCategory[] charCategoryArr = {new CharCategory("UNASSIGNED", 0), new CharCategory("UPPERCASE_LETTER", 1), new CharCategory("LOWERCASE_LETTER", 2), new CharCategory("TITLECASE_LETTER", 3), new CharCategory("MODIFIER_LETTER", 4), new CharCategory("OTHER_LETTER", 5), new CharCategory("NON_SPACING_MARK", 6), new CharCategory("ENCLOSING_MARK", 7), new CharCategory("COMBINING_SPACING_MARK", 8), new CharCategory("DECIMAL_DIGIT_NUMBER", 9), new CharCategory("LETTER_NUMBER", 10), new CharCategory("OTHER_NUMBER", 11), new CharCategory("SPACE_SEPARATOR", 12), new CharCategory("LINE_SEPARATOR", 13), new CharCategory("PARAGRAPH_SEPARATOR", 14), new CharCategory("CONTROL", 15), new CharCategory("FORMAT", 16), new CharCategory("PRIVATE_USE", 17), new CharCategory("SURROGATE", 18), new CharCategory("DASH_PUNCTUATION", 19), new CharCategory("START_PUNCTUATION", 20), new CharCategory("END_PUNCTUATION", 21), new CharCategory("CONNECTOR_PUNCTUATION", 22), new CharCategory("OTHER_PUNCTUATION", 23), new CharCategory("MATH_SYMBOL", 24), new CharCategory("CURRENCY_SYMBOL", 25), new CharCategory("MODIFIER_SYMBOL", 26), new CharCategory("OTHER_SYMBOL", 27), new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28), new CharCategory("FINAL_QUOTE_PUNCTUATION", 29)};
        d = charCategoryArr;
        e = EnumEntriesKt.a(charCategoryArr);
    }

    public static CharCategory valueOf(String str) {
        return (CharCategory) Enum.valueOf(CharCategory.class, str);
    }

    public static CharCategory[] values() {
        return (CharCategory[]) d.clone();
    }
}
