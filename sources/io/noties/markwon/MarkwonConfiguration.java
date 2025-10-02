package io.noties.markwon;

import io.noties.markwon.core.MarkwonTheme;
import io.noties.markwon.image.AsyncDrawableLoader;
import io.noties.markwon.image.ImageSizeResolverDef;
import io.noties.markwon.image.destination.ImageDestinationProcessor;
import io.noties.markwon.syntax.SyntaxHighlightNoOp;

/* loaded from: classes7.dex */
public class MarkwonConfiguration {

    /* renamed from: a, reason: collision with root package name */
    public final MarkwonTheme f24186a;
    public final AsyncDrawableLoader b;
    public final SyntaxHighlightNoOp c;
    public final LinkResolver d;
    public final ImageDestinationProcessor e;
    public final ImageSizeResolverDef f;
    public final MarkwonSpansFactory g;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public MarkwonTheme f24187a;
        public AsyncDrawableLoader b;
        public SyntaxHighlightNoOp c;
        public LinkResolver d;
        public ImageDestinationProcessor e;
        public ImageSizeResolverDef f;
        public MarkwonSpansFactory g;
    }

    public MarkwonConfiguration(Builder builder) {
        this.f24186a = builder.f24187a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.d;
        this.e = builder.e;
        this.f = builder.f;
        this.g = builder.g;
    }
}
