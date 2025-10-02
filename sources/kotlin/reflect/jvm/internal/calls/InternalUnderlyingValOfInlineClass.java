package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.calls.Caller;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Ljava/lang/reflect/Method;", "Unbound", "Bound", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class InternalUnderlyingValOfInlineClass implements Caller<Method> {

    /* renamed from: a, reason: collision with root package name */
    public final Method f24300a;
    public final List b;
    public final Class c;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Bound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "Lkotlin/reflect/jvm/internal/calls/BoundCaller;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Bound extends InternalUnderlyingValOfInlineClass implements BoundCaller {
        public final Object d;

        public Bound(Method method, Object obj) {
            super(method, EmptyList.d);
            this.d = obj;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.h(args, "args");
            Caller.DefaultImpls.a(this, args);
            return this.f24300a.invoke(this.d, Arrays.copyOf(args, args.length));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass$Unbound;", "Lkotlin/reflect/jvm/internal/calls/InternalUnderlyingValOfInlineClass;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Unbound extends InternalUnderlyingValOfInlineClass {
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        public final Object call(Object[] args) {
            Intrinsics.h(args, "args");
            Caller.DefaultImpls.a(this, args);
            Object obj = args[0];
            Object[] objArrZ = args.length <= 1 ? new Object[0] : ArraysKt.z(1, args.length, args);
            return this.f24300a.invoke(obj, Arrays.copyOf(objArrZ, objArrZ.length));
        }
    }

    public InternalUnderlyingValOfInlineClass(Method method, List list) {
        this.f24300a = method;
        this.b = list;
        Class<?> returnType = method.getReturnType();
        Intrinsics.g(returnType, "getReturnType(...)");
        this.c = returnType;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final /* bridge */ /* synthetic */ Member a() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final boolean b() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* renamed from: c, reason: from getter */
    public final List getB() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    public final Type getReturnType() {
        return this.c;
    }
}
