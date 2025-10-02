package com.tealium.core.persistence;

import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/persistence/Serialization;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum Serialization {
    STRING(0, String.class),
    INT(1, Integer.TYPE),
    DOUBLE(2, Double.TYPE),
    LONG(3, Long.TYPE),
    BOOLEAN(4, Boolean.TYPE),
    STRING_ARRAY(5, String[].class),
    /* JADX INFO: Fake field, exist only in values array */
    INT_ARRAY(6, int[].class),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE_ARRAY(7, double[].class),
    /* JADX INFO: Fake field, exist only in values array */
    LONG_ARRAY(8, long[].class),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN_ARRAY(9, boolean[].class),
    JSON_OBJECT(10, JSONObject.class),
    /* JADX INFO: Fake field, exist only in values array */
    JSON_ARRAY(11, JSONArray.class);

    public final int d;
    public final Class e;

    Serialization(int i, Class cls) {
        this.d = i;
        this.e = cls;
    }
}
