package androidx.compose.ui.semantics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsConfigurationKt {
    public static final Object a(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey semanticsPropertyKey) {
        Object objE = semanticsConfiguration.d.e(semanticsPropertyKey);
        return objE == null ? SemanticsConfigurationKt$getOrNull$1.h.invoke() : objE;
    }
}
