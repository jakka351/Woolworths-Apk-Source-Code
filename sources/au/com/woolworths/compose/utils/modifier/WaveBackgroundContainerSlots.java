package au.com.woolworths.compose.utils.modifier;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/compose/utils/modifier/WaveBackgroundContainerSlots;", "", "compose-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class WaveBackgroundContainerSlots {
    public static final WaveBackgroundContainerSlots d;
    public static final WaveBackgroundContainerSlots e;
    public static final /* synthetic */ WaveBackgroundContainerSlots[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        WaveBackgroundContainerSlots waveBackgroundContainerSlots = new WaveBackgroundContainerSlots("Background", 0);
        d = waveBackgroundContainerSlots;
        WaveBackgroundContainerSlots waveBackgroundContainerSlots2 = new WaveBackgroundContainerSlots("Content", 1);
        e = waveBackgroundContainerSlots2;
        WaveBackgroundContainerSlots[] waveBackgroundContainerSlotsArr = {waveBackgroundContainerSlots, waveBackgroundContainerSlots2};
        f = waveBackgroundContainerSlotsArr;
        g = EnumEntriesKt.a(waveBackgroundContainerSlotsArr);
    }

    public static WaveBackgroundContainerSlots valueOf(String str) {
        return (WaveBackgroundContainerSlots) Enum.valueOf(WaveBackgroundContainerSlots.class, str);
    }

    public static WaveBackgroundContainerSlots[] values() {
        return (WaveBackgroundContainerSlots[]) f.clone();
    }
}
