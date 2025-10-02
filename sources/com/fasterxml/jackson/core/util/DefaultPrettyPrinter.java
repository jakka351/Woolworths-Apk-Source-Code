package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class DefaultPrettyPrinter implements PrettyPrinter, Instantiatable<DefaultPrettyPrinter>, Serializable {
    public static final SerializedString k = new SerializedString(" ");
    public final FixedSpaceIndenter d;
    public final Indenter e;
    public final SerializableString f;
    public final boolean g;
    public transient int h;
    public final Separators i;
    public final String j;

    public static class FixedSpaceIndenter extends NopIndenter {
        public static final FixedSpaceIndenter d = new FixedSpaceIndenter();

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public final void a(JsonGenerator jsonGenerator, int i) {
            jsonGenerator.G0(' ');
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public final boolean isInline() {
            return true;
        }
    }

    public interface Indenter {
        void a(JsonGenerator jsonGenerator, int i);

        boolean isInline();
    }

    public static class NopIndenter implements Indenter, Serializable {
        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public void a(JsonGenerator jsonGenerator, int i) {
        }

        @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
        public boolean isInline() {
            return !(this instanceof DefaultIndenter);
        }
    }

    public DefaultPrettyPrinter() {
        this.d = FixedSpaceIndenter.d;
        this.e = DefaultIndenter.g;
        this.g = true;
        this.f = k;
        this.i = PrettyPrinter.r3;
        this.j = " : ";
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void a(JsonGeneratorImpl jsonGeneratorImpl, int i) {
        this.d.getClass();
        if (i > 0) {
            jsonGeneratorImpl.G0(' ');
        } else {
            jsonGeneratorImpl.G0(' ');
        }
        jsonGeneratorImpl.G0(']');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void b(JsonGeneratorImpl jsonGeneratorImpl) {
        SerializableString serializableString = this.f;
        if (serializableString != null) {
            jsonGeneratorImpl.H0(serializableString);
        }
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void c(JsonGenerator jsonGenerator) {
        this.e.a(jsonGenerator, this.h);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void d(JsonGeneratorImpl jsonGeneratorImpl, int i) {
        Indenter indenter = this.e;
        if (!indenter.isInline()) {
            this.h--;
        }
        if (i > 0) {
            indenter.a(jsonGeneratorImpl, this.h);
        } else {
            jsonGeneratorImpl.G0(' ');
        }
        jsonGeneratorImpl.G0('}');
    }

    @Override // com.fasterxml.jackson.core.util.Instantiatable
    public final DefaultPrettyPrinter e() {
        if (getClass() == DefaultPrettyPrinter.class) {
            return new DefaultPrettyPrinter(this);
        }
        throw new IllegalStateException("Failed `createInstance()`: " + getClass().getName() + " does not override method; it has to");
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void f(JsonGeneratorImpl jsonGeneratorImpl) {
        this.i.getClass();
        jsonGeneratorImpl.G0(',');
        this.e.a(jsonGeneratorImpl, this.h);
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void g(JsonGeneratorImpl jsonGeneratorImpl) {
        this.d.getClass();
        jsonGeneratorImpl.G0('[');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void h(JsonGeneratorImpl jsonGeneratorImpl) {
        this.i.getClass();
        jsonGeneratorImpl.G0(',');
        this.d.getClass();
        jsonGeneratorImpl.G0(' ');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void i(JsonGeneratorImpl jsonGeneratorImpl) {
        this.d.getClass();
        jsonGeneratorImpl.G0(' ');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void j(JsonGeneratorImpl jsonGeneratorImpl) {
        jsonGeneratorImpl.G0('{');
        if (this.e.isInline()) {
            return;
        }
        this.h++;
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void k(JsonGeneratorImpl jsonGeneratorImpl) {
        if (this.g) {
            jsonGeneratorImpl.O0(this.j);
        } else {
            this.i.getClass();
            jsonGeneratorImpl.G0(':');
        }
    }

    public DefaultPrettyPrinter(DefaultPrettyPrinter defaultPrettyPrinter) {
        SerializableString serializableString = defaultPrettyPrinter.f;
        this.d = FixedSpaceIndenter.d;
        this.e = DefaultIndenter.g;
        this.g = true;
        this.d = defaultPrettyPrinter.d;
        this.e = defaultPrettyPrinter.e;
        this.g = defaultPrettyPrinter.g;
        this.h = defaultPrettyPrinter.h;
        this.i = defaultPrettyPrinter.i;
        this.j = defaultPrettyPrinter.j;
        this.f = serializableString;
    }
}
