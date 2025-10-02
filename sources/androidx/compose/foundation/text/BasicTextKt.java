package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.text.modifiers.SelectableTextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.SelectionController;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNodeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "displayedText", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class BasicTextKt {
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.ui.text.AnnotatedString r24, final androidx.compose.ui.Modifier r25, final androidx.compose.ui.text.TextStyle r26, final kotlin.jvm.functions.Function1 r27, final int r28, final boolean r29, final int r30, int r31, java.util.Map r32, androidx.compose.ui.graphics.ColorProducer r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.a(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.ui.text.AnnotatedString r25, final androidx.compose.ui.Modifier r26, final androidx.compose.ui.text.TextStyle r27, final kotlin.jvm.functions.Function1 r28, final int r29, final boolean r30, final int r31, final int r32, final java.util.Map r33, androidx.compose.ui.graphics.ColorProducer r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.b(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(java.lang.String r33, androidx.compose.ui.Modifier r34, androidx.compose.ui.text.TextStyle r35, kotlin.jvm.functions.Function1 r36, int r37, boolean r38, int r39, int r40, androidx.compose.ui.graphics.ColorProducer r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.c(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final java.lang.String r23, final androidx.compose.ui.Modifier r24, final androidx.compose.ui.text.TextStyle r25, final kotlin.jvm.functions.Function1 r26, final int r27, final boolean r28, final int r29, final int r30, androidx.compose.ui.graphics.ColorProducer r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextKt.d(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, kotlin.jvm.functions.Function1, int, boolean, int, int, androidx.compose.ui.graphics.ColorProducer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.ComposerImpl] */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.foundation.text.TextLinkScope, java.lang.Object] */
    public static final void e(final Modifier modifier, final AnnotatedString annotatedString, final Function1 function1, final boolean z, final Map map, final TextStyle textStyle, final int i, final boolean z2, final int i2, final int i3, final FontFamily.Resolver resolver, final SelectionController selectionController, final ColorProducer colorProducer, final Function1 function12, Composer composer, final int i4, final int i5) {
        int i6;
        TextStyle textStyle2;
        int i7;
        final ?? r6;
        Function0 function0;
        Pair pair;
        MutableState mutableState;
        Function0 function02;
        final MutableState mutableState2;
        ?? r26;
        Object textMeasurePolicy;
        boolean z3;
        ?? V = composer.v(-2118572703);
        if ((i4 & 6) == 0) {
            i6 = (V.n(modifier) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= V.n(annotatedString) ? 32 : 16;
        }
        if ((i4 & KyberEngine.KyberPolyBytes) == 0) {
            i6 |= V.I(function1) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= V.p(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= V.I(map) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            textStyle2 = textStyle;
            i6 |= V.n(textStyle2) ? 131072 : 65536;
        } else {
            textStyle2 = textStyle;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= V.r(i) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= V.p(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= V.r(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= V.r(i3) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (V.I(resolver) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= V.I(selectionController) ? 32 : 16;
        }
        if ((i5 & KyberEngine.KyberPolyBytes) == 0) {
            i7 |= V.I(colorProducer) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i7 |= V.I(function12) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= (i5 & 32768) == 0 ? V.n(null) : V.I(null) ? 16384 : 8192;
        }
        if (V.z(i6 & 1, ((i6 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            boolean zA = TextAnnotatedStringNodeKt.a(annotatedString);
            Object obj = Composer.Companion.f1624a;
            if (zA) {
                V.o(-613484007);
                boolean z4 = (i6 & 112) == 32;
                Object objG = V.G();
                if (z4 || objG == obj) {
                    objG = new TextLinkScope(annotatedString);
                    V.A(objG);
                }
                V.V(false);
                r6 = (TextLinkScope) objG;
            } else {
                V.o(-613418350);
                V.V(false);
                r6 = 0;
            }
            if (TextAnnotatedStringNodeKt.a(annotatedString)) {
                V.o(-613220135);
                boolean zN = ((i6 & 112) == 32) | V.n(r6);
                Object objG2 = V.G();
                if (zN || objG2 == obj) {
                    objG2 = new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            AnnotatedString annotatedString2;
                            TextLinkScope textLinkScope = r6;
                            if (textLinkScope != null) {
                                SnapshotStateList snapshotStateList = textLinkScope.c;
                                if (snapshotStateList.isEmpty()) {
                                    annotatedString2 = textLinkScope.b;
                                } else {
                                    TextAnnotatorScope textAnnotatorScope = new TextAnnotatorScope(textLinkScope.b);
                                    int size = snapshotStateList.size();
                                    for (int i8 = 0; i8 < size; i8++) {
                                        ((Function1) snapshotStateList.get(i8)).invoke(textAnnotatorScope);
                                    }
                                    annotatedString2 = textAnnotatorScope.b;
                                }
                                textLinkScope.b = annotatedString2;
                                if (annotatedString2 != null) {
                                    return annotatedString2;
                                }
                            }
                            return annotatedString;
                        }
                    };
                    V.A(objG2);
                }
                function0 = (Function0) objG2;
                V.V(false);
            } else {
                V.o(-613122857);
                boolean z5 = (i6 & 112) == 32;
                Object objG3 = V.G();
                if (z5 || objG3 == obj) {
                    objG3 = new Function0<AnnotatedString>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$styledText$2$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return annotatedString;
                        }
                    };
                    V.A(objG3);
                }
                function0 = (Function0) objG3;
                V.V(false);
            }
            if (z) {
                pair = AnnotatedStringResolveInlineContentKt.c(annotatedString, map);
                mutableState = null;
            } else {
                pair = new Pair(null, null);
                mutableState = null;
            }
            List list = (List) pair.d;
            List list2 = (List) pair.e;
            if (z) {
                V.o(-612806750);
                Object objG4 = V.G();
                if (objG4 == obj) {
                    objG4 = SnapshotStateKt.f(mutableState);
                    V.A(objG4);
                }
                V.V(false);
                mutableState2 = (MutableState) objG4;
                function02 = function0;
            } else {
                function02 = function0;
                V.o(-612718990);
                V.V(false);
                mutableState2 = mutableState;
            }
            if (z) {
                V.o(-612625741);
                boolean zN2 = V.n(mutableState2);
                Object objG5 = V.G();
                if (zN2 || objG5 == obj) {
                    objG5 = new Function1<List<? extends Rect>, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$onPlaceholderLayout$1$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            List list3 = (List) obj2;
                            MutableState mutableState3 = mutableState2;
                            if (mutableState3 != null) {
                                mutableState3.setValue(list3);
                            }
                            return Unit.f24250a;
                        }
                    };
                    V.A(objG5);
                }
                V.V(false);
                r26 = (Function1) objG5;
            } else {
                V.o(-612554318);
                V.V(false);
                r26 = mutableState;
            }
            AnnotatedString annotatedString2 = (AnnotatedString) function02.invoke();
            boolean zI = V.I(r6) | ((i6 & 896) == 256);
            Object objG6 = V.G();
            if (zI || objG6 == obj) {
                objG6 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        TextLayoutResult textLayoutResult = (TextLayoutResult) obj2;
                        TextLinkScope textLinkScope = r6;
                        if (textLinkScope != null) {
                            ((SnapshotMutableStateImpl) textLinkScope.f1136a).setValue(textLayoutResult);
                        }
                        Function1 function13 = function1;
                        if (function13 != null) {
                            function13.invoke(textLayoutResult);
                        }
                        return Unit.f24250a;
                    }
                };
                V.A(objG6);
            }
            Modifier modifierG = g(modifier, annotatedString2, textStyle2, (Function1) objG6, i, z2, i2, i3, resolver, list, r26, selectionController, colorProducer, function12);
            if (z) {
                V.o(-611365560);
                boolean zI2 = V.I(r6);
                Object objG7 = V.G();
                if (zI2 || objG7 == obj) {
                    objG7 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$4$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            TextLinkScope textLinkScope = r6;
                            return Boolean.valueOf(textLinkScope != null ? ((Boolean) new TextLinkScope$shouldMeasureLinks$1(textLinkScope).invoke()).booleanValue() : false);
                        }
                    };
                    V.A(objG7);
                }
                Function0 function03 = (Function0) objG7;
                boolean zN3 = V.n(mutableState2);
                Object objG8 = V.G();
                if (zN3 || objG8 == obj) {
                    objG8 = new Function0<List<? extends Rect>>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$5$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState mutableState3 = mutableState2;
                            if (mutableState3 != null) {
                                return (List) mutableState3.getD();
                            }
                            return null;
                        }
                    };
                    V.A(objG8);
                }
                textMeasurePolicy = new TextMeasurePolicy(function03, (Function0) objG8);
                V.V(false);
            } else {
                V.o(-611542291);
                boolean zI3 = V.I(r6);
                Object objG9 = V.G();
                if (zI3 || objG9 == obj) {
                    objG9 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$3$1
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            TextLinkScope textLinkScope = r6;
                            return Boolean.valueOf(textLinkScope != null ? ((Boolean) new TextLinkScope$shouldMeasureLinks$1(textLinkScope).invoke()).booleanValue() : false);
                        }
                    };
                    V.A(objG9);
                }
                textMeasurePolicy = new LinksTextMeasurePolicy((Function0) objG9);
                V.V(false);
            }
            int i8 = V.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = V.Q();
            Modifier modifierD = ComposedModifierKt.d(V, modifierG);
            ComposeUiNode.e3.getClass();
            Function0 function04 = ComposeUiNode.Companion.b;
            V.i();
            if (V.O) {
                V.K(function04);
            } else {
                V.e();
            }
            Updater.b(V, textMeasurePolicy, ComposeUiNode.Companion.g);
            Updater.b(V, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (V.O || !Intrinsics.c(V.G(), Integer.valueOf(i8))) {
                b.B(i8, V, i8, function2);
            }
            Updater.b(V, modifierD, ComposeUiNode.Companion.d);
            if (r6 == 0) {
                V.o(-509592027);
                z3 = false;
            } else {
                z3 = false;
                V.o(537750876);
                r6.a(V, 0);
            }
            V.V(z3);
            if (list2 == null) {
                V.o(-509541249);
            } else {
                V.o(-509541248);
                AnnotatedStringResolveInlineContentKt.a(annotatedString, list2, V, (i6 >> 3) & 14);
            }
            V.V(z3);
            V.V(true);
        } else {
            V.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = V.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextKt$LayoutWithLinksAndInlineContent$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(i4 | 1);
                    int iA2 = RecomposeScopeImplKt.a(i5);
                    BasicTextKt.e(modifier, annotatedString, function1, z, map, textStyle, i, z2, i2, i3, resolver, selectionController, colorProducer, function12, (Composer) obj2, iA, iA2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final ArrayList f(List list, Function0 function0) {
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        TextRangeLayoutMeasureScope textRangeLayoutMeasureScope = new TextRangeLayoutMeasureScope();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Measurable measurable = (Measurable) list.get(i);
            Object a2 = measurable.getA();
            Intrinsics.f(a2, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            TextRangeLayoutMeasureResult textRangeLayoutMeasureResultA = ((a) ((TextRangeLayoutModifier) a2).a()).a(textRangeLayoutMeasureScope);
            arrayList.add(new Pair(measurable.c0(Constraints.Companion.b(textRangeLayoutMeasureResultA.getF1141a(), textRangeLayoutMeasureResultA.getF1141a(), textRangeLayoutMeasureResultA.getB(), textRangeLayoutMeasureResultA.getB())), textRangeLayoutMeasureResultA.b()));
        }
        return arrayList;
    }

    public static final Modifier g(Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, Function1 function1, int i, boolean z, int i2, int i3, FontFamily.Resolver resolver, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13) {
        if (selectionController == null) {
            return modifier.x0(Modifier.Companion.d).x0(new TextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, colorProducer, function13));
        }
        return modifier.x0(selectionController.i).x0(new SelectableTextAnnotatedStringElement(annotatedString, textStyle, resolver, function1, i, z, i2, i3, list, function12, selectionController, colorProducer));
    }
}
