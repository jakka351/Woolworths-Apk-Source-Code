package com.google.firebase.sessions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/DataCollectionStatus;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class DataCollectionStatus {

    /* renamed from: a, reason: collision with root package name */
    public final DataCollectionState f15795a;
    public final DataCollectionState b;
    public final double c;

    public DataCollectionStatus(DataCollectionState dataCollectionState, DataCollectionState dataCollectionState2, double d) {
        this.f15795a = dataCollectionState;
        this.b = dataCollectionState2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DataCollectionStatus)) {
            return false;
        }
        DataCollectionStatus dataCollectionStatus = (DataCollectionStatus) obj;
        return this.f15795a == dataCollectionStatus.f15795a && this.b == dataCollectionStatus.b && Double.compare(this.c, dataCollectionStatus.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + ((this.b.hashCode() + (this.f15795a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionStatus(performance=");
        sb.append(this.f15795a);
        sb.append(", crashlytics=");
        sb.append(this.b);
        sb.append(", sessionSamplingRate=");
        return androidx.camera.core.impl.b.p(sb, this.c, ')');
    }
}
