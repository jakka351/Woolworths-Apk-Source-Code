package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes7.dex */
public final class AbstractBinaryClassAnnotationLoaderKt {
    public static final MemberSignature a(ProtoBuf.Property proto, NameResolver nameResolver, TypeTable typeTable, boolean z, boolean z2, boolean z3) {
        Intrinsics.h(proto, "proto");
        Intrinsics.h(nameResolver, "nameResolver");
        GeneratedMessageLite.GeneratedExtension propertySignature = JvmProtoBuf.d;
        Intrinsics.g(propertySignature, "propertySignature");
        JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.a(proto, propertySignature);
        if (jvmPropertySignature != null) {
            if (z) {
                ExtensionRegistryLite extensionRegistryLite = JvmProtoBufUtil.f24497a;
                JvmMemberSignature.Field fieldB = JvmProtoBufUtil.b(proto, nameResolver, typeTable, z3);
                if (fieldB != null) {
                    return MemberSignature.Companion.b(fieldB);
                }
            } else if (z2 && (jvmPropertySignature.e & 2) == 2) {
                JvmProtoBuf.JvmMethodSignature jvmMethodSignature = jvmPropertySignature.g;
                Intrinsics.g(jvmMethodSignature, "getSyntheticMethod(...)");
                return MemberSignature.Companion.c(nameResolver, jvmMethodSignature);
            }
        }
        return null;
    }
}
