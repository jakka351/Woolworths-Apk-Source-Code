package au.com.woolworths.sdui.common.corecolortheme;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/corecolortheme/Foreground;", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Foreground {

    /* renamed from: a, reason: collision with root package name */
    public final Primary f9993a;
    public final Secondary b;
    public final Highlight c;

    public Foreground(Primary primary, Secondary secondary, Highlight highlight) {
        this.f9993a = primary;
        this.b = secondary;
        this.c = highlight;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Foreground)) {
            return false;
        }
        Foreground foreground = (Foreground) obj;
        return Intrinsics.c(this.f9993a, foreground.f9993a) && Intrinsics.c(this.b, foreground.b) && Intrinsics.c(this.c, foreground.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f9993a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Foreground(primary=" + this.f9993a + ", secondary=" + this.b + ", highlight=" + this.c + ")";
    }
}
