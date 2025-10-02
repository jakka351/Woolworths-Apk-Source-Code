package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;

/* loaded from: classes4.dex */
public abstract class Java7Handlers {

    /* renamed from: a, reason: collision with root package name */
    public static final Java7Handlers f14266a;

    static {
        Java7Handlers java7Handlers;
        try {
            java7Handlers = (Java7Handlers) ClassUtil.h(Java7HandlersImpl.class, false);
        } catch (Throwable unused) {
            java7Handlers = null;
        }
        f14266a = java7Handlers;
    }

    public abstract NioPathDeserializer a(Class cls);

    public abstract JsonSerializer b();
}
