package com.google.firebase.sessions;

import com.google.firebase.encoders.json.NumberedEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionState;", "Lcom/google/firebase/encoders/json/NumberedEnum;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DataCollectionState implements NumberedEnum {
    public static final DataCollectionState e;
    public static final DataCollectionState f;
    public static final DataCollectionState g;
    public static final /* synthetic */ DataCollectionState[] h;
    public static final /* synthetic */ EnumEntries i;
    public final int d;

    static {
        DataCollectionState dataCollectionState = new DataCollectionState("COLLECTION_UNKNOWN", 0, 0);
        DataCollectionState dataCollectionState2 = new DataCollectionState("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
        e = dataCollectionState2;
        DataCollectionState dataCollectionState3 = new DataCollectionState("COLLECTION_ENABLED", 2, 2);
        f = dataCollectionState3;
        DataCollectionState dataCollectionState4 = new DataCollectionState("COLLECTION_DISABLED", 3, 3);
        g = dataCollectionState4;
        DataCollectionState[] dataCollectionStateArr = {dataCollectionState, dataCollectionState2, dataCollectionState3, dataCollectionState4, new DataCollectionState("COLLECTION_DISABLED_REMOTE", 4, 4), new DataCollectionState("COLLECTION_SAMPLED", 5, 5)};
        h = dataCollectionStateArr;
        i = EnumEntriesKt.a(dataCollectionStateArr);
    }

    public DataCollectionState(String str, int i2, int i3) {
        this.d = i3;
    }

    public static DataCollectionState valueOf(String str) {
        return (DataCollectionState) Enum.valueOf(DataCollectionState.class, str);
    }

    public static DataCollectionState[] values() {
        return (DataCollectionState[]) h.clone();
    }

    @Override // com.google.firebase.encoders.json.NumberedEnum
    /* renamed from: g, reason: from getter */
    public final int getD() {
        return this.d;
    }
}
