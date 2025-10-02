package com.halilibo.richtext.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class TableKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TextStyle f16296a = new TextStyle(0, 0, FontWeight.m, null, null, 0, null, 0, 0, 0, null, 16777211);
    public static final long b = TextUnitKt.c(8);
    public static final long c = Color.k;

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.Object, java.util.List] */
    public static final void a(RichTextScope richTextScope, Modifier modifier, Function1 function1, Function1 bodyRows, Composer composer, int i) {
        Object obj;
        int i2;
        Modifier.Companion companion;
        Modifier modifier2;
        final RichTextScope richTextScope2 = richTextScope;
        int i3 = i;
        Intrinsics.h(richTextScope2, "<this>");
        Intrinsics.h(bodyRows, "bodyRows");
        ComposerImpl composerImplV = composer.v(-750323390);
        int i4 = ((i3 & 6) == 0 ? (composerImplV.n(richTextScope2) ? 4 : 2) | i3 : i3) | 48;
        if ((i3 & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.I(function1) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= composerImplV.I(bodyRows) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            TableStyle tableStyle = RichTextStyleKt.c(RichTextStyleKt.b(richTextScope2, composerImplV)).f;
            Intrinsics.e(tableStyle);
            long jC = RichTextLocalsKt.c(richTextScope2, composerImplV);
            composerImplV.o(1636511210);
            boolean z = (i4 & 896) == 256;
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z || objG == composer$Companion$Empty$1) {
                if (function1 != null) {
                    RowBuilder rowBuilder = new RowBuilder();
                    function1.invoke(rowBuilder);
                    objG = rowBuilder.f16294a;
                } else {
                    objG = null;
                }
                composerImplV.A(objG);
            }
            TableRow tableRow = (TableRow) objG;
            composerImplV.V(false);
            composerImplV.o(1636514279);
            boolean z2 = (i4 & 7168) == 2048;
            Object objG2 = composerImplV.G();
            Object obj2 = objG2;
            if (z2 || objG2 == composer$Companion$Empty$1) {
                TableBuilder tableBuilder = new TableBuilder();
                bodyRows.invoke(tableBuilder);
                ArrayList arrayList = tableBuilder.f16295a;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((RowBuilder) it.next()).f16294a);
                }
                composerImplV.A(arrayList2);
                obj2 = arrayList2;
            }
            List list = (List) obj2;
            composerImplV.V(false);
            composerImplV.o(1636517410);
            boolean zN = composerImplV.n(tableRow) | composerImplV.n(list);
            Object objG3 = composerImplV.G();
            if (zN || objG3 == composer$Companion$Empty$1) {
                int size = tableRow != null ? tableRow.f16298a.size() : 0;
                Iterator it2 = list.iterator();
                if (it2.hasNext()) {
                    Object next = it2.next();
                    if (it2.hasNext()) {
                        int size2 = ((TableRow) next).f16298a.size();
                        while (true) {
                            Object next2 = it2.next();
                            int size3 = ((TableRow) next2).f16298a.size();
                            if (size2 < size3) {
                                size2 = size3;
                                next = next2;
                            }
                            if (!it2.hasNext()) {
                                break;
                            }
                            richTextScope2 = richTextScope;
                            i3 = i;
                        }
                    }
                    obj = next;
                } else {
                    obj = null;
                }
                TableRow tableRow2 = (TableRow) obj;
                objG3 = Integer.valueOf(Math.max(size, tableRow2 != null ? tableRow2.f16298a.size() : 0));
                composerImplV.A(objG3);
            }
            int iIntValue = ((Number) objG3).intValue();
            composerImplV.V(false);
            final TextStyle textStyleD = RichTextLocalsKt.d(richTextScope2, composerImplV).d(tableStyle.f16299a);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            TextUnit textUnit = tableStyle.b;
            Intrinsics.e(textUnit);
            float fR = density.r(textUnit.f2204a);
            Modifier.Companion companion2 = Modifier.Companion.d;
            final Modifier modifierF = PaddingKt.f(ClipKt.b(companion2), fR);
            composerImplV.o(1636530935);
            boolean zN2 = composerImplV.n(tableRow) | composerImplV.n(list) | composerImplV.n(modifierF);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == composer$Companion$Empty$1) {
                ListBuilder listBuilderV = CollectionsKt.v();
                if (tableRow != null) {
                    i2 = i4;
                    companion = companion2;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.s((Iterable) tableRow.f16298a, 10));
                    for (Iterator it3 = r10.iterator(); it3.hasNext(); it3 = it3) {
                        final Function3 function3 = (Function3) it3.next();
                        arrayList3.add(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.TableKt$Table$styledRows$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    Function4 function4A = RichTextThemeConfigurationKt.a(richTextScope2, composer2);
                                    final Modifier modifier3 = modifierF;
                                    final Function3 function32 = function3;
                                    function4A.invoke(textStyleD, ComposableLambdaKt.c(545809484, new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.TableKt$Table$styledRows$1$1$1$1$1.1
                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer3 = (Composer) obj5;
                                            if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                                composer3.j();
                                            } else {
                                                BasicRichTextKt.a(modifier3, null, function32, composer3, 0, 2);
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer2), composer2, 48);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -1928061582));
                        richTextScope2 = richTextScope;
                    }
                    listBuilderV.add(arrayList3);
                } else {
                    i2 = i4;
                    companion = companion2;
                }
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    Iterable<Function3> iterable = (Iterable) ((TableRow) it4.next()).f16298a;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.s(iterable, 10));
                    for (final Function3 function32 : iterable) {
                        arrayList4.add(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: com.halilibo.richtext.ui.TableKt$Table$styledRows$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    BasicRichTextKt.a(modifierF, null, function32, composer2, 0, 2);
                                }
                                return Unit.f24250a;
                            }
                        }, true, -978043317));
                    }
                    listBuilderV.add(arrayList4);
                }
                objG4 = CollectionsKt.q(listBuilderV);
                composerImplV.A(objG4);
            } else {
                i2 = i4;
                companion = companion2;
            }
            List list2 = (List) objG4;
            composerImplV.V(false);
            Float f = tableStyle.d;
            Intrinsics.e(f);
            float fFloatValue = f.floatValue();
            composerImplV.o(1636566517);
            boolean zN3 = composerImplV.n(tableStyle) | composerImplV.s(jC);
            Object objG5 = composerImplV.G();
            if (zN3 || objG5 == composer$Companion$Empty$1) {
                objG5 = new au.com.woolworths.feature.rewards.account.settings.v2.ui.e(tableStyle, jC);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            Modifier.Companion companion3 = companion;
            SimpleTableLayoutKt.a(iIntValue, list2, (Function1) objG5, fFloatValue, companion3, composerImplV, (i2 << 9) & 57344);
            modifier2 = companion3;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.foundation.shop.instore.presence.presentation.b(richTextScope, modifier2, function1, bodyRows, i3, 23);
        }
    }
}
