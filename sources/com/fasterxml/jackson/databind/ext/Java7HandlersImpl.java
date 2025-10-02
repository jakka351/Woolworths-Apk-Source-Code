package com.fasterxml.jackson.databind.ext;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.nio.file.Path;

/* loaded from: classes4.dex */
public class Java7HandlersImpl extends Java7Handlers {
    @Override // com.fasterxml.jackson.databind.ext.Java7Handlers
    public final NioPathDeserializer a(Class cls) {
        if (cls == null) {
            return new NioPathDeserializer(Path.class);
        }
        return null;
    }

    @Override // com.fasterxml.jackson.databind.ext.Java7Handlers
    public final JsonSerializer b() {
        throw null;
    }
}
