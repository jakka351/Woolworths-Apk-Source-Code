package kotlin.reflect.jvm;

import java.io.ByteArrayInputStream;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.MetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.BitEncoding;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractParser;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReflectLambdaKt {
    public static final KFunctionImpl a(Function function) {
        Metadata metadata = (Metadata) function.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] strArrD1 = metadata.d1();
            if (strArrD1.length == 0) {
                strArrD1 = null;
            }
            if (strArrD1 != null) {
                String[] strings = metadata.d2();
                ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f24497a;
                Intrinsics.h(strings, "strings");
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(BitEncoding.a(strArrD1));
                ExtensionRegistryLite extensionRegistryLite2 = JvmProtoBufUtil.f24497a;
                JvmNameResolver jvmNameResolverG = JvmProtoBufUtil.g(byteArrayInputStream, strings);
                ExtensionRegistryLite extensionRegistryLite3 = JvmProtoBufUtil.f24497a;
                AbstractParser abstractParser = (AbstractParser) ProtoBuf.Function.z;
                abstractParser.getClass();
                CodedInputStream codedInputStream = new CodedInputStream(byteArrayInputStream);
                MessageLite messageLite = (MessageLite) abstractParser.b(codedInputStream, extensionRegistryLite3);
                try {
                    codedInputStream.a(0);
                    AbstractParser.c(messageLite);
                    ProtoBuf.Function function2 = (ProtoBuf.Function) messageLite;
                    MetadataVersion metadataVersion = new MetadataVersion(metadata.mv(), (metadata.xi() & 8) != 0);
                    Class<?> cls = function.getClass();
                    ProtoBuf.TypeTable typeTable = function2.s;
                    Intrinsics.g(typeTable, "getTypeTable(...)");
                    return new KFunctionImpl(EmptyContainerForLocal.e, (SimpleFunctionDescriptor) UtilKt.f(cls, function2, jvmNameResolverG, new TypeTable(typeTable), metadataVersion, ReflectLambdaKt$reflect$descriptor$1.d));
                } catch (InvalidProtocolBufferException e) {
                    e.d = messageLite;
                    throw e;
                }
            }
        }
        return null;
    }
}
