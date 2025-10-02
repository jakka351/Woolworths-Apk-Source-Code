package androidx.compose.ui.text;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final /* data */ class ParagraphInfo {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidParagraph f2047a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;

    public ParagraphInfo(AndroidParagraph androidParagraph, int i, int i2, int i3, int i4, float f, float f2) {
        this.f2047a = androidParagraph;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = f;
        this.g = f2;
    }

    public final Rect a(Rect rect) {
        return rect.k((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(this.f) & 4294967295L));
    }

    public final long b(long j, boolean z) {
        if (z) {
            long j2 = TextRange.b;
            if (TextRange.b(j, j2)) {
                return j2;
            }
        }
        int i = TextRange.c;
        int i2 = (int) (j >> 32);
        int i3 = this.b;
        return TextRangeKt.a(i2 + i3, ((int) (j & 4294967295L)) + i3);
    }

    public final Rect c(Rect rect) {
        float f = -this.f;
        return rect.k((Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
    }

    public final int d(int i) {
        int i2 = this.c;
        int i3 = this.b;
        return RangesKt.c(i, i3, i2) - i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return this.f2047a.equals(paragraphInfo.f2047a) && this.b == paragraphInfo.b && this.c == paragraphInfo.c && this.d == paragraphInfo.d && this.e == paragraphInfo.e && Float.compare(this.f, paragraphInfo.f) == 0 && Float.compare(this.g, paragraphInfo.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + a.b(this.f, b.a(this.e, b.a(this.d, b.a(this.c, b.a(this.b, this.f2047a.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append(this.f2047a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        sb.append(this.c);
        sb.append(", startLineIndex=");
        sb.append(this.d);
        sb.append(", endLineIndex=");
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        return a.r(sb, this.g, ')');
    }
}
