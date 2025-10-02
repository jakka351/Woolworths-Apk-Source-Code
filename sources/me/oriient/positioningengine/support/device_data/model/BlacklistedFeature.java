package me.oriient.positioningengine.support.device_data.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/positioningengine/support/device_data/model/BlacklistedFeature;", "", "(Ljava/lang/String;I)V", "POSITIONING", "MULTI_FLOOR_POSITIONING", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BlacklistedFeature {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BlacklistedFeature[] $VALUES;
    public static final BlacklistedFeature POSITIONING = new BlacklistedFeature("POSITIONING", 0);
    public static final BlacklistedFeature MULTI_FLOOR_POSITIONING = new BlacklistedFeature("MULTI_FLOOR_POSITIONING", 1);

    private static final /* synthetic */ BlacklistedFeature[] $values() {
        return new BlacklistedFeature[]{POSITIONING, MULTI_FLOOR_POSITIONING};
    }

    static {
        BlacklistedFeature[] blacklistedFeatureArr$values = $values();
        $VALUES = blacklistedFeatureArr$values;
        $ENTRIES = EnumEntriesKt.a(blacklistedFeatureArr$values);
    }

    private BlacklistedFeature(String str, int i) {
    }

    @NotNull
    public static EnumEntries<BlacklistedFeature> getEntries() {
        return $ENTRIES;
    }

    public static BlacklistedFeature valueOf(String str) {
        return (BlacklistedFeature) Enum.valueOf(BlacklistedFeature.class, str);
    }

    public static BlacklistedFeature[] values() {
        return (BlacklistedFeature[]) $VALUES.clone();
    }
}
