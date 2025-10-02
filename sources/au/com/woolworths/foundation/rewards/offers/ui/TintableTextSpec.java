package au.com.woolworths.foundation.rewards.offers.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/ui/TintableTextSpec;", "", "offers-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TintableTextSpec {

    /* renamed from: a, reason: collision with root package name */
    public final String f8629a;
    public final TextStyle b;
    public final long c;
    public final int d;
    public final int e;
    public final float f;

    public TintableTextSpec(String str, TextStyle textStyle, long j, int i, int i2, float f) {
        this.f8629a = str;
        this.b = textStyle;
        this.c = j;
        this.d = i;
        this.e = i2;
        this.f = f;
    }

    public TintableTextSpec(String str, TextStyle textStyle, long j, int i, int i2, int i3) {
        this(str, textStyle, j, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, 4);
    }
}
