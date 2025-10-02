package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Arrangement$Start$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContextMenuUi_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final PopupProperties f862a = new PopupProperties(true, 14);
    public static final ContextMenuColors b;

    static {
        long j = Color.f;
        long j2 = Color.b;
        b = new ContextMenuColors(j, j2, j2, Color.b(j2, 0.38f), Color.b(j2, 0.38f));
    }

    public static final void a(final ContextMenuColors contextMenuColors, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-921259293);
        int i2 = (composerImplV.n(contextMenuColors) ? 4 : 2) | i;
        Modifier.Companion companion = Modifier.Companion.d;
        int i3 = i2 | (composerImplV.n(companion) ? 32 : 16);
        if (composerImplV.z(i3 & 1, (i3 & 147) != 146)) {
            Modifier modifierB = ScrollKt.b(PaddingKt.h(IntrinsicKt.b(BackgroundKt.b(ShadowKt.a(companion, ContextMenuSpec.d, RoundedCornerShapeKt.b(ContextMenuSpec.e), false, 0L, 0L, 28), contextMenuColors.f854a, RectangleShapeKt.f1779a), IntrinsicSize.e), BitmapDescriptorFactory.HUE_RED, ContextMenuSpec.i, 1), ScrollKt.a(composerImplV), true);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, columnMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composableLambdaImpl.invoke(ColumnScopeInstance.f948a, composerImplV, 54);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(composableLambdaImpl, i) { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuColumn$1
                public final /* synthetic */ ComposableLambdaImpl i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(385);
                    ContextMenuUi_androidKt.a(this.h, this.i, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(String str, final ContextMenuColors contextMenuColors, final Function0 function0, Composer composer, final int i) {
        int i2;
        int i3;
        final String str2;
        ComposerImpl composerImplV = composer.v(791018367);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2;
        if ((i & 48) == 0) {
            i3 = (composerImplV.p(true) ? 32 : 16) | i4;
        } else {
            i3 = i4;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(contextMenuColors) ? 256 : 128;
        }
        int i5 = i & 3072;
        Modifier.Companion companion = Modifier.Companion.d;
        if (i5 == 0) {
            i3 |= composerImplV.n(companion) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(function0) ? 131072 : 65536;
        }
        int i6 = i3;
        if (composerImplV.z(i6 & 1, (74899 & i6) != 74898)) {
            BiasAlignment.Vertical vertical = ContextMenuSpec.f;
            Arrangement$Start$1 arrangement$Start$1 = Arrangement.f934a;
            float f = ContextMenuSpec.h;
            Arrangement.SpacedAligned spacedAlignedG = Arrangement.g(f);
            boolean z = ((i6 & 112) == 32) | ((458752 & i6) == 131072);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new Function0<Unit>(function0) { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$1$1
                    public final /* synthetic */ Lambda h;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                        this.h = (Lambda) function0;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.h.invoke();
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG);
            }
            Modifier modifierE = SizeKt.e(ClickableKt.d(companion, true, str, null, (Function0) objG, 4), 1.0f);
            float f2 = ContextMenuSpec.f858a;
            float f3 = ContextMenuSpec.b;
            float f4 = ContextMenuSpec.c;
            Modifier modifierH = PaddingKt.h(SizeKt.s(modifierE, f2, f4, f3, f4), f, BitmapDescriptorFactory.HUE_RED, 2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(spacedAlignedG, vertical, composerImplV, 54);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(554788141);
            composerImplV.V(false);
            str2 = str;
            BasicTextKt.c(str2, RowScopeInstance.f974a.a(companion, 1.0f, true), new TextStyle(contextMenuColors.b, ContextMenuSpec.j, ContextMenuSpec.k, null, null, ContextMenuSpec.m, null, ContextMenuSpec.g, 0, ContextMenuSpec.l, null, 16613240), null, 0, false, 1, 0, null, composerImplV, (i6 & 14) | 1572864, 952);
            composerImplV.V(true);
        } else {
            str2 = str;
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(str2, contextMenuColors, function0, i) { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuItem$3
                public final /* synthetic */ String h;
                public final /* synthetic */ ContextMenuColors i;
                public final /* synthetic */ Lambda j;
                public final /* synthetic */ int k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                    this.j = (Lambda) function0;
                    this.k = i;
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(this.k | 1);
                    ContextMenuUi_androidKt.b(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(PopupPositionProvider popupPositionProvider, Function0 function0, final ContextMenuColors contextMenuColors, final Function1 function1, Composer composer, final int i) {
        int i2;
        Function0 function02;
        final PopupPositionProvider popupPositionProvider2;
        ComposerImpl composerImplV = composer.v(1447189339);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(Modifier.Companion.d) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(contextMenuColors) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function1) ? 16384 : 8192;
        }
        if (composerImplV.z(i2 & 1, (i2 & 9363) != 9362)) {
            function02 = function0;
            AndroidPopup_androidKt.a(popupPositionProvider, function02, f862a, ComposableLambdaKt.c(795909757, new Function2<Composer, Integer, Unit>(function1) { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2
                public final /* synthetic */ Lambda i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                    this.i = (Lambda) function1;
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ?? r0 = this.i;
                        ContextMenuColors contextMenuColors2 = this.h;
                        ContextMenuUi_androidKt.a(contextMenuColors2, ComposableLambdaKt.c(1156688164, new Function3<ColumnScope, Composer, Integer, Unit>(contextMenuColors2, r0) { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$2.1
                            public final /* synthetic */ Lambda h;
                            public final /* synthetic */ ContextMenuColors i;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(3);
                                this.h = (Lambda) r0;
                            }

                            /* JADX WARN: Type inference failed for: r6v7, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                    Object objG = composer3.G();
                                    if (objG == Composer.Companion.f1624a) {
                                        objG = new ContextMenuScope();
                                        composer3.A(objG);
                                    }
                                    ContextMenuScope contextMenuScope = (ContextMenuScope) objG;
                                    contextMenuScope.f857a.clear();
                                    this.h.invoke(contextMenuScope);
                                    contextMenuScope.a(this.i, composer3, 0);
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, KyberEngine.KyberPolyBytes);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, (i2 & 14) | 3456 | (i2 & 112), 0);
            popupPositionProvider2 = popupPositionProvider;
        } else {
            function02 = function0;
            popupPositionProvider2 = popupPositionProvider;
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final Function0 function03 = function02;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(function03, contextMenuColors, function1, i) { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$3
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ ContextMenuColors j;
                public final /* synthetic */ Lambda k;
                public final /* synthetic */ int l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                    this.k = (Lambda) function1;
                    this.l = i;
                }

                /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ContextMenuUi_androidKt.c(this.h, this.i, this.j, this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final PopupPositionProvider popupPositionProvider, final Function0 function0, final Function1 function1, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(712057293);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(popupPositionProvider) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(Modifier.Companion.d) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function1) ? 2048 : 1024;
        }
        if (composerImplV.z(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            boolean zN = composerImplV.n((Configuration) composerImplV.x(AndroidCompositionLocals_androidKt.f1950a)) | composerImplV.n(context);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                ContextMenuColors contextMenuColors = b;
                long jB = contextMenuColors.f854a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iJ = ColorKt.j(jB);
                int color = typedArrayObtainStyledAttributes.getColor(0, iJ);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iJ) {
                    jB = ColorKt.b(color);
                }
                long j = jB;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jB2 = contextMenuColors.b;
                int iJ2 = ColorKt.j(jB2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iJ2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iJ2) {
                    jB2 = ColorKt.b(numValueOf.intValue());
                }
                long j2 = jB2;
                long jB3 = contextMenuColors.d;
                int iJ3 = ColorKt.j(jB3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iJ3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iJ3) {
                    jB3 = ColorKt.b(numValueOf2.intValue());
                }
                long j3 = jB3;
                ContextMenuColors contextMenuColors2 = new ContextMenuColors(j, j2, j2, j3, j3);
                composerImplV.A(contextMenuColors2);
                objG = contextMenuColors2;
            }
            c(popupPositionProvider, function0, (ContextMenuColors) objG, function1, composerImplV, (i2 & 1022) | ((i2 << 3) & 57344));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(function0, function1, i) { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt$ContextMenuPopup$1
                public final /* synthetic */ Function0 i;
                public final /* synthetic */ Lambda j;
                public final /* synthetic */ int k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                    this.j = (Lambda) function1;
                    this.k = i;
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(this.k | 1);
                    ContextMenuUi_androidKt.d(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
