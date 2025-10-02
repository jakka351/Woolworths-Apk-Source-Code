package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_ClientInfo;
import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class ClientInfo {

    @AutoValue.Builder
    /* loaded from: classes2.dex */
    public static abstract class Builder {
        public abstract ClientInfo a();

        public abstract Builder b(AndroidClientInfo androidClientInfo);

        public abstract Builder c();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ClientType {
        public static final ClientType d;
        public static final /* synthetic */ ClientType[] e;

        /* JADX INFO: Fake field, exist only in values array */
        ClientType EF0;

        static {
            ClientType clientType = new ClientType("UNKNOWN", 0);
            ClientType clientType2 = new ClientType("ANDROID_FIREBASE", 1);
            d = clientType2;
            e = new ClientType[]{clientType, clientType2};
        }

        public static ClientType valueOf(String str) {
            return (ClientType) Enum.valueOf(ClientType.class, str);
        }

        public static ClientType[] values() {
            return (ClientType[]) e.clone();
        }
    }

    public static Builder a() {
        return new AutoValue_ClientInfo.Builder();
    }

    public abstract AndroidClientInfo b();

    public abstract ClientType c();
}
