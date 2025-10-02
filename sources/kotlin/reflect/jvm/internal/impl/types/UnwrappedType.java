package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;

/* loaded from: classes.dex */
public abstract class UnwrappedType extends KotlinType {
    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final UnwrappedType M0() {
        return this;
    }

    public abstract UnwrappedType N0(boolean z);

    public abstract UnwrappedType O0(KotlinTypeRefiner kotlinTypeRefiner);

    public abstract UnwrappedType P0(TypeAttributes typeAttributes);
}
