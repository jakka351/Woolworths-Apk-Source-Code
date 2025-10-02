package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes7.dex */
final class NullableSimpleType extends DelegatingSimpleTypeImpl {
    public NullableSimpleType(SimpleType simpleType) {
        super(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType U0(SimpleType simpleType) {
        return new NullableSimpleType(simpleType);
    }
}
