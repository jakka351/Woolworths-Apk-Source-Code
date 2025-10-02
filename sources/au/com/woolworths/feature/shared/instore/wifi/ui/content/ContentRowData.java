package au.com.woolworths.feature.shared.instore.wifi.ui.content;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/ui/content/ContentRowData;", "", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentRowData {

    /* renamed from: a, reason: collision with root package name */
    public final int f6541a;
    public final int b;
    public final int c;
    public final boolean d;
    public final List e;

    public ContentRowData(int i, int i2, int i3, boolean z, List list) {
        this.f6541a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentRowData)) {
            return false;
        }
        ContentRowData contentRowData = (ContentRowData) obj;
        return this.f6541a == contentRowData.f6541a && this.b == contentRowData.b && this.c == contentRowData.c && this.d == contentRowData.d && Intrinsics.c(this.e, contentRowData.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + b.e(b.a(this.c, b.a(this.b, Integer.hashCode(this.f6541a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = a.q(this.f6541a, this.b, "ContentRowData(iconResId=", ", titleResId=", ", textResId=");
        sbQ.append(this.c);
        sbQ.append(", textHasMarkdown=");
        sbQ.append(this.d);
        sbQ.append(", textPlaceholderValues=");
        return android.support.v4.media.session.a.t(sbQ, this.e, ")");
    }

    public /* synthetic */ ContentRowData(int i, int i2, int i3) {
        this(i, i2, i3, false, EmptyList.d);
    }
}
