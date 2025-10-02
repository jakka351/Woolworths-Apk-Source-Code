package io.noties.markwon;

/* loaded from: classes7.dex */
public interface MarkwonSpansFactory {

    public interface Builder {
        Builder a(Class cls, SpanFactory spanFactory);

        Builder b(Class cls, SpanFactory spanFactory);
    }

    SpanFactory a(Class cls);
}
