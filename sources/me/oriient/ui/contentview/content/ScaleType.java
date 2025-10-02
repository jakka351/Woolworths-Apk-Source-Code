package me.oriient.ui.contentview.content;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/ui/contentview/content/ScaleType;", "", "(Ljava/lang/String;I)V", "SCALE_TO_FIT", "NO_SCALE", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ScaleType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ScaleType[] $VALUES;
    public static final ScaleType SCALE_TO_FIT = new ScaleType("SCALE_TO_FIT", 0);
    public static final ScaleType NO_SCALE = new ScaleType("NO_SCALE", 1);

    private static final /* synthetic */ ScaleType[] $values() {
        return new ScaleType[]{SCALE_TO_FIT, NO_SCALE};
    }

    static {
        ScaleType[] scaleTypeArr$values = $values();
        $VALUES = scaleTypeArr$values;
        $ENTRIES = EnumEntriesKt.a(scaleTypeArr$values);
    }

    private ScaleType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ScaleType> getEntries() {
        return $ENTRIES;
    }

    public static ScaleType valueOf(String str) {
        return (ScaleType) Enum.valueOf(ScaleType.class, str);
    }

    public static ScaleType[] values() {
        return (ScaleType[]) $VALUES.clone();
    }
}
