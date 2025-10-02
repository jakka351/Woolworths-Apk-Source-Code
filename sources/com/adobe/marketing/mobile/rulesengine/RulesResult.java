package com.adobe.marketing.mobile.rulesengine;

/* loaded from: classes4.dex */
public class RulesResult {
    public static final RulesResult b = new RulesResult(0);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f13221a = false;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class FailureType {
        public static final /* synthetic */ FailureType[] d = {new FailureType("UNKNOWN", 0), new FailureType("CONDITION_FAILED", 1), new FailureType("TYPE_MISMATCHED", 2), new FailureType("MISSING_OPERATOR", 3), new FailureType("INVALID_OPERAND", 4)};

        /* JADX INFO: Fake field, exist only in values array */
        FailureType EF5;

        public static FailureType valueOf(String str) {
            return (FailureType) Enum.valueOf(FailureType.class, str);
        }

        public static FailureType[] values() {
            return (FailureType[]) d.clone();
        }
    }

    public RulesResult() {
    }

    public final boolean a() {
        return this.f13221a;
    }

    public RulesResult(int i) {
    }
}
