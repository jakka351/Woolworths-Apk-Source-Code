package com.halilibo.richtext.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.halilibo.richtext.ui.BlockQuoteGutter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BlockQuoteKt {

    /* renamed from: a, reason: collision with root package name */
    public static final BlockQuoteGutter.BarGutter f16276a = new BlockQuoteGutter.BarGutter();

    public static final void a(RichTextScope richTextScope, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        ComposableLambdaImpl composableLambdaImpl2;
        Intrinsics.h(richTextScope, "<this>");
        ComposerImpl composerImplV = composer.v(917212583);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
            composableLambdaImpl2 = composableLambdaImpl;
        } else {
            int i3 = i2 & 14;
            BlockQuoteGutter blockQuoteGutter = RichTextStyleKt.c(RichTextStyleKt.b(richTextScope, composerImplV)).d;
            Intrinsics.e(blockQuoteGutter);
            composerImplV.o(-439858);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            TextUnit textUnit = RichTextStyleKt.c(RichTextStyleKt.b(richTextScope, composerImplV)).f16290a;
            Intrinsics.e(textUnit);
            float fR = density.r(textUnit.f2204a) / 2;
            composerImplV.V(false);
            composerImplV.o(-429618);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = BlockQuoteKt$BlockQuote$2$1.f16277a;
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            composerImplV.V(false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicy, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(1307483265);
            blockQuoteGutter.a(richTextScope, composerImplV, i3);
            composerImplV.V(false);
            composableLambdaImpl2 = composableLambdaImpl;
            BasicRichTextKt.a(PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, fR, BitmapDescriptorFactory.HUE_RED, fR, 5), null, composableLambdaImpl2, composerImplV, (i2 << 3) & 896, 2);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(richTextScope, composableLambdaImpl2, i, 0);
        }
    }
}
