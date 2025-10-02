package com.dynatrace.android.agent.conf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Deprecated
/* loaded from: classes.dex */
public final class AgentMode {
    public static final AgentMode d;
    public static final /* synthetic */ AgentMode[] e;

    /* JADX INFO: Fake field, exist only in values array */
    AgentMode EF0;

    static {
        AgentMode agentMode = new AgentMode("APP_MON", 0);
        AgentMode agentMode2 = new AgentMode("SAAS", 1);
        d = agentMode2;
        e = new AgentMode[]{agentMode, agentMode2};
    }

    public static AgentMode valueOf(String str) {
        return (AgentMode) Enum.valueOf(AgentMode.class, str);
    }

    public static AgentMode[] values() {
        return (AgentMode[]) e.clone();
    }
}
