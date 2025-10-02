package androidx.compose.foundation.text.modifiers;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.LookaheadCapablePlaceable;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "TextSubstitutionValue", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public Function1 A;
    public SelectionController B;
    public ColorProducer C;
    public Function1 D;
    public Map E;
    public MultiParagraphLayoutCache F;
    public Function1 G;
    public TextSubstitutionValue H;
    public AnnotatedString r;
    public TextStyle s;
    public FontFamily.Resolver t;
    public Function1 u;
    public int v;
    public boolean w;
    public int x;
    public int y;
    public List z;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringNode$TextSubstitutionValue;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class TextSubstitutionValue {

        /* renamed from: a, reason: collision with root package name */
        public final AnnotatedString f1195a;
        public AnnotatedString b;
        public boolean c = false;
        public MultiParagraphLayoutCache d = null;

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2) {
            this.f1195a = annotatedString;
            this.b = annotatedString2;
        }

        /* renamed from: a, reason: from getter */
        public final MultiParagraphLayoutCache getD() {
            return this.d;
        }

        /* renamed from: b, reason: from getter */
        public final AnnotatedString getB() {
            return this.b;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getC() {
            return this.c;
        }

        public final void d(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.d = multiParagraphLayoutCache;
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
            return Intrinsics.c(this.f1195a, textSubstitutionValue.f1195a) && Intrinsics.c(this.b, textSubstitutionValue.b) && this.c == textSubstitutionValue.c && Intrinsics.c(this.d, textSubstitutionValue.d);
        }

        public final void f(AnnotatedString annotatedString) {
            this.b = annotatedString;
        }

        public final int hashCode() {
            int iE = b.e((this.b.hashCode() + (this.f1195a.hashCode() * 31)) * 31, 31, this.c);
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.d;
            return iE + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.f1195a) + ", substitution=" + ((Object) this.b) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ')';
        }
    }

    public TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13) {
        this.r = annotatedString;
        this.s = textStyle;
        this.t = resolver;
        this.u = function1;
        this.v = i;
        this.w = z;
        this.x = i2;
        this.y = i3;
        this.z = list;
        this.A = function12;
        this.B = selectionController;
        this.C = colorProducer;
        this.D = function13;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void I(LayoutNodeDrawScope layoutNodeDrawScope) throws Throwable {
        Selection selection;
        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1;
        long j;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.d;
        if (this.q) {
            SelectionController selectionController = this.B;
            if (selectionController != null && (selection = (Selection) selectionController.e.f().b(selectionController.d)) != null) {
                int b = !selection.getC() ? selection.getF1204a().getB() : selection.getB().getB();
                int b2 = !selection.getC() ? selection.getB().getB() : selection.getF1204a().getB();
                if (b != b2) {
                    Selectable selectable = selectionController.h;
                    int iE = selectable != null ? selectable.e() : 0;
                    if (b > iE) {
                        b = iE;
                    }
                    if (b2 > iE) {
                        b2 = iE;
                    }
                    AndroidPath androidPathB = selectionController.g.b(b, b2);
                    if (androidPathB != null) {
                        if (selectionController.g.c()) {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope.h() >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope.h() & 4294967295L));
                            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$12 = canvasDrawScope.e;
                            long jD = canvasDrawScope$drawContext$12.d();
                            canvasDrawScope$drawContext$12.a().save();
                            try {
                                canvasDrawScope$drawContext$12.f1798a.b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, fIntBitsToFloat, fIntBitsToFloat2, 1);
                                canvasDrawScope$drawContext$1 = canvasDrawScope$drawContext$12;
                            } catch (Throwable th) {
                                th = th;
                                canvasDrawScope$drawContext$1 = canvasDrawScope$drawContext$12;
                            }
                            try {
                                j = jD;
                            } catch (Throwable th2) {
                                th = th2;
                                j = jD;
                                b.C(canvasDrawScope$drawContext$1, j);
                                throw th;
                            }
                            try {
                                DrawScope.Z(layoutNodeDrawScope, androidPathB, selectionController.f, BitmapDescriptorFactory.HUE_RED, null, 60);
                                b.C(canvasDrawScope$drawContext$1, j);
                            } catch (Throwable th3) {
                                th = th3;
                                b.C(canvasDrawScope$drawContext$1, j);
                                throw th;
                            }
                        } else {
                            DrawScope.Z(layoutNodeDrawScope, androidPathB, selectionController.f, BitmapDescriptorFactory.HUE_RED, null, 60);
                        }
                    }
                }
            }
            Canvas canvasA = canvasDrawScope.e.a();
            TextLayoutResult textLayoutResult = u2(layoutNodeDrawScope).n;
            if (textLayoutResult == null) {
                throw new IllegalStateException("You must call layoutWithConstraints first");
            }
            long j2 = textLayoutResult.c;
            MultiParagraph multiParagraph = textLayoutResult.b;
            boolean z = (((float) ((int) (j2 >> 32))) < multiParagraph.d || textLayoutResult.d()) && this.v != 3;
            if (z) {
                Rect rectA = RectKt.a(0L, (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L));
                canvasA.save();
                canvasA.h(rectA);
            }
            try {
                SpanStyle spanStyle = this.s.f2068a;
                TextDecoration textDecoration = spanStyle.background;
                if (textDecoration == null) {
                    textDecoration = TextDecoration.b;
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = spanStyle.shadow;
                if (shadow == null) {
                    shadow = Shadow.d;
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = spanStyle.drawStyle;
                if (drawStyle == null) {
                    drawStyle = Fill.f1802a;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = spanStyle.f2058a.getBrush();
                if (brush != null) {
                    AndroidMultiParagraphDraw_androidKt.a(multiParagraph, canvasA, brush, this.s.f2068a.f2058a.getB(), shadow2, textDecoration2, drawStyle2);
                } else {
                    ColorProducer colorProducer = this.C;
                    long jA = colorProducer != null ? colorProducer.a() : Color.k;
                    if (jA == 16) {
                        jA = this.s.b() != 16 ? this.s.b() : Color.b;
                    }
                    MultiParagraph.i(multiParagraph, canvasA, jA, shadow2, textDecoration2, drawStyle2);
                }
                if (z) {
                    canvasA.m();
                }
                TextSubstitutionValue textSubstitutionValue = this.H;
                if (!((textSubstitutionValue == null || !textSubstitutionValue.getC()) ? TextAnnotatedStringNodeKt.a(this.r) : false)) {
                    List list = this.z;
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                }
                layoutNodeDrawScope.Q0();
            } catch (Throwable th4) {
                if (z) {
                    canvasA.m();
                }
                throw th4;
            }
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int M(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return u2(lookaheadCapablePlaceable).a(i, lookaheadCapablePlaceable.getD());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int N(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return TextDelegateKt.a(u2(lookaheadCapablePlaceable).d(lookaheadCapablePlaceable.getD()).c());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int O(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return u2(lookaheadCapablePlaceable).a(i, lookaheadCapablePlaceable.getD());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        Function1<List<TextLayoutResult>, Boolean> function1 = this.G;
        if (function1 == null) {
            function1 = new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    TextLayoutResult textLayoutResult;
                    List list = (List) obj;
                    TextAnnotatedStringNode textAnnotatedStringNode = this.h;
                    TextLayoutResult textLayoutResult2 = textAnnotatedStringNode.t2().n;
                    if (textLayoutResult2 != null) {
                        TextLayoutInput textLayoutInput = textLayoutResult2.f2064a;
                        AnnotatedString annotatedString = textLayoutInput.f2063a;
                        TextStyle textStyle = textAnnotatedStringNode.s;
                        ColorProducer colorProducer = textAnnotatedStringNode.C;
                        textLayoutResult = new TextLayoutResult(new TextLayoutInput(annotatedString, TextStyle.e(textStyle, colorProducer != null ? colorProducer.a() : Color.k, 0L, null, null, null, 0L, null, 0, 0L, 16777214), textLayoutInput.c, textLayoutInput.d, textLayoutInput.e, textLayoutInput.f, textLayoutInput.g, textLayoutInput.h, textLayoutInput.i, textLayoutInput.j), textLayoutResult2.b, textLayoutResult2.c);
                        list.add(textLayoutResult);
                    } else {
                        textLayoutResult = null;
                    }
                    return Boolean.valueOf(textLayoutResult != null);
                }
            };
            this.G = function1;
        }
        AnnotatedString annotatedString = this.r;
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
        semanticsPropertyReceiver.b(SemanticsProperties.z, CollectionsKt.Q(annotatedString));
        TextSubstitutionValue textSubstitutionValue = this.H;
        if (textSubstitutionValue != null) {
            AnnotatedString b = textSubstitutionValue.getB();
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.A;
            KProperty[] kPropertyArr2 = SemanticsPropertiesKt.f2022a;
            KProperty kProperty = kPropertyArr2[14];
            semanticsPropertyKey.getClass();
            semanticsPropertyReceiver.b(semanticsPropertyKey, b);
            boolean c = textSubstitutionValue.getC();
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.B;
            KProperty kProperty2 = kPropertyArr2[15];
            Boolean boolValueOf = Boolean.valueOf(c);
            semanticsPropertyKey2.getClass();
            semanticsPropertyReceiver.b(semanticsPropertyKey2, boolValueOf);
        }
        semanticsPropertyReceiver.b(SemanticsActions.k, new AccessibilityAction(null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                AnnotatedString annotatedString2 = (AnnotatedString) obj;
                TextAnnotatedStringNode textAnnotatedStringNode = this.h;
                TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue2 = textAnnotatedStringNode.H;
                EmptyList emptyList = EmptyList.d;
                if (textSubstitutionValue2 == null) {
                    TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue3 = new TextAnnotatedStringNode.TextSubstitutionValue(textAnnotatedStringNode.r, annotatedString2);
                    MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString2, textAnnotatedStringNode.s, textAnnotatedStringNode.t, textAnnotatedStringNode.v, textAnnotatedStringNode.w, textAnnotatedStringNode.x, textAnnotatedStringNode.y, emptyList);
                    multiParagraphLayoutCache.c(textAnnotatedStringNode.t2().j);
                    textSubstitutionValue3.d(multiParagraphLayoutCache);
                    textAnnotatedStringNode.H = textSubstitutionValue3;
                } else if (!Intrinsics.c(annotatedString2, textSubstitutionValue2.getB())) {
                    textSubstitutionValue2.f(annotatedString2);
                    MultiParagraphLayoutCache d = textSubstitutionValue2.getD();
                    if (d != null) {
                        TextStyle textStyle = textAnnotatedStringNode.s;
                        FontFamily.Resolver resolver = textAnnotatedStringNode.t;
                        int i = textAnnotatedStringNode.v;
                        boolean z = textAnnotatedStringNode.w;
                        int i2 = textAnnotatedStringNode.x;
                        int i3 = textAnnotatedStringNode.y;
                        d.f1190a = annotatedString2;
                        d.e(textStyle);
                        d.b = resolver;
                        d.c = i;
                        d.d = z;
                        d.e = i2;
                        d.f = i3;
                        d.g = emptyList;
                        d.l = null;
                        d.n = null;
                        d.p = -1;
                        d.o = -1;
                    }
                }
                SemanticsModifierNodeKt.a(textAnnotatedStringNode);
                DelegatableNodeKt.g(textAnnotatedStringNode).W();
                DrawModifierNodeKt.a(textAnnotatedStringNode);
                return Boolean.TRUE;
            }
        }));
        semanticsPropertyReceiver.b(SemanticsActions.l, new AccessibilityAction(null, new Function1<Boolean, Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$3
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                TextAnnotatedStringNode textAnnotatedStringNode = this.h;
                TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue2 = textAnnotatedStringNode.H;
                if (textSubstitutionValue2 == null) {
                    return Boolean.FALSE;
                }
                Function1 function12 = textAnnotatedStringNode.D;
                if (function12 != null) {
                    function12.invoke(textSubstitutionValue2);
                }
                TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue3 = textAnnotatedStringNode.H;
                if (textSubstitutionValue3 != null) {
                    textSubstitutionValue3.e(zBooleanValue);
                }
                SemanticsModifierNodeKt.a(textAnnotatedStringNode);
                DelegatableNodeKt.g(textAnnotatedStringNode).W();
                DrawModifierNodeKt.a(textAnnotatedStringNode);
                return Boolean.TRUE;
            }
        }));
        semanticsPropertyReceiver.b(SemanticsActions.m, new AccessibilityAction(null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$applySemantics$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TextAnnotatedStringNode textAnnotatedStringNode = this.h;
                textAnnotatedStringNode.H = null;
                SemanticsModifierNodeKt.a(textAnnotatedStringNode);
                DelegatableNodeKt.g(textAnnotatedStringNode).W();
                DrawModifierNodeKt.a(textAnnotatedStringNode);
                return Boolean.TRUE;
            }
        }));
        SemanticsPropertiesKt.f(semanticsPropertyReceiver, function1);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean h2() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    @Override // androidx.compose.ui.node.LayoutModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.compose.ui.layout.MeasureResult n(androidx.compose.ui.layout.MeasureScope r9, androidx.compose.ui.layout.Measurable r10, long r11) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode.n(androidx.compose.ui.layout.MeasureScope, androidx.compose.ui.layout.Measurable, long):androidx.compose.ui.layout.MeasureResult");
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int o(LookaheadCapablePlaceable lookaheadCapablePlaceable, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return TextDelegateKt.a(u2(lookaheadCapablePlaceable).d(lookaheadCapablePlaceable.getD()).b());
    }

    public final void s2(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            MultiParagraphLayoutCache multiParagraphLayoutCacheT2 = t2();
            AnnotatedString annotatedString = this.r;
            TextStyle textStyle = this.s;
            FontFamily.Resolver resolver = this.t;
            int i = this.v;
            boolean z5 = this.w;
            int i2 = this.x;
            int i3 = this.y;
            List list = this.z;
            multiParagraphLayoutCacheT2.f1190a = annotatedString;
            multiParagraphLayoutCacheT2.e(textStyle);
            multiParagraphLayoutCacheT2.b = resolver;
            multiParagraphLayoutCacheT2.c = i;
            multiParagraphLayoutCacheT2.d = z5;
            multiParagraphLayoutCacheT2.e = i2;
            multiParagraphLayoutCacheT2.f = i3;
            multiParagraphLayoutCacheT2.g = list;
            multiParagraphLayoutCacheT2.l = null;
            multiParagraphLayoutCacheT2.n = null;
            multiParagraphLayoutCacheT2.p = -1;
            multiParagraphLayoutCacheT2.o = -1;
        }
        if (this.q) {
            if (z2 || (z && this.G != null)) {
                SemanticsModifierNodeKt.a(this);
            }
            if (z2 || z3 || z4) {
                DelegatableNodeKt.g(this).W();
                DrawModifierNodeKt.a(this);
            }
            if (z) {
                DrawModifierNodeKt.a(this);
            }
        }
    }

    public final MultiParagraphLayoutCache t2() {
        if (this.F == null) {
            this.F = new MultiParagraphLayoutCache(this.r, this.s, this.t, this.v, this.w, this.x, this.y, this.z);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this.F;
        Intrinsics.e(multiParagraphLayoutCache);
        return multiParagraphLayoutCache;
    }

    public final MultiParagraphLayoutCache u2(Density density) {
        MultiParagraphLayoutCache d;
        TextSubstitutionValue textSubstitutionValue = this.H;
        if (textSubstitutionValue != null && textSubstitutionValue.getC() && (d = textSubstitutionValue.getD()) != null) {
            d.c(density);
            return d;
        }
        MultiParagraphLayoutCache multiParagraphLayoutCacheT2 = t2();
        multiParagraphLayoutCacheT2.c(density);
        return multiParagraphLayoutCacheT2;
    }

    public final boolean v2(Function1 function1, Function1 function12, SelectionController selectionController, Function1 function13) {
        boolean z;
        if (this.u != function1) {
            this.u = function1;
            z = true;
        } else {
            z = false;
        }
        if (this.A != function12) {
            this.A = function12;
            z = true;
        }
        if (!Intrinsics.c(this.B, selectionController)) {
            this.B = selectionController;
            z = true;
        }
        if (this.D == function13) {
            return z;
        }
        this.D = function13;
        return true;
    }

    public final boolean w2(TextStyle textStyle, List list, int i, int i2, boolean z, FontFamily.Resolver resolver, int i3) {
        boolean z2 = !this.s.c(textStyle);
        this.s = textStyle;
        if (!Intrinsics.c(this.z, list)) {
            this.z = list;
            z2 = true;
        }
        if (this.y != i) {
            this.y = i;
            z2 = true;
        }
        if (this.x != i2) {
            this.x = i2;
            z2 = true;
        }
        if (this.w != z) {
            this.w = z;
            z2 = true;
        }
        if (!Intrinsics.c(this.t, resolver)) {
            this.t = resolver;
            z2 = true;
        }
        if (this.v == i3) {
            return z2;
        }
        this.v = i3;
        return true;
    }

    public final boolean x2(AnnotatedString annotatedString) {
        boolean zC = Intrinsics.c(this.r.e, annotatedString.e);
        boolean z = (zC && Intrinsics.c(this.r.d, annotatedString.d)) ? false : true;
        if (z) {
            this.r = annotatedString;
        }
        if (!zC) {
            this.H = null;
        }
        return z;
    }
}
