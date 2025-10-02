package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ContextMenu_androidKt {
    public static final void a(final TextFieldSelectionManager textFieldSelectionManager, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        final ComposableLambdaImpl composableLambdaImpl2;
        ComposerImpl composerImplV = composer.v(-1985516685);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(textFieldSelectionManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 32 : 16;
        }
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = new ContextMenuState();
                composerImplV.A(objG);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objG;
            Object objG2 = composerImplV.G();
            if (objG2 == obj) {
                objG2 = b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG2;
            Object objG3 = composerImplV.G();
            if (objG3 == obj) {
                objG3 = SnapshotStateKt.f(new MenuItemsAvailability(0));
                composerImplV.A(objG3);
            }
            final MutableState mutableState = (MutableState) objG3;
            Object objG4 = composerImplV.G();
            if (objG4 == obj) {
                objG4 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$1$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ContextMenuState_androidKt.a(contextMenuState);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG4);
            }
            Function0 function0 = (Function0) objG4;
            Function1 function1A = TextFieldSelectionManager_androidKt.a(textFieldSelectionManager, contextMenuState, mutableState);
            boolean zK = textFieldSelectionManager.k();
            boolean zI = composerImplV.I(coroutineScope) | composerImplV.I(textFieldSelectionManager);
            Object objG5 = composerImplV.G();
            if (zI || objG5 == obj) {
                objG5 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1", f = "ContextMenu.android.kt", l = {56}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$2$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public MutableState p;
                        public int q;
                        public final /* synthetic */ MutableState r;
                        public final /* synthetic */ TextFieldSelectionManager s;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState mutableState, TextFieldSelectionManager textFieldSelectionManager, Continuation continuation) {
                            super(2, continuation);
                            this.r = mutableState;
                            this.s = textFieldSelectionManager;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.r, this.s, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            MutableState mutableState;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                            int i = this.q;
                            if (i == 0) {
                                ResultKt.b(obj);
                                MutableState mutableState2 = this.r;
                                this.p = mutableState2;
                                this.q = 1;
                                Object objC = ContextMenu_androidKt.c(this.s, this);
                                if (objC == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                                mutableState = mutableState2;
                                obj = objC;
                            } else {
                                if (i != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                mutableState = this.p;
                                ResultKt.b(obj);
                            }
                            mutableState.setValue(obj);
                            return Unit.f24250a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        BuildersKt.c(coroutineScope, null, CoroutineStart.g, new AnonymousClass1(mutableState, textFieldSelectionManager, null), 1);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG5);
            }
            composableLambdaImpl2 = composableLambdaImpl;
            ContextMenuArea_androidKt.b(contextMenuState, function0, function1A, null, zK, (Function0) objG5, composableLambdaImpl2, composerImplV, ((i2 << 15) & 3670016) | 54, 8);
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    ContextMenu_androidKt.a(textFieldSelectionManager, composableLambdaImpl2, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = (androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1 r0 = new androidx.compose.foundation.text.ContextMenu_androidKt$getContextMenuItemsAvailability$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r0.q
            r1 = 0
            if (r0 == 0) goto L35
            r4 = 1
            if (r0 != r4) goto L2d
            kotlin.ResultKt.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.booleanValue()
            throw r1
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.ResultKt.b(r5)
            r4.getClass()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[PHI: r2 r5 r7 r8
  0x0091: PHI (r2v3 ??) = (r2v1 ??), (r2v10 ??) binds: [B:20:0x0056, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r5v3 int) = (r5v1 int), (r5v12 int) binds: [B:20:0x0056, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r7v3 androidx.compose.foundation.text.selection.TextFieldSelectionManager) = 
  (r7v0 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
  (r7v11 androidx.compose.foundation.text.selection.TextFieldSelectionManager)
 binds: [B:20:0x0056, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]
  0x0091: PHI (r8v10 int) = (r8v6 int), (r8v16 int) binds: [B:20:0x0056, B:34:0x008d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(androidx.compose.foundation.text.selection.TextFieldSelectionManager r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt.c(androidx.compose.foundation.text.selection.TextFieldSelectionManager, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
