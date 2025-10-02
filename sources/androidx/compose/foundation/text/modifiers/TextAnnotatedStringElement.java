package androidx.compose.foundation.text.modifiers;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends ModifierNodeElement<TextAnnotatedStringNode> {
    public final AnnotatedString d;
    public final TextStyle e;
    public final FontFamily.Resolver f;
    public final Function1 g;
    public final int h;
    public final boolean i;
    public final int j;
    public final int k;
    public final List l;
    public final Function1 m;
    public final ColorProducer n;
    public final Function1 o;

    public TextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, ColorProducer colorProducer, Function1 function13) {
        this.d = annotatedString;
        this.e = textStyle;
        this.f = resolver;
        this.g = function1;
        this.h = i;
        this.i = z;
        this.j = i2;
        this.k = i3;
        this.l = list;
        this.m = function12;
        this.n = colorProducer;
        this.o = function13;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new TextAnnotatedStringNode(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, null, this.n, this.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.ui.Modifier.Node r10) {
        /*
            r9 = this;
            r0 = r10
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = (androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode) r0
            androidx.compose.ui.graphics.ColorProducer r10 = r0.C
            androidx.compose.ui.graphics.ColorProducer r1 = r9.n
            boolean r10 = kotlin.jvm.internal.Intrinsics.c(r1, r10)
            r0.C = r1
            if (r10 == 0) goto L25
            androidx.compose.ui.text.TextStyle r10 = r0.s
            androidx.compose.ui.text.TextStyle r1 = r9.e
            if (r1 == r10) goto L20
            androidx.compose.ui.text.SpanStyle r1 = r1.f2068a
            androidx.compose.ui.text.SpanStyle r10 = r10.f2068a
            boolean r10 = r1.c(r10)
            if (r10 == 0) goto L25
            goto L23
        L20:
            r1.getClass()
        L23:
            r10 = 0
            goto L26
        L25:
            r10 = 1
        L26:
            androidx.compose.ui.text.AnnotatedString r1 = r9.d
            boolean r8 = r0.x2(r1)
            androidx.compose.ui.text.font.FontFamily$Resolver r6 = r9.f
            int r7 = r9.h
            androidx.compose.ui.text.TextStyle r1 = r9.e
            java.util.List r2 = r9.l
            int r3 = r9.k
            int r4 = r9.j
            boolean r5 = r9.i
            boolean r1 = r0.w2(r1, r2, r3, r4, r5, r6, r7)
            r2 = 0
            kotlin.jvm.functions.Function1 r3 = r9.o
            kotlin.jvm.functions.Function1 r4 = r9.g
            kotlin.jvm.functions.Function1 r5 = r9.m
            boolean r2 = r0.v2(r4, r5, r2, r3)
            r0.s2(r10, r8, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement.b(androidx.compose.ui.Modifier$Node):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) obj;
        return Intrinsics.c(this.n, textAnnotatedStringElement.n) && Intrinsics.c(this.d, textAnnotatedStringElement.d) && Intrinsics.c(this.e, textAnnotatedStringElement.e) && Intrinsics.c(this.l, textAnnotatedStringElement.l) && Intrinsics.c(this.f, textAnnotatedStringElement.f) && this.g == textAnnotatedStringElement.g && this.o == textAnnotatedStringElement.o && this.h == textAnnotatedStringElement.h && this.i == textAnnotatedStringElement.i && this.j == textAnnotatedStringElement.j && this.k == textAnnotatedStringElement.k && this.m == textAnnotatedStringElement.m;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + a.d(this.d.hashCode() * 31, 31, this.e)) * 31;
        Function1 function1 = this.g;
        int iE = (((b.e(b.a(this.h, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.i) + this.j) * 31) + this.k) * 31;
        List list = this.l;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.m;
        int iHashCode3 = (iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 961;
        ColorProducer colorProducer = this.n;
        int iHashCode4 = (iHashCode3 + (colorProducer != null ? colorProducer.hashCode() : 0)) * 31;
        Function1 function13 = this.o;
        return iHashCode4 + (function13 != null ? function13.hashCode() : 0);
    }
}
