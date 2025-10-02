package coil.request;

import android.support.v4.media.session.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcoil/request/Tags;", "", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Tags {
    public static final Tags b = new Tags(EmptyMap.d);

    /* renamed from: a, reason: collision with root package name */
    public final Map f13025a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcoil/request/Tags$Companion;", "", "Lcoil/request/Tags;", "EMPTY", "Lcoil/request/Tags;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public Tags(Map map) {
        this.f13025a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Tags) {
            return Intrinsics.c(this.f13025a, ((Tags) obj).f13025a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13025a.hashCode();
    }

    public final String toString() {
        return a.u(new StringBuilder("Tags(tags="), this.f13025a, ')');
    }
}
