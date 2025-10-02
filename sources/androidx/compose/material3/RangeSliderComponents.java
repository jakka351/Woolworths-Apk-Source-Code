package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/RangeSliderComponents;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class RangeSliderComponents {
    public static final RangeSliderComponents d;
    public static final RangeSliderComponents e;
    public static final RangeSliderComponents f;
    public static final /* synthetic */ RangeSliderComponents[] g;

    static {
        RangeSliderComponents rangeSliderComponents = new RangeSliderComponents("ENDTHUMB", 0);
        d = rangeSliderComponents;
        RangeSliderComponents rangeSliderComponents2 = new RangeSliderComponents("STARTTHUMB", 1);
        e = rangeSliderComponents2;
        RangeSliderComponents rangeSliderComponents3 = new RangeSliderComponents("TRACK", 2);
        f = rangeSliderComponents3;
        g = new RangeSliderComponents[]{rangeSliderComponents, rangeSliderComponents2, rangeSliderComponents3};
    }

    public static RangeSliderComponents valueOf(String str) {
        return (RangeSliderComponents) Enum.valueOf(RangeSliderComponents.class, str);
    }

    public static RangeSliderComponents[] values() {
        return (RangeSliderComponents[]) g.clone();
    }
}
