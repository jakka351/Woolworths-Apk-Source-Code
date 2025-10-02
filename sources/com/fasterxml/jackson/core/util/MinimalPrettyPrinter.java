package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class MinimalPrettyPrinter implements PrettyPrinter, Serializable {
    public String d;
    public Separators e;

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void a(JsonGeneratorImpl jsonGeneratorImpl, int i) {
        jsonGeneratorImpl.G0(']');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void b(JsonGeneratorImpl jsonGeneratorImpl) {
        String str = this.d;
        if (str != null) {
            jsonGeneratorImpl.O0(str);
        }
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void c(JsonGenerator jsonGenerator) {
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void d(JsonGeneratorImpl jsonGeneratorImpl, int i) {
        jsonGeneratorImpl.G0('}');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void f(JsonGeneratorImpl jsonGeneratorImpl) {
        this.e.getClass();
        jsonGeneratorImpl.G0(',');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void g(JsonGeneratorImpl jsonGeneratorImpl) {
        jsonGeneratorImpl.G0('[');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void h(JsonGeneratorImpl jsonGeneratorImpl) {
        this.e.getClass();
        jsonGeneratorImpl.G0(',');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void i(JsonGeneratorImpl jsonGeneratorImpl) {
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void j(JsonGeneratorImpl jsonGeneratorImpl) {
        jsonGeneratorImpl.G0('{');
    }

    @Override // com.fasterxml.jackson.core.PrettyPrinter
    public final void k(JsonGeneratorImpl jsonGeneratorImpl) {
        this.e.getClass();
        jsonGeneratorImpl.G0(':');
    }
}
