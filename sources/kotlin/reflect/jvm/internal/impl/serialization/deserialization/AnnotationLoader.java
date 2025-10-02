package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* loaded from: classes.dex */
public interface AnnotationLoader<A> {
    List a(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf.ValueParameter valueParameter);

    ArrayList b(ProtoContainer.Class r1);

    List c(ProtoContainer protoContainer, ProtoBuf.EnumEntry enumEntry);

    ArrayList d(ProtoBuf.TypeParameter typeParameter, NameResolver nameResolver);

    List f(ProtoContainer protoContainer, ProtoBuf.Property property);

    List g(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind);

    ArrayList h(ProtoBuf.Type type, NameResolver nameResolver);

    List i(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind);

    List k(ProtoContainer protoContainer, ProtoBuf.Property property);
}
