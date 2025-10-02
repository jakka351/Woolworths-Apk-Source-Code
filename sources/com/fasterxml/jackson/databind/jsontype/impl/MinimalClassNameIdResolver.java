package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;

/* loaded from: classes4.dex */
public class MinimalClassNameIdResolver extends ClassNameIdResolver {
    public final String d;
    public final String e;

    public MinimalClassNameIdResolver(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        String name = javaType.d.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            this.d = "";
            this.e = ".";
        } else {
            this.e = name.substring(0, iLastIndexOf + 1);
            this.d = name.substring(0, iLastIndexOf);
        }
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver, com.fasterxml.jackson.databind.jsontype.TypeIdResolver
    public final String a(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.e) ? name.substring(r0.length() - 1) : name;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.ClassNameIdResolver
    public final JavaType g(String str, DatabindContext databindContext) {
        if (str.startsWith(".")) {
            int length = str.length();
            String str2 = this.d;
            StringBuilder sb = new StringBuilder(str2.length() + length);
            if (str2.isEmpty()) {
                sb.append(str.substring(1));
            } else {
                sb.append(str2);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.g(str, databindContext);
    }
}
