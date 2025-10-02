package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.text.TextFieldDelegate;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputSession;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "writeable", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CoreTextFieldKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0591 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0643 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06d1  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0705  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x07dc  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0815 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0850  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x089a  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x091b  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x091f  */
    /* JADX WARN: Type inference failed for: r2v50, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r2v59, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.ui.text.input.TextFieldValue r64, final kotlin.jvm.functions.Function1 r65, final androidx.compose.ui.Modifier r66, final androidx.compose.ui.text.TextStyle r67, final androidx.compose.ui.text.input.VisualTransformation r68, final kotlin.jvm.functions.Function1 r69, final androidx.compose.foundation.interaction.MutableInteractionSource r70, final androidx.compose.ui.graphics.Brush r71, final boolean r72, final int r73, final int r74, final androidx.compose.ui.text.input.ImeOptions r75, final androidx.compose.foundation.text.KeyboardActions r76, final boolean r77, final boolean r78, final kotlin.jvm.functions.Function3 r79, androidx.compose.runtime.Composer r80, final int r81, final int r82) {
        /*
            Method dump skipped, instructions count: 2458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.a(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, boolean, int, int, androidx.compose.ui.text.input.ImeOptions, androidx.compose.foundation.text.KeyboardActions, boolean, boolean, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final Modifier modifier, final TextFieldSelectionManager textFieldSelectionManager, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-20551815);
        int i2 = (composerImplV.n(modifier) ? 4 : 2) | i | (composerImplV.I(textFieldSelectionManager) ? 32 : 16);
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, true);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                b.B(i3, composerImplV, i3, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            ContextMenu_androidKt.a(textFieldSelectionManager, composableLambdaImpl, composerImplV, (i2 >> 3) & 126);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(textFieldSelectionManager, composableLambdaImpl, i) { // from class: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextFieldRootBox$2
                public final /* synthetic */ TextFieldSelectionManager i;
                public final /* synthetic */ ComposableLambdaImpl j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(385);
                    CoreTextFieldKt.b(this.h, this.i, this.j, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.foundation.text.selection.TextFieldSelectionManager r11, androidx.compose.runtime.Composer r12, final int r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.CoreTextFieldKt.c(androidx.compose.foundation.text.selection.TextFieldSelectionManager, androidx.compose.runtime.Composer, int):void");
    }

    public static final void d(final TextFieldSelectionManager textFieldSelectionManager, final boolean z, Composer composer, final int i) {
        int i2;
        TextLayoutResultProxy textLayoutResultProxyD;
        ComposerImpl composerImplV = composer.v(626339208);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if (!composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            composerImplV.j();
        } else if (z) {
            composerImplV.o(-1290924834);
            LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
            TextLayoutResult textLayoutResult = null;
            if (legacyTextFieldState != null && (textLayoutResultProxyD = legacyTextFieldState.d()) != null) {
                TextLayoutResult textLayoutResult2 = textLayoutResultProxyD.f1135a;
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                if (!(legacyTextFieldState2 != null ? legacyTextFieldState2.p : true)) {
                    textLayoutResult = textLayoutResult2;
                }
            }
            if (textLayoutResult == null) {
                composerImplV.o(-1290601288);
            } else {
                composerImplV.o(-1290601287);
                if (TextRange.c(textFieldSelectionManager.m().b)) {
                    composerImplV.o(-1684179174);
                    composerImplV.V(false);
                } else {
                    composerImplV.o(-1685230508);
                    int iB = textFieldSelectionManager.b.b((int) (textFieldSelectionManager.m().b >> 32));
                    int iB2 = textFieldSelectionManager.b.b((int) (textFieldSelectionManager.m().b & 4294967295L));
                    ResolvedTextDirection resolvedTextDirectionA = textLayoutResult.a(iB);
                    ResolvedTextDirection resolvedTextDirectionA2 = textLayoutResult.a(Math.max(iB2 - 1, 0));
                    LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
                    if (legacyTextFieldState3 == null || !((Boolean) ((SnapshotMutableStateImpl) legacyTextFieldState3.m).getD()).booleanValue()) {
                        composerImplV.o(-1684548198);
                        composerImplV.V(false);
                    } else {
                        composerImplV.o(-1684812473);
                        TextFieldSelectionManagerKt.a(true, resolvedTextDirectionA, textFieldSelectionManager, composerImplV, ((i2 << 6) & 896) | 6);
                        composerImplV.V(false);
                    }
                    LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.d;
                    if (legacyTextFieldState4 == null || !((Boolean) ((SnapshotMutableStateImpl) legacyTextFieldState4.n).getD()).booleanValue()) {
                        composerImplV.o(-1684200998);
                        composerImplV.V(false);
                    } else {
                        composerImplV.o(-1684464312);
                        TextFieldSelectionManagerKt.a(false, resolvedTextDirectionA2, textFieldSelectionManager, composerImplV, ((i2 << 6) & 896) | 6);
                        composerImplV.V(false);
                    }
                    composerImplV.V(false);
                }
                LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.d;
                if (legacyTextFieldState5 != null) {
                    MutableState mutableState = legacyTextFieldState5.l;
                    if (!Intrinsics.c(textFieldSelectionManager.u.f2127a.e, textFieldSelectionManager.m().f2127a.e)) {
                        ((SnapshotMutableStateImpl) mutableState).setValue(Boolean.FALSE);
                    }
                    if (legacyTextFieldState5.b()) {
                        if (((Boolean) ((SnapshotMutableStateImpl) mutableState).getD()).booleanValue()) {
                            textFieldSelectionManager.r();
                        } else {
                            textFieldSelectionManager.n();
                        }
                    }
                }
            }
            composerImplV.V(false);
            composerImplV.V(false);
        } else {
            composerImplV.o(651160447);
            composerImplV.V(false);
            textFieldSelectionManager.n();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.CoreTextFieldKt$SelectionToolbarAndHandles$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    CoreTextFieldKt.d(textFieldSelectionManager, z, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void e(LegacyTextFieldState legacyTextFieldState) {
        TextInputSession textInputSession = legacyTextFieldState.e;
        if (textInputSession != null) {
            EditProcessor editProcessor = legacyTextFieldState.d;
            ((LegacyTextFieldState$onValueChange$1) legacyTextFieldState.v).invoke(TextFieldValue.a(editProcessor.f2112a, null, 0L, 3));
            TextInputService textInputService = textInputSession.f2131a;
            AtomicReference atomicReference = textInputService.b;
            while (true) {
                if (atomicReference.compareAndSet(textInputSession, null)) {
                    textInputService.f2128a.a();
                    break;
                } else if (atomicReference.get() != textInputSession) {
                    break;
                }
            }
        }
        legacyTextFieldState.e = null;
    }

    public static final void f(LegacyTextFieldState legacyTextFieldState, TextFieldValue textFieldValue, OffsetMapping offsetMapping) {
        Snapshot snapshotA = Snapshot.Companion.a();
        Function1 e = snapshotA != null ? snapshotA.getE() : null;
        Snapshot snapshotB = Snapshot.Companion.b(snapshotA);
        try {
            TextLayoutResultProxy textLayoutResultProxyD = legacyTextFieldState.d();
            if (textLayoutResultProxyD == null) {
                return;
            }
            TextInputSession textInputSession = legacyTextFieldState.e;
            if (textInputSession == null) {
                return;
            }
            LayoutCoordinates layoutCoordinatesC = legacyTextFieldState.c();
            if (layoutCoordinatesC == null) {
                return;
            }
            TextFieldDelegate.Companion.b(textFieldValue, legacyTextFieldState.f1121a, textLayoutResultProxyD.f1135a, layoutCoordinatesC, textInputSession, legacyTextFieldState.b(), offsetMapping);
        } finally {
            Snapshot.Companion.e(snapshotA, snapshotB, e);
        }
    }
}
