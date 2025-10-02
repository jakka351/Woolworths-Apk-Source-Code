package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.foundation.MagnifierElement;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SelectionManager_androidKt$selectionMagnifier$1 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.o(-1914520728);
        final Density density = (Density) composer.x(CompositionLocalsKt.h);
        Object objG = composer.G();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (objG == composer$Companion$Empty$1) {
            objG = SnapshotStateKt.f(new IntSize(0L));
            composer.A(objG);
        }
        final MutableState mutableState = (MutableState) objG;
        final SelectionManager selectionManager = null;
        boolean zI = composer.I(null);
        Object objG2 = composer.G();
        if (zI || objG2 == composer$Companion$Empty$1) {
            objG2 = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
                @Override // kotlin.jvm.functions.Function0
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invoke() {
                    /*
                        r7 = this;
                        androidx.compose.runtime.MutableState r0 = r2
                        java.lang.Object r0 = r0.getD()
                        androidx.compose.ui.unit.IntSize r0 = (androidx.compose.ui.unit.IntSize) r0
                        long r0 = r0.f2202a
                        androidx.compose.foundation.text.selection.SelectionManager r2 = r1
                        androidx.compose.foundation.text.selection.Selection r3 = r2.e()
                        if (r3 != 0) goto L13
                        goto L4b
                    L13:
                        androidx.compose.foundation.text.Handle r4 = r2.d()
                        r5 = -1
                        if (r4 != 0) goto L1c
                        r4 = r5
                        goto L24
                    L1c:
                        int[] r6 = androidx.compose.foundation.text.selection.SelectionManagerKt.WhenMappings.f1215a
                        int r4 = r4.ordinal()
                        r4 = r6[r4]
                    L24:
                        if (r4 == r5) goto L4b
                        r5 = 1
                        if (r4 == r5) goto L44
                        r5 = 2
                        if (r4 == r5) goto L3d
                        r0 = 3
                        if (r4 == r0) goto L35
                        kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                        r0.<init>()
                        throw r0
                    L35:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "SelectionContainer does not support cursor"
                        r0.<init>(r1)
                        throw r0
                    L3d:
                        androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r3.b
                        long r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.b(r2, r0, r3)
                        goto L50
                    L44:
                        androidx.compose.foundation.text.selection.Selection$AnchorInfo r3 = r3.f1204a
                        long r0 = androidx.compose.foundation.text.selection.SelectionManagerKt.b(r2, r0, r3)
                        goto L50
                    L4b:
                        r0 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
                    L50:
                        androidx.compose.ui.geometry.Offset r2 = new androidx.compose.ui.geometry.Offset
                        r2.<init>(r0)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$1$1.invoke():java.lang.Object");
                }
            };
            composer.A(objG2);
        }
        Function0 function0 = (Function0) objG2;
        boolean zN = composer.n(density);
        Object objG3 = composer.G();
        if (zN || objG3 == composer$Companion$Empty$1) {
            objG3 = new Function1<Function0<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj4) {
                    final Function0 function02 = (Function0) obj4;
                    Function1<Density, Offset> function1 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return new Offset(((Offset) function02.invoke()).f1751a);
                        }
                    };
                    final Density density2 = density;
                    final MutableState mutableState2 = mutableState;
                    return new MagnifierElement(function1, new Function1<DpSize, Unit>() { // from class: androidx.compose.foundation.text.selection.SelectionManager_androidKt$selectionMagnifier$1$2$1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            float fB = DpSize.b(((DpSize) obj5).f2199a);
                            Density density3 = density2;
                            mutableState2.setValue(new IntSize((density3.r1(fB) << 32) | (density3.r1(DpSize.a(r0)) & 4294967295L)));
                            return Unit.f24250a;
                        }
                    }, PlatformMagnifierFactory.Companion.a());
                }
            };
            composer.A(objG3);
        }
        AnimationVector2D animationVector2D = SelectionMagnifierKt.f1213a;
        Modifier modifierA = ComposedModifierKt.a(modifier, InspectableValueKt.a(), new SelectionMagnifierKt$animatedSelectionMagnifier$1(function0, (Function1) objG3));
        composer.l();
        return modifierA;
    }
}
