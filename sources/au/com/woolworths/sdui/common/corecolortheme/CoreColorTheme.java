package au.com.woolworths.sdui.common.corecolortheme;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/corecolortheme/CoreColorTheme;", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CoreColorTheme {

    /* renamed from: a, reason: collision with root package name */
    public final Background f9992a;
    public final Foreground b;

    public CoreColorTheme(Background background, Foreground foreground) {
        this.f9992a = background;
        this.b = foreground;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoreColorTheme)) {
            return false;
        }
        CoreColorTheme coreColorTheme = (CoreColorTheme) obj;
        return Intrinsics.c(this.f9992a, coreColorTheme.f9992a) && Intrinsics.c(this.b, coreColorTheme.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9992a.hashCode() * 31);
    }

    public final String toString() {
        return "CoreColorTheme(background=" + this.f9992a + ", foreground=" + this.b + ")";
    }
}
