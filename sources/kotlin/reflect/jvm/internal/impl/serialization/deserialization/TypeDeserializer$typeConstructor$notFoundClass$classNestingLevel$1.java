package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* loaded from: classes7.dex */
final /* synthetic */ class TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 extends PropertyReference1Impl {
    public static final TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1 d = new TypeDeserializer$typeConstructor$notFoundClass$classNestingLevel$1(ClassId.class, "outerClassId", "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((ClassId) obj).e();
    }
}
