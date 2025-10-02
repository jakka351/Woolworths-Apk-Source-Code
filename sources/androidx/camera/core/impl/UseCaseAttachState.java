package androidx.camera.core.impl;

import androidx.camera.core.Logger;
import androidx.camera.core.impl.SessionConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class UseCaseAttachState {

    /* renamed from: a, reason: collision with root package name */
    public final String f505a;
    public final LinkedHashMap b = new LinkedHashMap();

    public interface AttachStateFilter {
    }

    public static final class UseCaseAttachInfo {

        /* renamed from: a, reason: collision with root package name */
        public final SessionConfig f506a;
        public final UseCaseConfig b;
        public final StreamSpec c;
        public final List d;
        public boolean e = false;
        public boolean f = false;

        public UseCaseAttachInfo(SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
            this.f506a = sessionConfig;
            this.b = useCaseConfig;
            this.c = streamSpec;
            this.d = list;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UseCaseAttachInfo{mSessionConfig=");
            sb.append(this.f506a);
            sb.append(", mUseCaseConfig=");
            sb.append(this.b);
            sb.append(", mStreamSpec=");
            sb.append(this.c);
            sb.append(", mCaptureTypes=");
            sb.append(this.d);
            sb.append(", mAttached=");
            sb.append(this.e);
            sb.append(", mActive=");
            return b.s(sb, this.f, '}');
        }
    }

    public UseCaseAttachState(String str) {
        this.f505a = str;
    }

    public final SessionConfig.ValidatingBuilder a() {
        SessionConfig.ValidatingBuilder validatingBuilder = new SessionConfig.ValidatingBuilder();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachInfo) entry.getValue();
            if (useCaseAttachInfo.e) {
                validatingBuilder.a(useCaseAttachInfo.f506a);
                arrayList.add((String) entry.getKey());
            }
        }
        Logger.a("UseCaseAttachState", "All use case: " + arrayList + " for camera: " + this.f505a);
        return validatingBuilder;
    }

    public final Collection b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((UseCaseAttachInfo) entry.getValue()).e) {
                arrayList.add(((UseCaseAttachInfo) entry.getValue()).f506a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final Collection c() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : this.b.entrySet()) {
            if (((UseCaseAttachInfo) entry.getValue()).e) {
                arrayList.add(((UseCaseAttachInfo) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    public final boolean d(String str) {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.containsKey(str)) {
            return ((UseCaseAttachInfo) linkedHashMap.get(str)).e;
        }
        return false;
    }

    public final void e(String str, SessionConfig sessionConfig, UseCaseConfig useCaseConfig, StreamSpec streamSpec, List list) {
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.containsKey(str)) {
            UseCaseAttachInfo useCaseAttachInfo = new UseCaseAttachInfo(sessionConfig, useCaseConfig, streamSpec, list);
            UseCaseAttachInfo useCaseAttachInfo2 = (UseCaseAttachInfo) linkedHashMap.get(str);
            useCaseAttachInfo.e = useCaseAttachInfo2.e;
            useCaseAttachInfo.f = useCaseAttachInfo2.f;
            linkedHashMap.put(str, useCaseAttachInfo);
        }
    }
}
