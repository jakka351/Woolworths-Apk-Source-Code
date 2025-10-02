package com.halilibo.richtext.commonmark;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/halilibo/richtext/commonmark/CommonMarkdownParseOptions;", "", "Companion", "richtext-commonmark_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonMarkdownParseOptions {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16241a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/halilibo/richtext/commonmark/CommonMarkdownParseOptions$Companion;", "", "richtext-commonmark_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public CommonMarkdownParseOptions(boolean z) {
        this.f16241a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CommonMarkdownParseOptions) {
            return this.f16241a == ((CommonMarkdownParseOptions) obj).f16241a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16241a);
    }

    public final String toString() {
        return a.n("CommonMarkdownParseOptions(autolink=", ")", this.f16241a);
    }
}
