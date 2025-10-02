package me.oriient.ui.contentview.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ui/contentview/models/AnimationMode;", "", "(Ljava/lang/String;I)V", "None", "Linear", "AccelerateDecelerate", "ui-content-view_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AnimationMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnimationMode[] $VALUES;
    public static final AnimationMode None = new AnimationMode("None", 0);
    public static final AnimationMode Linear = new AnimationMode("Linear", 1);
    public static final AnimationMode AccelerateDecelerate = new AnimationMode("AccelerateDecelerate", 2);

    private static final /* synthetic */ AnimationMode[] $values() {
        return new AnimationMode[]{None, Linear, AccelerateDecelerate};
    }

    static {
        AnimationMode[] animationModeArr$values = $values();
        $VALUES = animationModeArr$values;
        $ENTRIES = EnumEntriesKt.a(animationModeArr$values);
    }

    private AnimationMode(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AnimationMode> getEntries() {
        return $ENTRIES;
    }

    public static AnimationMode valueOf(String str) {
        return (AnimationMode) Enum.valueOf(AnimationMode.class, str);
    }

    public static AnimationMode[] values() {
        return (AnimationMode[]) $VALUES.clone();
    }
}
