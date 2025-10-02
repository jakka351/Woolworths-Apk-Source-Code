package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.ExperimentalStdlibApi;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@ExperimentalStdlibApi
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ParameterizedTypeImpl implements ParameterizedType, TypeImpl {
    public final Class d;
    public final Type e;
    public final Type[] f;

    public ParameterizedTypeImpl(Class cls, Type type, ArrayList arrayList) {
        this.d = cls;
        this.e = type;
        this.f = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return Intrinsics.c(this.d, parameterizedType.getRawType()) && Intrinsics.c(this.e, parameterizedType.getOwnerType()) && Arrays.equals(this.f, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.e;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.d;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.d;
        Type type = this.e;
        if (type != null) {
            sb.append(TypesJVMKt.a(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(TypesJVMKt.a(cls));
        }
        Type[] typeArr = this.f;
        if (typeArr.length != 0) {
            ArraysKt___ArraysKt.c(typeArr, sb, ", ", "<", ">", "...", ParameterizedTypeImpl$getTypeName$1$1.d);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.d.hashCode();
        Type type = this.e;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        return getTypeName();
    }
}
