package androidx.compose.foundation.content;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/content/MediaType;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MediaType {
    public static final MediaType b = new MediaType("text/*");
    public static final MediaType c = new MediaType("*/*");

    /* renamed from: a, reason: collision with root package name */
    public final String f850a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/content/MediaType$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public MediaType(String str) {
        this.f850a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        return Intrinsics.c(this.f850a, ((MediaType) obj).f850a);
    }

    public final int hashCode() {
        return this.f850a.hashCode();
    }

    public final String toString() {
        return a.o(new StringBuilder("MediaType(representation='"), this.f850a, "')");
    }
}
