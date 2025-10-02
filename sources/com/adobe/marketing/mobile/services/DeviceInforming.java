package com.adobe.marketing.mobile.services;

import java.io.File;
import java.io.InputStream;

/* loaded from: classes.dex */
public interface DeviceInforming {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class ConnectionStatus {
        public static final /* synthetic */ ConnectionStatus[] d = {new ConnectionStatus("CONNECTED", 0), new ConnectionStatus("DISCONNECTED", 1), new ConnectionStatus("UNKNOWN", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        ConnectionStatus EF5;

        public static ConnectionStatus valueOf(String str) {
            return (ConnectionStatus) Enum.valueOf(ConnectionStatus.class, str);
        }

        public static ConnectionStatus[] values() {
            return (ConnectionStatus[]) d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class DeviceType {
        public static final /* synthetic */ DeviceType[] d = {new DeviceType("PHONE", 0), new DeviceType("TABLET", 1), new DeviceType("WATCH", 2), new DeviceType("UNKNOWN", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        DeviceType EF5;

        public static DeviceType valueOf(String str) {
            return (DeviceType) Enum.valueOf(DeviceType.class, str);
        }

        public static DeviceType[] values() {
            return (DeviceType[]) d.clone();
        }
    }

    /* loaded from: classes4.dex */
    public interface DisplayInformation {
    }

    /* loaded from: classes4.dex */
    public interface NetworkConnectionActiveListener {
    }

    String a();

    InputStream b(String str);

    File c();
}
