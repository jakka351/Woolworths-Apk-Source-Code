package kotlin.reflect.jvm.internal.impl.load.java.structure;

import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class JavaTypesKt {
    public static final boolean a(JavaType javaType) {
        JavaWildcardType javaWildcardType = javaType instanceof JavaWildcardType ? (JavaWildcardType) javaType : null;
        return (javaWildcardType == null || javaWildcardType.w() == null || javaWildcardType.F()) ? false : true;
    }
}
