package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes.dex */
public interface AnnotationAndConstantLoader<A, C> extends AnnotationLoader<A> {
    Object e(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType);

    Object j(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType);
}
