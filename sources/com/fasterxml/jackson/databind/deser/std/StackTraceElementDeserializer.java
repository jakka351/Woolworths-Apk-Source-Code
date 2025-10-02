package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;

/* loaded from: classes4.dex */
public class StackTraceElementDeserializer extends StdScalarDeserializer<StackTraceElement> {
    public static final /* synthetic */ int h = 0;
    public final JsonDeserializer g;

    public static final class Adapter {
    }

    public StackTraceElementDeserializer(JsonDeserializer jsonDeserializer) {
        super(StackTraceElement.class);
        this.g = jsonDeserializer;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final StackTraceElement e(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JsonToken jsonTokenE = jsonParser.e();
        if (jsonTokenE == JsonToken.START_OBJECT || jsonTokenE == JsonToken.FIELD_NAME) {
            JsonDeserializer jsonDeserializer = this.g;
            (jsonDeserializer == null ? (Adapter) deserializationContext.R(jsonParser, Adapter.class) : (Adapter) jsonDeserializer.e(jsonParser, deserializationContext)).getClass();
            return new StackTraceElement(null, null, null, 0);
        }
        if (jsonTokenE != JsonToken.START_ARRAY || !deserializationContext.N(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS)) {
            deserializationContext.E(jsonParser, this.d);
            throw null;
        }
        jsonParser.N1();
        StackTraceElement stackTraceElementE = e(jsonParser, deserializationContext);
        if (jsonParser.N1() == JsonToken.END_ARRAY) {
            return stackTraceElementE;
        }
        m0(deserializationContext);
        throw null;
    }
}
