package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.MinLinesConstrainer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache;", "", "TextAutoSizeLayoutScopeImpl", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {

    /* renamed from: a, reason: collision with root package name */
    public AnnotatedString f1190a;
    public FontFamily.Resolver b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public List g;
    public MinLinesConstrainer h;
    public Density j;
    public TextStyle k;
    public MultiParagraphIntrinsics l;
    public LayoutDirection m;
    public TextLayoutResult n;
    public long i = InlineDensity.f1187a;
    public int o = -1;
    public int p = -1;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/MultiParagraphLayoutCache$TextAutoSizeLayoutScopeImpl;", "Landroidx/compose/foundation/text/modifiers/TextAutoSizeLayoutScope;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public final class TextAutoSizeLayoutScopeImpl implements TextAutoSizeLayoutScope {
        @Override // androidx.compose.ui.unit.FontScaling
        /* renamed from: Q1 */
        public final float getF() {
            throw null;
        }

        @Override // androidx.compose.ui.unit.Density
        /* renamed from: getDensity */
        public final float getE() {
            throw null;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float t1(long j) {
            if (TextUnit.d(j)) {
                throw null;
            }
            return getE() * r(j);
        }
    }

    public MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, List list) {
        this.f1190a = annotatedString;
        this.b = resolver;
        this.c = i;
        this.d = z;
        this.e = i2;
        this.f = i3;
        this.g = list;
        this.k = textStyle;
    }

    public final int a(int i, LayoutDirection layoutDirection) {
        int i2 = this.o;
        int i3 = this.p;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long jA = ConstraintsKt.a(0, i, 0, Integer.MAX_VALUE);
        if (this.f > 1) {
            jA = g(jA, layoutDirection);
        }
        int iA = TextDelegateKt.a(b(jA, layoutDirection).e);
        int i4 = Constraints.i(jA);
        if (iA < i4) {
            iA = i4;
        }
        this.o = i;
        this.p = iA;
        return iA;
    }

    public final MultiParagraph b(long j, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsicsD = d(layoutDirection);
        long jA = LayoutUtilsKt.a(multiParagraphIntrinsicsD.c(), this.c, j, this.d);
        boolean z = this.d;
        int i = this.c;
        int i2 = this.e;
        return new MultiParagraph(multiParagraphIntrinsicsD, jA, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    public final void c(Density density) {
        long jA;
        Density density2 = this.j;
        if (density != null) {
            int i = InlineDensity.b;
            jA = InlineDensity.a(density.getE(), density.getF());
        } else {
            jA = InlineDensity.f1187a;
        }
        if (density2 == null) {
            this.j = density;
            this.i = jA;
        } else if (density == null || this.i != jA) {
            this.j = density;
            this.i = jA;
            this.l = null;
            this.n = null;
            this.p = -1;
            this.o = -1;
        }
    }

    public final MultiParagraphIntrinsics d(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.l;
        if (multiParagraphIntrinsics == null || layoutDirection != this.m || multiParagraphIntrinsics.a()) {
            this.m = layoutDirection;
            AnnotatedString annotatedString = this.f1190a;
            TextStyle textStyleB = TextStyleKt.b(this.k, layoutDirection);
            Density density = this.j;
            Intrinsics.e(density);
            FontFamily.Resolver resolver = this.b;
            List list = this.g;
            if (list == null) {
                list = EmptyList.d;
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, textStyleB, list, density, resolver);
        }
        this.l = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    public final void e(TextStyle textStyle) {
        boolean zC = textStyle.c(this.k);
        this.k = textStyle;
        if (zC) {
            return;
        }
        this.l = null;
        this.n = null;
        this.p = -1;
        this.o = -1;
    }

    public final TextLayoutResult f(LayoutDirection layoutDirection, long j, MultiParagraph multiParagraph) {
        float fMin = Math.min(multiParagraph.f2045a.c(), multiParagraph.d);
        AnnotatedString annotatedString = this.f1190a;
        TextStyle textStyle = this.k;
        List list = this.g;
        if (list == null) {
            list = EmptyList.d;
        }
        int i = this.e;
        boolean z = this.d;
        int i2 = this.c;
        Density density = this.j;
        Intrinsics.e(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, this.b, j), multiParagraph, ConstraintsKt.d(j, (TextDelegateKt.a(fMin) << 32) | (TextDelegateKt.a(multiParagraph.e) & 4294967295L)));
    }

    public final long g(long j, LayoutDirection layoutDirection) {
        MinLinesConstrainer minLinesConstrainer = this.h;
        TextStyle textStyle = this.k;
        Density density = this.j;
        Intrinsics.e(density);
        MinLinesConstrainer minLinesConstrainerA = MinLinesConstrainer.Companion.a(minLinesConstrainer, layoutDirection, textStyle, density, this.b);
        this.h = minLinesConstrainerA;
        return minLinesConstrainerA.a(this.f, j);
    }
}
