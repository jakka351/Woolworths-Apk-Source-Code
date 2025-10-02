package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class AnnotationArgumentsRenderingPolicy {
    public static final AnnotationArgumentsRenderingPolicy f;
    public static final AnnotationArgumentsRenderingPolicy g;
    public static final /* synthetic */ AnnotationArgumentsRenderingPolicy[] h;
    public static final /* synthetic */ EnumEntries i;
    public final boolean d;
    public final boolean e;

    static {
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy = new AnnotationArgumentsRenderingPolicy("NO_ARGUMENTS", 0, 3);
        f = annotationArgumentsRenderingPolicy;
        AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy2 = new AnnotationArgumentsRenderingPolicy("UNLESS_EMPTY", 1, 2);
        g = annotationArgumentsRenderingPolicy2;
        AnnotationArgumentsRenderingPolicy[] annotationArgumentsRenderingPolicyArr = {annotationArgumentsRenderingPolicy, annotationArgumentsRenderingPolicy2, new AnnotationArgumentsRenderingPolicy(2, "ALWAYS_PARENTHESIZED", true, true)};
        h = annotationArgumentsRenderingPolicyArr;
        i = EnumEntriesKt.a(annotationArgumentsRenderingPolicyArr);
    }

    public AnnotationArgumentsRenderingPolicy(int i2, String str, boolean z, boolean z2) {
        this.d = z;
        this.e = z2;
    }

    public static AnnotationArgumentsRenderingPolicy valueOf(String str) {
        return (AnnotationArgumentsRenderingPolicy) Enum.valueOf(AnnotationArgumentsRenderingPolicy.class, str);
    }

    public static AnnotationArgumentsRenderingPolicy[] values() {
        return (AnnotationArgumentsRenderingPolicy[]) h.clone();
    }

    public /* synthetic */ AnnotationArgumentsRenderingPolicy(String str, int i2, int i3) {
        this(i2, str, (i3 & 1) == 0, false);
    }
}
