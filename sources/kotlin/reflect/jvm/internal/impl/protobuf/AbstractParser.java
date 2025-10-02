package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    static {
        int i = ExtensionRegistryLite.b;
    }

    public static void c(MessageLite messageLite) throws InvalidProtocolBufferException {
        if (messageLite == null || messageLite.isInitialized()) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferExceptionA = (messageLite instanceof AbstractMessageLite ? new UninitializedMessageException() : new UninitializedMessageException()).a();
        invalidProtocolBufferExceptionA.d = messageLite;
        throw invalidProtocolBufferExceptionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    public final MessageLite a(ByteArrayInputStream byteArrayInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        MessageLite messageLite;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                messageLite = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int i3 = byteArrayInputStream.read();
                                if (i3 == -1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                if ((i3 & 128) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                        int i4 = byteArrayInputStream.read();
                        if (i4 == -1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        i |= (i4 & 127) << i2;
                        if ((i4 & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                CodedInputStream codedInputStream = new CodedInputStream(new AbstractMessageLite.Builder.LimitedInputStream(byteArrayInputStream, i));
                MessageLite messageLite2 = (MessageLite) b(codedInputStream, extensionRegistryLite);
                try {
                    codedInputStream.a(0);
                    messageLite = messageLite2;
                } catch (InvalidProtocolBufferException e) {
                    e.d = messageLite2;
                    throw e;
                }
            }
            c(messageLite);
            return messageLite;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }
}
