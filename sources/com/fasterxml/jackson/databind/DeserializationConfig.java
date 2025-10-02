package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.CoercionConfigs;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.DatatypeFeatures;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class DeserializationConfig extends MapperConfigBase<DeserializationFeature, DeserializationConfig> implements Serializable {
    public static final int q = MapperConfig.b(DeserializationFeature.class);
    public final JsonNodeFactory n;
    public final CoercionConfigs o;
    public final int p;

    public DeserializationConfig(BaseSettings baseSettings, StdSubtypeResolver stdSubtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, CoercionConfigs coercionConfigs, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, stdSubtypeResolver, simpleMixInResolver, rootNameLookup, configOverrides, datatypeFeatures);
        this.p = q;
        this.n = JsonNodeFactory.d;
        this.o = coercionConfigs;
    }

    public final MapperConfigBase p(long j) {
        return new DeserializationConfig(this, j, this.p);
    }

    public final BeanDescription q(JavaType javaType) {
        return this.e.e.c(this, javaType, this);
    }

    public final boolean r(DeserializationFeature deserializationFeature) {
        return (deserializationFeature.e & this.p) != 0;
    }

    public DeserializationConfig(DeserializationConfig deserializationConfig, long j, int i) {
        super(deserializationConfig, j);
        this.p = i;
        this.n = deserializationConfig.n;
        this.o = deserializationConfig.o;
    }
}
