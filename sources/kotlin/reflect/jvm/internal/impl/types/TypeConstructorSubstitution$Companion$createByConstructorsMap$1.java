package kotlin.reflect.jvm.internal.impl.types;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class TypeConstructorSubstitution$Companion$createByConstructorsMap$1 extends TypeConstructorSubstitution {
    public final /* synthetic */ Map c;

    public TypeConstructorSubstitution$Companion$createByConstructorsMap$1(Map map) {
        this.c = map;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean a() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeSubstitution
    public final boolean f() {
        return this.c.isEmpty();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution
    public final TypeProjection h(TypeConstructor key) {
        Intrinsics.h(key, "key");
        return (TypeProjection) this.c.get(key);
    }
}
