package com.halilibo.richtext.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"richtext-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class HorizontalRuleKt {
    public static final void a(RichTextScope richTextScope, Composer composer, int i) {
        int i2;
        Intrinsics.h(richTextScope, "<this>");
        ComposerImpl composerImplV = composer.v(1642175075);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(richTextScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            long jB = Color.b(RichTextLocalsKt.c(richTextScope, composerImplV), 0.2f);
            composerImplV.o(-208584325);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            TextUnit textUnit = RichTextStyleKt.c(RichTextStyleKt.b(richTextScope, composerImplV)).f16290a;
            Intrinsics.e(textUnit);
            float fR = density.r(textUnit.f2204a);
            composerImplV.V(false);
            BoxKt.a(BackgroundKt.b(SizeKt.g(SizeKt.e(PaddingKt.j(Modifier.Companion.d, BitmapDescriptorFactory.HUE_RED, fR, BitmapDescriptorFactory.HUE_RED, fR, 5), 1.0f), 1), jB, RectangleShapeKt.f1779a), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.foundation.a(i, 7, richTextScope);
        }
    }
}
