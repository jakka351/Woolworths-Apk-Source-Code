package androidx.media3.extractor.jpeg;

import java.util.List;

/* loaded from: classes2.dex */
final class MotionPhotoDescription {

    /* renamed from: a, reason: collision with root package name */
    public final long f3278a;
    public final List b;

    public static final class ContainerItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f3279a;
        public final long b;
        public final long c;

        public ContainerItem(String str, long j, long j2) {
            this.f3279a = str;
            this.b = j;
            this.c = j2;
        }
    }

    public MotionPhotoDescription(long j, List list) {
        this.f3278a = j;
        this.b = list;
    }
}
