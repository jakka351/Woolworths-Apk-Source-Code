package androidx.compose.foundation.text;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.SourceDebugExtension;

@Stable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate;", "", "Companion", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final AnnotatedString f1127a;
    public final TextStyle b;
    public final boolean e;
    public final Density g;
    public final FontFamily.Resolver h;
    public MultiParagraphIntrinsics j;
    public LayoutDirection k;
    public final int c = Integer.MAX_VALUE;
    public final int d = 1;
    public final int f = 1;
    public final List i = EmptyList.d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextDelegate$Companion;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    public TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, boolean z, Density density, FontFamily.Resolver resolver, int i) {
        this.f1127a = annotatedString;
        this.b = textStyle;
        this.e = z;
        this.g = density;
        this.h = resolver;
    }

    public final void a(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.j;
        if (multiParagraphIntrinsics == null || layoutDirection != this.k || multiParagraphIntrinsics.a()) {
            this.k = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.f1127a, TextStyleKt.b(this.b, layoutDirection), this.i, this.g, this.h);
        }
        this.j = multiParagraphIntrinsics;
    }
}
