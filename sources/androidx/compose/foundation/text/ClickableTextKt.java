package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ClickableTextKt {
    public static final void a(final AnnotatedString annotatedString, Modifier modifier, final TextStyle textStyle, boolean z, int i, int i2, Function1 function1, final Function1 function12, Composer composer, final int i3) {
        ComposerImpl composerImpl;
        final Modifier modifier2;
        final boolean z2;
        final int i4;
        final int i5;
        final Function1 function13;
        ComposerImpl composerImplV = composer.v(-246609449);
        int i6 = i3 | (composerImplV.n(annotatedString) ? 4 : 2) | 48 | (composerImplV.n(textStyle) ? 256 : 128) | 1797120 | (composerImplV.I(function12) ? 8388608 : 4194304);
        if (composerImplV.z(i6 & 1, (4793491 & i6) != 4793490)) {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(null);
                composerImplV.A(objG);
            }
            final MutableState mutableState = (MutableState) objG;
            boolean z3 = (29360128 & i6) == 8388608;
            Object objG2 = composerImplV.G();
            if (z3 || objG2 == composer$Companion$Empty$1) {
                objG2 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                        final MutableState mutableState2 = mutableState;
                        final Function1 function14 = function12;
                        Object objG3 = TapGestureDetectorKt.g(pointerInputScope, null, null, null, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$pressIndicator$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                long j = ((Offset) obj).f1751a;
                                TextLayoutResult textLayoutResult = (TextLayoutResult) mutableState2.getD();
                                if (textLayoutResult != null) {
                                    function14.invoke(Integer.valueOf(textLayoutResult.b.g(j)));
                                }
                                return Unit.f24250a;
                            }
                        }, continuation, 7);
                        return objG3 == CoroutineSingletons.d ? objG3 : Unit.f24250a;
                    }
                };
                composerImplV.A(objG2);
            }
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = SuspendingPointerInputFilterKt.d(companion, function12, (PointerInputEventHandler) objG2);
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<TextLayoutResult, Unit>() { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$2$1
                    public final /* synthetic */ Function1 i = ClickableTextKt$ClickableText$1.h;

                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                        mutableState.setValue(textLayoutResult);
                        this.i.invoke(textLayoutResult);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            composerImpl = composerImplV;
            BasicTextKt.a(annotatedString, modifierD, textStyle, (Function1) objG3, 1, true, Integer.MAX_VALUE, 0, null, null, composerImpl, (i6 & 58254) | 1769472, 1920);
            function13 = ClickableTextKt$ClickableText$1.h;
            modifier2 = companion;
            i4 = 1;
            z2 = true;
            i5 = Integer.MAX_VALUE;
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
            modifier2 = modifier;
            z2 = z;
            i4 = i;
            i5 = i2;
            function13 = function1;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier2, textStyle, z2, i4, i5, function13, function12, i3) { // from class: androidx.compose.foundation.text.ClickableTextKt$ClickableText$3
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ TextStyle j;
                public final /* synthetic */ boolean k;
                public final /* synthetic */ int l;
                public final /* synthetic */ int m;
                public final /* synthetic */ Function1 n;
                public final /* synthetic */ Function1 o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    ClickableTextKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
