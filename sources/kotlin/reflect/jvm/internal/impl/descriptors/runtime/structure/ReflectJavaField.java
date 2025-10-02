package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;

/* loaded from: classes7.dex */
public final class ReflectJavaField extends ReflectJavaMember implements JavaField {

    /* renamed from: a, reason: collision with root package name */
    public final Field f24384a;

    public ReflectJavaField(Field member) {
        Intrinsics.h(member, "member");
        this.f24384a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public final boolean D() {
        return this.f24384a.isEnumConstant();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    public final Member I() {
        return this.f24384a;
    }

    public final Field K() {
        return this.f24384a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaField
    public final JavaType getType() {
        Type genericType = this.f24384a.getGenericType();
        Intrinsics.g(genericType, "getGenericType(...)");
        return ReflectJavaType.Factory.a(genericType);
    }
}
