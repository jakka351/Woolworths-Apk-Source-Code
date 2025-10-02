package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public class MismatchedInputException extends JsonMappingException {
    public MismatchedInputException(JsonParser jsonParser, String str, Object obj) {
        super(jsonParser, str);
        Annotation[] annotationArr = ClassUtil.f14330a;
    }
}
