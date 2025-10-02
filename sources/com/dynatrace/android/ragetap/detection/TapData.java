package com.dynatrace.android.ragetap.detection;

/* loaded from: classes.dex */
public class TapData {

    /* renamed from: a, reason: collision with root package name */
    public final TapEventData f14175a;
    public final TapEventData b;

    public TapData(TapEventData tapEventData, TapEventData tapEventData2) {
        this.f14175a = tapEventData;
        this.b = tapEventData2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            TapData tapData = (TapData) obj;
            if (this.f14175a.equals(tapData.f14175a) && this.b.equals(tapData.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f14175a.hashCode() * 31);
    }

    public final String toString() {
        return "TapData{tapDown=" + this.f14175a + ", tapUp=" + this.b + '}';
    }
}
