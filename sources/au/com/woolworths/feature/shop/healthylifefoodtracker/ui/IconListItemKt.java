package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import au.com.woolworths.base.shopapp.modules.iconwithtext.IconListItemApiData;
import au.com.woolworths.design.wx.foundation.WxTheme;
import coil3.compose.SingletonAsyncImageKt;
import coil3.request.ImageRequest;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"healthy-life-food-tracker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class IconListItemKt {
    public static final void a(final IconListItemApiData iconListItemApiData, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.h(iconListItemApiData, "iconListItemApiData");
        ComposerImpl composerImplV = composer.v(-1377824351);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(iconListItemApiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Modifier modifierG = PaddingKt.g(modifier, 16, 12);
            composerImplV.o(-1003410150);
            composerImplV.o(212064437);
            composerImplV.V(false);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new Measurer2(density);
                composerImplV.A(objG);
            }
            final Measurer2 measurer2 = (Measurer2) objG;
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new ConstraintLayoutScope();
                composerImplV.A(objG2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objG2;
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG3);
            }
            final MutableState mutableState = (MutableState) objG3;
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerImplV.A(objG4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objG4;
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = SnapshotStateKt.e(Unit.f24250a, SnapshotStateKt.g());
                composerImplV.A(objG5);
            }
            final MutableState mutableState2 = (MutableState) objG5;
            boolean zI = composerImplV.I(measurer2) | composerImplV.r(257);
            Object objG6 = composerImplV.G();
            if (zI || objG6 == composer$Companion$Empty$1) {
                objG6 = new MeasurePolicy() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.IconListItemKt$IconListItem$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, final List list, long j) throws NumberFormatException {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mutableState2.getD();
                        long jH = measurer2.h(j, measureScope.getD(), constraintSetForInlineDsl, list, linkedHashMap);
                        mutableState.getD();
                        final Measurer2 measurer22 = measurer2;
                        return measureScope.L0((int) (jH >> 32), (int) (jH & 4294967295L), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.IconListItemKt$IconListItem$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                List list2 = list;
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                measurer22.g((Placeable.PlacementScope) obj, list2, linkedHashMap2);
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG6;
            Object objG7 = composerImplV.G();
            if (objG7 == composer$Companion$Empty$1) {
                objG7 = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.IconListItemKt$IconListItem$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        mutableState.setValue(Boolean.valueOf(!((Boolean) r0.getD()).booleanValue()));
                        constraintSetForInlineDsl.g = true;
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG7);
            }
            final Function0 function0 = (Function0) objG7;
            boolean zI2 = composerImplV.I(measurer2);
            Object objG8 = composerImplV.G();
            if (zI2 || objG8 == composer$Companion$Empty$1) {
                objG8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.IconListItemKt$IconListItem$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ToolingUtilsKt.a((SemanticsPropertyReceiver) obj, measurer2);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG8);
            }
            LayoutKt.a(SemanticsModifierKt.b(modifierG, false, (Function1) objG8), ComposableLambdaKt.c(1200550679, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.IconListItemKt$IconListItem$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue() & 3;
                    Unit unit = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    mutableState2.setValue(unit);
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    constraintLayoutScope2.getClass();
                    constraintLayoutScope2.d();
                    composer2.o(1649370430);
                    ConstraintLayoutScope constraintLayoutScope3 = ConstraintLayoutScope.this;
                    final ConstrainedLayoutReference constrainedLayoutReferenceB = constraintLayoutScope3.b();
                    final ConstrainedLayoutReference constrainedLayoutReferenceB2 = constraintLayoutScope3.b();
                    final ConstrainedLayoutReference constrainedLayoutReferenceB3 = constraintLayoutScope3.b();
                    ImageRequest.Builder builder = new ImageRequest.Builder((Context) composer2.x(AndroidCompositionLocals_androidKt.b));
                    IconListItemApiData iconListItemApiData2 = iconListItemApiData;
                    builder.c = iconListItemApiData2.getIconUrl();
                    ImageRequest imageRequestA = builder.a();
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierQ = SizeKt.q(companion, 40);
                    composer2.o(1849434622);
                    Object objG9 = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                    if (objG9 == composer$Companion$Empty$12) {
                        objG9 = IconListItemKt$IconListItem$1$1$1.d;
                        composer2.A(objG9);
                    }
                    composer2.l();
                    SingletonAsyncImageKt.a(imageRequestA, null, ConstraintLayoutScope.a(modifierQ, constrainedLayoutReferenceB, (Function1) objG9), null, null, composer2, 48, 2040);
                    String title = iconListItemApiData2.getTitle();
                    TextStyle textStyle = WxTheme.b(composer2).l;
                    composer2.o(-1633490746);
                    boolean zN = composer2.n(constrainedLayoutReferenceB) | composer2.n(constrainedLayoutReferenceB3);
                    Object objG10 = composer2.G();
                    if (zN || objG10 == composer$Companion$Empty$12) {
                        objG10 = new Function1<ConstrainScope, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.IconListItemKt$IconListItem$1$2$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ConstrainScope constrainAs = (ConstrainScope) obj3;
                                Intrinsics.h(constrainAs, "$this$constrainAs");
                                constrainAs.i.setValue(constrainAs, ConstrainScope.k[0], Dimension.Companion.a());
                                HorizontalAnchorable horizontalAnchorable = constrainAs.e;
                                ConstrainedLayoutReference constrainedLayoutReference = constrainAs.c;
                                HorizontalAnchorable.a(horizontalAnchorable, constrainedLayoutReference.d, BitmapDescriptorFactory.HUE_RED, 6);
                                VerticalAnchorable.a(constrainAs.d, constrainedLayoutReferenceB.e, 16, 4);
                                VerticalAnchorable.a(constrainAs.f, constrainedLayoutReference.e, BitmapDescriptorFactory.HUE_RED, 6);
                                HorizontalAnchorable.a(constrainAs.g, constrainedLayoutReferenceB3.d, 8, 4);
                                return Unit.f24250a;
                            }
                        };
                        composer2.A(objG10);
                    }
                    composer2.l();
                    TextKt.b(title, ConstraintLayoutScope.a(companion, constrainedLayoutReferenceB2, (Function1) objG10), 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyle, composer2, 0, 0, 65532);
                    String description = iconListItemApiData2.getDescription();
                    long jF = WxTheme.a(composer2).f();
                    TextStyle textStyle2 = WxTheme.b(composer2).r;
                    composer2.o(5004770);
                    boolean zN2 = composer2.n(constrainedLayoutReferenceB2);
                    Object objG11 = composer2.G();
                    if (zN2 || objG11 == composer$Companion$Empty$12) {
                        objG11 = new Function1<ConstrainScope, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.IconListItemKt$IconListItem$1$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ConstrainScope constrainAs = (ConstrainScope) obj3;
                                Intrinsics.h(constrainAs, "$this$constrainAs");
                                constrainAs.i.setValue(constrainAs, ConstrainScope.k[0], Dimension.Companion.a());
                                HorizontalAnchorable horizontalAnchorable = constrainAs.e;
                                ConstrainedLayoutReference constrainedLayoutReference = constrainedLayoutReferenceB2;
                                HorizontalAnchorable.a(horizontalAnchorable, constrainedLayoutReference.f, BitmapDescriptorFactory.HUE_RED, 6);
                                VerticalAnchorable.a(constrainAs.d, constrainedLayoutReference.c, BitmapDescriptorFactory.HUE_RED, 6);
                                VerticalAnchorable verticalAnchorable = constrainAs.f;
                                ConstrainedLayoutReference constrainedLayoutReference2 = constrainAs.c;
                                VerticalAnchorable.a(verticalAnchorable, constrainedLayoutReference2.e, BitmapDescriptorFactory.HUE_RED, 6);
                                HorizontalAnchorable.a(constrainAs.g, constrainedLayoutReference2.f, BitmapDescriptorFactory.HUE_RED, 6);
                                return Unit.f24250a;
                            }
                        };
                        composer2.A(objG11);
                    }
                    composer2.l();
                    TextKt.b(description, ConstraintLayoutScope.a(companion, constrainedLayoutReferenceB3, (Function1) objG11), jF, 0L, null, 0L, null, null, 0L, 2, false, 3, 0, null, textStyle2, composer2, 0, 3120, 55288);
                    composer2.l();
                    return unit;
                }
            }, composerImplV), measurePolicy, composerImplV, 48);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.snackbar.b(iconListItemApiData, i, 28, modifier);
        }
    }
}
