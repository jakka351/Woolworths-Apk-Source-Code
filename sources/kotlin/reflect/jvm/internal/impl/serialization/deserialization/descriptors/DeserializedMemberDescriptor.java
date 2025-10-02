package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes7.dex */
public interface DeserializedMemberDescriptor extends DeserializedDescriptor, DescriptorWithContainerSource {
    TypeTable A();

    MessageLite J();

    NameResolver a0();

    DeserializedContainerSource b0();
}
