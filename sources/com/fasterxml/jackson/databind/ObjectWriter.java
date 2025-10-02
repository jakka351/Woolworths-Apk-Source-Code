package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.Versioned;
import com.fasterxml.jackson.core.io.ContentReference;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.fasterxml.jackson.databind.node.InternalNodeMapper;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Closeable;
import java.io.Serializable;
import java.io.Writer;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public class ObjectWriter implements Versioned, Serializable {
    public static final MinimalPrettyPrinter i;
    public final SerializationConfig d;
    public final DefaultSerializerProvider e;
    public final SerializerFactory f;
    public final JsonFactory g;
    public final GeneratorSettings h = GeneratorSettings.e;

    public static final class GeneratorSettings implements Serializable {
        public static final GeneratorSettings e = new GeneratorSettings(null);
        public final PrettyPrinter d;

        public GeneratorSettings(PrettyPrinter prettyPrinter) {
            this.d = prettyPrinter;
        }
    }

    public static final class Prefetch implements Serializable {
    }

    static {
        String str = PrettyPrinter.s3.d;
        MinimalPrettyPrinter minimalPrettyPrinter = new MinimalPrettyPrinter();
        minimalPrettyPrinter.d = str;
        minimalPrettyPrinter.e = PrettyPrinter.r3;
        i = minimalPrettyPrinter;
    }

    public ObjectWriter(ObjectMapper objectMapper, SerializationConfig serializationConfig) {
        this.d = serializationConfig;
        this.e = objectMapper.h;
        this.f = objectMapper.i;
        this.g = objectMapper.d;
    }

    public final void a(JsonGenerator jsonGenerator, Object obj) {
        SerializationFeature serializationFeature = SerializationFeature.CLOSE_CLOSEABLE;
        SerializationConfig serializationConfig = this.d;
        boolean zR = serializationConfig.r(serializationFeature);
        SerializerFactory serializerFactory = this.f;
        DefaultSerializerProvider defaultSerializerProvider = this.e;
        if (!zR || !(obj instanceof Closeable)) {
            try {
                defaultSerializerProvider.K(serializationConfig, serializerFactory).L((WriterBasedJsonGenerator) jsonGenerator, (InternalNodeMapper.WrapperForSerializer) obj);
                jsonGenerator.close();
                return;
            } catch (Exception e) {
                JsonGeneratorImpl jsonGeneratorImpl = (JsonGeneratorImpl) jsonGenerator;
                Annotation[] annotationArr = ClassUtil.f14330a;
                jsonGeneratorImpl.d2(JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
                try {
                    jsonGeneratorImpl.close();
                } catch (Exception e2) {
                    e.addSuppressed(e2);
                }
                ClassUtil.F(e);
                ClassUtil.G(e);
                throw new RuntimeException(e);
            }
        }
        Closeable closeable = (Closeable) obj;
        try {
            defaultSerializerProvider.K(serializationConfig, serializerFactory).L((WriterBasedJsonGenerator) jsonGenerator, (InternalNodeMapper.WrapperForSerializer) obj);
            try {
                closeable.close();
                jsonGenerator.close();
            } catch (Exception e3) {
                e = e3;
                closeable = null;
                ClassUtil.g((JsonGeneratorImpl) jsonGenerator, closeable, e);
                throw null;
            }
        } catch (Exception e4) {
            e = e4;
        }
    }

    public final JsonGenerator b(Writer writer) {
        JsonFactory jsonFactory = this.g;
        jsonFactory.getClass();
        IOContext iOContextA = jsonFactory.a(new ContentReference(-1, -1, writer, true), false);
        jsonFactory.getClass();
        WriterBasedJsonGenerator writerBasedJsonGenerator = new WriterBasedJsonGenerator(iOContextA, jsonFactory.h, jsonFactory.i, writer, jsonFactory.k);
        SerializableString serializableString = jsonFactory.j;
        if (serializableString != JsonFactory.o) {
            writerBasedJsonGenerator.m = serializableString;
        }
        this.d.q(writerBasedJsonGenerator);
        PrettyPrinter prettyPrinterE = this.h.d;
        if (prettyPrinterE != null) {
            if (prettyPrinterE == i) {
                writerBasedJsonGenerator.d = null;
            } else {
                if (prettyPrinterE instanceof Instantiatable) {
                    prettyPrinterE = ((Instantiatable) prettyPrinterE).e();
                }
                writerBasedJsonGenerator.d = prettyPrinterE;
            }
        }
        return writerBasedJsonGenerator;
    }
}
