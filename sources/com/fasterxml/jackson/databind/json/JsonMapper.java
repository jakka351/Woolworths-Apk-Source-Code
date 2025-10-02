package com.fasterxml.jackson.databind.json;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.cfg.MapperBuilder;

/* loaded from: classes4.dex */
public class JsonMapper extends ObjectMapper {

    public static class Builder extends MapperBuilder<JsonMapper, Builder> {
    }

    public JsonMapper() {
        super(new JsonFactory(), 0);
    }
}
