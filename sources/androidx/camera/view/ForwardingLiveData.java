package androidx.camera.view;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MediatorLiveData;

/* loaded from: classes2.dex */
final class ForwardingLiveData<T> extends MediatorLiveData<T> {
    public LiveData m;

    @Override // androidx.lifecycle.LiveData
    public final Object e() {
        LiveData liveData = this.m;
        if (liveData == null) {
            return null;
        }
        return liveData.e();
    }
}
