package au.com.woolworths.design.core.ui.component.experimental.chip.spec;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/design/core/ui/component/experimental/chip/spec/ChipVariant;", "", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChipVariant {
    public static final ChipVariant d;
    public static final ChipVariant e;
    public static final /* synthetic */ ChipVariant[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ChipVariant chipVariant = new ChipVariant("Primary", 0);
        d = chipVariant;
        ChipVariant chipVariant2 = new ChipVariant("Secondary", 1);
        e = chipVariant2;
        ChipVariant[] chipVariantArr = {chipVariant, chipVariant2};
        f = chipVariantArr;
        g = EnumEntriesKt.a(chipVariantArr);
    }

    public static ChipVariant valueOf(String str) {
        return (ChipVariant) Enum.valueOf(ChipVariant.class, str);
    }

    public static ChipVariant[] values() {
        return (ChipVariant[]) f.clone();
    }
}
