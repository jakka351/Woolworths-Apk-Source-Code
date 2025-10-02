package kotlin.reflect.jvm.internal.impl.builtins.functions;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionInvokeDescriptor;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionTypeKind;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope;

/* loaded from: classes7.dex */
public final class FunctionClassScope extends GivenFunctionsMemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.GivenFunctionsMemberScope
    public final List h() {
        FunctionClassDescriptor functionClassDescriptor = (FunctionClassDescriptor) this.b;
        FunctionTypeKind functionTypeKind = functionClassDescriptor.j;
        return Intrinsics.c(functionTypeKind, FunctionTypeKind.Function.c) ? CollectionsKt.Q(FunctionInvokeDescriptor.Factory.a(functionClassDescriptor, false)) : Intrinsics.c(functionTypeKind, FunctionTypeKind.SuspendFunction.c) ? CollectionsKt.Q(FunctionInvokeDescriptor.Factory.a(functionClassDescriptor, true)) : EmptyList.d;
    }
}
