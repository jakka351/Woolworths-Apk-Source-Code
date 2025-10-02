package io.noties.markwon;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class SpannableBuilder implements Appendable, CharSequence {
    public final ArrayDeque e = new ArrayDeque(8);
    public final StringBuilder d = new StringBuilder((CharSequence) "");

    public static class Span {

        /* renamed from: a, reason: collision with root package name */
        public final Object f24198a;
        public final int b;
        public final int c;
        public final int d;

        public Span(int i, int i2, int i3, Object obj) {
            this.f24198a = obj;
            this.b = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public static class SpannableStringBuilderReversed extends SpannableStringBuilder {
    }

    public SpannableBuilder() {
        b(0, "");
    }

    public static void c(SpannableBuilder spannableBuilder, Object obj, int i, int i2) {
        if (obj != null) {
            int length = spannableBuilder.d.length();
            if (i2 <= i || i < 0 || i2 > length) {
                return;
            }
            d(spannableBuilder, obj, i, i2);
        }
    }

    public static void d(SpannableBuilder spannableBuilder, Object obj, int i, int i2) {
        if (obj != null) {
            if (!obj.getClass().isArray()) {
                spannableBuilder.e.push(new Span(i, i2, 33, obj));
                return;
            }
            for (Object obj2 : (Object[]) obj) {
                d(spannableBuilder, obj2, i, i2);
            }
        }
    }

    public final void a(char c) {
        this.d.append(c);
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        this.d.append(c);
        return this;
    }

    public final void b(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof SpannableStringBuilderReversed;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                ArrayDeque arrayDeque = this.e;
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        arrayDeque.push(new Span(spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj), obj));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    arrayDeque.push(new Span(spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2), obj2));
                }
            }
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.d.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.d.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        List<Span> listUnmodifiableList;
        int i3;
        StringBuilder sb = this.d;
        int length = sb.length();
        if (i2 <= i || i < 0 || i2 > length) {
            listUnmodifiableList = Collections.EMPTY_LIST;
        } else {
            ArrayDeque arrayDeque = this.e;
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(arrayDeque);
                Collections.reverse(arrayList);
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(0);
                Iterator itDescendingIterator = arrayDeque.descendingIterator();
                while (itDescendingIterator.hasNext()) {
                    Span span = (Span) itDescendingIterator.next();
                    int i4 = span.b;
                    if ((i4 >= i && i4 < i2) || (((i3 = span.c) <= i2 && i3 > i) || (i4 < i && i3 > i2))) {
                        arrayList2.add(span);
                    }
                }
                listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            return sb.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb.subSequence(i, i2));
        int length2 = spannableStringBuilder.length();
        for (Span span2 : listUnmodifiableList) {
            int iMax = Math.max(0, span2.b - i);
            spannableStringBuilder.setSpan(span2.f24198a, iMax, Math.min(length2, (span2.c - span2.b) + iMax), span2.d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.d.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        CharSequence charSequenceSubSequence = charSequence.subSequence(i, i2);
        StringBuilder sb = this.d;
        b(sb.length(), charSequenceSubSequence);
        sb.append(charSequenceSubSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        StringBuilder sb = this.d;
        b(sb.length(), charSequence);
        sb.append(charSequence);
        return this;
    }
}
