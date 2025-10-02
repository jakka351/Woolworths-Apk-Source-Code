package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.sql.Date;
import java.text.DateFormat;

@JacksonStdImpl
/* loaded from: classes4.dex */
public class SqlDateSerializer extends DateTimeSerializerBase<Date> {
    @Override // com.fasterxml.jackson.databind.JsonSerializer
    public final void f(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        Date date = (Date) obj;
        if (o(serializerProvider)) {
            jsonGenerator.i0(date == null ? 0L : date.getTime());
        } else if (this.g == null) {
            jsonGenerator.J1(date.toString());
        } else {
            p(date, jsonGenerator, serializerProvider);
        }
    }

    @Override // com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase
    public final DateTimeSerializerBase q(Boolean bool, DateFormat dateFormat) {
        return new SqlDateSerializer(Date.class, bool, dateFormat);
    }
}
