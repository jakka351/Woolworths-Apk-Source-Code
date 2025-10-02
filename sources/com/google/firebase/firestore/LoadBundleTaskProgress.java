package com.google.firebase.firestore;

/* loaded from: classes6.dex */
public final class LoadBundleTaskProgress {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class TaskState {
        public static final /* synthetic */ TaskState[] d = {new TaskState("ERROR", 0), new TaskState("RUNNING", 1), new TaskState("SUCCESS", 2)};

        /* JADX INFO: Fake field, exist only in values array */
        TaskState EF5;

        public static TaskState valueOf(String str) {
            return (TaskState) Enum.valueOf(TaskState.class, str);
        }

        public static TaskState[] values() {
            return (TaskState[]) d.clone();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || LoadBundleTaskProgress.class != obj.getClass()) {
            return false;
        }
        throw null;
    }

    public final int hashCode() {
        throw null;
    }
}
