package androidx.work.impl.utils;

import android.net.NetworkRequest;
import androidx.work.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/work/impl/utils/NetworkRequestCompat;", "", "Companion", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class NetworkRequestCompat {
    public static final String b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f3999a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/utils/NetworkRequestCompat$Companion;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        String strG = Logger.g("NetworkRequestCompat");
        Intrinsics.g(strG, "tagWithPrefix(\"NetworkRequestCompat\")");
        b = strG;
    }

    public NetworkRequestCompat(NetworkRequest networkRequest) {
        this.f3999a = networkRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NetworkRequestCompat) && Intrinsics.c(this.f3999a, ((NetworkRequestCompat) obj).f3999a);
    }

    public final int hashCode() {
        Object obj = this.f3999a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return android.support.v4.media.session.a.s(new StringBuilder("NetworkRequestCompat(wrapped="), this.f3999a, ')');
    }
}
