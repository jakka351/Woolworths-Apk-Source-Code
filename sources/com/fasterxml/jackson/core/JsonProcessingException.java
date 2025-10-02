package com.fasterxml.jackson.core;

import androidx.constraintlayout.core.state.a;

/* loaded from: classes4.dex */
public class JsonProcessingException extends JacksonException {
    public JsonLocation d;

    public JsonProcessingException(String str, JsonLocation jsonLocation, Throwable th) {
        super(str, th);
        this.d = jsonLocation;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final JsonLocation a() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public final String b() {
        return super.getMessage();
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public Object c() {
        return null;
    }

    public String d() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        JsonLocation jsonLocation = this.d;
        String strD = d();
        if (jsonLocation == null && strD == null) {
            return message;
        }
        StringBuilder sbO = a.o(100, message);
        if (strD != null) {
            sbO.append(strD);
        }
        if (jsonLocation != null) {
            sbO.append("\n at ");
            sbO.append(jsonLocation.toString());
        }
        return sbO.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
