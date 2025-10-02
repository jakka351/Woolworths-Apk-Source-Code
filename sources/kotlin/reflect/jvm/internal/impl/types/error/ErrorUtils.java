package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;

/* loaded from: classes.dex */
public final class ErrorUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final ErrorUtils f24634a = new ErrorUtils();
    public static final ErrorModuleDescriptor b = ErrorModuleDescriptor.d;
    public static final ErrorClassDescriptor c;
    public static final ErrorType d;
    public static final ErrorType e;
    public static final Set f;

    static {
        ErrorEntity[] errorEntityArr = ErrorEntity.d;
        c = new ErrorClassDescriptor(Name.l(String.format("<Error class: %s>", Arrays.copyOf(new Object[]{"unknown class"}, 1))));
        d = c(ErrorTypeKind.k, new String[0]);
        e = c(ErrorTypeKind.x, new String[0]);
        f = SetsKt.i(new ErrorPropertyDescriptor());
    }

    public static final ErrorScope a(ErrorScopeKind errorScopeKind, boolean z, String... formatParams) {
        Intrinsics.h(formatParams, "formatParams");
        return z ? new ThrowingScope(errorScopeKind, (String[]) Arrays.copyOf(formatParams, formatParams.length)) : new ErrorScope(errorScopeKind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final ErrorScope b(ErrorScopeKind errorScopeKind, String... strArr) {
        return a(errorScopeKind, false, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static final ErrorType c(ErrorTypeKind kind, String... strArr) {
        Intrinsics.h(kind, "kind");
        String[] formatParams = (String[]) Arrays.copyOf(strArr, strArr.length);
        Intrinsics.h(formatParams, "formatParams");
        return e(kind, EmptyList.d, d(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length)), (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static ErrorTypeConstructor d(ErrorTypeKind kind, String... formatParams) {
        Intrinsics.h(kind, "kind");
        Intrinsics.h(formatParams, "formatParams");
        return new ErrorTypeConstructor(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static ErrorType e(ErrorTypeKind kind, List list, TypeConstructor typeConstructor, String... formatParams) {
        Intrinsics.h(kind, "kind");
        Intrinsics.h(formatParams, "formatParams");
        return new ErrorType(typeConstructor, b(ErrorScopeKind.h, typeConstructor.toString()), kind, list, false, (String[]) Arrays.copyOf(formatParams, formatParams.length));
    }

    public static final boolean f(DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return (declarationDescriptor instanceof ErrorClassDescriptor) || (declarationDescriptor.e() instanceof ErrorClassDescriptor) || declarationDescriptor == b;
        }
        return false;
    }
}
