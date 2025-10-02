package me.oriient.ui.contentview.clustering;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/ui/contentview/clustering/IntersectionDefinition;", "", "(Ljava/lang/String;I)V", "DIAGONAL", "MAX_SIDE", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class IntersectionDefinition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IntersectionDefinition[] $VALUES;
    public static final IntersectionDefinition DIAGONAL = new IntersectionDefinition("DIAGONAL", 0);
    public static final IntersectionDefinition MAX_SIDE = new IntersectionDefinition("MAX_SIDE", 1);

    private static final /* synthetic */ IntersectionDefinition[] $values() {
        return new IntersectionDefinition[]{DIAGONAL, MAX_SIDE};
    }

    static {
        IntersectionDefinition[] intersectionDefinitionArr$values = $values();
        $VALUES = intersectionDefinitionArr$values;
        $ENTRIES = EnumEntriesKt.a(intersectionDefinitionArr$values);
    }

    private IntersectionDefinition(String str, int i) {
    }

    @NotNull
    public static EnumEntries<IntersectionDefinition> getEntries() {
        return $ENTRIES;
    }

    public static IntersectionDefinition valueOf(String str) {
        return (IntersectionDefinition) Enum.valueOf(IntersectionDefinition.class, str);
    }

    public static IntersectionDefinition[] values() {
        return (IntersectionDefinition[]) $VALUES.clone();
    }
}
