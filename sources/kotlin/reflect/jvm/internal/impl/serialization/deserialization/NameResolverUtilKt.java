package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes.dex */
public final class NameResolverUtilKt {
    public static final ClassId a(NameResolver nameResolver, int i) {
        Intrinsics.h(nameResolver, "<this>");
        return ClassId.Companion.a(nameResolver.a(i), nameResolver.b(i));
    }

    public static final Name b(NameResolver nameResolver, int i) {
        Intrinsics.h(nameResolver, "<this>");
        return Name.d(nameResolver.getString(i));
    }
}
