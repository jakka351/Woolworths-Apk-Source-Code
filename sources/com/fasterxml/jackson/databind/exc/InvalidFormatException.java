package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonParser;

/* loaded from: classes4.dex */
public class InvalidFormatException extends MismatchedInputException {
    public final Object h;

    public InvalidFormatException(JsonParser jsonParser, String str, Object obj) {
        super(jsonParser, str);
        this.h = obj;
    }
}
