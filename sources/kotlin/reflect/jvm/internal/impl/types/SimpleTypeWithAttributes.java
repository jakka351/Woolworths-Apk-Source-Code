package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
final class SimpleTypeWithAttributes extends DelegatingSimpleTypeImpl {
    public final TypeAttributes f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTypeWithAttributes(SimpleType simpleType, TypeAttributes attributes) {
        super(simpleType);
        Intrinsics.h(attributes, "attributes");
        this.f = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final TypeAttributes I0() {
        return this.f;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType U0(SimpleType simpleType) {
        return new SimpleTypeWithAttributes(simpleType, this.f);
    }
}
