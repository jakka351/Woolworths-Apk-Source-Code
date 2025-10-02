package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {

    /* renamed from: a, reason: collision with root package name */
    public final List f3300a;

    public static final class ComponentSplice {
    }

    public static final class Event {

        /* renamed from: a, reason: collision with root package name */
        public final List f3301a;

        public Event(ArrayList arrayList) {
            this.f3301a = Collections.unmodifiableList(arrayList);
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.f3300a = Collections.unmodifiableList(arrayList);
    }
}
