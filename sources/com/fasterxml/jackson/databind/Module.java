package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.ser.Serializers;

/* loaded from: classes4.dex */
public abstract class Module implements Versioned {

    public interface SetupContext {
        void a(Serializers serializers);

        void b(Deserializers deserializers);
    }

    public abstract String a();

    public Object b() {
        return getClass().getName();
    }

    public abstract void c(SetupContext setupContext);

    public abstract Version d();
}
