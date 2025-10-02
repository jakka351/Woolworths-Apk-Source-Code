package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/RepeatMode;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RepeatMode {
    public static final RepeatMode d;
    public static final RepeatMode e;
    public static final /* synthetic */ RepeatMode[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        RepeatMode repeatMode = new RepeatMode("Restart", 0);
        d = repeatMode;
        RepeatMode repeatMode2 = new RepeatMode("Reverse", 1);
        e = repeatMode2;
        RepeatMode[] repeatModeArr = {repeatMode, repeatMode2};
        f = repeatModeArr;
        g = EnumEntriesKt.a(repeatModeArr);
    }

    public static RepeatMode valueOf(String str) {
        return (RepeatMode) Enum.valueOf(RepeatMode.class, str);
    }

    public static RepeatMode[] values() {
        return (RepeatMode[]) f.clone();
    }
}
