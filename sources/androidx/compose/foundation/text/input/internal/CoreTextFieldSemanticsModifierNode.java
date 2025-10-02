package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteAllCommand;
import androidx.compose.ui.text.input.EditProcessor;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TransformedText;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/CoreTextFieldSemanticsModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CoreTextFieldSemanticsModifierNode extends DelegatingNode implements SemanticsModifierNode {
    public TextFieldSelectionManager A;
    public ImeOptions B;
    public FocusRequester C;
    public TransformedText t;
    public TextFieldValue u;
    public LegacyTextFieldState v;
    public boolean w;
    public boolean x;
    public boolean y;
    public OffsetMapping z;

    public static final void v2(CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode, LegacyTextFieldState legacyTextFieldState, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        androidx.compose.ui.text.input.TextInputSession textInputSession = legacyTextFieldState.e;
        Function1 function1 = legacyTextFieldState.v;
        Unit unit = null;
        if (textInputSession != null) {
            TextFieldValue textFieldValueA = legacyTextFieldState.d.a(CollectionsKt.R(new DeleteAllCommand(), new CommitTextCommand(str, 1)));
            if (Intrinsics.c((androidx.compose.ui.text.input.TextInputSession) textInputSession.f2131a.b.get(), textInputSession)) {
                textInputSession.b.b(null, textFieldValueA);
            }
            function1.invoke(textFieldValueA);
            unit = Unit.f24250a;
        }
        if (unit == null) {
            int length = str.length();
            function1.invoke(new TextFieldValue(str, TextRangeKt.a(length, length), 4));
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    /* renamed from: P0 */
    public final boolean getR() {
        return true;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void b2(final SemanticsPropertyReceiver semanticsPropertyReceiver) {
        boolean z = this.y;
        AnnotatedString annotatedString = this.u.f2127a;
        KProperty[] kPropertyArr = SemanticsPropertiesKt.f2022a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.C;
        KProperty[] kPropertyArr2 = SemanticsPropertiesKt.f2022a;
        KProperty kProperty = kPropertyArr2[16];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, annotatedString);
        AnnotatedString annotatedString2 = this.t.f2132a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.D;
        KProperty kProperty2 = kPropertyArr2[17];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, annotatedString2);
        long j = this.u.b;
        SemanticsPropertyKey semanticsPropertyKey3 = SemanticsProperties.E;
        KProperty kProperty3 = kPropertyArr2[18];
        TextRange textRange = new TextRange(j);
        semanticsPropertyKey3.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey3, textRange);
        SemanticsPropertyKey semanticsPropertyKey4 = SemanticsProperties.q;
        KProperty kProperty4 = kPropertyArr2[8];
        semanticsPropertyKey4.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey4, ContentDataType.Companion.f1731a);
        semanticsPropertyReceiver.b(SemanticsActions.g, new AccessibilityAction(null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.h;
                MutableState mutableState = coreTextFieldSemanticsModifierNode.v.t;
                Boolean bool = Boolean.TRUE;
                ((SnapshotMutableStateImpl) mutableState).setValue(bool);
                ((SnapshotMutableStateImpl) coreTextFieldSemanticsModifierNode.v.s).setValue(bool);
                CoreTextFieldSemanticsModifierNode.v2(coreTextFieldSemanticsModifierNode, coreTextFieldSemanticsModifierNode.v, ((AnnotatedString) obj).e, coreTextFieldSemanticsModifierNode.w, coreTextFieldSemanticsModifierNode.x);
                return bool;
            }
        }));
        if (!this.x) {
            SemanticsPropertiesKt.c(semanticsPropertyReceiver);
        }
        if (z) {
            semanticsPropertyReceiver.b(SemanticsProperties.I, Unit.f24250a);
        }
        boolean z2 = this.x && !this.w;
        SemanticsPropertyKey semanticsPropertyKey5 = SemanticsProperties.L;
        KProperty kProperty5 = kPropertyArr2[24];
        Boolean boolValueOf = Boolean.valueOf(z2);
        semanticsPropertyKey5.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey5, boolValueOf);
        SemanticsPropertiesKt.f(semanticsPropertyReceiver, new Function1<List<TextLayoutResult>, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z3;
                List list = (List) obj;
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.h;
                if (coreTextFieldSemanticsModifierNode.v.d() != null) {
                    TextLayoutResultProxy textLayoutResultProxyD = coreTextFieldSemanticsModifierNode.v.d();
                    Intrinsics.e(textLayoutResultProxyD);
                    list.add(textLayoutResultProxyD.f1135a);
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boolean.valueOf(z3);
            }
        });
        if (z2) {
            semanticsPropertyReceiver.b(SemanticsActions.j, new AccessibilityAction(null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$3
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.h;
                    CoreTextFieldSemanticsModifierNode.v2(coreTextFieldSemanticsModifierNode, coreTextFieldSemanticsModifierNode.v, ((AnnotatedString) obj).e, coreTextFieldSemanticsModifierNode.w, coreTextFieldSemanticsModifierNode.x);
                    return Boolean.TRUE;
                }
            }));
            semanticsPropertyReceiver.b(SemanticsActions.n, new AccessibilityAction(null, new Function1<AnnotatedString, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    AnnotatedString annotatedString3 = (AnnotatedString) obj;
                    CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.h;
                    if (coreTextFieldSemanticsModifierNode.w || !coreTextFieldSemanticsModifierNode.x) {
                        return Boolean.FALSE;
                    }
                    androidx.compose.ui.text.input.TextInputSession textInputSession = coreTextFieldSemanticsModifierNode.v.e;
                    Unit unit = null;
                    if (textInputSession != null) {
                        List listR = CollectionsKt.R(new FinishComposingTextCommand(), new CommitTextCommand(annotatedString3, 1));
                        LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.v;
                        EditProcessor editProcessor = legacyTextFieldState.d;
                        Function1 function1 = legacyTextFieldState.v;
                        TextFieldValue textFieldValueA = editProcessor.a(listR);
                        if (Intrinsics.c((androidx.compose.ui.text.input.TextInputSession) textInputSession.f2131a.b.get(), textInputSession)) {
                            textInputSession.b.b(null, textFieldValueA);
                        }
                        function1.invoke(textFieldValueA);
                        unit = Unit.f24250a;
                    }
                    if (unit == null) {
                        TextFieldValue textFieldValue = coreTextFieldSemanticsModifierNode.u;
                        String str = textFieldValue.f2127a.e;
                        long j2 = textFieldValue.b;
                        int i = TextRange.c;
                        String string = StringsKt.S(str, (int) (j2 >> 32), (int) (j2 & 4294967295L), annotatedString3).toString();
                        int length = annotatedString3.e.length() + ((int) (coreTextFieldSemanticsModifierNode.u.b >> 32));
                        coreTextFieldSemanticsModifierNode.v.v.invoke(new TextFieldValue(string, TextRangeKt.a(length, length), 4));
                    }
                    return Boolean.TRUE;
                }
            }));
        }
        semanticsPropertyReceiver.b(SemanticsActions.i, new AccessibilityAction(null, new Function3<Integer, Integer, Boolean, Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$5
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.h;
                if (!zBooleanValue) {
                    iIntValue = coreTextFieldSemanticsModifierNode.z.a(iIntValue);
                }
                if (!zBooleanValue) {
                    iIntValue2 = coreTextFieldSemanticsModifierNode.z.a(iIntValue2);
                }
                boolean z3 = false;
                if (coreTextFieldSemanticsModifierNode.x) {
                    long j2 = coreTextFieldSemanticsModifierNode.u.b;
                    int i = TextRange.c;
                    if (iIntValue != ((int) (j2 >> 32)) || iIntValue2 != ((int) (j2 & 4294967295L))) {
                        if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > coreTextFieldSemanticsModifierNode.u.f2127a.e.length()) {
                            TextFieldSelectionManager textFieldSelectionManager = coreTextFieldSemanticsModifierNode.A;
                            textFieldSelectionManager.s(false);
                            textFieldSelectionManager.q(HandleState.d);
                        } else {
                            if (zBooleanValue || iIntValue == iIntValue2) {
                                TextFieldSelectionManager textFieldSelectionManager2 = coreTextFieldSemanticsModifierNode.A;
                                textFieldSelectionManager2.s(false);
                                textFieldSelectionManager2.q(HandleState.d);
                            } else {
                                coreTextFieldSemanticsModifierNode.A.h(true);
                            }
                            coreTextFieldSemanticsModifierNode.v.v.invoke(new TextFieldValue(coreTextFieldSemanticsModifierNode.u.f2127a, TextRangeKt.a(iIntValue, iIntValue2), (TextRange) null));
                            z3 = true;
                        }
                    }
                }
                return Boolean.valueOf(z3);
            }
        }));
        int i = this.B.e;
        Function0<Boolean> function0 = new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.h;
                coreTextFieldSemanticsModifierNode.v.w.invoke(new ImeAction(coreTextFieldSemanticsModifierNode.B.e));
                return Boolean.TRUE;
            }
        };
        semanticsPropertyReceiver.b(SemanticsProperties.F, new ImeAction(i));
        semanticsPropertyReceiver.b(SemanticsActions.o, new AccessibilityAction(null, function0));
        SemanticsPropertiesKt.h(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SoftwareKeyboardController softwareKeyboardController;
                CoreTextFieldSemanticsModifierNode coreTextFieldSemanticsModifierNode = this.h;
                LegacyTextFieldState legacyTextFieldState = coreTextFieldSemanticsModifierNode.v;
                FocusRequester focusRequester = coreTextFieldSemanticsModifierNode.C;
                boolean z3 = coreTextFieldSemanticsModifierNode.w;
                if (!legacyTextFieldState.b()) {
                    FocusRequester.d(focusRequester);
                } else if (!z3 && (softwareKeyboardController = legacyTextFieldState.c) != null) {
                    softwareKeyboardController.a();
                }
                return Boolean.TRUE;
            }
        });
        SemanticsPropertiesKt.i(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.h.A.h(true);
                return Boolean.TRUE;
            }
        });
        if (!TextRange.c(this.u.b) && !z) {
            semanticsPropertyReceiver.b(SemanticsActions.p, new AccessibilityAction(null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$9
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.h.A.d(true);
                    return Boolean.TRUE;
                }
            }));
            if (this.x && !this.w) {
                semanticsPropertyReceiver.b(SemanticsActions.q, new AccessibilityAction(null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$10
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.h.A.f();
                        return Boolean.TRUE;
                    }
                }));
            }
        }
        if (!this.x || this.w) {
            return;
        }
        semanticsPropertyReceiver.b(SemanticsActions.r, new AccessibilityAction(null, new Function0<Boolean>() { // from class: androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifierNode$applySemantics$11
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.h.A.o();
                return Boolean.TRUE;
            }
        }));
    }
}
