package androidx.compose.material3;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationDrawerKt$Scrim$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function0 i;
    public final /* synthetic */ Function0 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$Scrim$2(boolean z, Function0 function0, Function0 function02, long j, int i) {
        super(2);
        this.h = z;
        this.i = function0;
        this.j = function02;
        this.k = j;
        this.l = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.l | 1);
        float f = NavigationDrawerKt.f1464a;
        ComposerImpl composerImplV = ((Composer) obj).v(2106487387);
        int i2 = iA & 6;
        boolean z2 = this.h;
        if (i2 == 0) {
            i = (composerImplV.p(z2) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        final Function0 function0 = this.i;
        if (i3 == 0) {
            i |= composerImplV.I(function0) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        final Function0 function02 = this.j;
        if (i4 == 0) {
            i |= composerImplV.I(function02) ? 256 : 128;
        }
        int i5 = iA & 3072;
        final long j = this.k;
        if (i5 == 0) {
            i |= composerImplV.s(j) ? 2048 : 1024;
        }
        if ((i & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            final String strA = Strings_androidKt.a(composerImplV, com.woolworths.R.string.close_drawer);
            composerImplV.o(-1784743395);
            Modifier modifierB = Modifier.Companion.d;
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (z2) {
                int i6 = i & 112;
                boolean z3 = i6 == 32;
                Object objG = composerImplV.G();
                if (z3 || objG == composer$Companion$Empty$1) {
                    objG = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerImplV.A(objG);
                }
                Modifier modifierX0 = modifierB.x0(new SuspendPointerInputElement(function0, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((Function2) objG), 6));
                boolean zN = (i6 == 32) | composerImplV.n(strA);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$1) {
                    objG2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj3;
                            SemanticsPropertiesKt.k(semanticsPropertyReceiver, strA);
                            final Function0 function03 = function0;
                            SemanticsPropertiesKt.h(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1.1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    function03.invoke();
                                    return Boolean.TRUE;
                                }
                            });
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG2);
                }
                z = true;
                modifierB = SemanticsModifierKt.b(modifierX0, true, (Function1) objG2);
            } else {
                z = true;
            }
            composerImplV.V(false);
            Modifier modifierX02 = SizeKt.c.x0(modifierB);
            boolean z4 = (i & 7168) == 2048 ? z : false;
            if ((i & 896) != 256) {
                z = false;
            }
            boolean z5 = z4 | z;
            Object objG3 = composerImplV.G();
            if (z5 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        DrawScope.S((DrawScope) obj3, j, 0L, 0L, ((Number) function02.invoke()).floatValue(), null, null, 118);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            CanvasKt.a(modifierX02, (Function1) objG3, composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new NavigationDrawerKt$Scrim$2(z2, function0, function02, j, iA);
        }
        return Unit.f24250a;
    }
}
