package com.fasterxml.jackson.databind.module;

import com.auth0.jwt.impl.ClaimsSerializer;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public class SimpleModule extends Module implements Serializable {
    public static final AtomicInteger h = new AtomicInteger(1);
    public final String d;
    public final Version e;
    public SimpleSerializers f = null;
    public SimpleDeserializers g = null;

    public SimpleModule() {
        String name;
        if (getClass() == SimpleModule.class) {
            name = "SimpleModule-" + h.getAndIncrement();
        } else {
            name = getClass().getName();
        }
        this.d = name;
        this.e = Version.j;
    }

    @Override // com.fasterxml.jackson.databind.Module
    public final String a() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.databind.Module
    public final Object b() {
        return getClass() == SimpleModule.class ? this.d : super.b();
    }

    @Override // com.fasterxml.jackson.databind.Module
    public final void c(Module.SetupContext setupContext) {
        SimpleSerializers simpleSerializers = this.f;
        if (simpleSerializers != null) {
            setupContext.a(simpleSerializers);
        }
        SimpleDeserializers simpleDeserializers = this.g;
        if (simpleDeserializers != null) {
            setupContext.b(simpleDeserializers);
        }
    }

    @Override // com.fasterxml.jackson.databind.Module
    public final Version d() {
        return this.e;
    }

    public final void e(Class cls, StdDeserializer stdDeserializer) {
        if (this.g == null) {
            SimpleDeserializers simpleDeserializers = new SimpleDeserializers();
            simpleDeserializers.d = null;
            simpleDeserializers.e = false;
            this.g = simpleDeserializers;
        }
        SimpleDeserializers simpleDeserializers2 = this.g;
        simpleDeserializers2.getClass();
        ClassKey classKey = new ClassKey(cls);
        if (simpleDeserializers2.d == null) {
            simpleDeserializers2.d = new HashMap();
        }
        simpleDeserializers2.d.put(classKey, stdDeserializer);
        if (cls == Enum.class) {
            simpleDeserializers2.e = true;
        }
    }

    public final void f(Class cls, ClaimsSerializer claimsSerializer) {
        if (this.f == null) {
            SimpleSerializers simpleSerializers = new SimpleSerializers();
            simpleSerializers.d = null;
            simpleSerializers.e = null;
            simpleSerializers.f = false;
            this.f = simpleSerializers;
        }
        SimpleSerializers simpleSerializers2 = this.f;
        simpleSerializers2.getClass();
        ClassKey classKey = new ClassKey(cls);
        if (cls.isInterface()) {
            if (simpleSerializers2.e == null) {
                simpleSerializers2.e = new HashMap();
            }
            simpleSerializers2.e.put(classKey, claimsSerializer);
        } else {
            if (simpleSerializers2.d == null) {
                simpleSerializers2.d = new HashMap();
            }
            simpleSerializers2.d.put(classKey, claimsSerializer);
            if (cls == Enum.class) {
                simpleSerializers2.f = true;
            }
        }
    }
}
