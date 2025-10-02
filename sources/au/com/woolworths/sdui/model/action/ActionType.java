package au.com.woolworths.sdui.model.action;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/model/action/ActionType;", "", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActionType {
    public static final ActionType d;
    public static final ActionType e;
    public static final /* synthetic */ ActionType[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        ActionType actionType = new ActionType("APP_LOCAL", 0);
        d = actionType;
        ActionType actionType2 = new ActionType("LINK", 1);
        e = actionType2;
        ActionType[] actionTypeArr = {actionType, actionType2};
        f = actionTypeArr;
        g = EnumEntriesKt.a(actionTypeArr);
    }

    public static ActionType valueOf(String str) {
        return (ActionType) Enum.valueOf(ActionType.class, str);
    }

    public static ActionType[] values() {
        return (ActionType[]) f.clone();
    }
}
