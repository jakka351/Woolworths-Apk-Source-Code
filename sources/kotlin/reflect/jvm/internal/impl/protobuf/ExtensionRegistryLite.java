package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes.dex */
public class ExtensionRegistryLite {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Map f24507a;

    public static final class ObjectIntPair {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24508a;
        public final int b;

        public ObjectIntPair(Object obj, int i) {
            this.f24508a = obj;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ObjectIntPair)) {
                return false;
            }
            ObjectIntPair objectIntPair = (ObjectIntPair) obj;
            return this.f24508a == objectIntPair.f24508a && this.b == objectIntPair.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f24508a) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.b;
        }
    }

    static {
        new ExtensionRegistryLite(0);
    }

    public ExtensionRegistryLite() {
        this.f24507a = new HashMap();
    }

    public final void a(GeneratedMessageLite.GeneratedExtension generatedExtension) {
        this.f24507a.put(new ObjectIntPair(generatedExtension.f24513a, generatedExtension.d.d), generatedExtension);
    }

    public ExtensionRegistryLite(int i) {
        this.f24507a = Collections.EMPTY_MAP;
    }
}
