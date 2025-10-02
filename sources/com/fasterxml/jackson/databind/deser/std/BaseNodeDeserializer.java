package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.BigIntegerNode;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.BooleanNode;
import com.fasterxml.jackson.databind.node.ContainerNode;
import com.fasterxml.jackson.databind.node.DoubleNode;
import com.fasterxml.jackson.databind.node.FloatNode;
import com.fasterxml.jackson.databind.node.IntNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.LongNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.ValueNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigInteger;
import java.util.Arrays;

/* loaded from: classes4.dex */
abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> implements ContextualDeserializer {
    public final Boolean g;
    public final boolean h;
    public final boolean i;

    public static final class ContainerStack {

        /* renamed from: a, reason: collision with root package name */
        public ContainerNode[] f14255a;
        public int b;
        public int c;

        public final void a(ContainerNode containerNode) {
            int i = this.b;
            int i2 = this.c;
            if (i < i2) {
                ContainerNode[] containerNodeArr = this.f14255a;
                this.b = i + 1;
                containerNodeArr[i] = containerNode;
                return;
            }
            if (this.f14255a == null) {
                this.c = 10;
                this.f14255a = new ContainerNode[10];
            } else {
                int iMin = Math.min(4000, Math.max(20, i2 >> 1)) + i2;
                this.c = iMin;
                this.f14255a = (ContainerNode[]) Arrays.copyOf(this.f14255a, iMin);
            }
            ContainerNode[] containerNodeArr2 = this.f14255a;
            int i3 = this.b;
            this.b = i3 + 1;
            containerNodeArr2[i3] = containerNode;
        }
    }

    public BaseNodeDeserializer(Class cls, Boolean bool) {
        super(cls);
        this.g = bool;
        this.h = true;
        this.i = true;
    }

    public static JsonNode t0(JsonParser jsonParser, DeserializationContext deserializationContext) {
        JsonNodeFactory jsonNodeFactory = deserializationContext.f.n;
        Object objC = jsonParser.C();
        if (objC == null) {
            jsonNodeFactory.getClass();
            return NullNode.d;
        }
        if (objC.getClass() == byte[].class) {
            byte[] bArr = (byte[]) objC;
            jsonNodeFactory.getClass();
            return bArr.length == 0 ? BinaryNode.e : new BinaryNode(bArr);
        }
        if (objC instanceof RawValue) {
            jsonNodeFactory.getClass();
            return new POJONode((RawValue) objC);
        }
        if (objC instanceof JsonNode) {
            return (JsonNode) objC;
        }
        jsonNodeFactory.getClass();
        return new POJONode(objC);
    }

    public static ValueNode u0(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        JsonParser.NumberType numberTypeT = jsonParser.T();
        if (numberTypeT == JsonParser.NumberType.i) {
            return jsonNodeFactory.a(jsonParser.x());
        }
        if (deserializationContext.N(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (!jsonParser.C1()) {
                return jsonNodeFactory.a(jsonParser.x());
            }
            double dA = jsonParser.A();
            jsonNodeFactory.getClass();
            return new DoubleNode(dA);
        }
        if (numberTypeT == JsonParser.NumberType.g) {
            float F = jsonParser.F();
            jsonNodeFactory.getClass();
            return new FloatNode(F);
        }
        double dA2 = jsonParser.A();
        jsonNodeFactory.getClass();
        return new DoubleNode(dA2);
    }

    public static ValueNode v0(JsonParser jsonParser, int i, JsonNodeFactory jsonNodeFactory) {
        NullNode nullNode = NullNode.d;
        if (i != 0) {
            if ((i & DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.e) != 0) {
                BigInteger bigIntegerG = jsonParser.g();
                jsonNodeFactory.getClass();
                return bigIntegerG == null ? nullNode : new BigIntegerNode(bigIntegerG);
            }
            long jR = jsonParser.R();
            jsonNodeFactory.getClass();
            return new LongNode(jR);
        }
        JsonParser.NumberType numberTypeT = jsonParser.T();
        if (numberTypeT == JsonParser.NumberType.d) {
            int iH = jsonParser.H();
            jsonNodeFactory.getClass();
            IntNode[] intNodeArr = IntNode.e;
            return (iH > 10 || iH < -1) ? new IntNode(iH) : IntNode.e[iH - (-1)];
        }
        if (numberTypeT == JsonParser.NumberType.e) {
            long jR2 = jsonParser.R();
            jsonNodeFactory.getClass();
            return new LongNode(jR2);
        }
        BigInteger bigIntegerG2 = jsonParser.g();
        jsonNodeFactory.getClass();
        return bigIntegerG2 == null ? nullNode : new BigIntegerNode(bigIntegerG2);
    }

    public static ValueNode w0(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) {
        int i = deserializationContext.g;
        int i2 = StdDeserializer.f & i;
        JsonParser.NumberType numberType = JsonParser.NumberType.e;
        JsonParser.NumberType numberTypeT = i2 != 0 ? (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.e & i) != 0 ? JsonParser.NumberType.f : (i & DeserializationFeature.USE_LONG_FOR_INTS.e) != 0 ? numberType : jsonParser.T() : jsonParser.T();
        if (numberTypeT == JsonParser.NumberType.d) {
            int iH = jsonParser.H();
            jsonNodeFactory.getClass();
            IntNode[] intNodeArr = IntNode.e;
            return (iH > 10 || iH < -1) ? new IntNode(iH) : IntNode.e[iH - (-1)];
        }
        if (numberTypeT == numberType) {
            long jR = jsonParser.R();
            jsonNodeFactory.getClass();
            return new LongNode(jR);
        }
        BigInteger bigIntegerG = jsonParser.g();
        jsonNodeFactory.getClass();
        return bigIntegerG == null ? NullNode.d : new BigIntegerNode(bigIntegerG);
    }

    public static void x0(DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) throws MismatchedInputException {
        if (deserializationContext.N(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            throw new MismatchedInputException(deserializationContext.i, String.format("Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str));
        }
        if (deserializationContext.M(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            if (jsonNode instanceof ArrayNode) {
                ((ArrayNode) jsonNode).C(jsonNode2);
                objectNode.C(str, jsonNode);
                return;
            }
            jsonNodeFactory.getClass();
            ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
            arrayNode.C(jsonNode);
            arrayNode.C(jsonNode2);
            objectNode.C(str, arrayNode);
        }
    }

    @Override // com.fasterxml.jackson.databind.deser.ContextualDeserializer
    public JsonDeserializer b(DeserializationContext deserializationContext, BeanProperty beanProperty) {
        DeserializationConfig deserializationConfig = deserializationContext.f;
        deserializationConfig.j.getClass();
        ConfigOverrides configOverrides = deserializationConfig.j;
        configOverrides.getClass();
        configOverrides.getClass();
        return (true == this.h && true == this.i) ? this : o0(true, true);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    public Object g(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) {
        return typeDeserializer.b(jsonParser, deserializationContext);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public boolean m() {
        return true;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public LogicalType n() {
        return LogicalType.h;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public Boolean o(DeserializationConfig deserializationConfig) {
        return this.g;
    }

    public abstract JsonDeserializer o0(boolean z, boolean z2);

    public final JsonNode p0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        JsonNodeFactory jsonNodeFactory = deserializationContext.f.n;
        int iF = jsonParser.f();
        if (iF == 2) {
            jsonNodeFactory.getClass();
            return new ObjectNode(jsonNodeFactory);
        }
        switch (iF) {
            case 6:
                String strK0 = jsonParser.k0();
                jsonNodeFactory.getClass();
                return JsonNodeFactory.b(strK0);
            case 7:
                return w0(jsonParser, deserializationContext, jsonNodeFactory);
            case 8:
                return u0(jsonParser, deserializationContext, jsonNodeFactory);
            case 9:
                jsonNodeFactory.getClass();
                return BooleanNode.e;
            case 10:
                jsonNodeFactory.getClass();
                return BooleanNode.f;
            case 11:
                jsonNodeFactory.getClass();
                return NullNode.d;
            case 12:
                return t0(jsonParser, deserializationContext);
            default:
                deserializationContext.E(jsonParser, this.d);
                throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q0(com.fasterxml.jackson.core.JsonParser r13, com.fasterxml.jackson.databind.DeserializationContext r14, com.fasterxml.jackson.databind.node.JsonNodeFactory r15, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.ContainerStack r16, com.fasterxml.jackson.databind.node.ContainerNode r17) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.q0(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.JsonNodeFactory, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$ContainerStack, com.fasterxml.jackson.databind.node.ContainerNode):void");
    }

    public final ObjectNode r0(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, ContainerStack containerStack) throws MismatchedInputException {
        JsonNode jsonNodeP0;
        ObjectNode objectNode;
        jsonNodeFactory.getClass();
        ObjectNode objectNode2 = new ObjectNode(jsonNodeFactory);
        String strD = jsonParser.d();
        ObjectNode objectNode3 = objectNode2;
        while (strD != null) {
            JsonToken jsonTokenN1 = jsonParser.N1();
            if (jsonTokenN1 == null) {
                jsonTokenN1 = JsonToken.NOT_AVAILABLE;
            }
            int i = jsonTokenN1.g;
            if (i == 1) {
                ObjectNode objectNode4 = new ObjectNode(jsonNodeFactory);
                q0(jsonParser, deserializationContext, jsonNodeFactory, containerStack, objectNode4);
                jsonNodeP0 = objectNode4;
            } else if (i != 3) {
                jsonNodeP0 = p0(jsonParser, deserializationContext);
            } else {
                ArrayNode arrayNode = new ArrayNode(jsonNodeFactory);
                q0(jsonParser, deserializationContext, jsonNodeFactory, containerStack, arrayNode);
                jsonNodeP0 = arrayNode;
            }
            JsonNode jsonNodeC = objectNode3.C(strD, jsonNodeP0);
            if (jsonNodeC != null) {
                objectNode = objectNode3;
                x0(deserializationContext, jsonNodeFactory, strD, objectNode, jsonNodeC, jsonNodeP0);
            } else {
                objectNode = objectNode3;
            }
            strD = jsonParser.J1();
            objectNode3 = objectNode;
        }
        return objectNode3;
    }

    public final JsonNode s0(JsonParser jsonParser, DeserializationContext deserializationContext) throws MismatchedInputException {
        int iF = jsonParser.f();
        if (iF == 2) {
            JsonNodeFactory jsonNodeFactory = deserializationContext.f.n;
            jsonNodeFactory.getClass();
            return new ObjectNode(jsonNodeFactory);
        }
        if (iF == 8) {
            return u0(jsonParser, deserializationContext, deserializationContext.f.n);
        }
        if (iF == 12) {
            return t0(jsonParser, deserializationContext);
        }
        deserializationContext.E(jsonParser, this.d);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.fasterxml.jackson.databind.JsonNode y0(com.fasterxml.jackson.core.JsonParser r12, com.fasterxml.jackson.databind.DeserializationContext r13, com.fasterxml.jackson.databind.node.ObjectNode r14, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.ContainerStack r15) throws com.fasterxml.jackson.databind.exc.MismatchedInputException {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer.y0(com.fasterxml.jackson.core.JsonParser, com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.node.ObjectNode, com.fasterxml.jackson.databind.deser.std.BaseNodeDeserializer$ContainerStack):com.fasterxml.jackson.databind.JsonNode");
    }

    public BaseNodeDeserializer(BaseNodeDeserializer baseNodeDeserializer, boolean z, boolean z2) {
        super(baseNodeDeserializer);
        this.g = baseNodeDeserializer.g;
        this.h = z;
        this.i = z2;
    }
}
