package au.com.woolworths.sdui.common.corecolortheme;

import YU.a;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/common/corecolortheme/CompatibleColorData;", "", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CompatibleColorData {

    /* renamed from: a, reason: collision with root package name */
    public final String f9991a;

    public CompatibleColorData(String str) {
        this.f9991a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompatibleColorData) && Intrinsics.c(this.f9991a, ((CompatibleColorData) obj).f9991a);
    }

    public final int hashCode() {
        return this.f9991a.hashCode();
    }

    public final String toString() {
        return a.h("CompatibleColorData(lightHexCode=", this.f9991a, ")");
    }
}
