package com.halilibo.richtext.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/ui/CodeBlockStyle;", "", "Companion", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CodeBlockStyle {
    public static final CodeBlockStyle e = new CodeBlockStyle(null, null, null, null);

    /* renamed from: a, reason: collision with root package name */
    public final TextStyle f16279a;
    public final Modifier b;
    public final TextUnit c;
    public final Boolean d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/ui/CodeBlockStyle$Companion;", "", "richtext-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CodeBlockStyle(TextStyle textStyle, Modifier modifier, TextUnit textUnit, Boolean bool) {
        this.f16279a = textStyle;
        this.b = modifier;
        this.c = textUnit;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeBlockStyle)) {
            return false;
        }
        CodeBlockStyle codeBlockStyle = (CodeBlockStyle) obj;
        return Intrinsics.c(this.f16279a, codeBlockStyle.f16279a) && Intrinsics.c(this.b, codeBlockStyle.b) && Intrinsics.c(this.c, codeBlockStyle.c) && Intrinsics.c(this.d, codeBlockStyle.d);
    }

    public final int hashCode() {
        TextStyle textStyle = this.f16279a;
        int iHashCode = (textStyle == null ? 0 : textStyle.hashCode()) * 31;
        Modifier modifier = this.b;
        int iHashCode2 = (iHashCode + (modifier == null ? 0 : modifier.hashCode())) * 31;
        TextUnit textUnit = this.c;
        int iHashCode3 = (iHashCode2 + (textUnit == null ? 0 : Long.hashCode(textUnit.f2204a))) * 31;
        Boolean bool = this.d;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "CodeBlockStyle(textStyle=" + this.f16279a + ", modifier=" + this.b + ", padding=" + this.c + ", wordWrap=" + this.d + ")";
    }
}
