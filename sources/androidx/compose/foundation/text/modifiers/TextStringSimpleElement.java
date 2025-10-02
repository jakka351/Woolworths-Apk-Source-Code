package androidx.compose.foundation.text.modifiers;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends ModifierNodeElement<TextStringSimpleNode> {
    public final String d;
    public final TextStyle e;
    public final FontFamily.Resolver f;
    public final int g;
    public final boolean h;
    public final int i;
    public final int j;
    public final ColorProducer k;

    public TextStringSimpleElement(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i, boolean z, int i2, int i3, ColorProducer colorProducer) {
        this.d = str;
        this.e = textStyle;
        this.f = resolver;
        this.g = i;
        this.h = z;
        this.i = i2;
        this.j = i3;
        this.k = colorProducer;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        TextStringSimpleNode textStringSimpleNode = new TextStringSimpleNode();
        textStringSimpleNode.r = this.d;
        textStringSimpleNode.s = this.e;
        textStringSimpleNode.t = this.f;
        textStringSimpleNode.u = this.g;
        textStringSimpleNode.v = this.h;
        textStringSimpleNode.w = this.i;
        textStringSimpleNode.x = this.j;
        textStringSimpleNode.y = this.k;
        return textStringSimpleNode;
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
            androidx.compose.foundation.text.modifiers.TextStringSimpleNode r12 = (androidx.compose.foundation.text.modifiers.TextStringSimpleNode) r12
            androidx.compose.ui.graphics.ColorProducer r0 = r12.y
            androidx.compose.ui.graphics.ColorProducer r1 = r11.k
            boolean r0 = kotlin.jvm.internal.Intrinsics.c(r1, r0)
            r12.y = r1
            r1 = 0
            r2 = 1
            androidx.compose.ui.text.TextStyle r3 = r11.e
            if (r0 == 0) goto L26
            androidx.compose.ui.text.TextStyle r0 = r12.s
            if (r3 == r0) goto L21
            androidx.compose.ui.text.SpanStyle r4 = r3.f2068a
            androidx.compose.ui.text.SpanStyle r0 = r0.f2068a
            boolean r0 = r4.c(r0)
            if (r0 == 0) goto L26
            goto L24
        L21:
            r3.getClass()
        L24:
            r0 = r1
            goto L27
        L26:
            r0 = r2
        L27:
            java.lang.String r4 = r12.r
            java.lang.String r5 = r11.d
            boolean r4 = kotlin.jvm.internal.Intrinsics.c(r4, r5)
            if (r4 == 0) goto L32
            goto L38
        L32:
            r12.r = r5
            r1 = 0
            r12.C = r1
            r1 = r2
        L38:
            androidx.compose.ui.text.TextStyle r4 = r12.s
            boolean r4 = r4.c(r3)
            r4 = r4 ^ r2
            r12.s = r3
            int r3 = r12.x
            int r5 = r11.j
            if (r3 == r5) goto L4a
            r12.x = r5
            r4 = r2
        L4a:
            int r3 = r12.w
            int r5 = r11.i
            if (r3 == r5) goto L53
            r12.w = r5
            r4 = r2
        L53:
            boolean r3 = r12.v
            boolean r5 = r11.h
            if (r3 == r5) goto L5c
            r12.v = r5
            r4 = r2
        L5c:
            androidx.compose.ui.text.font.FontFamily$Resolver r3 = r12.t
            androidx.compose.ui.text.font.FontFamily$Resolver r5 = r11.f
            boolean r3 = kotlin.jvm.internal.Intrinsics.c(r3, r5)
            if (r3 != 0) goto L69
            r12.t = r5
            r4 = r2
        L69:
            int r3 = r12.u
            int r5 = r11.g
            if (r3 != r5) goto L71
            r2 = r4
            goto L73
        L71:
            r12.u = r5
        L73:
            if (r1 != 0) goto L77
            if (r2 == 0) goto L9a
        L77:
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r3 = r12.s2()
            java.lang.String r4 = r12.r
            androidx.compose.ui.text.TextStyle r5 = r12.s
            androidx.compose.ui.text.font.FontFamily$Resolver r6 = r12.t
            int r7 = r12.u
            boolean r8 = r12.v
            int r9 = r12.w
            int r10 = r12.x
            r3.f1191a = r4
            r3.b = r5
            r3.c = r6
            r3.d = r7
            r3.e = r8
            r3.f = r9
            r3.g = r10
            r3.b()
        L9a:
            boolean r3 = r12.q
            if (r3 != 0) goto L9f
            goto Lbd
        L9f:
            if (r1 != 0) goto La7
            if (r0 == 0) goto Laa
            kotlin.jvm.functions.Function1 r3 = r12.B
            if (r3 == 0) goto Laa
        La7:
            androidx.compose.ui.node.SemanticsModifierNodeKt.a(r12)
        Laa:
            if (r1 != 0) goto Lae
            if (r2 == 0) goto Lb8
        Lae:
            androidx.compose.ui.node.LayoutNode r1 = androidx.compose.ui.node.DelegatableNodeKt.g(r12)
            r1.W()
            androidx.compose.ui.node.DrawModifierNodeKt.a(r12)
        Lb8:
            if (r0 == 0) goto Lbd
            androidx.compose.ui.node.DrawModifierNodeKt.a(r12)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleElement.b(androidx.compose.ui.Modifier$Node):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) obj;
        return Intrinsics.c(this.k, textStringSimpleElement.k) && Intrinsics.c(this.d, textStringSimpleElement.d) && Intrinsics.c(this.e, textStringSimpleElement.e) && Intrinsics.c(this.f, textStringSimpleElement.f) && this.g == textStringSimpleElement.g && this.h == textStringSimpleElement.h && this.i == textStringSimpleElement.i && this.j == textStringSimpleElement.j;
    }

    public final int hashCode() {
        int iE = (((b.e(b.a(this.g, (this.f.hashCode() + a.d(this.d.hashCode() * 31, 31, this.e)) * 31, 31), 31, this.h) + this.i) * 31) + this.j) * 31;
        ColorProducer colorProducer = this.k;
        return iE + (colorProducer != null ? colorProducer.hashCode() : 0);
    }
}
