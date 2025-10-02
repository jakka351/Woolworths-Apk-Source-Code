package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.InternalNodeMapper;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class BaseJsonNode extends JsonNode implements Serializable {

    /* renamed from: com.fasterxml.jackson.databind.node.BaseJsonNode$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14297a;

        static {
            int[] iArr = new int[JsonNode.OverwriteMode.values().length];
            f14297a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14297a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14297a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14297a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.fasterxml.jackson.core.TreeNode
    public JsonParser.NumberType b() {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.JsonSerializable
    public abstract void h(JsonGenerator jsonGenerator, SerializerProvider serializerProvider);

    public String toString() throws JsonProcessingException {
        try {
            ObjectWriter objectWriter = InternalNodeMapper.b;
            InternalNodeMapper.WrapperForSerializer wrapperForSerializer = new InternalNodeMapper.WrapperForSerializer(this);
            objectWriter.getClass();
            SegmentedStringWriter segmentedStringWriter = new SegmentedStringWriter(objectWriter.g.b());
            try {
                objectWriter.a(objectWriter.b(segmentedStringWriter), wrapperForSerializer);
                TextBuffer textBuffer = segmentedStringWriter.d;
                String strG = textBuffer.g();
                textBuffer.o();
                return strG;
            } catch (JsonProcessingException e) {
                throw e;
            } catch (IOException e2) {
                throw JsonMappingException.g(e2);
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        }
    }

    public Object writeReplace() {
        try {
            byte[] bArrB = InternalNodeMapper.b(this);
            NodeSerialization nodeSerialization = new NodeSerialization();
            nodeSerialization.d = bArrB;
            return nodeSerialization;
        } catch (IOException e) {
            throw new IllegalArgumentException("Failed to JDK serialize `" + getClass().getSimpleName() + "` value: " + e.getMessage(), e);
        }
    }
}
