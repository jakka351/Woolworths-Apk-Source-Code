package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TextFieldSelectionManager {

    /* renamed from: a, reason: collision with root package name */
    public final UndoManager f1220a;
    public LegacyTextFieldState d;
    public Lambda g;
    public Clipboard h;
    public CoroutineScope i;
    public TextToolbar j;
    public HapticFeedback k;
    public FocusRequester l;
    public final MutableState m;
    public final MutableState n;
    public long o;
    public Integer p;
    public long q;
    public final MutableState r;
    public final MutableState s;
    public int t;
    public TextFieldValue u;
    public SelectionLayout v;
    public final TextFieldSelectionManager$touchSelectionObserver$1 w;
    public final TextFieldSelectionManager$mouseSelectionObserver$1 x;
    public OffsetMapping b = ValidatingOffsetMappingKt.f1145a;
    public Function1 c = TextFieldSelectionManager$onValueChange$1.h;
    public final MutableState e = SnapshotStateKt.f(new TextFieldValue((String) null, 0, 7));
    public VisualTransformation f = VisualTransformation.Companion.f2133a;

    /* JADX WARN: Type inference failed for: r6v12, types: [androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1] */
    /* JADX WARN: Type inference failed for: r6v13, types: [androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1] */
    public TextFieldSelectionManager(UndoManager undoManager) {
        this.f1220a = undoManager;
        Boolean bool = Boolean.TRUE;
        this.m = SnapshotStateKt.f(bool);
        this.n = SnapshotStateKt.f(bool);
        this.o = 0L;
        this.q = 0L;
        this.r = SnapshotStateKt.f(null);
        this.s = SnapshotStateKt.f(null);
        this.t = -1;
        this.u = new TextFieldValue((String) null, 0L, 7);
        this.w = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void a() {
            }

            /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void b(long r10) {
                /*
                    r9 = this;
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.f1224a
                    boolean r1 = r0.k()
                    if (r1 == 0) goto Lc7
                    androidx.compose.ui.text.input.TextFieldValue r1 = r0.m()
                    androidx.compose.ui.text.AnnotatedString r1 = r1.f2127a
                    java.lang.String r1 = r1.e
                    int r1 = r1.length()
                    if (r1 != 0) goto L18
                    goto Lc7
                L18:
                    long r1 = r0.q
                    long r10 = androidx.compose.ui.geometry.Offset.h(r1, r10)
                    r0.q = r10
                    androidx.compose.foundation.text.LegacyTextFieldState r10 = r0.d
                    r11 = 0
                    if (r10 == 0) goto Lc4
                    androidx.compose.foundation.text.TextLayoutResultProxy r10 = r10.d()
                    if (r10 == 0) goto Lc4
                    long r1 = r0.o
                    long r3 = r0.q
                    long r1 = androidx.compose.ui.geometry.Offset.h(r1, r3)
                    androidx.compose.ui.geometry.Offset r3 = new androidx.compose.ui.geometry.Offset
                    r3.<init>(r1)
                    androidx.compose.runtime.MutableState r1 = r0.s
                    androidx.compose.runtime.SnapshotMutableStateImpl r1 = (androidx.compose.runtime.SnapshotMutableStateImpl) r1
                    r1.setValue(r3)
                    java.lang.Integer r1 = r0.p
                    androidx.compose.foundation.text.selection.a r6 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.b
                    if (r1 != 0) goto L8c
                    androidx.compose.ui.geometry.Offset r1 = r0.i()
                    kotlin.jvm.internal.Intrinsics.e(r1)
                    long r1 = r1.f1751a
                    boolean r1 = r10.c(r1)
                    if (r1 != 0) goto L8c
                    androidx.compose.ui.text.input.OffsetMapping r1 = r0.b
                    long r2 = r0.o
                    r4 = 1
                    int r2 = r10.b(r2, r4)
                    int r1 = r1.a(r2)
                    androidx.compose.ui.text.input.OffsetMapping r2 = r0.b
                    androidx.compose.ui.geometry.Offset r3 = r0.i()
                    kotlin.jvm.internal.Intrinsics.e(r3)
                    long r7 = r3.f1751a
                    int r10 = r10.b(r7, r4)
                    int r10 = r2.a(r10)
                    if (r1 != r10) goto L78
                    androidx.compose.foundation.text.selection.a r6 = androidx.compose.foundation.text.selection.SelectionAdjustment.Companion.f1206a
                L78:
                    androidx.compose.ui.text.input.TextFieldValue r1 = r0.m()
                    androidx.compose.ui.geometry.Offset r10 = r0.i()
                    kotlin.jvm.internal.Intrinsics.e(r10)
                    long r2 = r10.f1751a
                    r5 = 0
                    r7 = 1
                    r4 = 0
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.c(r0, r1, r2, r4, r5, r6, r7)
                    goto Lc2
                L8c:
                    java.lang.Integer r1 = r0.p
                    if (r1 == 0) goto L95
                    int r1 = r1.intValue()
                    goto L9b
                L95:
                    long r1 = r0.o
                    int r1 = r10.b(r1, r11)
                L9b:
                    androidx.compose.ui.geometry.Offset r2 = r0.i()
                    kotlin.jvm.internal.Intrinsics.e(r2)
                    long r2 = r2.f1751a
                    int r10 = r10.b(r2, r11)
                    java.lang.Integer r2 = r0.p
                    if (r2 != 0) goto Laf
                    if (r1 != r10) goto Laf
                    goto Lc7
                Laf:
                    androidx.compose.ui.text.input.TextFieldValue r1 = r0.m()
                    androidx.compose.ui.geometry.Offset r10 = r0.i()
                    kotlin.jvm.internal.Intrinsics.e(r10)
                    long r2 = r10.f1751a
                    r5 = 0
                    r7 = 1
                    r4 = 0
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.c(r0, r1, r2, r4, r5, r6, r7)
                Lc2:
                    int r10 = androidx.compose.ui.text.TextRange.c
                Lc4:
                    r0.s(r11)
                Lc7:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1.b(long):void");
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void c(long j) {
                TextFieldSelectionManager textFieldSelectionManager;
                long j2;
                TextLayoutResultProxy textLayoutResultProxyD;
                TextLayoutResultProxy textLayoutResultProxyD2;
                TextFieldSelectionManager textFieldSelectionManager2 = this.f1224a;
                MutableState mutableState = textFieldSelectionManager2.r;
                if (textFieldSelectionManager2.k() && ((Handle) ((SnapshotMutableStateImpl) mutableState).getD()) == null) {
                    ((SnapshotMutableStateImpl) mutableState).setValue(Handle.f);
                    textFieldSelectionManager2.t = -1;
                    textFieldSelectionManager2.n();
                    LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager2.d;
                    if (legacyTextFieldState == null || (textLayoutResultProxyD2 = legacyTextFieldState.d()) == null || !textLayoutResultProxyD2.c(j)) {
                        textFieldSelectionManager = textFieldSelectionManager2;
                        j2 = j;
                        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                        if (legacyTextFieldState2 != null && (textLayoutResultProxyD = legacyTextFieldState2.d()) != null) {
                            int iA = textFieldSelectionManager.b.a(textLayoutResultProxyD.b(j2, true));
                            TextFieldValue textFieldValueE = TextFieldSelectionManager.e(textFieldSelectionManager.m().f2127a, TextRangeKt.a(iA, iA));
                            textFieldSelectionManager.h(false);
                            HapticFeedback hapticFeedback = textFieldSelectionManager.k;
                            if (hapticFeedback != null) {
                                hapticFeedback.a(9);
                            }
                            textFieldSelectionManager.c.invoke(textFieldValueE);
                        }
                    } else {
                        if (textFieldSelectionManager2.m().f2127a.e.length() == 0) {
                            return;
                        }
                        textFieldSelectionManager2.h(false);
                        long jC = TextFieldSelectionManager.c(textFieldSelectionManager2, TextFieldValue.a(textFieldSelectionManager2.m(), null, TextRange.b, 5), j, true, false, SelectionAdjustment.Companion.b, true);
                        textFieldSelectionManager = textFieldSelectionManager2;
                        j2 = j;
                        textFieldSelectionManager.p = Integer.valueOf((int) (jC >> 32));
                    }
                    textFieldSelectionManager.q(HandleState.d);
                    textFieldSelectionManager.o = j2;
                    ((SnapshotMutableStateImpl) textFieldSelectionManager.s).setValue(new Offset(j2));
                    textFieldSelectionManager.q = 0L;
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void d() {
            }

            public final void e() {
                TextFieldSelectionManager textFieldSelectionManager = this.f1224a;
                ((SnapshotMutableStateImpl) textFieldSelectionManager.r).setValue(null);
                ((SnapshotMutableStateImpl) textFieldSelectionManager.s).setValue(null);
                textFieldSelectionManager.s(true);
                textFieldSelectionManager.p = null;
                boolean zC = TextRange.c(textFieldSelectionManager.m().b);
                textFieldSelectionManager.q(zC ? HandleState.f : HandleState.e);
                LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
                if (legacyTextFieldState != null) {
                    ((SnapshotMutableStateImpl) legacyTextFieldState.m).setValue(Boolean.valueOf(!zC && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
                }
                LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
                if (legacyTextFieldState2 != null) {
                    ((SnapshotMutableStateImpl) legacyTextFieldState2.n).setValue(Boolean.valueOf(!zC && TextFieldSelectionManagerKt.b(textFieldSelectionManager, false)));
                }
                LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
                if (legacyTextFieldState3 == null) {
                    return;
                }
                ((SnapshotMutableStateImpl) legacyTextFieldState3.o).setValue(Boolean.valueOf(zC && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onCancel() {
                e();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public final void onStop() {
                e();
            }
        };
        this.x = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final boolean a(long j, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState legacyTextFieldState;
                TextFieldSelectionManager textFieldSelectionManager = this.f1223a;
                if (!textFieldSelectionManager.k() || textFieldSelectionManager.m().f2127a.e.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.d) == null || legacyTextFieldState.d() == null) {
                    return false;
                }
                d(textFieldSelectionManager.m(), j, false, selectionAdjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final void b() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public final boolean c(long j, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState legacyTextFieldState;
                TextFieldSelectionManager textFieldSelectionManager = this.f1223a;
                if (!textFieldSelectionManager.k() || textFieldSelectionManager.m().f2127a.e.length() == 0 || (legacyTextFieldState = textFieldSelectionManager.d) == null || legacyTextFieldState.d() == null) {
                    return false;
                }
                FocusRequester focusRequester = textFieldSelectionManager.l;
                if (focusRequester != null) {
                    FocusRequester.d(focusRequester);
                }
                textFieldSelectionManager.o = j;
                textFieldSelectionManager.t = -1;
                textFieldSelectionManager.h(true);
                d(textFieldSelectionManager.m(), textFieldSelectionManager.o, true, selectionAdjustment);
                return true;
            }

            public final void d(TextFieldValue textFieldValue, long j, boolean z, SelectionAdjustment selectionAdjustment) {
                TextFieldSelectionManager textFieldSelectionManager = this.f1223a;
                textFieldSelectionManager.q(TextRange.c(TextFieldSelectionManager.c(textFieldSelectionManager, textFieldValue, j, z, false, selectionAdjustment, false)) ? HandleState.f : HandleState.e);
            }
        };
    }

    public static final void a(TextFieldSelectionManager textFieldSelectionManager, Offset offset) {
        ((SnapshotMutableStateImpl) textFieldSelectionManager.s).setValue(offset);
    }

    public static final void b(TextFieldSelectionManager textFieldSelectionManager, Handle handle) {
        ((SnapshotMutableStateImpl) textFieldSelectionManager.r).setValue(handle);
    }

    public static final long c(TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, long j, boolean z, boolean z2, SelectionAdjustment selectionAdjustment, boolean z3) {
        TextLayoutResultProxy textLayoutResultProxyD;
        long j2;
        long j3;
        Selection selection;
        boolean z4;
        boolean z5;
        HapticFeedback hapticFeedback;
        int i;
        LegacyTextFieldState legacyTextFieldState = textFieldSelectionManager.d;
        if (legacyTextFieldState == null || (textLayoutResultProxyD = legacyTextFieldState.d()) == null) {
            return TextRange.b;
        }
        OffsetMapping offsetMapping = textFieldSelectionManager.b;
        long j4 = textFieldValue.b;
        AnnotatedString annotatedString = textFieldValue.f2127a;
        int i2 = TextRange.c;
        long jA = TextRangeKt.a(offsetMapping.b((int) (j4 >> 32)), textFieldSelectionManager.b.b((int) (j4 & 4294967295L)));
        int iB = textLayoutResultProxyD.b(j, false);
        int i3 = (z2 || z) ? iB : (int) (jA >> 32);
        int i4 = (!z2 || z) ? iB : (int) (jA & 4294967295L);
        SelectionLayout selectionLayout = textFieldSelectionManager.v;
        int i5 = (z || selectionLayout == null || (i = textFieldSelectionManager.t) == -1) ? -1 : i;
        TextLayoutResult textLayoutResult = textLayoutResultProxyD.f1135a;
        if (z) {
            j3 = j4;
            j2 = 4294967295L;
            selection = null;
        } else {
            int i6 = TextRange.c;
            j2 = 4294967295L;
            int i7 = (int) (jA >> 32);
            j3 = j4;
            Selection.AnchorInfo anchorInfo = new Selection.AnchorInfo(SelectionLayoutKt.a(textLayoutResult, i7), i7, 1L);
            int i8 = (int) (jA & 4294967295L);
            selection = new Selection(anchorInfo, new Selection.AnchorInfo(SelectionLayoutKt.a(textLayoutResult, i8), i8, 1L), TextRange.g(jA));
        }
        SingleSelectionLayout singleSelectionLayout = new SingleSelectionLayout(z2, 1, 1, selection, new SelectableInfo(1L, 1, i3, i4, i5, textLayoutResult));
        if (!singleSelectionLayout.e(selectionLayout)) {
            return j3;
        }
        textFieldSelectionManager.v = singleSelectionLayout;
        textFieldSelectionManager.t = iB;
        Selection selectionA = selectionAdjustment.a(singleSelectionLayout);
        long jA2 = TextRangeKt.a(textFieldSelectionManager.b.a(selectionA.f1204a.b), textFieldSelectionManager.b.a(selectionA.b.b));
        long j5 = j3;
        if (TextRange.b(jA2, j5)) {
            return j5;
        }
        boolean z6 = TextRange.g(jA2) != TextRange.g(j5) && TextRange.b(TextRangeKt.a((int) (jA2 & j2), (int) (jA2 >> 32)), j5);
        boolean z7 = TextRange.c(jA2) && TextRange.c(j5);
        if (z3 && annotatedString.e.length() > 0 && !z6 && !z7 && (hapticFeedback = textFieldSelectionManager.k) != null) {
            hapticFeedback.a(9);
        }
        textFieldSelectionManager.c.invoke(e(annotatedString, jA2));
        if (!z3) {
            textFieldSelectionManager.s(!TextRange.c(jA2));
        }
        LegacyTextFieldState legacyTextFieldState2 = textFieldSelectionManager.d;
        if (legacyTextFieldState2 != null) {
            ((SnapshotMutableStateImpl) legacyTextFieldState2.q).setValue(Boolean.valueOf(z3));
        }
        LegacyTextFieldState legacyTextFieldState3 = textFieldSelectionManager.d;
        if (legacyTextFieldState3 != null) {
            ((SnapshotMutableStateImpl) legacyTextFieldState3.m).setValue(Boolean.valueOf(!TextRange.c(jA2) && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)));
        }
        LegacyTextFieldState legacyTextFieldState4 = textFieldSelectionManager.d;
        if (legacyTextFieldState4 == null) {
            z4 = false;
        } else {
            if (TextRange.c(jA2)) {
                z4 = false;
            } else {
                z4 = false;
                if (TextFieldSelectionManagerKt.b(textFieldSelectionManager, false)) {
                    z5 = true;
                }
                ((SnapshotMutableStateImpl) legacyTextFieldState4.n).setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            ((SnapshotMutableStateImpl) legacyTextFieldState4.n).setValue(Boolean.valueOf(z5));
        }
        LegacyTextFieldState legacyTextFieldState5 = textFieldSelectionManager.d;
        if (legacyTextFieldState5 == null) {
            return jA2;
        }
        ((SnapshotMutableStateImpl) legacyTextFieldState5.o).setValue(Boolean.valueOf((TextRange.c(jA2) && TextFieldSelectionManagerKt.b(textFieldSelectionManager, true)) ? true : z4));
        return jA2;
    }

    public static TextFieldValue e(AnnotatedString annotatedString, long j) {
        return new TextFieldValue(annotatedString, j, (TextRange) null);
    }

    public final Job d(boolean z) {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            return BuildersKt.c(coroutineScope, null, CoroutineStart.g, new TextFieldSelectionManager$copy$1(this, z, null), 1);
        }
        return null;
    }

    public final void f() {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            BuildersKt.c(coroutineScope, null, CoroutineStart.g, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
    }

    public final void g(Offset offset) {
        if (!TextRange.c(m().b)) {
            LegacyTextFieldState legacyTextFieldState = this.d;
            TextLayoutResultProxy textLayoutResultProxyD = legacyTextFieldState != null ? legacyTextFieldState.d() : null;
            int iE = (offset == null || textLayoutResultProxyD == null) ? TextRange.e(m().b) : this.b.a(textLayoutResultProxyD.b(offset.f1751a, true));
            this.c.invoke(TextFieldValue.a(m(), null, TextRangeKt.a(iE, iE), 5));
        }
        q((offset == null || m().f2127a.e.length() <= 0) ? HandleState.d : HandleState.f);
        s(false);
    }

    public final void h(boolean z) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.d;
        if (legacyTextFieldState != null && !legacyTextFieldState.b() && (focusRequester = this.l) != null) {
            FocusRequester.d(focusRequester);
        }
        this.u = m();
        s(z);
        q(HandleState.e);
    }

    public final Offset i() {
        return (Offset) ((SnapshotMutableStateImpl) this.s).getD();
    }

    public final boolean j() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.m).getD()).booleanValue();
    }

    public final boolean k() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.n).getD()).booleanValue();
    }

    public final long l(boolean z) {
        TextLayoutResultProxy textLayoutResultProxyD;
        long j;
        LegacyTextFieldState legacyTextFieldState = this.d;
        if (legacyTextFieldState == null || (textLayoutResultProxyD = legacyTextFieldState.d()) == null) {
            return 9205357640488583168L;
        }
        TextLayoutResult textLayoutResult = textLayoutResultProxyD.f1135a;
        LegacyTextFieldState legacyTextFieldState2 = this.d;
        AnnotatedString annotatedString = legacyTextFieldState2 != null ? legacyTextFieldState2.f1121a.f1127a : null;
        if (annotatedString == null) {
            return 9205357640488583168L;
        }
        if (!Intrinsics.c(annotatedString.e, textLayoutResult.f2064a.f2063a.e)) {
            return 9205357640488583168L;
        }
        TextFieldValue textFieldValueM = m();
        if (z) {
            long j2 = textFieldValueM.b;
            int i = TextRange.c;
            j = j2 >> 32;
        } else {
            long j3 = textFieldValueM.b;
            int i2 = TextRange.c;
            j = j3 & 4294967295L;
        }
        return TextSelectionDelegateKt.a(textLayoutResult, this.b.b((int) j), z, TextRange.g(m().b));
    }

    public final TextFieldValue m() {
        return (TextFieldValue) ((SnapshotMutableStateImpl) this.e).getD();
    }

    public final void n() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.j;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.d || (textToolbar = this.j) == null) {
            return;
        }
        textToolbar.b();
    }

    public final void o() {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            BuildersKt.c(coroutineScope, null, CoroutineStart.g, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
    }

    public final void p() {
        TextFieldValue textFieldValueE = e(m().f2127a, TextRangeKt.a(0, m().f2127a.e.length()));
        this.c.invoke(textFieldValueE);
        this.u = TextFieldValue.a(this.u, null, textFieldValueE.b, 5);
        h(true);
    }

    public final void q(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.d;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.a() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                ((SnapshotMutableStateImpl) legacyTextFieldState.k).setValue(handleState);
            }
        }
    }

    public final void r() {
        CoroutineScope coroutineScope = this.i;
        if (coroutineScope != null) {
            BuildersKt.c(coroutineScope, null, CoroutineStart.g, new TextFieldSelectionManager$showSelectionToolbar$1(this, null), 1);
        }
    }

    public final void s(boolean z) {
        LegacyTextFieldState legacyTextFieldState = this.d;
        if (legacyTextFieldState != null) {
            ((SnapshotMutableStateImpl) legacyTextFieldState.l).setValue(Boolean.valueOf(z));
        }
        if (z) {
            r();
        } else {
            n();
        }
    }
}
