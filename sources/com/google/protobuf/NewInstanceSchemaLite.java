package com.google.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // com.google.protobuf.NewInstanceSchema
    public final GeneratedMessageLite newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).E();
    }
}
