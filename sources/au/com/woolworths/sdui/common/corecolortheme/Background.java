package au.com.woolworths.sdui.common.corecolortheme;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/corecolortheme/Background;", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Background {

    /* renamed from: a, reason: collision with root package name */
    public final CompatibleColorData f9990a;

    public Background(CompatibleColorData compatibleColorData) {
        this.f9990a = compatibleColorData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Background) && Intrinsics.c(this.f9990a, ((Background) obj).f9990a);
    }

    public final int hashCode() {
        return this.f9990a.f9991a.hashCode();
    }

    public final String toString() {
        return "Background(compatibleColor=" + this.f9990a + ")";
    }
}
