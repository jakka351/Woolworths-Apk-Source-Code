package au.com.woolworths.foundation.shop.olive.voice.ui.permission;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/olive/voice/ui/permission/DescItem;", "", "olive-voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DescItem {

    /* renamed from: a, reason: collision with root package name */
    public final int f8858a;
    public final int b;
    public final int c;

    public DescItem(int i, int i2, int i3) {
        this.f8858a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DescItem)) {
            return false;
        }
        DescItem descItem = (DescItem) obj;
        return this.f8858a == descItem.f8858a && this.b == descItem.b && this.c == descItem.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b.a(this.b, Integer.hashCode(this.f8858a) * 31, 31);
    }

    public final String toString() {
        return YU.a.m(YU.a.q(this.f8858a, this.b, "DescItem(iconRes=", ", title=", ", desc="), this.c, ")");
    }
}
