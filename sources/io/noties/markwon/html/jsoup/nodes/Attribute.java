package io.noties.markwon.html.jsoup.nodes;

import java.util.Map;

/* loaded from: classes7.dex */
public class Attribute implements Map.Entry<String, String>, Cloneable {
    public String d;
    public String e;
    public Attributes f;

    public final Object clone() {
        try {
            return (Attribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Attribute attribute = (Attribute) obj;
            String str = attribute.d;
            String str2 = this.d;
            if (str2 == null ? str != null : !str2.equals(str)) {
                return false;
            }
            String str3 = this.e;
            String str4 = attribute.e;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final String getKey() {
        return this.d;
    }

    @Override // java.util.Map.Entry
    public final String getValue() {
        return this.e;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final String setValue(String str) {
        String str2;
        String str3 = str;
        Attributes attributes = this.f;
        String str4 = this.d;
        int iB = attributes.b(str4);
        String str5 = "";
        if (iB != -1 && (str2 = attributes.f[iB]) != null) {
            str5 = str2;
        }
        int iB2 = attributes.b(str4);
        if (iB2 != -1) {
            attributes.f[iB2] = str3;
        }
        this.e = str3;
        return str5;
    }
}
