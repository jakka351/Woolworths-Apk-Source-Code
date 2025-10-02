package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.DefaultAccessorNamingStrategy;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class BaseSettings implements Serializable {
    public static final TimeZone k = TimeZone.getTimeZone("UTC");
    public final TypeFactory d;
    public final ClassIntrospector e;
    public final JacksonAnnotationIntrospector f;
    public final DefaultAccessorNamingStrategy.Provider g;
    public final DateFormat h;
    public final Locale i;
    public final Base64Variant j;

    public BaseSettings(ClassIntrospector classIntrospector, JacksonAnnotationIntrospector jacksonAnnotationIntrospector, TypeFactory typeFactory, DateFormat dateFormat, Locale locale, Base64Variant base64Variant, DefaultAccessorNamingStrategy.Provider provider) {
        this.e = classIntrospector;
        this.f = jacksonAnnotationIntrospector;
        this.d = typeFactory;
        this.h = dateFormat;
        this.i = locale;
        this.j = base64Variant;
        this.g = provider;
    }
}
