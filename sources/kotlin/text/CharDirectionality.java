package kotlin.text;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CharDirectionality {
    public static final Lazy e;
    public static final /* synthetic */ CharDirectionality[] f;
    public static final /* synthetic */ EnumEntries g;
    public final int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/text/CharDirectionality$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        CharDirectionality[] charDirectionalityArr = {new CharDirectionality("UNDEFINED", 0, -1), new CharDirectionality("LEFT_TO_RIGHT", 1, 0), new CharDirectionality("RIGHT_TO_LEFT", 2, 1), new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2), new CharDirectionality("EUROPEAN_NUMBER", 4, 3), new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4), new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5), new CharDirectionality("ARABIC_NUMBER", 7, 6), new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7), new CharDirectionality("NONSPACING_MARK", 9, 8), new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9), new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10), new CharDirectionality("SEGMENT_SEPARATOR", 12, 11), new CharDirectionality("WHITESPACE", 13, 12), new CharDirectionality("OTHER_NEUTRALS", 14, 13), new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14), new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15), new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16), new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17), new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18)};
        f = charDirectionalityArr;
        g = EnumEntriesKt.a(charDirectionalityArr);
        e = LazyKt.b(new com.woolworths.scanlibrary.domain.payment.b(9));
    }

    public CharDirectionality(String str, int i, int i2) {
        this.d = i2;
    }

    public static CharDirectionality valueOf(String str) {
        return (CharDirectionality) Enum.valueOf(CharDirectionality.class, str);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[]) f.clone();
    }
}
