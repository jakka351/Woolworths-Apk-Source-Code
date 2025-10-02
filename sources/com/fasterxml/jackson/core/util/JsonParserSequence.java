package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class JsonParserSequence extends JsonParserDelegate {
    public final JsonParser[] g;
    public int h;
    public boolean i;

    public JsonParserSequence(JsonParser[] jsonParserArr) {
        this.f = jsonParserArr[0];
        this.i = false;
        this.g = jsonParserArr;
        this.h = 1;
    }

    public static JsonParserSequence Y1(TokenBuffer.Parser parser, JsonParser jsonParser) {
        if (!(jsonParser instanceof JsonParserSequence)) {
            return new JsonParserSequence(new JsonParser[]{parser, jsonParser});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(parser);
        if (jsonParser instanceof JsonParserSequence) {
            ((JsonParserSequence) jsonParser).W1(arrayList);
        } else {
            arrayList.add(jsonParser);
        }
        return new JsonParserSequence((JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonToken N1() {
        JsonToken jsonTokenN1;
        JsonParser jsonParser = this.f;
        if (jsonParser != null) {
            if (this.i) {
                this.i = false;
                return jsonParser.e();
            }
            JsonToken jsonTokenN12 = jsonParser.N1();
            if (jsonTokenN12 != null) {
                return jsonTokenN12;
            }
            do {
                int i = this.h;
                JsonParser[] jsonParserArr = this.g;
                if (i < jsonParserArr.length) {
                    this.h = i + 1;
                    JsonParser jsonParser2 = jsonParserArr[i];
                    this.f = jsonParser2;
                    jsonTokenN1 = jsonParser2.N1();
                }
            } while (jsonTokenN1 == null);
            return jsonTokenN1;
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser
    public final JsonParser V1() {
        if (this.f.e() == JsonToken.START_OBJECT || this.f.e() == JsonToken.START_ARRAY) {
            int i = 1;
            while (true) {
                JsonToken jsonTokenN1 = N1();
                if (jsonTokenN1 == null) {
                    break;
                }
                if (!jsonTokenN1.h) {
                    if (jsonTokenN1.i && i - 1 == 0) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        return this;
    }

    public final void W1(ArrayList arrayList) {
        JsonParser[] jsonParserArr = this.g;
        int length = jsonParserArr.length;
        for (int i = this.h - 1; i < length; i++) {
            JsonParser jsonParser = jsonParserArr[i];
            if (jsonParser instanceof JsonParserSequence) {
                ((JsonParserSequence) jsonParser).W1(arrayList);
            } else {
                arrayList.add(jsonParser);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.util.JsonParserDelegate, com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            this.f.close();
            int i = this.h;
            JsonParser[] jsonParserArr = this.g;
            if (i >= jsonParserArr.length) {
                return;
            }
            this.h = i + 1;
            this.f = jsonParserArr[i];
        }
    }
}
