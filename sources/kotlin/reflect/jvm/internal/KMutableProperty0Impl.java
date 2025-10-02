package kotlin.reflect.jvm.internal;

import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\nB\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl;", "V", "Lkotlin/reflect/jvm/internal/KProperty0Impl;", "Lkotlin/reflect/KMutableProperty0;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "Setter", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KMutableProperty0Impl<V> extends KProperty0Impl<V> implements KMutableProperty0<V> {
    public final Object s;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/reflect/jvm/internal/KMutableProperty0Impl$Setter;", "R", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "Lkotlin/reflect/KMutableProperty0$Setter;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Setter<R> extends KPropertyImpl.Setter<R> implements KMutableProperty0.Setter<R> {
        public final KMutableProperty0Impl m;

        public Setter(KMutableProperty0Impl kMutableProperty0Impl) {
            this.m = kMutableProperty0Impl;
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor
        public final KPropertyImpl D() {
            return this.m;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) throws IllegalCallableAccessException {
            ((Setter) this.m.s.getD()).call(obj);
            return Unit.f24250a;
        }

        @Override // kotlin.reflect.KProperty.Accessor
        public final KProperty m() {
            return this.m;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, PropertyDescriptor descriptor) {
        super(kDeclarationContainerImpl, descriptor);
        Intrinsics.h(descriptor, "descriptor");
        this.s = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty0Impl$$Lambda$0
            public final KMutableProperty0Impl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KMutableProperty0Impl.Setter(this.d);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty
    public final KMutableProperty.Setter c() {
        return (Setter) this.s.getD();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KMutableProperty0, kotlin.reflect.KMutableProperty
    public final KMutableProperty0.Setter c() {
        return (Setter) this.s.getD();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KMutableProperty0Impl(KDeclarationContainerImpl kDeclarationContainerImpl, String name, String signature, Object obj) {
        super(kDeclarationContainerImpl, name, signature, obj);
        Intrinsics.h(name, "name");
        Intrinsics.h(signature, "signature");
        this.s = LazyKt.a(LazyThreadSafetyMode.d, new Function0(this) { // from class: kotlin.reflect.jvm.internal.KMutableProperty0Impl$$Lambda$0
            public final KMutableProperty0Impl d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new KMutableProperty0Impl.Setter(this.d);
            }
        });
    }
}
