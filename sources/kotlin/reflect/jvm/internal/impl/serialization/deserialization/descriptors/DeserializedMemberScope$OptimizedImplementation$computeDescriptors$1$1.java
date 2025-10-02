package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;

/* loaded from: classes7.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 implements Function0 {
    public final /* synthetic */ Parser d;
    public final /* synthetic */ ByteArrayInputStream e;
    public final /* synthetic */ DeserializedMemberScope f;

    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(Parser parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        this.d = parser;
        this.e = byteArrayInputStream;
        this.f = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.d.a(this.e, this.f.b.f24572a.p);
    }
}
