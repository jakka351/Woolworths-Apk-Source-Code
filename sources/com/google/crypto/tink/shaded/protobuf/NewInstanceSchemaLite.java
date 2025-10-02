package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;

/* loaded from: classes.dex */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // com.google.crypto.tink.shaded.protobuf.NewInstanceSchema
    public final Object newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).dynamicMethod(GeneratedMessageLite.MethodToInvoke.g);
    }
}
