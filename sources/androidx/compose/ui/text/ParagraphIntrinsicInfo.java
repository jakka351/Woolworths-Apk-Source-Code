package androidx.compose.ui.text;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ParagraphIntrinsicInfo {

    /* renamed from: a, reason: collision with root package name */
    public final AndroidParagraphIntrinsics f2048a;
    public final int b;
    public final int c;

    public ParagraphIntrinsicInfo(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, int i2) {
        this.f2048a = androidParagraphIntrinsics;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        ParagraphIntrinsicInfo paragraphIntrinsicInfo = (ParagraphIntrinsicInfo) obj;
        return this.f2048a.equals(paragraphIntrinsicInfo.f2048a) && this.b == paragraphIntrinsicInfo.b && this.c == paragraphIntrinsicInfo.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + b.a(this.b, this.f2048a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb.append(this.f2048a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        return a.l(sb, this.c, ')');
    }
}
