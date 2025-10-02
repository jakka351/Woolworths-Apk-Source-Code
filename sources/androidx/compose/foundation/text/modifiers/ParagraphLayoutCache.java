package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/ParagraphLayoutCache;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ParagraphLayoutCache {

    /* renamed from: a, reason: collision with root package name */
    public String f1191a;
    public TextStyle b;
    public FontFamily.Resolver c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public Density i;
    public AndroidParagraph j;
    public boolean k;
    public long l;
    public MinLinesConstrainer m;
    public ParagraphIntrinsics n;
    public LayoutDirection o;
    public long h = InlineDensity.f1187a;
    public long p = Constraints.Companion.c(0, 0);
    public int q = -1;
    public int r = -1;

    public ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3) {
        this.f1191a = str;
        this.b = textStyle;
        this.c = resolver;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
    }

    public static long e(ParagraphLayoutCache paragraphLayoutCache, long j, LayoutDirection layoutDirection) {
        TextStyle textStyle = paragraphLayoutCache.b;
        MinLinesConstrainer minLinesConstrainer = paragraphLayoutCache.m;
        Density density = paragraphLayoutCache.i;
        Intrinsics.e(density);
        MinLinesConstrainer minLinesConstrainerA = MinLinesConstrainer.Companion.a(minLinesConstrainer, layoutDirection, textStyle, density, paragraphLayoutCache.c);
        paragraphLayoutCache.m = minLinesConstrainerA;
        return minLinesConstrainerA.a(paragraphLayoutCache.g, j);
    }

    public final int a(int i, LayoutDirection layoutDirection) {
        int i2 = this.q;
        int i3 = this.r;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = ConstraintsKt.a(0, i, 0, Integer.MAX_VALUE);
        if (this.g > 1) {
            jA = e(this, jA, layoutDirection);
        }
        ParagraphIntrinsics paragraphIntrinsicsD = d(layoutDirection);
        long jA2 = LayoutUtilsKt.a(paragraphIntrinsicsD.c(), this.d, jA, this.e);
        boolean z = this.e;
        int i4 = this.d;
        int i5 = this.f;
        int iA = TextDelegateKt.a(new AndroidParagraph((AndroidParagraphIntrinsics) paragraphIntrinsicsD, ((z || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, jA2).d());
        int i6 = Constraints.i(jA);
        if (iA < i6) {
            iA = i6;
        }
        this.q = i;
        this.r = iA;
        return iA;
    }

    public final void b() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.q = -1;
        this.r = -1;
        this.p = Constraints.Companion.c(0, 0);
        long j = 0;
        this.l = (j & 4294967295L) | (j << 32);
        this.k = false;
    }

    public final void c(Density density) {
        long jA;
        Density density2 = this.i;
        if (density != null) {
            int i = InlineDensity.b;
            jA = InlineDensity.a(density.getE(), density.getF());
        } else {
            jA = InlineDensity.f1187a;
        }
        if (density2 == null) {
            this.i = density;
            this.h = jA;
        } else if (density == null || this.h != jA) {
            this.i = density;
            this.h = jA;
            b();
        }
    }

    public final ParagraphIntrinsics d(LayoutDirection layoutDirection) {
        ParagraphIntrinsics androidParagraphIntrinsics = this.n;
        if (androidParagraphIntrinsics == null || layoutDirection != this.o || androidParagraphIntrinsics.a()) {
            this.o = layoutDirection;
            String str = this.f1191a;
            TextStyle textStyleB = TextStyleKt.b(this.b, layoutDirection);
            Density density = this.i;
            Intrinsics.e(density);
            FontFamily.Resolver resolver = this.c;
            EmptyList emptyList = EmptyList.d;
            androidParagraphIntrinsics = new AndroidParagraphIntrinsics(str, textStyleB, emptyList, emptyList, resolver, density);
        }
        this.n = androidParagraphIntrinsics;
        return androidParagraphIntrinsics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.b(this.h));
        sb.append(')');
        return sb.toString();
    }
}
