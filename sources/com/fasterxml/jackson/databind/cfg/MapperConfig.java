package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import java.io.Serializable;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public abstract class MapperConfig<T extends MapperConfig<T>> implements ClassIntrospector.MixInResolver, Serializable {
    public final long d;
    public final BaseSettings e;

    static {
        JsonInclude.Value value = JsonInclude.Value.h;
        JsonFormat.Value value2 = JsonFormat.Value.k;
    }

    public MapperConfig(BaseSettings baseSettings, long j) {
        this.e = baseSettings;
        this.d = j;
    }

    public static int b(Class cls) {
        int iA = 0;
        for (Object obj : (Enum[]) cls.getEnumConstants()) {
            ConfigFeature configFeature = (ConfigFeature) obj;
            if (configFeature.b()) {
                iA |= configFeature.a();
            }
        }
        return iA;
    }

    public final JavaType c(Class cls) {
        return this.e.d.k(cls);
    }

    public final AnnotationIntrospector d() {
        return m(MapperFeature.USE_ANNOTATIONS) ? this.e.f : NopAnnotationIntrospector.d;
    }

    public abstract ConfigOverride e(Class cls);

    public abstract JsonInclude.Value f(Class cls, Class cls2);

    public abstract Boolean g();

    public abstract JsonFormat.Value h(Class cls);

    public abstract JsonInclude.Value i(Class cls);

    public abstract JsonSetter.Value j();

    public final TimeZone k() {
        this.e.getClass();
        return BaseSettings.k;
    }

    public final BeanDescription l(Class cls) {
        return this.e.e.a(this, c(cls), this);
    }

    public final boolean m(MapperFeature mapperFeature) {
        return (this.d & mapperFeature.e) != 0;
    }

    public MapperConfig(MapperConfigBase mapperConfigBase, long j) {
        this.e = mapperConfigBase.e;
        this.d = j;
    }
}
