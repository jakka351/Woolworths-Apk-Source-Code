package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class SerializationConfig extends MapperConfigBase<SerializationFeature, SerializationConfig> implements Serializable {
    public static final DefaultPrettyPrinter p = new DefaultPrettyPrinter();
    public static final int q = MapperConfig.b(SerializationFeature.class);
    public final PrettyPrinter n;
    public final int o;

    public SerializationConfig(BaseSettings baseSettings, StdSubtypeResolver stdSubtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, stdSubtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, datatypeFeatures);
        this.o = q;
        this.n = p;
    }

    public final MapperConfigBase p(long j) {
        return new SerializationConfig(this, j, this.o);
    }

    public final void q(JsonGeneratorImpl jsonGeneratorImpl) {
        int i = SerializationFeature.INDENT_OUTPUT.e;
        int i2 = this.o;
        if ((i & i2) != 0 && jsonGeneratorImpl.d == null) {
            PrettyPrinter prettyPrinterE = this.n;
            if (prettyPrinterE instanceof Instantiatable) {
                prettyPrinterE = ((Instantiatable) prettyPrinterE).e();
            }
            if (prettyPrinterE != null) {
                jsonGeneratorImpl.d = prettyPrinterE;
            }
        }
        boolean z = (SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.e & i2) != 0;
        if (z) {
            int i3 = z ? JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.e : 0;
            int i4 = i3;
            int i5 = jsonGeneratorImpl.f;
            int i6 = (i4 & i3) | ((~i4) & i5);
            int i7 = i5 ^ i6;
            if (i7 != 0) {
                jsonGeneratorImpl.f = i6;
                jsonGeneratorImpl.Y1(i6, i7);
            }
        }
    }

    public final boolean r(SerializationFeature serializationFeature) {
        return (serializationFeature.e & this.o) != 0;
    }

    public SerializationConfig(SerializationConfig serializationConfig, long j, int i) {
        super(serializationConfig, j);
        this.o = i;
        this.n = serializationConfig.n;
    }
}
