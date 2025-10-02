package androidx.compose.foundation.text;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.input.pointer.PointerIcon_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextLinkScope;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextLinkScope {

    /* renamed from: a, reason: collision with root package name */
    public final MutableState f1136a = SnapshotStateKt.f(null);
    public AnnotatedString b;
    public final SnapshotStateList c;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00020\u00012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/AnnotatedString$Annotation;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.TextLinkScope$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<AnnotatedString.Range<? extends AnnotatedString.Annotation>, List<? extends AnnotatedString.Range<? extends AnnotatedString.Annotation>>> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            TextLinkStyles b;
            SpanStyle spanStyle;
            AnnotatedString.Range range = (AnnotatedString.Range) obj;
            Object obj2 = range.f2032a;
            if (!(obj2 instanceof LinkAnnotation) || (b = ((LinkAnnotation) obj2).getB()) == null || (b.f2065a == null && b.b == null && b.c == null && b.d == null)) {
                return CollectionsKt.k(range);
            }
            Object obj3 = range.f2032a;
            Intrinsics.f(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation");
            TextLinkStyles b2 = ((LinkAnnotation) obj3).getB();
            if (b2 == null || (spanStyle = b2.f2065a) == null) {
                spanStyle = new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }
            return CollectionsKt.k(range, new AnnotatedString.Range(range.b, range.c, spanStyle));
        }
    }

    public TextLinkScope(AnnotatedString annotatedString) {
        annotatedString.getClass();
        AnnotatedString.Builder builder = new AnnotatedString.Builder(annotatedString);
        builder.f(AnonymousClass1.h);
        this.b = builder.m();
        this.c = new SnapshotStateList();
    }

    public static AnnotatedString.Range c(AnnotatedString.Range range, TextLayoutResult textLayoutResult) {
        int iC = textLayoutResult.b.c(r4.f - 1, false);
        if (range.b < iC) {
            return AnnotatedString.Range.a(range, null, 0, Math.min(range.c, iC), 11);
        }
        return null;
    }

    public final void a(Composer composer, final int i) {
        char c;
        ComposerImpl composerImplV = composer.v(1154651354);
        char c2 = 2;
        int i2 = (composerImplV.I(this) ? 4 : 2) | i;
        if (composerImplV.z(i2 & 1, (i2 & 3) != 2)) {
            final UriHandler uriHandler = (UriHandler) composerImplV.x(CompositionLocalsKt.r);
            AnnotatedString annotatedString = this.b;
            List listA = annotatedString.a(annotatedString.e.length());
            int size = listA.size();
            int i3 = 0;
            while (i3 < size) {
                final AnnotatedString.Range range = (AnnotatedString.Range) listA.get(i3);
                int i4 = range.b;
                Object obj = range.f2032a;
                if (i4 != range.c) {
                    composerImplV.o(1386075176);
                    Object objG = composerImplV.G();
                    Object obj2 = Composer.Companion.f1624a;
                    if (objG == obj2) {
                        objG = InteractionSourceKt.a();
                        composerImplV.A(objG);
                    }
                    MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objG;
                    c = c2;
                    Modifier modifierA = HoverableKt.a(SemanticsModifierKt.b(GraphicsLayerModifierKt.a(Modifier.Companion.d, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$clipLink$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:4:0x0017  */
                        @Override // kotlin.jvm.functions.Function1
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invoke(java.lang.Object r10) {
                            /*
                                r9 = this;
                                androidx.compose.ui.graphics.GraphicsLayerScope r10 = (androidx.compose.ui.graphics.GraphicsLayerScope) r10
                                androidx.compose.foundation.text.TextLinkScope$shouldMeasureLinks$1 r0 = new androidx.compose.foundation.text.TextLinkScope$shouldMeasureLinks$1
                                androidx.compose.foundation.text.TextLinkScope r1 = r9.h
                                r0.<init>(r1)
                                java.lang.Object r0 = r0.invoke()
                                java.lang.Boolean r0 = (java.lang.Boolean) r0
                                boolean r0 = r0.booleanValue()
                                r2 = 1
                                r3 = 0
                                if (r0 != 0) goto L19
                            L17:
                                r6 = r3
                                goto L74
                            L19:
                                androidx.compose.runtime.MutableState r0 = r1.f1136a
                                androidx.compose.runtime.SnapshotMutableStateImpl r0 = (androidx.compose.runtime.SnapshotMutableStateImpl) r0
                                java.lang.Object r0 = r0.getD()
                                androidx.compose.ui.text.TextLayoutResult r0 = (androidx.compose.ui.text.TextLayoutResult) r0
                                if (r0 == 0) goto L17
                                androidx.compose.ui.text.MultiParagraph r1 = r0.b
                                androidx.compose.ui.text.AnnotatedString$Range r4 = r2
                                androidx.compose.ui.text.AnnotatedString$Range r4 = androidx.compose.foundation.text.TextLinkScope.c(r4, r0)
                                if (r4 != 0) goto L30
                                goto L17
                            L30:
                                int r5 = r4.c
                                int r4 = r4.b
                                androidx.compose.ui.graphics.AndroidPath r6 = r0.i(r4, r5)
                                androidx.compose.ui.geometry.Rect r7 = r0.b(r4)
                                int r5 = r5 - r2
                                androidx.compose.ui.geometry.Rect r0 = r0.b(r5)
                                int r4 = r1.d(r4)
                                int r1 = r1.d(r5)
                                if (r4 != r1) goto L54
                                float r0 = r0.f1752a
                                float r1 = r7.f1752a
                                float r0 = java.lang.Math.min(r0, r1)
                                goto L55
                            L54:
                                r0 = 0
                            L55:
                                float r1 = r7.b
                                int r0 = java.lang.Float.floatToRawIntBits(r0)
                                long r4 = (long) r0
                                int r0 = java.lang.Float.floatToRawIntBits(r1)
                                long r0 = (long) r0
                                r7 = 32
                                long r4 = r4 << r7
                                r7 = 4294967295(0xffffffff, double:2.1219957905E-314)
                                long r0 = r0 & r7
                                long r0 = r0 | r4
                                r4 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
                                long r0 = r0 ^ r4
                                r6.g(r0)
                            L74:
                                if (r6 == 0) goto L7b
                                androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1 r3 = new androidx.compose.foundation.text.TextLinkScope$shapeForRange$1$1
                                r3.<init>()
                            L7b:
                                if (r3 == 0) goto L83
                                r10.H0(r3)
                                r10.z(r2)
                            L83:
                                kotlin.Unit r10 = kotlin.Unit.f24250a
                                return r10
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLinkScope$clipLink$1.invoke(java.lang.Object):java.lang.Object");
                        }
                    }), false, TextLinkScope$LinksComposables$1$1.h).x0(new TextRangeLayoutModifier(new a(this, range))), mutableInteractionSource);
                    PointerIcon.f1852a.getClass();
                    Modifier modifierA2 = PointerIconKt.a(modifierA, PointerIcon_androidKt.b);
                    boolean zI = composerImplV.I(this) | composerImplV.n(range) | composerImplV.I(uriHandler);
                    Object objG2 = composerImplV.G();
                    if (zI || objG2 == obj2) {
                        objG2 = new Function0<Unit>(this) { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                LinkInteractionListener linkInteractionListener;
                                LinkAnnotation linkAnnotation = (LinkAnnotation) range.f2032a;
                                UriHandler uriHandler2 = uriHandler;
                                boolean z = linkAnnotation instanceof LinkAnnotation.Url;
                                Unit unit = Unit.f24250a;
                                if (z) {
                                    try {
                                        uriHandler2.a(((LinkAnnotation.Url) linkAnnotation).f2044a);
                                        return unit;
                                    } catch (IllegalArgumentException unused) {
                                    }
                                } else if ((linkAnnotation instanceof LinkAnnotation.Clickable) && (linkInteractionListener = ((LinkAnnotation.Clickable) linkAnnotation).c) != null) {
                                    linkInteractionListener.a(linkAnnotation);
                                }
                                return unit;
                            }
                        };
                        composerImplV.A(objG2);
                    }
                    BoxKt.a(ClickableKt.e(modifierA2, mutableInteractionSource, null, true, true, (Function0) objG2), composerImplV, 0);
                    LinkAnnotation linkAnnotation = (LinkAnnotation) obj;
                    TextLinkStyles b = linkAnnotation.getB();
                    if (b == null || (b.f2065a == null && b.b == null && b.c == null && b.d == null)) {
                        composerImplV.o(1388926990);
                        composerImplV.V(false);
                    } else {
                        composerImplV.o(1386898319);
                        Object objG3 = composerImplV.G();
                        if (objG3 == obj2) {
                            objG3 = new LinkStateInteractionSourceObserver(mutableInteractionSource);
                            composerImplV.A(objG3);
                        }
                        final LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = (LinkStateInteractionSourceObserver) objG3;
                        Object objG4 = composerImplV.G();
                        if (objG4 == obj2) {
                            objG4 = new TextLinkScope$LinksComposables$1$3$1(linkStateInteractionSourceObserver, null);
                            composerImplV.A(objG4);
                        }
                        EffectsKt.e(composerImplV, Unit.f24250a, (Function2) objG4);
                        MutableIntState mutableIntState = linkStateInteractionSourceObserver.b;
                        MutableIntState mutableIntState2 = linkStateInteractionSourceObserver.b;
                        Boolean boolValueOf = Boolean.valueOf((((SnapshotMutableIntStateImpl) mutableIntState).d() & 2) != 0);
                        Boolean boolValueOf2 = Boolean.valueOf((((SnapshotMutableIntStateImpl) mutableIntState2).d() & 1) != 0);
                        Boolean boolValueOf3 = Boolean.valueOf((((SnapshotMutableIntStateImpl) mutableIntState2).d() & 4) != 0);
                        TextLinkStyles b2 = linkAnnotation.getB();
                        SpanStyle spanStyle = b2 != null ? b2.f2065a : null;
                        TextLinkStyles b3 = linkAnnotation.getB();
                        SpanStyle spanStyle2 = b3 != null ? b3.b : null;
                        TextLinkStyles b4 = linkAnnotation.getB();
                        SpanStyle spanStyle3 = b4 != null ? b4.c : null;
                        TextLinkStyles b5 = linkAnnotation.getB();
                        Object[] objArr = {boolValueOf, boolValueOf2, boolValueOf3, spanStyle, spanStyle2, spanStyle3, b5 != null ? b5.d : null};
                        boolean zI2 = composerImplV.I(this) | composerImplV.n(range);
                        Object objG5 = composerImplV.G();
                        if (zI2 || objG5 == obj2) {
                            objG5 = new Function1<TextAnnotatorScope, Unit>(this) { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$4$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    TextLinkStyles b6;
                                    TextLinkStyles b7;
                                    TextLinkStyles b8;
                                    TextAnnotatorScope textAnnotatorScope = (TextAnnotatorScope) obj3;
                                    MutableIntState mutableIntState3 = linkStateInteractionSourceObserver.b;
                                    final AnnotatedString.Range range2 = range;
                                    Object obj4 = range2.f2032a;
                                    TextLinkStyles b9 = ((LinkAnnotation) obj4).getB();
                                    final SpanStyle spanStyleD = null;
                                    SpanStyle spanStyle4 = b9 != null ? b9.f2065a : null;
                                    SpanStyle spanStyleD2 = ((((SnapshotMutableIntStateImpl) mutableIntState3).d() & 1) == 0 || (b8 = ((LinkAnnotation) obj4).getB()) == null) ? null : b8.b;
                                    if (spanStyle4 != null) {
                                        spanStyleD2 = spanStyle4.d(spanStyleD2);
                                    }
                                    SpanStyle spanStyleD3 = ((((SnapshotMutableIntStateImpl) mutableIntState3).d() & 2) == 0 || (b7 = ((LinkAnnotation) obj4).getB()) == null) ? null : b7.c;
                                    if (spanStyleD2 != null) {
                                        spanStyleD3 = spanStyleD2.d(spanStyleD3);
                                    }
                                    if ((((SnapshotMutableIntStateImpl) mutableIntState3).d() & 4) != 0 && (b6 = ((LinkAnnotation) obj4).getB()) != null) {
                                        spanStyleD = b6.d;
                                    }
                                    if (spanStyleD3 != null) {
                                        spanStyleD = spanStyleD3.d(spanStyleD);
                                    }
                                    final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                                    AnnotatedString annotatedString2 = textAnnotatorScope.f1126a;
                                    Function1<AnnotatedString.Range<? extends AnnotatedString.Annotation>, AnnotatedString.Range<? extends AnnotatedString.Annotation>> function1 = new Function1<AnnotatedString.Range<? extends AnnotatedString.Annotation>, AnnotatedString.Range<? extends AnnotatedString.Annotation>>() { // from class: androidx.compose.foundation.text.TextAnnotatorScope$replaceStyle$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
                                        @Override // kotlin.jvm.functions.Function1
                                        /*
                                            Code decompiled incorrectly, please refer to instructions dump.
                                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                                        */
                                        public final java.lang.Object invoke(java.lang.Object r29) {
                                            /*
                                                r28 = this;
                                                r0 = r28
                                                r1 = r29
                                                androidx.compose.ui.text.AnnotatedString$Range r1 = (androidx.compose.ui.text.AnnotatedString.Range) r1
                                                kotlin.jvm.internal.Ref$BooleanRef r2 = r1
                                                boolean r3 = r2.d
                                                androidx.compose.ui.text.AnnotatedString$Range r4 = r2
                                                if (r3 == 0) goto L4c
                                                java.lang.Object r3 = r1.f2032a
                                                int r5 = r1.c
                                                int r6 = r1.b
                                                boolean r3 = r3 instanceof androidx.compose.ui.text.SpanStyle
                                                if (r3 == 0) goto L4c
                                                int r3 = r4.b
                                                if (r6 != r3) goto L4c
                                                int r3 = r4.c
                                                if (r5 != r3) goto L4c
                                                androidx.compose.ui.text.AnnotatedString$Range r3 = new androidx.compose.ui.text.AnnotatedString$Range
                                                androidx.compose.ui.text.SpanStyle r7 = r3
                                                if (r7 != 0) goto L48
                                                androidx.compose.ui.text.SpanStyle r8 = new androidx.compose.ui.text.SpanStyle
                                                r26 = 0
                                                r27 = 65535(0xffff, float:9.1834E-41)
                                                r9 = 0
                                                r11 = 0
                                                r13 = 0
                                                r14 = 0
                                                r15 = 0
                                                r16 = 0
                                                r17 = 0
                                                r18 = 0
                                                r20 = 0
                                                r21 = 0
                                                r22 = 0
                                                r23 = 0
                                                r25 = 0
                                                r8.<init>(r9, r11, r13, r14, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27)
                                                r7 = r8
                                            L48:
                                                r3.<init>(r6, r5, r7)
                                                goto L4d
                                            L4c:
                                                r3 = r1
                                            L4d:
                                                boolean r1 = r4.equals(r1)
                                                r2.d = r1
                                                return r3
                                            */
                                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextAnnotatorScope$replaceStyle$1.invoke(java.lang.Object):java.lang.Object");
                                        }
                                    };
                                    annotatedString2.getClass();
                                    AnnotatedString.Builder builder = new AnnotatedString.Builder(annotatedString2);
                                    builder.g(function1);
                                    textAnnotatorScope.b = builder.m();
                                    return Unit.f24250a;
                                }
                            };
                            composerImplV.A(objG5);
                        }
                        b(objArr, (Function1) objG5, composerImplV, (i2 << 6) & 896);
                        composerImplV.V(false);
                    }
                    composerImplV.V(false);
                } else {
                    c = c2;
                    composerImplV.o(1388940878);
                    composerImplV.V(false);
                }
                i3++;
                c2 = c;
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.foundation.text.TextLinkScope$LinksComposables$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    this.h.a((Composer) obj3, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public final void b(final Object[] objArr, final Function1 function1, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-2083052099);
        int i2 = (i & 48) == 0 ? (composerImplV.I(function1) ? 32 : 16) | i : i;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(this) ? 256 : 128;
        }
        composerImplV.J(-416604407, Integer.valueOf(objArr.length));
        for (Object obj : objArr) {
            i2 |= composerImplV.I(obj) ? 4 : 0;
        }
        composerImplV.V(false);
        if ((i2 & 14) == 0) {
            i2 |= 2;
        }
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.a(function1);
            spreadBuilder.b(objArr);
            ArrayList arrayList = spreadBuilder.f24269a;
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean zI = composerImplV.I(this) | ((i2 & 112) == 32);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        final TextLinkScope textLinkScope = this.h;
                        SnapshotStateList snapshotStateList = textLinkScope.c;
                        final Function1 function12 = function1;
                        snapshotStateList.add(function12);
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                textLinkScope.c.remove(function12);
                            }
                        };
                    }
                };
                composerImplV.A(objG);
            }
            EffectsKt.d(array, (Function1) objG, composerImplV);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.TextLinkScope$StyleAnnotation$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    Object[] objArr2 = objArr;
                    Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    this.h.b(objArrCopyOf, function1, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
