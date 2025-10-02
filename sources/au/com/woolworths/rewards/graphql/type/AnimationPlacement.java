package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/AnimationPlacement;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimationPlacement {
    public static final Companion e;
    public static final AnimationPlacement f;
    public static final /* synthetic */ AnimationPlacement[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/AnimationPlacement$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        AnimationPlacement animationPlacement = new AnimationPlacement("LEFT", 0, "LEFT");
        AnimationPlacement animationPlacement2 = new AnimationPlacement("RIGHT", 1, "RIGHT");
        AnimationPlacement animationPlacement3 = new AnimationPlacement("CENTER", 2, "CENTER");
        AnimationPlacement animationPlacement4 = new AnimationPlacement("UNKNOWN__", 3, "UNKNOWN__");
        f = animationPlacement4;
        AnimationPlacement[] animationPlacementArr = {animationPlacement, animationPlacement2, animationPlacement3, animationPlacement4};
        g = animationPlacementArr;
        h = EnumEntriesKt.a(animationPlacementArr);
        e = new Companion();
        CollectionsKt.R("LEFT", "RIGHT", "CENTER");
    }

    public AnimationPlacement(String str, int i, String str2) {
        this.d = str2;
    }

    public static AnimationPlacement valueOf(String str) {
        return (AnimationPlacement) Enum.valueOf(AnimationPlacement.class, str);
    }

    public static AnimationPlacement[] values() {
        return (AnimationPlacement[]) g.clone();
    }
}
