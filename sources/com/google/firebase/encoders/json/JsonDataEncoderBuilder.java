package com.google.firebase.encoders.json;

import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {
    public static final b f;
    public static final b g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f15410a;
    public final HashMap b;
    public final a c;
    public boolean d;
    public static final a e = new a();
    public static final TimestampEncoder h = new TimestampEncoder();

    public static final class TimestampEncoder implements ValueEncoder<Date> {

        /* renamed from: a, reason: collision with root package name */
        public static final SimpleDateFormat f15412a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f15412a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        @Override // com.google.firebase.encoders.ValueEncoder
        public final void encode(Object obj, Object obj2) {
            ((ValueEncoderContext) obj2).add(f15412a.format((Date) obj));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.firebase.encoders.json.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.firebase.encoders.json.b] */
    static {
        final int i = 0;
        f = new ValueEncoder() { // from class: com.google.firebase.encoders.json.b
            @Override // com.google.firebase.encoders.ValueEncoder
            public final void encode(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        a aVar = JsonDataEncoderBuilder.e;
                        ((ValueEncoderContext) obj2).add((String) obj);
                        break;
                    default:
                        a aVar2 = JsonDataEncoderBuilder.e;
                        ((ValueEncoderContext) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new ValueEncoder() { // from class: com.google.firebase.encoders.json.b
            @Override // com.google.firebase.encoders.ValueEncoder
            public final void encode(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        a aVar = JsonDataEncoderBuilder.e;
                        ((ValueEncoderContext) obj2).add((String) obj);
                        break;
                    default:
                        a aVar2 = JsonDataEncoderBuilder.e;
                        ((ValueEncoderContext) obj2).add(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public JsonDataEncoderBuilder() {
        HashMap map = new HashMap();
        this.f15410a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final DataEncoder a() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            @Override // com.google.firebase.encoders.DataEncoder
            public final void a(Writer writer, Object obj) throws IOException {
                JsonDataEncoderBuilder jsonDataEncoderBuilder = JsonDataEncoderBuilder.this;
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, jsonDataEncoderBuilder.f15410a, jsonDataEncoderBuilder.b, jsonDataEncoderBuilder.c, jsonDataEncoderBuilder.d);
                jsonValueObjectEncoderContext.a(obj);
                jsonValueObjectEncoderContext.c();
                jsonValueObjectEncoderContext.b.flush();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public final String encode(Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    a(stringWriter, obj);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    public final EncoderConfig registerEncoder(Class cls, ObjectEncoder objectEncoder) {
        this.f15410a.put(cls, objectEncoder);
        this.b.remove(cls);
        return this;
    }
}
