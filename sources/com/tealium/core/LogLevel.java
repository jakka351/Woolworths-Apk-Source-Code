package com.tealium.core;

import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/LogLevel;", "", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum LogLevel {
    DEV(2),
    QA(4),
    PROD(7),
    SILENT(Integer.MAX_VALUE);

    public final int d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/LogLevel$Companion;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        public static LogLevel a(String str) {
            Locale locale = Locale.ROOT;
            String strM = androidx.constraintlayout.core.state.a.m(locale, "ROOT", str, locale, "this as java.lang.String).toLowerCase(locale)");
            int iHashCode = strM.hashCode();
            LogLevel logLevel = LogLevel.PROD;
            if (iHashCode != -902327211) {
                if (iHashCode != 3600) {
                    if (iHashCode != 99349) {
                        if (iHashCode == 3449687) {
                            strM.equals("prod");
                            return logLevel;
                        }
                    } else if (strM.equals("dev")) {
                        return LogLevel.DEV;
                    }
                } else if (strM.equals("qa")) {
                    return LogLevel.QA;
                }
            } else if (strM.equals("silent")) {
                return LogLevel.SILENT;
            }
            return logLevel;
        }
    }

    LogLevel(int i2) {
        this.d = i2;
    }
}
