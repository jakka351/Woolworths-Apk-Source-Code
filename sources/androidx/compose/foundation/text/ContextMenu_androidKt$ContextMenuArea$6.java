package androidx.compose.foundation.text;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.contextmenu.ContextMenuArea_androidKt;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
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
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ContextMenu_androidKt$ContextMenuArea$6 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ TextFieldSelectionState h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ComposableLambdaImpl j;
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$ContextMenuArea$6(TextFieldSelectionState textFieldSelectionState, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.h = textFieldSelectionState;
        this.i = z;
        this.j = composableLambdaImpl;
        this.k = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.k | 1);
        ComposerImpl composerImplV = ((Composer) obj).v(2103477555);
        int i2 = iA & 6;
        final TextFieldSelectionState textFieldSelectionState = this.h;
        if (i2 == 0) {
            i = (composerImplV.I(textFieldSelectionState) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        boolean z = this.i;
        if (i3 == 0) {
            i |= composerImplV.p(z) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        ComposableLambdaImpl composableLambdaImpl = this.j;
        if (i4 == 0) {
            i |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if (composerImplV.z(i & 1, (i & 147) != 146)) {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new ContextMenuState();
                composerImplV.A(objG);
            }
            final ContextMenuState contextMenuState = (ContextMenuState) objG;
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG2;
            Object objG3 = composerImplV.G();
            if (objG3 == composer$Companion$Empty$1) {
                objG3 = SnapshotStateKt.f(new MenuItemsAvailability(0));
                composerImplV.A(objG3);
            }
            final MutableState mutableState = (MutableState) objG3;
            boolean zI = composerImplV.I(coroutineScope);
            Object objG4 = composerImplV.G();
            if (zI || objG4 == composer$Companion$Empty$1) {
                objG4 = new Function2<TextFieldSelectionState, TextContextMenuItems, Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1", f = "ContextMenu.android.kt", l = {79, 80, 81}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int p;
                        public final /* synthetic */ TextContextMenuItems q;
                        public final /* synthetic */ TextFieldSelectionState r;

                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1$1$WhenMappings */
                        public /* synthetic */ class WhenMappings {
                            static {
                                int[] iArr = new int[TextContextMenuItems.values().length];
                                try {
                                    iArr[0] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    TextContextMenuItems textContextMenuItems = TextContextMenuItems.e;
                                    iArr[1] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.e;
                                    iArr[2] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.e;
                                    iArr[3] = 4;
                                } catch (NoSuchFieldError unused4) {
                                }
                                try {
                                    TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.e;
                                    iArr[4] = 5;
                                } catch (NoSuchFieldError unused5) {
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(TextContextMenuItems textContextMenuItems, TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
                            super(2, continuation);
                            this.q = textContextMenuItems;
                            this.r = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.q, this.r, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:29:0x0053 A[RETURN] */
                        /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.Lambda] */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                            /*
                                r7 = this;
                                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r1 = r7.p
                                kotlin.Unit r2 = kotlin.Unit.f24250a
                                r3 = 3
                                r4 = 2
                                r5 = 1
                                if (r1 == 0) goto L1e
                                if (r1 == r5) goto L1a
                                if (r1 == r4) goto L1a
                                if (r1 != r3) goto L12
                                goto L1a
                            L12:
                                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r8.<init>(r0)
                                throw r8
                            L1a:
                                kotlin.ResultKt.b(r8)
                                goto L54
                            L1e:
                                kotlin.ResultKt.b(r8)
                                androidx.compose.foundation.text.TextContextMenuItems r8 = r7.q
                                int r8 = r8.ordinal()
                                r1 = 0
                                androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r6 = r7.r
                                if (r8 == 0) goto L55
                                if (r8 == r5) goto L4b
                                if (r8 == r4) goto L42
                                if (r8 == r3) goto L3e
                                r0 = 4
                                if (r8 == r0) goto L36
                                goto L54
                            L36:
                                kotlin.jvm.internal.Lambda r8 = r6.h
                                if (r8 == 0) goto L54
                                r8.invoke()
                                goto L54
                            L3e:
                                r6.getClass()
                                throw r1
                            L42:
                                r7.p = r3
                                java.lang.Object r8 = r6.p(r7)
                                if (r8 != r0) goto L54
                                goto L53
                            L4b:
                                r7.p = r4
                                r8 = 0
                                r6.d(r8, r7)
                                if (r2 != r0) goto L54
                            L53:
                                return r0
                            L54:
                                return r2
                            L55:
                                r7.p = r5
                                r6.f(r7)
                                throw r1
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$menuBuilder$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }
                    }

                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        BuildersKt.c(coroutineScope, null, CoroutineStart.g, new AnonymousClass1((TextContextMenuItems) obj4, (TextFieldSelectionState) obj3, null), 1);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG4);
            }
            Function1 function1A = TextFieldSelectionState_androidKt.a(textFieldSelectionState, contextMenuState, mutableState, (Function2) objG4);
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$4$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ContextMenuState_androidKt.a(contextMenuState);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG5);
            }
            Function0 function0 = (Function0) objG5;
            boolean zI2 = composerImplV.I(coroutineScope) | composerImplV.I(textFieldSelectionState);
            Object objG6 = composerImplV.G();
            if (zI2 || objG6 == composer$Companion$Empty$1) {
                objG6 = new Function0<Unit>() { // from class: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1", f = "ContextMenu.android.kt", l = {96}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.ContextMenu_androidKt$ContextMenuArea$5$1$1, reason: invalid class name */
                    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public MutableState p;
                        public int q;
                        public final /* synthetic */ MutableState r;
                        public final /* synthetic */ TextFieldSelectionState s;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MutableState mutableState, TextFieldSelectionState textFieldSelectionState, Continuation continuation) {
                            super(2, continuation);
                            this.r = mutableState;
                            this.s = textFieldSelectionState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation create(Object obj, Continuation continuation) {
                            return new AnonymousClass1(this.r, this.s, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
                            Unit unit = Unit.f24250a;
                            anonymousClass1.invokeSuspend(unit);
                            return unit;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                            int i = this.q;
                            if (i == 0) {
                                ResultKt.b(obj);
                                this.p = this.r;
                                this.q = 1;
                                ContextMenu_androidKt.b(this.s, this);
                                throw null;
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            MutableState mutableState = this.p;
                            ResultKt.b(obj);
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
                        BuildersKt.c(coroutineScope, null, CoroutineStart.g, new AnonymousClass1(mutableState, textFieldSelectionState, null), 1);
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG6);
            }
            ContextMenuArea_androidKt.b(contextMenuState, function0, function1A, null, z, (Function0) objG6, composableLambdaImpl, composerImplV, ((i << 9) & 57344) | 54 | ((i << 12) & 3670016), 8);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new ContextMenu_androidKt$ContextMenuArea$6(textFieldSelectionState, z, composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
