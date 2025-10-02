package com.fasterxml.jackson.databind;

import io.jsonwebtoken.JwtParser;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class PropertyNamingStrategy implements Serializable {

    @Deprecated
    public static class KebabCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public final String e(String str) {
            return PropertyNamingStrategyBase.f(str, '-');
        }
    }

    @Deprecated
    public static class LowerCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public final String e(String str) {
            return str.toLowerCase();
        }
    }

    @Deprecated
    public static class LowerCaseWithUnderscoresStrategy extends SnakeCaseStrategy {
    }

    @Deprecated
    public static class LowerDotCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public final String e(String str) {
            return PropertyNamingStrategyBase.f(str, JwtParser.SEPARATOR_CHAR);
        }
    }

    @Deprecated
    public static class PascalCaseStrategy extends UpperCamelCaseStrategy {
    }

    @Deprecated
    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy {
        public static String f(String str, char c) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb = new StringBuilder((length >> 1) + length);
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                char lowerCase = Character.toLowerCase(cCharAt);
                if (lowerCase == cCharAt) {
                    if (i > 1) {
                        sb.insert(sb.length() - 1, c);
                    }
                    i = 0;
                } else {
                    if (i == 0 && i2 > 0) {
                        sb.append(c);
                    }
                    i++;
                }
                sb.append(lowerCase);
            }
            return sb.toString();
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public final String a(String str) {
            return e(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public final String b(String str) {
            return e(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public final String c(String str) {
            return e(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public final String d(String str) {
            return e(str);
        }

        public abstract String e(String str);
    }

    @Deprecated
    public static class SnakeCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public final String e(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb = new StringBuilder(length * 2);
            int i = 0;
            boolean z = false;
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (i2 > 0 || cCharAt != '_') {
                    if (Character.isUpperCase(cCharAt)) {
                        if (!z && i > 0 && sb.charAt(i - 1) != '_') {
                            sb.append('_');
                            i++;
                        }
                        cCharAt = Character.toLowerCase(cCharAt);
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(cCharAt);
                    i++;
                }
            }
            return i > 0 ? sb.toString() : str;
        }
    }

    @Deprecated
    public static class UpperCamelCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public final String e(String str) {
            char cCharAt;
            char upperCase;
            if (str == null || str.isEmpty() || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(0, upperCase);
            return sb.toString();
        }
    }

    public String a(String str) {
        return str;
    }

    public String b(String str) {
        return str;
    }

    public String c(String str) {
        return str;
    }

    public String d(String str) {
        return str;
    }
}
