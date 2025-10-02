package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class DeprecationInfo implements Comparable<DeprecationInfo> {
    public abstract void a();

    @Override // java.lang.Comparable
    public final int compareTo(DeprecationInfo deprecationInfo) {
        DeprecationInfo other = deprecationInfo;
        Intrinsics.h(other, "other");
        a();
        DeprecationLevelValue deprecationLevelValue = DeprecationLevelValue.d;
        other.a();
        return deprecationLevelValue.compareTo(deprecationLevelValue);
    }
}
