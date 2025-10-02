package androidx.compose.ui.semantics;

import androidx.camera.core.impl.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsPropertiesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f2022a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1);
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        f2022a = new KProperty[]{reflectionFactory.e(mutablePropertyReference1Impl), b.y(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1, reflectionFactory), b.y(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1, reflectionFactory)};
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsActions.f2016a;
    }

    public static final SemanticsPropertyKey a(String str) {
        SemanticsPropertyKey semanticsPropertyKey = new SemanticsPropertyKey(str);
        semanticsPropertyKey.c = true;
        return semanticsPropertyKey;
    }

    public static final SemanticsPropertyKey b(String str, Function2 function2) {
        return new SemanticsPropertyKey(str, true, function2);
    }

    public static final void c(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        semanticsPropertyReceiver.b(SemanticsProperties.i, Unit.f24250a);
    }

    public static void d(SemanticsPropertyReceiver semanticsPropertyReceiver, Function0 function0) {
        semanticsPropertyReceiver.b(SemanticsActions.u, new AccessibilityAction(null, function0));
    }

    public static void e(SemanticsPropertyReceiver semanticsPropertyReceiver, final Function0 function0) {
        semanticsPropertyReceiver.b(SemanticsActions.B, new AccessibilityAction(null, new Function1<List<Float>, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean z;
                List list = (List) obj;
                Float f = (Float) function0.invoke();
                if (f == null) {
                    z = false;
                } else {
                    list.add(f);
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }));
    }

    public static void f(SemanticsPropertyReceiver semanticsPropertyReceiver, Function1 function1) {
        semanticsPropertyReceiver.b(SemanticsActions.f2016a, new AccessibilityAction(null, function1));
    }

    public static final void g(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        semanticsPropertyReceiver.b(SemanticsProperties.o, Unit.f24250a);
    }

    public static final void h(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.f2016a;
        semanticsPropertyReceiver.b(SemanticsActions.b, new AccessibilityAction(str, function0));
    }

    public static final void i(SemanticsPropertyReceiver semanticsPropertyReceiver, String str, Function0 function0) {
        semanticsPropertyReceiver.b(SemanticsActions.c, new AccessibilityAction(str, function0));
    }

    public static final void j(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.l;
        KProperty kProperty = f2022a[5];
        Boolean bool = Boolean.TRUE;
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, bool);
    }

    public static final void k(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        semanticsPropertyReceiver.b(SemanticsProperties.f2020a, CollectionsKt.Q(str));
    }

    public static final void l(SemanticsPropertyReceiver semanticsPropertyReceiver, List list) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsActions.w;
        KProperty kProperty = f2022a[26];
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, list);
    }

    public static final void m(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.s;
        KProperty kProperty = f2022a[10];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, scrollAxisRange);
    }

    public static final void n(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.j;
        KProperty kProperty = f2022a[3];
        LiveRegionMode liveRegionMode = new LiveRegionMode(i);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, liveRegionMode);
    }

    public static final void o(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.d;
        KProperty kProperty = f2022a[2];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, str);
    }

    public static void p(SemanticsPropertyReceiver semanticsPropertyReceiver, Function1 function1) {
        semanticsPropertyReceiver.b(SemanticsActions.h, new AccessibilityAction(null, function1));
    }

    public static final void q(SemanticsPropertyReceiver semanticsPropertyReceiver, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.c;
        KProperty kProperty = f2022a[1];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, progressBarRangeInfo);
    }

    public static final void r(SemanticsPropertyReceiver semanticsPropertyReceiver, int i) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.w;
        KProperty kProperty = f2022a[12];
        Role role = new Role(i);
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, role);
    }

    public static final void s(SemanticsPropertyReceiver semanticsPropertyReceiver, boolean z) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.G;
        KProperty kProperty = f2022a[20];
        Boolean boolValueOf = Boolean.valueOf(z);
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, boolValueOf);
    }

    public static final void t(SemanticsPropertyReceiver semanticsPropertyReceiver, String str) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.b;
        KProperty kProperty = f2022a[0];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, str);
    }

    public static final void u(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.m;
        KProperty kProperty = f2022a[6];
        Boolean bool = Boolean.TRUE;
        semanticsPropertyKey.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey, bool);
    }

    public static final void v(SemanticsPropertyReceiver semanticsPropertyReceiver, float f) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.r;
        KProperty kProperty = f2022a[9];
        Float fValueOf = Float.valueOf(f);
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, fValueOf);
    }

    public static final void w(SemanticsPropertyReceiver semanticsPropertyReceiver, ScrollAxisRange scrollAxisRange) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.f2020a;
        SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.t;
        KProperty kProperty = f2022a[11];
        semanticsPropertyKey2.getClass();
        semanticsPropertyReceiver.b(semanticsPropertyKey2, scrollAxisRange);
    }
}
