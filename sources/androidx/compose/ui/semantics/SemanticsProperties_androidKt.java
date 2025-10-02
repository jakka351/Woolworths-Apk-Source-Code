package androidx.compose.ui.semantics;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SemanticsProperties_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f2023a = {Reflection.f24268a.e(new MutablePropertyReference1Impl(SemanticsProperties_androidKt.class, "testTagsAsResourceId", "getTestTagsAsResourceId(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1))};

    static {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsPropertiesAndroid.f2021a;
    }

    public static final void a(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertyKey semanticsPropertyKey = SemanticsPropertiesAndroid.f2021a;
        KProperty kProperty = f2023a[0];
        semanticsPropertyReceiver.b(semanticsPropertyKey, Boolean.TRUE);
    }
}
