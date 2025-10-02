package kotlin.reflect;

import YU.a;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/TypeVariableImpl;", "Ljava/lang/reflect/TypeVariable;", "Ljava/lang/reflect/GenericDeclaration;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalStdlibApi
@SourceDebugExtension
/* loaded from: classes7.dex */
final class TypeVariableImpl implements TypeVariable<GenericDeclaration>, TypeImpl {
    public final KTypeParameter d;

    public TypeVariableImpl(KTypeParameter kTypeParameter) {
        this.d = kTypeParameter;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TypeVariable) || !Intrinsics.c(this.d.getName(), ((TypeVariable) obj).getName())) {
            return false;
        }
        getGenericDeclaration();
        throw null;
    }

    @Override // java.lang.reflect.TypeVariable
    public final Type[] getBounds() {
        List upperBounds = this.d.getUpperBounds();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(upperBounds, 10));
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(TypesJVMKt.b((KType) it.next(), true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @Override // java.lang.reflect.TypeVariable
    public final GenericDeclaration getGenericDeclaration() {
        throw new NotImplementedError(a.A("An operation is not implemented: ", "getGenericDeclaration() is not yet supported for type variables created from KType: " + this.d));
    }

    @Override // java.lang.reflect.TypeVariable
    public final String getName() {
        return this.d.getName();
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return this.d.getName();
    }

    public final int hashCode() {
        this.d.getName().hashCode();
        getGenericDeclaration();
        throw null;
    }

    public final String toString() {
        return this.d.getName();
    }
}
