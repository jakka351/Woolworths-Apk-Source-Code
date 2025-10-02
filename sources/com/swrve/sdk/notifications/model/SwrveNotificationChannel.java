package com.swrve.sdk.notifications.model;

/* loaded from: classes6.dex */
public class SwrveNotificationChannel {
    private String id;
    private ImportanceLevel importance;
    private String name;

    public enum ImportanceLevel {
        DEFAULT,
        HIGH,
        LOW,
        MAX,
        MIN,
        NONE;

        public int androidImportance() {
            int iOrdinal = ordinal();
            if (iOrdinal == 1) {
                return 4;
            }
            int i = 2;
            if (iOrdinal != 2) {
                i = 5;
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        return iOrdinal != 5 ? 3 : 0;
                    }
                    return 1;
                }
            }
            return i;
        }
    }

    public int getAndroidImportance() {
        return this.importance.androidImportance();
    }

    public String getId() {
        return this.id;
    }

    public ImportanceLevel getImportance() {
        return this.importance;
    }

    public String getName() {
        return this.name;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setImportance(ImportanceLevel importanceLevel) {
        this.importance = importanceLevel;
    }

    public void setName(String str) {
        this.name = str;
    }
}
