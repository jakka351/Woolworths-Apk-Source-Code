package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.FormatFeature;
import com.fasterxml.jackson.core.JsonParser;

/* loaded from: classes4.dex */
public enum JsonReadFeature implements FormatFeature {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_JAVA_COMMENTS(JsonParser.Feature.ALLOW_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_YAML_COMMENTS(JsonParser.Feature.ALLOW_YAML_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_SINGLE_QUOTES(JsonParser.Feature.ALLOW_SINGLE_QUOTES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNQUOTED_FIELD_NAMES(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNESCAPED_CONTROL_CHARS(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(JsonParser.Feature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(JsonParser.Feature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(JsonParser.Feature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_NON_NUMERIC_NUMBERS(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_MISSING_VALUES(JsonParser.Feature.ALLOW_MISSING_VALUES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_TRAILING_COMMA(JsonParser.Feature.ALLOW_TRAILING_COMMA);

    public final int d = 1 << ordinal();
    public final JsonParser.Feature e;

    JsonReadFeature(JsonParser.Feature feature) {
        this.e = feature;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final int a() {
        return this.d;
    }

    @Override // com.fasterxml.jackson.core.util.JacksonFeature
    public final boolean b() {
        return false;
    }
}
