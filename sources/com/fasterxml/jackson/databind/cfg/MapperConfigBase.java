package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.ConfigFeature;
import com.fasterxml.jackson.databind.cfg.ConfigOverride;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class MapperConfigBase<CFG extends ConfigFeature, T extends MapperConfigBase<CFG, T>> extends MapperConfig<T> implements Serializable {
    public static final long l;
    public static final long m;
    public final SimpleMixInResolver f;
    public final StdSubtypeResolver g;
    public final ContextAttributes h;
    public final RootNameLookup i;
    public final ConfigOverrides j;
    public final DatatypeFeatures k;

    static {
        long j = 0;
        for (MapperFeature mapperFeature : MapperFeature.values()) {
            if (mapperFeature.d) {
                j |= mapperFeature.e;
            }
        }
        l = j;
        m = MapperFeature.AUTO_DETECT_FIELDS.e | MapperFeature.AUTO_DETECT_GETTERS.e | MapperFeature.AUTO_DETECT_IS_GETTERS.e | MapperFeature.AUTO_DETECT_SETTERS.e | MapperFeature.AUTO_DETECT_CREATORS.e;
    }

    public MapperConfigBase(BaseSettings baseSettings, StdSubtypeResolver stdSubtypeResolver, SimpleMixInResolver simpleMixInResolver, RootNameLookup rootNameLookup, ConfigOverrides configOverrides, DatatypeFeatures datatypeFeatures) {
        super(baseSettings, l);
        this.f = simpleMixInResolver;
        this.g = stdSubtypeResolver;
        this.i = rootNameLookup;
        this.h = ContextAttributes.Impl.f;
        this.j = configOverrides;
        this.k = datatypeFeatures;
    }

    @Override // com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver
    public final Class a(Class cls) {
        return this.f.a(cls);
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final ConfigOverride e(Class cls) {
        this.j.getClass();
        return ConfigOverride.Empty.d;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value f(Class cls, Class cls2) {
        e(cls2);
        JsonInclude.Value valueI = i(cls);
        if (valueI == null) {
            return null;
        }
        return valueI;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final Boolean g() {
        this.j.getClass();
        return null;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonFormat.Value h(Class cls) {
        this.j.getClass();
        return JsonFormat.Value.k;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonInclude.Value i(Class cls) {
        e(cls);
        JsonInclude.Value value = this.j.d;
        if (value == null) {
            return null;
        }
        return value;
    }

    @Override // com.fasterxml.jackson.databind.cfg.MapperConfig
    public final JsonSetter.Value j() {
        return this.j.e;
    }

    public final JsonIgnoreProperties.Value n(Class cls, AnnotatedClass annotatedClass) {
        JsonIgnoreProperties.Value valueJ = d().J(annotatedClass);
        this.j.getClass();
        JsonIgnoreProperties.Value value = JsonIgnoreProperties.Value.i;
        if (valueJ == null) {
            return null;
        }
        return valueJ;
    }

    public final VisibilityChecker o(Class cls, AnnotatedClass annotatedClass) {
        VisibilityChecker.Std std;
        JsonAutoDetect.Visibility visibility;
        boolean zW = ClassUtil.w(cls);
        ConfigOverrides configOverrides = this.j;
        if (zW) {
            std = VisibilityChecker.Std.j;
        } else {
            std = configOverrides.f;
            long j = this.d;
            long j2 = m;
            if ((j & j2) != j2) {
                boolean zM = m(MapperFeature.AUTO_DETECT_FIELDS);
                JsonAutoDetect.Visibility visibility2 = JsonAutoDetect.Visibility.f;
                if (zM || std.h == visibility2) {
                    visibility = visibility2;
                } else {
                    visibility = visibility2;
                    std = new VisibilityChecker.Std(std.d, std.e, std.f, std.g, visibility2);
                }
                if (!m(MapperFeature.AUTO_DETECT_GETTERS) && std.d != visibility) {
                    JsonAutoDetect.Visibility visibility3 = visibility;
                    visibility = visibility3;
                    std = new VisibilityChecker.Std(visibility3, std.e, std.f, std.g, std.h);
                }
                if (!m(MapperFeature.AUTO_DETECT_IS_GETTERS) && std.e != visibility) {
                    std = new VisibilityChecker.Std(std.d, visibility, std.f, std.g, std.h);
                }
                if (!m(MapperFeature.AUTO_DETECT_SETTERS) && std.f != visibility) {
                    JsonAutoDetect.Visibility visibility4 = visibility;
                    visibility = visibility4;
                    std = new VisibilityChecker.Std(std.d, std.e, visibility4, std.g, std.h);
                }
                if (!m(MapperFeature.AUTO_DETECT_CREATORS) && std.g != visibility) {
                    std = new VisibilityChecker.Std(std.d, std.e, std.f, visibility, std.h);
                }
            }
        }
        VisibilityChecker visibilityCheckerB = d().b(annotatedClass, std);
        configOverrides.getClass();
        return visibilityCheckerB;
    }

    public MapperConfigBase(MapperConfigBase mapperConfigBase, long j) {
        super(mapperConfigBase, j);
        this.f = mapperConfigBase.f;
        this.g = mapperConfigBase.g;
        this.i = mapperConfigBase.i;
        this.h = mapperConfigBase.h;
        this.j = mapperConfigBase.j;
        this.k = mapperConfigBase.k;
    }
}
