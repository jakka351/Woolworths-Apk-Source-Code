package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/SkippableUpdater;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "composer", "Landroidx/compose/runtime/Composer;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class SkippableUpdater<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Composer f1664a;

    public final boolean equals(Object obj) {
        if (obj instanceof SkippableUpdater) {
            return Intrinsics.c(this.f1664a, ((SkippableUpdater) obj).f1664a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1664a.hashCode();
    }

    public final String toString() {
        return "SkippableUpdater(composer=" + this.f1664a + ')';
    }
}
