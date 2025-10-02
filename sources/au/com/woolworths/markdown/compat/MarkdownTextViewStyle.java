package au.com.woolworths.markdown.compat;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/markdown/compat/MarkdownTextViewStyle;", "", "markdown_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MarkdownTextViewStyle {

    /* renamed from: a, reason: collision with root package name */
    public final Density f9046a;
    public final long b;
    public final TextStyle c;
    public final TextAlign d;
    public final boolean e;

    public MarkdownTextViewStyle(Density density, long j, TextStyle textStyle, TextAlign textAlign, boolean z) {
        Intrinsics.h(density, "density");
        Intrinsics.h(textStyle, "textStyle");
        this.f9046a = density;
        this.b = j;
        this.c = textStyle;
        this.d = textAlign;
        this.e = z;
    }

    public /* synthetic */ MarkdownTextViewStyle(Density density, long j, TextStyle textStyle, TextAlign textAlign, int i) {
        this(density, j, textStyle, (i & 8) != 0 ? null : textAlign, (i & 16) != 0);
    }
}
