package com.fasterxml.jackson.databind.ext;

import YU.a;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class OptionalHandlerFactory implements Serializable {
    public static final Class f;
    public static final Class g;
    public static final Java7Handlers h;
    public static final OptionalHandlerFactory i;
    public final HashMap d;
    public final HashMap e;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:13:0x0007
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:131)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:57)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    static {
        /*
            r0 = 0
            java.lang.Class<org.w3c.dom.Node> r1 = org.w3c.dom.Node.class
            java.lang.Class<org.w3c.dom.Document> r2 = org.w3c.dom.Document.class
            goto L8
        L6:
            r1 = r0
        L7:
            r2 = r0
        L8:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.f = r1
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.g = r2
            com.fasterxml.jackson.databind.ext.Java7Handlers r0 = com.fasterxml.jackson.databind.ext.Java7Handlers.f14266a     // Catch: java.lang.Throwable -> Le
        Le:
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.h = r0
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory r0 = new com.fasterxml.jackson.databind.ext.OptionalHandlerFactory
            r0.<init>()
            com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.ext.OptionalHandlerFactory.<clinit>():void");
    }

    public OptionalHandlerFactory() {
        HashMap map = new HashMap();
        this.d = map;
        map.put("java.sql.Date", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$SqlDateDeserializer");
        map.put("java.sql.Timestamp", "com.fasterxml.jackson.databind.deser.std.DateDeserializers$TimestampDeserializer");
        HashMap map2 = new HashMap();
        this.e = map2;
        map2.put("java.sql.Timestamp", DateSerializer.i);
        map2.put("java.sql.Date", "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer");
        map2.put("java.sql.Time", "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer");
        map2.put("java.sql.Blob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
        map2.put("javax.sql.rowset.serial.SerialBlob", "com.fasterxml.jackson.databind.ext.SqlBlobSerializer");
    }

    public static Object a(JavaType javaType, Class cls) {
        try {
            return ClassUtil.h(cls, false);
        } catch (Throwable th) {
            throw new IllegalStateException("Failed to create instance of `" + cls.getName() + "` for handling values of type " + ClassUtil.t(javaType) + ", problem: (" + th.getClass().getName() + ") " + th.getMessage());
        }
    }

    public static Object b(JavaType javaType, String str) {
        try {
            return a(javaType, Class.forName(str));
        } catch (Throwable th) {
            StringBuilder sbU = a.u("Failed to find class `", str, "` for handling values of type ");
            sbU.append(ClassUtil.t(javaType));
            sbU.append(", problem: (");
            sbU.append(th.getClass().getName());
            sbU.append(") ");
            sbU.append(th.getMessage());
            throw new IllegalStateException(sbU.toString());
        }
    }
}
