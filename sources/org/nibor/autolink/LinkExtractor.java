package org.nibor.autolink;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.nibor.autolink.internal.EmailScanner;
import org.nibor.autolink.internal.LinkSpanImpl;
import org.nibor.autolink.internal.Scanner;
import org.nibor.autolink.internal.SpanImpl;
import org.nibor.autolink.internal.UrlScanner;
import org.nibor.autolink.internal.WwwScanner;

/* loaded from: classes8.dex */
public class LinkExtractor {

    /* renamed from: a, reason: collision with root package name */
    public final UrlScanner f26869a;
    public final WwwScanner b;
    public final EmailScanner c;

    /* renamed from: org.nibor.autolink.LinkExtractor$1, reason: invalid class name */
    class AnonymousClass1 implements Iterable<LinkSpan> {
        @Override // java.lang.Iterable
        public final Iterator<LinkSpan> iterator() {
            return null.new LinkIterator(null);
        }
    }

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public AbstractSet f26870a;
    }

    public class LinkIterator implements Iterator<LinkSpan> {
        public final CharSequence d;
        public LinkSpan e = null;
        public int f = 0;
        public int g = 0;

        public LinkIterator(CharSequence charSequence) {
            this.d = charSequence;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Scanner scanner;
            if (this.e == null) {
                CharSequence charSequence = this.d;
                int length = charSequence.length();
                while (true) {
                    int i = this.f;
                    if (i >= length) {
                        break;
                    }
                    char cCharAt = charSequence.charAt(i);
                    LinkExtractor linkExtractor = LinkExtractor.this;
                    if (cCharAt == ':') {
                        scanner = linkExtractor.f26869a;
                    } else if (cCharAt == '@') {
                        scanner = linkExtractor.c;
                    } else if (cCharAt != 'w') {
                        linkExtractor.getClass();
                        scanner = null;
                    } else {
                        scanner = linkExtractor.b;
                    }
                    if (scanner != null) {
                        LinkSpanImpl linkSpanImplA = scanner.a(charSequence, this.f, this.g);
                        if (linkSpanImplA != null) {
                            this.e = linkSpanImplA;
                            int i2 = linkSpanImplA.c;
                            this.f = i2;
                            this.g = i2;
                            break;
                        }
                        this.f++;
                    } else {
                        this.f++;
                    }
                }
            }
            return this.e != null;
        }

        @Override // java.util.Iterator
        public final LinkSpan next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            LinkSpan linkSpan = this.e;
            this.e = null;
            return linkSpan;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public class SpanIterator implements Iterator<Span> {
        public final CharSequence d;
        public final LinkIterator e;
        public int f = 0;
        public LinkSpan g = null;

        public SpanIterator(CharSequence charSequence, LinkIterator linkIterator) {
            this.d = charSequence;
            this.e = linkIterator;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f < this.d.length();
        }

        @Override // java.util.Iterator
        public final Span next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.g == null) {
                LinkIterator linkIterator = this.e;
                if (!linkIterator.hasNext()) {
                    int length = this.d.length();
                    SpanImpl spanImpl = new SpanImpl(this.f, length);
                    this.f = length;
                    return spanImpl;
                }
                if (!linkIterator.hasNext()) {
                    throw new NoSuchElementException();
                }
                LinkSpan linkSpan = linkIterator.e;
                linkIterator.e = null;
                this.g = linkSpan;
            }
            if (this.f < this.g.getBeginIndex()) {
                int beginIndex = this.g.getBeginIndex();
                SpanImpl spanImpl2 = new SpanImpl(this.f, beginIndex);
                this.f = beginIndex;
                return spanImpl2;
            }
            LinkSpan linkSpan2 = this.g;
            this.f = linkSpan2.getEndIndex();
            this.g = null;
            return linkSpan2;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("remove");
        }
    }

    public LinkExtractor(UrlScanner urlScanner, WwwScanner wwwScanner, EmailScanner emailScanner) {
        this.f26869a = urlScanner;
        this.b = wwwScanner;
        this.c = emailScanner;
    }

    public final Iterable a(final CharSequence charSequence) {
        if (charSequence != null) {
            return new Iterable<Span>() { // from class: org.nibor.autolink.LinkExtractor.2
                @Override // java.lang.Iterable
                public final Iterator<Span> iterator() {
                    LinkExtractor linkExtractor = LinkExtractor.this;
                    CharSequence charSequence2 = charSequence;
                    return new SpanIterator(charSequence2, linkExtractor.new LinkIterator(charSequence2));
                }
            };
        }
        throw new NullPointerException("input must not be null");
    }
}
