package com.fasterxml.jackson.databind.type;

import YU.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

/* loaded from: classes4.dex */
public class TypeParser implements Serializable {
    public final TypeFactory d;

    public static final class MyTokenizer extends StringTokenizer {

        /* renamed from: a, reason: collision with root package name */
        public final String f14327a;
        public int b;
        public String c;

        public MyTokenizer(String str) {
            super(str, "<,>", true);
            this.f14327a = str;
        }

        @Override // java.util.StringTokenizer
        public final boolean hasMoreTokens() {
            return this.c != null || super.hasMoreTokens();
        }

        @Override // java.util.StringTokenizer
        public final String nextToken() {
            String str = this.c;
            if (str != null) {
                this.c = null;
                return str;
            }
            String strNextToken = super.nextToken();
            this.b = strNextToken.length() + this.b;
            return strNextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this.d = typeFactory;
    }

    public static IllegalArgumentException a(MyTokenizer myTokenizer, String str) {
        String str2 = myTokenizer.f14327a;
        StringBuilder sbV = a.v("Failed to parse type '", str2, "' (remaining: '", str2.substring(myTokenizer.b), "'): ");
        sbV.append(str);
        return new IllegalArgumentException(sbV.toString());
    }

    public final JavaType b(MyTokenizer myTokenizer) {
        if (!myTokenizer.hasMoreTokens()) {
            throw a(myTokenizer, "Unexpected end-of-string");
        }
        String strNextToken = myTokenizer.nextToken();
        try {
            Class clsL = TypeFactory.l(strNextToken);
            boolean zHasMoreTokens = myTokenizer.hasMoreTokens();
            TypeFactory typeFactory = this.d;
            if (zHasMoreTokens) {
                String strNextToken2 = myTokenizer.nextToken();
                if ("<".equals(strNextToken2)) {
                    ArrayList arrayList = new ArrayList();
                    while (myTokenizer.hasMoreTokens()) {
                        arrayList.add(b(myTokenizer));
                        if (!myTokenizer.hasMoreTokens()) {
                            break;
                        }
                        String strNextToken3 = myTokenizer.nextToken();
                        if (">".equals(strNextToken3)) {
                            JavaType[] javaTypeArr = TypeBindings.i;
                            if (!arrayList.isEmpty()) {
                                javaTypeArr = (JavaType[]) arrayList.toArray(javaTypeArr);
                            }
                            return typeFactory.c(null, clsL, TypeBindings.c(clsL, javaTypeArr));
                        }
                        if (!",".equals(strNextToken3)) {
                            throw a(myTokenizer, "Unexpected token '" + strNextToken3 + "', expected ',' or '>')");
                        }
                    }
                    throw a(myTokenizer, "Unexpected end-of-string");
                }
                myTokenizer.c = strNextToken2;
            }
            return typeFactory.c(null, clsL, TypeBindings.j);
        } catch (Exception e) {
            ClassUtil.G(e);
            throw a(myTokenizer, "Cannot locate class '" + strNextToken + "', problem: " + e.getMessage());
        }
    }
}
