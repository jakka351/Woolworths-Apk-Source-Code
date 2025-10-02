package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.json.JsonMapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class InternalNodeMapper {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonMapper f14298a;
    public static final ObjectWriter b;
    public static final ObjectReader c;

    public static final class IteratorStack {

        /* renamed from: a, reason: collision with root package name */
        public Iterator[] f14299a;
        public int b;
        public int c;

        public final void a(Iterator it) {
            int i = this.b;
            int i2 = this.c;
            if (i < i2) {
                Iterator[] itArr = this.f14299a;
                this.b = i + 1;
                itArr[i] = it;
                return;
            }
            if (this.f14299a == null) {
                this.c = 10;
                this.f14299a = new Iterator[10];
            } else {
                int iMin = Math.min(4000, Math.max(20, i2 >> 1)) + i2;
                this.c = iMin;
                this.f14299a = (Iterator[]) Arrays.copyOf(this.f14299a, iMin);
            }
            Iterator[] itArr2 = this.f14299a;
            int i3 = this.b;
            this.b = i3 + 1;
            itArr2[i3] = it;
        }
    }

    public static class WrapperForSerializer extends JsonSerializable.Base {
        public final BaseJsonNode d;
        public SerializerProvider e;

        public WrapperForSerializer(BaseJsonNode baseJsonNode) {
            this.d = baseJsonNode;
        }

        @Override // com.fasterxml.jackson.databind.JsonSerializable
        public final void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
            this.e = serializerProvider;
            BaseJsonNode baseJsonNode = this.d;
            if (baseJsonNode instanceof ObjectNode) {
                ((ObjectNode) baseJsonNode).e.size();
                jsonGenerator.y1(this);
                i(jsonGenerator, new IteratorStack(), baseJsonNode.u());
            } else {
                if (!(baseJsonNode instanceof ArrayNode)) {
                    baseJsonNode.h(jsonGenerator, serializerProvider);
                    return;
                }
                ArrayList arrayList = ((ArrayNode) baseJsonNode).e;
                jsonGenerator.a1(arrayList.size(), this);
                i(jsonGenerator, new IteratorStack(), arrayList.iterator());
            }
        }

        public final void i(JsonGenerator jsonGenerator, IteratorStack iteratorStack, Iterator it) {
            JsonNode jsonNode;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) next;
                        jsonGenerator.U((String) entry.getKey());
                        jsonNode = (JsonNode) entry.getValue();
                    } else {
                        jsonNode = (JsonNode) next;
                    }
                    if (jsonNode instanceof ObjectNode) {
                        iteratorStack.a(it);
                        it = jsonNode.u();
                        ((ObjectNode) jsonNode).e.size();
                        jsonGenerator.y1(jsonNode);
                    } else if (jsonNode instanceof ArrayNode) {
                        iteratorStack.a(it);
                        ArrayList arrayList = ((ArrayNode) jsonNode).e;
                        Iterator it2 = arrayList.iterator();
                        jsonGenerator.a1(arrayList.size(), jsonNode);
                        it = it2;
                    } else {
                        jsonNode.h(jsonGenerator, this.e);
                    }
                } else {
                    if (jsonGenerator.f().d()) {
                        jsonGenerator.F();
                    } else {
                        jsonGenerator.H();
                    }
                    int i = iteratorStack.b;
                    if (i == 0) {
                        it = null;
                    } else {
                        Iterator[] itArr = iteratorStack.f14299a;
                        int i2 = i - 1;
                        iteratorStack.b = i2;
                        it = itArr[i2];
                    }
                    if (it == null) {
                        return;
                    }
                }
            }
        }
    }

    static {
        JsonMapper jsonMapper = new JsonMapper();
        f14298a = jsonMapper;
        b = new ObjectWriter(jsonMapper, jsonMapper.g);
        PrettyPrinter prettyPrinter = jsonMapper.g.n;
        if (prettyPrinter == null) {
            prettyPrinter = ObjectWriter.i;
        }
        ObjectWriter.GeneratorSettings generatorSettings = ObjectWriter.GeneratorSettings.e;
        if (generatorSettings != (prettyPrinter == null ? generatorSettings : new ObjectWriter.GeneratorSettings(prettyPrinter))) {
        }
        c = jsonMapper.i(JsonNode.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b A[PHI: r22
  0x015b: PHI (r22v1 com.fasterxml.jackson.databind.DeserializationConfig) = 
  (r22v0 com.fasterxml.jackson.databind.DeserializationConfig)
  (r22v0 com.fasterxml.jackson.databind.DeserializationConfig)
  (r22v3 com.fasterxml.jackson.databind.DeserializationConfig)
  (r22v4 com.fasterxml.jackson.databind.DeserializationConfig)
 binds: [B:56:0x0115, B:62:0x0130, B:66:0x013a, B:42:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fasterxml.jackson.databind.JsonNode a(byte[] r30) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.InternalNodeMapper.a(byte[]):com.fasterxml.jackson.databind.JsonNode");
    }

    public static byte[] b(BaseJsonNode baseJsonNode) {
        byte[] bArr;
        JsonMapper jsonMapper = f14298a;
        jsonMapper.getClass();
        try {
            ByteArrayBuilder byteArrayBuilder = new ByteArrayBuilder(jsonMapper.d.b());
            try {
                jsonMapper.f(jsonMapper.h(byteArrayBuilder), baseJsonNode);
                byte[] bArrE = byteArrayBuilder.e();
                byteArrayBuilder.reset();
                BufferRecycler bufferRecycler = byteArrayBuilder.d;
                if (bufferRecycler != null && (bArr = byteArrayBuilder.g) != null) {
                    bufferRecycler.f14218a.set(2, bArr);
                    byteArrayBuilder.g = null;
                }
                return bArrE;
            } finally {
            }
        } catch (JsonProcessingException e) {
            throw e;
        } catch (IOException e2) {
            throw JsonMappingException.g(e2);
        }
    }
}
