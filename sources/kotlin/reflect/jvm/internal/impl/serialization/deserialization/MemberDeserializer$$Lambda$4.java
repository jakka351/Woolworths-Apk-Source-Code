package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes7.dex */
class MemberDeserializer$$Lambda$4 implements Function0 {
    public final MemberDeserializer d;
    public final MessageLite e;
    public final AnnotatedCallableKind f;

    public MemberDeserializer$$Lambda$4(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.d = memberDeserializer;
        this.e = messageLite;
        this.f = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MemberDeserializer memberDeserializer = this.d;
        DeserializationContext deserializationContext = memberDeserializer.f24580a;
        ProtoContainer protoContainerA = memberDeserializer.a(deserializationContext.c);
        List listG = protoContainerA != null ? deserializationContext.f24572a.e.g(protoContainerA, this.e, this.f) : null;
        return listG == null ? EmptyList.d : listG;
    }
}
