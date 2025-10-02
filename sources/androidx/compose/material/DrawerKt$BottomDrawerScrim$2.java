package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.Easing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class DrawerKt$BottomDrawerScrim$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ long h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawerScrim$2(long j, Function0 function0, boolean z, int i) {
        super(2);
        this.h = j;
        this.i = function0;
        this.j = z;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.k | 1);
        float f = DrawerKt.f1277a;
        ComposerImpl composerImplV = ((Composer) obj).v(-513067266);
        int i2 = iA & 6;
        final long j = this.h;
        if (i2 == 0) {
            i = (composerImplV.s(j) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        final Function0 function0 = this.i;
        if (i3 == 0) {
            i |= composerImplV.I(function0) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        boolean z2 = this.j;
        if (i4 == 0) {
            i |= composerImplV.p(z2) ? 256 : 128;
        }
        if (!composerImplV.z(i & 1, (i & 147) != 146)) {
            z = z2;
            composerImplV.j();
        } else if (j != 16) {
            composerImplV.o(1552573422);
            z = z2;
            final State stateB = AnimateAsStateKt.b(z2 ? 1.0f : BitmapDescriptorFactory.HUE_RED, new TweenSpec(0, (Easing) null, 7), null, null, composerImplV, 48, 28);
            final String strA = Strings_androidKt.a(composerImplV, 1);
            Modifier modifierB = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z) {
                composerImplV.o(1552793770);
                int i5 = i & 112;
                boolean z3 = i5 == 32;
                Object objG = composerImplV.G();
                if (z3 || objG == composer$Companion$Empty$1) {
                    objG = new DrawerKt$BottomDrawerScrim$dismissModifier$1$1(function0, null);
                    composerImplV.A(objG);
                }
                Modifier modifierX0 = modifierB.x0(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objG), 6));
                boolean zN = composerImplV.n(strA) | (i5 == 32);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj3;
                            SemanticsPropertiesKt.k(semanticsPropertyReceiver, strA);
                            final Function0 function02 = function0;
                            SemanticsPropertiesKt.h(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$dismissModifier$2$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function02.invoke();
                                    return Boolean.TRUE;
                                }
                            });
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                modifierB = SemanticsModifierKt.b(modifierX0, true, (Function1) objG2);
                composerImplV.V(false);
            } else {
                composerImplV.o(1553158454);
                composerImplV.V(false);
            }
            Modifier modifierX02 = SizeKt.c.x0(modifierB);
            boolean zN2 = composerImplV.n(stateB) | ((i & 14) == 4);
            Object objG3 = composerImplV.G();
            if (zN2 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.DrawerKt$BottomDrawerScrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DrawScope drawScope = (DrawScope) obj3;
                        float f2 = DrawerKt.f1277a;
                        DrawScope.S(drawScope, j, 0L, 0L, ((Number) stateB.getD()).floatValue(), null, null, 118);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            CanvasKt.a(modifierX02, (Function1) objG3, composerImplV, 0);
            composerImplV.V(false);
        } else {
            z = z2;
            composerImplV.o(1553326846);
            composerImplV.V(false);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new DrawerKt$BottomDrawerScrim$2(j, function0, z, iA);
        }
        return Unit.f24250a;
    }
}
