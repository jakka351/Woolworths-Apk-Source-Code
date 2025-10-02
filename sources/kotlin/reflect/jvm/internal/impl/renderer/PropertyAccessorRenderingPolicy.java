package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PropertyAccessorRenderingPolicy {
    public static final PropertyAccessorRenderingPolicy d;
    public static final PropertyAccessorRenderingPolicy e;
    public static final /* synthetic */ PropertyAccessorRenderingPolicy[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy = new PropertyAccessorRenderingPolicy("PRETTY", 0);
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy2 = new PropertyAccessorRenderingPolicy("DEBUG", 1);
        d = propertyAccessorRenderingPolicy2;
        PropertyAccessorRenderingPolicy propertyAccessorRenderingPolicy3 = new PropertyAccessorRenderingPolicy("NONE", 2);
        e = propertyAccessorRenderingPolicy3;
        PropertyAccessorRenderingPolicy[] propertyAccessorRenderingPolicyArr = {propertyAccessorRenderingPolicy, propertyAccessorRenderingPolicy2, propertyAccessorRenderingPolicy3};
        f = propertyAccessorRenderingPolicyArr;
        g = EnumEntriesKt.a(propertyAccessorRenderingPolicyArr);
    }

    public static PropertyAccessorRenderingPolicy valueOf(String str) {
        return (PropertyAccessorRenderingPolicy) Enum.valueOf(PropertyAccessorRenderingPolicy.class, str);
    }

    public static PropertyAccessorRenderingPolicy[] values() {
        return (PropertyAccessorRenderingPolicy[]) f.clone();
    }
}
