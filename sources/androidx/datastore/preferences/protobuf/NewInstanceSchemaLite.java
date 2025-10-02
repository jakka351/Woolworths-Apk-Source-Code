package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class NewInstanceSchemaLite implements NewInstanceSchema {
    @Override // androidx.datastore.preferences.protobuf.NewInstanceSchema
    public final GeneratedMessageLite newInstance(Object obj) {
        return ((GeneratedMessageLite) obj).q();
    }
}
