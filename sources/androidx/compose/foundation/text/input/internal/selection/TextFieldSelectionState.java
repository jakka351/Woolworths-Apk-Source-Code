package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScopeKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "", "InputType", "TextFieldMouseSelectionObserver", "TextFieldTextDragObserver", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldSelectionState {

    /* renamed from: a, reason: collision with root package name */
    public Density f1181a;
    public boolean b;
    public boolean c;
    public boolean d;
    public HapticFeedback e;
    public TextToolbarHandler f;
    public Clipboard g;
    public Lambda h;
    public Function0 i;
    public PressInteraction.Press j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$InputType;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class InputType {
        public static final InputType d;
        public static final InputType e;
        public static final /* synthetic */ InputType[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            InputType inputType = new InputType("None", 0);
            d = inputType;
            InputType inputType2 = new InputType("Touch", 1);
            e = inputType2;
            InputType[] inputTypeArr = {inputType, inputType2, new InputType("Mouse", 2)};
            f = inputTypeArr;
            g = EnumEntriesKt.a(inputTypeArr);
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) f.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldMouseSelectionObserver;", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class TextFieldMouseSelectionObserver implements MouseSelectionObserver {

        /* renamed from: a, reason: collision with root package name */
        public final Function0 f1182a;

        public TextFieldMouseSelectionObserver(Function0 function0) {
            this.f1182a = function0;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public final boolean a(long j, SelectionAdjustment selectionAdjustment) {
            if (TextFieldSelectionState.this.b) {
                throw null;
            }
            return false;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public final void b() {
            InputType inputType = InputType.d;
            throw null;
        }

        @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
        public final boolean c(long j, SelectionAdjustment selectionAdjustment) {
            if (TextFieldSelectionState.this.b) {
                throw null;
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState$TextFieldTextDragObserver;", "Landroidx/compose/foundation/text/TextDragObserver;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class TextFieldTextDragObserver implements TextDragObserver {

        /* renamed from: a, reason: collision with root package name */
        public final Function0 f1183a;
        public long b = 9205357640488583168L;
        public final Handle c = Handle.f;

        public TextFieldTextDragObserver(Function0 function0) {
            this.f1183a = function0;
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void a() {
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void b(long j) {
            if (TextFieldSelectionState.this.b) {
                throw null;
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void c(long j) {
            TextFieldSelectionState textFieldSelectionState = TextFieldSelectionState.this;
            if (textFieldSelectionState.b) {
                textFieldSelectionState.w(this.c, j);
                textFieldSelectionState.s(false);
                InputType inputType = InputType.e;
                throw null;
            }
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void d() {
        }

        public final void e() {
            if ((this.b & 9223372034707292159L) == 9205357640488583168L) {
                return;
            }
            TextFieldSelectionState.this.c();
            this.b = 9205357640488583168L;
            InputType inputType = InputType.d;
            throw null;
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onCancel() {
            e();
        }

        @Override // androidx.compose.foundation.text.TextDragObserver
        public final void onStop() {
            e();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IndexTransformationType indexTransformationType = IndexTransformationType.d;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                IndexTransformationType indexTransformationType2 = IndexTransformationType.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                IndexTransformationType indexTransformationType3 = IndexTransformationType.d;
                iArr[2] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r8, androidx.compose.ui.input.pointer.PointerInputScope r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            if (r0 == 0) goto L14
            r0 = r10
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.u = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$1
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.s
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.u
            r2 = 1
            if (r1 == 0) goto L3a
            if (r1 != r2) goto L32
            kotlin.jvm.internal.Ref$LongRef r8 = r6.r
            kotlin.jvm.internal.Ref$LongRef r9 = r6.q
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r1 = r6.p
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L2f
            goto L78
        L2f:
            r0 = move-exception
            r10 = r0
            goto L85
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            kotlin.ResultKt.b(r10)
            kotlin.jvm.internal.Ref$LongRef r10 = new kotlin.jvm.internal.Ref$LongRef
            r10.<init>()
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            r10.d = r3
            kotlin.jvm.internal.Ref$LongRef r7 = new kotlin.jvm.internal.Ref$LongRef
            r7.<init>()
            r7.d = r3
            r1 = r2
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2 r2 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$2     // Catch: java.lang.Throwable -> L7e
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L7e
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3 r3 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$3     // Catch: java.lang.Throwable -> L7e
            r3.<init>(r8)     // Catch: java.lang.Throwable -> L7e
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$4     // Catch: java.lang.Throwable -> L7e
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L7e
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5 r5 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectCursorHandleDragGestures$5     // Catch: java.lang.Throwable -> L7e
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L7e
            r6.p = r8     // Catch: java.lang.Throwable -> L7e
            r6.q = r10     // Catch: java.lang.Throwable -> L7e
            r6.r = r7     // Catch: java.lang.Throwable -> L7e
            r6.u = r1     // Catch: java.lang.Throwable -> L7e
            r1 = r9
            java.lang.Object r9 = androidx.compose.foundation.gestures.DragGestureDetectorKt.e(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7e
            if (r9 != r0) goto L75
            return r0
        L75:
            r1 = r8
            r9 = r10
            r8 = r7
        L78:
            g(r1, r9, r8)
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        L7e:
            r0 = move-exception
            r9 = r0
            r1 = r10
            r10 = r9
            r9 = r1
            r1 = r8
            r8 = r7
        L85:
            g(r1, r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.a(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(final androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r15, androidx.compose.ui.input.pointer.PointerInputScope r16, final boolean r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 188
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.b(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.ui.input.pointer.PointerInputScope, boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void g(TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef, Ref.LongRef longRef2) {
        if ((longRef.d & 9223372034707292159L) != 9205357640488583168L) {
            longRef.d = 9205357640488583168L;
            longRef2.d = 9205357640488583168L;
            textFieldSelectionState.c();
        }
    }

    public static final void h(TextFieldSelectionState textFieldSelectionState, Ref.LongRef longRef, Ref.LongRef longRef2) {
        if ((longRef.d & 9223372034707292159L) != 9205357640488583168L) {
            textFieldSelectionState.c();
            longRef.d = 9205357640488583168L;
            longRef2.d = 0L;
        }
    }

    public final void c() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(boolean r4, kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1
            if (r4 == 0) goto L13
            r4 = r5
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r4 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1) r4
            int r0 = r4.r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.r = r0
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1 r4 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$copy$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r4 = r4.r
            if (r4 == 0) goto L31
            r0 = 1
            if (r4 != r0) goto L29
            kotlin.ResultKt.b(r5)
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.ResultKt.b(r5)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.d(boolean, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object e(PointerInputScope pointerInputScope, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new TextFieldSelectionState$cursorHandleGestures$2(this, pointerInputScope, null), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$cut$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r0.r
            r1 = 0
            if (r0 == 0) goto L30
            r2 = 1
            if (r0 != r2) goto L28
            kotlin.ResultKt.b(r5)
            throw r1
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L30:
            kotlin.ResultKt.b(r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.f(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object i(PointerInputScope pointerInputScope, MutableInteractionSource mutableInteractionSource, final Function0 function0, final Function0 function02, Continuation continuation) {
        Object objE = TapGestureDetectorKt.e(pointerInputScope, new TextFieldSelectionState$detectTextFieldTapGestures$2(mutableInteractionSource, this, null), new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3

            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$detectTextFieldTapGestures$3$1, reason: invalid class name */
            final class AnonymousClass1 extends Lambda implements Function0<String> {
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Object invoke() {
                    return "onTapTextField";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                long j = ((Offset) obj).f1751a;
                function0.invoke();
                TextFieldSelectionState textFieldSelectionState = this;
                if (!textFieldSelectionState.b || !textFieldSelectionState.d) {
                    return Unit.f24250a;
                }
                if (textFieldSelectionState.c) {
                    textFieldSelectionState.t(TextToolbarState.d);
                    throw null;
                }
                function02.invoke();
                throw null;
            }
        }, continuation);
        return objE == CoroutineSingletons.d ? objE : Unit.f24250a;
    }

    public final Object j(PointerInputScope pointerInputScope, SuspendLambda suspendLambda) {
        Object objC1 = pointerInputScope.c1(new TextFieldSelectionState$detectTouchMode$2(this, null), suspendLambda);
        return objC1 == CoroutineSingletons.d ? objC1 : Unit.f24250a;
    }

    public final TextFieldHandleState k(boolean z) {
        throw null;
    }

    public final Handle l() {
        throw null;
    }

    public final long m() {
        throw null;
    }

    public final TextFieldHandleState n(boolean z, boolean z2) {
        Handle handle = Handle.d;
        throw null;
    }

    public final TextToolbarState o() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0092 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(kotlin.coroutines.jvm.internal.ContinuationImpl r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$paste$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            kotlin.Unit r7 = kotlin.Unit.f24250a
            if (r2 == 0) goto L44
            if (r2 == r6) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            kotlin.ResultKt.b(r9)
            return r7
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L38:
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = r0.q
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r5 = r0.p
            kotlin.ResultKt.b(r9)
            goto L67
        L40:
            kotlin.ResultKt.b(r9)
            return r7
        L44:
            kotlin.ResultKt.b(r9)
            kotlin.jvm.functions.Function0 r9 = r8.i
            if (r9 == 0) goto L89
            java.lang.Object r9 = r9.invoke()
            r2 = r9
            androidx.compose.foundation.content.internal.ReceiveContentConfiguration r2 = (androidx.compose.foundation.content.internal.ReceiveContentConfiguration) r2
            if (r2 != 0) goto L55
            goto L89
        L55:
            androidx.compose.ui.platform.Clipboard r9 = r8.g
            if (r9 == 0) goto L7b
            r0.p = r8
            r0.q = r2
            r0.t = r5
            androidx.compose.ui.platform.ClipEntry r9 = r9.a()
            if (r9 != r1) goto L66
            goto L91
        L66:
            r5 = r8
        L67:
            androidx.compose.ui.platform.ClipEntry r9 = (androidx.compose.ui.platform.ClipEntry) r9
            if (r9 != 0) goto L6c
            goto L7c
        L6c:
            android.content.ClipData r9 = r9.f1962a
            r9.getDescription()
            androidx.compose.foundation.content.ReceiveContentListener r9 = r2.a()
            androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1 r9 = (androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1) r9
            r9.getClass()
            throw r3
        L7b:
            r5 = r8
        L7c:
            r0.p = r3
            r0.q = r3
            r0.t = r4
            java.lang.Object r9 = r5.q(r0)
            if (r9 != r1) goto L92
            goto L91
        L89:
            r0.t = r6
            java.lang.Object r9 = r8.q(r0)
            if (r9 != r1) goto L92
        L91:
            return r1
        L92:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.p(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$pasteAsPlainText$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = r0.p
            kotlin.ResultKt.b(r5)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            androidx.compose.ui.platform.Clipboard r5 = r4.g
            if (r5 == 0) goto L67
            r0.p = r4
            r0.s = r3
            androidx.compose.ui.platform.ClipEntry r5 = r5.a()
            if (r5 != r1) goto L43
            return r1
        L43:
            r0 = r4
        L44:
            androidx.compose.ui.platform.ClipEntry r5 = (androidx.compose.ui.platform.ClipEntry) r5
            if (r5 == 0) goto L67
            android.content.ClipData r5 = r5.f1962a
            r1 = 0
            android.content.ClipData$Item r5 = r5.getItemAt(r1)
            r1 = 0
            if (r5 == 0) goto L5d
            java.lang.CharSequence r5 = r5.getText()
            if (r5 == 0) goto L5d
            java.lang.String r5 = r5.toString()
            goto L5e
        L5d:
            r5 = r1
        L5e:
            if (r5 != 0) goto L61
            goto L67
        L61:
            r0.getClass()
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior[] r5 = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.d
            throw r1
        L67:
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.q(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object r(PointerInputScope pointerInputScope, boolean z, Continuation continuation) {
        Object objC = CoroutineScopeKt.c(new TextFieldSelectionState$selectionHandleGestures$2(this, pointerInputScope, null, z), continuation);
        return objC == CoroutineSingletons.d ? objC : Unit.f24250a;
    }

    public final void s(boolean z) {
        throw null;
    }

    public final void t(TextToolbarState textToolbarState) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(kotlin.coroutines.jvm.internal.ContinuationImpl r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = (androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1 r0 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r0 = r0.p
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L49
        L2a:
            r6 = move-exception
            goto L60
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.ResultKt.b(r6)
            androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2 r6 = new androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState$startToolbarAndHandlesVisibilityObserver$2     // Catch: java.lang.Throwable -> L5e
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L5e
            r0.p = r5     // Catch: java.lang.Throwable -> L5e
            r0.s = r4     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = kotlinx.coroutines.CoroutineScopeKt.c(r6, r0)     // Catch: java.lang.Throwable -> L5e
            if (r6 != r1) goto L48
            return r1
        L48:
            r0 = r5
        L49:
            r0.s(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r6 = r0.o()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.d
            if (r6 == r1) goto L5b
            androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler r6 = r0.f
            if (r6 == 0) goto L5b
            r6.a()
        L5b:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L5e:
            r6 = move-exception
            r0 = r5
        L60:
            r0.s(r3)
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r1 = r0.o()
            androidx.compose.foundation.text.input.internal.selection.TextToolbarState r2 = androidx.compose.foundation.text.input.internal.selection.TextToolbarState.d
            if (r1 == r2) goto L72
            androidx.compose.foundation.text.input.internal.selection.TextToolbarHandler r0 = r0.f
            if (r0 == 0) goto L72
            r0.a()
        L72:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState.u(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object v(PointerInputScope pointerInputScope, Function0 function0, Continuation continuation) {
        Object objJ = SelectionGesturesKt.j(pointerInputScope, new TextFieldMouseSelectionObserver(function0), new TextFieldTextDragObserver(function0), continuation);
        return objJ == CoroutineSingletons.d ? objJ : Unit.f24250a;
    }

    public final void w(Handle handle, long j) {
        throw null;
    }
}
