package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.Map;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes6.dex */
public class ExtensionRegistryLite {
    public static volatile ExtensionRegistryLite b;
    public static final ExtensionRegistryLite c = new ExtensionRegistryLite();

    /* renamed from: a, reason: collision with root package name */
    public final Map f16042a = Collections.EMPTY_MAP;

    public static class ExtensionClassHolder {
        static {
            try {
                Class.forName("com.google.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    public static final class ObjectIntPair {

        /* renamed from: a, reason: collision with root package name */
        public final Object f16043a;
        public final int b;

        public ObjectIntPair(int i, MessageLite messageLite) {
            this.f16043a = messageLite;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f16043a == objectIntPair.f16043a && this.b == objectIntPair.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f16043a) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.b;
        }
    }

    public static ExtensionRegistryLite b() {
        ExtensionRegistryLite extensionRegistryLite;
        ExtensionRegistryLite extensionRegistryLite2 = b;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = b;
                if (extensionRegistryLite == null) {
                    Class cls = ExtensionRegistryFactory.f16041a;
                    ExtensionRegistryLite extensionRegistryLite3 = null;
                    if (cls != null) {
                        try {
                            extensionRegistryLite3 = (ExtensionRegistryLite) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    extensionRegistryLite = extensionRegistryLite3 != null ? extensionRegistryLite3 : c;
                    b = extensionRegistryLite;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return extensionRegistryLite;
    }

    public final GeneratedMessageLite.GeneratedExtension a(int i, MessageLite messageLite) {
        return (GeneratedMessageLite.GeneratedExtension) this.f16042a.get(new ObjectIntPair(i, messageLite));
    }
}
