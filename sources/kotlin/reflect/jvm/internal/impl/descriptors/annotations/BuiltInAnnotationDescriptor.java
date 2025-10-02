package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes7.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final KotlinBuiltIns f24351a;
    public final FqName b;
    public final Map c;
    public final Object d;

    public BuiltInAnnotationDescriptor(KotlinBuiltIns builtIns, FqName fqName, Map map) {
        Intrinsics.h(builtIns, "builtIns");
        Intrinsics.h(fqName, "fqName");
        this.f24351a = builtIns;
        this.b = fqName;
        this.c = map;
        this.d = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor$$Lambda$0
            public final BuiltInAnnotationDescriptor d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor = this.d;
                return builtInAnnotationDescriptor.f24351a.j(builtInAnnotationDescriptor.b).t();
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map b() {
        return this.c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final FqName d() {
        return this.b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final SourceElement g() {
        return SourceElement.f24343a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        Object d = this.d.getD();
        Intrinsics.g(d, "getValue(...)");
        return (KotlinType) d;
    }
}
