package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class InvalidProtocolBufferException extends IOException {
    public MessageLite d;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.d = null;
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }
}
