package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/animation/core/AnimationEndReason;", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimationEndReason {
    public static final AnimationEndReason d;
    public static final AnimationEndReason e;
    public static final /* synthetic */ AnimationEndReason[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        AnimationEndReason animationEndReason = new AnimationEndReason("BoundReached", 0);
        d = animationEndReason;
        AnimationEndReason animationEndReason2 = new AnimationEndReason("Finished", 1);
        e = animationEndReason2;
        AnimationEndReason[] animationEndReasonArr = {animationEndReason, animationEndReason2};
        f = animationEndReasonArr;
        g = EnumEntriesKt.a(animationEndReasonArr);
    }

    public static AnimationEndReason valueOf(String str) {
        return (AnimationEndReason) Enum.valueOf(AnimationEndReason.class, str);
    }

    public static AnimationEndReason[] values() {
        return (AnimationEndReason[]) f.clone();
    }
}
