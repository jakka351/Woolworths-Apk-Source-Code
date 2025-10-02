package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class OverrideRenderingPolicy {
    public static final OverrideRenderingPolicy d;
    public static final OverrideRenderingPolicy e;
    public static final /* synthetic */ OverrideRenderingPolicy[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        OverrideRenderingPolicy overrideRenderingPolicy = new OverrideRenderingPolicy("RENDER_OVERRIDE", 0);
        d = overrideRenderingPolicy;
        OverrideRenderingPolicy overrideRenderingPolicy2 = new OverrideRenderingPolicy("RENDER_OPEN", 1);
        e = overrideRenderingPolicy2;
        OverrideRenderingPolicy[] overrideRenderingPolicyArr = {overrideRenderingPolicy, overrideRenderingPolicy2, new OverrideRenderingPolicy("RENDER_OPEN_OVERRIDE", 2)};
        f = overrideRenderingPolicyArr;
        g = EnumEntriesKt.a(overrideRenderingPolicyArr);
    }

    public static OverrideRenderingPolicy valueOf(String str) {
        return (OverrideRenderingPolicy) Enum.valueOf(OverrideRenderingPolicy.class, str);
    }

    public static OverrideRenderingPolicy[] values() {
        return (OverrideRenderingPolicy[]) f.clone();
    }
}
