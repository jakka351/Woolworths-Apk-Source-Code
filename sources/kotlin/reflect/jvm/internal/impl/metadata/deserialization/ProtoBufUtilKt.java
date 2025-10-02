package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;

/* loaded from: classes7.dex */
public final class ProtoBufUtilKt {
    public static final Object a(GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension extension) {
        Intrinsics.h(extendableMessage, "<this>");
        Intrinsics.h(extension, "extension");
        if (extendableMessage.i(extension)) {
            return extendableMessage.f(extension);
        }
        return null;
    }

    public static final Object b(GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.GeneratedExtension extension, int i) {
        Intrinsics.h(extendableMessage, "<this>");
        Intrinsics.h(extension, "extension");
        if (i < extendableMessage.h(extension)) {
            return extendableMessage.g(extension, i);
        }
        return null;
    }
}
