package androidx.datastore.preferences.protobuf;

@CheckReturnValue
/* loaded from: classes.dex */
final class RawMessageInfo implements MessageInfo {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f2669a;
    public final String b;
    public final Object[] c;
    public final int d;

    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f2669a = messageLite;
        this.b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char cCharAt2 = str.charAt(i3);
            if (cCharAt2 < 55296) {
                this.d = i | (cCharAt2 << i2);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final MessageLite b() {
        return this.f2669a;
    }

    @Override // androidx.datastore.preferences.protobuf.MessageInfo
    public final ProtoSyntax c() {
        int i = this.d;
        return (i & 1) != 0 ? ProtoSyntax.d : (i & 4) == 4 ? ProtoSyntax.f : ProtoSyntax.e;
    }
}
