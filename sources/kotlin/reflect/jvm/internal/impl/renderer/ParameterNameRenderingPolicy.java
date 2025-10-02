package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ParameterNameRenderingPolicy {
    public static final ParameterNameRenderingPolicy d;
    public static final ParameterNameRenderingPolicy e;
    public static final ParameterNameRenderingPolicy f;
    public static final /* synthetic */ ParameterNameRenderingPolicy[] g;
    public static final /* synthetic */ EnumEntries h;

    static {
        ParameterNameRenderingPolicy parameterNameRenderingPolicy = new ParameterNameRenderingPolicy("ALL", 0);
        d = parameterNameRenderingPolicy;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy2 = new ParameterNameRenderingPolicy("ONLY_NON_SYNTHESIZED", 1);
        e = parameterNameRenderingPolicy2;
        ParameterNameRenderingPolicy parameterNameRenderingPolicy3 = new ParameterNameRenderingPolicy("NONE", 2);
        f = parameterNameRenderingPolicy3;
        ParameterNameRenderingPolicy[] parameterNameRenderingPolicyArr = {parameterNameRenderingPolicy, parameterNameRenderingPolicy2, parameterNameRenderingPolicy3};
        g = parameterNameRenderingPolicyArr;
        h = EnumEntriesKt.a(parameterNameRenderingPolicyArr);
    }

    public static ParameterNameRenderingPolicy valueOf(String str) {
        return (ParameterNameRenderingPolicy) Enum.valueOf(ParameterNameRenderingPolicy.class, str);
    }

    public static ParameterNameRenderingPolicy[] values() {
        return (ParameterNameRenderingPolicy[]) g.clone();
    }
}
