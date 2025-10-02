package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes7.dex */
final class NotNullSimpleType extends DelegatingSimpleTypeImpl {
    public NotNullSimpleType(SimpleType simpleType) {
        super(simpleType);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean K0() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final DelegatingSimpleType U0(SimpleType simpleType) {
        return new NotNullSimpleType(simpleType);
    }
}
