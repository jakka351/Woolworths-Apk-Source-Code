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
import androidx.compose.ui.text.style.TextOverflow;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends ModifierNodeElement<SelectableTextAnnotatedStringNode> {
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
    public final SelectionController n;
    public final ColorProducer o;

    public SelectableTextAnnotatedStringElement(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer) {
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
        this.n = selectionController;
        this.o = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new SelectableTextAnnotatedStringNode(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(androidx.compose.ui.Modifier.Node r12) {
        /*
            r11 = this;
            androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode r12 = (androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringNode) r12
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r0 = r12.u
            androidx.compose.ui.graphics.ColorProducer r1 = r0.C
            androidx.compose.ui.graphics.ColorProducer r2 = r11.o
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r2, r1)
            r0.C = r2
            androidx.compose.ui.text.TextStyle r4 = r11.e
            if (r1 == 0) goto L26
            androidx.compose.ui.text.TextStyle r1 = r0.s
            if (r4 == r1) goto L21
            androidx.compose.ui.text.SpanStyle r2 = r4.f2068a
            androidx.compose.ui.text.SpanStyle r1 = r1.f2068a
            boolean r1 = r2.c(r1)
            if (r1 == 0) goto L26
            goto L24
        L21:
            r4.getClass()
        L24:
            r1 = 0
            goto L27
        L26:
            r1 = 1
        L27:
            androidx.compose.ui.text.AnnotatedString r2 = r11.d
            boolean r2 = r0.x2(r2)
            androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode r3 = r12.u
            java.util.List r5 = r11.l
            int r6 = r11.k
            int r7 = r11.j
            boolean r8 = r11.i
            androidx.compose.ui.text.font.FontFamily$Resolver r9 = r11.f
            int r10 = r11.h
            boolean r3 = r3.w2(r4, r5, r6, r7, r8, r9, r10)
            r4 = 0
            kotlin.jvm.functions.Function1 r5 = r11.g
            kotlin.jvm.functions.Function1 r6 = r11.m
            androidx.compose.foundation.text.modifiers.SelectionController r7 = r11.n
            boolean r4 = r0.v2(r5, r6, r7, r4)
            r0.s2(r1, r2, r3, r4)
            r12.t = r7
            androidx.compose.ui.node.LayoutNode r12 = androidx.compose.ui.node.DelegatableNodeKt.g(r12)
            r12.W()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement.b(androidx.compose.ui.Modifier$Node):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) obj;
        return Intrinsics.c(this.o, selectableTextAnnotatedStringElement.o) && Intrinsics.c(this.d, selectableTextAnnotatedStringElement.d) && Intrinsics.c(this.e, selectableTextAnnotatedStringElement.e) && Intrinsics.c(this.l, selectableTextAnnotatedStringElement.l) && Intrinsics.c(this.f, selectableTextAnnotatedStringElement.f) && this.g == selectableTextAnnotatedStringElement.g && this.h == selectableTextAnnotatedStringElement.h && this.i == selectableTextAnnotatedStringElement.i && this.j == selectableTextAnnotatedStringElement.j && this.k == selectableTextAnnotatedStringElement.k && this.m == selectableTextAnnotatedStringElement.m && Intrinsics.c(this.n, selectableTextAnnotatedStringElement.n);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + a.d(this.d.hashCode() * 31, 31, this.e)) * 31;
        Function1 function1 = this.g;
        int iE = (((b.e(b.a(this.h, (iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31, 31), 31, this.i) + this.j) * 31) + this.k) * 31;
        List list = this.l;
        int iHashCode2 = (iE + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function12 = this.m;
        int iHashCode3 = (iHashCode2 + (function12 != null ? function12.hashCode() : 0)) * 31;
        SelectionController selectionController = this.n;
        int iHashCode4 = (iHashCode3 + (selectionController != null ? selectionController.hashCode() : 0)) * 961;
        ColorProducer colorProducer = this.o;
        return iHashCode4 + (colorProducer != null ? colorProducer.hashCode() : 0);
    }

    public final String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.d) + ", style=" + this.e + ", fontFamilyResolver=" + this.f + ", onTextLayout=" + this.g + ", overflow=" + ((Object) TextOverflow.a(this.h)) + ", softWrap=" + this.i + ", maxLines=" + this.j + ", minLines=" + this.k + ", placeholders=" + this.l + ", onPlaceholderLayout=" + this.m + ", selectionController=" + this.n + ", color=" + this.o + ", autoSize=null)";
    }
}
