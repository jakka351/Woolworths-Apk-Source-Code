package au.com.woolworths.design.core.ui.component.experimental.chip.spec;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/ChipSelectionType;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChipSelectionType {
    public static final ChipSelectionType d;
    public static final ChipSelectionType e;
    public static final /* synthetic */ ChipSelectionType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ChipSelectionType chipSelectionType = new ChipSelectionType("Single", 0);
        d = chipSelectionType;
        ChipSelectionType chipSelectionType2 = new ChipSelectionType("Multiple", 1);
        e = chipSelectionType2;
        ChipSelectionType[] chipSelectionTypeArr = {chipSelectionType, chipSelectionType2};
        f = chipSelectionTypeArr;
        g = EnumEntriesKt.a(chipSelectionTypeArr);
    }

    public static ChipSelectionType valueOf(String str) {
        return (ChipSelectionType) Enum.valueOf(ChipSelectionType.class, str);
    }

    public static ChipSelectionType[] values() {
        return (ChipSelectionType[]) f.clone();
    }
}
