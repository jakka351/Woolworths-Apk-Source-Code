package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHint;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHintAnchor;
import com.scandit.datacapture.core.internal.module.ui.NativeGuidanceHintStyle;
import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u00002\u00020\u0001B\u001c\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eB$\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010!B\u0014\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\"J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0004R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0014\u0092\u0001\u00020\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006#"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/GuidanceHint;", "", "", "toString-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;)I", "hashCode", "other", "", "equals-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;Ljava/lang/Object;)Z", "equals", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "a", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "getNative", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "native", "getText-impl", TextBundle.TEXT_ENTRY, "Lcom/scandit/datacapture/core/internal/module/ui/NativeHintStyle;", "getHintStyle-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;)Lcom/scandit/datacapture/core/internal/module/ui/NativeHintStyle;", "hintStyle", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintStyle;", "style", "constructor-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintStyle;Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintAnchor;", "anchor", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintStyle;Ljava/lang/String;Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHintAnchor;)Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;)Lcom/scandit/datacapture/core/internal/module/ui/NativeGuidanceHint;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@JvmInline
/* loaded from: classes6.dex */
public final class GuidanceHint {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeGuidanceHint native;

    private /* synthetic */ GuidanceHint(NativeGuidanceHint nativeGuidanceHint) {
        this.native = nativeGuidanceHint;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GuidanceHint m306boximpl(NativeGuidanceHint nativeGuidanceHint) {
        return new GuidanceHint(nativeGuidanceHint);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static NativeGuidanceHint m307constructorimpl(@NotNull NativeGuidanceHint nativeGuidanceHint) {
        Intrinsics.h(nativeGuidanceHint, "native");
        return nativeGuidanceHint;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m310equalsimpl(NativeGuidanceHint nativeGuidanceHint, Object obj) {
        return (obj instanceof GuidanceHint) && Intrinsics.c(nativeGuidanceHint, ((GuidanceHint) obj).m316unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m311equalsimpl0(NativeGuidanceHint nativeGuidanceHint, NativeGuidanceHint nativeGuidanceHint2) {
        return Intrinsics.c(nativeGuidanceHint, nativeGuidanceHint2);
    }

    @NotNull
    /* renamed from: getHintStyle-impl, reason: not valid java name */
    public static final NativeHintStyle m312getHintStyleimpl(NativeGuidanceHint nativeGuidanceHint) {
        NativeHintStyle hintStyle = nativeGuidanceHint.getHintStyle();
        Intrinsics.g(hintStyle, "native.hintStyle");
        return hintStyle;
    }

    @NotNull
    /* renamed from: getText-impl, reason: not valid java name */
    public static final String m313getTextimpl(NativeGuidanceHint nativeGuidanceHint) {
        String text = nativeGuidanceHint.getText();
        Intrinsics.g(text, "native.text");
        return text;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m314hashCodeimpl(NativeGuidanceHint nativeGuidanceHint) {
        return nativeGuidanceHint.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m315toStringimpl(NativeGuidanceHint nativeGuidanceHint) {
        return "GuidanceHint(native=" + nativeGuidanceHint + ')';
    }

    public boolean equals(Object obj) {
        return m310equalsimpl(this.native, obj);
    }

    @NotNull
    public final NativeGuidanceHint getNative() {
        return this.native;
    }

    public int hashCode() {
        return m314hashCodeimpl(this.native);
    }

    public String toString() {
        return m315toStringimpl(this.native);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ NativeGuidanceHint m316unboximpl() {
        return this.native;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static NativeGuidanceHint m308constructorimpl(@NotNull NativeGuidanceHintStyle style, @NotNull String text) {
        Intrinsics.h(style, "style");
        Intrinsics.h(text, "text");
        NativeGuidanceHint nativeGuidanceHintCreate = NativeGuidanceHint.create(style, text, NativeGuidanceHintAnchor.ABOVE_VIEW_FINDER);
        Intrinsics.g(nativeGuidanceHintCreate, "create(\n            styl…OVE_VIEW_FINDER\n        )");
        return m307constructorimpl(nativeGuidanceHintCreate);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static NativeGuidanceHint m309constructorimpl(@NotNull NativeGuidanceHintStyle style, @NotNull String text, @NotNull NativeGuidanceHintAnchor anchor) {
        Intrinsics.h(style, "style");
        Intrinsics.h(text, "text");
        Intrinsics.h(anchor, "anchor");
        NativeGuidanceHint nativeGuidanceHintCreate = NativeGuidanceHint.create(style, text, anchor);
        Intrinsics.g(nativeGuidanceHintCreate, "create(\n            styl…         anchor\n        )");
        return m307constructorimpl(nativeGuidanceHintCreate);
    }
}
