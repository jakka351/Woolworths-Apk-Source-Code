package androidx.profileinstaller;

/* loaded from: classes2.dex */
enum FileSectionType {
    DEX_FILES(0),
    /* JADX INFO: Fake field, exist only in values array */
    EXTRA_DESCRIPTORS(1),
    CLASSES(2),
    METHODS(3),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATION_COUNT(4);

    public final long d;

    FileSectionType(long j) {
        this.d = j;
    }
}
