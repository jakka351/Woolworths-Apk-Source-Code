package org.commonmark.parser;

import java.util.Objects;
import org.commonmark.node.SourceSpan;

/* loaded from: classes8.dex */
public class SourceLine {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f26860a;
    public final SourceSpan b;

    public SourceLine(CharSequence charSequence, SourceSpan sourceSpan) {
        Objects.requireNonNull(charSequence, "content must not be null");
        this.f26860a = charSequence;
        this.b = sourceSpan;
    }

    public final SourceLine a(int i, int i2) {
        int i3;
        CharSequence charSequenceSubSequence = this.f26860a.subSequence(i, i2);
        SourceSpan sourceSpan = this.b;
        return new SourceLine(charSequenceSubSequence, (sourceSpan == null || (i3 = i2 - i) == 0) ? null : new SourceSpan(sourceSpan.f26856a, sourceSpan.b + i, sourceSpan.c + i, i3));
    }
}
