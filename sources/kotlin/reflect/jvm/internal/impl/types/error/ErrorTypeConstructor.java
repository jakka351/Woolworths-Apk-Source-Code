package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.DefaultBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes.dex */
public final class ErrorTypeConstructor implements TypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    public final ErrorTypeKind f24633a;
    public final String[] b;
    public final String c;

    public ErrorTypeConstructor(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.h(kind, "kind");
        Intrinsics.h(formatParams, "formatParams");
        this.f24633a = kind;
        this.b = formatParams;
        ErrorEntity[] errorEntityArr = ErrorEntity.d;
        String str = kind.d;
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        this.c = String.format("[Error type: %s]", Arrays.copyOf(new Object[]{String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length))}, 1));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection a() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        ErrorUtils.f24634a.getClass();
        return ErrorUtils.c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean d() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns p() {
        Lazy lazy = DefaultBuiltIns.g;
        return DefaultBuiltIns.Companion.a();
    }

    public final String toString() {
        return this.c;
    }
}
