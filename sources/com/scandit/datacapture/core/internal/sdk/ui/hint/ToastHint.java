package com.scandit.datacapture.core.internal.sdk.ui.hint;

import com.scandit.datacapture.core.internal.module.ui.NativeHintStyle;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHint;
import com.scandit.datacapture.core.internal.module.ui.NativeToastHintStyle;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u001c\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eB$\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010 B\u0014\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u001d\u0010!J\u0010\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0004R\u0011\u0010\u001a\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019\u0088\u0001\u0014\u0092\u0001\u00020\u000fø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/hint/ToastHint;", "", "", "toString-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;)I", "hashCode", "other", "", "equals-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;Ljava/lang/Object;)Z", "equals", "Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "a", "Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "getNative", "()Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "native", "getText-impl", TextBundle.TEXT_ENTRY, "Lcom/scandit/datacapture/core/internal/module/ui/NativeHintStyle;", "getHintStyle-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;)Lcom/scandit/datacapture/core/internal/module/ui/NativeHintStyle;", "hintStyle", "Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHintStyle;", "style", "constructor-impl", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHintStyle;Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "tag", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHintStyle;Ljava/lang/String;Ljava/lang/String;)Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;)Lcom/scandit/datacapture/core/internal/module/ui/NativeToastHint;", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
@JvmInline
/* loaded from: classes6.dex */
public final class ToastHint {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NativeToastHint native;

    private /* synthetic */ ToastHint(NativeToastHint nativeToastHint) {
        this.native = nativeToastHint;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ToastHint m327boximpl(NativeToastHint nativeToastHint) {
        return new ToastHint(nativeToastHint);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static NativeToastHint m328constructorimpl(@NotNull NativeToastHint nativeToastHint) {
        Intrinsics.h(nativeToastHint, "native");
        return nativeToastHint;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m331equalsimpl(NativeToastHint nativeToastHint, Object obj) {
        return (obj instanceof ToastHint) && Intrinsics.c(nativeToastHint, ((ToastHint) obj).m337unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m332equalsimpl0(NativeToastHint nativeToastHint, NativeToastHint nativeToastHint2) {
        return Intrinsics.c(nativeToastHint, nativeToastHint2);
    }

    @NotNull
    /* renamed from: getHintStyle-impl, reason: not valid java name */
    public static final NativeHintStyle m333getHintStyleimpl(NativeToastHint nativeToastHint) {
        NativeHintStyle hintStyle = nativeToastHint.getHintStyle();
        Intrinsics.g(hintStyle, "native.hintStyle");
        return hintStyle;
    }

    @NotNull
    /* renamed from: getText-impl, reason: not valid java name */
    public static final String m334getTextimpl(NativeToastHint nativeToastHint) {
        String text = nativeToastHint.getText();
        Intrinsics.g(text, "native.text");
        return text;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m335hashCodeimpl(NativeToastHint nativeToastHint) {
        return nativeToastHint.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m336toStringimpl(NativeToastHint nativeToastHint) {
        return "ToastHint(native=" + nativeToastHint + ')';
    }

    public boolean equals(Object obj) {
        return m331equalsimpl(this.native, obj);
    }

    @NotNull
    public final NativeToastHint getNative() {
        return this.native;
    }

    public int hashCode() {
        return m335hashCodeimpl(this.native);
    }

    public String toString() {
        return m336toStringimpl(this.native);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ NativeToastHint m337unboximpl() {
        return this.native;
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static NativeToastHint m329constructorimpl(@NotNull NativeToastHintStyle style, @NotNull String text) {
        Intrinsics.h(style, "style");
        Intrinsics.h(text, "text");
        NativeToastHint nativeToastHintCreate = NativeToastHint.create(style, text, "");
        Intrinsics.g(nativeToastHintCreate, "create(\n            styl…\n            \"\"\n        )");
        return m328constructorimpl(nativeToastHintCreate);
    }

    @NotNull
    /* renamed from: constructor-impl, reason: not valid java name */
    public static NativeToastHint m330constructorimpl(@NotNull NativeToastHintStyle style, @NotNull String text, @NotNull String tag) {
        Intrinsics.h(style, "style");
        Intrinsics.h(text, "text");
        Intrinsics.h(tag, "tag");
        NativeToastHint nativeToastHintCreate = NativeToastHint.create(style, text, tag);
        Intrinsics.g(nativeToastHintCreate, "create(\n            styl…            tag\n        )");
        return m328constructorimpl(nativeToastHintCreate);
    }
}
