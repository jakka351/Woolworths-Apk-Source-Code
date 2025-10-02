package com.fasterxml.jackson.databind.exc;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class PropertyBindingException extends MismatchedInputException {
    public final Collection h;
    public transient String i;

    public PropertyBindingException(JsonParser jsonParser, String str, JsonLocation jsonLocation, Collection collection) {
        super(jsonParser, str, jsonLocation);
        this.h = collection;
    }

    @Override // com.fasterxml.jackson.core.JsonProcessingException
    public final String d() {
        Collection collection;
        String str = this.i;
        if (str != null || (collection = this.h) == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(100);
        int size = collection.size();
        if (size != 1) {
            sb.append(" (");
            sb.append(size);
            sb.append(" known properties: ");
            Iterator it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                sb.append('\"');
                sb.append(String.valueOf(it.next()));
                sb.append('\"');
                if (sb.length() > 1000) {
                    sb.append(" [truncated]");
                    break;
                }
                if (it.hasNext()) {
                    sb.append(", ");
                }
            }
        } else {
            sb.append(" (one known property: \"");
            sb.append(String.valueOf(collection.iterator().next()));
            sb.append('\"');
        }
        sb.append("])");
        String string = sb.toString();
        this.i = string;
        return string;
    }
}
