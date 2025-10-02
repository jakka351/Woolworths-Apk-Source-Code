package androidx.webkit;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class UserAgentMetadata {

    public static final class BrandVersion {

        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrandVersion);
        }

        public final int hashCode() {
            return Objects.hash(null, null, null);
        }

        public final String toString() {
            return "null,null,null";
        }
    }

    public static final class Builder {
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof UserAgentMetadata);
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hash(null, null, null, null, null, null, bool, 0, bool);
    }
}
