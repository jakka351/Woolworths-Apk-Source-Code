package androidx.compose.material.internal;

import android.view.View;
import androidx.camera.core.impl.b;
import androidx.compose.material.DropdownMenuPositionProvider;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.reflect.KProperty;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ DropdownMenuPositionProvider h;
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7(DropdownMenuPositionProvider dropdownMenuPositionProvider, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.h = dropdownMenuPositionProvider;
        this.i = composableLambdaImpl;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.j | 1);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ExposedDropdownMenuPopup_androidKt.f1375a;
        ComposerImpl composerImplV = ((Composer) obj).v(-707851182);
        if ((iA & 6) == 0) {
            i = (composerImplV.I(null) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i2 = iA & 48;
        final DropdownMenuPositionProvider dropdownMenuPositionProvider = this.h;
        if (i2 == 0) {
            i |= composerImplV.n(dropdownMenuPositionProvider) ? 32 : 16;
        }
        int i3 = iA & KyberEngine.KyberPolyBytes;
        ComposableLambdaImpl composableLambdaImpl = this.i;
        if (i3 == 0) {
            i |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if (composerImplV.z(i & 1, (i & 147) != 146)) {
            View view = (View) composerImplV.x(AndroidCompositionLocals_androidKt.f);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            final String str = (String) composerImplV.x(ExposedDropdownMenuPopup_androidKt.f1375a);
            final LayoutDirection layoutDirection = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            ComposerImpl.CompositionContextImpl compositionContextImplM = composerImplV.m();
            final MutableState mutableStateL = SnapshotStateKt.l(composableLambdaImpl, composerImplV);
            UUID uuid = (UUID) RememberSaveableKt.c(new Object[0], null, ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupId$1.h, composerImplV, 3072, 6);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            Object obj3 = objG;
            if (objG == composer$Companion$Empty$1) {
                final PopupLayout popupLayout = new PopupLayout(view, density, dropdownMenuPositionProvider, uuid);
                ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                        public static final AnonymousClass1 h = new AnonymousClass1(1);

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.u;
                            Unit unit = Unit.f24250a;
                            ((SemanticsPropertyReceiver) obj).b(semanticsPropertyKey, unit);
                            return unit;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        Composer composer = (Composer) obj4;
                        int iIntValue = ((Number) obj5).intValue();
                        if (composer.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier modifierB = SemanticsModifierKt.b(Modifier.Companion.d, false, AnonymousClass1.h);
                            final PopupLayout popupLayout2 = popupLayout;
                            boolean zI = composer.I(popupLayout2);
                            Object objG2 = composer.G();
                            if (zI || objG2 == Composer.Companion.f1624a) {
                                objG2 = new Function1<IntSize, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$2$1
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj6) {
                                        IntSize intSize = new IntSize(((IntSize) obj6).f2202a);
                                        PopupLayout popupLayout3 = popupLayout2;
                                        ((SnapshotMutableStateImpl) popupLayout3.r).setValue(intSize);
                                        popupLayout3.j();
                                        return Unit.f24250a;
                                    }
                                };
                                composer.A(objG2);
                            }
                            Modifier modifierA = AlphaKt.a(OnRemeasuredModifierKt.a(modifierB, (Function1) objG2), ((Boolean) popupLayout2.s.getD()).booleanValue() ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal2 = ExposedDropdownMenuPopup_androidKt.f1375a;
                            Function2 function2 = (Function2) mutableStateL.getD();
                            int p = composer.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                            Modifier modifierD = ComposedModifierKt.d(composer, modifierA);
                            ComposeUiNode.e3.getClass();
                            Function0 function0 = ComposeUiNode.Companion.b;
                            if (composer.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer.i();
                            if (composer.getO()) {
                                composer.K(function0);
                            } else {
                                composer.e();
                            }
                            Updater.b(composer, ExposedDropdownMenuPopup_androidKt$SimpleStack$1.f1378a, ComposeUiNode.Companion.g);
                            Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function22 = ComposeUiNode.Companion.j;
                            if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                                b.z(p, composer, p, function22);
                            }
                            Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                            b.A(0, composer, function2);
                        } else {
                            composer.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, 580081703);
                popupLayout.setParentCompositionContext(compositionContextImplM);
                ((SnapshotMutableStateImpl) popupLayout.w).setValue(composableLambdaImpl2);
                popupLayout.x = true;
                composerImplV.A(popupLayout);
                obj3 = popupLayout;
            }
            final PopupLayout popupLayout2 = (PopupLayout) obj3;
            int i4 = i & 14;
            boolean zI = composerImplV.I(popupLayout2) | (i4 == 4) | composerImplV.n(str) | composerImplV.n(layoutDirection);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>(str, layoutDirection) { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1
                    public final /* synthetic */ LayoutDirection i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                        this.i = layoutDirection;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        final PopupLayout popupLayout3 = this.h;
                        popupLayout3.m.addView(popupLayout3, popupLayout3.n);
                        popupLayout3.i(this.i);
                        return new DisposableEffectResult() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                PopupLayout popupLayout4 = popupLayout3;
                                popupLayout4.d();
                                ViewTreeLifecycleOwner.b(popupLayout4, null);
                                popupLayout4.l.getViewTreeObserver().removeOnGlobalLayoutListener(popupLayout4);
                                popupLayout4.m.removeViewImmediate(popupLayout4);
                            }
                        };
                    }
                };
                composerImplV.A(objG2);
            }
            EffectsKt.c(popupLayout2, (Function1) objG2, composerImplV);
            boolean zI2 = composerImplV.I(popupLayout2) | (i4 == 4) | composerImplV.n(str) | composerImplV.n(layoutDirection);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function0<Unit>(str, layoutDirection) { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$2$1
                    public final /* synthetic */ LayoutDirection i;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                        this.i = layoutDirection;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.h.i(this.i);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            composerImplV.g((Function0) objG3);
            boolean zI3 = composerImplV.I(popupLayout2) | ((i & 112) == 32);
            Object objG4 = composerImplV.G();
            if (zI3 || objG4 == composer$Companion$Empty$1) {
                objG4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        DropdownMenuPositionProvider dropdownMenuPositionProvider2 = dropdownMenuPositionProvider;
                        PopupLayout popupLayout3 = popupLayout2;
                        popupLayout3.o = dropdownMenuPositionProvider2;
                        popupLayout3.j();
                        return new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$3$1$invoke$$inlined$onDispose$1();
                    }
                };
                composerImplV.A(objG4);
            }
            EffectsKt.c(dropdownMenuPositionProvider, (Function1) objG4, composerImplV);
            boolean zI4 = composerImplV.I(popupLayout2);
            Object objG5 = composerImplV.G();
            if (zI4 || objG5 == composer$Companion$Empty$1) {
                objG5 = new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$5$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        LayoutCoordinates layoutCoordinatesE = ((LayoutCoordinates) obj4).E();
                        Intrinsics.e(layoutCoordinatesE);
                        long jA = layoutCoordinatesE.a();
                        long jY = layoutCoordinatesE.y(0L);
                        IntRect intRectA = IntRectKt.a(IntOffsetKt.a(MathKt.b(Offset.e(jY)), MathKt.b(Offset.f(jY))), jA);
                        PopupLayout popupLayout3 = popupLayout2;
                        ((SnapshotMutableStateImpl) popupLayout3.q).setValue(intRectA);
                        popupLayout3.j();
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG5);
            }
            Modifier modifierA = OnGloballyPositionedModifierKt.a(Modifier.Companion.d, (Function1) objG5);
            boolean zI5 = composerImplV.I(popupLayout2) | composerImplV.n(layoutDirection);
            Object objG6 = composerImplV.G();
            if (zI5 || objG6 == composer$Companion$Empty$1) {
                objG6 = new MeasurePolicy() { // from class: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1

                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$6$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
                        public static final AnonymousClass1 h = new AnonymousClass1(1);

                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            return Unit.f24250a;
                        }
                    }

                    @Override // androidx.compose.ui.layout.MeasurePolicy
                    public final MeasureResult c(MeasureScope measureScope, List list, long j) {
                        popupLayout2.p = layoutDirection;
                        return measureScope.L0(0, 0, EmptyMap.d, AnonymousClass1.h);
                    }
                };
                composerImplV.A(objG6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG6;
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierA);
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$7(dropdownMenuPositionProvider, composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
