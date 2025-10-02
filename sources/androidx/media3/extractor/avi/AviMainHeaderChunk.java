package androidx.media3.extractor.avi;

/* loaded from: classes2.dex */
final class AviMainHeaderChunk implements AviChunk {

    /* renamed from: a, reason: collision with root package name */
    public final int f3263a;
    public final int b;
    public final int c;

    public AviMainHeaderChunk(int i, int i2, int i3) {
        this.f3263a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // androidx.media3.extractor.avi.AviChunk
    public final int getType() {
        return 1751742049;
    }
}
