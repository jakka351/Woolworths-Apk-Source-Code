package au.com.woolworths.feature.shop.healthylifefoodtracker.ui;

import android.content.res.Resources;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.VectorResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.BaseHorizontalAnchorable;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstrainedLayoutReference;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.compose.HorizontalAnchorable;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtilsKt;
import androidx.constraintlayout.compose.VerticalAnchorable;
import androidx.constraintlayout.core.parser.CLNumber;
import au.com.woolworths.base.shopapp.modules.text.TextWithLinkApiData;
import au.com.woolworths.design.wx.component.DividerKt;
import au.com.woolworths.design.wx.component.icon.IconKt;
import au.com.woolworths.design.wx.foundation.WxTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import java.io.IOException;
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
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"healthy-life-food-tracker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class TextWithLinkKt {
    public static final void a(final TextWithLinkApiData textWithLinkApiData, Modifier modifier, Function1 onClick, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(textWithLinkApiData, "textWithLinkApiData");
        Intrinsics.h(onClick, "onClick");
        ComposerImpl composerImplV = composer.v(-854133711);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(textWithLinkApiData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(onClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            String label = textWithLinkApiData.getLabel();
            Role role = new Role(0);
            composerImplV.o(-1633490746);
            boolean zI = ((i2 & 896) == 256) | composerImplV.I(textWithLinkApiData);
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (zI || objG == obj) {
                objG = new c(2, onClick, textWithLinkApiData);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            modifier2 = modifier;
            Modifier modifierD = ClickableKt.d(modifier2, false, label, role, (Function0) objG, 1);
            composerImplV.o(-1003410150);
            composerImplV.o(212064437);
            composerImplV.V(false);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = new Measurer2(density);
                composerImplV.A(objG2);
            }
            final Measurer2 measurer2 = (Measurer2) objG2;
            Object objG3 = composerImplV.G();
            if (objG3 == obj) {
                objG3 = new ConstraintLayoutScope();
                composerImplV.A(objG3);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objG3;
            Object objG4 = composerImplV.G();
            if (objG4 == obj) {
                objG4 = SnapshotStateKt.f(Boolean.FALSE);
                composerImplV.A(objG4);
            }
            final MutableState mutableState = (MutableState) objG4;
            Object objG5 = composerImplV.G();
            if (objG5 == obj) {
                objG5 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerImplV.A(objG5);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objG5;
            Object objG6 = composerImplV.G();
            if (objG6 == obj) {
                objG6 = SnapshotStateKt.e(Unit.f24250a, SnapshotStateKt.g());
                composerImplV.A(objG6);
            }
            final MutableState mutableState2 = (MutableState) objG6;
            boolean zI2 = composerImplV.I(measurer2) | composerImplV.r(257);
            Object objG7 = composerImplV.G();
            if (zI2 || objG7 == obj) {
                objG7 = new MeasurePolicy() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.TextWithLinkKt$TextWithLink$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, final List list, long j) throws NumberFormatException {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        mutableState2.getD();
                        long jH = measurer2.h(j, measureScope.getD(), constraintSetForInlineDsl, list, linkedHashMap);
                        mutableState.getD();
                        final Measurer2 measurer22 = measurer2;
                        return measureScope.L0((int) (jH >> 32), (int) (jH & 4294967295L), EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.TextWithLinkKt$TextWithLink$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                List list2 = list;
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                measurer22.g((Placeable.PlacementScope) obj2, list2, linkedHashMap2);
                                return Unit.f24250a;
                            }
                        });
                    }
                };
                composerImplV.A(objG7);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG7;
            Object objG8 = composerImplV.G();
            if (objG8 == obj) {
                objG8 = new Function0<Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.TextWithLinkKt$TextWithLink$$inlined$ConstraintLayout$3
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
                composerImplV.A(objG8);
            }
            final Function0 function0 = (Function0) objG8;
            boolean zI3 = composerImplV.I(measurer2);
            Object objG9 = composerImplV.G();
            if (zI3 || objG9 == obj) {
                objG9 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.TextWithLinkKt$TextWithLink$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ToolingUtilsKt.a((SemanticsPropertyReceiver) obj2, measurer2);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG9);
            }
            LayoutKt.a(SemanticsModifierKt.b(modifierD, false, (Function1) objG9), ComposableLambdaKt.c(1200550679, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.TextWithLinkKt$TextWithLink$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) throws XmlPullParserException, Resources.NotFoundException, IOException {
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue() & 3;
                    Unit unit = Unit.f24250a;
                    if (iIntValue == 2 && composer2.c()) {
                        composer2.j();
                        return unit;
                    }
                    mutableState2.setValue(unit);
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    constraintLayoutScope2.getClass();
                    constraintLayoutScope2.d();
                    composer2.o(-763372617);
                    ConstraintLayoutScope constraintLayoutScope3 = ConstraintLayoutScope.this;
                    final ConstrainedLayoutReference constrainedLayoutReferenceB = constraintLayoutScope3.b();
                    final ConstrainedLayoutReference constrainedLayoutReferenceB2 = constraintLayoutScope3.b();
                    ConstrainedLayoutReference constrainedLayoutReferenceB3 = constraintLayoutScope3.b();
                    String label2 = textWithLinkApiData.getLabel();
                    composer2.o(5004770);
                    boolean zN = composer2.n(constrainedLayoutReferenceB2);
                    Object objG10 = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (zN || objG10 == composer$Companion$Empty$1) {
                        objG10 = new Function1<ConstrainScope, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.TextWithLinkKt$TextWithLink$2$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ConstrainScope constrainAs = (ConstrainScope) obj4;
                                Intrinsics.h(constrainAs, "$this$constrainAs");
                                constrainAs.i.setValue(constrainAs, ConstrainScope.k[0], Dimension.Companion.a());
                                VerticalAnchorable verticalAnchorable = constrainAs.d;
                                ConstrainedLayoutReference constrainedLayoutReference = constrainAs.c;
                                VerticalAnchorable.a(verticalAnchorable, constrainedLayoutReference.c, BitmapDescriptorFactory.HUE_RED, 6);
                                VerticalAnchorable.a(constrainAs.f, constrainedLayoutReferenceB2.c, BitmapDescriptorFactory.HUE_RED, 6);
                                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor = constrainedLayoutReference.d;
                                ConstraintLayoutBaseScope.HorizontalAnchor horizontalAnchor2 = constrainedLayoutReference.f;
                                float f = 0;
                                ((BaseHorizontalAnchorable) constrainAs.e).b(horizontalAnchor, f, f);
                                ((BaseHorizontalAnchorable) constrainAs.g).b(horizontalAnchor2, f, f);
                                constrainAs.b.I("vBias", new CLNumber(0.5f));
                                return Unit.f24250a;
                            }
                        };
                        composer2.A(objG10);
                    }
                    composer2.l();
                    Modifier.Companion companion = Modifier.Companion.d;
                    TextKt.b(label2, PaddingKt.f(ConstraintLayoutScope.a(companion, constrainedLayoutReferenceB, (Function1) objG10), 16), 0L, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, null, WxTheme.b(composer2).l, composer2, 0, 3120, 55292);
                    ImageVector imageVectorB = VectorResources_androidKt.b(R.drawable.ic_top_right_arrow, 6, composer2);
                    Modifier modifierQ = SizeKt.q(companion, 24);
                    composer2.o(1849434622);
                    Object objG11 = composer2.G();
                    if (objG11 == composer$Companion$Empty$1) {
                        objG11 = TextWithLinkKt$TextWithLink$2$2$1.d;
                        composer2.A(objG11);
                    }
                    composer2.l();
                    IconKt.b(imageVectorB, null, ConstraintLayoutScope.a(modifierQ, constrainedLayoutReferenceB2, (Function1) objG11), WxTheme.a(composer2).h(), composer2, 48, 0);
                    composer2.o(5004770);
                    boolean zN2 = composer2.n(constrainedLayoutReferenceB);
                    Object objG12 = composer2.G();
                    if (zN2 || objG12 == composer$Companion$Empty$1) {
                        objG12 = new Function1<ConstrainScope, Unit>() { // from class: au.com.woolworths.feature.shop.healthylifefoodtracker.ui.TextWithLinkKt$TextWithLink$2$3$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                ConstrainScope constrainAs = (ConstrainScope) obj4;
                                Intrinsics.h(constrainAs, "$this$constrainAs");
                                VerticalAnchorable verticalAnchorable = constrainAs.d;
                                ConstrainedLayoutReference constrainedLayoutReference = constrainAs.c;
                                VerticalAnchorable.a(verticalAnchorable, constrainedLayoutReference.c, BitmapDescriptorFactory.HUE_RED, 6);
                                VerticalAnchorable.a(constrainAs.f, constrainedLayoutReference.e, BitmapDescriptorFactory.HUE_RED, 6);
                                HorizontalAnchorable.a(constrainAs.e, constrainedLayoutReferenceB.f, BitmapDescriptorFactory.HUE_RED, 6);
                                HorizontalAnchorable.a(constrainAs.g, constrainedLayoutReference.f, BitmapDescriptorFactory.HUE_RED, 6);
                                return Unit.f24250a;
                            }
                        };
                        composer2.A(objG12);
                    }
                    composer2.l();
                    DividerKt.a(BitmapDescriptorFactory.HUE_RED, 0, 6, 0L, composer2, ConstraintLayoutScope.a(companion, constrainedLayoutReferenceB3, (Function1) objG12));
                    composer2.l();
                    return unit;
                }
            }, composerImplV), measurePolicy, composerImplV, 48);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.c(textWithLinkApiData, modifier2, onClick, i, 12);
        }
    }
}
