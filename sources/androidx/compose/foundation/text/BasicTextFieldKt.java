package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\b²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "cursorHandleState", "startHandleState", "endHandleState", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValueState", "", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BasicTextFieldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TextFieldDecorator f1106a = null;
    public static final long b;

    static {
        float f = 40;
        b = DpKt.a(f, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.ui.text.input.TextFieldValue r33, final kotlin.jvm.functions.Function1 r34, final androidx.compose.ui.Modifier r35, final boolean r36, boolean r37, final androidx.compose.ui.text.TextStyle r38, final androidx.compose.foundation.text.KeyboardOptions r39, final androidx.compose.foundation.text.KeyboardActions r40, final boolean r41, int r42, int r43, androidx.compose.ui.text.input.VisualTransformation r44, kotlin.jvm.functions.Function1 r45, final androidx.compose.foundation.interaction.MutableInteractionSource r46, final androidx.compose.ui.graphics.Brush r47, final kotlin.jvm.functions.Function3 r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 747
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.String r33, final kotlin.jvm.functions.Function1 r34, final androidx.compose.ui.Modifier r35, final boolean r36, boolean r37, final androidx.compose.ui.text.TextStyle r38, final androidx.compose.foundation.text.KeyboardOptions r39, final androidx.compose.foundation.text.KeyboardActions r40, final boolean r41, int r42, int r43, androidx.compose.ui.text.input.VisualTransformation r44, kotlin.jvm.functions.Function1 r45, final androidx.compose.foundation.interaction.MutableInteractionSource r46, final androidx.compose.ui.graphics.Brush r47, final kotlin.jvm.functions.Function3 r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.b(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void c(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(1991581797);
        int i2 = (composerImplV.I(textFieldSelectionState) ? 4 : 2) | i;
        if (composerImplV.z(i2 & 1, (i2 & 3) != 2)) {
            boolean zN = composerImplV.n(textFieldSelectionState);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.d(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        textFieldSelectionState.k(false);
                        throw null;
                    }
                });
                composerImplV.A(objG);
            }
            if (((TextFieldHandleState) ((State) objG).getD()).f1179a) {
                composerImplV.o(-311835217);
                boolean zI = composerImplV.I(textFieldSelectionState);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long a() {
                            textFieldSelectionState.k(true);
                            throw null;
                        }
                    };
                    composerImplV.A(objG2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objG2;
                boolean zI2 = composerImplV.I(textFieldSelectionState);
                Object objG3 = composerImplV.G();
                if (zI2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objE = textFieldSelectionState.e(pointerInputScope, continuation);
                            return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                AndroidCursorHandle_androidKt.a(offsetProvider, SuspendingPointerInputFilterKt.d(Modifier.Companion.d, textFieldSelectionState, (PointerInputEventHandler) objG3), b, composerImplV, KyberEngine.KyberPolyBytes, 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(-311451778);
                composerImplV.V(false);
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    BasicTextFieldKt.c(this.h, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i) {
        Modifier.Companion companion;
        ComposerImpl composerImplV = composer.v(2025287684);
        int i2 = (composerImplV.I(textFieldSelectionState) ? 4 : 2) | i;
        if (composerImplV.z(i2 & 1, (i2 & 3) != 2)) {
            boolean zN = composerImplV.n(textFieldSelectionState);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zN || objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.d(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return textFieldSelectionState.n(true, false);
                    }
                });
                composerImplV.A(objG);
            }
            State state = (State) objG;
            boolean z = ((TextFieldHandleState) state.getD()).f1179a;
            Modifier.Companion companion2 = Modifier.Companion.d;
            if (z) {
                composerImplV.o(-1348660553);
                boolean zI = composerImplV.I(textFieldSelectionState);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long a() {
                            return textFieldSelectionState.n(true, true).b;
                        }
                    };
                    composerImplV.A(objG2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objG2;
                ResolvedTextDirection resolvedTextDirection = ((TextFieldHandleState) state.getD()).d;
                boolean z2 = ((TextFieldHandleState) state.getD()).e;
                boolean zI2 = composerImplV.I(textFieldSelectionState);
                Object objG3 = composerImplV.G();
                if (zI2 || objG3 == composer$Companion$Empty$1) {
                    objG3 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$2$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objR = textFieldSelectionState.r(pointerInputScope, true, continuation);
                            return objR == CoroutineSingletons.d ? objR : Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG3);
                }
                companion = companion2;
                AndroidSelectionHandles_androidKt.b(offsetProvider, true, resolvedTextDirection, z2, b, ((TextFieldHandleState) state.getD()).c, SuspendingPointerInputFilterKt.d(companion2, textFieldSelectionState, (PointerInputEventHandler) objG3), composerImplV, 24624, 0);
                composerImplV.V(false);
            } else {
                companion = companion2;
                composerImplV.o(-1348008995);
                composerImplV.V(false);
            }
            boolean zN2 = composerImplV.n(textFieldSelectionState);
            Object objG4 = composerImplV.G();
            if (zN2 || objG4 == composer$Companion$Empty$1) {
                objG4 = SnapshotStateKt.d(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return textFieldSelectionState.n(false, false);
                    }
                });
                composerImplV.A(objG4);
            }
            State state2 = (State) objG4;
            if (((TextFieldHandleState) state2.getD()).f1179a) {
                composerImplV.o(-1347616070);
                boolean zI3 = composerImplV.I(textFieldSelectionState);
                Object objG5 = composerImplV.G();
                if (zI3 || objG5 == composer$Companion$Empty$1) {
                    objG5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        public final long a() {
                            return textFieldSelectionState.n(false, true).b;
                        }
                    };
                    composerImplV.A(objG5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) objG5;
                ResolvedTextDirection resolvedTextDirection2 = ((TextFieldHandleState) state2.getD()).d;
                boolean z3 = ((TextFieldHandleState) state2.getD()).e;
                boolean zI4 = composerImplV.I(textFieldSelectionState);
                Object objG6 = composerImplV.G();
                if (zI4 || objG6 == composer$Companion$Empty$1) {
                    objG6 = new PointerInputEventHandler() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$4$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation) {
                            Object objR = textFieldSelectionState.r(pointerInputScope, false, continuation);
                            return objR == CoroutineSingletons.d ? objR : Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG6);
                }
                AndroidSelectionHandles_androidKt.b(offsetProvider2, false, resolvedTextDirection2, z3, b, ((TextFieldHandleState) state2.getD()).c, SuspendingPointerInputFilterKt.d(companion, textFieldSelectionState, (PointerInputEventHandler) objG6), composerImplV, 24624, 0);
                composerImplV.V(false);
            } else {
                composerImplV.o(-1346967395);
                composerImplV.V(false);
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$5
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    BasicTextFieldKt.d(this.h, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
