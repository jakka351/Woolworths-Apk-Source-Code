package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

@SourceDebugExtension
/* loaded from: classes7.dex */
public final class NewCapturedTypeConstructor implements CapturedTypeConstructor {

    /* renamed from: a, reason: collision with root package name */
    public final TypeProjection f24627a;
    public Function0 b;
    public final NewCapturedTypeConstructor c;
    public final TypeParameterDescriptor d;
    public final Object e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor(TypeProjection projection, final ArrayList arrayList) {
        this(projection, new Function0(arrayList) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$1
            public final ArrayList d;

            {
                this.d = arrayList;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.d;
            }
        }, (TypeParameterDescriptor) null, 8);
        Intrinsics.h(projection, "projection");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final Collection a() {
        Collection collection = (List) this.e.getD();
        if (collection == null) {
            collection = EmptyList.d;
        }
        return collection;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final ClassifierDescriptor c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!NewCapturedTypeConstructor.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.f(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        NewCapturedTypeConstructor newCapturedTypeConstructor = (NewCapturedTypeConstructor) obj;
        NewCapturedTypeConstructor newCapturedTypeConstructor2 = this.c;
        if (newCapturedTypeConstructor2 == null) {
            newCapturedTypeConstructor2 = this;
        }
        NewCapturedTypeConstructor newCapturedTypeConstructor3 = newCapturedTypeConstructor.c;
        if (newCapturedTypeConstructor3 != null) {
            obj = newCapturedTypeConstructor3;
        }
        return newCapturedTypeConstructor2 == obj;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final List getParameters() {
        return EmptyList.d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructor
    public final TypeProjection getProjection() {
        return this.f24627a;
    }

    public final int hashCode() {
        NewCapturedTypeConstructor newCapturedTypeConstructor = this.c;
        return newCapturedTypeConstructor != null ? newCapturedTypeConstructor.hashCode() : super.hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public final KotlinBuiltIns p() {
        KotlinType type = this.f24627a.getType();
        Intrinsics.g(type, "getType(...)");
        return TypeUtilsKt.h(type);
    }

    public final String toString() {
        return "CapturedType(" + this.f24627a + ')';
    }

    public /* synthetic */ NewCapturedTypeConstructor(TypeProjection typeProjection, Function0 function0, TypeParameterDescriptor typeParameterDescriptor, int i) {
        this(typeProjection, (i & 2) != 0 ? null : function0, (NewCapturedTypeConstructor) null, (i & 8) != 0 ? null : typeParameterDescriptor);
    }

    public NewCapturedTypeConstructor(TypeProjection projection, Function0 function0, NewCapturedTypeConstructor newCapturedTypeConstructor, TypeParameterDescriptor typeParameterDescriptor) {
        Intrinsics.h(projection, "projection");
        this.f24627a = projection;
        this.b = function0;
        this.c = newCapturedTypeConstructor;
        this.d = typeParameterDescriptor;
        this.e = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor$$Lambda$0
            public final NewCapturedTypeConstructor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Function0 function02 = this.d.b;
                if (function02 != null) {
                    return (List) function02.invoke();
                }
                return null;
            }
        });
    }
}
