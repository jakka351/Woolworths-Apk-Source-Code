package com.google.gson;

import io.jsonwebtoken.JwtParser;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class FieldNamingPolicy implements FieldNamingStrategy {
    public static final FieldNamingPolicy d;
    public static final FieldNamingPolicy e;
    public static final /* synthetic */ FieldNamingPolicy[] f;

    static {
        FieldNamingPolicy fieldNamingPolicy = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.1
            @Override // com.google.gson.FieldNamingStrategy
            public final String a(Field field) {
                return field.getName();
            }
        };
        d = fieldNamingPolicy;
        FieldNamingPolicy fieldNamingPolicy2 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.2
            @Override // com.google.gson.FieldNamingStrategy
            public final String a(Field field) {
                return FieldNamingPolicy.c(field.getName());
            }
        };
        FieldNamingPolicy fieldNamingPolicy3 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.3
            @Override // com.google.gson.FieldNamingStrategy
            public final String a(Field field) {
                return FieldNamingPolicy.c(FieldNamingPolicy.b(field.getName(), ' '));
            }
        };
        FieldNamingPolicy fieldNamingPolicy4 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.4
            @Override // com.google.gson.FieldNamingStrategy
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        FieldNamingPolicy fieldNamingPolicy5 = new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.5
            @Override // com.google.gson.FieldNamingStrategy
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        e = fieldNamingPolicy5;
        f = new FieldNamingPolicy[]{fieldNamingPolicy, fieldNamingPolicy2, fieldNamingPolicy3, fieldNamingPolicy4, fieldNamingPolicy5, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.6
            @Override // com.google.gson.FieldNamingStrategy
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new FieldNamingPolicy() { // from class: com.google.gson.FieldNamingPolicy.7
            @Override // com.google.gson.FieldNamingStrategy
            public final String a(Field field) {
                return FieldNamingPolicy.b(field.getName(), JwtParser.SEPARATOR_CHAR).toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static String b(String str, char c) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(c);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static String c(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = str.charAt(i);
            if (!Character.isLetter(cCharAt)) {
                i++;
            } else if (!Character.isUpperCase(cCharAt)) {
                char upperCase = Character.toUpperCase(cCharAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static FieldNamingPolicy valueOf(String str) {
        return (FieldNamingPolicy) Enum.valueOf(FieldNamingPolicy.class, str);
    }

    public static FieldNamingPolicy[] values() {
        return (FieldNamingPolicy[]) f.clone();
    }
}
