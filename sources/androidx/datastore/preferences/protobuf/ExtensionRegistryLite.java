package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes.dex */
public class ExtensionRegistryLite {
    public static volatile ExtensionRegistryLite b;
    public static final ExtensionRegistryLite c = new ExtensionRegistryLite();

    /* renamed from: a, reason: collision with root package name */
    public final Map f2632a = Collections.EMPTY_MAP;

    /* loaded from: classes2.dex */
    public static class ExtensionClassHolder {
        static {
            try {
                Class.forName("androidx.datastore.preferences.protobuf.Extension");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class ObjectIntPair {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2633a;
        public final int b;

        public ObjectIntPair(int i, MessageLite messageLite) {
            this.f2633a = messageLite;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f2633a == objectIntPair.f2633a && this.b == objectIntPair.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f2633a) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.b;
        }
    }

    public static ExtensionRegistryLite a() {
        ExtensionRegistryLite extensionRegistryLite;
        Protobuf protobuf = Protobuf.c;
        ExtensionRegistryLite extensionRegistryLite2 = b;
        if (extensionRegistryLite2 != null) {
            return extensionRegistryLite2;
        }
        synchronized (ExtensionRegistryLite.class) {
            try {
                extensionRegistryLite = b;
                if (extensionRegistryLite == null) {
                    Class cls = ExtensionRegistryFactory.f2631a;
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
}
