package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes.dex */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, AnnotationsContainerWithConstants<? extends A, ? extends C>> implements AnnotationAndConstantLoader<A, C> {
    public final MemoizedFunctionToNotNull b;

    public AbstractBinaryClassAnnotationAndConstantLoader(LockBasedStorageManager lockBasedStorageManager, ReflectKotlinClassFinder reflectKotlinClassFinder) {
        super(reflectKotlinClassFinder);
        this.b = lockBasedStorageManager.g(new Function1(this) { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$0
            public final AbstractBinaryClassAnnotationAndConstantLoader d;

            {
                this.d = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                KotlinJvmBinaryClass kotlinClass = (KotlinJvmBinaryClass) obj;
                Intrinsics.h(kotlinClass, "kotlinClass");
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                HashMap map3 = new HashMap();
                kotlinClass.b(new AbstractBinaryClassAnnotationAndConstantLoader$loadAnnotationsAndInitializers$1(this.d, map, kotlinClass, map2));
                return new AnnotationsContainerWithConstants(map, map2, map3);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final Object e(ProtoContainer protoContainer, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.h(proto, "proto");
        return u(protoContainer, proto, AnnotatedCallableKind.e, kotlinType, AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$2.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final Object j(ProtoContainer protoContainer, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.h(proto, "proto");
        return u(protoContainer, proto, AnnotatedCallableKind.f, kotlinType, AbstractBinaryClassAnnotationAndConstantLoader$$Lambda$1.d);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader
    public final AnnotationsContainerWithConstants n(KotlinJvmBinaryClass kotlinJvmBinaryClass) {
        return (AnnotationsContainerWithConstants) this.b.invoke(kotlinJvmBinaryClass);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer r10, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Property r11, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r12, kotlin.reflect.jvm.internal.impl.types.KotlinType r13, kotlin.jvm.functions.Function2 r14) {
        /*
            r9 = this;
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags$BooleanFlagField r0 = kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.B
            int r1 = r11.g
            java.lang.Boolean r5 = r0.e(r1)
            boolean r6 = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil.d(r11)
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder r7 = r9.f24460a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r8 = r9.p()
            r3 = 1
            r4 = 1
            r2 = r10
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r10 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.Companion.a(r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            if (r10 != 0) goto L33
            boolean r10 = r2 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class
            if (r10 == 0) goto L32
            r10 = r2
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer$Class r10 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer.Class) r10
            kotlin.reflect.jvm.internal.impl.descriptors.SourceElement r10 = r10.c
            boolean r1 = r10 instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement
            if (r1 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement r10 = (kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement) r10
            goto L2d
        L2c:
            r10 = r0
        L2d:
            if (r10 == 0) goto L32
            kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass r10 = r10.b
            goto L33
        L32:
            r10 = r0
        L33:
            if (r10 != 0) goto L36
            goto L64
        L36:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r1 = r10.a()
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r1 = r1.b
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.e
            java.lang.String r4 = "version"
            kotlin.jvm.internal.Intrinsics.h(r3, r4)
            int r4 = r3.b
            int r5 = r3.c
            int r3 = r3.d
            boolean r1 = r1.a(r4, r5, r3)
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver r3 = r2.f24582a
            kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable r2 = r2.b
            kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader.o(r11, r3, r2, r12, r1)
            if (r11 != 0) goto L58
            goto L64
        L58:
            kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull r12 = r9.b
            java.lang.Object r10 = r12.invoke(r10)
            java.lang.Object r10 = r14.invoke(r10, r11)
            if (r10 != 0) goto L65
        L64:
            return r0
        L65:
            boolean r11 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.c(r13)
            if (r11 == 0) goto L6f
            kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue r10 = r9.v(r10)
        L6f:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.u(kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.jvm.functions.Function2):java.lang.Object");
    }

    public abstract ConstantValue v(Object obj);
}
