package io.noties.markwon.html.jsoup.nodes;

import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class Attributes implements Iterable<Attribute>, Cloneable {
    public int d;
    public String[] e;
    public String[] f;

    public final int b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Object must not be null");
        }
        for (int i = 0; i < this.d; i++) {
            if (str.equals(this.e[i])) {
                return i;
            }
        }
        return -1;
    }

    public final Object clone() {
        try {
            Attributes attributes = (Attributes) super.clone();
            attributes.d = this.d;
            String[] strArr = this.e;
            int i = this.d;
            String[] strArr2 = new String[i];
            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i));
            this.e = strArr2;
            String[] strArr3 = this.f;
            int i2 = this.d;
            String[] strArr4 = new String[i2];
            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
            this.f = strArr4;
            return attributes;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Attributes attributes = (Attributes) obj;
        if (this.d == attributes.d && Arrays.equals(this.e, attributes.e)) {
            return Arrays.equals(this.f, attributes.f);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.d * 31) + Arrays.hashCode(this.e)) * 31) + Arrays.hashCode(this.f);
    }

    @Override // java.lang.Iterable
    public final Iterator<Attribute> iterator() {
        return new Iterator<Attribute>() { // from class: io.noties.markwon.html.jsoup.nodes.Attributes.1
            public int d = 0;

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.d < Attributes.this.d;
            }

            @Override // java.util.Iterator
            public final Attribute next() {
                Attributes attributes = Attributes.this;
                String[] strArr = attributes.f;
                int i = this.d;
                String str = strArr[i];
                String str2 = attributes.e[i];
                if (str == null) {
                    str = "";
                }
                Attribute attribute = new Attribute();
                if (str2 == null) {
                    throw new IllegalArgumentException("Object must not be null");
                }
                attribute.d = str2.trim();
                if (str2.length() == 0) {
                    throw new IllegalArgumentException("String must not be empty");
                }
                attribute.e = str;
                attribute.f = attributes;
                this.d++;
                return attribute;
            }

            @Override // java.util.Iterator
            public final void remove() {
                int i = this.d;
                int i2 = i - 1;
                this.d = i2;
                Attributes attributes = Attributes.this;
                int i3 = attributes.d;
                if (i2 >= i3) {
                    throw new IllegalArgumentException("Must be false");
                }
                int i4 = (i3 - i2) - 1;
                if (i4 > 0) {
                    String[] strArr = attributes.e;
                    System.arraycopy(strArr, i, strArr, i2, i4);
                    String[] strArr2 = attributes.f;
                    System.arraycopy(strArr2, i, strArr2, i2, i4);
                }
                int i5 = attributes.d - 1;
                attributes.d = i5;
                attributes.e[i5] = null;
                attributes.f[i5] = null;
            }
        };
    }
}
