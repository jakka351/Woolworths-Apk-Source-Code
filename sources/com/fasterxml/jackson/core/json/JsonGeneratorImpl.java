package com.fasterxml.jackson.core.json;

import YU.a;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.base.GeneratorBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;

/* loaded from: classes4.dex */
public abstract class JsonGeneratorImpl extends GeneratorBase {
    public static final int[] p = CharTypes.j;
    public final IOContext j;
    public int[] k;
    public int l;
    public SerializableString m;
    public boolean n;
    public boolean o;

    public JsonGeneratorImpl(IOContext iOContext, int i, ObjectCodec objectCodec) {
        this.f = i;
        this.e = objectCodec;
        this.h = new JsonWriteContext(0, null, JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.b(i) ? new DupDetector(this) : null);
        this.g = JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.b(i);
        this.k = p;
        this.m = DefaultPrettyPrinter.k;
        this.j = iOContext;
        if (JsonGenerator.Feature.ESCAPE_NON_ASCII.b(i)) {
            this.l = 127;
        }
        this.o = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.b(i);
        this.n = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.b(i);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final void Y1(int i, int i2) {
        super.Y1(i, i2);
        this.n = !JsonGenerator.Feature.QUOTE_FIELD_NAMES.b(i);
        this.o = JsonGenerator.Feature.WRITE_HEX_UPPER_CASE.b(i);
    }

    @Override // com.fasterxml.jackson.core.base.GeneratorBase
    public final JsonGenerator d2(JsonGenerator.Feature feature) {
        super.d2(feature);
        if (feature == JsonGenerator.Feature.QUOTE_FIELD_NAMES) {
            this.n = true;
            return this;
        }
        if (feature == JsonGenerator.Feature.WRITE_HEX_UPPER_CASE) {
            this.o = false;
        }
        return this;
    }

    public final void e2(String str) throws JsonGenerationException {
        a(a.j("Can not ", str, ", expecting field name (context: ", this.h.h(), ")"));
        throw null;
    }

    public final void f2(int i, String str) throws JsonGenerationException {
        if (i == 0) {
            if (this.h.d()) {
                this.d.i(this);
                return;
            } else {
                if (this.h.e()) {
                    this.d.c(this);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            this.d.h(this);
            return;
        }
        if (i == 2) {
            this.d.k(this);
            return;
        }
        if (i == 3) {
            this.d.b(this);
        } else {
            if (i != 5) {
                VersionUtil.c();
                throw null;
            }
            e2(str);
            throw null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonGenerator
    public final void j(int i) {
        if (i < 0) {
            i = 0;
        }
        this.l = i;
    }
}
