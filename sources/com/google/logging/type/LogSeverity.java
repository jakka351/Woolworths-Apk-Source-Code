package com.google.logging.type;

import com.google.protobuf.Internal;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;

/* loaded from: classes6.dex */
public enum LogSeverity implements Internal.EnumLite {
    DEFAULT(0),
    DEBUG(100),
    INFO(200),
    NOTICE(nlnlnnn.xxx00780078x0078),
    WARNING(400),
    ERROR(500),
    CRITICAL(600),
    ALERT(700),
    EMERGENCY(800),
    UNRECOGNIZED(-1);

    public final int d;

    /* renamed from: com.google.logging.type.LogSeverity$1, reason: invalid class name */
    public class AnonymousClass1 implements Internal.EnumLiteMap<LogSeverity> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        public final Internal.EnumLite a(int i) {
            return LogSeverity.a(i);
        }
    }

    public static final class LogSeverityVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        public final boolean a(int i) {
            return LogSeverity.a(i) != null;
        }
    }

    LogSeverity(int i) {
        this.d = i;
    }

    public static LogSeverity a(int i) {
        if (i == 0) {
            return DEFAULT;
        }
        if (i == 100) {
            return DEBUG;
        }
        if (i == 200) {
            return INFO;
        }
        if (i == 300) {
            return NOTICE;
        }
        if (i == 400) {
            return WARNING;
        }
        if (i == 500) {
            return ERROR;
        }
        if (i == 600) {
            return CRITICAL;
        }
        if (i == 700) {
            return ALERT;
        }
        if (i != 800) {
            return null;
        }
        return EMERGENCY;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.d;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
