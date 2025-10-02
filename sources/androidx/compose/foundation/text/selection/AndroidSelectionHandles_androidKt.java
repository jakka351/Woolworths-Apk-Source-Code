package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidSelectionHandles_androidKt {
    public static final void a(final OffsetProvider offsetProvider, final Alignment alignment, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        final ComposableLambdaImpl composableLambdaImpl2;
        ComposerImpl composerImplV = composer.v(476043083);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerImplV.n(offsetProvider) : composerImplV.I(offsetProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(alignment) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        boolean z = true;
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !composerImplV.n(offsetProvider))) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objG = composerImplV.G();
            if (z3 || objG == Composer.Companion.f1624a) {
                objG = new HandlePositionProvider(alignment, offsetProvider);
                composerImplV.A(objG);
            }
            composableLambdaImpl2 = composableLambdaImpl;
            AndroidPopup_androidKt.a((HandlePositionProvider) objG, null, new PopupProperties(false, SecureFlagPolicy.d, false), composableLambdaImpl2, composerImplV, ((i2 << 3) & 7168) | KyberEngine.KyberPolyBytes, 2);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$HandlePopup$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    AndroidSelectionHandles_androidKt.a(offsetProvider, alignment, composableLambdaImpl2, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.foundation.text.selection.OffsetProvider r18, final boolean r19, final androidx.compose.ui.text.style.ResolvedTextDirection r20, final boolean r21, long r22, final float r24, final androidx.compose.ui.Modifier r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.b(androidx.compose.foundation.text.selection.OffsetProvider, boolean, androidx.compose.ui.text.style.ResolvedTextDirection, boolean, long, float, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(final int i, Composer composer, final Modifier modifier, final Function0 function0, final boolean z) {
        int i2;
        ComposerImpl composerImplV = composer.v(2111672474);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (composerImplV.I(function0) ? 32 : 16) | (composerImplV.p(z) ? 256 : 128);
        if (composerImplV.z(i3 & 1, (i3 & 147) != 146)) {
            SpacerKt.a(composerImplV, ComposedModifierKt.a(SizeKt.r(modifier, SelectionHandlesKt.f1211a, SelectionHandlesKt.b), InspectableValueKt.a(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier modifier2 = (Modifier) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    composer2.o(-196777734);
                    final long j = ((TextSelectionColors) composer2.x(TextSelectionColorsKt.f1228a)).f1227a;
                    boolean zS = composer2.s(j);
                    final Function0 function02 = function0;
                    boolean zN = zS | composer2.n(function02);
                    final boolean z2 = z;
                    boolean zP = zN | composer2.p(z2);
                    Object objG = composer2.G();
                    if (zP || objG == Composer.Companion.f1624a) {
                        objG = new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                CacheDrawScope cacheDrawScope = (CacheDrawScope) obj4;
                                final ImageBitmap imageBitmapD = AndroidSelectionHandles_androidKt.d(cacheDrawScope, Float.intBitsToFloat((int) (cacheDrawScope.d.h() >> 32)) / 2.0f);
                                final BlendModeColorFilter blendModeColorFilterA = ColorFilter.Companion.a(j);
                                final Function0 function03 = function02;
                                final boolean z3 = z2;
                                return cacheDrawScope.n(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$drawSelectionHandle$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        ContentDrawScope contentDrawScope = (ContentDrawScope) obj5;
                                        contentDrawScope.Q0();
                                        if (((Boolean) function03.invoke()).booleanValue()) {
                                            boolean z4 = z3;
                                            BlendModeColorFilter blendModeColorFilter = blendModeColorFilterA;
                                            ImageBitmap imageBitmap = imageBitmapD;
                                            if (z4) {
                                                long jM0 = contentDrawScope.M0();
                                                CanvasDrawScope$drawContext$1 e = contentDrawScope.getE();
                                                long jD = e.d();
                                                e.a().save();
                                                try {
                                                    e.f1798a.e(jM0, -1.0f, 1.0f);
                                                    DrawScope.U0(contentDrawScope, imageBitmap, blendModeColorFilter, 46);
                                                } finally {
                                                    androidx.camera.core.impl.b.C(e, jD);
                                                }
                                            } else {
                                                DrawScope.U0(contentDrawScope, imageBitmap, blendModeColorFilter, 46);
                                            }
                                        }
                                        return Unit.f24250a;
                                    }
                                });
                            }
                        };
                        composer2.A(objG);
                    }
                    Modifier modifierC = DrawModifierKt.c(modifier2, (Function1) objG);
                    composer2.l();
                    return modifierC;
                }
            }));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt$SelectionHandleIcon$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AndroidSelectionHandles_androidKt.c(RecomposeScopeImplKt.a(i | 1), (Composer) obj, modifier, function0, z);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final androidx.compose.ui.graphics.ImageBitmap d(androidx.compose.ui.draw.CacheDrawScope r30, float r31) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt.d(androidx.compose.ui.draw.CacheDrawScope, float):androidx.compose.ui.graphics.ImageBitmap");
    }
}
