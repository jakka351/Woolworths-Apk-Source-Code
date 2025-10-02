package io.grpc;

import com.google.common.base.Preconditions;
import com.medallia.digital.mobilesdk.q2;
import io.grpc.Attributes;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ExperimentalApi
/* loaded from: classes7.dex */
public final class EquivalentAddressGroup {
    public static final Attributes.Key d = new Attributes.Key("io.grpc.EquivalentAddressGroup.ATTR_AUTHORITY_OVERRIDE");

    /* renamed from: a, reason: collision with root package name */
    public final List f23936a;
    public final Attributes b;
    public final int c;

    @ExperimentalApi
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Attr {
    }

    public EquivalentAddressGroup(SocketAddress socketAddress) {
        Attributes attributes = Attributes.b;
        List listSingletonList = Collections.singletonList(socketAddress);
        Preconditions.f("addrs is empty", !listSingletonList.isEmpty());
        List listUnmodifiableList = Collections.unmodifiableList(new ArrayList(listSingletonList));
        this.f23936a = listUnmodifiableList;
        Preconditions.j(attributes, "attrs");
        this.b = attributes;
        this.c = listUnmodifiableList.hashCode();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EquivalentAddressGroup)) {
            return false;
        }
        EquivalentAddressGroup equivalentAddressGroup = (EquivalentAddressGroup) obj;
        List list = equivalentAddressGroup.f23936a;
        List list2 = this.f23936a;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if (!((SocketAddress) list2.get(i)).equals(list.get(i))) {
                return false;
            }
        }
        return this.b.equals(equivalentAddressGroup.b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "[" + this.f23936a + q2.c + this.b + "]";
    }
}
