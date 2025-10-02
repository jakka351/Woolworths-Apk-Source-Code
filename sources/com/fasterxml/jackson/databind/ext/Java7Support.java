package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.util.ClassUtil;

/* loaded from: classes4.dex */
public abstract class Java7Support {

    /* renamed from: a, reason: collision with root package name */
    public static final Java7Support f14267a;

    static {
        Java7Support java7Support;
        try {
            java7Support = (Java7Support) ClassUtil.h(Java7SupportImpl.class, false);
        } catch (Throwable unused) {
            java7Support = null;
        }
        f14267a = java7Support;
    }

    public abstract PropertyName a(AnnotatedParameter annotatedParameter);

    public abstract Boolean b(AnnotatedMember annotatedMember);

    public abstract Boolean c(Annotated annotated);
}
