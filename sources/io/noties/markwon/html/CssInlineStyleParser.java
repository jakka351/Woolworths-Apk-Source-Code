package io.noties.markwon.html;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes7.dex */
public abstract class CssInlineStyleParser {

    public static class Impl extends CssInlineStyleParser {

        public static class CssIterable implements Iterable<CssProperty> {

            public class CssIterator implements Iterator<CssProperty> {
                public final CssProperty d = new CssProperty();
                public final StringBuilder e = new StringBuilder();
                public final int f;
                public int g;

                public CssIterator() {
                    CssIterable.this.getClass();
                    throw null;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    CssProperty cssProperty = this.d;
                    cssProperty.f24206a = "";
                    cssProperty.b = "";
                    this.e.setLength(0);
                    if (this.g >= this.f) {
                        return (TextUtils.isEmpty(cssProperty.f24206a) || TextUtils.isEmpty(cssProperty.b)) ? false : true;
                    }
                    throw null;
                }

                @Override // java.util.Iterator
                public final CssProperty next() {
                    CssProperty cssProperty = this.d;
                    String str = cssProperty.f24206a;
                    String str2 = cssProperty.b;
                    if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                        throw new NoSuchElementException();
                    }
                    return cssProperty;
                }
            }

            @Override // java.lang.Iterable
            public final Iterator<CssProperty> iterator() {
                return new CssIterator();
            }
        }
    }
}
