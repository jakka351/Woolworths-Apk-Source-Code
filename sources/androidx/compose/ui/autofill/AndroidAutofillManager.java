package androidx.compose.ui.autofill;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.b;
import androidx.collection.MutableIntSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.autofill.ContentDataType;
import androidx.compose.ui.focus.FocusListener;
import androidx.compose.ui.focus.FocusTargetModifierNode;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsListener;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofillManager;", "Landroidx/compose/ui/autofill/AutofillManager;", "Landroidx/compose/ui/semantics/SemanticsListener;", "Landroidx/compose/ui/focus/FocusListener;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@RequiresApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AndroidAutofillManager extends AutofillManager implements SemanticsListener, FocusListener {

    /* renamed from: a, reason: collision with root package name */
    public final PlatformAutofillManagerImpl f1728a;
    public final SemanticsOwner b;
    public final AndroidComposeView c;
    public final RectManager d;
    public final String e;
    public final Rect f = new Rect();
    public final AutofillId g;
    public final MutableIntSet h;
    public boolean i;

    public AndroidAutofillManager(PlatformAutofillManagerImpl platformAutofillManagerImpl, SemanticsOwner semanticsOwner, AndroidComposeView androidComposeView, RectManager rectManager, String str) {
        this.f1728a = platformAutofillManagerImpl;
        this.b = semanticsOwner;
        this.c = androidComposeView;
        this.d = rectManager;
        this.e = str;
        androidComposeView.setImportantForAutofill(1);
        AutofillId autofillId = androidComposeView.getAutofillId();
        if (autofillId == null) {
            throw b.w("Required value was null.");
        }
        this.g = autofillId;
        this.h = new MutableIntSet();
    }

    @Override // androidx.compose.ui.semantics.SemanticsListener
    public final void a(LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        AnnotatedString annotatedString;
        AnnotatedString annotatedString2;
        SemanticsConfiguration semanticsConfigurationR = layoutNode.R();
        int i = layoutNode.e;
        String str = null;
        String str2 = (semanticsConfiguration == null || (annotatedString2 = (AnnotatedString) SemanticsConfigurationKt.a(semanticsConfiguration, SemanticsProperties.C)) == null) ? null : annotatedString2.e;
        if (semanticsConfigurationR != null && (annotatedString = (AnnotatedString) SemanticsConfigurationKt.a(semanticsConfigurationR, SemanticsProperties.C)) != null) {
            str = annotatedString.e;
        }
        boolean z = false;
        if (str2 != str) {
            AndroidComposeView androidComposeView = this.c;
            PlatformAutofillManagerImpl platformAutofillManagerImpl = this.f1728a;
            if (str2 == null) {
                platformAutofillManagerImpl.a(androidComposeView, i, true);
            } else if (str == null) {
                platformAutofillManagerImpl.a(androidComposeView, i, false);
            } else if (Intrinsics.c((ContentDataType) SemanticsConfigurationKt.a(semanticsConfigurationR, SemanticsProperties.q), ContentDataType.Companion.f1731a)) {
                platformAutofillManagerImpl.f1734a.notifyValueChanged(androidComposeView, i, AutofillApi26Helper.b(str.toString()));
            }
        }
        boolean z2 = semanticsConfiguration != null && semanticsConfiguration.d.b(SemanticsProperties.p);
        if (semanticsConfigurationR != null && semanticsConfigurationR.d.b(SemanticsProperties.p)) {
            z = true;
        }
        if (z2 != z) {
            MutableIntSet mutableIntSet = this.h;
            if (z) {
                mutableIntSet.b(i);
            } else {
                mutableIntSet.e(i);
            }
        }
    }

    @Override // androidx.compose.ui.focus.FocusListener
    public final void b(FocusTargetModifierNode focusTargetModifierNode, FocusTargetNode focusTargetNode) {
        LayoutNode layoutNodeG;
        SemanticsConfiguration semanticsConfigurationR;
        LayoutNode layoutNodeG2;
        SemanticsConfiguration semanticsConfigurationR2;
        if (focusTargetModifierNode != null && (layoutNodeG2 = DelegatableNodeKt.g(focusTargetModifierNode)) != null && (semanticsConfigurationR2 = layoutNodeG2.R()) != null && semanticsConfigurationR2.d.b(SemanticsActions.g)) {
            this.f1728a.f1734a.notifyViewExited(this.c, layoutNodeG2.e);
        }
        if (focusTargetNode == null || (layoutNodeG = DelegatableNodeKt.g(focusTargetNode)) == null || (semanticsConfigurationR = layoutNodeG.R()) == null || !semanticsConfigurationR.d.b(SemanticsActions.g)) {
            return;
        }
        final int i = layoutNodeG.e;
        this.d.f2026a.b(i, new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$onFocusChanged$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int iIntValue3 = ((Number) obj3).intValue();
                int iIntValue4 = ((Number) obj4).intValue();
                AndroidAutofillManager androidAutofillManager = this.h;
                PlatformAutofillManagerImpl platformAutofillManagerImpl = androidAutofillManager.f1728a;
                platformAutofillManagerImpl.f1734a.notifyViewEntered(androidAutofillManager.c, i, new Rect(iIntValue, iIntValue2, iIntValue3, iIntValue4));
                return Unit.f24250a;
            }
        });
    }

    public final void c(final LayoutNode layoutNode) {
        this.d.f2026a.b(layoutNode.e, new Function4<Integer, Integer, Integer, Integer, Unit>() { // from class: androidx.compose.ui.autofill.AndroidAutofillManager$requestAutofill$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                int iIntValue = ((Number) obj).intValue();
                int iIntValue2 = ((Number) obj2).intValue();
                int iIntValue3 = ((Number) obj3).intValue();
                int iIntValue4 = ((Number) obj4).intValue();
                AndroidAutofillManager androidAutofillManager = this.h;
                Rect rect = androidAutofillManager.f;
                rect.set(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                PlatformAutofillManagerImpl platformAutofillManagerImpl = androidAutofillManager.f1728a;
                platformAutofillManagerImpl.f1734a.requestAutofill(androidAutofillManager.c, layoutNode.e, rect);
                return Unit.f24250a;
            }
        });
    }
}
