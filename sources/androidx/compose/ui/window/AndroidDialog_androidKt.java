package androidx.compose.ui.window;

import android.view.View;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0017\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "currentContent", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AndroidDialog_androidKt {
    public static final void a(final Function0 function0, final DialogProperties dialogProperties, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        final LayoutDirection layoutDirection;
        Object obj;
        ComposerImpl composerImplV = composer.v(-2032877254);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(dialogProperties) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) composerImplV.x(AndroidCompositionLocals_androidKt.f);
            Density density = (Density) composerImplV.x(CompositionLocalsKt.h);
            LayoutDirection layoutDirection2 = (LayoutDirection) composerImplV.x(CompositionLocalsKt.n);
            ComposerImpl.CompositionContextImpl compositionContextImplM = composerImplV.m();
            final MutableState mutableStateL = SnapshotStateKt.l(composableLambdaImpl, composerImplV);
            UUID uuid = (UUID) RememberSaveableKt.c(new Object[0], null, AndroidDialog_androidKt$Dialog$dialogId$1.h, composerImplV, 3072, 6);
            boolean zN = composerImplV.n(view) | composerImplV.n(density);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                i3 = i2;
                z = false;
                i4 = 32;
                layoutDirection = layoutDirection2;
                DialogWrapper dialogWrapper = new DialogWrapper(function0, dialogProperties, view, layoutDirection, density, uuid);
                ComposableLambdaImpl composableLambdaImpl2 = new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1

                    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    /* renamed from: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$dialog$1$1$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {
                        public static final AnonymousClass1 h = new AnonymousClass1(1);

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
                            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.v;
                            Unit unit = Unit.f24250a;
                            ((SemanticsPropertyReceiver) obj).b(semanticsPropertyKey, unit);
                            return unit;
                        }
                    }

                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer2 = (Composer) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            AndroidDialog_androidKt.b(SemanticsModifierKt.b(Modifier.Companion.d, false, AnonymousClass1.h), (Function2) mutableStateL.getD(), composer2, 0);
                        } else {
                            composer2.j();
                        }
                        return Unit.f24250a;
                    }
                }, true, 488261145);
                DialogLayout dialogLayout = dialogWrapper.j;
                dialogLayout.setParentCompositionContext(compositionContextImplM);
                ((SnapshotMutableStateImpl) dialogLayout.m).setValue(composableLambdaImpl2);
                dialogLayout.q = true;
                dialogLayout.c();
                composerImplV.A(dialogWrapper);
                obj = dialogWrapper;
            } else {
                i3 = i2;
                z = false;
                obj = objG;
                i4 = 32;
                layoutDirection = layoutDirection2;
            }
            final DialogWrapper dialogWrapper2 = (DialogWrapper) obj;
            boolean zI = composerImplV.I(dialogWrapper2);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == composer$Companion$Empty$1) {
                objG2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        final DialogWrapper dialogWrapper3 = dialogWrapper2;
                        dialogWrapper3.show();
                        return new DisposableEffectResult() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public final void dispose() {
                                DialogWrapper dialogWrapper4 = dialogWrapper3;
                                dialogWrapper4.dismiss();
                                dialogWrapper4.j.d();
                            }
                        };
                    }
                };
                composerImplV.A(objG2);
            }
            EffectsKt.c(dialogWrapper2, (Function1) objG2, composerImplV);
            boolean zI2 = composerImplV.I(dialogWrapper2) | ((i3 & 14) == 4 ? true : z) | ((i3 & 112) == i4 ? true : z) | composerImplV.n(layoutDirection);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function0<Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        dialogWrapper2.d(function0, dialogProperties, layoutDirection);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            composerImplV.g((Function0) objG3);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$Dialog$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    AndroidDialog_androidKt.a(function0, dialogProperties, composableLambdaImpl, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Modifier modifier, final Function2 function2, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-1177876616);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            int i3 = ((i2 << 3) & 112) | ((i2 >> 3) & 14) | KyberEngine.KyberPolyBytes;
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            int i5 = ((i3 << 6) & 896) | 6;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, AndroidDialog_androidKt$DialogLayout$1.f2214a, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function22 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function22);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            android.support.v4.media.session.a.z((i5 >> 6) & 14, function2, composerImplV, true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.window.AndroidDialog_androidKt$DialogLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    AndroidDialog_androidKt.b(modifier, function2, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
