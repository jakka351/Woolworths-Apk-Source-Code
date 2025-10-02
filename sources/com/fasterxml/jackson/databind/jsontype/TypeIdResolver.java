package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;

/* loaded from: classes4.dex */
public interface TypeIdResolver {
    String a(Object obj);

    String b();

    JavaType c(DeserializationContext deserializationContext, String str);

    String d(Class cls, Object obj);

    String e();
}
