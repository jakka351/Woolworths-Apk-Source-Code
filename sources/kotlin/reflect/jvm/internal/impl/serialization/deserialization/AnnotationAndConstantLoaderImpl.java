package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes.dex */
public final class AnnotationAndConstantLoaderImpl extends AbstractAnnotationLoader<AnnotationDescriptor> implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {
    public final AnnotationDeserializer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, SerializerExtensionProtocol protocol) {
        super(protocol);
        Intrinsics.h(module, "module");
        Intrinsics.h(protocol, "protocol");
        this.b = new AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final Object e(ProtoContainer protoContainer, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.h(proto, "proto");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.a(proto, this.f24562a.i);
        if (value == null) {
            return null;
        }
        return this.b.c(kotlinType, value, protoContainer.f24582a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    public final Object j(ProtoContainer protoContainer, ProtoBuf.Property proto, KotlinType kotlinType) {
        Intrinsics.h(proto, "proto");
        return null;
    }

    public final AnnotationDescriptorImpl l(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        return this.b.a(proto, nameResolver);
    }
}
