package androidx.compose.foundation.text.modifiers;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public ParagraphLayoutCache A;
    public Function1 B;
    public TextSubstitutionValue C;
    public String r;
    public TextStyle s;
    public FontFamily.Resolver t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public ColorProducer y;
    public HashMap z;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleNode$TextSubstitutionValue;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class TextSubstitutionValue {

        /* renamed from: a, reason: collision with root package name */
        public final String f1196a;
        public String b;
        public boolean c = false;
        public ParagraphLayoutCache d = null;

        public TextSubstitutionValue(String str, String str2) {
            this.f1196a = str;
            this.b = str2;
        }

        /* renamed from: a, reason: from getter */
        public final ParagraphLayoutCache getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getC() {
            return this.c;
        }

        public final void d(ParagraphLayoutCache paragraphLayoutCache) {
            this.d = paragraphLayoutCache;
        }

        public final void e(boolean z) {
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return Intrinsics.c(this.f1196a, textSubstitutionValue.f1196a) && Intrinsics.c(this.b, textSubstitutionValue.b) && this.c == textSubstitutionValue.c && Intrinsics.c(this.d, textSubstitutionValue.d);
        }

        public final void f(String str) {
            this.b = str;
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f1196a.hashCode() * 31, 31, this.b), 31, this.c);
            ParagraphLayoutCache paragraphLayoutCache = this.d;
            return iE + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.d);
            sb.append(", isShowingSubstitution=");
            return b.s(sb, this.c, ')');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001a  */
    @Override // androidx.compose.ui.node.DrawModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(androidx.compose.ui.node.LayoutNodeDrawScope r11) {
        /*
            r10 = this;
            boolean r0 = r10.q
            if (r0 != 0) goto L6
            goto La6
        L6:
            androidx.compose.foundation.text.modifiers.TextStringSimpleNode$TextSubstitutionValue r0 = r10.C
            if (r0 == 0) goto L1a
            boolean r1 = r0.getC()
            if (r1 == 0) goto L11
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L1a
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r0 = r0.getD()
            if (r0 != 0) goto L1e
        L1a:
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r0 = r10.s2()
        L1e:
            androidx.compose.ui.text.AndroidParagraph r1 = r0.j
            if (r1 == 0) goto Lad
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope r11 = r11.d
            androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1 r11 = r11.e
            androidx.compose.ui.graphics.Canvas r2 = r11.a()
            boolean r11 = r0.k
            if (r11 == 0) goto L47
            long r3 = r0.l
            r0 = 32
            long r5 = r3 >> r0
            int r0 = (int) r5
            float r5 = (float) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r0 = (int) r3
            float r6 = (float) r0
            r2.save()
            r4 = 0
            r7 = 1
            r3 = 0
            r2.b(r3, r4, r5, r6, r7)
        L47:
            androidx.compose.ui.text.TextStyle r0 = r10.s     // Catch: java.lang.Throwable -> L53
            androidx.compose.ui.text.SpanStyle r0 = r0.f2068a     // Catch: java.lang.Throwable -> L53
            androidx.compose.ui.text.style.TextDecoration r3 = r0.background     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L51
            androidx.compose.ui.text.style.TextDecoration r3 = androidx.compose.ui.text.style.TextDecoration.b     // Catch: java.lang.Throwable -> L53
        L51:
            r6 = r3
            goto L55
        L53:
            r0 = move-exception
            goto La7
        L55:
            androidx.compose.ui.graphics.Shadow r3 = r0.shadow     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L5b
            androidx.compose.ui.graphics.Shadow r3 = androidx.compose.ui.graphics.Shadow.d     // Catch: java.lang.Throwable -> L53
        L5b:
            r5 = r3
            androidx.compose.ui.graphics.drawscope.DrawStyle r3 = r0.drawStyle     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L62
            androidx.compose.ui.graphics.drawscope.Fill r3 = androidx.compose.ui.graphics.drawscope.Fill.f1802a     // Catch: java.lang.Throwable -> L53
        L62:
            r7 = r3
            androidx.compose.ui.text.style.TextForegroundStyle r0 = r0.f2058a     // Catch: java.lang.Throwable -> L53
            androidx.compose.ui.graphics.Brush r3 = r0.getBrush()     // Catch: java.lang.Throwable -> L53
            if (r3 == 0) goto L79
            androidx.compose.ui.text.TextStyle r0 = r10.s     // Catch: java.lang.Throwable -> L53
            androidx.compose.ui.text.SpanStyle r0 = r0.f2068a     // Catch: java.lang.Throwable -> L53
            androidx.compose.ui.text.style.TextForegroundStyle r0 = r0.f2058a     // Catch: java.lang.Throwable -> L53
            float r4 = r0.getB()     // Catch: java.lang.Throwable -> L53
            r1.l(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L53
            goto La1
        L79:
            androidx.compose.ui.graphics.ColorProducer r0 = r10.y     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L82
            long r3 = r0.a()     // Catch: java.lang.Throwable -> L53
            goto L84
        L82:
            long r3 = androidx.compose.ui.graphics.Color.k     // Catch: java.lang.Throwable -> L53
        L84:
            r8 = 16
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L8b
            goto L9e
        L8b:
            androidx.compose.ui.text.TextStyle r0 = r10.s     // Catch: java.lang.Throwable -> L53
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L53
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 == 0) goto L9c
            androidx.compose.ui.text.TextStyle r0 = r10.s     // Catch: java.lang.Throwable -> L53
            long r3 = r0.b()     // Catch: java.lang.Throwable -> L53
            goto L9e
        L9c:
            long r3 = androidx.compose.ui.graphics.Color.b     // Catch: java.lang.Throwable -> L53
        L9e:
            r1.k(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L53
        La1:
            if (r11 == 0) goto La6
            r2.m()
        La6:
            return
        La7:
            if (r11 == 0) goto Lac
            r2.m()
        Lac:
            throw r0
        Lad:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "no paragraph (layoutCache="
            r11.<init>(r0)
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = ", textSubstitution="
            r11.append(r0)
            androidx.compose.foundation.text.modifiers.TextStringSimpleNode$TextSubstitutionValue r0 = r10.C
            r11.append(r0)
            r0 = 41
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            androidx.compose.foundation.internal.InlineClassHelperKt.b(r11)
            kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.I(androidx.compose.ui.node.LayoutNodeDrawScope):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(androidx.compose.ui.node.LookaheadCapablePlaceable r2, androidx.compose.ui.layout.IntrinsicMeasurable r3, int r4) {
        /*
            r1 = this;
            androidx.compose.foundation.text.modifiers.TextStringSimpleNode$TextSubstitutionValue r3 = r1.C
            if (r3 == 0) goto L14
            boolean r0 = r3.getC()
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 == 0) goto L14
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r3 = r3.getD()
            if (r3 != 0) goto L18
        L14:
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r3 = r1.s2()
        L18:
            r3.c(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = r2.getD()
            int r2 = r3.a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.M(androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasurable, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int N(androidx.compose.ui.node.LookaheadCapablePlaceable r1, androidx.compose.ui.layout.IntrinsicMeasurable r2, int r3) {
        /*
            r0 = this;
            androidx.compose.foundation.text.modifiers.TextStringSimpleNode$TextSubstitutionValue r2 = r0.C
            if (r2 == 0) goto L14
            boolean r3 = r2.getC()
            if (r3 == 0) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L14
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r2 = r2.getD()
            if (r2 != 0) goto L18
        L14:
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r2 = r0.s2()
        L18:
            r2.c(r1)
            androidx.compose.ui.unit.LayoutDirection r1 = r1.getD()
            androidx.compose.ui.text.ParagraphIntrinsics r1 = r2.d(r1)
            float r1 = r1.c()
            int r1 = androidx.compose.foundation.text.TextDelegateKt.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.N(androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasurable, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int O(androidx.compose.ui.node.LookaheadCapablePlaceable r2, androidx.compose.ui.layout.IntrinsicMeasurable r3, int r4) {
        /*
            r1 = this;
            androidx.compose.foundation.text.modifiers.TextStringSimpleNode$TextSubstitutionValue r3 = r1.C
            if (r3 == 0) goto L14
            boolean r0 = r3.getC()
            if (r0 == 0) goto Lb
            goto Lc
        Lb:
            r3 = 0
        Lc:
            if (r3 == 0) goto L14
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r3 = r3.getD()
            if (r3 != 0) goto L18
        L14:
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r3 = r1.s2()
        L18:
            r3.c(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = r2.getD()
            int r2 = r3.a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.O(androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasurable, int):int");
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Function1<List<TextLayoutResult>, Boolean> function1 = this.B;
        if (function1 == null) {
            function1 = new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$1
                {
                    super(1);
                }

                /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke(java.lang.Object r32) {
                    /*
                        r31 = this;
                        r0 = r32
                        java.util.List r0 = (java.util.List) r0
                        r1 = r31
                        androidx.compose.foundation.text.modifiers.TextStringSimpleNode r2 = r1.h
                        androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r3 = r2.s2()
                        androidx.compose.ui.text.TextStyle r4 = r2.s
                        androidx.compose.ui.graphics.ColorProducer r2 = r2.y
                        if (r2 == 0) goto L17
                        long r5 = r2.a()
                        goto L19
                    L17:
                        long r5 = androidx.compose.ui.graphics.Color.k
                    L19:
                        r16 = 0
                        r18 = 16777214(0xfffffe, float:2.3509884E-38)
                        r7 = 0
                        r9 = 0
                        r10 = 0
                        r11 = 0
                        r12 = 0
                        r14 = 0
                        r15 = 0
                        androidx.compose.ui.text.TextStyle r21 = androidx.compose.ui.text.TextStyle.e(r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18)
                        androidx.compose.ui.unit.LayoutDirection r2 = r3.o
                        r4 = 0
                        if (r2 != 0) goto L32
                    L30:
                        r7 = r4
                        goto L8f
                    L32:
                        androidx.compose.ui.unit.Density r5 = r3.i
                        if (r5 != 0) goto L37
                        goto L30
                    L37:
                        androidx.compose.ui.text.AnnotatedString r6 = new androidx.compose.ui.text.AnnotatedString
                        java.lang.String r7 = r3.f1191a
                        r6.<init>(r7)
                        androidx.compose.ui.text.AndroidParagraph r7 = r3.j
                        if (r7 != 0) goto L43
                        goto L30
                    L43:
                        androidx.compose.ui.text.ParagraphIntrinsics r7 = r3.n
                        if (r7 != 0) goto L48
                        goto L30
                    L48:
                        long r7 = r3.p
                        r9 = -8589934589(0xfffffffe00000003, double:NaN)
                        long r29 = r7 & r9
                        androidx.compose.ui.text.TextLayoutResult r7 = new androidx.compose.ui.text.TextLayoutResult
                        androidx.compose.ui.text.TextLayoutInput r19 = new androidx.compose.ui.text.TextLayoutInput
                        int r8 = r3.f
                        boolean r9 = r3.e
                        int r10 = r3.d
                        androidx.compose.ui.text.font.FontFamily$Resolver r11 = r3.c
                        kotlin.collections.EmptyList r22 = kotlin.collections.EmptyList.d
                        r27 = r2
                        r26 = r5
                        r20 = r6
                        r23 = r8
                        r24 = r9
                        r25 = r10
                        r28 = r11
                        r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                        r2 = r19
                        r23 = r26
                        r24 = r28
                        androidx.compose.ui.text.MultiParagraph r11 = new androidx.compose.ui.text.MultiParagraph
                        androidx.compose.ui.text.MultiParagraphIntrinsics r19 = new androidx.compose.ui.text.MultiParagraphIntrinsics
                        r19.<init>(r20, r21, r22, r23, r24)
                        int r15 = r3.f
                        int r5 = r3.d
                        r16 = r5
                        r12 = r19
                        r13 = r29
                        r11.<init>(r12, r13, r15, r16)
                        long r5 = r3.l
                        r7.<init>(r2, r11, r5)
                    L8f:
                        if (r7 == 0) goto L95
                        r0.add(r7)
                        r4 = r7
                    L95:
                        if (r4 == 0) goto L99
                        r0 = 1
                        goto L9a
                    L99:
                        r0 = 0
                    L9a:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$1.invoke(java.lang.Object):java.lang.Object");
                }
            };
            this.B = function1;
        }
        AnnotatedString annotatedString = new AnnotatedString(this.r);
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
        semanticsPropertyReceiver.b(SemanticsProperties.z, CollectionsKt.Q(annotatedString));
        TextSubstitutionValue textSubstitutionValue = this.C;
        if (textSubstitutionValue != null) {
            boolean c = textSubstitutionValue.getC();
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.B;
            KProperty[] kPropertyArr2 = SemanticsPropertiesKt.f2022a;
            KProperty kProperty = kPropertyArr2[15];
            Boolean boolValueOf = Boolean.valueOf(c);
            semanticsPropertyKey.getClass();
            semanticsPropertyReceiver.b(semanticsPropertyKey, boolValueOf);
            AnnotatedString annotatedString2 = new AnnotatedString(textSubstitutionValue.getB());
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.A;
            KProperty kProperty2 = kPropertyArr2[14];
            semanticsPropertyKey2.getClass();
            semanticsPropertyReceiver.b(semanticsPropertyKey2, annotatedString2);
        }
        semanticsPropertyReceiver.b(SemanticsActions.k, new AccessibilityAction(null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str = ((AnnotatedString) obj).e;
                TextStringSimpleNode textStringSimpleNode = this.h;
                TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue2 = textStringSimpleNode.C;
                if (textSubstitutionValue2 == null) {
                    TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue3 = new TextStringSimpleNode.TextSubstitutionValue(textStringSimpleNode.r, str);
                    ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, textStringSimpleNode.s, textStringSimpleNode.t, textStringSimpleNode.u, textStringSimpleNode.v, textStringSimpleNode.w, textStringSimpleNode.x);
                    paragraphLayoutCache.c(textStringSimpleNode.s2().i);
                    textSubstitutionValue3.d(paragraphLayoutCache);
                    textStringSimpleNode.C = textSubstitutionValue3;
                } else if (!Intrinsics.c(str, textSubstitutionValue2.getB())) {
                    textSubstitutionValue2.f(str);
                    ParagraphLayoutCache d = textSubstitutionValue2.getD();
                    if (d != null) {
                        TextStyle textStyle = textStringSimpleNode.s;
                        FontFamily.Resolver resolver = textStringSimpleNode.t;
                        int i = textStringSimpleNode.u;
                        boolean z = textStringSimpleNode.v;
                        int i2 = textStringSimpleNode.w;
                        int i3 = textStringSimpleNode.x;
                        d.f1191a = str;
                        d.b = textStyle;
                        d.c = resolver;
                        d.d = i;
                        d.e = z;
                        d.f = i2;
                        d.g = i3;
                        d.b();
                    }
                }
                SemanticsModifierNodeKt.a(textStringSimpleNode);
                DelegatableNodeKt.g(textStringSimpleNode).W();
                DrawModifierNodeKt.a(textStringSimpleNode);
                return Boolean.TRUE;
            }
        }));
        semanticsPropertyReceiver.b(SemanticsActions.l, new AccessibilityAction(null, new Function1<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                TextStringSimpleNode textStringSimpleNode = this.h;
                TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue2 = textStringSimpleNode.C;
                if (textSubstitutionValue2 == null) {
                    return Boolean.FALSE;
                }
                textSubstitutionValue2.e(zBooleanValue);
                SemanticsModifierNodeKt.a(textStringSimpleNode);
                DelegatableNodeKt.g(textStringSimpleNode).W();
                DrawModifierNodeKt.a(textStringSimpleNode);
                return Boolean.TRUE;
            }
        }));
        semanticsPropertyReceiver.b(SemanticsActions.m, new AccessibilityAction(null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$applySemantics$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextStringSimpleNode textStringSimpleNode = this.h;
                textStringSimpleNode.C = null;
                SemanticsModifierNodeKt.a(textStringSimpleNode);
                DelegatableNodeKt.g(textStringSimpleNode).W();
                DrawModifierNodeKt.a(textStringSimpleNode);
                return Boolean.TRUE;
            }
        }));
        SemanticsPropertiesKt.f(semanticsPropertyReceiver, function1);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.MeasureResult n(androidx.compose.ui.layout.MeasureScope r24, androidx.compose.ui.layout.Measurable r25, long r26) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.n(androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, long):androidx.compose.ui.layout.MeasureResult");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int o(androidx.compose.ui.node.LookaheadCapablePlaceable r1, androidx.compose.ui.layout.IntrinsicMeasurable r2, int r3) {
        /*
            r0 = this;
            androidx.compose.foundation.text.modifiers.TextStringSimpleNode$TextSubstitutionValue r2 = r0.C
            if (r2 == 0) goto L14
            boolean r3 = r2.getC()
            if (r3 == 0) goto Lb
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 == 0) goto L14
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r2 = r2.getD()
            if (r2 != 0) goto L18
        L14:
            androidx.compose.foundation.text.modifiers.ParagraphLayoutCache r2 = r0.s2()
        L18:
            r2.c(r1)
            androidx.compose.ui.unit.LayoutDirection r1 = r1.getD()
            androidx.compose.ui.text.ParagraphIntrinsics r1 = r2.d(r1)
            float r1 = r1.b()
            int r1 = androidx.compose.foundation.text.TextDelegateKt.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextStringSimpleNode.o(androidx.compose.ui.node.LookaheadCapablePlaceable, androidx.compose.ui.layout.IntrinsicMeasurable, int):int");
    }

    public final ParagraphLayoutCache s2() {
        if (this.A == null) {
            this.A = new ParagraphLayoutCache(this.r, this.s, this.t, this.u, this.v, this.w, this.x);
        }
        ParagraphLayoutCache paragraphLayoutCache = this.A;
        Intrinsics.e(paragraphLayoutCache);
        return paragraphLayoutCache;
    }
}
